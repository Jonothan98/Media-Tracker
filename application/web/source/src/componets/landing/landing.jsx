import React from "react";
import UserInfo from "./userInfo/UserInfo";
import "./landing.css";
import OnGoingList from "./onGoingList/OnGoingList";

function Landing() {
  return (
    <div className="container">
      <div className="row align-items-center">
        <div className="col">
          <h2 id="landing-title">Welcome to Media Tracker</h2>
          <UserInfo />
        </div>
        <div className="col">
          <h1>Shows in Progress</h1>
          <OnGoingList />
        </div>
      </div>
    </div>
  );
}

export default Landing;
