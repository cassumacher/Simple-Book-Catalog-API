package com.bookcatalog.springboot.crudproject.repository;

import com.bookcatalog.springboot.crudproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
