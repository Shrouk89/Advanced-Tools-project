package com.alakeel.util;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String message;

	private LocalDateTime timestamp;

	// constructors
	public Notification() {
	    this.timestamp = LocalDateTime.now();
	}

	public Notification(String message) {
	    this.message = message;
	    this.timestamp = LocalDateTime.now();
	}

	// getters and setters
	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
	   this.id = id;
	}

	public String getMessage() {
	    return message;
	}

	public void setMessage(String message) {
	    this.message = message;
	}

	public LocalDateTime getTimestamp() {
	    return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
	    this.timestamp = timestamp;
	}

	// toString method
	@Override
	public String toString() {
	    return "Notification{" +
	            "id=" + id +
	            ", message='" + message + '\'' +
	            ", timestamp=" + timestamp +
	            '}';
	}
}