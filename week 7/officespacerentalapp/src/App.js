import React from 'react';
import './App.css';

// Sample image URL (replace with a real one or use public folder)
const officeImg = "https://via.placeholder.com/300x150.png?text=Office+Space";

// Sample object
const office = {
  name: "Elite Workspace",
  rent: 55000,
  address: "Banjara Hills, Hyderabad"
};

// List of office spaces
const officeList = [
  { name: "Elite Workspace", rent: 55000, address: "Hyderabad" },
  { name: "Startup Hub", rent: 65000, address: "Bangalore" },
  { name: "SkyView Tower", rent: 48000, address: "Pune" },
  { name: "Tech Park", rent: 72000, address: "Chennai" }
];

// CSS function
const rentStyle = (rent) => {
  return {
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  };
};

function App() {
  return (
    <div className="App">
      {/* JSX heading */}
      <h1>Office Space Rental Listings</h1>

      {/* Image using JSX */}
      <img src={officeImg} alt="Office Space" style={{ width: '300px', borderRadius: '10px' }} />

      {/* Single Office Display */}
      <div>
        <h2>{office.name}</h2>
        <p style={rentStyle(office.rent)}>Rent: ₹{office.rent}</p>
        <p>Address: {office.address}</p>
      </div>

      <hr />

      {/* Looping through list using JSX */}
      <h2>All Office Spaces:</h2>
      {officeList.map((o, index) => (
        <div key={index} style={{ border: '1px solid #ccc', margin: '10px', padding: '10px' }}>
          <h3>{o.name}</h3>
          <p style={rentStyle(o.rent)}>Rent: ₹{o.rent}</p>
          <p>Address: {o.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
