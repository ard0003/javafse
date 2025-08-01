const OddPlayers = ({ team }) => {
  const odd = team.filter((_, idx) => idx % 2 !== 0);
  return <ul>{odd.map((p, i) => <li key={i}>{p}</li>)}</ul>;
};

export default OddPlayers;
