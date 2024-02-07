package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GoMarafon m1 = new GoMarafon(250,40);

        List<Obstacles> uch = new ArrayList<>(Arrays.asList(
                new Robot(39, 300),
                new Cat(200, 44),
                new People(400,41)
        ));
        for (Obstacles item:uch) {
            m1.goJump(item);

            };

        };

        }
