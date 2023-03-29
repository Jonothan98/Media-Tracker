import React from "react";

function ListOptions() {
  return (
    <form id="status-options">
      <input type="radio" id="on-going" value="On Going" />
      <label htmlFor="on-going" name="options">
        On Going
      </label>
      <br />
      <input type="radio" id="completed" value="Completed" />
      <label htmlFor="completed" name="options">
        Completed{" "}
      </label>
      <br />
      <input type="radio" id="plan-to-watch" value="Plan to Watch" />
      <label htmlFor="plan-to-watch" name="options">
        Plan to Watch
      </label>
      <br />
      <input type="radio" id="on-hold" value="On Hold" />
      <label htmlFor="on-hold" name="options">
        On Hold
      </label>
      <br />
    </form>
  );
}

export default ListOptions;
