package webhook.mailgun

import webhook.mailgun.integration.LambdaTest
import io.quarkus.test.junit.QuarkusIntegrationTest
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle

@QuarkusIntegrationTest
@TestInstance(Lifecycle.PER_CLASS)
class LambdaIT: LambdaTest()