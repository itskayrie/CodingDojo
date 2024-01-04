import React, { useEffect, useState } from 'react';
import axios from 'axios';
import {useParams } from 'react-router-dom';


const Oneproduct = () => {
  const {id}=useParams();
  const [product,setProduct]=useState({});
  useEffect(()=>{
    axios.get("http://localhost:8000/api/products/" + id)
    .then((oneproduct)=>{
      console.log(oneproduct);
      setProduct(oneproduct.data);
    })
    .catch((err)=>console.log(err))
  },[id])
  return (
    <div>
      
      <h2>{product.title}</h2>
      <h4>{product.price}</h4>
      <p>{product.description}</p>

    </div>
  )
}

export default Oneproduct;
