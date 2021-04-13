package nori.sample.app;

public class Main{
	public static void main(String[] args){

		java.util.ArrayList<Integer> array=new java.util.ArrayList<Integer>();

		for(int i=0;i<10;i++)
			array.add(i);
		System.out.println("拡張for文を使います。");
		
		for(int i : array)
			i=100;
		
		System.out.println("拡張for適用後");
		for(int i : array)
			System.out.println(i);

		System.out.println("結果は値渡しとなりました。");
	}
}
