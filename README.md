<strong>D287 Java Frameworks - Ryan Corson</strong>

Git repository URL: https://gitlab.com/wgu-gitlab-environment/student-repos/rcorso6/d287-java-frameworks.git

<strong>Changes will be as they appear in the GitLab Commit for that specific section</strong>

<strong>Part C changes:</strong><br>
Customize the HTML user interface for your customer's application.<br>
(file, line, changes)

    mainscreen.html, line 14, adds demo.css stylesheet to <head>
    mainscreen.html, line 16, changes <title> to "Sk8 Shop"
    mainscreen.html, line 21, changes <h1> to "Sk8 Shop"
    mainscreen.html, line 23, changes <h2> to "Skateboard Parts"
    mainscreen.html, line 55, changes <h2> to "Complete Skateboards"
    InhousePartForm.html, line 8, adds demo.css stylesheet to <head>
    OutsourcedPartForm.html, line 8, adds demo.css stylesheet to <head>
    productForm.html, line 8, adds demo.css stylesheet to <head>
    saveproductscreen.html, line 6, adds demo.css stylesheet to <head>
    demo.css, lines 1-3, adds styling properties to file

<strong>Part D changes</strong><br>
Add an "About" page to the application, include navigation to and from the "About" page and the main screen.<br>
(file, line, changes)

    adds about.html file to src/main/resources/templates
    about.html, line 2, adds thymeleaf declaration
    about.html, lines 7-13, adds the meta tags and bootstrap CSS information from mainpage.html
    about.html, line 15, changes <title> to "About Us"
    about.html, line 16, adds demo.css stylesheet to <head>
    about.html, lines 19-30, adds body to about.html
    adds AboutController.java file to src/main/java/com.example.demo/controllers
    AboutController.java, lines 1-13, creates controller for about.html
    mainscreen.html, line 22, adds About Us button that navigates to the about.html
    about.html, line 20, adds Home button that navigates to mainscreen.html

<strong>Part E changes:</strong><br>
Add a sample inventory to the application, consisting of 5 parts and 5 products<br>
(file, line, changes)

    BootStrapData.java, lines 71-107, creates 5 parts and adds them to the application
    BootStrapData.java, lines 109-121, creates 5 products and adds them to the application

<strong>Part F changes:</strong><br>
Add "Buy Now" button to product list. <br>-Must be next to the buttons that update and delete parts. 
<br>-The button should decrement the inventory of the product by one, leaving the part inventory unaffected. 
<br>-The button must display a message that indicates the success or failure of a purchase.<br>
(file, line, changes)

    mainscreen.html, line 85, creates "Buy Now" button
    adds purchaseFailed.html file to src/main/resources/templates
    AddProductController.java, lines 176-190, adds buyProduct method
    -if product inventory is 0 directs to purchaseFailed.html
    -if product inventory is greater than 0:
    --product inventory is decremented by one, then viewer is directed to purchaseSuccessful.html

<strong>Part G changes:</strong><br>
Modify the parts to track maximum and minimum inventory.<br>
-Add additional fields to Part.java  for maximum and minimum inventory.<br>
-Modify the sample inventory to include the maximum and minimum inventory fields.<br>
-Add additional text inputs for the inventory to the InhousePartForm and OutsourcedPartForm so the user can set
maximum and minimum values.<br>
-Rename the file the persistent storage is saved to.<br>
-Modify the code to enforce the inventory is between or at the maximum and minimum values.<br>
(file, line, changes)

    Part.java, lines 31-34, adds minInv and maxInv fields
    Part.java, lines 97-104, adds getter and setter methods for minInv and maxInv
    mainscreen.html, lines 41 & 42, adds Min. Inventory and Max Inventory <th> elements to <table>
    mainscreen.html, lines 51 & 52, adds <td> elements to the <table> to include minimum and maxiumum inventory values
    BootStrapData.java, lines 77 & 78, adds deck.setMinInv() and deck.setMaxInv()
    BootStrapData.java, lines 85 & 86, adds truck.setMinInv() and truck.setMaxInv()
    BootStrapData.java, lines 93 & 94, adds gripTape.setMinInv() and gripTape.setMaxInv()
    BootStrapData.java, lines 101 & 102, adds wheel.setMinInv() and wheel.setMaxInv()
    BootStrapData.java, lines 109 & 110, adds bearing.setMinInv() and bearing.setMaxInv()
    InhousePartForm.html, lines 24-27, adds input fields for user to input minimum and maximum inventory values
    OutsourcedPartForm.html, lines 28-31, adds input fields for user to input minimum and maximum inventory values
    application.properties, line 6, changes file where storage is saved
    InhousePartForm.html, lines 7 & 8, adds bootstrap information in <link>
    InhousePartForm.html, lines 13 & 40, creates <div> to use bootstrap to turn body into a container
    InhousePartForm.html, line 20, adds "Part Name: " text to <p> before <input> field
    InhousePartForm.html, line 22, adds "Part Price: " text to <p> before <input> field
    InhousePartForm.html, line 25, adds "Inventory Count: " text to <p> before <input> field
    InhousePartForm.html, line 28, adds "Minimum Inventory Value: " text to <p> before <input> field
    InhousePartForm.html, line 30, adds "Maximum Inventory Value: " text to <p> before <input> field
    InhousePartForm.html, line 32, adds "Part ID: " text to <p> before <input> field
    OutsourcedPartForm.html, lines 8 & 9, adds bootstrap information in <link>
    OutsourcedPartForm.html, lines 13 & 39, creates <div> to use bootstrap to turn body into a container
    OutsourcedPartForm.html, line 21, adds "Part Name: " text to <p> before <input> field
    OutsourcedPartForm.html, line 23, adds "Part Price: " text to <p> before <input> field
    OutsourcedPartForm.html, line 26, adds "Inventory Count: " text to <p> before <input> field
    OutsourcedPartForm.html, line 29, adds "Company Name: " text to <p> before <input> field
    OutsourcedPartForm.html, line 31, adds "Minimum Inventory Value: " text to <p> before <input> field
    OutsourcedPartForm.html, line 33, adds "Maximum Inventory Value: " text to <p> before <input> field
    OutsourcedPartForm.html, line 32, adds Minimum Inventory error check
    OutsourcedPartForm.html, line 35, adds Maximum Inventory error check
    InhosuePartForm.html, line 29, adds Minimum Inventory error check
    InhousePartForm.html, line 32, adds Maximum Inventory error check
    Adds InventoryValidator.java to src/main/java/com.example.demo/validators
    Adds ValidInventory.java to src/main/java/com.example.demo/validators
    Part.java, line 23, adds @ValidInventory to use ValidInventory interface and InventoryValidator
    InhousePartForm.html, lines 36-43, adds <div> section to check for errors
    OutsourcedPartForm.html, lines 37-44, adds <div> section to check for errors

<strong>Part H changes:</strong><br>
Add validation for between or at the maximum and minimum fields.<br>
-Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum 
number of parts.<br>
-Display error messages for low inventory when adding and updating products lowers the part inventory below the 
minimum.<br>
-Display error messages when adding and updating parts if the inventory is greater than the maximum.
(file, line, changes)

    EnufPartsValidator.java, lines 35 - 49, adds logic to check if inventory requirements are met when updating product.

<strong>Part I changes:</strong><br>
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.<br>
(file, line, changes)

    PartTest.java, lines 159-194, adds testGetMin(), testSetMin(), testGetMax(), testSetMax()

<strong>Part J changes:</strong><br>
Remove the class files for any unused validators in order to clean your code.
(file, line, changes)

    deletes the DeletePartValidator.java from src/main/java/com.example.demo/validators
    deletes the ValidDeletePart.java from src/main/java/com.example.demo/validators
    Part.java, line 19, removes unused ValidDeletePart validator annotation
    Part.java, line 3, removes unused ValidDeletePart validator import

<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH 
SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION 
TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage 
existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this 
assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. 
Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu 
email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. 
Next you will download the “Inventory Management Application Template Code” provided in the web links section and open 
it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and 
backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using 
> [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. 
> Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. 
> This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory 
> and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project 
> will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. 
> This will allow you to create a name for your branch. Once the branch has been named, you can 
> select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name 
> for the branch. Make sure checkout branch is selected and press create. You can now add a commit message 
> and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future 
use in career search, experience, and education!
