# Hotel Reservation System (CCP)

## Project Overview
This project is a Java implementation of a Hotel Reservation System based on a provided UML Structural Design Model. It manages hotels, rooms, guests, and reservations while adhering to strict **Object-Oriented Design Principles**.

Key technical features include:
* **Clean Code Practices:** Meaningful naming, modular design, and focused methods.
* **Defensive Programming:** Input validation (null checks, date validation) to prevent illegal object states.
* **Test-Driven Development:** Includes Unit Tests for core logic.

## Project Structure
The project follows a standard Java source structure:
* `src/` - Contains all source code and domain classes (Hotel, Room, Reservation, etc.).
* `src/Main.java` - The entry point demonstrating the system workflow.
* `src/HotelTest.java` - JUnit test cases.

## How to Build and Run
This project is designed to run in **VS Code** without complex build tools like Maven or Gradle.

### Prerequisites
* Java Development Kit (JDK) installed.
* Visual Studio Code with the "Extension Pack for Java".

### Running the Application
1. Open the project folder in VS Code.
2. Navigate to `src/Main.java`.
3. Click the **Run** button (Triangle icon) or press `F5`.
4. The console will display the interaction between the HotelChain, Guests, and Reservations.

## How to Run Tests
Unit tests are located in `src/HotelTest.java`.
1. Open `src/HotelTest.java`.
2. VS Code should detect the tests. Click the **Run Test** button (beaker icon) next to the class name or individual methods.
3. Alternatively, right-click the file and select **Run Java**.

## Use Case Demonstration
The `Main.java` file demonstrates the following scenarios:
1. Initializing a `HotelChain` and adding `Hotels`.
2. Creating `Rooms` with specific `RoomTypes`.
3. Registering a `Guest`.
4. Successfully creating a `Reservation` with validation checks.
