# Update to Java 17

5 steps to update (details below):

1. Netbeans -> 12.5 
2. Java -> 17 
3. Windows Edit System Environment Variables (JAVA_HOME, path)
4. pom.xml (already complete - verify our current versions)
5. IDE project settings -> set compile to JDK 17

----

### 1) Upgrade Netbeans

- Uninstall 12.4 (program available in C:\Program Files\NetBeans-12.4)
- Download and install 12.5

### 2) Upgrade Java

Open Powershell as Admin and run this command to install Java 17. Must use --exact or -e.
(winget works with install / upgrade / uninstall).

```Powershell
winget install Microsoft.OpenJDK.17 -e
```

Verify location on your machine, e.g., C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot

### 3) Edit System Environment Variables (JAVA_HOME and path)

Windows path must have exactly one JDK entry.

- Hit Win key, Edit System Environment Variables. 
- Verify/add JAVA_HOME (mine is C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot)
- Verify path includes exactly one Java entry - either %JAVA_HOME%\bin OR C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot\bin and no other JDK or Java entries. 

### 4) pom.xml  

These have been updated. Find these in pom.xml:

- java.version = 17
- junit = 5.8.1
- maven - see different versions by plugin

### 5) NetBeans Project Compiler

Open NetBeans. Right-click our Project / Properties  / Build / Compile / Java Platform

- click "Manage Java Platforms", click "Add Platform", Type = Java Std Edition / Next 
- Locate your new JDK 17 (mine is in  C:\Program Files\Microsoft\jdk-17.0.0.35-hotspot), click Next. It will fill in the information. Click Finish, Close.
- Back in the Java Platform dropdown, Select JDK 17. 
- Clean and build project to verify everything compiles. Try running ZooApp to verify.

