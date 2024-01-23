
public class Wizard extends Character {

	public Wizard() {

		this.name = "魔法使い";
		this.hp = 50;
		
	}

	public void attack(Matango m) {

		System.out.println(this.name + "の魔法攻撃");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

	public void fireball() {
		System.out.println( "炎の球を発射!!");
	}
	
	
}
