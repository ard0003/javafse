// import logo from './logo.svg';
// import './App.css';

import React from "react";
import CohortDetails from "./Components/CohortDetails";

function App() {
  // ✅ Dummy cohort data
  const cohorts = [
    {
      name: "INTADMDF10 - .NET FSD",
      startedOn: "22-Feb-2022",
      status: "Scheduled",
      coach: "Aathma",
      trainer: "Jojo Jose",
    },
    {
      name: "ADM21JF014 - Java FSD",
      startedOn: "10-Sep-2021",
      status: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith",
    },
    {
      name: "CDBJF21025 - Java FSD",
      startedOn: "24-Dec-2021",
      status: "Ongoing",
      coach: "Aathma",
      trainer: "John Doe",
    },
  ];

  return (
    <div style={{ padding: "20px", background: "#eaeaea" }}>
      <h2>Cohorts Details</h2>

      {/* Loop through each cohort */}
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} {...cohort} />
      ))}
    </div>
  );
}

export default App;
