Event Handling:

<input type="text" id="search" />
<select id="categoryFilter"></select>
<button id="registerBtn">Register</button>





document.getElementById("registerBtn").onclick = () => alert("Registered!");

document.getElementById("categoryFilter").onchange = (e) => {
  console.log("Filter changed:", e.target.value);
};

document.getElementById("search").onkeydown = (e) => {
  console.log("Searching for:", e.key);
};