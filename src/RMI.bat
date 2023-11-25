@echo off
echo Check the location of rmiregistry.exe
SET "JAVA_HOME=C:\Program Files\Java\jdk-21"
SET "PATH=%JAVA_HOME%\bin;%PATH%"

echo Compiling Java files...
cd "c:\RMI_Hello_Calculator\src"
javac -cp . common\HelloCalc.java server\Server.java client\Client.java

echo Starting rmiregistry...
start cmd /k cd "c:\RMI_Hello_Calculator\src" ^& "%JAVA_HOME%\bin\rmiregistry"

echo Starting the server...
start cmd /k cd "c:\RMI_Hello_Calculator\src" ^& java -cp . server.Server

REM Waiting for the server to start (2 seconds delay)
timeout /t 2

echo Starting the client...
start cmd /k cd "c:\RMI_Hello_Calculator\src" ^& java -cp . client.Client

echo All processes have been started.
