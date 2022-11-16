package com.example.demo.controllers

import com.example.demo.models.Book
import com.example.demo.services.LibraryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LibraryController @Autowired constructor (val librarySvc: LibraryService) {

    @GetMapping("/books")
    fun getBooks(): List<Book> {
        return librarySvc.getBooks()
    }
}