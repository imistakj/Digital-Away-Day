# Deloitte digital Away Day

Digital Away Day is a maven project to generate a day program to accommodate a list of activities.

### Author
Istak Muhammad

### MY Understanding and Design
I have consider the event as one day event where many teams can participate in the Event. 
So i have created threads to run the task.
currently i am running thread one after other. we can also run both Threads parallely in this case output whould be more real time.

### Tech

Deloitte Digital Away Day uses the following technologies:

* [Java] - Code base language (version 1.8)
* [Apache Maven] - Build automation tool (version 3.3.9)
* [junit] - Library for testing (version 4.12)
* [codehaus mojo] - Execute Java app plugin (version 1.6.0)

### Installation

Deloitte Away Day generates a day program based in an input file stored in the directory `src\main\resources\input.txt`.

These are the allowed formats for tasks:

Sprint is used for 15 minutes tasks. Find bellow an input example:

Laser Clay Shooting 60min
Archery 45min
Learning Magic Tricks 40min
Duck Herding 60min
Human Table Football 30min
Buggy Driving 30min
Salsa & Pickles sprint
2-wheeled Segways 45min
Viking Axe Throwing 60min
Enigma Challenge 45min
Giant Puzzle Dinosaurs 30min
Giant Digital Graffiti 60min
Cricket 2020 60min
Wine Tasting sprint
Arduino Bonanza 30min
Digital Tresure Hunt 60min
Enigma Challenge 45min
Monti Carlo or Bust 60min
New Zealand Haka 30min
Time Tracker sprint
Indiano Drizzle 45min

### Execution

Deloitte Away Day requires [Maven](https://maven.apache.org/) v3+ and [Java](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) v1.8+ to run.

Open a terminal and execute these commands to compile and execute:

```sh
$ mvn clean package
$ mvn exec:java
```
You can also download the Project from the github and open in IntelliJ Idea or Eclipse and by running 
same above command project will show output.

Output will be shown in the terminal. Find bellow an output example:

Team : 1

09:00 am : Duck Herding 60
10:00 am : Laser Clay Shooting 60
11:00 am : Viking Axe Throwing 60
12:00 pm : Lunch Break 60
13:00 pm : Cricket 2020 60
14:00 pm : Digital Tresure Hunt 60
15:00 pm : Monti Carlo or Bust 60
16:00 pm : Archery 45
16:45 pm : Staff Motivation  45

Team : 2

09:00 am : Duck Herding 60
10:00 am : Archery 45
10:45 am : Learning Magic Tricks 40
11:25 am : Laser Clay Shooting 60
12:25 pm : Lunch Break 60
13:25 pm : Buggy Driving 30
13:55 pm : Salsa & Pickles sprint min
14:10 pm : 2-wheeled Segways 45
14:55 pm : Viking Axe Throwing 60
15:55 pm : Enigma Challenge 45
16:40 pm : Staff Motivation  30
