package main.java.ObserverUtil;

public class User implements IObserver{
	
	private String subjectTitle = "Old Article";
	private ISubject blog;
	
	public void update(){
		
		subjectTitle = (String) this.blog.getUpdate();
		System.out.println("Subject Title = "+ subjectTitle);
		
	}
	
	public void setSubject(ISubject subject){
		this.blog = subject;
	}
	
	public String getSubject(){
		return subjectTitle;
	}
	

}
