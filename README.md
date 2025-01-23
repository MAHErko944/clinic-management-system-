# 🏥 Clinic Management System (CMS)  
**A Comprehensive JavaFX Solution for Modern Healthcare Management**  
*Streamline appointments, doctor schedules, patient records, and admin tasks in one platform!*  

---

## 🌟 Features  
### **User Roles & Capabilities**  

| 👨💼 **Admin** | 👩⚕️ **Doctor** | 👤 **Patient** |  
|----------------|-----------------|----------------|  
| 🔐 Manage specialties, doctors, & appointments | 📝 Create/edit medical reports | 🗓️ Book/cancel appointments |  
| 📊 Set appointment limits & view analytics | 🕒 View daily schedule & patient queue | 📜 View appointment history |  
| 🛠️ Database CRUD operations | 📋 Access patient medical history | 🔐 Secure login/registration |  
| 📈 Generate system reports | 🔔 Receive appointment notifications | ✉️ Get email/SMS reminders |  

---

## 🛠️ Tech Stack  
| Category       | Technologies |  
|----------------|--------------|  
| **Frontend**   | JavaFX, FXML, CSS |  
| **Backend**    | Java 17+, JDBC |  
| **Database**   | MySQL/PostgreSQL |  
| **Tools**      | Scene Builder, IntelliJ/Eclipse, Maven |  
| **APIs**       | JavaMail (for notifications), Quartz Scheduler |  

---

## 🚀 Getting Started  

### 📋 **Prerequisites**  
1. **Java JDK 17+** with JavaFX SDK ([Download OpenJDK](https://adoptium.net/))  
2. **Database Server**: MySQL 8.0+ or PostgreSQL 14+  
3. **IDE**: IntelliJ IDEA (Recommended) or Eclipse with JavaFX plugin  
4. **Scene Builder** for FXML editing ([Download](https://gluonhq.com/products/scene-builder/))  

---

## 📂 Project Structure
clinic-management-system/  
├── src/  
│   ├── main/  
│   │   ├── java/com/clinicmanagementsystem/  
│   │   │   ├── controllers/      # All FXML controllers  
│   │   │   ├── models/           # Data classes (Patient, Doctor, etc.)  
│   │   │   ├── services/         # Database & business logic  
│   │   │   └── Main.java         # Entry point  
│   │   └── resources/  
│   │       ├── fxml/             # All .fxml files  
│   │       ├── css/              # Stylesheets  
│   │       └── images/           # Icons & backgrounds  
├── sql/                          # Database schema & scripts  
└── pom.xml                       # Maven dependencies  


## 🛠️ Configure Environment  
Create a `.env` file in the project root with the following configuration:  

```properties
# Database Configuration
DB_URL=jdbc:mysql://localhost:3306/clinic_management
DB_USERNAME=your_db_username
DB_PASSWORD=your_db_password


