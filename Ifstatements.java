public class Ifstatements {
    public void patienceProfile(String profile) {
        if (profile == "CODE"){
            System.out.println("Patience is new to coding");
        } else if (profile == "DESIGN") {
            System.out.println("Patience is learning design");
        }else {
            System.out.println("Patience is taking a nap. Go back!");
        }
    }
    
}