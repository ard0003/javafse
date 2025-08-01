import React from 'react';
import ListofPlayers from './ListofPlayers';
import Scorebelow70 from './Scorebelow70';
import OddPlayers from './OddPlayers';
import EvenPlayers from './EvenPlayers';
import ListofIndianPlayers from './ListofIndianPlayers';

const App = () => {
  const flag = true;

  const players = [
    { name: 'Player 1', score: 95 },
    { name: 'Player 2', score: 65 },
    { name: 'Player 3', score: 88 },
    { name: 'Player 4', score: 45 },
    { name: 'Player 5', score: 76 },
    { name: 'Player 6', score: 55 },
    { name: 'Player 7', score: 34 },
    { name: 'Player 8', score: 79 },
    { name: 'Player 9', score: 61 },
    { name: 'Player 10', score: 98 },
    { name: 'Player 11', score: 70 }
  ];

  const T20players = ['Rohit', 'Kohli', 'Gill'];
  const RanjiPlayers = ['Pujara', 'Rahane', 'Jadeja'];
  const IndianTeam = [...T20players, ...RanjiPlayers];

  return (
    <div>
      {flag ? (
        <div>
          <h1>List of Players</h1>
          <ListofPlayers players={players} />
          <hr />
          <h1>List of Players having Scores Less than 70</h1>
          <Scorebelow70 players={players} />
        </div>
      ) : (
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <OddPlayers team={IndianTeam} />
          <hr />
          <h1>Even Players</h1>
          <EvenPlayers team={IndianTeam} />
          <hr />
          <h1>List of Indian Players Merged:</h1>
          <ListofIndianPlayers IndianPlayers={IndianTeam} />
        </div>
      )}
    </div>
  );
};

export default App;
