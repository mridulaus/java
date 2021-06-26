class LegalMarriageAge{
double age;
Gender gender;
	enum Gender {
	MALE,FEMALE
	}

boolean validateMarriageAge( Gender gender, double age)throws MarriageAgeValidatorException
{
System.out.println("invoking validated  ");
if(gender.equals(Gender.MALE) && ( age >= 21  )|| (gender.equals(Gender.FEMALE))&& (age  >= 18))
{
	System.out.println(" Right age for marriage" );
return true;
}
MarriageAgeValidatorException customCheckExp = new MarriageAgeValidatorException();
throw customCheckExp;
}

}