This repository Java_MySQL_Connectivity contains instructions for testing Java MySQL Connectivity using JDBC.
Files to run (in src):
Main.java : Program for testing Java MySQL Connectivity using JDBC
NewMain.java : Program to create a table in user specified MySQL Database and insert two rows.


INSTRUCTIONS TO SETUP IntelliJ, JDBC with MySQL as backend.
Step 1: Download IntelliJ IDE by Jet Brains
https://www.jetbrains.com/idea/download/?section=windows
Choose .exe (Windows) and click Download
<img width="1645" height="822" alt="image" src="https://github.com/user-attachments/assets/7e8ce7f3-35d6-4e7e-8d26-d1f4a221f11f" />
Run the .exe file.

NOTE: Do not forget to choose add to PATH while installing!

Download JDBC
https://dev.mysql.com/downloads/connector/j/
<img width="847" height="653" alt="image" src="https://github.com/user-attachments/assets/34b40f9a-241e-4b65-b418-b0c7030dd0b4" />
Choose Operating System as Platform Independent.
Extract the file and save it in the Desktop.

Download this repository Java_MySQL_Connectivity.
Extract the zip file.
Open the folder JAVA_MySQL with IntelliJ IDE.

Hit Ctrl+Alt+Shift+S. In the Dialog Box, on the left side click on Modules, then on the + Symbol.
Select option 1 JAR or Directories.
Navigate to the file, the JDBC file mysql-connector-j-9.5.0
Select the file mysql-connector-j-9.5.0.jar.

Before running the program make sure you have entered the database name and MySQL Password.
Run the program in Main file.
If you get the output as
<img width="456" height="155" alt="image" src="https://github.com/user-attachments/assets/18109456-8dad-4666-a72c-b3d98826c1c9" />

You are now connected to MySQL.
IntelliJ is communicating with MySQL.
Congrats! You now have a working Java with MySQL Backend.

MAKE SURE YOU HAVE MySQL INSTALLED IN YOU SYSTEM!
