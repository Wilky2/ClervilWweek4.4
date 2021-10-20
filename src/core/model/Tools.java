package core.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class Tools {

	//31. Find out duplicate number between 1 to N numbers.
	public static int findDuplicate(List<Double> nb) {
		List<Double> copyOfNb = new ArrayList<Double>(nb);
		Collections.sort(copyOfNb);

		int nbDuplicate = 0;

		for (int i = 0; i < copyOfNb.size() - 1; i++) {
			if (copyOfNb.get(i).equals(copyOfNb.get(i + 1))) {
				while (i < copyOfNb.size() - 1 && copyOfNb.get(i).equals(copyOfNb.get(i + 1))) {
					i++;
				}
				nbDuplicate++;
			}
		}

		return nbDuplicate;
	}

	//32. Find out middle index where sum of both ends are equal.
	public static int findMediumEqualIndex(List<Double> nb) {
		int d;
		for (int i = 1; i < nb.size() - 1; i++) {
			d = Math.min(i - 0, nb.size() - 1 - i);
			for (int j = 1; j <= d; j++) {
				if (nb.get(i - j).equals(nb.get(i + j))) {
					return i;
				}
			}
		}
		return -1;
	}

	//35. Write a program to reverse a string using recursive algorithm.
	public static String reverseString(String s) {
		if (s.equals("") || s.length() == 1) {
			return s;
		}
		if (s.length() == 2) {
			String start = s.substring(0, 1);
			String end = s.substring(1, 2);
			return end + start;
		}
		String start = s.substring(0, 1);
		String medium = s.substring(1, s.length() - 1);
		String end = s.substring(s.length() - 1, s.length());

		return end + reverseString(medium) + start;
	}

	//36. Write a program to reverse a number.
	public static int reverseNumber(int nb) {
		int reverse = 0;
		while (nb != 0) {
			reverse *= 10;
			reverse += nb % 10;
			nb = nb / 10;
		}

		return reverse;
	}

	//37. Write a program to convert decimal number to binary format.
	public static String binary(int nb) {
		if (nb == 0) {
			return "0";
		}

		if (nb == 1) {
			return "1";
		}

		String value = "";
		while (nb != 0) {
			value = nb % 2 + value;
			nb = nb / 2;
		}
		return value;
	}

	//38. Write a program to find perfect number or not.
	public static boolean isPerfectNumber(int nb) {
		if (nb == 0 || nb == 1) {
			return false;
		}
		int sumDiv = 1;
		for (int i = 2; i < nb; i++) {
			if (nb % i == 0) {
				sumDiv += i;
			}
		}
		if (nb == sumDiv) {
			return true;
		}

		return false;
	}

	public static int findDuplicateString(List<String> s) {
		List<String> copyOfs = new ArrayList<String>(s);
		Collections.sort(copyOfs);

		int nbDuplicate = 0;

		for (int i = 0; i < copyOfs.size() - 1; i++) {
			if (copyOfs.get(i).equals(copyOfs.get(i + 1))) {
				while (i < copyOfs.size() - 1 && copyOfs.get(i).equals(copyOfs.get(i + 1))) {
					i++;
				}
				nbDuplicate++;
			}
		}

		return nbDuplicate;
	}

	//40. Write a program to find maximum repeated words from a file.
	public static int doubleWordInFile(String name) {
		try {
			File file = new File("test.txt");
			
			List<String> s = new ArrayList<String>();
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				s.add(sc.next());
			}
			return findDuplicateString(s);
		} catch (FileNotFoundException e) {
			return 0;
		}
	}
}
