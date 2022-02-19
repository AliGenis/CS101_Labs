/**
 * Class to create and manipulate house
 * 
 * @author Ali Genis
 * @date 16.05.2020
 */
public class House
{
   //Variables
   private String ownerName;
   private String address;
   private int residents;
   private double serviceChargePerResident;
   
   // Constructor
   public House( String owner , String address , int people , double charge )
   {
      this.ownerName = owner;
      this.address = address;
      this.residents = people;
      this.serviceChargePerResident = charge;
   }
   
   // Getters
   /**
    * Method to get owners name
    * @return owner
    */
   public String getOwnerName()
   {
      return ownerName;
   }
   /**
    * Method to get address
    * @return address
    */
   public String getAddress()
   {
      return address;
   }
   /**
    * Method to get residents
    * @return residents
    */
   public int getResidents()
   {
      return residents;
   }
   /**
    * Method to get service charge
    * @return service charge
    */
   public double getServiceChargePerResident()
   {
      return serviceChargePerResident;
   }
   // Setters
   /**
    * Method to mutate owners name
    * @param desired name
    */
   public void setOwnerName( String owner )
   {
      this.ownerName = owner;
   }
   /**
    * Method to mutate address
    * @param desired address
    */
   public void setAddress( String a )
   {
      this.address = a;
   }
   /**
    * Method to mutate house residents
    * @param desired resident count
    */
   public void setResidents( int a )
   {
      this.residents = a;
   }
   /**
    * Method to mutate service charge
    * @param desired service charge
    */
   public void setServiceChargePerResident( double a )
   {
      this.serviceChargePerResident = a;
   }
   /**
    * Method to calculate total service fee
    * @return total service fee
    */
   public double calculateTotalServiceFee()
   {
      return residents * serviceChargePerResident;
   }
   /**
    * Method to show house nicely
    * @return String representation of house
    */
   public String toString()
   {
      return "\nOwner: " + ownerName + "\n" + address + "\nResidents: " + residents + " Monthly Fee: " + calculateTotalServiceFee() + "TL";
   }
   
   
}