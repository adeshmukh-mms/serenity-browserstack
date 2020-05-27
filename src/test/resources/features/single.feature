Feature: Google's Search Functionality
@smoke 
    Scenario Outline: Can find search results
        When I type query <query>
        And I submit
        Then I should see title <title>
        
     Examples:
        |query|title|
        |"BrowserStack"|"BrowserStack - Google Search"|
