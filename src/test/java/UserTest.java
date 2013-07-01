import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Wybraniec
 * Date: 01.07.13
 * Time: 12:18
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    User user;
    @Before
    public void beforeTests(){
        user = new User();
    }
    User user2 = new User(0L,"mail@test.com");
    @Test
    public void testEquals() throws Exception {
        //Given
        //First user to equal is created before
        //When
        //Second user to equals with previous
        //Comparison is by userID
        User user3 = new User(0L,"mail@test.com");
        //Then
        assertEquals(user2,user3);
    }

    @Test
    public void testHashCode() throws Exception {
        //Given
        //User object is created before
        //each test in beforeTests method
        //When
        Long zm = 0L;
        //this is expected hash
        int hash2 = zm.hashCode();
        //this is real hash of user
        int hash = user2.hashCode();
        //Then
        //Comparison
        assertEquals(hash2,hash);
    }
}
