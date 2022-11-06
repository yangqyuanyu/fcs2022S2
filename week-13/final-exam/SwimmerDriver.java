public class SwimmerDriver{
    public static void main(String args[]){
// make some Swimmers
	Swimmer s1 = new Swimmer ("Sally Smith",18,0,0);
	Swimmer s2 = new Swimmer ("Jane Austen",23,7,3);
	Swimmer s3 = new Swimmer ("Spiro Agnew",76,9,8);
	// print some Swimmers
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	// change some swimmers
	s1.setName("Sarah Smith");
	s1.setAge(18);
	s3.setAge(77);
	// wins first, second or third
	s1.win();
	// didn’t get any of the top three places
	s2.lose();
	s1.lose();
	s3.win();
	// print some Swimmers  again
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	// print out some values
	System.out.println(s1.getAge());
	System.out.println(s2.getName());
	System.out.println(s3.getAge());
	System.out.println(s3.getRanking());
	System.out.println(s1.getRanking());
	System.out.println(s2.getId());
    }
       
}
