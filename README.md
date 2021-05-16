# to run automated test please use following command
<h3> for #ui</h3>
mvn clean verify -P chromedriver <br>
<h3>for #rest </h3> <br>
mvn clean verify -P rest <br>

<h3> use serenity.conf </h3>
1. to run the test in headless mode please change <br>
headless.mode = true <br>
in file serenity.conf <br>

2. to run the test in display mode please change <br>
      headless.mode = false <br>
      in file serenity.conf <br>

<h3> webdriver setting </h3> <br>
We need to place the maching chromedrive in resource/webdriver folders for various system <br>

<h3> Testing approches </h3><br>
1. so far we have chromedriver and rest maven profile. Similarly we can create profile to run test in browserstack for cross browsers and OS.
Serenity provide out if box configuration support. However, in testNg it will not be hard to setup since browserstaack has detailed instruction.
<br>
2. We can also have jmeter .jmx file in the same project and run with a different maven profile. Jmeter provide extensive support to run rom command lien and using maven.
<br>
<br>
<h3> running test in Jenkins </h3>
<br>
Everything that we can run on local, we can run in Jenkins or any CD and CI tools, by adding the required plugin in.
<br>
In this case i will typically create maven supported build, and configure the build in 2 ways.
<br>
A. when we merge automation code to master branch, the build will run.
<br>
B. set the build dependent on dev deployment, so that it automatically trigger when app is deployed via jenkins build.
<br>
C. configure the build to run at a specified time as nightly build
<br>
The reports will be displayed using HTML publisher plugin in Jenkins.
<br>
The chromedriver in the project must match the installed google-chrome browser on jenkins box, also the test will run in headless mode.