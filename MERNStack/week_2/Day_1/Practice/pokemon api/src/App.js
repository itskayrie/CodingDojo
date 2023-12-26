import { useState } from "react";


function App() {
  const [pokemons,setPokemons]= useState([]);
  const fetchpokemons=()=>{
    fetch("https://pokeapi.co/api/v2/pokemon")
    .then((serveResponse)=> serveResponse.json())
    .then((jsonResponse)=>setPokemons(jsonResponse.results))
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
