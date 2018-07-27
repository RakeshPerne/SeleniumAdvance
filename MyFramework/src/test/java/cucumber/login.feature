#first cucumber feature file
Feature: Login Functionality
Scenario:login valid users
	Given I am on the login user
	When I give tomsmith and SuperSecretPassword!
	