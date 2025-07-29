package gasSupplier;

public interface gasAgency {
    public String agencyName="Bharat Gas";
    public int agencyCode= 4576;
    public int phnumber= 3456;
    public int pincode= 2087;
    default void agencyDisplay(){
        System.out.println("The agency name is: "+agencyName);
        System.out.println("The agency Code is: "+agencyCode);
        System.out.println("The agency Phone Number is: "+phnumber);
    }
}
