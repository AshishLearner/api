Feature: Demo
  Scenario: PERFORM UPDATE OPERATION
    When I TRIGGER THE POST METHODE
    Then USER IS CREATED
    And PRINT THE BODY
    And RETRIVE THE STATUS LINE

    @tag1
    Scenario: PERFORM GET OPERATION FOR LIST USER

      When USER ADD QUERY PARAM AND TRIGGER THE METHODE
      And  REQUEST BODY IS DISPLAY
      Then VERIFY FOR VALID USER
      And PRINT THE LAST NAME

      @tag2
      Scenario: PERFORM THE UPDATE OPERATION

        When USER ENTER PARAM AND LAUNCH THE METHODE
        Then USER DATA WILL UPDATE
        And VERIFY USER
