package org.example;

public class GoMarafon {
    private int distance;
    private int woll;
    Obstacles obstacl;

    public GoMarafon(int distance, int woll) {
        this.distance = distance;
        this.woll = woll;
    }


    void goJump(Obstacles obstacles){
        obstacl = obstacles;
        if(obstacles.jump() >= woll){
            System.out.println("перепрыгнул");
            if (obstacles.run()>=distance){
                System.out.println("пробежал");
            }
            else System.out.println("не пробежал");
        }
        else System.out.println("не перепрыгнул");
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getWoll() {
        return woll;
    }

    public void setWoll(int woll) {
        this.woll = woll;
    }
}
