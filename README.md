# How to run the project
1. Install docker using Docker website - https://www.docker.com/get-started/
2. Run the docker application, more specifically docker daemon. We want to build a docker image and run a docker container and in order to do that docker daemon must be running. Running docker desktop application is one way to run docker daemon
3. Navigate to the root folder of the project.
4. Run `docker build -t protek-app:latest .`
5. Run `docker run protek-app:latest` - This command should run all the unit tests in the project
6. To clean up the container, run `docker ps -a` and find the container id belonging to `protek-app:latest`
7. Run `docker rm {CONTAINER_ID found in step 6}`

----
# Test 1

### Challenge 1
(The Person, Student, Employee, Faculty, and Staff classes) Design a
class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name,
address, phone number, and email address. A student has a class status (freshman,
sophomore, junior, or senior). Define the status as a constant. An employee has an
office, salary, and date hired. Define a class named MyDate that contains the fields
year, month, and day. A faculty member has office hours and a rank. A staff
member has a title. Override the toString method in each class to display the
class name and the person’s name.


### Challenge 2 - Employee and ProductionWorker Classes
Design a class named Employee. The class should keep the following information in fields:
• Employee name
• Employee number in the format XXX–L, where each X is a digit within the range 0–9
and the L is a letter within the range A–M.
• Hire date
Write one or more constructors and the appropriate accessor and mutator methods for the class.
Next, write a class named ProductionWorker that extends the Employee class. The
ProductionWorker class should have fields to hold the following information:
• Shift (an integer)
• Hourly pay rate (a double)
The workday is divided into two shifts: day and night. The shift field will be an integer value
representing the shift that the employee works. The day shift is shift 1 and the night shift is
shift 2. Write one or more constructors and the appropriate accessor and mutator methods for
the class. Demonstrate the classes by writing a program that uses a ProductionWorker object