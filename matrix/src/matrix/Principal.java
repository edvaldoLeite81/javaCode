package matrix;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row;
		int col;
		int num;

		System.out.print("\nenter the number of rows in the matrix: ");
		row = sc.nextInt();

		System.out.print("enter the number of columns in the matrix: ");
		col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("populate the array: ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nEnter an array number: ");
		num = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (num == mat[i][j]) {
					System.out.println("\nPosition - Line:" + (i + 1) + " Column:" + (j + 1));
					
					//rigth
					if(j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					//left
					if(j > 0) {
						System.out.println("Left: "+ mat[i][j - 1]);
					}
					//up
					if(i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					//down
					if(i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}

			}
		}

		sc.close();
	}// main
}// fim da classe
