public class ClubDriver {
  public static void main(String args[]) {
    // set up two new clubs.
    Club club1 = new Club();
    Club club2 = new Club();
    // set up some new Swimmers
    Swimmer s1 = new Swimmer("Sally Smith", 18, 0, 0);
    Swimmer s2 = new Swimmer("Jane Austen", 23, 7, 3);
    Swimmer s3 = new Swimmer("Spiro Agnew", 76, 9, 8);
    Swimmer s4 = new Swimmer("Jenny Lee", 33, 10, 8);
    Swimmer s5 = new Swimmer("Yasi Jones", 53, 3, 2);
    // add these Swimmers to club 1
    club1.addMember(s1);
    club1.addMember(s2);
    club1.addMember(s5);
    // and some Swimmers to club 2 (p1 in both clubs!)
    club2.addMember(s1);
    club2.addMember(s3);
    club2.addMember(s4);
    // print Members of each club
    System.out.println("Club 1");
    club1.printMembers();
    System.out.println("Club 2");
    club2.printMembers();
    // Swimmers comp
    s1.win();
    s2.lose();
    s3.win();
    s3.win();
    s4.lose();
    s5.win();
    s5.win();
    // print Members of each club
    System.out.println("Club 1");
    club1.printMembers();
    System.out.println("Club 2");
    club2.printMembers();
    // try to remove members from clubs
    System.out.println(club1.removeMemberById(1));
    System.out.println(club2.removeMemberById(2));
    // print Members of each club again
    System.out.println("Club 1");
    club1.printMembers();
    System.out.println("Club 2");
    club2.printMembers();
    // get highest ranked Swimmer in both clubs
    System.out.println("Highest Ranked Swimmers");
    System.out.println(club1.getHighestRankedSwimmer());
    System.out.println(club2.getHighestRankedSwimmer());
  }
}