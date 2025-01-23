# 🏥 Clinic Management System (CMS)  
**A Comprehensive JavaFX Solution for Modern Healthcare Management**  
*Streamline appointments, doctor schedules, patient records, and admin tasks in one platform!*  

---

## 📌 Project Description

### **What is the Clinic Management System?**
The **Clinic Management System (CMS)** is a desktop application designed to automate and streamline healthcare operations for small to medium-sized clinics. It replaces manual paper-based workflows with a secure, centralized platform for managing:

- **Patient appointments**
- **Doctor schedules**  
- **Medical records**  
- **Administrative tasks**  

Built for **Windows, macOS, and Linux**, it empowers clinics to:  
✅ Reduce administrative workload by 60%+  
✅ Eliminate double-booking errors  
✅ Improve patient satisfaction with digital services  
✅ Maintain HIPAA-compliant record-keeping  

---

## 🖥️ System Requirements

### **⚙️ Functional Requirements**
- 🛡️ Patients, doctors, and admins can log in securely.
- 🕒 Automated queue assignment for appointments.
- 📅 Daily appointment limits for doctors (configurable by admins).
- ✔️ Data validation for registrations, appointments, and reports.

### **🛠️ Non-Functional Requirements**
- **Reliability**: 99.9% uptime with robust error handling and transaction management.
- **Scalability**: Efficient database queries and modular architecture to handle growing user numbers.
- **🔒 Security**: Password hashing (SHA-256) and role-based access control.
- **⚡ Performance**: Pages load and actions process within 0.01 seconds.
- **🔄 Backup**: Daily backups to Google Drive or secondary servers.
- **👩‍💻 Usability**: Intuitive desktop interface for users with basic technical skills.

---

### **Who Is This For?**

| Role               | Pain Points Solved                                                                 | Key Benefits                                                                 |
|--------------------|-----------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| **Clinic Admins**  | Manual appointment tracking, disorganized records, staffing coordination          | Centralized control of doctors/schedules, real-time analytics, automated reports |
| **Doctors**        | Paper-based patient history, time-consuming report writing, missed appointments   | Instant access to patient history, digital report templates, schedule alerts     |
| **Patients**       | Long wait times, phone-based booking, lost medical records                        | 24/7 online booking, digital prescriptions, automated reminders                |

---

### **Core Features Overview**

#### **1. Appointment Lifecycle Management**  
🔹 **Smart Scheduling**: Auto-avoid double bookings using doctor availability rules  
🔹 **Queue Optimization**: Dynamic queue numbers with estimated wait times  
🔹 **Status Tracking**: Real-time updates (Pending → Completed → Archived)  

#### **2. Patient Management**  
🔹 **Digital Profiles**: Store medical history, allergies, and prescriptions  
🔹 **Self-Service Portal**: Patients can book/cancel appointments without clinic calls  

#### **3. Doctor Workflow Tools**  
🔹 **Daily Dashboard**: Prioritized patient queue with critical case flags  
🔹 **Report Templates**: Pre-built forms for common diagnoses (e.g., flu, diabetes)  
🔹 **Analytics**: Track patient load, common conditions, and treatment success rates  

#### **4. Administrative Control**  
🔹 **Role-Based Access**: Granular permissions (Admin/Doctor/Patient)  
🔹 **Audit Logs**: Track all system changes (who, what, when)  

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

---
### 🌟 Key Features

#### For Patients
- 📝 **Registration**: Create an account with personal details (name, email, phone, age, gender, password).
- 🔑 **Login**: Secure access using email and password.
- 👀 **View Specialties**: Browse available medical specialties.
- 🗓️ **Book Appointments**: Select a specialty, doctor, and available day to book an appointment. Receive an automated queue number.
- 📅 **Appointment History**: View past appointments.
- 🕒 **View Doctor Availability**: Check doctors’ schedules and specialties.

#### For Doctors
- 🔑 **Login**: Access the system with credentials.
- 🗓️ **View Schedule**: Check available days and appointments.
- 📄 **Manage Reports**: Submit reports for appointments and mark them as "Completed".
- 📚 **Patient Report History**: Review historical reports for patients.

#### For Admins
- 👥 **User Management**: Add, edit, or remove doctors and specialties.
- 🗓️ **Appointment Management**: Add, delete, or edit appointments. Set daily appointment limits per doctor.
- ⚙️ **System Configuration**: Schedule backups, manage data integrity, and ensure uptime (99.9% SLA).
- 📊 **Reports**: Monitor system performance and user activities.

#### View Appointment History
- **Filter Options**:
  - By date range (Last 7/30 days)
  - By status (Upcoming/Completed)
- **Export Reports**:
  - Reports include doctor notes and diagnosis

---

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
  - Click `Download PDF` next to completed appointments
  - Reports include doctor notes and diagnosis
