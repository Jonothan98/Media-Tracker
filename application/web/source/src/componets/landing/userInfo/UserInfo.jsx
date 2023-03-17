import React from "react";
import user from "../../../data/user.json";
import getShowsCompleted from "../getShowsCompleted";
import "./userInfo.css";

function UserInfo() {
  return (
    <div className="info-body">
      <div className="info-container">
        <img
          id="image-url"
          src={user[0].image_url}
          alt="User Profile"
          title="UserImage"
        />
        <h1 id="user-name">{`Welcome, ${user[0].name}`}</h1>
        <p id="total-shows-completed">
          {`Shows Completed: ${getShowsCompleted(user[0].showList)}`}
        </p>
      </div>
    </div>
  );
}

export default UserInfo;
