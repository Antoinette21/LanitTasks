package main.java.animals;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;

    private static int count = 0;
    private static final int METHODS = 5;
    public Kotik(){
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight){
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public boolean play(){
        if(satiety > 0){
            satiety--;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean sleep(){
        if(satiety > 0){
            satiety--;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean wash(){
        if(satiety > 0){
            satiety--;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean walk(){
        if(satiety > 0){
            satiety--;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean hunt(){
        if(satiety > 0){
            satiety--;
            return true;
        }
        else {
            return false;
        }
    }

    public void eat(int countSonditionalSatiety){
       satiety += countSonditionalSatiety;
    }

    public void eat(String nameFood, int countSonditionalSatiety){
        satiety += countSonditionalSatiety;
    }

    public void eat(){
        eat("eat", 1);
    }

    public String[] liveAnotherDay(){
        String [] actions = new String[24];

        for (int i = 0; i < actions.length; i++) {
            int randomMethod = (int) (Math.random() * METHODS) + 1;

            switch (randomMethod) {
                case 1:
                    boolean isPlay = play();
                    if (isPlay) {
                        actions[i] = i + " - играл";
                    } else {
                        eat();
                        actions[i] = i + " - ел";
                    }
                    break;
                case 2:
                    boolean isSleep = sleep();
                    if (isSleep) {
                        actions[i] = i + " - спал";
                    } else {
                        eat();
                        actions[i] = i + " - ел";
                    }
                    break;

                case 3:
                    boolean isWalk = walk();
                    if (isWalk) {
                        actions[i] = i + " - гулял";
                    } else {
                        eat();
                        actions[i] = i + " - ел";
                    }

                    break;
                case 4:
                    boolean isWash = wash();
                    if (isWash) {
                        actions[i] = i + " - умывался";
                    } else {
                        eat();
                        actions[i] = i + " - ел";
                    }
                    break;

                case 5:
                    boolean isHunt = hunt();
                    if (isHunt) {
                        actions[i] = i + " - охотился";
                    } else {
                        eat();
                        actions[i] = i + " - ел";
                    }
                    break;
            }
        }
        return actions;
    }
}
