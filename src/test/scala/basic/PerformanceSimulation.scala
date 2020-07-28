package test.scala.basic

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class PerformanceSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://localhost:8080")
    .acceptHeader("text/plain")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Gatling")

  val scn = scenario("PerformanceSimulation")
    .repeat(10) {
      exec(http("GET /io").get("/posts/1"))
    }

  setUp(
    scn.inject(atOnceUsers(1000))
  ).protocols(httpProtocol)
}