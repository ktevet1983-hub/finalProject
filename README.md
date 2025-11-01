# Final Automation Project

## 📘 Overview
This project was created as part of a QA Automation assessment and serves as a demonstration of a complete automation framework built with **Java**, **Selenium**, **TestNG**, and **Maven**.  
It follows a modular design based on the **Page Object Model (POM)** and includes reusable utilities, workflows, and reporting integration.

The framework is designed to test both **web applications** (e.g., SauceDemo, Grafana) and can easily be extended to additional systems.

---

## 🧱 Project Structure
```
finalProject/
│
├── pom.xml                  # Maven dependencies and build management
├── testng.xml               # TestNG suite configuration
├── src/
│   ├── main/java/
│   │   ├── testAutomation/utilities/     # CommonOps, Listeners, Managers, etc.
│   │   └── testAutomation/workflows/     # Reusable business flows
│   └── test/java/
│       └── sanity/                       # Test classes (GrafanaWebTest, SauceDemoWebTest)
│
├── resources/               # Config files, data sets, and test recordings
└── README.md                # This file
```

---

## ⚙️ Tools & Technologies
- **Language:** Java 17  
- **Automation Framework:** TestNG  
- **Build Tool:** Maven  
- **Browser Automation:** Selenium WebDriver  
- **Reporting:** Allure Reports (optional integration)  
- **Design Pattern:** Page Object Model (POM)

---

## 🚀 How to Run Tests

### Option 1 – Run via IntelliJ IDEA
1. Open the project in **IntelliJ IDEA**.
2. Right-click on the file `testng.xml`.
3. Choose **Run 'testng.xml'**.

### Option 2 – Run via Command Line (Maven)
```bash
mvn clean test
```
> Note: Ensure Maven is installed and added to your system PATH before running from the terminal.

---

## 📊 Reports
After test execution, reports are generated under:
```
target/allure-results/
```
You can open the report with:
```bash
allure serve target/allure-results
```
*(if Allure is configured locally)*

---

## 🧩 Framework Highlights
- ✅ Supports multiple environments (local / remote / grid)
- ✅ Built with reusability in mind (utility & workflow layers)
- ✅ Easy integration with CI/CD tools (Jenkins, GitHub Actions)
- ✅ Clear test suite hierarchy with `testng.xml`

---

## ⚠️ Notes
- One of the sample test cases is **expected to fail intentionally** — this demonstrates how the framework handles failures and generates detailed reports.  
- The focus of this project is **framework structure and code quality**, not necessarily passing test logic.

---

## 👤 Author
**Kfir Tevet**  
QA Automation Engineer  

