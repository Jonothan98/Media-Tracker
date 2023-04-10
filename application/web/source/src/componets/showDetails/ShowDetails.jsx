import React from "react";

function ShowDetails() {
  return (
    <form>
      <div className="form-group">
        <label htmlFor="formShowTitle">Show Title:</label>
        <input
          type="text"
          className="form-control"
          id="formShowTitle"
          placeholder="Example input"
        />
      </div>
      <div className="form-group">
        <label htmlFor="formCurrentEpisode">Current Episode:</label>
        <input
          type="text"
          className="form-control"
          id="formCurrentEpisode"
          placeholder="Another input"
        />
      </div>
      <div className="form-group">
        <label htmlFor="formTotalEpisode">Total Episode:</label>
        <input
          type="text"
          className="form-control"
          id="formTotalEpisode"
          placeholder="Another input"
        />
      </div>
      <div className="form-group">
        <label htmlFor="formStatus">Status:</label>
        <input
          type="text"
          className="form-control"
          id="formStatus"
          placeholder="Another input"
        />
      </div>
      <div className="form-group">
        <label htmlFor="formThumbnail">Thumbnail:</label>
        <input
          type="text"
          className="form-control"
          id="formThumbnail"
          placeholder="Another input"
        />
      </div>
      <input type="submit"/>
    </form>
  );
}

export default ShowDetails;
