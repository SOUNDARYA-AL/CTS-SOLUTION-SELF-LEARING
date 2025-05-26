Async JS, Promises, Async/Await:

// Using .then and .catch
fetch("events.json")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));

// Using async/await
async function fetchEvents() {
  document.body.innerHTML = "Loading...";
  try {
    const res = await fetch("events.json");
    const data = await res.json();
    console.log(data);
  } catch (err) {
    console.error(err);
  }
}