# Team Project Repo 

nguyensjsu/sp19-202-spattern-marshals

## Team Name
Spattern Marshals

## Team Members
* [Anushree menon](https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/Anushreemenon)
* [Karthika Arumugam](https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/KarthikaArumugam) 
* [Priya Yadav](https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/PriyaYadav)
* [Priya Khadke](https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/PriyaKhadke)
* [SaiPrithipa RamMohan](https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/saiprithipa)

## Project Name
Victory Warriors

## Game Teaser
https://www.youtube.com/watch?v=-ql2Ngik6BY&feature=youtu.be

## Project Description

Our game Victory Warriors is based on world famous TV series Game of Thrones. In our game, our Warrior from the House Stark of Winterfell have to fight their enemies to attain the treasure and win the Thrones to save the people of westeros. The Warrior will gain Score by killing the enemies and colecting coins.

## Requirements for Game play
Arya Stark, our Player has to move forward in road by killing all enemies and also she has to collect coins along the way to score enough points to attain the treasure. Her health bar will get reduced evrytime got hit by enemy, she can collect Lucky charm  to increase her  health one level. She keeps fighting with  all the enemies  until completes the game progress with enough score to attain to treasure to be seen on her path. By getting the treasure, our player can win the Thrones.
 
## Use Case

https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/UML%20Diagram/Victory_UseCase%20Specification%20Report.docx

![alt text](https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/UML%20Diagram/UseCase_Diagram.JPG)


## Activity Diagram

## Design
Our Game is built using Green foot engine, We designed our own game and buidd it from scratch. We identified and Implemented below Design patterns.

Composite - For composing and Structuring  all objects in World at proper position.

Command   - For implementing Start and Quit control for game.

Observer  - To notify player activities to aprropriate component like ScoreBoard, HeathBar, Gameover Screen and Level Complete.

Decorator - 

Mediator  - 

Prototype - To clone objects like Enemies, Coins, Lucky charm and moving clouds in the world instead of creating from scratch.

State     -

## Mockups
https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/master/mockups

## UML Diagram
<h4> Project Class Diagram </h4>
<h4> System Sequence Diagram </h5>

### Individual Contributions
<h4> Anushree Menon </h4>

<h4> Karthika Arumugam </h4>

Actively suggested multiple Ideas for the game selection, Design, Implemention phases. 

Helped on coming up with requirements discussion and design and user story creation for the game.

Implemented 2 feature stories - Background component for the game, Sound effects for the game.

Implemented the logic of Scrolling background and randomly moving cloud.

Implemented 3 design patterns 

1. Composite pattern -to display and structure the background of the game.
2. Command Pattern - For the Start and Quit buttons of the game.
3. Prototype - For cloning  objects of moving clouds in the world instead of creating from scratch.

Helped in intial integration code from other modules, testing and fixing issues.

As a champion of XP value "Courage" , I encouraged my team to start a game building from a Scratch and also strongly encouraged to implement a game with swording theme insteas of usual bulleting type of game.

<h4> Priya Khadke </h4>

# Week 1 Scrum Report(4/7-4/13)

### Finished Last Week 
- Task1: Researched on interactive game ideas with the team.
- Task2: Updated generic team task on the sprint task sheet.
- Task3: Initiated the droidfoot mobile greenfoot prototype.
- Task4: Sample treasure show no show using state pattern implemented
Apart from above tasks shared, the team also worked on selecting the XP values and setting up the initial sprint task sheet on drive.

### Planned Next Week 
- Task1: Plan to finalise the game idea and discuss the game rules with the team
- Task2: Setup the sprint task sheet and share the google drive link for Readme.md file.
- Task3: Plan to complete the droidfoot feasibility for greenfoot scenarios.

### Problems
[Low Priority issue] The burndown chart on drive was not showing up correctly due to version issue on drive.

### Time Spend

- Task1: 3 hrs
- Task2: 2 hrs
- Task3: 5 hrs

XP Value Respect :
I selected XP value "Respect". And as an advocate of this value, I tried encouraging everyone to participate and ensured everyone is heard , so that no one is left out and are equally valued.


# Week 2 Scrum Report(4/14-4/20)

### Finished Last Week 
- Task1: Completed user task - Player Should see treasure.
- Task2: Completed user task player should be able to take the treasure 
- Task3: Completed user task Level Complete message is displayed

Using state pattern, the treasure component was implemented using three states - SHOW,NOSHOW and TAKEN.However, as this component depended on player actor win - using dummy player.The state transition was done using 3 methods.

### Planned Next Week 
- Task1: Player should see the lucky power on the game screen
- Task2: Player should be able to move near lucky power
- Task3: Player should be able to take the lucky coin

### Problems
During the greenfoot to droidfoot feasibility, the android SDK installation had issues.
This is was resolved by installating the dependent files.


### Time Spend

- Task1: 1 hour
- Task2: 1 hour
- Task3: 2 hours

# Week 3 Scrum Report(4/21-4/27)

### Finished Last Week 
- Task1: Completed user task - Player Should see lucky power
- Task2: Completed user task player should be able to take the lucky power 
- Task3: Once the player touches the power, the player should gain more points and the same should be added to the score
- Task4: The score should be updated accordingly.
- Task5:The player should be able to see the lucky charm while playing.
- Task6:The player should be able to move near the lucky charm and touch them.

### Planned Next Week 
- Task1: Once the player touches the lucky charm, the player should gain extra lifeline 
the same should be added to the healthbar
-Task2: Player should be able to see negative powers
-Task3: Player should be able to avoid negative power
-Task4: Scoreboard should be updated accordingly.

### Problems
[Low prioroty issue]

### Time Spend
- Task1: 1 hour
- Task2: 2 hours
- Task3: 2 hours
- Task4: 2 hours
- Task5: 1 hour
- Task6: 2 hours

# Week 4 Scrum Report(4/28-5/3)

### Finished Last Week 
- Task 1 : Fixed issues with coins rotation on screen and implemented the prototype pattern.
- Task 2 : Final version of Sprint task sheet completed for burndown chart
- Task3 : Class diagram for individual completed.

### Planned Next Week 
NA

### Problems
- As the actor was not able to dogde the negative powers , the negative powers were removed as we needed actor to finish the level to proceed game finish state.

### Key Contribution
### 1 Treasure Component
### 2 Lucky Powers ( Coins and Charm)


###Pattern
- State Pattern for treasure appearnce after the player wins.
Treasure Context class - This class will set the context for state transition and call appropriate states method based on current state.
- TreasureState (super class ) has 3 states classes (SHOW,NO SHOW and TAKEN).

- Observer
- Each of the lucky power is sending the change  of state with each event of gains lucky power or lucky charm. the ScoreBoard class is then updated accordingly.

- Prototype
- Each coin/charm are cloned using clonable interface of Greenfoot.The master object helped create clone of needed objects

<h4> Priya Yadav </h4>

<h4> Sai Prithipa RamMohan</h4>
Detailed journal is present in 
https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/journal/SaiPrithipa_journal.md
## XP value : FEEDBACK
-> Made sure that I fulfil my XP value as a person who gives feedback. Provided inputs to the team which helped in making effective decisions. (One such feedback was, for all of us to work on a single level on different components rather than different levels. In this way, we were able to finish the game faster and the game looked consistent.)
-> Conducted Sprint Planning meeting. 
-> Played the scrum master role. Took care of the standups (used standbot to track standup updates) -> Created User Stories for the team 
-> Set up the Kanban board and maintained the scrum board with all results consolidated.
-> Implemented the player, healthbar and game progress component in the game. 
-> Integrated all the components and provided the final demoable version of the game. 
-> Created the ad video for our team. 
-> Created sequence diagram for the game flow. 
-> Added class diagrams for the player and related components
## Patterns Implemented
1. Observer Pattern
2. State Pattern
3. Mediator Pattern
4. Decorator Pattern
Detailed design notes of my component is present in 
https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/docs/DesignNotes_SaiPrithipa.docx




## Project Progress
[Sprint Task Sheet](https://docs.google.com/spreadsheets/d/1E_WBxX0DL7A3hkIpV_9Wy9G-dfBLtEWVcwYfIIkOHEw/edit?ts=5cb5630d#gid=1661244596)


### Burndown Map

### Project Dashboard


