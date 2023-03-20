import React from "react";
import UserInfo from "./userInfo/UserInfo";
import getParams from "../../getParams";
import "./landing.css";

function Landing() {
  return (
    <div>
      <h2 id="landing-title">Welcome to Media Tracker</h2>
      <UserInfo userId={getParams('user_id')} />
    </div>
  );
}

export default Landing;
