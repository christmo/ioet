# Exercise
IOET Exercise, Software for payment work hourly for ACME

The company ACME offers their employees the flexibility to work the hours they want. They will pay for the hours worked based on the day of the week and time of day, according to the following table:

# Monday - Friday
- 00:01 - 09:00 25 USD
- 09:01 - 18:00 15 USD
- 18:01 - 00:00 20 USD

# Saturday and Sunday
- 00:01 - 09:00 30 USD
- 09:01 - 18:00 20 USD
- 18:01 - 00:00 25 USD

The goal of this exercise is to calculate the total that the company has to pay an employee, based on the hours they worked and the times during which they worked. The following abbreviations will be used for entering data:

> - MO: Monday
> - TU: Tuesday
> - WE: Wednesday
> - TH: Thursday
> - FR: Friday
> - SA: Saturday
> - SU: Sunday

Input: the name of an employee and the schedule they worked, indicating the time and hours. This should be a .txt file with at least five sets of data. You can include the data from our two examples below.

Output: indicate how much the employee has to be paid

For example:

#### Case 1:
##### INPUT
RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00
##### OUTPUT:
The amount to pay RENE is: 215 USD

#### Case 2:
##### INPUT
ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
##### OUTPUT:
The amount to pay ASTRID is: 85 USD

---
# Dependencies
This project was tested with:
1. Java 8
2. Apache Maven 3.5.2

---
# Compilation
```bash
cd ioet/acme
mvn clean install
```

# Execution

To run this program use the basic command of java, filePath is optional if you do not load any file, it will be executes
by default. 
```bash
java -jar ioet/acme/target/acme-1.0-SNAPSHOT.jar [filePath]
```

# Default Execution
Is loaded a default file test, you can run it with this command:
```bash
> java -jar ioet/acme/target/acme-1.0-SNAPSHOT.jar
|***********************************************************************************|
|                      ___       ______ .___  ___.  _______                         |
|                     /   \     /      ||   \/   | |   ____|                        |
|                    /  ^  \   |  ,----'|  \  /  | |  |__                           |
|                   /  /_\  \  |  |     |  |\/|  | |   __|                          |
|                  /  _____  \ |  `----.|  |  |  | |  |____                         |
|                 /__/     \__\ \______||__|  |__| |_______|                        |
|                                                                                   |
|***********************************************************************************|
|
| File: /Users/christmo/IdeaProjects/ioet/acme/target/classes/test-file.txt
|
| Case 1:
| INPUT
| RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00
|
| OUTPUT:
| The amount to pay RENE is: 215 USD
|
| Case 2:
| INPUT
| ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00
|
| OUTPUT:
| The amount to pay ASTRID is: 85 USD
|
```
