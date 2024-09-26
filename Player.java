import java.util.*;

public class Player {
  private int health = 1000;
  private String name = "";
  private int numPotions = 10;
  private int numStamPotions = 8;
  private String weaponName = "";
  private int guard = 0;
  private double damage;
  private double modDmg;
  private int stamina;
  private int orgStam;
  private String element;
  private boolean hasGrapGun = false;
  private boolean hasRush = false;
  private boolean knowTruth = false;

  public Player(String n) {
    name = n;
  }

  public String drinkPotion(int numAte) {
    if (numAte <= numPotions) {

      for (int i = 0; i < numAte; i++) {

        health += 115;
        numPotions--;
      }
      if (health >= 1000) {
        health = 1000;
      }

    }

    return "Your health is now " + health + ".";
  }

  public void reboot(){
    stamina = orgStam;
    setNumStamPotions(8);
    setNumPotions(10);
  }

  public void findTruth(){
    knowTruth = true;
  }
  
  public String drinkStamPotion(int numAte) {
    String response = "";
    if (numAte <= numStamPotions) {
      if (numAte <= 3) {
        for (int i = 0; i < numAte; i++) {

          stamina++;
          numStamPotions--;
          if (stamina > orgStam) {
            stamina = orgStam;
            response += "Your stamina has been restored to its original value!";
          }
        }
      }

      else {
        response += "You're too full to drink more than two stamina potions!";
      }
    }

    else {
      response += "You don't have enough stamina potions left!";
    }

    if (!(stamina > orgStam)) {
      response += "You now have " + stamina + " stamina points.";
    }

    return response;
  }

  public int getOrgStam() {
    return orgStam;
  }

  public boolean getTruth(){
    return knowTruth;
  }
  
  public void useBrdswd() {
    weaponName = "Broadsword";
    damage = 385;
    stamina = 6;
    orgStam = stamina;
  }

  public void useKatana() {
    weaponName = "Katana";
    damage = 354;
    stamina = 8;
    orgStam = stamina;
  }

  public void useHammer() {
    weaponName = "Hammer";
    damage = 430;
    stamina = 5;
    orgStam = stamina;
  }

  public void useLnce() {
    weaponName = "Lance";
    damage = 373;
    stamina = 4;
    guard = 4;
    orgStam = stamina;
  }

  public void useBow() {
    weaponName = "Bow";
    damage = 143;
    stamina = 9;
    orgStam = stamina;
  }

  public String getName() {

    return name;
  }

  public int getHealth() {

    return health;
  }

  public int getNumPotions() {
    return numPotions;
  }

  public String getWeaponName() {

    return weaponName;
  }

  public double getDamage() {

    return damage;
  }

  public double getModDmg() {

    return modDmg;
  }

  public void setHealth(int num) {
    health = num;
  }

  public String attack1() {
    int hit = (int) (Math.random() * (5 - 1 + 1) + 1);

    if (hit == 5) {
      modDmg = 0;
      return "The monster dodged your attack! Watch out!!";
    }

    if (hit == 4) {
      modDmg += damage;
      return "Keep it up, " + name + "!";
    }

    if (hit == 3) {
      modDmg += damage;
      return "Amazing! Show no mercy!";
    }

    else
      modDmg += damage;
    return "The attack connected! Bravo!";
  }

  public String attack3() {
    modDmg = 0;
    double newDmg = damage * 2.5;
    int hit = (int) (Math.random() * (5 - 1 + 1) + 1);

    if (hit == 5) {
      modDmg = 0;
      return "The monster dodged your attack! Be wary!!";
    }

    if (hit == 4) {
      modDmg += newDmg;
      return "Great job, " + name + "!";
    }

    if (hit == 3) {
      modDmg += newDmg;
      return "Spectacular! Show no fear!";
    }

    else {
      modDmg += newDmg;
      return "The attack connected! Such grandeur!";
    }
  }

  public String attack2() {
    double newDmg = damage * 1.75;
    int hit = (int) (Math.random() * (5 - 1 + 1) + 1);

    if (hit == 5) {
      modDmg = 0;
      return "The monster sidestepped you! Be on your guard!!";
    }

    if (hit == 4) {
      modDmg += newDmg;
      return "Way to go, " + name + "!";
    }

    if (hit == 3) {
      modDmg += newDmg;
      return "Glorious, " + name + "! Express no pity!";
    }

    else {
      modDmg += newDmg;
      return "The attack linked! Such splendor!";
    }
  }

  public double attack4() {
    int hit = (int) (Math.random() * (5 - 1 + 1) + 1);

    if (hit == 4) {
      System.out.println("Critical hit!");
      System.out.println();
      modDmg = damage * 1.2;
    }

    if (hit == 3) {
      System.out.println("The attack hit weird!");
      modDmg = damage * 0.7;
    }

    else {
      modDmg = damage;
    }

    return modDmg;
  }

  public void grapple(int numHitz, Monster b) {
    System.out.println("You grappled onto the " + b.getName() + "! Time to strike!");
    System.out.println();
    int i = 0;
    int chance = 0;
    while (i <= numHitz) {

      chance = (int) (Math.random() * (4 - 1 + 1) + 1);
      if (chance != 3) {
        b.gotHit(attack4());
        System.out.println("Attack #" + i + "connected!!");
      }

      else {
        System.out.println("Attack # " + i + "missed! The monster tried to buck you off!");
      }
      useStamina();
      System.out.println();
      i++;
    }
  }

  public void elmtBoost() {
    damage = damage * 1.15;
  }

  public void elemDeduct() {
    damage = damage * 0.5;
  }

  public void dmged(double d) {
    health -= d;
  }

  public int getStamina() {
    return stamina;
  }

  public void useStamina() {
    stamina--;
  }

  public void useMoreStam(int amt) {
    stamina -= amt;
  }

  public void addStamina() {
    stamina++;
  }

  public void setStamina(int s) {
    stamina = s;
  }

  public String getElement() {
    return element;
  }

  public void setElement(String e) {
    element = e;
  }

  public void setStam(int num) {
    stamina = num;
  }

  public int getNumStamPotions() {
    return numStamPotions;
  }

  public int getGuard() {
    return guard;
  }

  public void useGuard() {
    guard--;
  }

  public String addGuard() {
    if (guard <= 2) {
      guard++;
      return "You have regenerated a guard!";
    } else
      return "";
  }

  public void setModDmg() {
    modDmg = 0;
  }

  public void changeMod(double num){
    modDmg = num;
  }
    
  public void instaKill(int dam) {
    modDmg = dam;
  }

  public void setNumStamPotions(int val) {
    numStamPotions = val;
  }

  public void setNumPotions(int val) {
    numPotions = val;
  }

  public void setGrapGun(boolean n) {
    hasGrapGun = n;
  }

  public boolean hasGrapGun() {
    return hasGrapGun;
  }

  public void setWyvernRush() {
    hasRush = true;
  }

  public boolean hasRush() {
    return hasRush;
  }

  public void wyvernRush() {
    Scanner in = new Scanner(System.in);
    System.out.println("Wyvern Rush activated!");
    boolean rush = true;
    while (rush) {
      // ask player how much health they want to change to damage (CHECK DOCUMENT)
      System.out.println("How much health will you sacrifice? You have " + health
          + " health points, but be wary... \n1. 10% \n2. 25% \n3. 30% \n(Type in a number):");
      String sac = in.next();

      if (sac.equals("1")) {
        modDmg += (health * 0.1);
        health -= (health * 0.1);
      }

      else if (sac.equals("2")) {
        modDmg += (health * 0.25);
        health -= (health * 0.25);
      }

      else if (sac.equals("3")) {
        modDmg += (health * 0.3);
        health -= (health * 0.3); 
      }

      else {
        System.out.println("Invalid input...Please try again...");
      }
    }
  }

  public void death(Monster killer) {
    System.out.println("\n\n\n" + name + ", get up! \n\n\n\n" + name + "!");
    System.out.println();
    System.out.println("\n\n\nGAME OVER\n\n");
    System.out.println(
        "The " + killer.getName() + " has overcome you! Your soul is now lost to the wilds and Mundulin has been laid to waste for all time...");
    System.out.println();
    System.out.println();
    System.out.println("Thanks for playing! Please retart the game if you would like to play again.");
    System.exit(0);

  }
}