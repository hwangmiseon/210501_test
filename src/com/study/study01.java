package com.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class study01 {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 0;
		
		List<Article> articles = new ArrayList<>(); // article 담을 배열
				
		while(true) {
			System.out.print("명령어 ) ");
			String command = sc.nextLine().trim();
			
			// command창에 내용이 없을경우 계속 명령창 뜨게 함
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
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				
				Article article = new Article(id, title, body);
				articles.add(article);
				
				System.out.printf("%d번 글이 생성 되었습니다.\n", id);
			
			}else if (command.equals("article list")) {
				
				if(articles.size() == 0) {
					System.out.println("게시물이 없습니다.");
					continue;
				}
				
				System.out.printf("번호 / 제목\n");
				for(int i = articles.size() -1; i>=0; i--) { // 최신글부터 보여주기, 배열 뒤부터 열람
					Article article = articles.get(i);
					
					System.out.printf("%d     /     %s\n", article.id, article.title);
				}
			
			
			}else {
				System.out.printf("%s 는 존재하지 않는 명령어 입니다.\n", command);
			}
			
			
		}
		
		sc. close();
		System.out.println("==프로그램 끝==");
	}
}

class Article {
	int id;
	String title;
	String body;
	
	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
	
}
