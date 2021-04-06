public class Regex {
    String s = "a2[b3[c]]def";
    String regexp =".\\[";
     public void skobki(){
         while(s.matches(regexp)) {
             int skobka1 = s.indexOf("]");
             int skobka2 = s.lastIndexOf("[");
             int chislo = Character.getNumericValue(s.charAt(skobka2 - 1));
             System.out.println(skobka2);
             String substring = s.substring(skobka2, skobka1 + 1);
             String substringRep = substring.repeat(chislo);
             substringRep = substringRep.replaceAll("\\[", "");
             substringRep = substringRep.replaceAll("\\]", "");
             System.out.println(substring);
             s = s.replaceAll(substring, substringRep);


         }

         System.out.println(s);
}
}
