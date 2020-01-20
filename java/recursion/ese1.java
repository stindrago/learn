public class recurse{

	public static void decrement(int from, int to){
		if(from ==to) System.out.println("Arrivato a" +to);
		else{
			System.out.println(from);
			decrement(from -1, to);}
	}


	public static void patern1(){
		int rows = 5;

		for(int i = 1; i <= rows; ++i)
			{
				for(int j = 1; j <= i; ++j)
					{
						System.out.print(j + " ");
					}
				System.out.println("");
			}
	}

	public static void patern_r(int i, int j, int rows){
		if(i > rows);
		else if(j <=i){
			System.out.print(j + " ");
			patern_r(i, j +1, rows);}
		else {
			System.out.println("");
			patern_r(i +1, 1, rows);
		}
	}

	public static void patern_r2(int i, int j, int rows){
		if(rows ==1) System.out.println("1");
		else if(i <rows){
			System.out.print(j + " ");
			patern_r2(i, j +1, rows);}
		else {
			System.out.println("");
			patern_r2(i +1, 1, rows-1);
		}
	}


	public static void main(String[] args){
		//decrement(5,2);
		//patern1();
		patern_r2(1, 1, 5);
	}}
