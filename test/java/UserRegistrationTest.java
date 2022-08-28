import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserRegistrationTest {
    boolean check;
    UserRegistration user = new UserRegistration();

    @Test
    void firstNameTest() {
        check = user.firstName("Praveen");
        Assertions.assertEquals(true,check);
    }
    @Test
    void lastNameTest() {
        check = user.lastName("pgb");
        Assertions.assertEquals(true,check);
    }
    @Test
    void eMailTest() {
        check = user.eMail("praveen@gmail.com");
        Assertions.assertEquals(true,check);
    }
    @Test
    void mobileNumberTest() {
        check = user.mobileNumber("9980305519");
        Assertions.assertEquals(true,check);
    }
    @Test
    void passWordTest() {
        check = user.passWord("123456");
        Assertions.assertEquals(true,check);

    }

    @Test
    public void moodAnalyserHappyTest(){
        UserRegistration mood = new UserRegistration();
        String moodHappy = mood.moodAnalyser("praveen","pgb","9449788942","praveen@gmail.com","pav998025");
        Assertions.assertEquals("Happy",moodHappy);
    }

    @Test
    public void moodAnalyserSadTest(){
        UserRegistration mood = new UserRegistration();
        String moodSad = mood.moodAnalyser("@","pgb","9449788942","praveen@gmail.com","pav998025");
        Assertions.assertEquals("Sad",moodSad);
    }
}