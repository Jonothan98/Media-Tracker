import React from "react";
import { NavLink } from "react-router-dom";
import "./navbar.css"

function Navbar() {
  return (
    <div className="navbar-container">
      <div className="title">Media Tracker</div>
      <div className="link-container">
        <NavLink className="link-text" to="/">Home</NavLink>
        <NavLink className="link-text" to="show-list">List</NavLink>
      </div>
    </div>
  );
}

export default Navbar;
