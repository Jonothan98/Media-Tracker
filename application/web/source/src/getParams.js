
const getParams = (query) => {
    const params = new URLSearchParams(window.location.search);
    const result = params.get(query);
    return result;
}
export default getParams;