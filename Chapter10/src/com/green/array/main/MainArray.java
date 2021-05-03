package com.green.array.main;

import java.util.Scanner;

import com.green.array.controller.Controller;
import com.green.array.dto.Member;

public class MainArray {
	static public Scanner sc = new Scanner(System.in);
	static public Member[] members = new Member[100];
	
	public static void main(String[] args) {
		new Controller();

	}

}
