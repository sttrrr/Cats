public class Regex {



    String regexp ="\\[";

    public void skobki(String s){

    for(int i = 0; i < s.length(); i++){
            int skobka1 = s.indexOf("]");
            int skobka2 = s.lastIndexOf("[");
            int chislo = Character.getNumericValue(s.charAt(skobka2 - 1));
            System.out.println(skobka2);
            String substring = s.substring(skobka2, skobka1 + 1);
            System.out.println(substring);
            String substringRep = substring.repeat(chislo);
            String substringS = s.substring(skobka2 - 1,skobka1+1 );
            System.out.println(substringRep);
            substringRep = substringRep.replaceAll("\\[", "");
            substringRep = substringRep.replaceAll("\\]", "");
            System.out.println(substring);
            s = s.replace(substringS, substringRep);


        System.out.println(s);

    }
        skobki(s);


}


}
