import { useState } from "react";
import axios from 'axios';


function App() {
  const [pokemons,setPokemons]= useState([]);
  const fetchpokemons=()=>{
    axios.get("https://pokeapi.co/api/v2/pokemon")
    .then((serveResponse)=> setPokemons(serveResponse.data.results) )
    .catch((error)=>console.log("sthg went wrong",error));
  };
  return (
    <div className="App">

      <button onClick={fetchpokemons}>fetch Pokemons</button>
      <table>
        <thead>
          <th>name</th>
      
        </thead>
          <tbody>
          {pokemons.map((onepok,idx)=>{
            return( 
            <tr key={idx}>
              <td>{onepok.name}</td>
            

            </tr>
            );
          })}
            </tbody>
      </table>

    </div>
  );
}

export default App;
