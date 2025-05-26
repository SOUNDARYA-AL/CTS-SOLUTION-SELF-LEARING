Debugging and Testing:

console.log("Form submitted");

const payload = { name: "Test", email: "test@example.com" };
console.log("Sending payload:", payload);

fetch("/api/register", {
  method: "POST",
  body: JSON.stringify(payload),
  headers: { "Content-Type": "application/json" }
});
