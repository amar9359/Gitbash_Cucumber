Feature: Validating Place API's
 
  Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with Post http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "GetPlaceAPI"
    
    Examples: 
    	|name	| language	|address|
    	|amar	|marathi		|nashik	|
    	|bbb	|english		|ahmdbad|
    	|ccc	|sajs				|hjdh		|