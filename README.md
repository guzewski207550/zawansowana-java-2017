<a href="https://travis-ci.org/">
  <img src="https://travis-ci.org/guzewski207550/zawansowana-java-2017.svg?branch=master"></img>
</a>
# Zawansowane Zagadnienia Programowania w Javie
> Jest to repozotorium przechowujące projekty wykonywane w ramach laboratorium z przedmiotu Zawansowane Zagadnienia Programowania w Javie.

## Moduły:
- **first-project**
- **test-exercise**

## Moduł "first-project":
W ramach tego modułu został wygenerowany nowy projekt mavenowy, wykorzystując polecenie:

> `mvn archetype:generate -DgroupId=pl.lodz.p.edu.ftims -DartifactId=first-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`. 

Następnie projekt został przetworzony na prosty serwis, który posiada interfejs sumujący wiek użytkowników używając strumieni, oraz sortujący uczestników. Zaimplementowane zostały dwie metody sortujące - jedna tradycyjna oraz druga wykorzystująca wyrażenia lambda. Do zaimplementowanych metod zostały napisane testy jednostkowe oraz wykorzystane zostało "Mockito" w celu zmokowania listy użytkowników serwisu.

## Moduł "test-exersice":
Projekt wykonany w ramach drugich zajęć z tego przedmiotu. Zawiera on przykładowy projekt wraz z pustymi testami jednostkowymi, które należało uzupełnić.