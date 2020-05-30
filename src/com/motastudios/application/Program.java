package com.motastudios.application;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(JOptionPane.showInputDialog(""));
		String hi = sc.nextLine();
		System.out.println(hi);
		System.out.println("falae bixo");
		System.out.println("Tudo bem?");
		sc.close();
		System.exit(0);

	}
}
