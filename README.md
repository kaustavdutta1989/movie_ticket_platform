The Applcations are Submoduled. Please follow steps to Replicate the Application Microservices and locahost accessibility.

1. Clone the Microservices from the "Master" branch.
2. Setup and Start MySQL Services [root root locahost:3306].
3. Connect using CLI or GUI.
4. create multiple Databases:
   a. user_db
   b. theatre_db
   c. movie_db
   d. setup_db
   e. transaction_db
   f. discount_db
   g. allotment_db
   h. booking_db
5. Open and Run (Java Main) the Microservices in IDE (IntelliJ)
   a. eureka-service-registry
   b. api-gateway-service
   c. user-api-service
   d. theatre-api-service
   e. movie-api-service
   f. setup-api-service
   g. transaction-api-service
   h. discount-api-service
   i. allotment-api-service
   j. booking-api-service
6. open "localhost:8761" to view all registered microservices
7. Microservices could be accessed from "localhost:8700" with postfix:
   a. user/api/v1
   b. theatre/api/v1
   c. movie/api/v1
   d. setup/api/v1
   e. transaction/api/v1
   f. discount/api/v1
   g. allotment/api/v1
   h. booking/api/v1
8. Application Exposed Microservices for the Roles [PARTNER, VIEWER, ADMIN]:
   a. user/api/v1 [PARTNER, VIEWER, ADMIN]
   b. theatre/api/v1 [PARTNER, ADMIN]
   c. movie/api/v1 [PARTNER, ADMIN]
   d. setup/api/v1 [PARTNER, ADMIN]
   h. booking/api/v1 [VIEWER, ADMIN]
