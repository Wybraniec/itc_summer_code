import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 01.07.13
 * Time: 12:18
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    User user;
    Object newObject;
    @Before
    public void beforeTests(){
        user = new User();
        newObject = new Object();
        newObject = 12L;
    }
    User user2 = new User(0L,"test@testuj.com");
    @Test
    public void testEquals() throws Exception {
        //Given
        //First user to equal is created before
        //When
        newObject = 12L;
        Object newObject2 = new Object();
        newObject2 = 12L;
        User user3 = new User(0L,"mail@test.com");
        //Then
        assertEquals(newObject,newObject2);
        assertEquals(user2,user3);
    }

    @Test
    public void testHashCode() throws Exception {
        //Given
        //User object is created before
        //each test in beforeTests method
        //When
        Long id_number = 0L;
        int hash2 = id_number.hashCode();
        int hash = user2.hashCode();
        newObject = 0L;
        //Then
        assertEquals(hash2,hash);
        //assertEquals(0,newObject);
        assertEquals(0,hash);
    }
    @Test
    public void testEqualsIfObjectType() throws Exception{
        //Given
        //When
        Object newObject3 = new Object();
        //Then
        assertFalse(user.equals(newObject3));
    }
    @Test
    public void testEqualsOfTwoUsers() throws Exception{
        //Given
        //When
        User user3 = new User();
        //Then
        assertTrue(user3.equals(user));
    }
    @Test
    public void emailTest() throws Exception{
        //Given
        //When
        String email = "test@testuj.com";
        user.setEmail(email);
        //Then
        assertTrue(email.equals(user.getEmail()));
    }
    @Test
    public void idTest() throws Exception{
        //Given
        //When
        Long id = 12L;
        user.setId(id);
        //Then
        assertTrue(id.equals(user.getId()));
    }
}