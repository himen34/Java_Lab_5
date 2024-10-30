### Lab Work 5:  Inheritance and Polymorphism

#### Overview
The sixth lab work implements a coffee management system that enables users to manage various types of coffee, including whole bean, ground, and instant varieties.

The lab work is done for Variant 24. 

#### Features
- Defines different types of coffee products, such as **WholeBeanCoffee**, **GroundCoffee**, and **InstantCoffee**. 
- Provides methods to:
  - Load coffee products into a truck based on volume capacity.
  - Sort coffee products by their price-to-weight ratio.
  - Find coffee products within a specified quality range.
- Includes exception handling for invalid data entry (e.g., negative weight, price, invalid grind size, etc.).

#### Usage
1. Clone the repository.
2. Navigate to the project directory.
3. Compile and run the `CoffeeTruckApplication` file.
4. Change or create various coffee products by specifying attributes such as weight, price, quality, brand, and specific characteristics.
6. Save, recompile and run the `CoffeeTruckApplication` file.
7. Interact with the system by viewing all loaded coffee, sorting by price-to-weight ratio, or finding coffee within a particular quality range.

#### Class Hierarchy
The project features a well-defined class hierarchy for representing and managing coffee products:
- **Coffee**: The abstract base class with common attributes and methods.
  - **WholeBeanCoffee**: Extends `Coffee` with an attribute for country of origin.
  - **GroundCoffee**: Extends `Coffee`, adding an attribute for grind size with validation against predefined options.
  - **InstantCoffee**: Extends `Coffee` with an attribute for the type of packaging (e.g., can, packet).

- **Truck**: Manages an array of `Coffee` objects based on a defined volume capacity, allowing operations like loading coffee, sorting products, and finding coffee within a specified quality range.

### 1. Clone the repository:

```bash
git clone https://github.com/himen34/Java_Lab_5.git
cd Java_Lab_5
```

### 2. Build the project:

```bash
mvn package
```

### 3. Run the project:

```bash
mvn clean compile exec:java
```

## Requirements

- Java 17 or higher
- Maven 3.6.0 or higher


