# Model drzewa

## Wstęp 

Projekt różni się od zadanego projektu głównie z tego powodu, iż stworzenie klas abstrakcyjnych dla drzewa liściastego 
oraz iglastego nie wydawało mi się dobrym pomysłem, ponieważ osobiście nie widzę powodów, dlaczego lepiej było, by lepiej
zastosować dwie klasy abstrakcyjne dla drzewa liściastego i iglastego, a następnie zaimplementować je poprzez klasy drzew 
właściwych. Dlatego też w tym projekcie stworzyłem jedną klasę Tree, która to posiada pola parametryzujące je jako drzewo 
liściaste bądź iglaste, a następnie już konkretny gatunek. Dodatkowo niezależnie od typu drzew czy to liściaste czy iglaste 
to zarówno w jednej, jak i drugiej grupie są drzewa, które np. zrzucają liście na zimę np. modrzew. 

## Opis

Projekt jest implementacją lasu, który posiada drzewa. Drzewa mogą być liściaste bądź iglaste i posiadają liście, 
gałęzie szyszki/owoce. Aktualnie jest możliwość dodania drzewa oraz pobrania listy istniejących drzew. 
Niektóre parametry takie jak wiek drzewa są walidowane za pomocą adnotacji springowych.

## Stos technologiczny
Na potrzeby projektu wykorzystane zostały następujące technologie
* **JAVA 11**
* **SPRING BOOT 2.7.**
* **SWAGGER**
* **LIQUIBASE**
* **H2**

## Testy 

Na razie został zaimplementowany tylko jedne prosty test metody findAll. 

## Uruchomienie 
Aplikacja domyślnie uruchomi się na porcie 8001 oraz ma skonfigurowany Swagger dostępny pod adresem http://localhost:8001/swagger-ui.html#
