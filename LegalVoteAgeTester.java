class LegalVoteAgeTester{
public static void main (String[] args){

LegalVoteAge valid = new LegalVoteAge();
try {
    boolean   refOfVote  = valid.validateLegalVoteAge(18);
System.out.println(refOfVote);
}
catch(InvalidVoteAgeException ref  ) {


System.out.println("this  is validated "+ ref.getMessage() );
ref.printStackTrace();
}
catch(Exception exp)
{
System.out.println("Generic handler");
exp.printStackTrace();
}

}
}