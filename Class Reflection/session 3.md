# Class Reflection: Session 3

## Executive Summary
This session focused on configuring an enterprise-grade Java development environment, setting up Apache Maven for build automation and dependency management, and implementing an object-oriented geometry program in Java featuring custom shape rendering.

---

## 1. Development Environment Setup & Installation Workflow

To establish a functional Java development pipeline, several system verification, installation, and environment configuration steps were performed.

###  JDK Verification & Installation
. **Verification:** Executed terminal verification to check for existing Java Runtime/Development Kit instances:
   ```bash
   java -version
   javac -version

```

## Installation:

Downloaded and installed the modern Java Development Kit (JDK 21 LTS) installer tailored for the host operating system.

## Environment Variable Configuration: 
Configured system environment variables to enable system-wide CLI access:

Set JAVA_HOME environment variable pointing to the JDK installation path (e.g., C:\Program Files\Java\jdk-21).


## Apache Maven Installation & Verification
1. Binary Acquisition: Downloaded the Apache Maven binary zip archive from the official distribution site and extracted it into local system storage.

2. Path Configuration:

- Created the MAVEN_HOME (or M2_HOME) system variable pointing to the extracted Maven directory.
- Added %MAVEN_HOME%\bin to the system PATH.

3. Execution Test:
Confirmed successful installation and JDK link integration:

mvn -version

##  Software Architecture: Java Shape Program
A custom Java class was implemented to model and output a 2D geometric shape (Rectangle) using object-oriented principles.

## Conclusion & Key Takeaways
Successfully transitioning from raw source execution to a structured build system (Maven) ensures scalable project management and implementing basic geometric shape programme.
