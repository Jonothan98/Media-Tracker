import userJson from "./../../data/user.json";

export default function getUserById(userId) {
  if (userId) {
    const user = userJson.filter((user) => user.id === parseInt(userId))
    return user[0];
  }
  return userJson[0];
}
