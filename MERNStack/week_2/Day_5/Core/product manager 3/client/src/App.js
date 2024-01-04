import './App.css';
import {Routes,Route} from 'react-router-dom';
import LandingPage from './components/LandingPage';
import Create from './components/Create';
import Oneproduct from './components/Oneproduct';
import Update from './components/Update';

function App() {
  return (
    <div className="App">
      <h1>Products home </h1>
      <Routes>
        <Route path="/" element={<LandingPage/>}/>
        <Route path="/products/create" element={<Create/>}/>
        <Route path="/products/:id" element={<Oneproduct/>}/>
        <Route path="/products/:id/update" element={<Update/>}/>

      </Routes>

    </div>
  );
}

export default App;
