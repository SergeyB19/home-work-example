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
        // задание №4
        int weight = 7;
        int gramsInKg = 1000;
        int weightInGrams = weight*gramsInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays =  weightInGrams / maxGramsPerDay;
        int maxDays = weightInGrams / minGramsPerDay;

        double avgDays = (minDays+maxDays)/(2*1.0);
        System.out.println("Min " + minDays);
        System.out.println("Max " + maxDays);
        System.out.println("Avg " + avgDays);

        // задание №5
        int percent = 10;
        double multiplier = percent/(100*1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary*multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary*multiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary*multiplier));

        int mashaDifferense = mashaNewSalary * 12 - mashaSalary * 12;
        int denisDifferense = (denisNewSalary - denisSalary) * 12;
        int kristinaDifferense = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifferense + " Рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifferense + " Рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifferense + " Рублей");














    }
}