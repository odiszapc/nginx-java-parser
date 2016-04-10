REM Run from src/main/resources/grammar
@echo off
antlr -listener -lib . -o ..\..\..\..\src\main\java\com\github\odiszapc\nginxparser\antlr -visitor Nginx.g4

REM Or:
REM java -jar c:\antlr\antlr-4.5.3-complete.jar -listener -lib . -o ..\..\..\..\src\main\java\com\github\odiszapc\nginxparser\antlr -visitor Nginx.g4