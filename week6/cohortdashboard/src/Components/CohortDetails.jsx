import React from "react";
import styles from "../styles/CohortDetails.module.css"; // Import CSS Module

function CohortDetails({ name, startedOn, status, coach, trainer }) {
  // ✅ Dynamic heading color: green for ongoing, blue otherwise
  const headingStyle = {
    color: status.toLowerCase() === "ongoing" ? "green" : "blue",
  };

  return (
    <div className={styles.box}>
      {/* Dynamic colored heading */}
      <h3 style={headingStyle}>{name}</h3>

      {/* Details List */}
      <dl>
        <dt>Started On</dt>
        <dd>{startedOn}</dd>

        <dt>Current Status</dt>
        <dd>{status}</dd>

        <dt>Coach</dt>
        <dd>{coach}</dd>

        <dt>Trainer</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
