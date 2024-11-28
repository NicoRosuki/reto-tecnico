Feature: Manage Candidates

  Scenario: Hire a candidate
    Given HiringManager is on the login page
    When he logs in with valid credentials
    And he adds the new candidate "Juan" "Perez" with email "jperez1234@email.com"
    And he completes the hiring process for the candidate
    Then he sees the candidate has the status "Hired" and candidate data is correct