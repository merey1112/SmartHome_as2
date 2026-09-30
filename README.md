# Smart Home Ecosystem (Assignment 2)

## Overview
This project implements a Smart Home System using Creational Design Patterns:
- **Factory Method**: For single-product family creation with specific business logic (`LightFactory`).
- **Abstract Factory**: For multi-product ecosystems (`TuyaFactory`, `HomeKitFactory`, `GoogleFactory`, `MatterFactory`).

## Supported Ecosystems
- Tuya
- Apple HomeKit
- Google Home
- Matter (Extended family without business logic modification)

## How to Run Tests
Run `SmartHomeTest.java` using JUnit 5.