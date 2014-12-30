package com.wb.bo;

public class GenUUIDUtil {

  /**
   * Generate the new UUID value.
   *
   * @return The UUID value in String format
   */
  public static String generateUUID() {
    UUIDHexGenerator gen = new UUIDHexGenerator();
    String id = (String) gen.generate();
    return id;
  }

}
