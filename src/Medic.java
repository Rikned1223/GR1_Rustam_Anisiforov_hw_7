public class Medic extends Hero {

    private double healPoints;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    public Medic(int health, int damage, String superPowersType, double healPoints) {
        super(health, damage, superPowersType);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic ïðèìåíèë ñóïåðñïîñîáíîñòü: " + getSuperPowersType());
    }

    public String increaseExperience(){
        double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Heal Points: " + healPoints + " óâåëè÷åëñÿ íà 10% ñòàëî: " + tenPercent;
    }

    public String info (){
        return super.info() + " " +  this.healPoints;
    }
}


