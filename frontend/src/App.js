import React, {useState, useEffect} from "react";
import logo from './logo.svg';
import './App.css';
import axios from "axios";

const Platos = () => {

  const [platos, setPlatos] = useState([]);

  const fetchPlatos = () => {
    axios.get("http://localhost:8080/api/v1/plato").then(res => {
      console.log(res);
      setPlatos(res.data);
    })
  }

  useEffect(() => {
    fetchPlatos();
  }, []);

  return platos.map((platos, index) => {
    return (
      <div key={index}>
        <h1>
          {platos.engName}
        </h1>
        <p>
          {platos.temperatura}
        </p>
      </div>
    )

  })
};

function App() {
  return (
    <div className="App">
      <Platos/>
    </div>
  );
}

export default App;
