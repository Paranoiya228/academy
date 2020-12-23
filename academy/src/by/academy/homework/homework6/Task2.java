package by.academy.homework.homework6;

import java.io.*;

//Создать руками текстовый файл, закинуть следующий текст:

/*"Lorem Ipsum is simply dummy text of the printing and typesetting industry.
Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer
took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,
but also the leap into electronic typesetting, remaining essentially unchanged.
It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with 
desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."*/

//Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.

public class Task2 {
	public static void main(String[] argc) throws IOException {

		final String output_fl = "/Users/anast/OneDrive/Документы/GitHub"
				+ "/academy/academy/src/by/academy/homework/task2.txt";

		final String input_fl = "/Users/anast/OneDrive/Документы/GitHub"
				+ "/academy/academy/src/by/academy/homework/result.txt";

		
		BufferedReader reader = new BufferedReader(new FileReader(output_fl));
		StringBuilder str = new StringBuilder();
		
		String text = null;

		for (;;) {

			String currentLine = reader.readLine();

			if (currentLine == null) {
				break;
			}
			text = str.append(currentLine).toString();
		}
		reader.close();

		
		text = text.replaceAll("\\s", "");
		System.out.println(text);


		
		File flToWrite = new File(input_fl);

		if (!flToWrite.exists()) {
			flToWrite.createNewFile();
		}

		FileWriter fwrite = new FileWriter(flToWrite);
		fwrite.write(text);

		fwrite.close();

	}
}
