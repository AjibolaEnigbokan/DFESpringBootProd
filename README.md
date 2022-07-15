
# DFESpringBootProd RESTful API Project


##	Why are we doing this?
This project aims to develop a Spring Boot application (RESTful API) for a Product database. The application is built with Java, a back-end programming language with Spring Boot tool for rapid application development. 

This application is fully functional and capable of handling HTTP requests and responds by querying the database, i.e., MySQL. The application comprises three components: Controller, Service, and Repos (repository).

The Product controller receives the HTTP request through the postman test tool by listening to it through port 8080 on the localhost and sends it to the endpoint depending on the type of request, which later forwards it to the Product Service;
the Product services send the request to the Product Repo, which in turn queries the MySQL database for specific product data and responds in the same order as shown in the screenshots of tests included with the project on GITHUB.

The application demonstrates CRUD functionality (Create, Read, Update and Delete) by returning different product data depending on the type of request and therefore shows data persistence.
Various tests like the JUnit and the coverage tests were carried out on the back-end codes to maintain code consistency and eliminate bugs by debugging the code multiple times. 
H2 database was also used to test data connectivity.
Jira board project management tool was also used to track my progress and tasks while carrying out this project.

##	How I expected the challenge to go.
The project was challenging, especially when learning a new programming language like Java and dealing with new syntax.
However, I must acknowledge the effort of our Java Tutor, Anoush Lowton, for his patience and tenacity in explaining the programming concepts to us.
He has been my source of inspiration; I thank him for all his help.

##	What went well? / What didn't go as planned?
I have had issues uploading images and documentation adding them onto GitHub, which almost slowed my progress and was challenging for me,
but our tutor Anoush came to the rescue, so I cannot just thank him enough.

##	Possible improvements for future revisions of the project.

The possible improvement to this project is that because the application is hosted on the local host (my laptop) and the postman test tool is hosted on the same laptop;
the whole application functionality can be extended to receive HTTP requests from the client or web browser and respond by substituting postman tool with Axios.
Axios is a JavaScript library that receives HTTP requests from clients. Further knowledge of the Document Object Model (DOM) might be required for a more robust functionality with the Axios.  

##	Screenshots showing postman requests and the output from the API.
* DELETE Request
![DELETE_request](/images/TestFolders/Postman/DELETE_request.PNG?raw=true "DELETE_request Method Screenshot")       

* GET RequestByID
![GET_request](/images/TestFolders/Postman/GET_request.PNG?raw=true "GET_request Method Screenshot")       

* GET RequestAll
![GET_requestAll](/images/TestFolders/Postman/GET_requestAll.PNG?raw=true "GET_requestAll Method Screenshot")       

* POST Request
![POST_request](/images/TestFolders/Postman/POST_request.PNG?raw=true "POST_request Method Screenshot")       

* PUT Request
![PUT_request](/images/TestFolders/Postman/PUT_request.PNG?raw=true "PUT_request Method Screenshot")       

## Screenshots of database to prove that data is being persisted.
* H2 Database
![H2](/images/Databases/H2.PNG?raw=true "H2 Database Screenshot")

* MySQL Database
![MySQL](/images/Databases/MySQL.PNG?raw=true "MySQL Database Screenshot")

##	Screenshot of test results, including coverage report.
* Coverage Report
![coverage](/images/TestFolders/JUnit/coverage.PNG?raw=true "coverage Report Screenshot")   

* JUnit Test
![test_result](/images/TestFolders/JUnit/test_result.PNG?raw=true "test_result Screenshot")   

* createTest method
 
![createTest](/images/TestFolders/CRUD_Functionality/createTest.PNG?raw=true "createTest Method Screenshot")       

* deleteTest method
 
![deleteTest](/images/TestFolders/CRUD_Functionality/deleteTest.PNG?raw=true "deleteTest Method Screenshot")       

* readById method
 
![readById](/images/TestFolders/CRUD_Functionality/readById.PNG?raw=true "readById Method Screenshot")       

* updateTest method
 
![updateTest](/images/TestFolders/CRUD_Functionality/updateTest.PNG?raw=true "updateTest Method Screenshot")       


Here is a link to my JIRA Board https://ajibola-enigbokan.atlassian.net/jira/software/projects/DFEF/boards/2 



