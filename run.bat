SET JAVA_OPTS="-Xms256m -Xmx512m"
cd D:\VIPS\dummy
set Projectpath=D:\VIPS\dummy
echo %Projectpath%
set classpath=%Projectpath%\bin;%Projectpath%\lib\*
echo %classpath%
java org.testng.TestNG %Projectpath%\testng.xml
pause