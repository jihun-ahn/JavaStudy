
public class Variable02 {

	public static void main(String[] args) {
		byte a;
		short b;
		int c;
		long d;
		
		a = -128;
		a = 127;
//		a = 121;
//		b = 32000;
//		
//		c = 220000000;
		d = 2200000000L;
		
		//�Ǽ��� �ڷ���
		
		float e;
		double f;
		
		e = 3.14f;
		f = 3.14e+14;
		
		//���ͷ�
		
		//����
		
		char g = 52240;
//		char h = '��';
		System.out.println("g�� �� ���� : "+g);
//		System.out.println("h�� �� ���� : "+h);
		
		//�� �ڷ���
		boolean i = true;
		boolean j = false;
		
		System.out.println("i�� ������ : "+i);
		System.out.println("j�� ������ : "+j);
		int engScore;
		int mathScore;
		engScore = 55;
		mathScore = 75;
		
		boolean k = engScore > mathScore;
		System.out.println("������������ ���������� �� ū��? "+k);
	}

}
