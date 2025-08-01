const ListofIndianPlayers = ({ IndianPlayers }) => {
  return (
    <ul>
      {IndianPlayers.map((player, idx) => (
        <li key={idx}>{player}</li>
      ))}
    </ul>
  );
};

export default ListofIndianPlayers;
