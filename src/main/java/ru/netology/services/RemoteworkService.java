package ru.netology.services;
public class RemoteworkService {
    public  int calculate(int income, int expenses, int threshold) {
        int cash = 0;
        int monthCounter = 0;

        for (int i = 0; i < 12; i++) {
            if (cash >= threshold) {
                //условие для отдыха выполнено
                cash -= expenses;
                cash /= 3;
                monthCounter++;
            } else {
                //условие по которому остаемся работать
                cash += income;
                cash -= expenses;
            }
            
        }

        return monthCounter;
    }
}
