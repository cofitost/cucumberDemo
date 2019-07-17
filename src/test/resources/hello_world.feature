Feature: Greeting

    Scenario: Say Hello
        Given I have an application with "Hello"
        When I ask it to say hi
        Then I receive "Hello"