package money;

import java.util.*;

// Compiler version JDK 11.0.2
class Monnaie {
	public Monnaie() {

	}

	public Monnaie(long i, long j, long k) {
		// TODO Auto-generated constructor stub
		piece2 = i;
		piece5 = j;
		piece10 = k;
	}

	long piece2 = 0;
	long piece5 = 0;
	long piece10 = 0;
}

public class TakeBackMoney {
	public static void main(String args[]) {
		Monnaie money1 = monnaieOptimale(1);
		if (money1 == null)
			System.out.println("good");
		Monnaie money5 = monnaieOptimale(5);
		if (money5.piece5 == 1)
			System.out.println("good");
		else
			System.err.println("bad");
		Monnaie money10 = monnaieOptimale(10);
		if (money10.piece10 == 1)
			System.out.println("good");
		else
			System.err.println("bad");
		Monnaie money4 = monnaieOptimale(4);
		if (money4.piece2 == 2)
			System.out.println("good");
		else
			System.err.println("bad");
		Monnaie money15 = monnaieOptimale(15);
		if (money15.piece5 == 1 && money15.piece10 == 1 && money15.piece2 == 0)
			System.out.println("good");
		else
			System.err.println("bad");
		Monnaie money29 = monnaieOptimale(29);
		if (money29.piece5 == 1 && money29.piece10 == 2 && money29.piece2 == 2)
			System.out.println("good");
		else
			System.err.println("bad");
		Monnaie money11 = monnaieOptimale(11);
		if (money11.piece5 == 1 && money11.piece10 == 0 && money11.piece2 == 3)
			System.out.println("good");
		else
			System.err.println("bad");
		Monnaie money21 = monnaieOptimale(21);
		if (money21.piece5 == 1 && money21.piece10 == 1 && money11.piece2 == 3)
			System.out.println("good");
		else
			System.err.println("bad");
		
		Monnaie money31 = monnaieOptimale(31);
		if (money31.piece5 == 1 && money31.piece10 == 2 && money31.piece2 == 3)
			System.out.println("good");
		else
			System.err.println("bad");
		Monnaie money6 = monnaieOptimale(6);
		if (money6.piece5 == 0 && money6.piece10 == 0 && money6.piece2 == 3)
			System.out.println("good");
		else
			System.err.println("bad");
	}

	public static Monnaie monnaieOptimale(long s) {
		if (s == 1)
			return null;
		else {
			long mon10 = 0;
			long mon5 = 0;
			long mon2 = 0;
			if (s > 10 && s%10 == 1)
				mon10 = s / 10 - 1;
			else
				mon10 = s / 10;
			if (s > 5 && s%5 == 1)
				mon5 = (s - 10*mon10) / 5 - 1;
			else
				mon5 = (s - 10 * mon10) / 5;
			mon2 = (s - 5 * mon5 - 10 * mon10) / 2;
			if (s - mon2*2 - mon5*5 - mon10*10 > 0)
				return null;
			return new Monnaie(mon2, mon5, mon10);
		}
	}
}
