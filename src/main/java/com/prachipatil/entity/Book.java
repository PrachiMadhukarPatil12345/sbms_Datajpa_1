package com.prachipatil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Book_table")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class Book
{
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String bookName, String bookAuthor, Double bookPrice, Integer bookQuantity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookQuantity = bookQuantity;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Integer getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookQuantity=" + bookQuantity + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String bookName;
	private String bookAuthor ;
	private Double bookPrice ;
	private Integer bookQuantity;
	

}
