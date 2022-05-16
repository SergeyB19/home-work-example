public class Main {
    public static void main(String[] args) {
        System.out.println("Пишем наше ДЗ!");
        System.out.println("Делаем коммит и пуш!");
        System.out.println("Переходим в Гитхаб");
        // задание №1
        char c = 33;
        char d = '!';
        System.out.println(c + " = " + d);
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeight = 4.5;
        float soltWeight = 1.5f;
        boolean dogisAdult = dog>10;
        // задание №2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        double weightOfDifference = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров " + weightOfDifference);
        // задание №3
        var bananas = 5;
        var bananWeight = 80;
        var bananasWeightTotal = bananas * bananWeight;
        var milk = 2;
        var milkWeigth = 105;
        var milkWeigthTotal = milk*milkWeigth;
        var icecream = 2;
        var icecreamWeight = 100;
        var icecreamWeightTotal = icecream * icecreamWeight;
        var rawEggs = 4;
        var rawEggsWeight = 70;
        var rawEggsWeightTotal = rawEggs * rawEggsWeight;
        var totalWeightSportsBreakfast = bananasWeightTotal+milkWeigthTotal+icecreamWeightTotal+rawEggsWeightTotal;
        System.out.println("Общий вес завтрака " + totalWeightSportsBreakfast+ " грамм");
        int grPerKg = 1000;
        float totalWeighKilogram = totalWeightSportsBreakfast / grPerKg;
        System.out.println("Общий вес завтрака " + totalWeighKilogram+ " кг");






    }
}