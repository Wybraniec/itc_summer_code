package pl.itcrowd.summer_code.domain;

import org.junit.Assert;
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
        //newObject = 12L;
    }
    User user2 = new User(0L,"test@testuj.com");

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
        User user1 = new User(1L,"asd");
        User user1Bis = new User(1L,"xxx");
        User user2 = new User(2L,"asd");
        User userNull = new User(null,"asd");
        User userNullBis = new User(null,"222");
        //When
        final boolean resultA = userNull.equals(user1);
        final boolean resultB = user1.equals(userNull);
        final boolean resultC = user1.equals(user2);
        final boolean resultD = user1.equals(user1);
        final boolean resultE = userNull.equals(userNull);
        final boolean resultF = userNull.equals(userNullBis);
        final boolean resultG = user1.equals(user1Bis);
        final boolean resultH = user1.equals(null);
        //Then
        assertFalse(resultA);
        assertFalse(resultB);
        assertFalse(resultC);
        assertTrue(resultD);
        assertTrue(resultE);
        assertTrue(resultF);
        assertTrue(resultG);
        assertFalse(resultH);
    }
    @Test
    public void testEqualsOfTwoObjects() throws Exception{
        //Given
        final User user1 = new User();
        user1.setId(12L);
        //When
        final boolean result = user1.equals(12L);
        //Then
        //assertEquals(newObject,newObject3);
//        assertTrue(newObject3.equals(newObject));
        assertFalse(result);

    }
    @Test
    public void testEquals()
    {
        //given

        //when
        user.setId(12L);
        User user2 = new User(12L, "test@testuj.pl");
        User user3 = user;
        User user4 = new User();
        //then
        assertTrue(user.equals(user2));
        assertTrue(user.equals(user3));
        assertFalse(user.equals(user4));
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
    @Test
    public void TestHash() throws Exception{
        //Given
        Long id = 1L;
        Long zero = 0L;
        Long idNull = null;
        User user1 = new User(id,"xxx");
        User user2 = new User(idNull,"xxx");
        User user3 = new User();

        //When
        int hashId = id.hashCode();
        int hashUser1 = user1.hashCode();
        int hashUser2 = user2.hashCode();
        int hashUser3 = user3.hashCode();
        //Then
        assertEquals(hashId,hashUser1);
        assertEquals(0,hashUser3);
        //assertEquals(hashUser2,hashUser1);

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
        assertEquals(0,hash);
    }
}