public class Converter {

    public String convertToBinary(String outputNum, int inputNum) {
        if(inputNum==0) {
            return outputNum;
        } else {
            return convertToBinary((inputNum%2) + outputNum, inputNum/2);
        }

    }

}
