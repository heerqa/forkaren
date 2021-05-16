# to run automated test please use following command
<p>for #ui</p>
mvn clean verify -P chromedriver
<p>for #rest </p>p>
mvn clean verify -P rest

<h3> use serenity.conf </h3>
1. to run the test in headless mode please change 
headless.mode = true
in file serenity.conf

2. to run the test in display mode please change
      headless.mode = false
      in file serenity.conf

<h3> webdriver setting </h3>
We need to place the maching chromedrive in resource/webdriver folders for various system