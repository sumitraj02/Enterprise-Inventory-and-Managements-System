# Enterprise-Inventory-Managements-System

A full-stack Enterprise Inventory Management System designed to efficiently manage products, track stock changes, and handle user roles with secure authentication.

🚀 Features

📊 Product Management
Add, update, delete products
Categorization of items
Price & quantity tracking

📦 Stock Management
Real-time stock updates (ADD / REMOVE)
Automatic inventory tracking
Low stock alerts using reorder level
📝 Stock Logs (Audit Trail)
Maintains history of all stock changes
Tracks date, type, and quantity changes

👥 User Management
Role-based access (ADMIN / USER)
Secure password storage (encrypted)
Enable/Disable user accounts
📈 Reporting Dashboard
Inventory insights
Stock movement tracking

🗄️ Database Design
The system is built using a relational database structure with three main tables:

1. Products Table
Stores product details like name, category, price, quantity
Includes reorder_level for low stock alerts

Primary Key: id

2. Stock_Logs Table
Tracks all inventory changes (ADD / REMOVE)
Maintains audit history
Foreign Key: product_id → Products.id

3. Users Table
Handles authentication and authorization
Stores roles and encrypted passwords
Includes account status (enabled)

🔗 Relationships
One Product → Many Stock Logs (1:N relationship)
Users table is used for access control

🧠 System Design Highlights
✅ Normalized Database (3NF)
✅ Scalable & Modular Architecture
✅ Secure Authentication System
✅ Role-Based Access Control
✅ Real-Time Inventory Tracking

📅 Sprint Planning & User Stories
Planned Sprint	Actual Sprint	US ID	User Story Description	MoSCoW	Dependency	Assignee	Status
S1	S1	US-001	Project Setup & Database Configuration	MUST HAVE	No Dependency	Intern	Completed
S1	S1	US-002	Inventory Data Modeling & Schema Design	MUST HAVE	US-001	Intern	Completed
S2	S2	US-003	Product & Category Management Module	MUST HAVE	US-002	Intern	Completed
S2	S2	US-004	Stock Management & Update Logic	MUST HAVE	US-003	Intern	Completed
S3	S3	US-005	Supplier & Purchase Order Module	MUST HAVE	US-004	Intern	Completed
S3	S3	US-006	Inventory Tracking & Reporting Dashboard	MUST HAVE	US-005	Intern	Completed
S4	S4	US-007	Role-Based Access & Security Implementation	MUST HAVE	US-006	Intern	Completed
S4	S4	US-008	System Testing & Deployment	MUST HAVE	US-007	Intern	Completed

⚙️ Tech Stack
Backend: Java / Spring Boot (assumed based on your learning path — update if needed)
Frontend: HTML, CSS, JavaScript / React (optional)
Database: MySQL / PostgreSQL
Version Control: Git & GitHub

🛠️ Installation & Setup
# Clone the repository
git clone https://github.com/your-username/inventory-management-system.git

# Navigate to project
cd inventory-management-system

# Run backend (Spring Boot example)
mvn spring-boot:run


🔐 Security Features
Password hashing (BCrypt)
Role-based authorization
User account enable/disable system



📌 Future Enhancements
📊 Advanced analytics & reports
📦 Barcode / QR integration
☁️ Cloud deployment (AWS / Azure)
📱 Mobile app integration

📄 LICENSE
This project is licensed under the MIT LICENSE.

🙋‍♂️ Author
Sumit Kumar
💻 Aspiring Software Development Engineer
🚀 Passionate about building scalable systems

⭐ Support

If you like this project, give it a ⭐ on GitHub!
