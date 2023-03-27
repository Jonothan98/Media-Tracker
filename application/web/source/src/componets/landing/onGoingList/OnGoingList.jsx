import React, { useEffect, useState } from "react";
import getParams from "../../../getParams";
import ShowTile from "../../showTile/ShowTile";
import getUserById from "../getUserById";
import "./onGoingList.css"

function OnGoingList() {
  const [showList, setShowList] = useState([]);
  const user = getUserById(getParams("user_id"));
  useEffect(() => {
    setShowList(user.showList);
  }, [user.showList]);
  return (
    <div id="on-going-list" className="on-going-list-container">
      {showList.map((show) => {
        return (
          <div key={show.id}>
            <ShowTile show={show} />
          </div>
        );
      })}
    </div>
  );
}

export default OnGoingList;
