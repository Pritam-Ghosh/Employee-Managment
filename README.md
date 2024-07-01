# Employee Management System

Employee Management System is a Java-based application designed to manage employee records efficiently. It allows users to perform CRUD (Create, Read, Update, Delete) operations on employee data through a graphical user interface.

## Database Setup

### MySQL Database and Tables

1. **Database Creation:**
   - Install MySQL if not already installed.
   - Open MySQL command line or MySQL Workbench.
   - Execute the following SQL command to create a database named `employeemanagement`:

     ```sql
     CREATE DATABASE employeemanagement;
     ```

2. **Employee Table:**
   - Within the `employeemanagement` database, create a table named `employee` to store employee details. Execute the following SQL command:

     ```sql
     CREATE TABLE employee (
         empId INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(100) NOT NULL,
         fname VARCHAR(100) NOT NULL,
         dob DATE NOT NULL,
         salary DECIMAL(10, 2) NOT NULL,
         address VARCHAR(200) NOT NULL,
         phone VARCHAR(15) NOT NULL,
         email VARCHAR(100) NOT NULL,
         education VARCHAR(100) NOT NULL,
         designation VARCHAR(100) NOT NULL,
         aadhar VARCHAR(20) NOT NULL
     );
     ```

3. **Login Table:**
   - Create a table named `login` to store login credentials for accessing the system. Execute the following SQL command:

     ```sql
     CREATE TABLE login (
         username VARCHAR(50) PRIMARY KEY,
         password VARCHAR(50) NOT NULL
     );
     ```

4. **Insert Sample Data (Optional):**
   - Optionally, insert sample data into the `employee` and `login` tables for testing purposes.

5. **Database Configuration:**
   - Ensure your Java application is configured to connect to the MySQL database (`employeemanagement`). Update the JDBC connection string in your Java code accordingly.

## How to Run

1. **Java Setup:**
   - Import the project into your Java IDE (e.g., IntelliJ IDEA, Eclipse).
   - Ensure MySQL JDBC driver is added to your project dependencies.

2. **Run the Application:**
   - Run `Splash.java` to start the application.
   - Use the provided credentials from the `login` table to log in and access the system.

## Screenshots

- Add Employee Interface
- View Employee Table
- Remove Employee Interface
- Update Employee Interface

## Future Enhancements

- Implement user roles and permissions.
- Add more validation checks for input fields.
- Improve UI/UX with better styling and responsiveness.
- Implement logging and error handling.

## Contributors

- [Your Name](link to your profile)

## License

This project is licensed under the [MIT License](link to license file).
