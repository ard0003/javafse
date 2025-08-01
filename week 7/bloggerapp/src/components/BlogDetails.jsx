const BlogDetails = ({ title, date }) => (
  <div className="card">
    <h3>Blog: {title}</h3>
    <p>Published on: {date}</p>
  </div>
);
export default BlogDetails;
