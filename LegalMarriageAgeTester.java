class LegalMarriageAgeTester {
public static void main(String[]args){

LegalMarriageAge ageValidator  = new LegalMarriageAge();

try{
 boolean valid = ageValidator.validateMarriageAge(LegalMarriageAge.Gender.FEMALE , 18);
  System.out.println(valid);
  }
  catch(MarriageAgeValidatorException val)
{
System.out.println("this  is validated "+ val.getMessage() );
val.printStackTrace();
}
catch(Exception exp)
{
System.out.println("Generic handler");
exp.printStackTrace();
}
}
}