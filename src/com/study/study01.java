package com.study;

import java.util.Scanner;

public class study01 {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;
		while(true) {
			System.out.print("��ɾ� ) ");
			String command = sc.nextLine().trim();
			
			// commandâ�� ������ ������� ��� ���â ��
			if(command.length() == 0) {
				System.out.println("��ɾ �Է��� �ּ���.");
				continue;
			}
			
			if(command.equals("system exit")) {
				break;
			}
			
			if(command.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.println("���� : ");
				String title = sc.nextLine();
				System.out.printf("���� : ");
				String body = sc.nextLine();
				
				System.out.printf("%d�� ���� ���� �Ǿ����ϴ�.\n", id);
			
			}else if (command.equals("article list")) {
				System.out.printf("�Խñ��� �����ϴ�.");
			
			
			}else {
				System.out.printf("%s �� �������� �ʴ� ��ɾ� �Դϴ�.\n", command);
			}
			
			
		}
		
		sc. close();
		System.out.println("==���α׷� ��==");
	}
}
