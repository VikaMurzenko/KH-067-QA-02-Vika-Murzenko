package UNI;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      UniversityGroup universityGroup  = new UniversityGroup( "Cats", 2007);
      universityGroup.setStudentArray(new String[]{"Robert De Nirro", "Brad Pitt", "Morgan Freeman", "Denzel Washington"});
      universityGroup.getGroupDescription();
      System.out.println("-----------------------------------");

      UniversityGroup universityGroup2  = new UniversityGroup( "Dogs", 2008, new String[]{"Natalie Portman", "Jennifer Lawrence", "Robin Wright", "Cate Blanchett"});
      universityGroup2.getGroupDescription();
    }
}
