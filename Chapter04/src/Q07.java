
public class Q07 {

	public static void main(String[] args) {
		for(int j=2;j<=9;j++) {
			for(int i=1;i<=9;i++) {
				if((j%2)==0) {
					System.out.printf("%d X %d = %d \n", j, i, i*j);
				}
			}
			if((j%2)==0) {
				System.out.println("----------");
			}
		}

	}

}
