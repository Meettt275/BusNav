import React, { useState } from "react";
import axios from "axios";

const TicketBookingForm = () => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [gender, setGender] = useState("");
  const [ticketId, setTicketId] = useState(null);

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post("http://localhost:8080/api/book-ticket", {
        passengerName: name,
        passengerEmail: email,
        passengerGender: gender
      });
      setTicketId(response.data); // Assuming backend returns ticket ID
    } catch (error) {
      console.error("Error booking ticket:", error);
    }
  };

  const handleDownloadTicket = async () => {
    try {
      const response = await axios.get(`http://localhost:8080/api/download-ticket/${ticketId}`, {
        responseType: "blob" // Ensure response type is set to blob
      });
      const url = window.URL.createObjectURL(new Blob([response.data]));
      const link = document.createElement("a");
      link.href = url;
      link.setAttribute("download", "BusNav_ticket.pdf");
      document.body.appendChild(link);
      link.click();
      document.body.removeChild(link);
    } catch (error) {
      console.error("Error downloading ticket:", error);
    }
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <label>Name:</label>
        <input type="text" value={name} onChange={(e) => setName(e.target.value)} required />
        <label>Email:</label>
        <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} required />
        <label>Gender:</label>
        <select value={gender} onChange={(e) => setGender(e.target.value)} required>
          <option value="">Select Gender</option>
          <option value="male">Male</option>
          <option value="female">Female</option>
        </select>
        <button type="submit">Book Ticket</button>
      </form>
      {ticketId && (
        <div>
          <p>Ticket booked successfully! Ticket ID: {ticketId}</p>
          <button onClick={handleDownloadTicket}>Download Ticket</button>
        </div>
      )}
    </div>
  );
};

export default TicketBookingForm;
