import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Landing from "./componets/landing/Landing";
import ListView from "./componets/listView/List";
import Navbar from "./componets/navbar/Navbar";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<Landing />} />
          <Route path="show-list" element={<ListView />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
