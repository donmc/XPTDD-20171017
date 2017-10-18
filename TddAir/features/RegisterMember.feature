Feature: Register Member
As a frequent flyer
I want to register as a member
so that I can get benefits

Scenario: Success
When frequent flyer "donmc" registers with email "don@improving.com"
Then member "donmc" is registered
And member "donmc" status is "Red"
And member "donmc" ytdMiles is 0
And member "donmc" balance miles is 10000

Scenario: Duplicate user name
Given frequent flyer "donmc" registers with email "don@improving.com"
When frequent flyer "donmc" registers with email "don@gmail.com"
Then error "duplicate username" us shown