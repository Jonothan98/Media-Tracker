import React, { useEffect, useState } from "react";
import "./showTile.css";

function ShowTile({show}) {
  const [showData, setShow] = useState({});
  useEffect(() => {
    setShow(show);
  }, [show]);
  return <div className="container">
    <img className="tile-image" src={showData.image_url} alt="Show Poster"/>
    <h1 className="tile-name">{showData.name}</h1>
  </div>;
}

export default ShowTile;
