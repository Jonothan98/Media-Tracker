import React from "react";
import ListOptions from "./ListOptions";
import FilteredList from "../filteredList/FilteredList"

function List() {
  return (
    <div>
      <h1 id="show-list">Show List</h1>
      <ListOptions/>
      <FilteredList status="on going"/>
      <FilteredList status="completed"/>
      <FilteredList status="plan to watch"/>
      <FilteredList status="on hold"/>
    </div>
  );
}

export default List;
