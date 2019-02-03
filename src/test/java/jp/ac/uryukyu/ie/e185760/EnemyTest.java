package jp.ac.uryukyu.ie.e185760;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void wounded() {
        Hero hero = new Hero("勇者",10,5);
        Enemy enemy = new Enemy("スライム", 6,3);
        hero.wounded(5);
        assertEquals(5,hero.getHitPoint());
    }
}