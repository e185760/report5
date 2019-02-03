package jp.ac.uryukyu.ie.e185760;

/**
 * ヒーロークラスと敵クラスの共通部分をまとめたスーパークラス。
 * String name; //ヒーローや敵の名前
 * int hitPoint; //ヒーローや敵のHP
 * int attack; //ヒーローや敵の攻撃値
 * boolean dead; //ヒーローや敵の生死状態　true = 死
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    public LivingThing( String name, int hitPoint, int attack ){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;

    }

    public boolean isDead(){
        return dead;
    }
    public String getName(){ return name; }

    /**
     * opponentを攻撃するメソッド。
     * @param opponent 攻撃する相手
     */
    public void attack(LivingThing opponent){
        if( isDead() == false ){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
    public void setName(String name){this.name = name;}
    public int getHitPoint(){return hitPoint;}
    public void setHitPoint(int hitPoint){this.hitPoint = hitPoint;}
    public int getAttack(){return attack;}
    public void setAttack(int attack){this.attack = attack;}
    public void setDead(boolean dead){this.dead = dead;}
}
