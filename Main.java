public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter();

        // starting input number is 5 we happen to know that this is 101 in binary
        int initialInputNumber = 5;
        // starting output number is "" as we do not know the output yet
        String initalOutputNumber = "";

        // print our answer
        System.out.println(converter.convertToBinary(initalOutputNumber, initialInputNumber));


    }

}
