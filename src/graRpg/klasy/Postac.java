package graRpg.klasy;

public class Postac {
    private String name;

    private String type;
    private int physicalPower;

    private int speedPower;

    private int magicPower;

    public Postac(String name, String type, int physicalPower, int speedPower, int magicPower) {
        this.name = name;
        this.type = type;
        this.physicalPower = physicalPower;
        this.speedPower = speedPower;
        this.magicPower = magicPower;
    }

    @Override
    public String toString() {
        return "Postac{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", physicalPower=" + physicalPower +
                ", speedPower=" + speedPower +
                ", magicPower=" + magicPower +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPhysicalPower() {
        return physicalPower;
    }

    public int getSpeedPower() {
        return speedPower;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPhysicalPower(int physicalPower) {
        this.physicalPower = physicalPower;
    }

    public void setSpeedPower(int speedPower) {
        this.speedPower = speedPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
}
