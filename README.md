🐾 Kef-La-Hayot Automation Project
Comprehensive automation suite for testing the Kef-La-Hayot pet store website. This project focuses on identifying UI/UX bugs, broken links, and layout inconsistencies using modern automation practices.


🚀 Project Overview
This project was developed to ensure the quality and reliability of the "Kef-La-Hayot" e-commerce platform. It covers end-to-end scenarios, UI validation, and bug reporting integrated with professional visual evidence.


Key Features:
Hybrid Framework: Built with Selenium WebDriver and TestNG.

Page Object Model (POM): Clean and maintainable code structure.

Advanced Reporting: Integration with Allure Reports, including screenshots and custom attachments.

CDP Integration: Utilizing Chrome DevTools Protocol for full-page evidence capturing.

Bug Lifecycle: Includes formal Bug Reports (TC-11, TC-12, TC-13 etc.) based on real findings.


🛠 Tech Stack
Language: Java

Automation: Selenium WebDriver

Testing Framework: TestNG

Reporting: Allure Framework

Build Tool: Maven


🐛 Identified Bugs (Bug Log)
ID	    Title	                    Severity	Evidence
Bug-12	Empty Section on Links Page	Normal	[Allure Screenshot]


Note: Detailed Bug Reports (including STP/STD) are located in the /docs folder of this repository.


📊 Reports & Visuals
Allure Reporting
The suite generates detailed reports for every execution.

Overview: Summarized pass/fail status.

Behaviors: View results by Features and Stories (e.g., Links Page UI, Delivery UI).

Attachments: Every failed test or UI bug includes high-resolution screenshots.

[View Detailed Bug Reports](./docs/Bug_Reports.md)
[View Test Plan (STP)](./docs/Test_Plan.md)


Video Demo
A full execution video of the automation suite can be viewed here: https://itzhak-levy-protfolio.netlify.app/.

🔧 How to Run
Clone the repository:


git clone https://github.com/ItzhakLevy1/kef-la-hayot-automation.git
Navigate to the directory:


cd kef-la-hayot-automation
Run tests via Maven:


mvn clean test
Generate Allure Report:


allure serve target/allure-results


👤 Author
Itzhak Levy

Full Stack Developer & QA Automation Engineer

https://www.linkedin.com/in/itzhak-levy-66bb671bb/ | https://itzhak-levy-protfolio.netlify.app/