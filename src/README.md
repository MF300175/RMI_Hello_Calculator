
# RMI Calculator

## Description
This project is a distributed calculator implemented in Java, using Remote Method Invocation (RMI) technology. It allows mathematical operations to be performed on a remote server while being requested from a client at a different location.

## How to Run
### Requirements
- Java JDK 11 or higher

### Instructions
1. Clone the repository.
2. Navigate to the project's root directory.

#### Using the RmiCalculator.bat File
For an easy and quick execution of the project, use the `src\RmiCalculator.bat` file, which automates the process of compiling and running both the server and the client.

To do this, follow these steps:
- On Windows, open the Command Prompt.
- Navigate to the directory src\RmiCalculator.bat.
- Execute the command `RmiCalculator.bat`.

This script will perform the following actions:
- Compile the `Client.java`, `Server.java`, and `HelloCalc.java` files.
- Start the `rmiregistry`.
- Run the server and the client in separate terminal windows.

### Manually
If you prefer to execute manually, follow these steps:
1. Navigate to the `src` directory and compile the Java files.
2. Start the `rmiregistry` from the `src` directory.
3. Run the server and then the client.

## Test Cases
Below are some basic test cases to verify the correct functioning of the RMI calculator application:

### 1. Valid Addition
- **Input:** `3+4`
- **Expected Output:** `Result = 7.0`

### 2. Valid Subtraction
- **Input:** `10-5`
- **Expected Output:** `Result = 5.0`

### 3. Valid Multiplication
- **Input:** `6*7`
- **Expected Output:** `Result = 42.0`

### 4. Valid Division
- **Input:** `8/2`
- **Expected Output:** `Result = 4.0`

### 5. Division by Zero
- **Input:** `10/0`
- **Expected Output:** `Error: Division by zero.`

### 6. Invalid Numeric Format
- **Input:** `two+3`
- **Expected Output:** `Number format error:` followed by the error details.

## Test Cases

Below are some basic test cases to verify the correct functioning of the RMI calculator application, including the handling of floating point numbers, invalid operators, and conversion of commas to dots:

### 1. Valid Floating Point Addition
- **Input:** `3.5+2.5`
- **Expected Output:** `Result = 6.0`

### 2. Valid Floating Point Division
- **Input:** `7.5/2.5`
- **Expected Output:** `Result = 3.0`

### 3. Invalid Operator
- **Input:** `5^2`
- **Expected Output:** `Invalid operator: '^'`

### 4. Comma to Dot Conversion
- **Input:** `2,5+3,5`
- **Expected Output:** `Result = 6.0`
   - `Note: Input with commas (`2,5+3,5`) is automatically converted to use dots (`2.5+3.5`).`

### 5. Division by Zero
- **Input:** `10/0`
- **Expected Output:** `Error: Division by zero.`

### 6. Invalid Numeric Format
- **Input:** `two+3`
- **Expected Output:** `Number format error: followed by the error details.`

### 7. Incomplete Input
- **Input:** `5+`
- **Expected Output:** `Input error: please ensure to enter a valid operation.`

### 8. Exiting the Program
- **Input:** `s`
- **Expected Action:** `The program should terminate without further output.`

### 9. Other Test Cases
- **Input:** `5.5+4.5`
- **Expected Output:** `Result = 10.0`
- **Input:** `3+4`
- **Expected Output:** `Result = 7.0`

### 8. Incomplete Input
- **Input:** `5+`
- **Expected Output:** `Input error: please ensure to enter a valid operation.`

### 9. Decimal Numbers
- **Input:** `5.5+4.5`
- **Expected Output:** `Result = 10.0`

### 10. Exiting the Program
- **Input:** `s`
- **Expected Action:** `The program should terminate without further output.`

## License
`Distributed under the MIT License. See LICENSE for more information.`

## Contact
Name - Mauricio Fernandes Leite
Project Link: [https://github.com/MF300175/RMI_Calculator](https://github.com/MF300175/RMI_Calculator)
