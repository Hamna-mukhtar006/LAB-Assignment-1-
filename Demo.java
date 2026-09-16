public class Demo{
	public static void main (String[] args){
		Student s1 = new Student();
			s1.id = 23;
			s1.name = "Hamna";
			s1.completedCredits = 30;
			
			
                 
		Student s2 = new Student();
			s2.id = 24;
			s2.name = "Iqra";
			s2.completedCredits = 30;

			

	s1.printSummary();
	s2.printSummary();
	s1.addcredit (20);
}} 