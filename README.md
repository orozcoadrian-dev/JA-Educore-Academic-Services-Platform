# <div align="center">

# 

# <img src="https://github.com/orozcoadrian-dev/JA-Educore-Academic-Services-Platform/blob/1f06575caa3db257a5b86fd423a184200023d04e/01-Branding/Banners/Presentation-banner.png" alt="JA Educore Banner" width="100%">

# 

# \# JA Educore

# 

# \### Academic Services Platform

# 

# </div>

# 

# <br>

# 

# \## Overview

# 

# JA Educore is an academic services management platform designed to centralize, organize, and improve the handling of academic requests within an educational institution.

# 

# The platform addresses the limitations of traditional request management processes based on emails and forms, where information may become difficult to track, response times may increase, and request history may be fragmented.

# 

# JA Educore provides a structured digital environment where students can submit academic requests, monitor their progress, and access relevant information, while institutional staff can manage, process, update, and maintain the lifecycle of each request.

# 

# The system is designed around principles of modularity, separation of responsibilities, maintainability, and scalability, with a focus on supporting the evolution of academic services through a structured software architecture.

# 

# \---

# 

# \## Problem Statement

# 

# Educational institutions frequently manage academic procedures through decentralized communication channels such as email and independent forms.

# 

# Students may need to request services including:

# 

# \* Study certificates.

# \* Grade review requests.

# \* Course cancellation requests.

# \* Clearance certificate requests.

# \* Information about the current status of submitted requests.

# 

# When these processes are managed without a centralized system, several operational issues can arise:

# 

# \* Limited traceability of requests.

# \* Difficulty monitoring request progress.

# \* Information loss or fragmentation.

# \* Increased response times.

# \* Lack of a centralized request history.

# \* Inefficient communication between students and institutional staff.

# 

# JA Educore is proposed as a digital solution to centralize these processes and provide a more structured academic service experience.

# 

# \---

# 

# \# Core Objectives

# 

# The platform is designed to support the following academic service operations:

# 

# 1\. Student registration.

# 2\. User authentication.

# 3\. Creation of academic requests.

# 4\. Request status tracking.

# 5\. Administrative management of submitted requests.

# 6\. Request status updates.

# 7\. Basic report generation.

# 8\. Request history management.

# 

# The objective is to provide a centralized system where academic requests can be created, processed, monitored, and maintained throughout their lifecycle.

# 

# \---

# 

# \# Functional Requirements

# 

# The system is expected to provide the following core functionality.

# 

# | ID   | Requirement                                                    | Priority | Acceptance Criteria                                                          |

# | ---- | -------------------------------------------------------------- | -------- | ---------------------------------------------------------------------------- |

# | FR01 | The system must allow student registration.                    | High     | The student is successfully registered with their corresponding information. |

# | FR02 | The system must allow authorized users to authenticate.        | High     | The system validates the provided credentials.                               |

# | FR03 | Students must be able to create academic requests.             | High     | Each request receives a unique identifier.                                   |

# | FR04 | Users must be able to consult the current status of a request. | High     | The current request status is displayed to the authorized user.              |

# | FR05 | Institutional staff must be able to manage academic requests.  | High     | Authorized staff can access and process assigned or available requests.      |

# | FR06 | Authorized personnel must be able to update request statuses.  | High     | Status changes are registered and reflected in the request lifecycle.        |

# | FR07 | The system must support the generation of basic reports.       | Medium   | Relevant request information can be consolidated into reports.               |

# | FR08 | The system must maintain a history of requests.                | High     | Relevant request events and status changes remain traceable.                 |

# 

# \---

# 

# \# Non-Functional Requirements

# 

# The project establishes performance and security as explicit non-functional concerns.

# 

# | ID    | Requirement                                           | Priority | Acceptance Criteria                                                                     |

# | ----- | ----------------------------------------------------- | -------- | --------------------------------------------------------------------------------------- |

# | NFR01 | The system must provide a responsive user experience. | Medium   | Relevant operations should respond in less than 3 seconds under the defined conditions. |

# | NFR02 | System information must be protected.                 | High     | Only authorized users can access protected information.                                 |

# 

# In addition to the explicitly defined requirements, the project analysis includes the identification of additional non-functional requirements related to the quality, architecture, and operation of the solution.

# 

# \---

# 

# \# User Roles

# 

# JA Educore is structured around the main actors involved in the academic request process.

# 

# \## Student

# 

# Students interact with the platform to:

# 

# \* Register in the system.

# \* Authenticate using valid credentials.

# \* Create academic requests.

# \* Provide the required request information.

# \* Consult the current status of their requests.

# \* Access the historical information associated with their requests.

# 

# \## Institutional Staff

# 

# Authorized institutional personnel interact with the system to:

# 

# \* Access academic requests.

# \* Review submitted information.

# \* Manage request processing.

# \* Update request statuses.

# \* Maintain request progression.

# \* Access information required for operational management.

# \* Contribute to the generation and consultation of reports.

# 

# \---

# 

# \# Academic Request Lifecycle

# 

# The platform manages academic requests as structured entities with identifiable information and a defined lifecycle.

# 

# A typical process includes:

# 

# 1\. A student accesses the platform.

# 2\. The student authenticates successfully.

# 3\. The student creates an academic request.

# 4\. The system assigns a unique identifier to the request.

# 5\. The request becomes available for institutional management.

# 6\. Authorized staff review and process the request.

# 7\. The request status may be updated during its lifecycle.

# 8\. Relevant changes remain associated with the request history.

# 9\. The student can consult the current status of the request.

# 

# This approach improves traceability and provides a centralized mechanism for monitoring academic service processes.

# 

# \---

# 

# \# System Architecture

# 

# JA Educore is conceived as a modular software solution with a clear separation of responsibilities.

# 

# The architectural design is based on component-oriented organization and the Model-View-Controller pattern, allowing the system to separate data and business rules, user interfaces, and application control logic.

# 

# The architecture is intended to support:

# 

# \* Separation of concerns.

# \* Maintainability.

# \* Modularity.

# \* Low coupling.

# \* High cohesion.

# \* Controlled dependencies.

# \* Easier testing.

# \* Future extensibility.

# 

# \---

# 

# \# Model-View-Controller

# 

# \## Model

# 
<div align="center">

<img src="YOUR-BANNER-PERMALINK-HERE" alt="JA Educore Banner" width="100%" />

<br />

# JA Educore

### Academic Services Platform

</div>

---

## Overview

JA Educore is an academic services management platform designed to centralize and improve the handling of academic requests within an educational institution.

The platform replaces fragmented processes based on emails and forms with a structured digital environment where students can submit requests, track their progress, and access relevant information. Institutional staff can manage requests, update their status, maintain request history, and generate reports.

---

## Problem Statement

Students may need to submit academic requests such as:

- Study certificates
- Grade review requests
- Course cancellation requests
- Clearance certificate requests
- Request status inquiries

Managing these processes through emails and independent forms can result in:

- Limited request traceability
- Information loss or fragmentation
- Increased response times
- Difficulty monitoring request progress
- Lack of a centralized request history

JA Educore provides a centralized solution for managing these processes efficiently.

---

## Core Objectives

The platform is designed to support:

1. Student registration
2. User authentication
3. Academic request creation
4. Request status tracking
5. Administrative request management
6. Request status updates
7. Basic report generation
8. Request history management

---

## Functional Requirements

| ID | Requirement | Priority |
|---|---|---|
| FR01 | Register students | High |
| FR02 | Authenticate users | High |
| FR03 | Create academic requests | High |
| FR04 | Consult request status | High |
| FR05 | Manage academic requests | High |
| FR06 | Update request status | High |
| FR07 | Generate basic reports | Medium |
| FR08 | Maintain request history | High |

### Acceptance Criteria

- Student information must be successfully registered.
- User credentials must be validated before access is granted.
- Each academic request must receive a unique identifier.
- Users must be able to consult the current status of their requests.
- Authorized staff must be able to manage and process requests.
- Status changes must be reflected throughout the request lifecycle.
- Relevant information must be available for reporting.
- Request events and status changes must remain traceable.

---

## Non-Functional Requirements

| ID | Requirement | Priority |
|---|---|---|
| NFR01 | Provide responsive system performance | Medium |
| NFR02 | Protect system information | High |

The system should provide relevant responses in less than three seconds under the defined conditions.

Access to protected information must be restricted to authorized users.

---

## User Roles

### Student

Students can:

- Register in the platform
- Authenticate using valid credentials
- Create academic requests
- Consult request status
- Access request history

### Institutional Staff

Authorized staff can:

- Access submitted requests
- Review request information
- Process academic requests
- Update request statuses
- Maintain request progression
- Access information required for management and reporting

---

## Architecture

JA Educore is designed around a modular architecture using the **Model-View-Controller (MVC)** pattern.

This approach separates the main responsibilities of the system and supports maintainability, modularity, controlled dependencies, and future scalability.

### Model

Represents application data and business rules.

Main entities include:

- Student
- Staff Member
- Academic Request
- Request Type
- Request Status
- Request History

### View

Represents the interfaces used by students and institutional staff.

Main interfaces include:

- Login
- Registration
- Student dashboard
- Academic request creation
- Request consultation
- Staff dashboard
- Request management
- Reports

### Controller

Coordinates requests from the user interface and manages interaction with the system.

Representative controllers include:

- AuthenticationController
- RequestController
- StudentController
- StaffController
- ReportController

---

## Core Components

| Component | Responsibility |
|---|---|
| Authentication | Login and access control |
| Users | Student and staff management |
| Academic Requests | Request creation and consultation |
| Request Management | Request processing and status updates |
| Notifications | Communication about relevant changes |
| Reports | Generation of statistics and reports |
| Persistence | Communication with the database |

Each component should maintain a clear responsibility, defined inputs and outputs, controlled dependencies, and explicit interfaces.

---

## Modularity

JA Educore follows a modular design approach where each component focuses on a specific responsibility.

The architecture aims to maintain:

- Low coupling
- High cohesion
- Clear component boundaries
- Controlled dependencies
- Easier maintenance
- Greater flexibility for future changes

For example, changes to the notification component should not require modifications across the entire system.

---

## Design Principles

The project considers the application of the following principles:

### MVC

Separates:

- User interface
- Application control logic
- Data and business rules

### SOLID

The design particularly considers:

- Single Responsibility Principle
- Open/Closed Principle
- Dependency Inversion Principle

These principles support a more maintainable and extensible software architecture.

---

## Testing

The system must be validated through:

- 5 positive test cases
- 5 negative test cases
- 2 non-functional requirement tests

Testing should determine:

- Which requirements were fulfilled
- Which requirements were not fulfilled
- Which tests succeeded
- Which tests revealed failures
- What changes are required to improve the solution

### Example Test Cases

| Test ID | Requirement | Scenario | Expected Result |
|---|---|---|---|
| TC01 | FR02 | Valid credentials | Access granted |
| TC02 | FR02 | Invalid password | Access rejected |
| TC03 | FR03 | Complete request data | Request created |
| TC04 | FR03 | Missing required information | Validation error displayed |

---

## Future Evolution

The architecture is designed to support future expansion.

### PQRS Module

A future phase may include a module for managing:

- Petitions
- Complaints
- Claims
- Suggestions

### Email Notifications

The platform may also incorporate an email notification system to inform users about relevant events and request status changes.

These future additions require the architecture to support extension without introducing unnecessary modifications to existing components.

---

## Project Deliverables

The complete project includes:

1. Problem description
2. Functional and non-functional requirements
3. Requirements matrix
4. Test cases
5. Test results
6. Development methodology and justification
7. Software design model
8. MVC diagram
9. Architecture diagram
10. Component descriptions
11. Modularity analysis
12. Applied patterns and principles
13. Conclusions

---

## Project Structure

```text
JA-Educore/
│
├── src/
│   ├── authentication/
│   ├── users/
│   ├── requests/
│   ├── management/
│   ├── notifications/
│   ├── reports/
│   └── persistence/
│
├── tests/
│   ├── positive/
│   ├── negative/
│   └── non-functional/
│
├── docs/
│   ├── requirements/
│   ├── testing/
│   ├── architecture/
│   └── diagrams/
│
└── README.md