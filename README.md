# Java Spring Boot Microservices Setup Guide

## 1. Clone Microservices Repository

Clone the Microservices repository from the "Master" branch:

git clone -b master https://github.com/kaustavdutta1989/movie_ticket_platform.git
cd microservices-repo

## 2. Setup and Start MySQL Services
Ensure MySQL service is running and accessible at localhost:3306 with the following credentials:

Username: root
Password: root
Connect to MySQL using CLI or a GUI tool and create multiple databases:
CREATE DATABASE user_db;
CREATE DATABASE theatre_db;
CREATE DATABASE movie_db;
CREATE DATABASE setup_db;
CREATE DATABASE transaction_db;
CREATE DATABASE discount_db;
CREATE DATABASE allotment_db;
CREATE DATABASE booking_db;

## 3. Open Microservices in IDE (IntelliJ)
Open the cloned Microservices project in your preferred IDE, such as IntelliJ IDEA.

Start Microservices
Eureka Service Registry:

Open and run eureka-service-registry as a Java Main class.
API Gateway Service:

Open and run api-gateway-service as a Java Main class.
Individual Microservices:

Open and run the following microservices as Java Main classes in the order specified:
user-api-service
theatre-api-service
movie-api-service
setup-api-service
transaction-api-service
discount-api-service
allotment-api-service
booking-api-service

## 4. View Registered Microservices
Open a web browser and navigate to localhost:8761 to view all registered microservices in the Eureka Service Registry.

## 5. Access Microservices Endpoints
Microservices can be accessed from [localhost:8700] with the following postfix:

User API: localhost:8700/user/api/v1 [PARTNER, VIEWER, ADMIN]
Theatre API: localhost:8700/theatre/api/v1 [PARTNER, ADMIN]
Movie API: localhost:8700/movie/api/v1 [PARTNER, ADMIN]
Setup API: localhost:8700/setup/api/v1 [PARTNER, ADMIN]
Transaction API: localhost:8700/transaction/api/v1 [PARTNER, ADMIN]
Discount API: localhost:8700/discount/api/v1 [PARTNER, ADMIN]
Allotment API: localhost:8700/allotment/api/v1 [PARTNER, ADMIN]
Booking API: localhost:8700/booking/api/v1 [VIEWER, ADMIN]

## 6. Microservices Roles
Each microservice is exposed for specific roles:

User API: localhost:8700/user/api/v1 [PARTNER, VIEWER, ADMIN]
Theatre API: localhost:8700/theatre/api/v1 [PARTNER, ADMIN]
Movie API: localhost:8700/movie/api/v1 [PARTNER, ADMIN]
Setup API: localhost:8700/setup/api/v1 [PARTNER, ADMIN]
Booking API: localhost:8700/booking/api/v1 [VIEWER, ADMIN]
