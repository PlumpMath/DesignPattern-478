package test.java.Observer;

import main.java.ObserverUtil.*;


public class ObserverDemo {
	
	public static void main(String args[]){
		User u1 = new User();
		User u2 = new User();
		SubjectBlog sBlog = new SubjectBlog();
		
		sBlog.registerObserver(u1);
		sBlog.registerObserver(u2);
		
		u1.setSubject(sBlog);
		u2.setSubject(sBlog);
		
		System.out.println("Observer Pattern");
		System.out.println("Before posting new article data in User1 " + u1.getSubject());
		sBlog.postNewArticle();
		System.out.println("After posting new article data in User1 "+ u1.getSubject());	
		
	}

}
