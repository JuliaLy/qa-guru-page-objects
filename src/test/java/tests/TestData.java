package tests;

import com.github.javafaker.Faker;
import java.util.HashMap;
import java.util.Map;

public class TestData {
    Faker faker = new Faker();

    public String randomName=faker.name().firstName();
    public String randomLastName=faker.name().lastName();
    public String randomEmail=faker.internet().emailAddress();
    public String randomNumber=faker.phoneNumber().subscriberNumber(10);
    public String randomDay= String.format("%02d",(faker.number().numberBetween(1,28)));
    public String randomYear= String.valueOf(faker.number().numberBetween(1900,2100));
    public String randomMonth=randomMonths();
    public String randomAdress= faker.address().streetAddress();
    public String randomGender =randomGenders();
    public String randomHobbi =randomHobbies();
    public String randomSubject= randomSubjects();
    public String randomPicture= randomPictures();
    public Map<String, String[]> arrayStates = new HashMap<>();{
        arrayStates.put("NCR", (new String[]{"Delhi", "Gurgaon", "Noida"}));
        arrayStates.put("Uttar Pradesh", (new String[]{"Agra", "Lucknow", "Merrut"}));
        arrayStates.put("Haryana", (new String[]{"Karnal", "Panipat"}));
        arrayStates.put("Rajasthan", (new String[]{"Jaipur", "Jaiselmer"}));
    }

    public String randomState= randomStates();
    public String randomStateCity= randomStateCities(randomState);


    public String randomGenders(){

        String [] arrayGenders={"Male", "Female", "Other"};
        return faker.options().option(arrayGenders);
    }


    public String randomHobbies(){

        String [] arrayHobbies={"Sports","Reading","Music"};
        return faker.options().option(arrayHobbies);
    }

    public String randomSubjects(){
        String [] arraySubjects={"Maths", "Chemistry","Computer Science","Economics"};
        return faker.options().option(arraySubjects);
    }

    public String randomMonths(){
        String [] arrayYears={"January", "February","March","April","May","June","July","August","September","October","November","December"};
        return faker.options().option(arrayYears);
    }

    public String randomStates(){

        return faker.options().option(arrayStates.keySet().toArray()).toString();

    }
    public String randomStateCities(String state){
        return faker.options().option(arrayStates.get(state));
    }

    public String randomPictures(){
        String [] arrayPictures={"AAOV9ga.jpg","Portrait-8.jpg"};
        return faker.options().option(arrayPictures);
    }
}

