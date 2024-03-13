import React, { useState } from "react";
import "./PassengerDetailForm.css";

const PassengerDetailForm = ({ onClose }) => {
  const [passengerName, setPassengerName] = useState("");
  const [passengerAge, setPassengerAge] = useState("");
  const [passengerGender, setPassengerGender] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    // Here you can handle the form submission logic
    // For demonstration purposes, just logging the form data
    console.log("Passenger Name:", passengerName);
    console.log("Passenger Age:", passengerAge);
    console.log("Passenger Gender:", passengerGender);
    // Close the passenger detail form
    onClose();
  };

  return (
    <div className="passenger-detail-form">
      <h2>Passenger Details</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="passengerName">Name:</label>
          <input
            type="text"
            id="passengerName"
            value={passengerName}
            onChange={(e) => setPassengerName(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="passengerAge">Age:</label>
          <input
            type="number"
            id="passengerAge"
            value={passengerAge}
            onChange={(e) => setPassengerAge(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="passengerGender">Gender:</label>
          <select
            id="passengerGender"
            value={passengerGender}
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
            Submit
          </button>
        </div>
      </form>
    </div>
  );
};

export default PassengerDetailForm;
