import React, { useEffect } from 'react'
import { useParams,useNavigate } from 'react-router-dom'
import { useState } from 'react';
import axios from 'axios';

const Update = () => {
  // inputs state
  const {id}=useParams();
  //usenavigate
  const navigate=useNavigate();
  const [Title,setTitle]=useState("");
  const [Price,setPrice]=useState(0);
  const [Description,setDescription]=useState("");

  //grab the selected movie from db 
  useEffect(() => {
    axios
      .get(`http://localhost:8000/api/movies/${id}`)
      .then((res) => {
        setTitle(res.data.title);
        setPrice(res.data.Price);
        setDescription(res.data.Description);
        
      })
      .catch((err) => console.log(err));
  }, [id]);
// save the updated product to the db 
  const submitHandler=(e)=>{
    e.preventDefault();
    const updatedproduct={
        Title,
        Price,
        Description
    };
    axios.patch("http://localhost:8000/api/products"+ id, updatedproduct)
    .then((res)=>console.log(res))
    .catch((error)=>console.log(
        "Failed Creation", error
    ));
    setTitle("");
    setPrice(0);
    setDescription("");
};

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
            <button>update</button>
        </form>
    
    </div>
    </div>
  )
}

export default Update
