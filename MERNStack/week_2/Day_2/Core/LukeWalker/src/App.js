import './App.css';
import { Routes,Route,Link,Navigate } from 'react-router-dom';
import  Form  from './components/Form';
import Display from './components/Display';
import Error from './components/Error'
import { useNavigate } from "react-router-dom";

function App() {
  return (
    <div className="App">
        <Form/>
      <Routes>
        <Route path="/" />
        <Route path="/:category/:id" element={<Display/>}/>
        <Route path="/*" element={<Error/>}/>
      </Routes>
    </div>
  );
}

export default App;
