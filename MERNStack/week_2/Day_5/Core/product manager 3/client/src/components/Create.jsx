import React, { useState } from 'react'
import axios from 'axios';
import { Link, useNavigate } from 'react-router-dom';
import { useEffect } from 'react';

const Create = () => {
    const [Title,setTitle]=useState("");
    const [Price,setPrice]=useState(0);
    const [Description,setDescription]=useState("");
    const navigate=useNavigate();
    // product state
  const [products, setProducts] = useState([]);

    const submitHandler=(e)=>{
        e.preventDefault();
        const createdproduct={
            Title,
            Price,
            Description,
        };
        axios.post("http://localhost:8000/api/products", createdproduct)
        .then((res)=>console.log(res))
        .catch((error)=>console.log(
            "Failed Creation", error
        ));
        setTitle("");
        setPrice(0);
        setDescription("");
    };

     // get all product from db
  useEffect(() => {
    axios
      .get("http://localhost:8000/api/products")
      .then((products) => setProducts(products.data))
      .catch((err) => console.log(err));
  }, []);

  //Delete the clicked movie 
  const onDeleteProduct = (id) => {
    axios.delete(`http://localhost:8000/api/products/${id}`)
    .then(res => {
        console.log(res);
        // Filter out the deleted product and update the state
        const updatedProducts = products.filter(product => product._id !== id);
        setProducts(updatedProducts);
    })
    .catch((err) => console.log(err));
}

    return (
        <div>
    <div>
        <form onSubmit={submitHandler}>
            <div>
                <label>Title</label>
                <input onChange={(e)=>{setTitle(e.target.value)}}value={Title}/>
            </div>
            <div>
                <label>Price</label>
                <input onChange={(e)=>{setPrice(e.target.value)}}value={Price}/>
            </div>
            <div>
                <label>Description</label>
                <textarea onChange={(e)=>{setDescription(e.target.value)}}value={Description}/>
            </div>
            <button>Create</button>
        </form>
    
    </div>
    <div>
        <h1>All  Products </h1>
        <div>
            {products.map((oneproduct) => {
                return (
                    <div key={oneproduct._id}>
                        <Link to={`/products/${oneproduct._id}`}>
                        <h2>{oneproduct.title}</h2>
                        </Link>
                        <Link to={`/products/${oneproduct._id}/update`}>update</Link>
                        <button onClick={()=>{onDeleteProduct(oneproduct._id)}}>delete</button>
                    </div>
                )
            })}
        </div>
    </div>
    </div>
    
  )
}

export default Create
