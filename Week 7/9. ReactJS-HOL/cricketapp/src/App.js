
import React from "react";
import ListofPlayers from "./Components/ListofPlayers";
import IndianPlayers from "./Components/IndianPlayers";

function App() {
  const flag = false;

  return (
    
      
      <div className="App">

        <hr/>   
        {flag ? <ListofPlayers /> : <IndianPlayers />}

        <hr />
      </div>
  
  );
}

export default App;
