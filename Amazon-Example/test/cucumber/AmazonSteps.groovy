import cucumber.runtime.PendingException
import static cucumber.runtime.groovy.EN.*
import pages.AmazonHomePage

Given(~'^I open the amazon homepage$') { ->
    to AmazonHomePage
}
Then(~'^I should see the amazon logo$') { ->
    at AmazonHomePage
}