Conditionals, Loops, and Error Handling:

const today = new Date();
const events = [
  { name: "Art Fair", date: new Date("2025-08-10"), seats: 10 },
  { name: "Old Event", date: new Date("2024-05-10"), seats: 0 }
];

events.forEach(event => {
  if (event.date > today && event.seats > 0) {
    console.log(`${event.name} is available`);
  }
});

try {
  let selectedEvent = events[0];
  if (selectedEvent.seats > 0) {
    selectedEvent.seats--;
  } else {
    throw new Error("No seats available");
  }
} catch (err) {
  console.error("Registration failed:", err.message);
}
