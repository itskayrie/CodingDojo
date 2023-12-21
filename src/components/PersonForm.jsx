import { useState } from "react";

const PersonForm = (props) => {
    const [firstname,setFirstname] = useState("");
    const [lastname,setLastname] = useState("");
    const [email,setEmail] = useState("");
    const [password,setPassword] = useState("");
    const [confirmPassword,setConfirmpassword] = useState("");
return (
    <fieldset>
        <div>
            <form >
                <div>
                    <label>firstname: </label> 
                    <input onChange={(e)=>setFirstname(e.target.value)} />
                </div>
                <div>
                    <label>last name: </label> 
                    <input onChange={(e)=>setLastname(e.target.value)}/>
                </div>
                <div>
                    <label>email: </label>
                    <input onChange={(e)=>setEmail(e.target.value)}/>
                </div>
                <div>
                    <label>Password: </label>
                    <input onChange={(e)=>setPassword(e.target.value)} />
                </div>
                <div>
                    <label>confirm Password: </label>
                    <input onChange={(e)=>setConfirmpassword(e.target.value)} />
                </div>
                <input type="submit" value="Create User" />
            </form>
        </div>
        firstname : {firstname}|
        lastname : {lastname}|
        email:{email}|
        password:{password}|
        confirmPassword:{confirmPassword}|
    </fieldset>
);
};

export default PersonForm
