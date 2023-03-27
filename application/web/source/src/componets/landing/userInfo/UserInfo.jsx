import React, { useEffect, useState } from "react";
import getShowsCompleted from "../getShowsCompleted";
import getUserById from "../getUserById";
import getParams from "../../../getParams";
import "./userInfo.css";

function UserInfo() {
  const [user, setUser] = useState({});

  useEffect(() => {
    setUser(getUserById(getParams("user_id")));
  }, []);
  return (
    <div className="container border rounded">
      <div>
        <img
          id="image-url"
          className="img-circle row"
          src={user.image_url}
          alt="User Profile"
          title="UserImage"
        />
        <h1 id="user-name" className="row align-text-center">{`Welcome, ${user.name}`}</h1>
        <p id="total-shows-completed" className="row align-text-center">
          {`Shows Completed: ${getShowsCompleted(user.showList)}`}
        </p>
      </div>
    </div>
  );
}

export default UserInfo;
