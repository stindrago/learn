public class recurse{

	public static void recurse(int accumulator, int b, int c, int d, int limit){
		if (limit == 0){
			System.out.println("B C D ----STAMPO----");
			System.out.print(b +" ");
			System.out.print(c +" ");
			System.out.println(d +" ");}
		else
			if (accumulator <limit){
				System.out.println(accumulator +" < " +limit);
				System.out.println("B           is: " +b);
				System.out.println("C           is: " +c);
				System.out.println("D           is: " +d);
				System.out.println("#######################");

				recurse(accumulator +1, b, c, d, limit);
				recurse(0, accumulator, b, c, d);}}

	public static void main(String[] args){
		int x=2;
		int y=3;
		int z=4;
		recurse(0,0,x,y,z);}}
