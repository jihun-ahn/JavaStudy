
public class Operator02 {

	public static void main(String[] args) {
		/* ���ڿ� �񱳴� Ư���� ����� �ʿ��ϴ�.
		 * �ܼ� �񱳿����� �ϸ� 
		 * String�� �޸𸮻����� ���ϱ� ������ ���ٰ� ��Ÿ����.
		 * new String�� ����� �ٸ� �ּҿ� ��ġ�ϰ� �ϰ� ���� ������ ������ ���� �ʴٴ� ����� ���´�.
		 *
		 * a.equals(b) ��� ����� ����ؼ� ���ϴ°��� ����.
		 */
		String str1 = "�ȳ�";
		String str2 = "�ȳ�";
		
		System.out.println("str1 == str2 : " +(str1==str2));
		
		String str3 = new String ("�ȳ�");
		String str4 = new String ("�ȳ�");
		
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
		System.out.println();
		System.out.println("str3 == str4 : " +(str3==str4));
		System.out.println("str3.equals(str4) : "+(str3.equals(str4)));




	}

}
