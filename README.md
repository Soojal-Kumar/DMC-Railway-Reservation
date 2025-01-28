
# Railway Reservation System

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

## 📂 Project Structure

```
RailwayReservationSystem/
├── src/                     # Source code files
│   ├── main/                # Core project files
│   ├── database/            # Database connection utilities
├── resources/               # Images, icons, and other assets
├── database.sql             # SQL script to create and populate the database
├── README.md                # Documentation file
└── .gitignore               # Git ignore file
```

---

## 📝 Installation Guide

### Prerequisites
- Java JDK (Version 8 or higher)
- NetBeans IDE
- MySQL Server and MySQL Workbench

### Steps to Run the Project
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/RailwayReservationSystem.git
   ```
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

## 🖼️ Sample Data

### Stations
| ID | Name               | City        | Country  |
|----|--------------------|-------------|----------|
| 1  | Karachi Cantt      | Karachi     | Pakistan |
| 2  | Lahore Junction    | Lahore      | Pakistan |

### Train Types
| ID | Name     | Price (USD) |
|----|----------|-------------|
| 1  | Luxury   | 1000        |
| 2  | Standard | 600         |
| 3  | Economy  | 400         |

---

## 🎯 Objectives Achieved

- Minimized manual errors in booking and canceling tickets.
- Enabled automated management of train schedules and passenger information.
- Simplified the ticket reservation process.

---

## 📚 Documentation

For detailed documentation and code snippets, refer to the [Project Report](docs/Project_Report.pdf) (if available).

---

## 🤝 Contribution Guidelines

1. Fork this repository.
2. Create a new branch for your feature/bugfix.
3. Commit your changes with descriptive messages.
4. Push your branch and create a pull request.

---

## 📝 License

This project is licensed under the [MIT License](LICENSE). Feel free to use and modify it.

---

## 📧 Contact

For queries or issues:
- **Email**: 1plus2isequalto3@gmail.com
- **Phone**: +92 336 2747628
