
# DMC Railway Reservation System
![image](https://github.com/user-attachments/assets/d9f0feeb-d499-4dac-9389-bfbc3ebf65c5) ![image](https://github.com/user-attachments/assets/2539f044-fb2a-4bba-bca1-4395ad57937f)



A comprehensive Java-based Railway Reservation System built using **NetBeans** and **MySQL**. The system is designed to automate and simplify railway operations, including ticket booking, train schedule management, and passenger information maintenance.

---

## 🚀 Features

- **Login System**: Separate login for Admin and Users.
- **Train Management**: Add, update, and delete train details.
- **Ticket Reservation**: Book, update, and cancel tickets.
- **Schedule Management**: View and modify train schedules.
- **Passenger Management**: Store and manage passenger details.
- **Feedback System**: Collect feedback from passengers.
- **Helpline Bot**: Provide guidance to passengers with a chatbot.
- **Printable Tickets**: Generate tickets and print them as PDFs.
- **Interactive UI**: Built using Java Swing for a user-friendly interface.


---

## 🛠️ Technology Stack

- **Front-End**: Java Swing (GUI)
- **Back-End**: MySQL Database
- **Tools & IDEs**: NetBeans IDE, MySQL Workbench
- **Plugins**: JCalendar, TimeChooser, FlatDark

---

## 📝 Installation Guide

### Prerequisites
- Java JDK (Version 8 or higher)
- NetBeans IDE
- MySQL Server and MySQL Workbench

### Steps to Run the Project
1. **Clone the Repository**:
2. **Database Setup**:
   - Open the `database.sql` file in MySQL Workbench.
   - Execute the script to create and populate the database.
3. **Configure the Database Connection**:
   - Update the database connection details in the source code (e.g., `SConnection.java`).
4. **Open the Project in NetBeans**:
   - Import the cloned repository as a project in NetBeans.
5. **Run the Project**:
   - Build and run the application from NetBeans.

---

## 📊 Database Schema

The database consists of the following tables:
- `station`: Details about railway stations.
- `traintype`: Types of trains (e.g., Luxury, Standard, Economy).
- `train`: Train details including name, type, and capacity.
- `tschedule`: Train schedules with departure and arrival times.
- `ticket`: Ticket details linking schedules and passengers.
- `passenger`: Information about passengers.
- `feedback`: Feedback and ratings for services.

---

## 🎯 Objectives Achieved

- Minimized manual errors in booking and canceling tickets.
- Enabled automated management of train schedules and passenger information.
- Simplified the ticket reservation process.

---

## 🤝 Contribution Guidelines

1. Fork this repository.
2. Create a new branch for your feature/bugfix.
3. Commit your changes with descriptive messages.
4. Push your branch and create a pull request.


---

## 📧 Contact

For queries or issues:
- **Email**: soooojalkumar@gmail.com

---

## 📝 License

This project is licensed under the [MIT License](LICENSE). Feel free to use and modify it.
