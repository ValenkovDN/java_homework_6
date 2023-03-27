public class Computer {
    private String manufacturer;
    private String operating_system;
    private String colour;
    private int ram;
    private int hard_drive;

    public Computer(String manufacturer, String operating_system, String colour, int ram, int hard_drive) {
        this.manufacturer = manufacturer;
        this.operating_system = operating_system;
        this.colour = colour;
        this.ram = ram;
        this.hard_drive = hard_drive;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public String getColour() {
        return colour;
    }

    public int getRam() {
        return ram;
    }

    public int getHard_drive() {
        return hard_drive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Производитель='" + manufacturer + '\'' +
                ", Операционная система='" + operating_system + '\'' +
                ", Цвет='" + colour + '\'' +
                ", Объем ОЗУ=" + ram +
                ", Оъем жесткого диска=" + hard_drive +
                '}';
    }
}
