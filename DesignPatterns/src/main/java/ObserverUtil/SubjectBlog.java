package main.java.ObserverUtil;

import java.util.ArrayList;
import java.util.List;

public class SubjectBlog implements ISubject{
	
	List<IObserver> observerList = new ArrayList<IObserver>();
	boolean subjectChange = false;
	
	public void registerObserver(IObserver observer){
		observerList.add(observer);
		System.out.println("Added Observer "+ observer.toString());
	}
	public void unRegisterObserver(IObserver observer){
		observerList.remove(observer);
		System.out.println("removed Observer " + observer.toString());
		
	}
	public void notifyObserver(){
		int count = 1;
		if(subjectChange){
			for(IObserver observer : observerList){
				System.out.println("updating user = "+ count++);
				observer.update();
			}
		}
		
	}
	
	public void postNewArticle(){
		subjectChange = true;
		notifyObserver();
	}
	
	public String getUpdate(){
		return "New Blog has been posted";		
		
	}
	

}
