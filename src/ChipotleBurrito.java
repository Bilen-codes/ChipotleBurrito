/*This program will implement a robot that assembles 25 burritos and,
 displays all ingredients used along with the final price of the burrito.*/
public class ChipotleBurrito {
    public static void main(String[] args) {
        //creates ChipotleBurrito object so we call a method in the class
        ChipotleBurrito cbObj = new ChipotleBurrito();
        int burrito = 1;
        String finalStr = "";

        String [][] allIng = {{"white rice", "brown rice", "no rice", "all rice"},
                { "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "no meat", "all meat"},
                {"pinto beans", "black beans", "no Beans", "all Beans"},
                { "mild", "medium", "hot", "no salsa", "all salsa"},
                {"lettuce", "fajita veggies", "no Veggies", "all Veggies"},
                {"cheese", "no cheese"},
                {"Guac", "no Guac"},
                {"Queso", "no Queso"},
                {"sour cream", "no sour cream"}
             };

        //loops though 25 times and prints the final string after calling on burrGen method
        while(burrito <= 25) {
            finalStr = cbObj.burrGen( allIng);
            System.out.println("Burrito " + burrito+ " " + finalStr);
            burrito ++;
        }
        //the program below will display the


    }
    /**
     * This method will return a string of all the ingredients picked for each
     * category in the 2d array along with the total price
     *
     * @param allIng 2D array containing all ingredients in separate category
     * @return tempStr a string after all the choosen ingredients are concatenated.
     *
     */
    public String burrGen( String [][] allIng){
        String tempStr= "";
        double finalPrice = 3.00;
        //Goes through each row and chooses one item at a randomly generated index
        for (int r = 0; r < (allIng.length); r++) {
                int ranChoice = (int) (Math.random() * (allIng[r].length));
                //increments the price by .50 each time an ingredient is choosen.
                if (!(allIng[r][ranChoice].contains("no"))){
                    finalPrice += .50;
                }
                tempStr = tempStr+ " "+  allIng[r][ranChoice] +  ",";
        }

        //take out the last ',' character
        if (tempStr.charAt((tempStr.length()-1)) == ',' ){
            tempStr = tempStr.substring(0,(tempStr.length()- 1) );
        }
        tempStr = tempStr + " $" + finalPrice;
        return tempStr;
    }

}

