import { useState } from 'react'

export default function Test () {

  const [books, setBooks] = useState([])

  const handleGetBooks = async () => {
    const data = await fetch('/api/books')
    const library = await data.json()
    setBooks(library)
    
  }

  return (
    <>
      <h1>This is a test page</h1>
      <button onClick={handleGetBooks}>Get books</button>
      <ul>
        {
          books.map((book) => {
            return <li>{book.title}</li>
          })
        }
      </ul>
    </>
  )  
}