function getShowsCompleted(showList) {
  if(!showList){
    return 0;
  }
  const showsCompleted = showList.filter((show) => show.status === "completed")
  return showsCompleted.length;
}

export default getShowsCompleted;
