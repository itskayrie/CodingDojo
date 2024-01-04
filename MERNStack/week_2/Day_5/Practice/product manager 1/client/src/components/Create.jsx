import React, { useState } from 'react'
import axios from 'axios'

const Create = () => {
    const [Title,setTitle]=useState("");
    const [Price,setPrice]=useState(0);
    const [Description,setDescription]=useState("");
    const submitHandler=(e)=>{
        e.preventDefault();
        const createdproduct={
            Title,
            Price,
            Description,
        };
        axios.post("http://localhost:8000/api/products", createdproduct)
        .then((res)=>console.log(res))
        .catch((err)=>console.log(err));
    };
  return (
    <div>
        <form onSubmit={submitHandler}>
            <div>
                <label>Title</label>
                <input onChange={(e)=>{setTitle(e.target.value)}}/>
            </div>
            <div>
                <label>Price</label>
                <input onChange={(e)=>{setPrice(e.target.value)}}/>
            </div>
            <div>
                <label>Description</label>
                <textarea onChange={(e)=>{setDescription(e.target.value)}}/>
            </div>
            <button>Create</button>
        </form>
    
    </div>
  )
}

export default Create
