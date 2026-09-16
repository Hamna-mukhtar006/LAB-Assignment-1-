public class Student{
	int id;
	String name;
	int completedCredits;

	void printSummary(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Credits completed : "+completedCredits);}
	void addcredit(int amount){
		completedCredits = completedCredits + amount;
		System.out.println("Credits completed : "+completedCredits);}
}