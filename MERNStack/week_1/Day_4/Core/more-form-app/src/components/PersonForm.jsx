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
                    {firstname.length<2?<p >firstname must be at least 2</p>:<p > firstname Valid!</p>}
                </div>
                <div>
                    <label>last name: </label> 
                    <input onChange={(e)=>setLastname(e.target.value)}/>
                    {lastname.length<2?<p >lastname must be at least 2</p>:<p > lastname Valid!</p>}
                </div>
                <div>
                    <label>email: </label>
                    <input onChange={(e)=>setEmail(e.target.value)}/>
                    {email.length<2?<p >email must be at least 2</p>:<p > email Valid!</p>}
                </div>
                <div>
                    <label>Password: </label>
                    <input onChange={(e)=>setPassword(e.target.value)} />
                    {password.length<8?<p >password must be at least 8</p>:<p > password Valid!</p>}
                </div>
                <div>
                    <label>confirm Password: </label>
                    <input onChange={(e)=>setConfirmpassword(e.target.value)} />
                    {confirmPassword!=password?<p >confirmPassword  must match</p>:<p > confirmPassword Valid!</p>}
                </div>
                <input type="submit"  />
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
