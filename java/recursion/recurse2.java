public class recurse{

	public static void recurse(int accumulator, int a, int b, int limit){
		if (limit == 0){
			System.out.print(a +" ");
			System.out.println(b +" ");}
		else
			if (accumulator <limit){
				recurse(accumulator +1, a, b, limit);
				recurse(0, accumulator, a, b);}}

	public static void main(String[] args){
		int a=2;
		int b=1;
		System.out.println("B C D E----STAMPO----");
		recurse(0,0,a,b);}}
