package guessMovie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class Game {
	public static void readFileByLine(){
		Scanner scan=new Scanner(System.in);
		
		BufferedReader br =null;
		List<String>movieNames=new ArrayList<>();
		try {
			String line;
			br = new BufferedReader(new FileReader("src/guessMovie/movies.txt"));
			line=br.readLine();
			while(line!=null) {
//				System.out.println(line);
				movieNames.add(line);
				line=br.readLine();
			}
			} catch (FileNotFoundException e) {
	System.err.println("Path is wrong or file does not exist");	}
		 catch (IOException e) {
			System.out.println("Could not be read..");
		}
		System.out.println(movieNames);
		int Random = (int)(Math.random()*movieNames.size());
//		int random=(int)Math.random();
		String randomName=movieNames.get(Random);
		
		System.out.println(randomName);
		
		String underScores=randomName.replaceAll("[a-zA-Z]", "-");
		
		System.out.println(underScores);
		String rNameArr[]=randomName.split("");
		String unScores[]=underScores.split("");
		List<Integer>idxList=new ArrayList<>();
		
		int wrong=0;
		do {
		System.out.println("Guess a letter..");
		String guessedLetter=scan.next();
		if(!randomName.contains(guessedLetter)) {
			wrong++;
		}
		if(wrong==10) {
			System.out.println("You lost!!");
			break;}
		
		System.out.println("You have guessed "+wrong+" wrong letters");
		for (int i = 0; i < randomName.length(); i++) 
			if(guessedLetter.equals(Character.toString(randomName.charAt(i)))) {
				idxList.add(i);
			}
				
			for (int j = 0; j < idxList.size(); j++) 
				unScores[idxList.get(j)]=rNameArr[idxList.get(j)];
			underScores="";
			for (int i = 0; i < unScores.length; i++)
				underScores+=unScores[i];
			
			if (underScores.equals(randomName)) {
				System.out.println("You won!!\nYou have guessed '"+ underScores+"' corectly");
			}
			
	
//			System.out.println(idxList);
//			System.out.println(Arrays.toString(rNameArr));
//			System.out.println(Arrays.toString(unScores));
//			System.out.println(underScores);
			
			
		}while(!underScores.equals(randomName));
		
	}}