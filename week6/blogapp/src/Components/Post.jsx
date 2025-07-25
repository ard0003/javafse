import React from 'react';

function Post({ title, body }) {
  return (
    <div style={{
      border: "1px solid #ccc",
      padding: "10px",
      margin: "10px 0",
      borderRadius: "8px",
      background: "#f9f9f9"
    }}>
      <h3>{title}</h3>
      <p>{body}</p>
    </div>
  );
}

export default Post;
