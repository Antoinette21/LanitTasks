package main.java;

import main.java.animals.Kotik;

public class Application {
    public static void main(String[] args) {

        Kotik kotik1 = new Kotik("Ваня", "Мяу-мяу",  10, 5);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Тима");
        kotik2.setVoice("Мур");
        kotik2.setSatiety(7);
        kotik2.setWeight(3);
        String [] actionsByHour = kotik1.liveAnotherDay();
        for (String action : actionsByHour) {
            System.out.println(action);
        }
        System.out.println(kotik2.getName());
        System.out.println(kotik2.getWeight());
        System.out.println(compareVoice(kotik1, kotik2));
        System.out.println(kotik1.getCount());
        System.out.println(kotik2.getCount());

    }

    public static boolean compareVoice(Kotik kotikOne, Kotik kotikTwo){
        return kotikOne.getVoice() == kotikTwo.getVoice();
    }
}
