# Development Log
---
## Week Commencing 27th October
### What I did:

 - Decided on an idea for Digital Artefact project:
   
   - Easy Read Checker that checks for 3 things in a user inputted sentence
   - Sentence length, Word length, and Difficult words
     
 - Planned the process using Miro for the Digital Artefact
 - Created inital Java class with 'main()' method
 - Imported Scanner for user inputs

Example of code stated before:

```java
import java.util.Scanner;
public class ezread
{
  public static void main(String[] args)
  {
  }
}
```

- Added welcome message
- Added instructions message
- Set up new Scanner 'scanner'

Example of code:

```java
System.out.println("--- Welcome to the EZRead Checker ---");

System.out.println("Insert a sentence to be checked or type 'quit' to exit");

Scanner scanner = new Scanner(System.in);
```
- Added a 'while' loop to allow users to exit the programme
- Used a boolean 'runProgramme' for while loop
- Added if statement to allow users to exit the programme

Example of code:

```java
boolean runProgramme = true;

while (runProgramme)
{
  String userInput = scanner.nextLine();
  if(userInput.equalsIgnoreCase("quit"))
  {
    runProgramme = false;
    break;
  }
}
```
