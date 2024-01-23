
public class Matango {

//	int hp; //フィールド宣言と初期値追加
//	final int LEVEL = 10; //LEVEL大文字
//
//	char suffix; //suffix 通し番号
//
//	public void run() {
//		System.out.println("お化けキノコ" + this.suffix + "は逃げだした！");

	
	int hp = 50;
	final int LEVEL = 10;
	char suffix;
	
	//フィールドに引数を設定
	public Matango(char suffix) {
		this.suffix = suffix;
	}

 	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げだした！");	
 	}
	
	
//	public void attack(Hero h) {
//		
//		System.out.println("キノコ" + this.suffix + "の攻撃");
//		System.out.println(h.name + "を攻撃。10のダメージ");
//		h.hp -= 10;
//	}
//
//	
//	public void attack(Wizard w) {
//		
//		System.out.println("キノコ" + this.suffix + "の攻撃");
//		System.out.println(w.name + "を攻撃。10のダメージ");
//		w.hp -= 10;
//	}

	
	//これだとめんどくさい　オーバーロードの多重定義をいちいちしなくてはいけなくなる

	public void attack(Character c) {
		
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println(c.name + "を攻撃。10のダメージ");
		c.hp -= 10;
	}



}
