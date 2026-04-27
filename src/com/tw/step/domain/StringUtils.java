// StringUtils
package com.tw.step.domain;

public class StringUtils {
  public static boolean containsChar(String word, char target){
    char[] chars = word.toCharArray();

    for(int i = 0; i < chars.length; i++){
      if(chars[i] == target){
        return true;
      }
    }

    return false;
  }

  public static String reverse(String word){
    String reversed = "";
    char[] chars = word.toCharArray();

    for(int i = chars.length - 1; i >= 0; i--){
      reversed += chars[i];

    }
    return reversed;
  }

  public static String replaceAll(String word, char target, char replaceChar){
    String replaced = "";
    char[] chars = word.toCharArray();

    for(int i = 0; i < chars.length; i++){
      if(chars[i] == target){
        replaced += replaceChar;
      } else {
        replaced += chars[i];
      }
    }
    return replaced;
  }
}