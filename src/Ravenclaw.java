public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;

    public Ravenclaw(String fullName,
                     int magicPower,
                     int transgressionDistance,
                     int smart,
                     int wise,
                     int witty) {
        super(fullName, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public String toString() {
        return "|Имя: " + getFullName() + "| " +
                "|Магическая сила: " + getMagicPower() + "| " +
                "|Расстоянние трансгрессии: " + getTransgressionDistance() + "| " +
                "|Ум: " + getSmart() + "| " +
                "|Мудрость: " + getWise() + "| " +
                "|Остроумие и креатив: " + getWitty() + "|";
    }
}
