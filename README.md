This project was initially used for a Java Frameworks course.

# Spring Inventory Application

## Overview
This is a full-stack, web-based inventory management application built using the Java Spring Framework. The application tracks and manages the relationship between distinct "Parts" and assembled "Products." 

The system features a customized front-end user interface, automated database seeding, strict inventory validation rules, and transactional purchasing functionality to ensure accurate stock levels.

## Technologies & Environment
* **Backend:** Java, Spring Boot, Spring MVC, Spring Data JPA
* **Frontend:** HTML, CSS, Thymeleaf (Templating Engine)
* **Database:** Relational Database (H2/MySQL via Hibernate)
* **Testing:** JUnit

## Key Features & Technical Highlights

* **Complex Entity Relationships:** Manages one-to-many and many-to-many relationships between Parts and Products using Spring Data JPA.
* **Dynamic Inventory Validation:** Implements custom backend validation logic to enforce strict minimum and maximum inventory limits. Prevents users from adding parts or products that would violate stock capacity or drop inventory below safe thresholds, returning user-friendly error messages to the UI.
* **Transactional Purchasing:** Features a "Buy Now" functionality that programmatically decrements product inventory upon a successful transaction without improperly altering underlying associated part stock.
* **Automated Data Seeding:** Bootstraps the database with a sample inventory of uniquely generated parts and products upon application startup, ensuring data is only populated if the database is currently empty to prevent duplication.
* **Unit Testing:** Includes JUnit tests to verify the business logic of the inventory boundaries (minimum and maximum stock validation).
* **MVC Architecture:** Strictly adheres to the Model-View-Controller design pattern, utilizing Thymeleaf to dynamically render server-side data to the client's web browser.

## How to Run Locally

1. Clone the repository to your local machine:
   ```bash
   git clone [https://github.com/](https://github.com/)[Your-Professional-Username]/[your-repo-name].git
2. Open the project in your preferred Java IDE (this project was built using IntelliJ IDEA)
3. Allow Maven/Gradle to resolve and download the required Spring dependencies.
4. Run the application from main/java/com.example.demo `DemoApplication.java`
5. Open a web browser and navigate to http://localhost:8080

## Author
Ryan Corson
* GitHub: @rycorson
* LinkedIn: https://www.linkedin.com/in/ryan-corson/
