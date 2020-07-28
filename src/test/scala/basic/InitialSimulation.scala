package com.pragmatists.gatling

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._

class InitialSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl("https://jsonplaceholder.typicode.com")
    .acceptHeader(" application/json")

  private val scn= scenario("Initial Scenario")
    .exec(http("Get all posts")
    .get("/posts"))

  setUp(
    scn.inject(atOnceUsers(10))
  ).protocols(httpProtocol)
}
