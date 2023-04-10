export default function getShowsInProgress(showList) {
  if(!showList){
    return 0;
  }
  const showsInProgress = showList.filter((show) => show.status === "on going");
  return showsInProgress.length;
}
