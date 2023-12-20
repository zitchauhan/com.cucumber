package utility;

public class Reusing_function {

}

/*
1. Abstraction:
Page Object Model (POM): OOP concepts help in implementing the POM, where each web page is represented
as a separate class, providing a clear abstraction of web elements and their related actions.
Abstract Classes or Interfaces: These can be used to define common behaviors 
or utilities that are shared across different pages or test classes.
2. Encapsulation:
Access Modifiers: Use of access modifiers like public, private, and protected to control access to class members, methods, or variables in order to hide complexity and expose only necessary details.
3. Inheritance:
Extending Base Classes: Creating base classes for Selenium setup, common methods, or configurations that can be inherited by test classes or page objects to avoid redundant code.
Framework Level Customizations: Building on top of existing Selenium classes or frameworks using inheritance to extend functionalities.
4. Polymorphism:
Method Overriding: Implementing overridden methods in Page Object classes to define specific behaviors for elements or actions within different pages.
Run-time Polymorphism: Treating child classes as their parent type, allowing flexibility and reusability in test code.
5. Modularity:
Separation of Concerns: Dividing the framework into smaller, manageable modules or layers like test scripts, page objects, utilities, and configurations to achieve better maintainability.
6. Reusable Components:
Creating Utility Classes: Implementing reusable utility methods for actions like handling waits, handling alerts, working with test data, etc.
Custom Libraries or Wrappers: Building custom libraries or wrappers around Selenium methods to encapsulate complex operations for ease of use and reusability.
7. Dependency Injection:
Using Dependency Injection Frameworks: Employing frameworks like Spring or Guice for managing dependencies and injecting components or WebDriver instances into test classes or page objects.
By leveraging these OOP concepts, a Selenium framework can become more robust, scalable, and easier to maintain, enabling efficient automation testing practices.

*/