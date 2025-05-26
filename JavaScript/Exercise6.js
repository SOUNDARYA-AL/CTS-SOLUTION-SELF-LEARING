Arrays and Methods:



let events = [];

events.push({ name: "Music Fest", category: "Music" });

const musicEvents = events.filter(e => e.category === "Music");

const displayCards = events.map(e => `Workshop on ${e.name}`);
console.log(displayCards);