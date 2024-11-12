# Multi threading
# Description
This Java program demonstrates basic multithreading by creating multiple threads, each of which outputs its ID when running. The program defines a Multi class that extends Thread and overrides the run() method to print the thread's ID. In the MultiThread_1 class, the main method starts five instances of Multi, each running in its own thread.

# Files
MultiThread_1.java: The main Java file containing the Multi and MultiThread_1 classes.

# Code Explanation
Multi: Extends the Thread class and overrides the run() method. It prints the ID of the currently running thread.
MultiThread_1: Contains the main method that starts five threads by creating instances of Multi and calling start() on each.

# Example Output
Thread 11 is running
Thread 12 is running
Thread 13 is running
Thread 14 is running
Thread 15 is running
