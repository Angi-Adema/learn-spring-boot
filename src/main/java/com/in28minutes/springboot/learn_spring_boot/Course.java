package com.in28minutes.springboot.learn_spring_boot;

// Define all the attributes we want to have.
public class Course {
	private long id;
	private String name;
	private String author;
	
	// Create a constructor, getter methods and a toString method.
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	
}
