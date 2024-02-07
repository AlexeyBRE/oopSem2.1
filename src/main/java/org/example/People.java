package org.example;

public class People implements Obstacles {
    public int runPeople;
    public int jumpPeople;

    public People(int runPeople, int jumpPeople) {
        this.runPeople = runPeople;
        this.jumpPeople = jumpPeople;
    }


    public int getRunPeople() {
        return runPeople;
    }

    public void setRunPeople(int runPeople) {
        this.runPeople = runPeople;
    }

    public int getJumpPeople() {
        return jumpPeople;
    }

    public void setJumpPeople(int jumpPeople) {
        this.jumpPeople = jumpPeople;
    }

    @Override
    public int run() {
        return getRunPeople();
    }

    @Override
    public int jump() {
        return getJumpPeople();
    }

    @Override
    public String toString() {
        return "People{" +
                "runPeople=" + runPeople +
                ", jumpPeople=" + jumpPeople +
                '}';
    }
}
