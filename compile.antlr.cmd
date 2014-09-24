REM Run from src/main/resources/grammar
@echo off
antlr -listener -lib . -o ..\..\..\..\src\main\java\com\github\odiszapc\nginxparser\antlr -visitor Nginx.g4