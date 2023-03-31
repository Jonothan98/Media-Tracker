import React, { useState } from "react";
import FilteredList from "../filteredList/FilteredList";
import "./list.css";

function List() {
  const [statusToDisplay, setStatusToDisplay] = useState(["On Going", "Completed", "Plan to Watch", "On Hold", "Dropped"]);
  const optionsList = ["On Going", "Completed", "Plan to Watch", "On Hold", "Dropped"];
  const isToggled = (event) => {
    let newList = [...statusToDisplay];
    if(event.target.checked){
      newList[optionsList.indexOf(event.target.value)] = event.target.value;
    } else {
      newList[statusToDisplay.indexOf(event.target.value)] = "";
    }
    setStatusToDisplay(newList);
  }

  return (
    <div className="container row">
      <div className="col">
        <h1 id="show-list">Show List</h1>
        <div>
          <div id="status-options"> 
          {optionsList.map((option,index) => (
            <div key={index}>
              <input value={option} type="checkbox" defaultChecked onChange={isToggled}/>
              <span>{option}</span>
            </div>
          )) }
          </div>
           
        </div>
      </div>
      <div className="col">
        {statusToDisplay.map((option,index) => (
          <FilteredList key={index} status={option}/>
        ))}
      </div>
    </div>
  );
}

export default List;
