package webhook.mailgun.integration

import io.kotest.matchers.string.shouldContain
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.*
import org.junit.jupiter.api.TestInstance.Lifecycle


@QuarkusTest
@TestInstance(Lifecycle.PER_CLASS)
class LambdaTest {

    @Test
    fun test() {
        "foobar" shouldContain "oba"
    }
}