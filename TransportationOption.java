
/**
 * An interface for transportation options
 */
public interface TransportationOption {
  
  /** Returns a description of the transportation option. */
  public String getDescription();
  
  /** Returns the number of riders that this transportation option
    * can serve */
  public int getTotalRiderCapacity();
  
  /** Add a rider to this transportaiton option */
  public boolean addRider();
  
  /** Get the number of riders that can still be added */
  public int getRemainingRiderCapacity();
  
  /** Get the maximum speed of this transportation option. */
  public double getMaximumSpeed();
  
  /** Let this transportation option move */
  public void move();
}