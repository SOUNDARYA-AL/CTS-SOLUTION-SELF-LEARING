DOM Manipulation:

const eventList = document.querySelector('#eventList');

const card = document.createElement('div');
card.innerText = "Event: Community Meetup";
eventList.appendChild(card);

function updateUIOnRegister(event) {
  event.seats--;
  card.innerText = `Updated Seats: ${event.seats}`;
}