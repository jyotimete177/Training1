Feature: Verify Login Credential
Background: open browser and url
Given open Browser
Given open url
Scenario Outline: verify login cridential with valid data
When user click on sign in button
And user pass emailId and Click on Create An Account button
And  when user account creation
|First name|<First name>|
|Last name|<lname>|
|Email|<email>|
|Password|<pass>|
#Last name|<lname>|
|Company|<company>|
|Address * | <adds>|
|Address (Line 2)|<add line2>|
|City |<city>|
|Zip/Postal Code|<post code>|
|Additional information|<add info>|
|Home phone|<home number>|
|Mobile phone|<mo number>|
|Assign an address alias for future reference.|<future add>|
And User click on Resister button

Examples:
|First name|lname|email|pass|company|adds|add line2|city|post code|add info|home number|mo number|future add|
|jyoti |mete|mete177@gmail.com| 28May1999@|tcs|gurudwara chowk,pune|gurudwra,line23,plot35,flat45|Pune|41372|this is newYork|0248723|917031177177|gurudwra,line23,plot35,flat45|