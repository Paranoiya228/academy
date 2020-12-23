package by.academy.homework.homework6;

import java.io.*;
import java.util.Scanner;

//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
//если введена "stop" строка тогда закончить запись в файл.

public class Task1 {
	public static void main(String[] argc) throws IOException {

		final String nameOfFile = "task1.txt";
		String text = null;

		File file = new File(nameOfFile);
		Scanner scan = new Scanner(System.in);

		if (!file.exists()) {
			file.createNewFile();
		}

		try (FileWriter fwrite = new FileWriter(file)) {

			text = scan.nextLine();

			while (!text.equals("stop")) {
				fwrite.append(text + " ");
				System.out.println("Next line: ");
				text = scan.nextLine();

			}
			fwrite.close();
		}
		scan.close();

	}
}
