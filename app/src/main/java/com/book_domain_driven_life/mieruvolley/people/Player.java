package com.book_domain_driven_life.mieruvolley.people;

/**
 * Created by matt on 2016/09/24.
 */

public class Player {

    private int maxJump;

    Player() {}

    Player(int maxJump) {
        this.maxJump = maxJump;
    }

    public int maxJump() {
        return maxJump;
    }
}
