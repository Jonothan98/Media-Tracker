import React, { useEffect, useState } from "react";
import getParams from "../../getParams";
import ShowTile from "../showTile/ShowTile";
import getUserById from "../landing/getUserById";
import "./filteredList.css";

function FilteredList({ status }) {
  const [showList, setShowList] = useState([]);
  const [user, setUser] = useState([]);
  const response = getUserById(getParams("user_id"));
  useEffect(() => {
    setUser(response);
    const filteredList = response.showList.filter(
      (show) => show.status === status.toLowerCase()
    );
    setShowList(filteredList);
  }, [user.showList, status, response]);
  return (
    <div>
      <h3>{showList.length > 0 ? status : ""}</h3>
      <div id="filtered-List" className="filtered-list-container">
        {showList.map((show) => {
          const info = { user: user, showId: show.id };
          return (
            <div key={show.id}>
              <ShowTile info={info} />
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default FilteredList;
