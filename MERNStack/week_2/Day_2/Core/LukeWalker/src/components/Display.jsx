import React,{useState,useEffect} from 'react'
import { useParams,useNavigate } from 'react-router-dom'
import axios from 'axios';


const Display = (props) => {
    const {category,id}=useParams();
    const [selected,setSeletcted]=useState();
    const navigate=useNavigate();
    const getData= async()=>{
        try{
            const result = await axios.get(`https://swapi.dev/api/${category}/${id}/`)
            console.log(result.data)
            setSeletcted(result.data)
        }catch(error){
            navigate('/error')
        }
    }
    useEffect(()=>{getData()},[id,category])
      return (
    <div>
       {(selected)&& <div>
        <h1>{selected.name}</h1>
        {(category==="people")&&<div><h5>Height:{selected.height}</h5><h5>mass:{selected.mass}</h5><h5>Hair Color:{selected.hair_color}</h5></div>}
        {(category==="starships")&&<div><h5>Model:{selected.model}</h5><h5>manufacturer:{selected.manufacturer}</h5><h5>crew:{selected.crew}</h5></div>}
        {(category==="planets")&&<div><h5>climate:{selected.climate}</h5><h5>population:{selected.population}</h5><h5>gravity:{selected.gravity}</h5></div>} </div>}

    </div>
  )
}

export default Display
