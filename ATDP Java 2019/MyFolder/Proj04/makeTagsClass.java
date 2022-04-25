public class makeTagsClass {
 public String makeTags(String tag, String word) {
  String output = "<" + tag + ">" + word + "</" + tag + ">";
  return output;
}
}