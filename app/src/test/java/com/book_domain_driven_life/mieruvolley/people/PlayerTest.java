package com.book_domain_driven_life.mieruvolley.people;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by matt on 2016/09/24.
 */
public class PlayerTest {
    @Test
    public void maxJump最高到達点未設定() {
        Player player = new Player();
        int expected = 0;
        int actual = player.maxJump();
        assertThat(actual, is(expected));
    }
    @Test
    public void maxJump70cm最高到達点設定済み() {
        Player player = new Player(70);
        int expected = 70;
        int actual = player.maxJump();
        assertThat(actual, is(expected));
    }
}