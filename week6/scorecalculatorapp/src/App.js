import logo from './logo.svg';
import './App.css';

import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <h1>Student Management Portal</h1>
      <CalculateScore 
        name="Arnab Dey" 
        school="UEM Kolkata" 
        total={450} 
        goal={5} 
      />
    </div>
  );
}

export default App;

