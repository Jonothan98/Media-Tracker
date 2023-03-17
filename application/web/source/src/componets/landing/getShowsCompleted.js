function getShowsCompleted(showList) {
  let completedCount = 0;
  showList.forEach((show) => {
    if (show.status === "completed") {
      completedCount++;
    }
  });
  return completedCount;
}

export default getShowsCompleted;
