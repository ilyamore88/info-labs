import java.util.Vector;

public class Backpack {
    static Vector ansV = new Vector();
    static int[] w = {8, 4, 5, 9, 3, 1, 10};    //Массив с элементами суммы
    static int s = 20;  //Искомая сумма
    static int[][] answ = new int[w.length + 1][s + 1];     //Массив, с помощью которого находим ответ

    public static void main(String[] args) {
        //Инициализация массива
        for (int i = 0; i < s + 1; i++) {
            answ[0][i] = 0;
        }
        for (int i = 0; i < w.length + 1; i++) {
            answ[i][0] = 0;
        }
        //Заполнение массива
        for (int n = 1; n < w.length + 1; n++) {
            for (int sum = 1; sum < s + 1; sum++) {
                if (sum >= w[n - 1]) {
                    answ[n][sum] = Math.max(answ[n - 1][sum], answ[n - 1][sum - w[n - 1]] + w[n - 1]);  //Либо берём, либо нет
                } else {
                    answ[n][sum] = answ[n - 1][sum];    //Если не влезает, то точно не берём
                }
            }
        }
        findAnswer(w.length, s);    //Поиск ответа по массиву
        //Заполнение бинарного вектора
        Vector x = new Vector();
        for (int i = 0; i < w.length - ansV.size(); i++) {
            x.add(0);   //Заполняем нулями (кол-во нулей = кол-ву не выбранных элементов
        }
        for (int i = 0; i < ansV.size(); i++) {
            x.add((int) ansV.get(i), 1);    //Вставляем 1 на места элементов, которые берём
        }
        System.out.println(x);
    }

    static void findAnswer(int n, int sum) {
        if (answ[n][sum] == 0) {    //Если сумма равна нулю, то выходим из рекурсии
            return;
        }
        if (answ[n - 1][sum] == answ[n][sum]) {     //Если сумма равна сумме без этого элемента, то переходим к предыдущей сумме без этого элем-та (его не берём)
            findAnswer(n - 1, sum);
        } else {    //Иначе берём этот элемент и записываем его индекс в вектор
            findAnswer(n - 1, sum - w[n - 1]);
            ansV.add(n - 1);
        }
    }
}
