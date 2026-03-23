@echo off
REM Shape Area Calculator - Run Script for Windows

echo Compiling Java files...
javac Shape.java Circle.java Rectangle.java Triangle.java ShapeAreaCalculator.java

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed! Please check your code.
    pause
    exit /b %ERRORLEVEL%
)

echo.
echo Compilation successful. Running the application...
echo.

java ShapeAreaCalculator

echo.
echo Program exited.
pause
