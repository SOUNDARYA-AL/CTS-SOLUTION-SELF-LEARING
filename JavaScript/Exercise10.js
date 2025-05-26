Modern JavaScript Features:

const event = { name: "Art Show", date: "2025-06-01", location: "Park" };

const { name, date } = event;

function showEvent(e = "No event") {
  console.log(e);
}

const clonedEvents = [...events];