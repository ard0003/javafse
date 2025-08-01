const EvenPlayers = ({ team }) => {
  const even = team.filter((_, idx) => idx % 2 === 0);
  return <ul>{even.map((p, i) => <li key={i}>{p}</li>)}</ul>;
};

export default EvenPlayers;
