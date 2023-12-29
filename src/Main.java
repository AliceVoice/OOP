public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 77, 30, 45, 64, 12);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 40, 70, 25, 14, 32);
        Gryffindor ron = new Gryffindor("Рон Уизли", 10, 20, 65, 14, 42);

        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 11, 53, 23, 75, 32);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 21, 13, 33, 74, 12);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 60, 83, 13, 25, 42);

        Ravenclaw chou = new Ravenclaw("Чжоу Чанг", 54, 12, 75, 23, 18);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 34, 15, 35, 13, 28);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 52, 16, 71, 22, 16);

        Slytherin drako = new Slytherin("Драко Малфой", 11, 45, 23, 43, 21, 3, 1);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 11, 15, 13, 46, 1, 4, 7);
        Slytherin gregory = new Slytherin("Грегори Гойл", 26, 41, 33, 33, 31, 2, 4);

        PrintService.BestHogwartsStudent(harry,drako);
    }
}