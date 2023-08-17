public class SecondTask {
    public static void main(String[] args) {
        int startScore = 740;
        int refillScore = 2013;

        int bonusScore;
        if (refillScore > 1000) {
            bonusScore = refillScore / 100;
        } else {
            bonusScore = 0;
        }

        int bonus = refillScore + bonusScore;
        int score = startScore + bonus;

        System.out.println("Счет: " + startScore );
        System.out.println("Сумма пополнения: " + refillScore );
        System.out.println("Бонус составляет: " + bonusScore );
        System.out.println("Итоговая сумма пополнения: " + bonus );
        System.out.println("На счету: " + score );
    }
}
