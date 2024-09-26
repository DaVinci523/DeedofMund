import java.util.Scanner;

class Main {
  public static void main(String[] args) {    

    System.out.println();
    System.out.println("WELCOME TO The Deed of Mundulin: The Last of the Vulnin!!!");
    System.out.println();
    System.out.println();
    
    System.out.println("Long ago, there was peace in the lands of Mundulin. The Vulnin Cohort was the realm’s prime defenders against all forces that sought to put an end to the peace. Their power was second to none and their reign lasted for centuries. Until one day, one fateful moment, brought everything crashing down. Mundulin erupted in cavities from the hidden land below, the land of Larce Ekkus. Great beasts, known as the Wyverns, emerged from the trenches with only one thing in their mind; terminate the human race. The Vulnin Cohort leaped to intervene with the Wyverns. Their battle raged through Mundulin, but it was to no avail. Those valiant to stand were overwhelmed by the sheer power of the monsters. Mundulin fell to ruin within days and Larce Ekkus had taken hold of the nation. The Wyverns still roam below, still searching for those to stand against them. They will get their wish soon enough. As the last of the Vulnin Cohort, you somehow must fell the Wyverns and restore the lands of Mundulin to their rightful glory. You begin in the quaint village of Titilus...");
    System.out.println();
    System.out.println();
    System.out.println("Good luck!");
    System.out.println();
    System.out.println();
    Scanner in = new Scanner(System.in);
    System.out.println("State your name, hunter!");
    Player p1 = new Player(in.nextLine());
    System.out.println();
    System.out.println("Hello " + p1.getName() + "!");
    System.out.println();
    System.out.println("It's been some time since you picked up a blade, but you have an undeniable urge that you should get back into practice. You head to the village smithy to order a weapon, and he made quite the selection to present to you...");
    System.out.println();
    String command =  "";
    boolean goLoop = true;
    while(goLoop == true){
    System.out.println(
        "Choose your weapon: \n\n1. Broadsword, a wide blade with a stout hilt. Has moderate damage. \n2. Katana, a long, thin blade that makes you feel like the wind itself. Has lighter damage.\n3. Hammer, a hefty, blunt weapon with high damage, but slower movements. \n4. Lance, a long, spearlike sword with good range and modereate damage. \n5. Bow, the longest and most versatile known to Mundulin, offers movement to supplant its low damage.\n\n(Type in a number)");

      command = in.nextLine();
      System.out.println();

    // sets the weapon for w1
      if (command.equals("1")) {
        p1.useBrdswd();
        System.out.println("You selected the Broadsword!");
        goLoop = false;
      }
  
      else if (command.equals("2")) {
        p1.useKatana();
        System.out.println("You have selected the Katana!");
        goLoop = false;
      }
  
      else if (command.equals("3")) {
        p1.useHammer();
        System.out.println("You have selected the Hammer!");
        goLoop = false;
      }
  
      else if (command.equals("4")) {
        p1.useLnce();
        System.out.println("You have selected the Lance!");
        goLoop = false;
      }
  
      else if (command.equals("5")) {
        p1.useBow();
        System.out.println("You have selected the Bow!");
        goLoop = false;
      }
  
      else {
        System.out.println();
        System.out.println("Sorry, not a valid choice, please try again...");
        System.out.println();
        goLoop = true;
      }
    }
    System.out.println();
    System.out.println("On your way back from the smithy, you spot to the old cohort outpost on the outskirts of Tiltilus. As you recall, the place is abandoned, with a few rusty weapons scattered about. Although, you remember being told about a secret armory for some weapon enhancements. This draws you into entering the opening room, decorated with torn flags of the Vulnin insignia; a shield emblazoned with a V being pierced with a golden broadsword. This marks the promise that the cohort will always strive to improve themselves. A mural also survided; depicting a great battle between the Vulnin and a monster with eyes that gaze you any way you look at it. It seems to claw at you from in the picture frame. You see an worn tablet hung on the wall in front of you. It reads...\n\n     Follow the shymphony of the sky, \n          Then, to forked tounges utter of thy enemy\n\n You hear rumble in the distace, which rattles the town. You also hear the sound of birds chirping down the hall to your left, as well as a gentle whistling to your right.");
    boolean gool = true;
    while(gool == true){
      System.out.println();
      System.out.println("What would you like to do? \n1. Investigate the rumbling \n2. Turn left down the hall \n3. Go right towards the whistling \n\n(Type in a number):");
      command = in.next();
      
      if(command.equals("1")){
        System.out.println("You leave the outpost and walk to the grassy clearing where you thought you heard the rumbling. There is a scar in the ground that is roughly half a mile in diameter. It is no doubt that this was a recent cavity to the land of Larce Ekkus, although now closed. But something much larger than most came through this one, you don't remember seeing any other beasts of that size during the fall of Mundulin.");
        gool = false;
      }
  
      else if(command.equals("2")){
        System.out.println("You followed the sound of the birds and arrive at a large olive tree. You look down and see six colored snakes residing under the tree, staring at you, neither advancing nor retreating.");
        System.out.println();
        boolean goop = true;
        while(goop == true){
          System.out.println("What would you like to do? \n1. Say: Larce Ekkus \n2. Say: Whatever stands in my way \n3. Kill the snakes");
          System.out.println();
          System.out.println("Type in a number:");
          String comm = in.next();
          System.out.println();
          if(comm.equals("1")){
            System.out.println("You kneel down to the snakes and utter the words, Larce Ekkus, for they brought waste to this sacred land. The snakes look at you for some time, then slither back into the tree. You feel a shudder at your feet and see that you are standing on a sliding trapdoor that is beginning to open. Once it opens, you enter into a large room with six pedestals. On each there is a label stating an element and a floating mass above it. On the dimly-lit ceiling above, you see an artpiece of a fellow Vulnin holding her weapon to one of the floating masses. These must be the untold weapon upgrades, but as you draw near to one, the others begin to wither away.");
        boolean loop = true;
        while(loop == true){
  
        System.out.println();
        System.out.println("Which mass would you like to choose? \n1. Fire \n2. Water \n3. Ice \n4. Thunder \n5. Earth \n6. Wind");
        System.out.println();
        System.out.println("(Type in a number)");
        command = in.next();
        if (command.equals("1")) {
          p1.setElement("fire");
          System.out.println("You have fused your " + p1.getWeaponName() + " with the " + p1.getElement() + " element!");
          loop = false;
        }
    
        else if (command.equals("2")) {
          p1.setElement("water");
          System.out.println("You have fused your " + p1.getWeaponName() + " with the " + p1.getElement() + " element!");
          loop = false;
        }
    
        else if (command.equals("3")) {
          p1.setElement("ice");
          System.out.println("You have fused your " + p1.getWeaponName() + " with the " + p1.getElement() + " element!");
          loop = false;
        }
    
        else if (command.equals("4")) {
          p1.setElement("thunder");
          System.out.println("You have fused your " + p1.getWeaponName() + " with the " + p1.getElement() + " element!");
          loop = false;
        }
    
        else if (command.equals("5")) {
          p1.setElement("earth");
          System.out.println("You have fused your " + p1.getWeaponName() + " with the " + p1.getElement() + " element!");
          loop = false;
        }
    
        else if (command.equals("6")) {
          p1.setElement("wind");
          System.out.println("You have fused your " + p1.getWeaponName() + " with the " + p1.getElement() + " element!");
          loop = false;
        }
    
        else {
          System.out.println("Sorry, not a valid choice, please try again...");
          loop = true;
        }

          System.out.println("Once the ritual is complete, you feel a sense of urgency fill you to investigate the rumbling.");
          
      }
          goop = false;
          }
          else if(comm.equals("2")){
            System.out.println("You stand valiantly and bellow the words, Whatever stands in my way! The snakes, unimpressed, slither up the tree. You wait there a while, see there is no point, then leave the outpost.");
          goop = false;
          }

          else if(comm.equals("3")){
            System.out.println("You ready your " + p1.getWeaponName() + " and strike down the snakes in an instant. It felt good to kill someting again. When you come to after your short fervor, you realize there is no point to stay in the outpost and you depart.");
         goop = false;
          }

          else{
            System.out.println("Sorry, invalid input... Please try again");
            goop = true;
          }
        }
        gool = false;
      }
  
      else if(command.equals("3")){
        System.out.println("You follow the sound of the whistle for some time until you see a bright light through the wall. It blinds you as you walk towards it. Once you are able to see clearly, you find yourself outside the compound with the door closed firmly behind you. You have been fooled.");  
        System.out.println("\nPress any key to continue:");
        String light = in.next();
      gool = false;
      }

      else{
        System.out.println("Sorry, invalid input. Please try again...");
        gool = true;
      }
    }
    System.out.println();
    if(!(command.equals("4"))){
    System.out.println("As you head out, you hear the rumbling once more. In an instant it goes quiet and the people believe it to be over.");
    }

    Monster m1 = new Monster();


    System.out.println();
    System.out.println();
    System.out.println("The ground splits beneath you, sending a shiver down your spine as a shriek emits from the cavity. It no doubt leads to Larce Ekkus, and a " + m1.getName() + " climbs out of the hole. You know you must take it down or face the guilt of letting the beast lay waste to Tiltilus.");
    if(p1.getElement() != null){
      System.out.print("Your " + p1.getWeaponName() + " glows with the fusion of " + p1.getElement() + "'s might. \n\nSteel yourself, " + p1.getName() + "!!");
    }

    else{
      System.out.println();
      System.out.println("Steel yourself, " + p1.getName() + "!!!");
    }
          
      Fight f1 = new Fight(m1, p1);
      f1.combat();
      
    
      System.out.println("The " + m1.getName() + " falls to your feet, lifeless and cold. The town of Tiltulus is safe once more due to your efforts, but you feel that this is only the beginning of a much larger assault. After a long diatribe of debating, you reason that you are the only one able to make the sacrifice to save the lands of Mundulin. It is time to make the descent into Larce Ekkus and put an end to the Wyverns.");
      System.out.println();
      System.out.println();
      System.out.println("Are you ready?"); 
      System.out.println();
      System.out.println("Input any button to continue:");
      String continU = "";
      continU = in.next();
      p1.setNumStamPotions(8);
      p1.setNumPotions(10);
      p1.setHealth(1000);
      System.out.println();
      System.out.println("Once you restock on potions and other materials, you begin your descent into the cavity that the " + m1.getName() + " came from in order to get to Larce Ekkus, thinking about the bolt of valor you felt from slaying the " + m1.getName() + ". It felt good getting revenge on one of the beasts that laid Mundulin to waste in the first place. After a while climbing, you notice that light is all but gone in the hole. You feel a shudder in the surface that you are climbing down. In an instant, the wall of the hole explodes as a monster appears from behind the wall, sending down an avalanche of earth and stone. \n\n You regain conciousness and immediately duck as a massive claw almost beheads you. The being before you is the shade midnight, as if death itself flows from the beast. It watches you intently, waiting for you to move. With no other option, you rise to oppose the leviathan.");
      System.out.println("\nPress any key to begin the fight:");
      String net = "";
      net = in.next();
      m1.setFiend();
      f1.combat();
         
        System.out.println("The monster reels from your affinity with the blade, and crashes to the ground with a mighty cry. You collapse, exhausted from the clash. When you come to, you notice that the body of the unknown monster is nowhere to be found. You hear a chorus of shrieks and guttural bellows from the left. A flash of orange paints the sky for a moment, displaying a massive spire jutting from the ground like a speartip piercing your chestplate. You also hear a whispering to your right, which, when you tune in, sounds close to a chanting tugs at your soul.");
        boolean huh = true;
        String bee = "";
        while(huh){
          System.out.println();
          System.out.println("Where would you like to go? \n1. Head left towards the spire\n2. Follow the whispering on your right");
          bee = in.next();
          System.out.println();


          if(bee.equals("1")){
            System.out.println("You set out for the spire, wondering; what could have lit up the darkness? It occurs to you that the beast you fought before could be the cause, but its a long shot since it just a harsh beating from you. Lost in thought, you stumble over a round object jutting out of the dirt. You investigate the object and realize it is a skull; there have been other humans down here. \n\nAs you ponder who would come down here and why, you hear a whooping chorus behind you. You wheel around to numerous clawed spear tips inches from your face, each wielded by a tall hooded figure. They appear to have the same beak-like marking on their garments. In a flash, you unsheathe your " + p1.getWeaponName() + " and bat the spears away from you, catching the figures by suprise. As they regain their footing, you leap to strike, but one of the figures holds its hand up, compelling you to stop...");
            System.out.println();
            boolean guilt = true;
            while(guilt){
              System.out.println("Do you yield? (Type y for yes and n for no)");
              String yield = in.next();
              System.out.println();
              if(yield.equals("y")){
                Monster m2 = new Monster();
                Fight f2 = new Fight(m2, p1);
                System.out.println("You bring your feet down and halt right in front of the figure with the hand extended. None of the figures look fazed at the near-death experience of their compatriot. They all remove their hoods, revealing grim, human faces that brings you utmost sorrow for their condition. The one that held his hand up comes forward and opens his mouth... \n\nWhat comes out is a gurgle blended with strained cries and perhaps a tint of laughter. It doesn't seem agressive, although it isn't friendly either. He motions to the spire and then at you to follow him. After a stint of walking in silence, you veer away from the spire and make out a small fire in the distance. The figures quicken their pace to the fire and start frantically conversing in their tounge. As your party draws near it appears to some sort of encampment, which must be their home. You see more of the hooded figures, either scrambling around or laying still on the ground. There is a piercing roar as a " + m2.getName() + " strides away from the scene...");
                System.out.println("\nYou feel yourself boiling over with fury; these humans had no right to be violated in such a way. You  violently slam your " + p1.getWeaponName() + " on the ground, which results in the " + m2.getName() + " turning its hideous head to see the origin of the bellow. It appears suprised when its eyes rest on you. Nonetheless, it turns to face you and welcomes the challenge...");
                System.out.println();
                System.out.println("Press any key to start the fight:");
                yield = in.next();
                f2.combat();
  
                System.out.println("The " + m2.getName() + " rears its head back, utters a mighty cry for mercy, and crumples to the ground, finally out for the count. The figures slowly edge in to inspect the monster. After what seems to be a thorough investigation, the figures return to you and begin to fall prostrate in front of you. You begin to deny your newfound exaltedness and reason that these humans have been reduced to maddness by this place. Perhaps you could recruit them for the cause. They seem to know how to fight, given their plethora of weaponry."); 
                System.out.println();
                System.out.println("Press any key to continue:");
                String press = in.next();
                
                System.out.println("\n\nYou notice them offering up something to you. It appears to be a firearm that brandishes a serrated , claw-like fixture jutting out of the barrel. After delicately taking it, they motion for you to activate it, gesturing towards a wall. It fires; a straight shot whistling towards the wall. The claws stab into the solid surface. Gently tugging the line, the claws remain embedded into the wall. During your admiration of the device, you find yourself being pulled towards the wall at ludicrous speed, crashing through it and reducing it to chunks laid askew. You come to the realization that the firearm is in fact a grappling gun, that could latch onto a monster and bring you right to its hide, setting you up for some huge damage. After you resupply munitions and potions,  you thank them for the gift and carry on to the spire.\n\n");
                p1.setGrapGun(true);
                p1.reboot();
                guilt = false;
                huh = false;
              }

              else if(yield.equals("n")){
                System.out.println("You bring your " + p1.getWeaponName() + " down on the hooded figure, crumpling its body easily. The other figures utter a shriek and steal away from their fallen companion, taking refuge in some holes in the ground; their screams slowly fading away. You kick the hood off of the fallen figure. What you see is a male, human face, eyes rolled back in pain as life escapes them. You fall to your knees, overcome with guilt and grief. The refraining from killing humans, regardless of their nature, was a prized claim among the Vulnin. But these are trying times, and everything around you seems to want to end your existence. Though shaken, you trudge forth toward the spire.");
                guilt = false;
                huh = false;
              }

              else{
                System.out.println("Invalid input, please try again...");
              }
              
            }
            huh = false;
          }

           
          else if(bee.equals("2")){
            System.out.println("You answered the call of the whispers and head right. Oddly enough, you see giant, sporadic footprints impressed on the soft dirt. Three of which seem almost natural, while the fourth foot juts out from the formality of the others. Something big came through here, and it was limping away. You reason it could have been the monster you recently had a bout with, but you see something odd about the tracks; the outlying foot slowly comes back in line with each pace, like it's healing as it walks. Something that potent could be a serious problem if you have to face it in combat.");
            System.out.println("\n\nAfter walking for a time, you come to a temple composed of decaying stone and another type of brick that slowly pulsates orange. You peer in the opening, but it is pitch black.");
            System.out.println();
            boolean maze = true;
            String heep = "";
            while(maze){
              System.out.println("Would you like to enter? \n(Type y or n)");
              heep = in.next();
              System.out.println();
          
              if(heep.equals("y")){
                System.out.println("You bravely stride into the murk. With no light, you hold out your hands to guide you around. You walk forward until your hands brush against a wall. The surface immediately reacts by glowing a pulsating orange like outside the temple. It sends a ripple effect throughout the rest of the temple, making the whole building pulsate like a slowed heartbeat. You take in your surrondings, noting how the door out has somehow shut. In front of you, there are two paths: left and right...");
                System.out.println("\nWhich way would you like to go? (Type in a number)\n1. Left \n2. Right");
                heep = in.next();
                System.out.println();
                boolean op1 = true;
                while(op1){
                  
                  if(heep.equals("1")){
                    System.out.println("You head left. As you progress, you note that the lights glow even brighter with every step you take, which means you must be getting closer to something at the end of the labyrinth. You come again to a crossroads...");
                             
                    boolean lOrR = true;
                    while(lOrR){
                      System.out.println("Which way would you like to go? \n1. Left \n2. Right");
                      String geep = in.next();
                      
                      //this is completed
                      if(geep.equals("1")){
                        System.out.println("You turn left again. When you are about halfway to the end of the hall, you hear a fleeting scratch back at the crossroads, but as you turn around to look, nothing shows itself.\n\n Trudging on, you think about your childhood, flashing back to when the kingdom fair came to Tiltilus. They too had a maze, but theirs didn't have the weight of the world on the children's shoulders. This thought quickens your pace, as a slow rumbling grabs your attention. You hurry but reach yet another crossroad. You can see the a room with light creeping out from a window to your left, while the darkness reaches out for you from the right.");
                        boolean steven = true;  
                        while(steven){
                          System.out.println("Which way would you like to go? \n1. Left \n2. Right");
                          String sheep = in.next();
                          System.out.println();
                          if(sheep.equals("1")){
                            System.out.println("You turn left, your face bathed in the light from the window. As you are drawn to the window, you feel a crunch under your boot and lift it up to investigate the sound. You see a stone tablet depressed slightly lower than the floor level. The floor itself tilts downward, revealing a gaping hole that seems to swallow you whole as you slide downwards. When you come to, you find yourself at the entrance of the temple, although this time the door is shut and the bricks no longer glow orange. With no other path forward, you set out for the spire.");
                            steven = false;
                            lOrR = false;
                            op1 = false;
                            maze = false;
                          }

                          else if(sheep.equals("2")){
                            System.out.println("You turn to your right, letting the darkness take you in. You blink once, and realize there is no difference in the light between when you open your eyes and close them. You feel light on your feet, as if the darkness actually lifting and pulling you along. It's been so long since you slept, and you can't resist against the beast of exhaustion. As you drift off, you hear a light whispering beckoning you to wake; a moment later it's gone and the all-black consumes you...\n\n\nYou wake with a spasm. As you rise, you see you are in a room with numerous torches, somehow lit. You take a step backward to gain a better view, but your foot cracks the tile. A loud quaking results, leading a brick and stone monolith emerging from the floor. It reaches its final height, then violently breaks from the ground, levitating a foot from ground level. It subtly rotates on its invisible axis, showcasing pictures outlined by the glowing mortar. It reads:\n\n   Here be Ekkius\n     Thine king of titans\n       Color of death\n       It shall climb the steeple\n   Call upon its servants\n     And take Mundulin once more\n       Yet this crusade is without remorse\n   None shall see the sun shine\n     For the sun will be made dark and dead...\n\nThe image of the unknown monster flashes to the front of your mind. The monster you fought is the one foretold in the monolith, and it plans to take over Mundulin once more. With this knowledge, you enter a frenzy as you grip the monolith and smash it through the wall. Without thought, you charge towards the spire, ready to end the beast once and for all.");
                            p1.findTruth();
                            steven = false;
                            lOrR = false;
                            op1 = false;
                            maze = false;
                          }
                          
                          else{
                            System.out.println("Invalid input, please try again...");
                          }
                        }
                      }

                      //this is completed
                      else if(geep.equals("2")){
                        System.out.println("You turn right, noting that the glow of the bricks has dimmed signifigantly. The glow now flows slowly in the direction you're walking, almost as if its being drawn in by something. You turn a corner and see a small, shining orange orb in front of you on some sort of pedestal. As you are drawn in by its soft glow you feel replenished. No, no, this is different. \n\n You bring your hand to the orb and gently tap it. It imbues you with a electric shock that brings you to your knees, even after letting go of the orb. You rise to try again, but are unsure of how to proceed...");

                        boolean fin = true;
                        while(fin){
                          System.out.println("What do you want to do?\n1. Hit the orb\n2. Grasp it with both hands \n3. Return to the maze");
                          String orb = in.next();

                          //be sure to exit out of all loops
                          if(orb.equals("1")){
                            System.out.println("You use your " + p1.getWeaponName() + " and strike the orb. The stroke somehow deflects off the orb and send you flying backward through the wall. You get up, gather your bearings, and find your way to the exit of the temple...");
                            fin = false;
                            lOrR = false;
                            op1 = false;
                            maze = false;
                          }

                          else if(orb.equals("2")){
                            p1.setWyvernRush();
                            System.out.println("You put your hands on opposite sides of the orb. Small strips of lightning reach for your fingertips, but you let them make the connection. The instant they do, they quickly draw your hands to the surface of the orb so your palms have made contact, then wrap around your fingers so you are unable to remove your hands. In your ear, you hear a quaking roar that makes your blood flow faster, hotter, stronger. \n\nA newfound fury turns your vision a seething red as an Anjanarc busts through the wall in front of you. You hastily grab your " + p1.getWeaponName() + " to drive back the beast. Your rage is channeled into your " + p1.getWeaponName() + " as you bring it down on the Anjanarc. You shut your eyes out of hatred for this land, this situation, this horror before you. You hear the monster shriek as the weapon makes contact with its skin. When you open your eyes, you see the monster is long gone, limping away with a red, glowing gash on its side. You understand that the power of the orb did this. It is a part of you now, whether you want it to or not. You soon faint, overcome with weakness after dealing such a blow. \n\nWhen you awake, you feel normal again, reasoning that the power of the orb can only be used ever so often. With such great potential, you march on to the spire.");
                            System.out.println("\nPress any button to continue");
                            String move = in.next();
                            fin = false;
                            lOrR = false;
                            op1 = false;
                            maze = false;
                          }

                          else if(orb.equals("3")){
                            System.out.println("You turn around and face the maze once more...");
                            fin = false; 
                          }

                          else{
                            System.out.println("Invalid input, please try again...");
                          }
                        }
                      }
                    }
                  }
                    
                  
                  else if(heep.equals("2")){
                    System.out.println("You head right, taking note that you feel to be going slightly upwards. You meet a dead end, but see a faint rectangular shape outling part of the wall, almost like a doorway. You press firmly on it and it gives way, allowing light to pierce into the temple. You walk through and find yourself on the top of the temple. \n\nTaking in the view, you note how far up you are, and how high the ceiling of the cavern is still above you. You don't know how you got up so high, and never truly thought to look up until just a moment ago. The scene leaves you in awe, but you get a sudden feeling that you are being watched. You desperately whip your head left and right to locate the source, but your eyes rest on the spire, the only thing that connects the floor to the ceiling. You can faintly see two red dots glowing, riveted in place on the spire. You wave it off and keep looking around, but your eyes keep drifting back to the dots. Staring at them intently, they flicker off for a second, almost as if they were blinking. You realize that, even such a distance away, there is a monster staring at you from the spire. You can't see any other parts of the beast, but you are certain there is one there. Although when you look back, the dots have disappeared and left no trace in their wake. With no other option, you climb down the face of the temple and make your way towards the spire.");
                    op1 = false;
                    maze = false;
                    huh = false;
                  }

                  else{
                    System.out.println("Invalid input, please try again...");
                    System.out.println();
                  }
                    
                }
              }

              
              else if(heep.equals("n")){
                  m1.setName("Nargacoon");
                  m1.setNargacuga();
                  System.out.println("After gazing at the structure, you turn around to come face to face with a " + m1.getName() + ". Its glossy black fur pulsates along with the glow from the temple. As it begins to circle you, you notice how the pads on its feet eliminate any sound that would otherwise give it away, which explains how it slunk behind you. Its streaks of red fur flanking its eyes begin to eminate a smoke that trails behind a path where the eyes once were. At once it attempts to pounce, but you manage to dodge and turn around for a fight...");
                System.out.println("\nPress any key to begin the fight:");
                String mel = "";
                mel = in.next();
                System.out.println();
                f1.combat();
                System.out.println("Once you assure that the " + m1.getName() + " is dead, you set your sights on the spire and march on, flowing with vigor from your most-recent victory.\n\n");
                maze = false;
                huh = false;
              }
              
              else{
                System.out.println("Invalid input, please try again...");
              }
          }
            huh = false;
        }

          else{
            System.out.println("Invalid input, please try again...");
            System.out.println();
          }
       
      }

    Monster m5 = new Monster();
    m5.weakenMon();
      System.out.println("As you trod onward to the spire, a " + m5.getName() + " appears out of nowhere and pounces on you. As it studies you, you notice its pupils are dialated and its face is painted with fresh scars, as if it was in a recent tussle. It's breath is heavy, ragged with age and many, many battles. You sympathize with the monster, and realize it's best to put it out of its misery. You escape from its clutches, but the " + m5.getName() + " still wants to fight, regardless of its condition. With a sigh, you prepare for the worst...\n");
    System.out.println("Press any key to begin:");
    String sad = in.next();
    Fight weak = new Fight(m5, p1);

    System.out.println("With the final strike, the monster collapses to the ground as if it was waiting to do so for a long, long time. It appears to smile as you see a tear seep from its eyes. It flows onto the ground is absorbed, solifying the story of the " + m5.getName() + " in the soil. ");
    
    Monster m3 = new Monster();
    Monster m4 = new Monster();
      System.out.println("Upon reaching the spire, you are greeted by a roar from your backside. You whip around to see a " + m3.getName() + " charging at you, hatred filling its vision as it draws closer and closer to you... \n\nYou brace for impact, but none comes as the " + m3.getName() +" hurdles over you, just as you hear yet another roar again at your back; a " + m4.getName() + ", fixed on the " + m3.getName() + ", meets the " + m3.getName() + " midar, teeth and claws clashing as both beasts hit the ground in a feral tussle for survival. You watch on, relieved that you are finally not the target, though it is quite a messy fight. It seems evenly matched until both monsters suddenly go limp. You stifle a snicker as the " + m4.getName() + " ragdolls mid-swipe and smushes the " + m3.getName() + ". The snicker is turned ice cold as the midnight monster emerges from behind the spire; its eyes glowing a illustrious crimson.");
    
    if(p1.getTruth()){
        System.out.println("It is Ekkius, the monster enscribed in the monolith from the temple. you realize that this must be the prophecy being fufilled; it is preparing to climb the steeple back into Mundulin and make its destiny a reality.");
    }

    else{
      System.out.println("It is the monster from before, the one that you first fought when you entered into these lands. You see it look up at the spire, as if it wants to climb it for some odd reason. But why?");
    }

    System.out.println("\n");

    Monster boss = new Monster("steve");
    boss.setEkkius();
    
    System.out.println("You see a tattered flag of some sort hanging out of its mouth, but can't make out its insignia just yet. It begins to climb the spire, but loses grip of the flag in its mouth, sending it gently floating to the ground a few feet in front of you. You walk over to pick it up, holding it high to make out the image. Your blood drains from your face as you recognize the image. A shield emblazoned with a V being pierced with a golden broadsword spreads itself across the tattered cloth. This is indeed the creature that begun all of this; all the pain, the regret, the despair...\n\neverything...\n\nYou let out a cry that seems to shake the entirety of the cavern. You furiously wrap the cloth around the handle of your " + p1.getWeaponName() + " and rush towards where the monster is climbing. It notices you and appears to force its maw into a sort of grin. You watch it leap down to your level, letting itself to fully reveal its frame before you: large, leathery wings that swallow all light it can latch on to, agile feet armed with....DESCRIBE EKKIUS. With its granduer before you, it willingly waits for you to strike. \n\nPress any button to begin the fight:");
    String baus = in.next();

    Fight finale = new Fight(boss, p1);
    //have it so you fight Larce Ekkus, then it runs away once again, which you mercilessly hunt down, having three monster fights before you fight Larce Ekkus one last time. 

    System.out.println("The monster takes a single, heavy swipe at you out of desperation. You manage to sidestep the hit and race up its arm, adrenaline and anger driving you onward. It brings up its arm, launching you many feet into the air, leaping up as its muzzle opens to put an end to your crusade. You cock your mighty " + p1.getWeaponName() + " back behind your head and, at the moment you feel the monster's breath, bring it slamming down into the monster's head and sending you both hurtling back to the cavern floor. As the two of you are plummeting, you struggle to keep the " + p1.getName() + " embedded in the monster's skull. You crash to the ground, a shriek emitting from the beast. Once the dust settles you realize the fall made a sizeable crater in the rock floor. The monster suddenly twitches as its body partly reanimates...\n");
      boolean eagle = true;
    while(eagle == true){
      System.out.println("How will you proceed?");
      System.out.println("1. Hit the monster again \n2. Comfort the beast\n 3. Let it be");
        String aerie = in.next();
        if(aerie == "1"){
          System.out.println("In an act of desperation and rage, you slam your " + p1.getWeaponName() + "down on the monster again. Then again, and again; repeatedly beating it to a pulp before you collapse to your knees, exhausted and shaking with the guilt of what you just did. You realize that there is no way out of this place, and you just violently killed the most powerful being in this domain. With this crazed knowledge, you craft yourself robes out of the skin of the monster and terrorize the humans from before, instilling yourself in myth as the Beast who took Ekkus.");
        }

        else if(aerie == "2"){
          System.out.println("You approach the monster, and watch as its soul quietly leaves its body, as if there is a silent scream emitting from its eyes. You lay your hand on the monster's muzzle, which, to your surprise, allows you to and appears to put the monster at ease. As its final moments draw to a close, you gently close its eyes and give it a reassuring pat. You see a cluster of marigolds float over the monster by way of wind. You watch their path, as they seem to carry upwards. The earthen ceiling above the spire gives way, allowing sunlight to finally flood into Larce Ekkus. The marigolds' light golden-orange hue allows you to see them even as they approach the hole, then  disappear as they reach Mundulin like they were carrying the spirit of the monster to the afterlife. With that, you allow yourself to smile as you bury the monster, and your " + p1.getWeaponName() + "with it; there is no need for bloodshed anymore. You slowly walk over to the spire, take one last look at the fresh grave, and begin your climb to your homeland.");
        }

        else if(aerie == "3"){
          System.out.println("You slowly back away from the monster, afraid of what it may do. It shakily rises, combatting death in earnest as it hobbles away. You hear a melody of hideous sounds as bones snap back into place, each cauing a howl from the monster. You become swallowed in despair; you weren't able to kill the beast, you were too weak, too soft. You well up with tears and are overcome with grief, shielding your eyes from the horrors around you. Shortly after, you hear the monster stride towards the spire, pause and look at you before snorting approval, then leaps up to climb the spire. The ceiling above the spire gives way, allowing the monster full access to Mundulin. The moment you see its head break daylight, you hear the screams of the people of Mundulin, along with many explosions and crashes. This was your doing, that knowledge cripples you to the core as you sink to the floor, your cries drowned out by those of thousands of others."); 
        }

        else{
          System.out.println("Invalid input...please try again...");
        }
    }
    
    System.out.println("\n\n\n THE DEED OF MUNDULIIN: THE ODE FROM LARCK EKKUS \n\n\nThanks so much for playing! Hope you got the ending you were looking for. This has taken me over a year to code and work out the kinks, so I'm overjoyed you got to this point! Feel free play again and try some different paths of the story. You never know what you may discover! \n\nPlease comment if you have any ideas or found any bugs!");
  }
}
