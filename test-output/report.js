$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Automation/BDDFacebook/src/test/java/com/page/featurefiles/LoginLogoutpage.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Loginlogout feature",
  "description": "",
  "id": "facebook-loginlogout-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Facebook Loginlogout scenario",
  "description": "",
  "id": "facebook-loginlogout-feature;facebook-loginlogout-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is alredy avilable in loginpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of loginpage is facebook",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginLogoutScript.user_is_alredy_avilable_in_loginpag()"
});
formatter.result({
  "duration": 235334567,
  "error_message": "java.lang.NullPointerException\r\n\tat com.page.script.LoginLogoutScript.user_is_alredy_avilable_in_loginpag(LoginLogoutScript.java:35)\r\n\tat ✽.Given user is alredy avilable in loginpage(D:/Automation/BDDFacebook/src/test/java/com/page/featurefiles/LoginLogoutpage.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginLogoutScript.title_of_loginpage_is_facebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginLogoutScript.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginLogoutScript.User_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
});