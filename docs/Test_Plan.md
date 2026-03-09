
📋 Software Test Plan (STP) - Kef-La-Hayot Automation


1. Introduction
   This document outlines the test strategy and plan for the automated testing of the Kef-La-Hayot pet store website. The goal is to ensure high-quality user experience and functional stability across key areas of the site.


2. Test Scope
   The automation suite focuses on the following domains:

    UI/UX Integrity: Validating text readability, layout consistency, and element visibility.
    
    Navigation & Links: Ensuring all internal links and store pages redirect correctly.
    
    Functional Scenarios: Verification of empty states and dynamic content sections.


3. Test Environment
   Language: Java 17+

    Framework: TestNG (v7.x)
    
    Web Driver: Selenium WebDriver (v4.x)
    
    Browser: Chrome (Latest Version)
    
    Build Tool: Maven
    
    Reporting: Allure Framework


4. Test Strategy
    Page Object Model (POM): To ensure maintainability, all web elements and actions are encapsulated within Page classes (e.g., LinksPage).

    Base Classes: Common setup/teardown and utility methods (screenshots, scrolling) are centralized in BaseTest and BasePage.

    Visual Evidence: Every test execution integrates screenshots. For layout bugs, CDP (Chrome DevTools Protocol) is utilized for full-page captures.

    Reporting: Allure reports are used to track test execution status, features, and severity levels.


5. Test Suite (STD Snippet)
   ID	    Feature	        Test Case Description	                Expected Result
   TC-11	Links Page	    Verify "PTV Store" link redirection.	User is redirected to a page with content.
   TC-12	Empty Sections	Check for empty content containers.	    No empty sections should appear on active pages.
   TC-13	Delivery UI	    Validate text spacing and readability.	Text must be clear and without overlap at any zoom level.


6. Exit Criteria
    All critical and major bugs are documented with evidence.

    Automation suite runs without environment-related failures.

    Allure reports are generated with clear pass/fail history.