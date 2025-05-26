AJAX & Fetch API:


const userData = {
  name: "Alice",
  email: "alice@example.com"
};

fetch("/api/register", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(userData)
})
  .then(res => res.json())
  .then(data => alert("Success!"))
  .catch(err => alert("Failed!"));

setTimeout(() => console.log("Simulated delay..."), 2000);
