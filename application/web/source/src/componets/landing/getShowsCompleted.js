function getShowsCompleted(showList) {
  console.log(showList);
  let completedCount = 0;

  if(showList){
    showList.forEach((show) => {
      if (show.status === "completed") {
        completedCount++;
      }
    });
  }
  return completedCount;
}

export default getShowsCompleted;
