package ex01;

public class Main_class {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Card01 card1 = new Card01();
		Class clazz1 = card1.getClass();
		
		Card01 card1_1 = (Card01)clazz1.newInstance();

		System.out.println(card1.toString());
		System.out.println(card1_1.toString());
		///////////////////////////////////////////////////
		Class clazz2 = Card01.class;
		Card01 card2 = (Card01)clazz2.newInstance();
		System.out.println(card2.toString());
	
		/////////////////////////////////////////////////////
		Class clazz3 = Class.forName("ex01.Card01");
		
		Card01 card3 = (Card01)clazz3.newInstance();
		System.out.println(card3.toString());
		
		///////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
	
	}

}
