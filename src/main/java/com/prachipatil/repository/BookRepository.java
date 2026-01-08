package com.prachipatil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prachipatil.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> // child
{
	
}
