package webhook.mailgun

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent as Request
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent as Response

class Main: RequestHandler<Request, Response> {

    /*
     * Mailgun handles http status codes as following:
     *
     * 200 -> success without retry
     * 406 -> failure without retry
     * anything else -> failure with retries after 10 min, 10 min, 15 min, 30 min, 1 hour, 2 hours and 4 hours
     *
     * Source: https://documentation.mailgun.com/en/latest/user_manual.html#webhooks-1
     */
    override fun handleRequest(input: Request, context: Context): Response {
//        val statusCode = runBlocking {
//            pipeline
//                .processUpdate(input.body)
//                .fold(
//                    ifLeft = { error -> when(error) {
//                        is PublishingFailed -> SERVICE_UNAVAILABLE
//                        else -> NOT_ACCEPTABLE
//                    }},
//                    ifRight = { OK }
//                )
//        }
        return Response().withStatusCode(202)
    }
}