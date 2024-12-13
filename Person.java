public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int ssn;

    public Person(String firstName, String lastName, int age, String ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        this.lastName = lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if (age < 0)
        {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
    public String getSsn()
    {
        return ssn;
    }
    public void setSsn(String ssn)
    {
        this.ssn = ssn;
    }
    public String toString()
    {
        return "Person Details: " + "\nFirst Name: " + firstName + "\nLast Name " + lastName + "\nAge: " + age + "\nSSN: " + ssn;
        
    }
}
