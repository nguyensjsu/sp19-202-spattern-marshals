# Week 1 Scrum Report(4/7-4/13)

## Priya Khadke

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

## Priya Khadke

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

## Priya Khadke

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

## Priya Khadke

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