@echo off
echo -----------------------------------------
echo . (C) MIW -UPM
echo -----------------------------------------
echo .
set workspace=C:\Users\Diana\workspaceAPAW\APAW-ECP2-Diana-Enero
echo .
cd %workspace%
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
call mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
call mvn sonar:sonar -X -Dsonar.organization=dianagtf-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=87f2b031ef5f70e17f4982faab5364db57c2467d --settings settings.xml
pause