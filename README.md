## Rock Paper Scissors with JAVA GUI 
 ### I made this project for fun and learn more about JAVA GUI and its functions.

 ##What is a Java Gui Application?
A Java GUI application is an application that uses a graphical user interface to interact with users and allow them to complete tasks. 

 ##Graphical User Interface (GUI)

one of the great advantages of the Java language is that its extensive class library makes it relatively easy to develop applications with Graphical User Interfaces (GUIs). Today nearly all personal computing applications are GUI-based. GUI programming requires event-driven programming, which means that GUI programs react to events that are generated mostly by the user’s interactions with elements like buttons in the GUI.


Java GUI applications are often used to create interactive applications, such as games, educational programs, and business applications. They are also used to create user interfaces for web applications, such as web browsers, and for mobile applications, such as those used on smartphones and tablets. And I'm gonna show you a game that made with using Java GUI.

An easy Rock-Paper- Scissors Game. Its design is simple and logic of game is simple too. Only using if-else blocks and done!

E.g:

```
private void winningGame(String playerChoice, String computerChoice) {
                String resultText="";
        if (playerChoice.equals(computerChoice)) {
                resultText = "Draw, Try Again!";
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("PAPER")) {
            countC++;
            resultText = "Computer Won!";
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) {
            countP++;
            resultText = "Player won!";
        } else if (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) {
            countP++;
            resultText = "Player won!";
        } else if (playerChoice.equals("SCISSORS") && computerChoice.equals("ROCK")) {
            countC++;
            resultText = "Computer won!";
        } else if (playerChoice.equals("PAPER") && computerChoice.equals("SCISSORS")) {
            countC++;
            resultText = "Computer won!";
        } else if (playerChoice.equals("PAPER") && computerChoice.equals("ROCK")) {
            countP++;
            resultText = "Player won!";
        }
        updateScores();
        result.setText(resultText);
    }

```

Let's Look How we can create designs and a JAVA GUI Application.


The first step in developing a Java GUI application is to design the application’s user interface (UI). This includes creating windows, dialog boxes, menus, buttons, and other UI elements. Additionally, a GUI designer will have to decide how users will interact with the application. This includes deciding where buttons should be located, what menu items should appear in what order, and other similar decisions.

Once the UI is designed, a developer can start writing code in Java. This code will provide additional functionality to the UI elements and allow users to interact with the application. Additionally, code must be written to handle any errors or bugs that may occur while running the application.

Finally, after the application is designed and coded, it must be tested to make sure it works properly. This process usually involves several rounds of testing with testers making sure that everything works as it should.
Once the application has been tested and is ready for release, it must be deployed to the appropriate platform.

Here it is, a Gif for showing that how my game is working and how I made the design:

![Rock Paper Scissors Game 2024-02-15 13-39-18](https://github.com/Gizemexe/RockPaperScissors/assets/108283247/40f96766-bd8c-47ff-a2c7-f56dd4484cac)


##Advantages and Disadvantages of Java Gui Applications

The main advantage of creating a Java GUI application is that it can be easily ported to other computers. Additionally, since Java is open-source, developers can find a wide range of libraries and tools to help them develop their applications. Moreover, since Java is so widely used, it is easier for developers to find support for their applications if needed.

On the other hand, there are some disadvantages to using Java for GUI applications. For one, Java applications tend to be more resource intensive than native applications written in languages like C. Additionally, some features may be more difficult to implement in Java than in a native language like C. Furthermore, the Java language can be complex and difficult to understand for users who don’t have programming experience.