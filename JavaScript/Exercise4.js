Functions, Scope, Closures, Higher-Order Functions:

function addEvent(events, newEvent) {
  events.push(newEvent);
}

function registerUser(event) {
  if (event.seats > 0) {
    event.seats--;
  }
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

function categoryCounter() {
  let count = 0;
  return () => ++count;
}

const musicCounter = categoryCounter();
console.log(musicCounter()); // 1
