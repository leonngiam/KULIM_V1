package com.wb.bo;

import java.net.InetAddress;

public abstract class UUIDGenerator {

  private final static int IP;
  private final static int JVM = (int) (System.currentTimeMillis() >>> 8);

  private static short counter = (short) 0;


  /** Constructor for the UUIDGenerator object */
  public UUIDGenerator() { }


  /**
   * Unique across JVMs on this machine (unless they load this class in the same
   * quater second - very unlikely)
   *
   * @return The jVM value
   */
  protected int getJVM() {
    return JVM;
  }


  /**
   * Unique in a millisecond for this JVM instance (unless there are >
   * Short.MAX_VALUE instances created in a millisecond)
   *
   * @return The count value
   */
  protected short getCount() {
    synchronized (UUIDGenerator.class) {
      if (counter < 0) {
        counter = 0;
      }
      return counter++;
    }
  }


  /**
   * Unique in a local network
   *
   * @return The iP value
   */
  protected int getIP() {
    return IP;
  }


  /**
   * Unique down to millisecond
   *
   * @return The hiTime value
   */
  protected short getHiTime() {
    return (short) (System.currentTimeMillis() >>> 32);
  }


  /**
   * Gets the loTime attribute of the UUIDGenerator object
   *
   * @return The loTime value
   */
  protected int getLoTime() {
    return (int) System.currentTimeMillis();
  }


  static {
    int ipadd;
    try {
      byte[] address = InetAddress.getLocalHost().getAddress();
      int result = 0;
	  for (int i=0; i<4; i++) {
		result = ( result << 8 ) - Byte.MIN_VALUE + (int) address[i];
	  }

	  ipadd = result;    	
    }
    catch (Exception ex) {
      System.out.println("UUIDGenerator has caught an exception:" + ex.getMessage());
      ipadd = 0;
    }

    IP = ipadd;
  }

}


