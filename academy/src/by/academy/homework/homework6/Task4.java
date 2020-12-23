package by.academy.homework.homework6;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
//Считываем текст из 2-ого задания, получаем его длинну (576 символов). 
//Для каждого файла генерируем рандомное число от 0 до 576, достаем из текста (из 2 задания)
//такое-же количество символов (string.substring()) и сохраняем в наш файл.
//Создайте файл result.txt и запишите туда список всех файлов и их размеры.

public class Task4 {
	public static void main(String[] argc) throws IOException {

		final String adr = "C://test_task4";

		final String output_fl = "/Users/anast/OneDrive/Документы/GitHub"
				+ "/academy/academy/src/by/academy/homework/task2.txt";
		

		BufferedReader reader = new BufferedReader(new FileReader(output_fl));
		String line = reader.readLine();

		int size = line.length();// 574 символа

		
		File direct = new File(adr);
		
		if (!direct.exists()) {
			direct.mkdir();
		}
		
		
		
		for (int i = 1; i < 101; i++) {

			File file = new File(direct, i + ".txt");
			
			 if (!file.exists()) {
	                file.createNewFile();
	            }
			 
			int rand = (int) (Math.random() * size);
			
			try (FileWriter fwrite = new FileWriter(file)) {

				fwrite.write(line.substring(0, rand));
			}

		}
		
		File fileResult = new File(direct, "result.txt");
		
        try (FileWriter filefolder = new FileWriter(fileResult)) {
        	
            for (File files : direct.listFiles()) {
            	
            	StringBuilder str = new StringBuilder();
            	String out = str.append("Name: ").append(files.getName()).append(" Length:").append(files.length()).toString();
                System.out.println(out);
                filefolder.write(out);

            }
        }

	}

}
