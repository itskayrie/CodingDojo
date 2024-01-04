import React, { useEffect, useState } from 'react'
import axios from 'axios'


const LandingPage = () => {
    //products state
    const [products,setProducts]=useState([]);
    useEffect(() => {
        axios
          .get("http://localhost:8000/api/products")
          .then((allproducts) => setProducts(allproducts.data))
          .catch((err) => console.log(err));
      }, []);
    
    return <div>
      LandingPage
    </div>;
  
};

export default LandingPage;
