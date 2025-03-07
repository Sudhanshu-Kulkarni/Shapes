## Shapes

This repository provides a **menu-driven program** to calculate the **area, perimeter, and volume** of various geometric shapes. The program runs via a **command-line interface** and allows users to select shapes and input dimensions.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [How to Run](#how-to-run)
- [Example Usage](#example-usage)
- [Requirements](#requirements)
- [Contributing](#contributing)
- [License](#license)

## Overview
The program allows users to interact with different geometric shapes and perform calculations for area, perimeter, and volume (for 3D shapes). 

The project consists of the following classes:
- **`Shape`** *(Abstract Class)*: Defines the structure for all shapes.
- **`Volume`** *(Interface)*: Implements volume calculation for 3D shapes.
- **`Circle`**, **`Rectangle`**, **`Square`**, **`Sphere`**, **`Cylinder`**, **`EquilateralPyramid`**: Implementations for different shapes.
- **`Main`**: Provides the menu-driven interface for user interaction.

## Features
- **Supports multiple shapes**: Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid.
- **Menu-driven interface**: Allows users to select a shape and input dimensions.
- **Abstract class `Shape`**: Implements `calculateArea()` and `calculatePerimeter()` methods.
- **Interface `Volume`**: Defines `calculateVolume()` for 3D shapes.

## Classes and Methods

### **Shape Class** (Abstract)
Defines the blueprint for all shapes.

#### **Methods**
- `public Shape(String shapeName)`: Constructor to initialize shape name.
- `abstract public double calculateArea()`: Computes the shape's area.
- `abstract public double calculatePerimeter()`: Computes the shape's perimeter.

### **Volume Interface**
Defines the volume calculation for 3D shapes.

#### **Methods**
- `double calculateVolume()`: Computes volume (implemented by 3D shape classes).

### **Main Class**
Provides a **menu-driven** system for user interaction.

#### **Workflow**
1. Displays a menu with different shape options.
2. Accepts user input and performs the corresponding calculations.
3. Continues execution until the user exits.

## How to Run
1. **Compile all Java files:**
   ```sh
   javac *.java
   ```
2. **Run the main program:**
   ```sh
   java Main
   ```
