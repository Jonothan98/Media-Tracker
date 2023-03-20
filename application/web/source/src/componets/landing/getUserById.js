import userJson from "./../../data/user.json";

export default function getUserById(userId) {
  console.log(userId);
  if (userId) {
    for (let user of userJson) {    
      if (user.id.toString() === userId) {
        return user;
      }
    }
  }
  return userJson[0];
}
