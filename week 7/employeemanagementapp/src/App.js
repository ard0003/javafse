import { useState } from 'react';
import ThemeContext from './ThemeContext';
import EmployeeList from './components/EmployeeList';

function App() {
  const [theme, setTheme] = useState('light');

  return (
    <ThemeContext.Provider value={theme}>
      <div>
        <h1>Employee Management App</h1>
        <button onClick={() => setTheme('light')}>Light Theme</button>
        <button onClick={() => setTheme('dark')}>Dark Theme</button>

        {/* No props passed down */}
        <EmployeeList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
