import React, { useState } from 'react'

const PersonCard = (props) => {
    const{person}=props
    const[age,setAge]=useState(person.age)
    const increaseAge=()=>{
        setAge(age+1);
    }
return (
    <div>
        <h1>{person.lastname}{person.firstname}</h1>
        <h3>age : {person.age}</h3>
        <h3>haircolor{person.hair}</h3>
        <button onclick={()=>increaseAge()}>birthday of{person.firstname}</button>
    </div>
);
}

export default PersonCard
