package com.study;

import java.util.Scanner;

public class study01 {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;
		while(true) {
			System.out.print("명령어 ) ");
			String command = sc.nextLine().trim();
			
			// command창에 내용이 없을경우 계속 명령창 뜸
			if(command.length() == 0) {
				System.out.println("명령어를 입력해 주세요.");
				continue;
			}
			
			if(command.equals("system exit")) {
				break;
			}
			
			if(command.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.println("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				System.out.printf("%d번 글이 생성 되었습니다.\n", id);
			
			}else if (command.equals("article list")) {
				System.out.printf("게시글이 없습니다.");
			
			
			}else {
				System.out.printf("%s 는 존재하지 않는 명령어 입니다.\n", command);
			}
			
			
		}
		
		sc. close();
		System.out.println("==프로그램 끝==");
	}
}
