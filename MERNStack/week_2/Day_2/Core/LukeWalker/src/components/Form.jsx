import { useState } from "react";
import { useNavigate } from "react-router-dom";

const Form =()=>{
    const navigate= useNavigate();
    const[id,setId]=useState(0);
    const [category,SetCategory]=useState("")
    const search =(e)=>{
        e.preventDefault();
        console.log(id);
        console.log(category);
        navigate(`/${category}/${id}`)
    }
    return(
        <div >
        <form  onSubmit={(e)=>search(e)}>
            <div >
                <label htmlFor="category" >Search for:</label>
                <select className="form-select" id="category" onChange={(e)=>{SetCategory(e.target.value)}}>
                    <option value="people" selected>people</option>
                    <option value="planets">planets</option>
                    <option value="starships">starships</option>
                </select>
            </div>
            <div >
                <label htmlFor="id" >ID:</label>
                <input type="number"  id='id' 
                onChange={(e)=>{setId(e.target.value)}} value={id} />
            </div>
            <div >
                <button >Search</button>
            </div>
        </form>
    </div>
    )
}
export default Form;