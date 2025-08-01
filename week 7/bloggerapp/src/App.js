import { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import coursedetails from './components/coursedetails'; // keep import lowercase

function App() {
  const [selected, setSelected] = useState('book');

  const books = [
    { id: 1, title: "React Basics", author: "Dan Abramov" },
    { id: 2, title: "Advanced JS", author: "Kyle Simpson" }
  ];

  const blogs = [
    { id: 1, title: "React 2025", date: "2025-08-01" },
    { id: 2, title: "JS Trends", date: "2025-07-15" }
  ];

  const courses = [
    { id: 1, name: "React Bootcamp", instructor: "Wes Bos" },
    { id: 2, name: "Fullstack JS", instructor: "Brad Traversy" }
  ];

  const Coursedetails = coursedetails; // 👈 Capitalized for JSX usage

  return (
    <div>
      <h1>Welcome to BloggerApp</h1>

      <button onClick={() => setSelected('book')}>Books</button>
      <button onClick={() => setSelected('blog')}>Blogs</button>
      <button onClick={() => setSelected('course')}>Courses</button>

      {selected === 'book' && (
        <>
          <h2>Book List</h2>
          {books.map(book => (
            <BookDetails key={book.id} {...book} />
          ))}
        </>
      )}

      {selected === 'blog' ? (
        <>
          <h2>Blog List</h2>
          {blogs.map(blog => (
            <BlogDetails key={blog.id} {...blog} />
          ))}
        </>
      ) : null}

      {selected === 'course' && (
        <>
          <h2>Course List</h2>
          {courses.map(course => (
            <Coursedetails key={course.id} {...course} />
          ))}
        </>
      )}
    </div>
  );
}

export default App;
