package ru.netology.Rush61;

public class RestService {
    public int restCalc(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int mounth = 1; mounth < 13; mounth++) {
            if (money > threshold) {
                money = (money - expenses) / 4;
                count++;
            } else {
                money = money + income - expenses;
            }


        }
        return count;
    }
}
