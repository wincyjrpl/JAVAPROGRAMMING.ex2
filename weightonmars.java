public class weightonmars {
    //How much you weigh on Mars
    float earthWeight;
    float marsWeight;
    double marsWgtInDbl;
    int marsWeightInInt;

    earthWeight=63;
    marsWeight=(earthWeight*0.38F);
        System.out.println(earthWeight + "kg on Earth is " + marsWeight+ "kg on Mars" );

    //from float to double
    marsWgtInDbl=marsWeight;
        System.out.println("Kilograms on Mars after conversion to double" + marsWgtInDbl);

    //to 4 decimal places
        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n" , marsWgtInDbl);

    //a floating point type cast to integer
    marsWeightInInt = (int)marsWgtInDbl;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInInt);

    //casting int type to char
    char c = (char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of marsWeightInInt is: " + c);


    //assign the value of performing some mathematical operation on the char character to the new int variable
    int exampleOfMathOnChar = c * c;
        System.out.println("An example of a mathematical operations on the char type: " + exampleOfMathOnChar);
}
