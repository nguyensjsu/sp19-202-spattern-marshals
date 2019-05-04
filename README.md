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

![alt text](https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/UML%20Diagram/Victory_Warriors_ActivityDiagram.jpg)

### Design
Our Game is built using Green foot engine, We designed our own game and buidd it from scratch. We identified and Implemented below 

### Design patterns.

**Composite** - For composing and Structuring  all objects in World at proper position.

**Command**   - For implementing Start and Quit control for game.

**Observer**  - To notify player activities to aprropriate component like ScoreBoard, HeathBar, Gameover Screen, Level Complete and lucky power

**Decorator** - Decorator pattern enables decorating any output depending on specified condition

**Mediator**  - Mediator patterns helps in loose coupling between object who needs common functionality. 

**Prototype** - To clone objects like Enemies, Coins, Lucky charm and moving clouds in the world instead of creating from scratch.

**State**     - State pattern is used to maintain different state of the player object and treasure display

## Mockups
https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/master/mockups

## UML Diagram
<h4> Project Class Diagram </h4>

![alt text](https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/UML%20Diagram/Victory_Warrior_Class_Diagram_Final.jpg?raw=true)

<h4> System Sequence Diagram </h5>

![alt text](https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/UML%20Diagram/Victory_Warriors_Sequence_Diagram.jpg)

### Individual Contributions
<h4> Anushree Menon </h4>

Looked for various games available on the internet and suggested few  games for brainstorming. Finalized on the "Victory Warriors" which is based on the  concepts of famous series Game of Thrones. Assisted with user-stories and discussed the possible design patterns that can be applied to these scenarios. Helped on updating the Sprint task sheet and confirmed the mock-up screens.
 
 Implemented "Observer Design Pattern" to 2 feature stories - Scoreboard and Game Over Component
 
 I selected "**Simplicity**" and as a part of the XP value and made certain suggestions:
 1. Keeping the requirement simple, clear and short and game play rules (such as scoring, rewards, player lives) so that user enjoys the     game and doesn't require lot of thinking. 
 2. Added  "design patterns" later after the code structure was finalized. 
 3. Start with  basic user stories and keep the implementation simple so that we can have a basic working prototype. 
 4. Use Green Foot for  implementation and start with small portion of the game to get some idea about how it works.

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

Created Use case Specification report for th game.

Created Use Case overview Diagram for the report.

As a champion of XP value "**Courage**" , I encouraged my team to start a game building from a Scratch and also strongly encouraged to implement a game with swording theme insteas of usual bulleting type of game.

<h4> Priya Khadke </h4>

XP Value Respect :
I selected XP value "Respect". And as an advocate of this value, I tried encouraging everyone to participate and ensured everyone is heard , so that no one is left out and are equally valued.

 Key Contribution
 
 
 1 Treasure Component
 2 Lucky Powers Coins 
 3 Lucky Power Charm

I completed the greenfoot to droidfoot feasibilty for mobile app android. 
Implemented below 3 design pattern
1 State Pattern for treasure appearnce after the player wins.
Treasure Context class - This class will set the context for state transition and call appropriate states method based on current state.
TreasureState (super class ) has 3 states classes (SHOW,NO SHOW and TAKEN).
2. Observer
- Each of the lucky power is sending the change  of state with each event of gains lucky power or lucky charm. the ScoreBoard class is then updated accordingly.
3. Prototype
- Each coin/charm are cloned using clonable interface of Greenfoot.The master object helped create clone of needed objects

<h4> Priya Yadav </h4>

Detailed journal is present in https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/journal/PriyaYadav-journal.md

#### XP value - Communication

As an advocate of XP value "Communication" , I encouraged my team to communicate with every team member about the ideas, blockers and the way of implementation. In this way communication helps to keep everyone aware about every other team member's work. It helped in smooth integration of components.

#### Component implemented - Enemy Actor - RivalX

- Actively involved in the fianlising the game ideas and rules.

- Implemented feature stories - Displaying enemies/hurdles component in the screen.

- Implemeted Enemy related all task and suitable patterns.

- Integrated all the Enemy actor with background.

- Created Activity diagram for the game flow.

- Added class diagrams for the Enemy related components

#### Patterns Implemented :

1. Observer Pattern:
   
   Player class is responsible to notify the RivalX class about the hit event.  RivalX(enemy) class is observer and it is observing state of Player class. When player notifies hit event, Clone of RivalX(Enemy), who got hit, will be removed from the world.
   
   Components of pattern:

 - IPlayerStateSubject 	- Subject Interface
 - Player 				- Concrete Subject
 - IObserver 				- Observer Interface
 - RivalX 				- Concrete Observer

2. Prototype Pattern:

	Implmented Prototype pattern for RivalX class. To clone RivalX(enemies)  Prototype was best choice to reduce number of CPU cycles.
	
	Components of pattern:	

 - Clonable	  			- Interface
 - RivalX					- Concrete Prototype
 - RivalController		- Client

3. Decorator Pattern:
   Implemented decorater pattern to add sound for enemy attack event and sound for enemy die event.
   
   Components of pattern:
 
 - Decorator	  					- Interface
 - AudioDecorator				- Decorator
 - RivalAudioDecorator			- Concrete Decorator 
 - RivalAttackAudioDecorator	- Concrete Decorator 
 - RivalX							- Concrete Component


<h4> Sai Prithipa RamMohan</h4>

Detailed journal is present in 

https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/journal/SaiPrithipa_journal.md

## XP value 

FEEDBACK

-> Made sure that I fulfil my XP value as a person who gives feedback. Provided inputs to the team which helped in making effective decisions. (One such feedback was, for all of us to work on a single level on different components rather than different levels. In this way, we were able to finish the game faster and the game looked consistent.)

-> Conducted Sprint Planning meeting. 

-> Played the scrum master role. Took care of the standups (used standbot to track standup updates) 

-> Created User Stories for the team 

-> Set up the Kanban board and maintained the scrum board with all results consolidated.

-> Implemented the player, healthbar and game progress component in the game. 

-> Integrated all the components and provided the final demoable version of the game. 

-> Created the ad video for our team. 

-> Created sequence diagram for the game flow.

-> Added class diagrams for the player and related components

-> added player label 

## Patterns Implemented

1. Observer Pattern - healthbar game progress
2. State Pattern
3. Mediator Pattern
4. Decorator Pattern
Detailed design notes of my component is present in 
https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/docs/DesignNotes_SaiPrithipa.docx


## Journals
https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/master/journal

## Project Progress
[Sprint Task Sheet](https://docs.google.com/spreadsheets/d/10g6QywrVk7dqj5zChE3Eh4HolZNTTuc4/edit#gid=746559321)

### Burndown Map
![alt text](https://github.com/nguyensjsu/sp19-202-spattern-marshals/blob/master/UML%20Diagram/BurnDownChart.png)

### Project Dashboard

https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/master/Project_Dashboard

### Standbot Reports
https://github.com/nguyensjsu/sp19-202-spattern-marshals/tree/master/status_reports


