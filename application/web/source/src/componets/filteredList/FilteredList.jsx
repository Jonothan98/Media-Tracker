import React, { useEffect, useState } from "react";
import getParams from "../../getParams";
import ShowTile from "../showTile/ShowTile";
import getUserById from "../landing/getUserById";
import "./filteredList.css"

function FilteredList({status}) {
  const [showList, setShowList] = useState([]);
  const user = getUserById(getParams("user_id"));
  useEffect(() => {
    const filteredList = user.showList.filter((show) =>show.status === status);
    console.log(status);
    setShowList(filteredList);
  }, [user.showList,status]);
  return (
    <div id="filtered-List" className="filtered-list-container">
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

export default FilteredList;
