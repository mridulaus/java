class EmailValidatorTester{
public static void main(String[] args){
	
EmailValidator validator=new EmailValidator();
try{
boolean validValue  =  validator.validateEmail("contact@gmail.in");
System.out.println(validValue);
}
catch(EmailValidatorException val)
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