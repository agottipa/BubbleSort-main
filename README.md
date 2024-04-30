# Bubble Sort Algorithm

This repository contains a Java implementation of the FileSorter application in phones using Bubble Sort algorithm, along with a test suite and a benchmark.

## Setup and Installation

1. **Clone the Repository**: Clone this repository to your local machine using Git:

git clone https://github.com/your_username/your_repository.git


2. **Install Java Development Kit (JDK)**: Make sure you have Java JDK installed on your system. You can download and install it from the official Oracle website: [Java SE Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

3.**Install Eclipse**:Make sure you have eclipse in your system.You can download from the official website:(https://www.eclipse.org/)

4. **Install JUnit 5**: Download the JUnit 5 JAR files from the official website: [JUnit 5 Downloads](https://junit.org/junit5/docs/current/user-guide/#downloads)

## Running Tests in Eclipse

To run the test suite in Eclipse, follow these steps:

1. **Open the Project in Eclipse**: Open the cloned repository folder in Eclipse IDE.

3. **Configure Test Runner**: Open the test class (`FileSorterTest.java`) and click on the green arrow button to run all the testcases.You can also put breakpoints and execute each test case.

## Execution Instructions

###FileSorter Application based on size or name

To execute the FileSorter application which is internally using the bubblesort algorithm, follow these steps:

1. **Compile Java Files and Running the code**: Compile the `FileSorter.java`,`FileNameComparator.java`,`FileSizeComparator.java` files using the `javac` command.It can be writing the code in eclipse and saving the code.Ecplise auto compiles the code. While running the `FileSorter.java` file provide the "size" or "name" arguments in the arguments tab then click on Apply and click on Run(green arrow).It will sort all the files present in the specified directory based on the option chosen i.e.,size or name.

2. **Run the Benchmark**: Run the benchmark code using `FileSorterBenchmark.java`. It will give all the time taken for sorting the files.
