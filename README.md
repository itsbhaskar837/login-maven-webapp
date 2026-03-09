# login-maven-webapp
Project Steps

  390  mkdir login-maven-webapp
  391  cd login-maven-webapp
  392  mkdir -p src/main/java/com/app
  393  mkdir -p src/main/webapp/WEB-INF
  394  ll
  395  vim pom.xml
  396  vim src/main/webapp/index.jsp
  397  vim src/main/webapp/login.jsp
  398  vim src/main/webapp/signup.jsp
  399  vim src/main/java/com/app/LoginServlet.java
  400  vim src/main/java/com/app/SignupServlet.java
  401  vim src/main/webapp/WEB-INF/web.xml
  402  tree
  403  tree login-maven-webapp
  404  cd ..
  405  tree login-maven-webapp
  406  pwd
  407  ll
  408  cd login-maven-webapp
  409  mvn clean package
  410  ll
  411  target/login-maven-webapp.war
  412  ll
  413  cd target/
  414  ll
  415  scp login-maven-webapp.war root@192.168.10.15:/opt/apache-tomcat-10.1.52/webapps
  416  history

