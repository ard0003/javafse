import React, { Component } from 'react';
import Post from './Post'; // Import the single Post component

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],      // Will store fetched posts
      hasError: false // Will track if an error occurs
    };
  }

  // ✅ Method to fetch posts from API
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        this.setState({ hasError: true });
      });
  }

  // ✅ Lifecycle hook that runs AFTER first render
  componentDidMount() {
    this.loadPosts();
  }

  // ✅ Lifecycle hook to catch rendering errors
  componentDidCatch(error, info) {
    console.error('Error caught in componentDidCatch:', error, info);
    alert('Something went wrong while rendering posts!');
    this.setState({ hasError: true });
  }

  // ✅ Render method to display posts
  render() {
    if (this.state.hasError) {
      return <h2>Oops! Failed to load posts.</h2>;
    }

    return (
      <div style={{ padding: '20px' }}>
        <h2>All Blog Posts</h2>

        {this.state.posts.length === 0 && <p>Loading posts...</p>}

        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
