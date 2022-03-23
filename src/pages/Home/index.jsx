import React, { useState } from "react";
import Abacaxi from "../../Components/a/Abacaxi";
// Components
import Navbar from "../../Components/Navbar";

const Home = () => {
  const [x, setX] = useState(true);
  return (
    <>
      <header>
        <button onClick={() => setX(!x)}></button>
        {x ? <Navbar /> : <Abacaxi />}
      </header>

      <main></main>

      <footer></footer>
    </>
  );
};

export default Home;
