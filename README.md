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
| 📈 Generate system reports | 🔔 Receive appointment notifications |  |  

---

## 🛠️ Tech Stack  
| Category       | Technologies |  
|----------------|--------------|  
| **Frontend**   | JavaFX, FXML, CSS |  
| **Backend**    | Java 17+, JDBC |  
| **Database**   | MySQL/PostgreSQL |  
| **Tools**      | Scene Builder, IntelliJ/Eclipse, Maven |    

---
## 🔌 API Endpoints

| Method | Endpoint              | Description                |
|--------|-----------------------|----------------------------|
| POST   | /api/appointments     | Create new appointment     |
| GET    | /api/doctors/{id}     | Get doctor details         |
| PUT    | /api/reports/{id}     | Update medical report      |

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
```
## 🖥️ Usage Guide

### 👨💼 Admin Workflow

#### Add a New Doctor
1. Navigate to **Admin Dashboard → Manage Doctors → Add Doctor**
2. Fill required fields:
   - Doctor Name
   - Email Address
   - Specialty (select from existing specialties)
   - Schedule Availability
3. Click `Save` to add to the system

#### Manage Appointments
- **Filter Appointments**:
  - Use date picker to select range
  - Filter by doctor name or appointment status (Pending/Completed/Cancelled)
- **Cancel Appointments**:
  - Select appointment from table
  - Click `Cancel Appointment` button (⚠️ Reduces schedule availability count)

---

### 👩⚕️ Doctor Workflow

#### View Daily Schedule
1. From dashboard, check **Today's Appointments** section
2. View patient queue numbers in chronological order
3. Click `Mark Complete` after consultation

#### Create Medical Reports
1. Select appointment from **Pending Reports** list
2. Fill diagnosis details in report form
3. Click `Submit Report` to:
   - Save report to database
   - Update appointment status to Completed
   - Trigger email notification to patient

---

### 👤 Patient Workflow

#### Book Appointment
1. **Select Specialty** (e.g., Cardiology, Pediatrics)
2. **Choose Doctor** from available specialists
3. **Pick Available Day** from doctor's schedule
4. System automatically assigns queue number
5. Receive confirmation email with details

#### View Appointment History
- **Filter Options**:
  - By date range (Last 7/30 days)
  - By status (Upcoming/Completed)
- **Export Reports**:
  - Reports include doctor notes and diagnosis

