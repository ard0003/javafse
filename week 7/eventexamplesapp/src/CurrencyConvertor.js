import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euro: ''
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 0.011; // 1 INR ≈ 0.011 Euro (example rate)
    const euro = this.state.rupees * conversionRate;
    this.setState({ euro: euro.toFixed(2) });
  };

  render() {
    return (
      <div>
        <h2>Currency Convertor (INR → Euro)</h2>
        <form onSubmit={this.handleSubmit}>
          <input
            type="number"
            placeholder="Enter amount in INR"
            value={this.state.rupees}
            onChange={this.handleChange}
          />
          <button type="submit">Convert</button>
        </form>
        {this.state.euro && (
          <p>Equivalent in Euro: €{this.state.euro}</p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
