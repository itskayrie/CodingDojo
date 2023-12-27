import React from 'react'
import { useParams } from 'react-router-dom'


const Colorhello = () => {
    const {text,textcolor,textbg}=useParams();
    const  style={backgroundColor:textbg , color:textcolor}


return (
    <div>
        <h1>the world is :{}</h1>
    </div>
)
}

export default Colorhello
