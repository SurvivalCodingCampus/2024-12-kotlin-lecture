import com.survivalcoding.Person
import org.junit.Assert.*

class PersonTest {

    @org.junit.Before
    fun setUp() {
    }

    @org.junit.After
    fun tearDown() {
    }

    @org.junit.Test
    fun speak() {
        val person = Person()
        assertEquals("abc", person.speak("abc"), )
    }
}