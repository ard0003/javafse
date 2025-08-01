import { useContext } from 'react';
import ThemeContext from '../ThemeContext';

function EmployeeCard({ name }) {
  const theme = useContext(ThemeContext);

  const buttonClass = theme === 'light' ? 'btn-light' : 'btn-dark';

  return (
    <div className="card">
      <h3>{name}</h3>
      <button className={buttonClass}>View Profile</button>
    </div>
  );
}

export default EmployeeCard;
