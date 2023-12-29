public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstOfPower;

    public Slytherin(String fullName,
                     int magicPower,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int thirstOfPower) {
        super(fullName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstOfPower() {
        return thirstOfPower;
    }

    public void setThirstOfPower(int thirstOfPower) {
        this.thirstOfPower = thirstOfPower;
    }

    @Override
    public String toString() {
        return "|Имя: " + getFullName() + "| " +
                "|Магическая сила: " + getMagicPower() + "| " +
                "|Расстоянние трансгрессии: " + getTransgressionDistance() + "| " +
                "|Хитрость: " + getCunning() + "| " +
                "|Решительность: " + getDetermination() + "| " +
                "|Амбициозность: " + getAmbition() + "| " +
                "|Находчивость: " + getResourcefulness() + "| " +
                "|Жажда власти: " + getThirstOfPower() + "|";
    }
}
