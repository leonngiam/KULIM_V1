package com.wb.bo;

import java.io.Serializable;

public class UUIDHexGenerator extends UUIDGenerator {

  /*
  public static void main( String[] args ) {
	UUIDHexGenerator gen = new UUIDHexGenerator();
   	String id = (String) gen.generate();
	System.out.println("id ==>"+id);
  }*/
  /** Constructor for the UUIDHexGenerator object */
  public UUIDHexGenerator() {
    super();
  }


  /**
   * Description of the Method
   *
   * @return Description of the Return Value
   */
  public Serializable generate() {
    String IPStr = format(getIP());
    String JVMStr = format(getJVM());
    String HiTimeStr = format(getHiTime());
    String LoTimeStr = format(getLoTime());
    String CountStr = format(getCount());

    return new StringBuffer(32)
        .append(IPStr).append(JVMStr)
        .append(HiTimeStr).append(LoTimeStr)
        .append(CountStr).toString();
  }


  /**
   * Description of the Method
   *
   * @param intval Description of the Parameter
   * @return Description of the Return Value
   */
  protected String format(int intval) {
    String formatted = Integer.toHexString(intval);
    StringBuffer buf = new StringBuffer("00000000");
    buf.replace(8 - formatted.length(), 8, formatted);
    return buf.toString();
  }


  /**
   * Description of the Method
   *
   * @param shortval Description of the Parameter
   * @return Description of the Return Value
   */
  protected String format(short shortval) {
    String formatted = Integer.toHexString(shortval);
    StringBuffer buf = new StringBuffer("0000");
    buf.replace(4 - formatted.length(), 4, formatted);
    return buf.toString();
  }

}



