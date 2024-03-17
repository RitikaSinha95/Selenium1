package BsicPractice1;

public class BlankforLoop {

	public static void main(String[] args) 
		throws java.io.IOException {
			char ch;
			for(; ;  )
			{
				System.out.print("input");
			ch = (char) System.in.read();
			
			// get a char 
			if(ch == 'q') 
			break;
			}
			System.out.print("You pressed q!");
		

	}

}
