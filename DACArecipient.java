/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * <TODO add @author info here for all group-mates!>
 *
 * @version 1.2
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{
      //Final constants for default values
    public static final String DEFAULT_SURNAME = "Unknown";
    public static final String DEFAULT_GIVENNAME = "Unknown";
    public static final String DEFAULT_USCIS_NUMBER = "Unknown";
    public static final String DEFAULT_COUNTRY_OF_ORIGIN = "Unknown";
    public static final int DEFAULT_BIRTHDAY = 2415021;
    public static final int DEFAULT_VALID_FROM_DATE = 2415021;
    public static final int DEFAULT_EXPIRATION_DATE = 2415021;
    public static final char DEFAULT_SEX = 'X';


	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;


  /***** CONSTRUCTORS *****/

  /**
   * Default Constructor
   * Sets values to "Unknown", "X", and 2415021 (1/1/1900)
   */
  public DACArecipient() {

    setAll(DEFAULT_SURNAME, DEFAULT_GIVENNAME, DEFAULT_USCIS_NUMBER, DEFAULT_COUNTRY_OF_ORIGIN,
      DEFAULT_BIRTHDAY, DEFAULT_VALID_FROM_DATE,DEFAULT_EXPIRATION_DATE,DEFAULT_SEX);
  }
	
  /*
  * Full Constructor 
  * Initializes all fields with provided parameters.
  */
  public DACArecipient(String surname, String givenName, String uscisNumber,
  String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex){

    setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);

  }

/***** ACCESSORS *****/
//DONE: Copy the accessors you wrote in the previous lab and insert them here.
/*DESCRIPTION: Returns the surname of the calling DACArecipient object. 
*/
public String getSurname(){
  return this.surname;
}
public String getGivenName(){
  return this.givenName;
}
public String getUscisNumber(){
  return this.uscisNumber;
}
public String getCountryOfOrigin(){
  return this.countryOfOrigin;
}
public int getBirthday(){
  return this.birthday;
}
public int getValidFromDate(){
  return this.validFromDate;
}
public int getExpirationDate(){
  return this.expirationDate;
}
public char getSex(){
  return this.sex;
}

/***** MUTATORS *****/
//DONE: Copy the mutators you wrote in the previous lab 
// and insert them here.
/**DESCRIPTION: Assigns the parameter to the calling
 * DACArecipient's surname instance vairiable.
 */
public void setSurname(String surname)
{
  this.surname = surname;
}
public void setGivenName(String givenName)
{
  this.givenName = givenName;
}
public void setUscisNumber(String uscisNumber)
{
  this.uscisNumber = uscisNumber;
}
public void setCountryOfOrigin(String countryOfOrigin)
{
  this.countryOfOrigin = countryOfOrigin;
}
public void setBirthday(int birthday)
{
  this.birthday = birthday;
}
public void setValidFromDate(int validFromDate)
{
  this.validFromDate = validFromDate;
}
public void setExpirationDate(int expirationDate)
{
  this.expirationDate = expirationDate;
}
public void setSex(char sex)
{
  this.sex = sex;
}

  /**
  * Sets all instance variables at once.
  */
  public void setAll(String surname, String givenName, String uscisNumber,
  String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
  {
    this.surname = surname;
    this.givenName = givenName;
    this.uscisNumber = uscisNumber;
    this.countryOfOrigin = countryOfOrigin;
    this.birthday = birthday;
    this.validFromDate = validFromDate;
    this.expirationDate = expirationDate;
    this.sex = sex;
  }

  /**
  //DONE: don't forget to copy all your methods from the previous labs!
  *  OTHER REQUIRED METHODS
  *
  * Returns a string representation of the DACA recipient.
  * Uses jdnToDate to provide readable date formats. */
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + 
    ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + 
    ", Birthday: " + birthday + ", Valid From Date: " + validFromDate + 
    ", Expiration Date: " + expirationDate + ", Sex: " + sex;
  }
         
}
