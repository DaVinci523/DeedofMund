public class Monster {

  public int health;
  public int damage;
  public String name; 
  public double modDmg;
  private String weak;
  private String resist;
  
  //Array of possible names for monsters (use Math.random to access a different one every time)
  private String monsterNames[] = {"","Anjanarc", "Diablon", "Rathalok", "Nergigan", "Tigrev", "Zinzire", "Rajanj", "Glavonus", "Bareoth", "Fuegran", "Nargacoon"};
  
  public Monster(){
    name = monsterNames[(int)(Math.random() * ((monsterNames.length - 1) - 1 + 1 ) + 1)];
    
    if(name.equals("Diablon")){
      setDiablos();
    }
    else if(name.equals("Anjanarc")){
      setAnjanath();
    }

    else if(name.equals("Rathalok")){
      setRathalos();
    }

    else if(name.equals("Nergigan")){
      setNergigante();
    }

    else if(name.equals("Tigrev")){
      setTigrex();
    }

    else if(name.equals("Zinzire")){
      setZinogre();
    }

    else if(name.equals("Rajanj")){
      setRajang();
    }

    else if(name.equals("Glavonus")){
      setGlavenus();
    }

    else if(name.equals("Bareoth")){
      setBarioth();
    }

    else if(name.equals("Fuegran")){
      setTeostra();
    }

    else if(name.equals("Nargacoon")){
      setNargacuga();
    }
  }

  public Monster(String s){
    name = s;
  }

  public int instaKill(){
    return health;
  }
  
  public void setFiend(){
    name = "unknown monster";
    health = 3000;
    damage = 350;
    weak = "none";
    resist = "all";
  }

  public void setMidEkkius(){
    name = "monster";
    health = 5000;
    damage = 350;
    weak = "none";
    resist = "all";
  }
  
  public void setEkkius(){
    name = "Ekkius";
    health = 10000;
    damage = 400;
    weak = "none";
    resist = "all";
  }

  public void weakenMon(){
    health = (int) (health - (health *.5));
    damage = (int) (damage - (damage * .25));
  }  
  public void setAnjanath(){
    health = 2517;
    damage = 128;
    weak = "water";
    resist = "fire";
  }

  public void setDiablos(){
    health = 2752;
    damage = 153;
    weak = "fire";
    resist = "earth";
  }

  public void setRathalos(){
    health = 2204;
    damage = 168;
    weak = "water";
    resist = "thunder";
  }
  
  public void setNergigante(){
    health = 3002;
    damage = 211;  
    weak = "earth";
    resist = "water";
  }

  public void setTigrex(){
    health = 2554;
    damage = 192;
    weak = "wind";
    resist = "water";
  }

  public void setZinogre(){
    health = 2303;
    damage = 183;
    weak = "fire";
    resist = "thunder";
  }

  public void setRajang(){
    health = 2807;
    damage = 252;
    weak = "thunder";
    resist = "ice";
  }
  
  public void setGlavenus(){
    health = 3352;
    damage = 175;
    weak = "ice";
    resist = "fire";
  }

  public void setAlatreon(){
    health = 3056;
    damage = 270;
    weak = "wind";
    resist = "earth";
  }

  public void setBarioth(){
    health = 2983;
    damage = 201;
    weak = "thunder";
    resist = "ice";
  }

  public void setTeostra(){
    health = 2433;
    damage = 174;
    weak = "ice";
    resist = "wind";
  }

  public void setNargacuga(){
    health = 3108;
    damage = 167;
    weak = "earth";
    resist = "wind";
  }
  
  public String getName(){
    return name;
  }

  public int getHealth(){
    return health;
  }

  public double getDamage(){
    return damage;
  }

  public String getWeak(){
    return weak;
  }

  public String getResist(){
    return resist;
  }
  
  public double gotHit(double d){

      health -= d;
      return health;
  }

  public String heal(double add){
      health += add;
      return ("The monster healed for " + add + " points of health! It's health is now " + health + ".");
  }
  
  public double getModDmg(){

    return modDmg;
  }
  

  public String monAttack(){
    int hit = (int) (Math.random() * (5-1+1)+1);
    if(hit == 4){
      modDmg = damage * 1.25;
     return "CRITICAL HIT!!! Brace yourself!!!";
    }

    else if(hit == 3){
      modDmg = damage * 0.75;
      return "The monster strikes sloppily, a lucky break!";  
    }
      
    else{
      modDmg = damage;
      return "The monster lands a solid hit!";
    }
  }
  
public String playerDodge(){
    int miss = (int) (Math.random() * (2-1+1)+1);

    if (miss == 1){
      modDmg = 0;
      return "You dodged the attack!!";
    }

    else{
      modDmg = damage;
      return "The attack still hit you...";
    }
  }


public void playerGuard(){

  modDmg -= (damage * 0.5);
  
}
  public void death(){
      health = 0; 
  }

  public void setName(String n){
    name = n;
  }
}
  
