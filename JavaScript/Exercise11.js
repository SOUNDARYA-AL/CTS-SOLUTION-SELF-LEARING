Working with Forms:

<form id="registerForm">
  <input name="name" />
  <input name="email" />
  <select name="event"></select>
  <button type="submit">Submit</button>
</form>




document.getElementById("registerForm").addEventListener("submit", (e) => {
  e.preventDefault();
  const form = e.target;
  const name = form.elements.name.value;
  const email = form.elements.email.value;

  if (!name || !email) {
    alert("All fields are required.");
    return;
  }

  console.log("Registered:", name, email);
});
