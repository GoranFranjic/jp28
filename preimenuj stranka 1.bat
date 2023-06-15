@echo off
setlocal

REM Dobivanje trenutnog datuma
for /f "tokens=1-3 delims=/ " %%a in ('date /t') do (
    set "day=%%a"
    set "month=%%b"
    set "year=%%c"
)

REM Formatiranje datuma
set "formatted_date=%year%-%month%-%day%"

REM Preimenovanje mapa
rename "C:\FIPOS\1\odgovor" "odgovor_%formatted_date%"
rename "C:\FIPOS\1\zahtjev" "zahtjev_%formatted_date%"

REM Preimenovanje datoteke
rename "C:\FIPOS\1\FiskalizacijaDEV.log" "FiskalizacijaDEV_%formatted_date%.log"

pause

echo Završeno.