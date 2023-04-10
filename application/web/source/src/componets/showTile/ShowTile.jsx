import React, { useEffect, useState } from "react";
import "./showTile.css";
import { NavLink } from "react-router-dom";

function ShowTile(info) {
  const [showData, setShow] = useState([]);
  const user = info.info.user;
  const showId = info.info.showId;
  const shows = user.showList;
  const show = shows.filter((show) => show.id === showId);
  useEffect(() => {
    setShow(show[0]);
  }, [show]);
  return (
    <div className="container">
      <button className="image-button">
        <NavLink to={`/show-details?${showData.id}`}>
          <img
            className="tile-image"
            src={showData.image_url}
            alt="Show Poster"
          />
        </NavLink>
      </button>
      <h1 className="tile-name">{showData.name}</h1>
      <p className="tile-episodes">{`Episodes: ${showData.current_episode}/${showData.total_episodes}`}</p>
    </div>
  );
}

export default ShowTile;
