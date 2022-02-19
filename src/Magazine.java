public class Magazine {
    private String magazineName;
    private int magazineNumber;
    private String magazineEntry;

    public Magazine(String magazineName, int magazineNumber) {
        this.magazineName = magazineName;
        this.magazineNumber = magazineNumber;
    }
    public String getMagazineName() {
        return magazineName;
    }
    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }
    public int getMagazineNumber() {
        return magazineNumber;
    }
    public void setMagazineNumber(int magazineNumber) {
        this.magazineNumber = magazineNumber;
    }
    public void magazineInformation() {
        System.out.println("Magazine name : " + " " +getMagazineName() + " , " +"Magazine number : " + "  " +getMagazineNumber());
    }

}







