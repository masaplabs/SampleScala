package test

import org.specs2.mutable._
//import org.specs2.runner._
//import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

//import controllers._



/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
// @RunWith(classOf[JUnitRunner])
class RoomsSpec extends Specification {

  "Rooms" should {

    "render index" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render add" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(POST, "/rooms"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render get(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render update(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(PUT, "/rooms/1"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render delete(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(DELETE, "/rooms/1"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render getMembers(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1/members"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render updateMembers(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(PUT, "/rooms/1/members"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render getMessages(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1/messages"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render postMessages(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(POST, "/rooms/1/messages"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render getMessage(roomId: Long, messageId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1/messages/1"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render getTasks(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1/tasks"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render postTasks(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(POST, "/rooms/1/tasks"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render getTask(roomId: Long, taskId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1/tasks/1"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render getFiles(roomId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1/files"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
    "render getFile(roomId: Long, fileId: Long)" in {
      running(FakeApplication()) {
        val Some(index) = route(FakeRequest(GET, "/rooms/1/files/1"))

        status(index) must equalTo(501)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
  }
}
