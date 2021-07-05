package com.example.prmn2021s.Lecture1;

public class Main {
    public static void main(String[] args) {

    //課題1_1
        System.out.println("b2190960 Sato Akira");

    //課題1_2
        int studentNumber = 2190960;
        System.out.println("b" + studentNumber + "Sato Akira");

    //課題1_3
        int age = 21;
        if (age < 20){
            System.out.println("I am " + age + "years old so I cannot drink liquorr");
        }else{
            System.out.println("I am " + age + "years old so I can drink liquorr");
        }

    //課題1_4
        int array[] = new int[100];
        int sum = 0;
        for(int i = 0;i < 100; i++){
            array[i] = i + 1;
            if (i%2 == 0){
                sum = array[i];
            }
        }System.out.println(sum);

    //課題1_5
        int[] score = {41,85,72,38,80};

        int Max = max(score);
        int Min = min(score);
        double Average = average(score);

        for (int i = 0; i < score.length; i++){
            if (score[i] >= 90){
                System.out.println(i + "番目" + score[i] + "点　秀");
            }else if (score[i] >= 80){
                System.out.println(i + "番目" + score[i] + "点　優");
            }else if (score[i] >= 70) {
                System.out.println(i + "番目" + score[i] + "点　良");
            }else if (score[i] >= 60){
                System.out.println(i + "番目" + score[i] + "点　可");
            }else {
                System.out.println(i + "番目" + score[i] + "点　不可");
            }
        }

        System.out.println("最高点；" + Max);
        System.out.println("最低点" + Min);
        System.out.println("平均点" + Average);

    }

    private static int max(int[] score){
        int Max = 0;
        for (int i = 0; i < score.length; i++){
            if (score[i] > Max){
                Max = score[i];
            }
        }
        return Max;
    }

    private static int min(int[] score){
        int Min = 100;
        for (int i = 0; i < score.length; i++){
            if (score[i] < Min){
                Min = score[i];
            }
        }
        return Min;
    }

    private static double average(int[] score){
        double sum =0;
        for (int i = 0; i < score.length ; i++){
            sum += score[i];
        }
        return sum/score.length;
    }
}
