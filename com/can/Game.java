package com.can;

import java.util.Scanner;
import java.util.Arrays;

public class Game 
{
	public static void main(String[] args) 
	{
 		greet();
	}
	public static void greet()
	{
		final String GAME_NAME = "Sayi Tahmini";
		System.out.println(GAME_NAME + " oyununa hoşgeldin! Oyuna baslamak istiyor musun? (Evet/Hayır)");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(answer.trim().toLowerCase().equals("evet")) 
		{
			startGame();
		}
		else 
		{
			sayGoodbye();
		}
	}
		public static void startGame() 
		{
			getUsersName();
			getGuesses();
			sayGoodbye();
		}
		private static void getUsersName() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("İsmin nedir");
			String userName = scanner.nextLine();
			System.out.println("Merhaba " + firstLetterUppercase(userName));
		}
		
	public static void getGuesses() 
	{
		int secretNumber = 1 + (int)(Math.random() * 10);
		int[] guesses = new int [3];
		System.out.println("Tahminin nedir?");
		Scanner scanner = new Scanner(System.in);
		guesses[0] = scanner.nextInt();
		printGuessResult(secretNumber, guesses[0]);
		guesses[1] = scanner.nextInt();
		printGuessResult(secretNumber, guesses[1]);
		guesses[2] = scanner.nextInt();
		printGuessResult(secretNumber, guesses[2]);
		System.out.println("Gizli Numara:"+ secretNumber+ " Tahminlerin:" + Arrays.toString(guesses));
	}
	public static void printGuessResult(int secretNumber,int guess)
	{
		if(secretNumber > guess) 
		{
		System.out.println("Yukarı");
		}
		else if(secretNumber < guess) 
		{
			System.out.println("Aşağı");
		}
		else
		{
			System.out.println("Bildin! Tebrikler");
		}
	}
	
	public static String firstLetterUppercase(String value) 
	{
		return value.substring(0,1).toUpperCase() + value.substring(1,value.length());
	}
	public static void  sayGoodbye() 
	{
		System.out.println("Sonra gorusuruz!");
	}
}
