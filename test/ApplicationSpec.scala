package test

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

import controllers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
// @RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification {

  "Application" should {

    "render index" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/"))

        status(index) must equalTo(OK)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
  }
}
