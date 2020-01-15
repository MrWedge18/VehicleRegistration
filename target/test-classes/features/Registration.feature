Feature: Vehicle Registration

Background:
 Given User is on registration page

Scenario: Successful registration of vehicle
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User enters a valid city
 And User enters a valid state
 And User selects a country
 And User enters a valid zip code
 And User selects a vehicle type
 And User selects a fuel type
 And User selects a year of mfg
 And User clicks submit
 Then Alert fur successful registration is displayed
 And Page is closed
 
Scenario: User fails to select title
 When User clicks submit
 Then Alert for missing title is displayed
 And Page is closed
 
Scenario: User fails to fill in valid name
 When User selects a title
 And User clicks submit
 Then Alert for invalid owner name is displayed
 And Page is closed
 
Scenario: User fails to select gender
 When User selects a title
 And User enters a valid name
 And User clicks submit
 Then Alert for missing gender is displayed
 And Page is closed
 
Scenario: User fails to enter a valid address
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User clicks submit
 Then Alert for invalid address is displayed
 And Page is closed
 
Scenario: User fails to enter a valid city
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User clicks submit
 Then Alert for invalid city is displayed
 And Page is closed
 
Scenario: User fails to enter a valid state
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User enters a valid city
 And User clicks submit
 Then Alert for invalid state is displayed
 And Page is closed
 
Scenario: User fails to select a country
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User enters a valid city
 And User enters a valid state
 And User clicks submit
 Then Alert for missing country is displayed
 And Page is closed

Scenario: User fails to enter a valid zip code
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User enters a valid city
 And User enters a valid state
 And User selects a country
 And User clicks submit
 Then Alert for invalid zip code is displayed
 And Page is closed

Scenario: User fails to select a vehicle type
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User enters a valid city
 And User enters a valid state
 And User selects a country
 And User enters a valid zip code
 And User clicks submit
 Then Alert for missing vehicle type is displayed
 And Page is closed

Scenario: User fails to select a fuel type
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User enters a valid city
 And User enters a valid state
 And User selects a country
 And User enters a valid zip code
 And User selects a vehicle type
 And User clicks submit
 Then Alert for missing fuel type is displayed
 And Page is closed

Scenario: User fails to select a year of mfg
 When User selects a title
 And User enters a valid name
 And User selects a gender
 And User enters a valid address
 And User enters a valid city
 And User enters a valid state
 And User selects a country
 And User enters a valid zip code
 And User selects a vehicle type
 And User selects a fuel type
 And User clicks submit
 Then Alert for missing year of mfg is displayed
 And Page is closed