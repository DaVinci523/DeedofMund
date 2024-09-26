import java.util.*;

public class Fight {
  private Monster beast;
  private Player dude;

  public Fight(Monster m, Player p) {
    beast = m;
    dude = p;
  }

  public void combat() {
    dude.setGrapGun(false);
    Scanner in = new Scanner(System.in);
    boolean loop = true;
    int stamGen = 0;
    boolean stamPtnUzd = false;
    boolean ptnUzd = false;
    int ptnCtr = 0;
    int stamPtnCtr = 0;
    int healCtr = 0;

    
    while (loop == true) {
      System.out.println();

      System.out.println("\nWhat would you like to do?");
      System.out.println("\n1. Attack the " + beast.getName()
          + "\n2. Recover with potion(s) \n3. View your stats \n4. Open Monster Guide \n\n(Type in a number)");

      String comm = in.next();
      System.out.println();

      if (comm.equals("1")) {

        if(beast.getName() == "monster"){
          healCtr++;
          if(healCtr % 3 == 0){
            System.out.println(beast.heal(dude.getDamage()*0.5));
          }
        }
        
        if (stamPtnUzd == true) {
          stamPtnCtr++;

          if (stamPtnCtr == 2) {
            stamPtnCtr = 0;
            stamPtnUzd = false;
          }
        }

        if (ptnUzd == true) {
          ptnCtr++;

          if (ptnCtr == 2) {
            ptnCtr = 0;
            ptnUzd = false;
          }
        }

        stamGen++;
        if (stamGen == 2) {
          dude.addStamina();
        }

        if (dude.getStamina() > 0) {
          System.out.println("You ready your " + dude.getWeaponName() + "...");
          System.out.println();

          if (dude.getElement() != null) {
            if (dude.getElement().equals(beast.getWeak())) {
              System.out.println("Attack damage is boosted due to the monster's weakness to your weapon's element!");
              dude.elmtBoost();
            }

            else if (dude.getElement().equals(beast.getResist())) {
              System.out.println("Attack damage is hampered due to the monster's resistance to your weapon's element!");
              dude.elemDeduct();
            }
          }

          /*
           * asks player what attack they want to use, stating their stamina the player
           * \currently has and lists the possible attacks with their stamina values
           * weapon types have been granted more stamina in order to do each attck, same
           * stamina as used to dodge
           */

          String weapon = dude.getWeaponName();
          boolean goLoo = true;
          int addStm = 0;
          while (goLoo == true) {
            addStm++;

            if (addStm == 2) {
              dude.addStamina();
            }

            System.out.println();

            // wyvernRush
            if (dude.hasRush() == true) {
              boolean jam = true;
              while (jam) {
                System.out.println("Would you like to use the Wyvern Rush? \n(Type in y for yes and n for no)");
                String rush = in.next();

                if (rush.equals("y")) {
                  dude.wyvernRush();
                  jam = false;
                }

                else if (rush.equals("n")) {
                  System.out.println("Alright then!");
                  jam = false;
                }

                else {
                  System.out.println("Invalid input, please try again...");
                }
              }
            }

            System.out.println("Select your attack! (You have " + dude.getStamina() + " stamina points to use): \n");

            if (weapon.equals("Broadsword")) {
              System.out.println("1. Wide Raze   \n2. Charging Slash (2 stamina) \n3. Broad Slam (3 stamina)");
            }

            if (weapon.equals("Katana")) {
              System.out
                  .println("1. Rising Slash   \n2. Scabbard Strike (2 stamina) \n3. Everlasting Edge (3 stamina)");
            }

            if (weapon.equals("Hammer")) {
              System.out.println(
                  "1. Pummel   \n2. Whirlwind Uppercut (2 stamina) \n3. Overwhelming Obliteration (3 stamina)");
            }

            if (weapon.equals("Lance")) {
              System.out.println(
                  "1. Hip Thrust   \n2. Perilous Puncture (2 stamina) \n3. Impeccable Impalement (3 stamina)");
            }

            if (weapon.equals("Bow")) {
              System.out
                  .println("1. Quick Shot  \n2. Strung Strike (2 stamina) \n3. Wyvern Puncture (3 stamina)");
            }

            if (dude.hasGrapGun() == true) {
              System.out.print("4. Use your Grapple Gun");
            }

            System.out.println("\n(Type in a number)");

            String peep = "";
            peep = in.next();

            System.out.println();
            if (peep.equals("1")) {
              System.out.println(dude.attack1());

              goLoo = false;
            }

            else if (peep.equals("2")) {
              if (dude.getStamina() >= 2) {
                dude.useMoreStam(2);
                System.out.println(dude.attack2());
                goLoo = false;
              }

              else {
                dude.setStam(0);
                dude.setModDmg();
                System.out.println(
                    "You are too tired to use this attack, and have spent the rest of your stamina attempting this attack. The "
                        + beast.getName() + "'s face hints at perplexity...");

                System.out.println();
                goLoo = false;
              }
            }

            else if (peep.equals("3")) {
              if (dude.getStamina() >= 3) {
                dude.useMoreStam(3);
                System.out.println(dude.attack3());
                goLoo = false;
              }

              else {
                dude.setStam(0);
                System.out.println(
                    "Though you have the spirit to attempt this attack, you lack the brawn to execute it. The "
                        + beast.getName() + "'s face hints at pity...");
                dude.setModDmg();
                System.out.println();
                System.out.println("Attempting the attack drained you of all your stamina!");
                goLoo = false;
              }
            }

            else if (dude.hasGrapGun() == true) {
              if (peep.equals("4")) {
                int numHits = 0;
                System.out.println("Grapple gun away!!");
                int poss = (int) (Math.random() * (3 - 1 + 1) + 1);
                if (poss == 1) {
                  System.out.println("The gun missed the " + beast.getName() + "!");
                  dude.useStamina();
                }

                else {
                  System.out.println("The grappler hit the " + beast.getName() + "!");
                  System.out.println();
                  System.out.println(
                      "How many times would you like to attack? \n(You can only attack as many times as you have stamina, you have  "
                          + dude.getStamina() + " stamina points)");
                  numHits = in.nextInt();
                  dude.grapple(numHits, beast);
                }
                goLoo = false;
              }
            }

            else {
              System.out.println("Incorrect input, please try again....");
              goLoo = true;
            }

          }

          System.out.println();

          beast.gotHit(dude.getModDmg());

          // else{
          dude.setModDmg();
          if (beast.getHealth() <= 0.0) {
            beast.death();
            System.out.println("You have defeated the " + beast.getName() + "!!!");
            System.out.println();
            System.out.println("Besting the beast has filled your stamina to its original value!");
            dude.reboot();
            System.out.println();
            loop = false;
          }

          else {

            System.out.println("The " + beast.getName() + "'s health is now " + beast.getHealth() + ".");
            System.out.println();
            System.out.println();
            if (dude.getStamina() > 0) {
              System.out.println("The " + beast.getName() + " readies to strike back!");

              boolean dod = true;
              while (dod == true) {
                System.out.println();
                System.out.println("Would you like to dodge? \n (Type y for yes and n for no):");

                String yn = in.next();
                System.out.println();

                if (yn.equals("y")) {

                  dude.useStamina();
                  System.out.println(beast.playerDodge());
                  System.out.println();

                  if (beast.getModDmg() != 0) {
                    System.out.println(beast.monAttack());
                    dude.dmged(beast.getModDmg());
                  }

                  dod = false;

                }

                else if (yn.equals("n")) {
                  System.out.println("All right then, hold your ground!");
                  System.out.println();
                  System.out.println(beast.monAttack());
                  dude.dmged(beast.getModDmg());
                  dod = false;
                }

                else {
                  System.out.println("Invalid input...please try again");
                  dod = true;
                }
              }
            }

            else {
              System.out.println(
                  "Since you're too tired to dodge, the monster takes advantage of the opening and lands a nasty strike!");
              System.out.println();
              System.out.println(beast.monAttack());
              dude.dmged(beast.getModDmg());
              if (dude.getHealth() < 0) {

                dude.death(beast);
              }
            }
            System.out.println();

            if (dude.getHealth() <= 0) {

              dude.death(beast);
            }

            System.out.println("Your health is now " + dude.getHealth() + ".");
            loop = true;
          }
          // }
        }

        else {
          dude.addStamina();
          System.out.println("You're out of stamina!");
          System.out.println(beast.monAttack());
          dude.dmged(beast.getModDmg());
            if(dude.getHealth() < 0){
              dude.death(beast);
            }
          System.out.println("Your health is now " + dude.getHealth() + ".");
        }

      }

      else if (comm.equals("2")) {

        String choose = "";
        boolean goL = true;
        while (goL == true) {
          System.out.println("Would you like to heal or regain stamina? \n1. Health (" + dude.getHealth()
              + " HP) \n2. Stamina (" + dude.getStamina() + " points) \n(Type in a number)");
          choose = in.next();
          System.out.println();
          if (choose.equals("1")) {

            if (dude.getHealth() == 1000) {
              System.out.println("Sorry! You're already at full health");
              goL = false;
            }

            else if (ptnUzd == false) {
              System.out.println();
              boolean hehe = true;
              while (hehe == true) {
                System.out.println("How many would you like to use? (You have " + dude.getNumPotions()
                    + " potions left, each heal you for 115 points, maximum three potions at a time)\n(Type in a number)");

                String inty = in.next();

                if (inty.equals("1")) {
                  System.out.println(dude.drinkPotion(Integer.parseInt(inty)));

                  hehe = false;
                }

                else if (inty.equals("2")) {
                  System.out.println(dude.drinkPotion(Integer.parseInt(inty)));

                  System.out.println();
                  hehe = false;
                }

                else if (inty.equals("3")) {
                  System.out.println(dude.drinkPotion(Integer.parseInt(inty)));

                  System.out.println();
                  hehe = false;
                }

                else {
                  System.out.println("Invalid, please try again...\n");
                  hehe = true;
                }

                System.out.println();
              }
              ptnUzd = true;
              goL = false;
            }

            else {
              System.out.println("You're too full to drink potions!");
              goL = false;
            }

          }

          else if (choose.equals("2")) {
            if (stamPtnUzd == false) {
              boolean go = true;
              while (go == true) {
                System.out.println("How many would you like to drink? (You have " + dude.getNumStamPotions()
                    + " potions left, maximum of 2 stamina potions at a time) \n(Type in a number)");

                String val = in.next();

                System.out.println();

                if (val.equals("1")) {
                  System.out.println(dude.drinkStamPotion(Integer.parseInt(val)));

                  go = false;

                }

                else if (val.equals("2")) {
                  System.out.println(dude.drinkStamPotion(Integer.parseInt(val)));

                  go = false;
                }

                else {
                  System.out.println("Invalid, please try again...\n");
                  go = true;
                }

              }
              stamPtnUzd = true;
              goL = false;
            }

            else {
              System.out.println("You're too full to drink stamina potions right now!");
              goL = false;
            }
          }

          else {
            System.out.println("Incorrect input, please try again...");
            System.out.println();
            goL = true;
          }

        }
      }

      else if (comm.equals("3")) {
        System.out.println();
        System.out.println("Your current stats are: \nHealth: " + dude.getHealth() + "\nHealth potions left: "
            + dude.getNumPotions() + "\nStamina: " + dude.getStamina() + "\nStamina Potions left: "
            + dude.getNumStamPotions() + "\nBase Damage (per hit): " + dude.getDamage());
        // goLoop = true;
      }

      else if (comm.equals("4")) {
        boolean gop = true;

        String mon;

        while (gop == true) {

          System.out.println();
          System.out.println("Which monster would you like to view?");
          System.out.println(
              "1. Anjanarc \n2. Diablon \n3. Rathalok \n4. Nergigan \n5. Tigrev \n6. Zinzire \n7. Rajanj \n8. Nargacoon\n9. Glavonus \n10. Alatrea \n11. Bareoth \n12. Fuegran \n\n(Type in a number)");

          mon = in.next();
          System.out.println();

          if (mon.equals("1")) {
            System.out.println("ANJANARC");
            System.out.println("Pronunciation: Ann-jah-nark");
            System.out.println("Health: 2517 \nBase Damage (per hit): 128");
            System.out.println("Weak to: Water \nResistant to: Fire");
            gop = false;
          }

          else if (mon.equals("2")) {
            System.out.println("DIABLON");
            System.out.println("Pronunciation: Dee-ah-blon");
            System.out.println("Health: 2752 \nBase Damage (per hit): 153");
            System.out.println("Weak to: Ice \nResistant to: Earth");
            gop = false;
          }

          else if (mon.equals("3")) {
            System.out.println("RATHALOK");
            System.out.println("Pronunciation: Rath-ah-lock");
            System.out.println("Health: 2204 \nBase Damage (per hit): 168");
            System.out.println("Weak to: Water \nResistant to: Fire");
            gop = false;
          }

          else if (mon.equals("4")) {
            System.out.println("NERGIGAN");
            System.out.println("Pronunciation: Nirg-ee-gone");
            System.out.println("Health: 3002 \nBase Damage (per hit): 211");
            System.out.println("Resistant to all elements");
            gop = false;
          }

          else if (mon.equals("5")) {
            System.out.println("TIGREV");
            System.out.println("Pronunciation: Tee-gre v");
            System.out.println("Health: 2554 \nBase Damage (per hit): 192");
            System.out.println("Weak to: Wind \nResistant to: Earth");
            gop = false;
          }

          else if (mon.equals("6")) {
            System.out.println("ZINZIRE");
            System.out.println("Pronunciation: Z in - z eye r");
            System.out.println("Health: 2303 \nBase Damage (per hit): 183");
            System.out.println("Weak to: Water \nResistant to: Thunder");
            gop = false;
          }

          else if (mon.equals("7")) {
            System.out.println("RAJANJ");
            System.out.println("Pronunciation: Ra-john-j");
            System.out.println("Health: 4807 \nBase Damage (per hit): 252");
            System.out.println("Weak to: Wind \nResistant to: Thunder");
            gop = false;
          }

          else if (mon.equals("8")) {
            System.out.println("NARGACOON");
            System.out.println("Pronunciation: Nar-gah-coon");
            System.out.println("Health: 3108 \nBase Damage (per hit): 167");
            System.out.println("Weak to: Earth \nResistant to: Wind");
            gop = false;
          }

          else if (mon.equals("9")) {
            System.out.println("GLAVONUS");
            System.out.println("Pronunciation: Gla-v on-uhs");
            System.out.println("Health: 3352 \nBase Damage (per hit): 175");
            System.out.println("Weak to: Ice \nResistant to: Fire");
            gop = false;
          }

          else if (mon.equals("10")) {
            System.out.println("ALATREA");
            System.out.println("Pronunciation: A-lah-tree-uh");
            System.out.println("Health: 5056 \nBase Damage (per hit): 270");
            System.out.println("Resistant to all elements");
            gop = false;
          }

          else if (mon.equals("11")) {
            System.out.println("BAREOTH");
            System.out.println("Pronunciation: Bare-oth");
            System.out.println("Health: 3703 \nBase Damage (per hit): 201");
            System.out.println("Weak to: Fire\nResistant to: Ice");
            gop = false;
          }

          else if (mon.equals("12")) {
            System.out.println("Fuegran");
            System.out.println("Pronunciation: F way-grahn");
            System.out.println("Health: 4433 \nBase Damage (per hit): 174");
            System.out.println("Weak to: Water \nResistant to: Fire");
            gop = false;
          }

          else {
            System.out.println("Sorry, not a valid choice, please try again...");
            loop = true;
          }
        }
      }

      else {
        System.out.println("Sorry, not a valid choice, please try again...");
        loop = true;
      }
    }

  }
}
