// StringUtils

class StringUtils {
  static boolean containsChar(String word, char target){
    for(int i = 0; i < word.length(); i++){
      if(word.charAt(i) == target){
        return true;
      }
    }

    return false;
  }

  static String reverse(String word){
    String reversed = "";
    for(int i = word.length() - 1; i >= 0; i--){
      reversed += word.charAt(i);

    }
    return reversed;
  }

  static String replaceAll(String word, char target, char replaceChar){
    String replaced = "";
    for(int i = 0; i < word.length(); i++){
      if(word.charAt(i) == target){
        replaced += replaceChar;
      } else {
        replaced += word.charAt(i);
      }
    }
    return replaced;
  }
}