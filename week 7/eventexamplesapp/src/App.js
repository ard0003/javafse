import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  sayHello = () => {
    console.log("Hello! Button was clicked.");
    alert("Hello from sayHello!");
  };

  incrementAndGreet = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayWelcome = (message) => {
    alert(`Message: ${message}`);
  };

  handleSyntheticEvent = (e) => {
    e.preventDefault();
    alert("I was clicked (Synthetic Event)");
  };

  render() {
    return (
      <div className="App" style={{ padding: '20px' }}>
        <h1>React Event Handling Example</h1>

        <h2>Counter: {this.state.counter}</h2>
        <button onClick={this.incrementAndGreet}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome")}>Say Welcome</button>

        <br /><br />

        <button onClick={this.handleSyntheticEvent}>Synthetic Event (OnPress)</button>

        <br /><br />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
