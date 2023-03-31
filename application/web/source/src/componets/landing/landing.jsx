import React from "react";
import UserInfo from "./userInfo/UserInfo";
import "./landing.css";
import FilteredList from "../filteredList/FilteredList";

function Landing() {
  return (
    <div className="container">
      <div className="row align-items-center">
        <div className="col">
          <h2 id="landing-title">Welcome to Media Tracker</h2>
          <UserInfo />
        </div>
        <div className="col">
          <h1>Shows List</h1>
          <FilteredList status="On Going" />
        </div>
      </div>
    </div>
  );
}

export default Landing;
