package chapter01;

public class ConsoleOutput01 {

	public static void main(String[] args) {
	//�ܼ� ���
	System.out.println("�ȳ��ϼ���");
	System.out.println(20);
	System.out.println(20+7);
	System.out.println("�ȳ�"+"�ϼ���");
	System.out.println("20"+7); // ���� + �� ���ڸ� �̾���̴� �ǹ�
	
	System.out.print("�ȳ��ϼ���");
	System.out.print("�ȳ�"+"�ϼ���"); // println�� print�� �ٹٲް� ������ �� ���� ���̰� �ִ�
	System.out.println();
	System.out.printf("�� �̸��� %s�Դϴ�. \n", "ȫ�浿");
	System.out.printf("�� �ڹ� ������ %d���Դϴ�. \n", 90);
	}
}