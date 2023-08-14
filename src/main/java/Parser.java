public class Parser {

    public String arrayToString(String[] input){

        StringBuilder split = new StringBuilder();
        for(int i = 0; i < input.length; i++){
            split.append(input[i]).append("\n");
        }
        System.out.println(split);
        return split.toString();
    }
}
