import java.util.HashSet;
import java.util.Scanner;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */
public class Main {
    public static int filtr(String s) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println(s);
        int number = iScanner.nextInt();
        return number;
    }

    public static String parameter(String s) {
        Scanner iScanner = new Scanner(System.in);
        String text;
        while (true) {
            System.out.println(s);
            try {
                text = iScanner.next();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }

        return text;
    }

    public static void main(String[] args) {
        Computer computer_1 = new Computer("lenovo", "Windows", "Black", 16, 1024);
        Computer computer_2 = new Computer("lenovo", "Windows", "Black", 16, 1024);
        Computer computer_3 = new Computer("lenovo", "Linux", "White", 8, 1024);
        Computer computer_4 = new Computer("ASUS", "Windows", "Black", 8, 512);
        Computer computer_5 = new Computer("ASUS", "Linux", "White", 32, 1024);
        Computer computer_6 = new Computer("HP", "Windows", "Black", 32, 512);
        Computer computer_7 = new Computer("HP", "Windows", "Black", 16, 512);
        Computer computer_8 = new Computer("HP", "Windows", "Golden", 16, 1024);

        HashSet<Computer> comp_list = new HashSet();
        comp_list.add(computer_1);
        comp_list.add(computer_2);
        comp_list.add(computer_3);
        comp_list.add(computer_4);
        comp_list.add(computer_5);
        comp_list.add(computer_6);
        comp_list.add(computer_7);
        comp_list.add(computer_8);

        System.out.println("Выберите интересующий вас компьютер: ");

        int poisk_parametr = filtr("Выберите параметры:\n 1 - Производитель, \n 2 - Операционная системы," +
                " \n 3 - Цвет, \n 4 - ОЗУ, \n 5 - Объем жесткого диска, \n 6 - Показать весь список ");


        if (poisk_parametr == 6) {
            for (Computer computer : comp_list) {
                System.out.println(computer.toString());
            }
        } else if (poisk_parametr == 1) {
            String str = parameter("Укажите производителя: ");
            for (Computer manufacturer : comp_list) {
                if (manufacturer.getManufacturer().equalsIgnoreCase(str)) {
                    System.out.println(manufacturer.toString());
                }
            }
        } else if (poisk_parametr == 2) {
            String str = parameter("Укажите операционную систему: ");
            for (Computer operating_system : comp_list) {
                if (operating_system.getOperating_system().equalsIgnoreCase(str)) {
                    System.out.println(operating_system.toString());
                }
            }
        } else if (poisk_parametr == 3) {
            String str = parameter("Укажите Цвет: ");
            for (Computer colour : comp_list) {
                if (colour.getColour().equalsIgnoreCase(str)) {
                    System.out.println(colour.toString());
                }
            }
        } else if (poisk_parametr == 4) {
            int str = filtr("Укажите объем ОЗУ: ");
            for (Computer ram : comp_list) {
                if (ram.getRam() == str) {
                    System.out.println(ram.toString());
                }
            }
        } else if (poisk_parametr == 5) {
            int str = filtr("Укажите объем жесткого диска: ");
            for (Computer hard_drive : comp_list) {
                if (hard_drive.getHard_drive() == str) {
                    System.out.println(hard_drive.toString());
                }
            }
        }

    }
}
