import React from "react";
import UserInfo from "./userInfo/UserInfo";
import "./landing.css";

function Landing() {
  return (
    <div>
      <h2 id="landing-title">Welcome to Media Tracker</h2>
      <UserInfo />
    </div>
  );
}

export default Landing;
