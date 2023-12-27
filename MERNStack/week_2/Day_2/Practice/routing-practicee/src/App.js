import { useParams } from "react-router";
import './App.css';
import React from 'react';
import { Routes,Route,Link } from 'react-router-dom';

import Home from './components/Home';
import Number from './components/Number';
import Error from './components/Error';
import Colorhello from './components/Colorhello'



function App() {
  const { number } = useParams();
  return (
    <div className="App">
      <Routes>
        <Route path="/home" element={<Home/>}/>
        <Route path="/:text" element={<Number />}/>
        <Route path="*" element={<Error/>}/>
        <Route path="/:text/:textcolor/:textbg" element={<Number />}/>
      </Routes>
    </div>
  );
}

export default App;
