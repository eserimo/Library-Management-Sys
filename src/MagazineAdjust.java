import java.util.ArrayList;

public class MagazineAdjust implements itfMagazineAdjust {
    ArrayList<Magazine> magazines = new ArrayList<Magazine>();
    public void addMagazine(Magazine magazine){magazines.add(magazine);}
    public void deleteMagazine(int magazineNumber){magazines.remove(magazineNumber-1);}

    @Override
    public void countMagazine() {
        System.out.println("The number of magazines :"+magazines.size());
    }

    @Override
    public void controlMagazines(Integer imp) {
        for (Magazine magazine: magazines) {
            if (magazine.getMagazineNumber()==imp) {
                System.out.println("Magazine name :" + " " +magazine.getMagazineName()+ " " + "Magazine number :" +magazine.getMagazineNumber());
                return;
            }
        }
        System.out.println("Specified magazine not found. ");
    }

    public void showMagazines(){
        if(magazines.isEmpty()){
            System.out.println("There is no magazine. ");
        }
        else
            for(Magazine mg:magazines){
                mg.magazineInformation();
            }
    }
}
