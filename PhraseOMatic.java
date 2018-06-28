public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {
            "24/7",
            "Multi Tier",
            "30,000 Foot",
            "B-to-B",
            "win-win",
            "Front-end",
            "Web-based",
            "Pervasive",
            "Smart",
            "six-sigma",
            "critical-path",
            "dynamic"
        };

        String[] wordListTwo = {
            "empowered",
            "sticky",
            "value-added",
            "oriented", 
            "centric", 
            "distributed", 
            "clustered", 
            "branded",
            "outside-the-box", 
            "positioned", 
            "networked", 
            "focused", 
            "leveraged", 
            "aligned", 
            "targeted", 
            "shared", 
            "cooperative", 
            "accelerated"
        };

        String[] wordListThree = {
            "process", 
            "tipping- point", 
            "solution", 
            "architecture", 
            "core competency", 
            "strategy", 
            "mindshare", 
            "portal", 
            "space", 
            "vision", 
            "paradigm", 
            "mission"
        };

        int firstObjLength = wordListOne.length;
        int secondObjLength = wordListTwo.length;
        int thirdObjLength = wordListThree.length;

        int random1 = (int) (Math.random() * firstObjLength);
        int random2 = (int) (Math.random() * secondObjLength);
        int random3 = (int) (Math.random() * thirdObjLength);

        String phrase = wordListOne[random1] + "" + wordListTwo[random2] + "" + wordListThree[random3];

        System.out.println(phrase);
    }
}