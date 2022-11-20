package com.example.demo.services

import com.example.demo.models.Book
import org.springframework.stereotype.Service

@Service
class LibraryService {

    private val books = listOf(Book("Pride and Prejudice", "7.95"), Book("Lord of the Rings", "19.85"))

    fun getBooks(): List<Book> {
        return books
    }
}