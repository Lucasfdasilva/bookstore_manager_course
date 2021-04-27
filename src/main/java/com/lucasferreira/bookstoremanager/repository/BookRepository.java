package com.lucasferreira.bookstoremanager.repository;

import com.lucasferreira.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
