# apigateway-zipkin-microservice
Microservice implementation with Service Registry/Discovery,API Gateway and distributed tracing with Zipkins

Microservice - A basic User-Department Service with following implementation

1.Service Registry/Discovery using Eureka
2.Cloud Config Server using a Github Config Repository for common config
3.API Gateway as a single entry point for all the microservices
4.Distributed tracing using Zipkin and Sleuth.

API GATEWAY URLS: -
1.Department Service
 - Save a Department - http://localhost:9191/departments/saveDept - POST Request
      Sample Request Payload - 
       {
	        "departmentName": "Admin",
	        "departmentAddress": "ABC Street,XYZ",
	        "departmentCode": "AD-001"
       }
 - Find a Department - http://localhost:9191/departments/findById/{id} - GET Request
 
 2.User Service
   - Save a User - http://localhost:9191/user/saveUser - POST Request
      Sample Request Payload - 
      {
	      "firstName": "John",
	      "lastName": "Doe",
	      "emailId": "john.doe@email.com",
	      "departmentId": "2"
      }
    - Find a User - http://localhost:9191/user/findById/{id} - GET Request
