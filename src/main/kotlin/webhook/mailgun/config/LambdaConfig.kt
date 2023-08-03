package webhook.mailgun.config

import io.smallrye.config.ConfigMapping
import io.smallrye.config.WithName

@ConfigMapping(prefix = "lambda")
interface LambdaConfig {

    @WithName("name")
    fun name(): String = "quarkus-test-bug-3-2-2"

    @WithName("mailgun")
    fun mailgun(): MailgunConfig

    @WithName("aws")
    fun aws(): AwsConfig
}

@ConfigMapping(prefix = "lambda.mailgun")
interface MailgunConfig {

    @WithName("signing-key")
    fun signingKey(): String
}

@ConfigMapping(prefix = "lambda.aws")
interface AwsConfig {

    @WithName("region")
    fun region(): String

    @WithName("account-id")
    fun accountId(): String
}