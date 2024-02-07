package org.example;

public class Cat implements Obstacles {
    private int runCat;
    public int jumpCat;

    public Cat(int runCat, int jumpCat) {
        this.runCat = runCat;
        this.jumpCat = jumpCat;
    }

    public int getRunCat() {
        return runCat;
    }

    public void setRunCat(int runCat) {
        this.runCat = runCat;
    }

    public int getJumpCat() {
        return jumpCat;
    }

    public void setJumpCat(int jumpCat) {
        this.jumpCat = jumpCat;
    }

    @Override
    public int run() {
        return getRunCat();
    }

    @Override
    public int jump() {
        return getJumpCat();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "runCat=" + runCat +
                ", jumpCat=" + jumpCat +
                '}';
    }
}
