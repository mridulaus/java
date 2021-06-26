class ValidIndianCitizenTester{
public static void main (String[] args){

ValidIndianCitizen validCitizen = new ValidIndianCitizen();
try {
    boolean   refOfCitizen  = validCitizen.validateCitizen("MNShetty","Kumta" , "23May2021" , 60);
System.out.println(refOfCitizen);
}
catch(InvalidCitizenException value  ) {


System.out.println("this  is validated "+ value.getMessage() );
value.printStackTrace();
}
catch(Exception exp)
{
System.out.println("Generic handler");
exp.printStackTrace();
}

}
}