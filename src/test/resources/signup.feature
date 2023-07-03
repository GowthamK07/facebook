Feature: SignUp

Background:  Common steps
Given: launch url
When launch "https://www.facebook.com/"

@login
Scenario: check Login

When Enter Email "gowthamk@gmail.com"
When Enter password1 "password@1234d"
When Click Login

@forgot
Scenario: Forgotten password

When click forgot password
Then enter email amd search "gowthamhello@gmail.com"


@signup
Scenario Outline: Multi Signin

When click Create New Account 
When Enter First and sure Name "<firstname>" "<surename>"
When Enter Email amd ReEnter "<email>" "<reenter>"
When Enter Password "<password>"
When Select DOB "<day>" "<month>" "<year>"
When select gender
When Click Signup 

Examples:

|firstname|surename|email|reenter|password|day|month|year|
|gowtham|kgow|gowthamk.k@gmail.com|gowthamk.k@gmail.com|Gowtham@fagag5|1|Jan|1996|
|smith|smi|smithsmik@gmail.com|smithsmik@gmail.com|Smithhkagt@ahaj7|1|Feb|1995|

