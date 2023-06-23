# Juhosi-Assignment
Steps to run the project on the local system
1. Download the project .zip folder and extract it
2. Open the project folder in Eclipse or in any IDE
3. In the project file named UserDAO.java and change the Mysql username and password according to your system
4. Then create the database named Juhosi
5. After that create the following tables
    CREATE TABLE user(user varchar(25) not null, password varchar(10) not null);
   CREATE TABLE customer1 (
    order_date DATE,
    company VARCHAR(255),
    owner VARCHAR(255),
    item VARCHAR(255),
    quantity INT,
    weight DECIMAL(10,2),
    request_for_shipment VARCHAR(255),
    tracking_id VARCHAR(255),
    box_count INT,
    specialization VARCHAR(255),
    checklist_quantity VARCHAR(255)

);

 CREATE TABLE customer2 (
    order_date DATE,
    company VARCHAR(255),
    owner VARCHAR(255),
    item VARCHAR(255),
    quantity INT,
    weight DECIMAL(10,2),
    request_for_shipment VARCHAR(255),
    tracking_id VARCHAR(255),
    box_count INT,
    specialization VARCHAR(255),
    checklist_quantity VARCHAR(255)
);

Finally, Run the project on Tomcat server
