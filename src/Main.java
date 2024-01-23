public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//インスタンス生成
		
		Matango m = new Matango('A');
		Hero h = new Hero();
		Character w = new Wizard(); //キャラクター型にはfireballのメソッドがないため使えない
		
		//Hero h2 = (Hero)w;  
		//文法的にはダウンキャストできるが、実際にはインスタンスの型が違うとできない
		//ウィザードをヒーロー型にダウンキャスト
		
		if(w instanceof Hero) {
			Hero h2 = (Hero)w;  
		}
		
		//Wizard w2 = (Wizard) w; //キャスト変換　親から子に変換することをダウンキャスト
		//w2.fireball();

		Character[] characters = { h, w};

		//		ArrayList<Character> characters = new ArrayList<Character>();
		//		characters.add(new Hero());
		//		characters.add(new Wizard());

		for (Character c : characters) {
			if (c instanceof Wizard) { //cの中身がWizardか判定できる
				Wizard w3 = (Wizard) c;
				w3.fireball();
			} else {

				c.attack(m);
			}

			//ダウンキャストの注意点
			//継承関係にないものはダウンキャストできない
			//Matango m3 = (Matango) m

		}
	}

}
