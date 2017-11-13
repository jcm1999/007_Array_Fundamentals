package array_fun;

public class TheMainClass {

	public static void main(String[] args) {
		
		confirmMain("We are in main()");
		
		ArrayFun learnArrays = new ArrayFun();
		
		//learnArrays.showInstructions();
		//learnArrays.intArrayExample();
		
		Matrix my2D = new Matrix();
		//my2D.test2D();
		my2D.gameBoard();

	}

	private static void confirmMain(String string) {
		System.out.println(string);
		
	}

}