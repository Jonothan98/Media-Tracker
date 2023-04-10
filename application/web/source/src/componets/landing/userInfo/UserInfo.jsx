import React, { useEffect, useState } from "react";
import getShowsCompleted from "../getShowsCompleted";
import getUserById from "../getUserById";
import getParams from "../../../getParams";
import "./userInfo.css";
import getShowsInProgress from "../getShowsInProgress";

function UserInfo() {
  const [user, setUser] = useState({});

  useEffect(() => {
    setUser(getUserById(getParams("user_id")));
  }, []);
  return (
    <div className="card" style={{ width: '18rem' }}>
      <img className="card-img-top" src={user.image_url} alt="Card cap" />
      <div className="card-body">
        <h5 className="card-title">{`Welcome, ${user.name}`}</h5>
      </div>
      <ul className="list-group list-group-flush">
        <li className="list-group-item">{`Total shows in progress: ${getShowsInProgress(user.showList)}`}</li>
        <li className="list-group-item">{`Total shows completed: ${getShowsCompleted(user.showList)}`}</li>
      </ul>
    </div>
  );
}

export default UserInfo;
