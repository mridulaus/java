class LegalVoteAge{
int age;


boolean validateLegalVoteAge( int age)throws InvalidVoteAgeException
{
System.out.println("invoking validated voteage ");
if(age == 18)
{
System.out.println("He/she can vote");
return true;
}
InvalidVoteAgeException customCheckExp = new InvalidVoteAgeException();
throw customCheckExp;


}


}