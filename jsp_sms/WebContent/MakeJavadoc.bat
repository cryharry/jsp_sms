REM Use this file to generate Javadoc in the "doc" folder
CD /D D:\�ſ�\OCX\KCM����ocx
if not exist doc md doc
javadoc -classpath C:\EZJcom\ezjcom18.jar;. -overview overview.html -d doc -link file:///C:\EZJcom\doc SMS\*.java
pause