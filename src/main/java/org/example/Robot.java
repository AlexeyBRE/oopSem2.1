package org.example;

public class Robot implements Obstacles{
    private int jumpRob;
    private  int runRob ;

    public Robot(int jumpRob, int runRob) {
        this.jumpRob = jumpRob;
        this.runRob = runRob;
    }


    @Override
    public int run() {
    return getRunRob();
    }

    @Override
    public int jump() {
        return getJumpRob();
    }


    public int getJumpRob() {
        return jumpRob;
    }

    public void setJumpRob(int jumpRob) {
        this.jumpRob = jumpRob;
    }

    public int getRunRob() {
        return runRob;
    }

    public void setRunRob(int runRob) {
        this.runRob = runRob;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "jumpRob=" + jumpRob +
                ", runRob=" + runRob +
                '}';
    }
}
