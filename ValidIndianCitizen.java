class ValidIndianCitizen{
int age;


boolean validateCitizen( String name ,String bornPlace ,String retirementDate , int ageLimit  )throws InvalidCitizenException
{
System.out.println("invoking validated retirementAge ");
if(name.contains("S") || bornPlace.equals("kumta") ||  ageLimit == 60)
{

return true;
}
InvalidCitizenException customCheckExp = new InvalidCitizenException();
throw customCheckExp;

//return false;
}


}