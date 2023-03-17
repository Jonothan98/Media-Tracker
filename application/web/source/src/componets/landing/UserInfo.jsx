import React from "react";
import user from "./../../data/user.json";
import getShowsCompleted from "./getShowsCompleted";

function UserInfo() {
  return (
    <div>
      <img id="image-url" src={user[0].image_url} alt="User Profile" title="UserImage"/>
      <h1 id="user-name">{`Welcome, ${user[0].name}`}</h1>
      <p id="total-shows-completed">
        {`Shows Completed: ${getShowsCompleted(user[0].showList)}`}
      </p>
    </div>
  );
}

export default UserInfo;
