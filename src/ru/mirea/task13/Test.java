package ru.mirea.task13;

// Риверс длинной строки с помощью String и StringBuffer
public class Test {
	public static void main(String[] args) {
		long beginTime, elapsedTime;
// Build a long string
		String str = "";
		int size = 16536;
		char ch = 'a';
// Эталонное время в наносекундах
		beginTime = System.nanoTime();
		for (int count = 0; count < size; ++count) {
			str += ch;
			++ch;
			if (ch > 'z') {
				ch = 'a';
			}
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " +
				elapsedTime/1000 + " usec (Build String)");
/* Риверс строки, строим другую строку за символом в
обратном порядке*/
		String strReverse = "";
		beginTime = System.nanoTime();
		for (int pos = str.length() - 1; pos >= 0 ; pos--) {
			strReverse += str.charAt(pos); // Конкатенация
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " +
				elapsedTime/1000 + " usec (Using String to reverse)");
// Риверс строки через пустой StringBuffer путем
 		beginTime = System.nanoTime();
		StringBuffer sBufferReverse = new StringBuffer(size);
		for (int pos = str.length() - 1; pos >= 0 ; pos--) {
			sBufferReverse.append(str.charAt(pos)); // append
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " +  elapsedTime/1000 + " usec (Using StringBuffer to reverse)");
/* Reverse a String by creating a StringBuffer with
the given String and invoke its reverse()*/
		beginTime = System.nanoTime();
		StringBuffer sBufferReverseMethod = new
				StringBuffer(str);
		sBufferReverseMethod.reverse(); // use reverse() method
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuffer's reverse() method)");
/* Reverse a String via an empty StringBuilder by
appending characters in the reverse order*/
		beginTime = System.nanoTime();
		StringBuilder sBuilderReverse = new
				StringBuilder(size);
		for (int pos = str.length() - 1; pos >= 0 ; pos--) {
			sBuilderReverse.append(str.charAt(pos));
		}
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " +  elapsedTime/1000 + " usec (Using StringBuilder to reverse)");

		beginTime = System.nanoTime();
		StringBuffer sBuilderReverseMethod = new
				StringBuffer(str);
		sBuilderReverseMethod.reverse();
		elapsedTime = System.nanoTime() - beginTime;
		System.out.println("Elapsed Time is " +
						elapsedTime/1000 + " usec (Using StringBuidler's reverse() method)");
	}
}