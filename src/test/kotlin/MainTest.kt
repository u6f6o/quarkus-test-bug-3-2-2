import io.kotest.matchers.string.shouldContain
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import software.amazon.awssdk.http.HttpStatusCode.*

@QuarkusTest
@TestInstance(Lifecycle.PER_CLASS)
class MainTest {

    @Test
    fun test() {
        "foobar" shouldContain "oba"
    }
}