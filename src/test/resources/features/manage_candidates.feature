Feature: Manage Candidates

  Scenario: Hire a candidate
    Given HiringManager is on the login page
    When he logs in with valid credentials
    And he navigates to the Recruitment page
    And he adds a new candidate with valid details
    And he shortlists the candidate
    And he schedules an interview for the candidate
    And he marks the interview as passed
    And he offers the candidate a job
    And he hires the candidate
    Then he sees the candidate has the status "Hired"