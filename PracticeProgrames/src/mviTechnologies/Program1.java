package mviTechnologies;

import java.io.*;

public class Program1 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
	//?1)Read a file as input and print the number of words in the file.
	//   you can assume that each word is separated by a space character in the file.
		
		File file = new File ("C:\\Users\\Dinesh.A\\Desktop\\Java Programes\\input.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		
		int countWord = 0;
		int sentenceCount = 0;
		int characterCount = 0;
		int paragraphCount = 1;
		int whitespaceCount = 0;
		
		while((line = reader.readLine())!=null){
			if(line.equals("")){
				paragraphCount++;
			}
			if(!(line.equals(""))){
				characterCount += line.length();
				String[] wordList=line.split("\\s+");
				
				countWord += wordList.length;
				whitespaceCount +=countWord-1;
				
				String[] sentenceList = line.split("[!?.:]+");
				
				sentenceCount += sentenceList.length;
			}
		}
		System.out.println("Total word count = " + countWord);
		System.out.println("Total Number of sentences = " + sentenceCount);
		System.out.println("Number of Paragraphs = " + paragraphCount);
		System.out.println("Total Number of whitespaceCount = " + whitespaceCount);

	}

}
