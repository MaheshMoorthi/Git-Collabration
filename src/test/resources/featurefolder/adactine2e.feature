Feature:  verifying the order id in adactinHotel App
Scenario Outline: Getting order id for different testdata

    Given user want to login the adactin hotel app with valid "<userName>" and "<password>"
    When user enter the "<location>","<hotels>","<roomtype>","<noOfRoom>","<checkindate>","<checkoutdate>","<adultcount>","<childcount>" and click the search button
    And user select the hotel and click continue
    And user enter the "<firstName>","<lastname>","<billingAddress>","<cardNo>","<cardType>","<expMonth>","<expYear>","<cvv>" and clicking the Booknow
   	Then user verify the order id  and close the browser

    Examples: 
      | userName  | password | location  |hotels       |roomtype|noOfRoom|checkindate|checkoutdate|adultcount|childcount|firstName|lastname  |billingAddress  |cardNo          |cardType					|expMonth|expYear|cvv   |
      |celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|1 - One |20/01/2021 |	21/01/2021|	1 - One  |1 - One   |Manish1  |mahav     |chennai-6001214 |1234567891230124|VISA     		  		|February|2021   |   123|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|1 - One |20/01/2021 |	21/01/2021|	1 - One  |2 - Two   |Manish2  |mahav     |chennai-6001214 |1234567891230124|American Express  |December|2022   |   235|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|2 - Two |20/01/2021 |	21/01/2021|	1 - One  |1 - One   |Manish3  |mahav     |chennai-6001214 |1234567891230124|VISA    					|April	 |2022   |   153|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|1 - One |20/01/2021 |	21/01/2021|	1 - One  |1 - One   |Manish4  |mahav     |chennai-6001214 |1234567891230124|Master Card   	  |December|2021   |   128|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|1 - One |20/01/2021 |	21/01/2021|	1 - One  |2 - Two   |Manish5  |mahav     |chennai-6001214 |1234567891230124|Master Card    		|March   |2022   |   253|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|2 - Two |20/01/2021 |	21/01/2021|	1 - One  |1 - One   |Manish6  |mahav     |chennai-6001214 |1234567891230124|VISA    					|December|2022   |   363|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|1 - One |20/01/2021 |	21/01/2021|	1 - One  |2 - Two   |Manish7  |mahav     |chennai-6001214 |1234567891230124|VISA   						|December|2022   |   823|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|1 - One |20/01/2021 |	21/01/2021|	1 - One  |1 - One   |Manish8  |mahav     |chennai-6001214 |1234567891230124|VISA   						|November|2021   |   923|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|2 - Two |20/01/2021 |	21/01/2021|	1 - One  |2 - Two   |Manish9  |mahav     |chennai-6001214 |1234567891230124|Master Card   		|October |2021   |   723|
      #|celinagrace|devbeu123 | Sydney    |	Hotel Creek|Standard|1 - One |20/01/2021 |	21/01/2021|	1 - One  |1 - One   |Manish0  |mahav     |chennai-6001214 |1234567891230124|Master Card   	  |January |2022   |   723|
        
    
    