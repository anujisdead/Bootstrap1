// JavaScript for Local Community Event Portal Exercises

// 1. JavaScript Basics & Setup
// Log a message to the console
console.log('Welcome to the Community Portal');

// Use an alert when the page is fully loaded
window.onload = function() {
  alert('Page is fully loaded!');
};

// 2. Syntax, Data Types, and Operators
// Declare variables for event details
const eventName = "Community Meetup";
const eventDate = "2024-03-20";
let availableSeats = 50;
// Use template literals to concatenate info
const eventInfo = `${eventName} on ${eventDate} - Seats: ${availableSeats}`;
console.log(eventInfo);
// Use ++ or -- for seat count
// availableSeats++;

// 3. Conditionals, Loops, and Error Handling
// Implement filtering and displaying events
// Use if-else, forEach, try-catch
const events = [
    { name: "Community Meetup", date: "2024-03-20", seats: 50, category: "music" },
    { name: "Local Workshop", date: "2024-03-25", seats: 30, category: "sports" }
];

// Display events in the eventList div
const eventListDiv = document.querySelector('#eventList');
try {
    events.forEach(event => {
        if (event.seats > 0) {
            const eventElement = document.createElement('div');
            eventElement.innerHTML = `
                <h3>${event.name}</h3>
                <p>Date: ${event.date}</p>
                <p>Available Seats: ${event.seats}</p>
                <p>Category: ${event.category}</p>
            `;
            eventListDiv.appendChild(eventElement);
        }
    });
} catch (error) {
    console.error('Error displaying events:', error);
}

// 4. Functions, Scope, Closures, Higher-Order Functions
// Define reusable functions here
// function addEvent() { /* ... */ }
// function registerUser() { /* ... */ }
// function filterEventsByCategory(category, callback) { /* ... */ }
// Use closures to track data

// 5. Objects and Prototypes
// Define Event constructor or class
// class Event { /* ... */ }
// Add methods to prototype
// Event.prototype.checkAvailability = function() { /* ... */ };
// Use Object.entries()

// 6. Arrays and Methods
// Manage an array of events
// let events = [];
// Use push, filter, map

// 7. DOM Manipulation
// Access and modify HTML elements
// const eventListDiv = document.querySelector('#eventList');
// eventListDiv.innerHTML = '<p>Loading events...</p>';

// 8. Event Handling
// Add event listeners to buttons and inputs
document.getElementById('registerBtn').onclick = function() {
    alert('Registration button clicked!');
};

document.getElementById('categoryFilter').onchange = function(e) {
    const category = e.target.value;
    console.log(`Filtering by category: ${category}`);
};

document.getElementById('searchEvent').onkeydown = function(e) {
    if (e.key === 'Enter') {
        console.log(`Searching for: ${e.target.value}`);
    }
};

// 9. Async JS, Promises, Async/Await
// Fetch data from an API
document.getElementById('fetchEventsBtn').onclick = async function() {
    const spinner = document.getElementById('loadingSpinner');
    const apiData = document.getElementById('apiData');
    
    try {
        spinner.style.display = 'block';
        // Simulate API call
        const response = await new Promise(resolve => 
            setTimeout(() => resolve({ 
                events: [
                    { name: "Virtual Concert", date: "2024-04-01", seats: 100 },
                    { name: "Coding Workshop", date: "2024-04-05", seats: 25 }
                ]
            }), 1000)
        );
        
        apiData.innerHTML = `<pre>${JSON.stringify(response, null, 2)}</pre>`;
    } catch (error) {
        console.error('Error fetching events:', error);
        apiData.innerHTML = 'Error loading events';
    } finally {
        spinner.style.display = 'none';
    }
};

// 10. Modern JavaScript Features
// Refactor code with ES6+ features

// 11. Working with Forms
// Connect to the form in js-exercises.html
// const registrationForm = document.querySelector('#registrationForm'); // Assuming form has this ID
// registrationForm.addEventListener('submit', function(event) { event.preventDefault(); /* ... */ });

// 12. AJAX & Fetch API
// Simulate backend communication
// fetch('/api/register', { method: 'POST', body: JSON.stringify(userData) });

// 13. Debugging and Testing
// Use console.log, breakpoints, Network tab

// 14. jQuery and JS Frameworks
// Integrate jQuery if desired
// $('#myElement').hide(); 