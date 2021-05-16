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

<h3> Testing approches </h3>
1. so far we have chromedriver and rest maven profile. Simialry we can create profile to run test in browserstack for cross browsers and OS.
Serenity provide out if box configuration support. However, in testNg it will not be hard to setup since browserstaack has detailed instruction.

2. We can also have jmeter .jmx file in the same project and run with a different maven profile. Jmeter provide extensive support to run rom command lien and using maven.

<h3> running test in Jenkins </h3>
Everything that we can run on local, we can run in Jenkins or any CD and CI tools, by adding the required plugin in.
In this case i will typically create maven supported build, and configure the build in 2 ways.
A. when we merge automation code to master branch, the build will run.
B. set the build dependent on dev deployment, so that it automatically trigger when app is deployed via jenkins build.
C. configure the build to run at a specified time as nightly build

The reports will be displayed using HTML publisher plugin in Jenkins.
The chromedriver in the project must match the installed google-chrome browser on jenkins box, also the test will run in headless mode.