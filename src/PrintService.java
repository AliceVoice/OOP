public class PrintService {
    public void BestGryffindorStudent(Gryffindor student1, Gryffindor student2) {
        int sumStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sumStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getFullName() + " лучший Гриффиндорец, чем " + student2.getFullName());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getFullName() + " лучший Гриффиндорец, чем " + student1.getFullName());

        }
    }

    public void BestHufflepuffStudent(Hufflepuff student1, Hufflepuff student2) {
        int sumStudent1 = student1.getHardworking() + student1.getHonest() + student1.getLoyal();
        int sumStudent2 = student2.getHardworking() + student2.getHonest() + student2.getLoyal();

        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getFullName() + " лучший Пуффендуец, чем " + student2.getFullName());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getFullName() + " лучший Пуффендуец, чем " + student1.getFullName());

        }
    }

    public void BestRavenclawStudent(Ravenclaw student1, Ravenclaw student2) {
        int sumStudent1 = student1.getSmart() + student1.getWise() + student1.getWitty();
        int sumStudent2 = student2.getSmart() + student2.getWise() + student2.getWitty();

        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getFullName() + " лучший Когтевранец, чем " + student2.getFullName());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getFullName() + " лучший Когтевранец, чем " + student1.getFullName());

        }
    }

    public void BestSlytherinStudent(Slytherin student1, Slytherin student2) {
        int sumStudent1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getThirstOfPower() + student1.getResourcefulness();
        int sumStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getThirstOfPower() + student2.getResourcefulness();

        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getFullName() + " лучший Слизеренец, чем " + student2.getFullName());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getFullName() + " лучший Слизеренец, чем " + student1.getFullName());

        }

    }

    public void BestHogwartsStudent(Hogwarts student1, Hogwarts student2) {
        int sumStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int sumStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();

        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getFullName() + " в совокупности обладает большей магией и расстоянием трансгрессии, чем " + student2.getFullName());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(student2.getFullName() + " в совокупности обладает большей магией и расстоянием трансгрессии, чем " + student1.getFullName());
        }
    }

}
