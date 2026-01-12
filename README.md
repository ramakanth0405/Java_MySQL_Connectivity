#JAVA_MySQL_Connectivity for BCA Second Years, Bharata Mata College (Autonomous), Thrikkakara
This repository Java_MySQL_Connectivity contains instructions for testing Java MySQL Connectivity using JDBC.
Files to run (in src):
Main.java : Program for testing Java MySQL Connectivity using JDBC
NewMain.java : Program to create a table in user specified MySQL Database and insert two rows.

**MAKE SURE YOU HAVE MySQL INSTALLED IN YOU SYSTEM!**

## INSTRUCTIONS TO SETUP IntelliJ, JDBC with MySQL as backend.
Step 1: Download IntelliJ IDE by Jet Brains
https://www.jetbrains.com/idea/download/?section=windows

Choose .exe (Windows) and click Download

<img width="1645" height="822" alt="image" src="https://github.com/user-attachments/assets/7e8ce7f3-35d6-4e7e-8d26-d1f4a221f11f" />

Run the .exe file.

**NOTE: Do not forget to choose add to PATH while installing!**

Download JDBC
https://dev.mysql.com/downloads/connector/j/

<img width="847" height="653" alt="image" src="https://github.com/user-attachments/assets/34b40f9a-241e-4b65-b418-b0c7030dd0b4" />

Choose Operating System as Platform Independent.

<img width="1646" height="967" alt="JDBC_OS" src="https://github.com/user-attachments/assets/dac3cd64-6929-42df-b0b5-d09dc19bae82" />

Choose the .zip option

<img width="1646" height="967" alt="Arc_4CElC7dIH4" src="https://github.com/user-attachments/assets/cd7f263a-fdac-4b63-81f3-1d58b9dc6e75" />


Extract the file and save it in the Desktop.

Download this repository Java_MySQL_Connectivity.
Extract the zip file.
Open the folder JAVA_MySQL with IntelliJ IDE.

Hit Ctrl+Alt+Shift+S. In the Dialog Box, on the left side click on Modules, then on the + Symbol.
Select option 1 JAR or Directories.
Navigate to the file, the JDBC file mysql-connector-j-9.5.0
Select the file mysql-connector-j-9.5.0.jar.

Before running the program make sure you have entered the database name and MySQL Password.
[Run the program file Main.java in src folder](https://github.com/ramakanth0405/Java_MySQL_Connectivity/blob/main/src/Main.java).
If you get the output as

<img width="456" height="155" alt="image" src="https://github.com/user-attachments/assets/18109456-8dad-4666-a72c-b3d98826c1c9" />

You are now connected to MySQL.
IntelliJ is communicating with MySQL.
Congrats! You now have a working Java with MySQL Backend.

## INSERT
[Check the NewMain.java file](https://github.com/ramakanth0405/Java_MySQL_Connectivity/blob/main/src/NewMain.java)
The program NewMain.java in src folder contains code for creating a table in user specified MySQL database and insert two entries.
Run the file and if you get the output as

<img width="384" height="163" alt="image" src="https://github.com/user-attachments/assets/527d7ff8-0401-4237-ab72-740f9ff8f18b" />

You have created a table >users in the database that you have specified and two entries have been inserted.

You can also verify the table created in MySQL Client.
<img width="493" height="194" alt="image" src="https://github.com/user-attachments/assets/d78efe6f-fa35-49e2-8da1-a161fb3d2e49" />

**NOTE: You must only run this program once as running it the second time causes errors, since the data will be duplicated.**
