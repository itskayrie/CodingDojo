import React from 'react'
import { useParams } from "react-router";

const Number = (props) => {
    const {text, textcolor, textbg} = useParams();
    const  style={backgroundColor:textbg , color:textcolor}

return (
    <div>
        {isNaN(text)? <h1 style={style}>the word is: { text }</h1>:<h1>this number is :{text}</h1>}
    
    </div>
)
}

export default Number;
