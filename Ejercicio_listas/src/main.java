import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		int n = 30;
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				divisores.add(i);
			}
		}
		System.out.println(divisores);
		
	}
	
}
