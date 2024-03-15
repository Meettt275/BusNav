import React, { useState } from "react";
import "./PassengerDetailForm.css";
import axios from "axios";


const PassengerDetailForm = ({ onBookingComplete }) => {
  const [name, setPassengerName] = useState("");
  const [email, setPassengerEmail] = useState("");
  const [gender, setPassengerGender] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    // Here you can handle the form submission logic
    // For demonstration purposes, just logging the form data
    const response = await axios.post("http://localhost:8080/Passenger/add", {
      name,
      email,
      gender,
      
    });
    console.log(response.data);
  
    // console.log("Passenger Name:", passenger_name);
    // console.log("Passenger Age:", passengerEmail);
    // console.log("Passenger Gender:", passengerGender);
    // Close the passenger detail form
    // onClose();

    onBookingComplete();

  };

  return (
    <div className="passenger-detail-form">
      <h2>Passenger Details</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="passenger_name">Name:</label>
          <input
            type="text"
            id="passenger_name"
            value={name}
            onChange={(e) => setPassengerName(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="passengerEmail">Email:</label>
          <input
            type="text"
            id="passengerEmail"
            value={email}
            onChange={(e) => setPassengerEmail(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="passengerGender">Gender:</label>
          <select
            id="passengerGender"
            value={gender}
            onChange={(e) => setPassengerGender(e.target.value)}
            required
          >
            <option value="">Select Gender</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
          </select>
        </div>
        <div className="form-group">
          <button type="submit" className="submit-button">
            Book Ticket
          </button>
        </div>
      </form>
    </div>
  );
};

export default PassengerDetailForm;
