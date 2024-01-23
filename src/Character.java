
public  abstract class Character {
	
	String name ;
	int hp;
	
	
	public void run() {
		System.out.print(this.name + "は逃げ出した");
		
	}
	
	//中身が決まってない抽象メソッドとして宣言
		
	public abstract void attack(Matango m);  
	
	
	//メソッドがなくても抽象クラスだけ設定することもできる
	
	//public  void attack(Matango m) {
	//}       
}
