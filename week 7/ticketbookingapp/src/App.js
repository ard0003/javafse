import React, { useState } from 'react';

// Guest View Component
function GuestGreeting() {
  return (
    <div>
      <h2>Welcome Guest</h2>
      <p>You can view flights, but you need to log in to book tickets.</p>
    </div>
  );
}

// Logged-in View Component
function UserGreeting() {
  return (
    <div>
      <h2>Welcome back</h2>
      <p>You can now book your flight tickets.</p>
    </div>
  );
}

// Conditional Greeting Component
function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

// Login Button
function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

// Logout Button
function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let button;

  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div className="App" style={{ padding: '20px' }}>
      <h1>Ticket Booking Portal</h1>
      <Greeting isLoggedIn={isLoggedIn} />
      {button}
    </div>
  );
}

export default App;
