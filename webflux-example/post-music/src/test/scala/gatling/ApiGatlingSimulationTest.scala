package gatling

import java.util.concurrent.TimeUnit

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._

import scala.concurrent.duration.{Duration, FiniteDuration}

class ApiGatlingSimulationTest extends Simulation {

  val scn: ScenarioBuilder = scenario("PostSongs").repeat(10, "n") {
    exec(
      http("Post-API")
        .get("http://localhost:8091/post")
        .check(status.is(200))
    ).pause(Duration.apply(5, TimeUnit.MILLISECONDS))
  }

  setUp(scn.inject(atOnceUsers(2000))).maxDuration(FiniteDuration.apply(10, "minutes"))

}