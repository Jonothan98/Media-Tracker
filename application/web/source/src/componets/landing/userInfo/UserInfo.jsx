import React, { useEffect, useState } from "react";
import getShowsCompleted from "../getShowsCompleted";
import getUserById from "./../getUserById";
import "./userInfo.css";

function UserInfo(userId) {
  const [user, setUserInfo] = useState({});

  useEffect(() => {
    const newUserId = userId.userId;
    setUserInfo(getUserById(newUserId));
    console.log(user);
  }, [userId,user]);

  return (
    <div className="info-body">
      <div className="info-container">
        <img
          id="image-url"
          src={user.image_url}
          alt="User Profile"
          title="UserImage"
        />
        <h1 id="user-name">{`Welcome, ${user.name}`}</h1>
        <p id="total-shows-completed">
          {`Shows Completed: ${getShowsCompleted(user.showList)}`}
        </p>
      </div>
    </div>
  );
}

export default UserInfo;
