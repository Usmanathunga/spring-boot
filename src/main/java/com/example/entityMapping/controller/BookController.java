package com.example.entityMapping.controller;

import com.example.entityMapping.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController {
//    @RequestMapping(value = "/path", method = RequestMethod.GET)
//    @ResponseBody// return java object to json
//    public String helloWorld(){
//        return "helloWorld";
//    }

    @PostMapping("/book/add")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PutMapping(value = "/book/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") int id,@RequestBody Book book){
        return ResponseEntity.ok(book);
    }
}
