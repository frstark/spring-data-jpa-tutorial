#AUFGABE 4: SPRING DATA JPA VERTIEFUNG 
Ziel:
![](.doc_images/6578a8a2.png)


Initial:
![](.doc_images/new-project.png)

## Table of Contents
1.[Connecting with the DB](#connecting_with_db)
2.[Mapping Entities with the DB](#mapping_entities_with_db)
3.[JPA Relationships](#jpa_relationships)
3.1[One-To-Many Relationships](#one_to_one)
3.2[One-To-Many Relationships](#one_to_many)



## Connecting with DB <a name="connecting_with_db"></a>
JPA with Hibernate integration

![](.doc_images/0ffccbdc.png)
![](.doc_images/7a5992a1.png)

## Mapping Entities with DB <a name="mapping_entities_with_db"></a>

Studen class:
![](.doc_images/4ec95a39.png)

## Different JPA Annotations
Die Jakarta Persistence API (JPA; früher Java Persistence API) ist eine Schnittstelle für Java-Anwendungen, 
die die Zuordnung und die Übertragung von Objekten zu Datenbankeinträgen vereinfacht.

![](.doc_images/43f06ef5.png)
![](.doc_images/35810962.png)
![](.doc_images/e043fc9a.png)

## Repository
Nützliche Funktionen
![](.doc_images/003b35c6.png)

![](.doc_images/55045f37.png)

Testing:
![](.doc_images/4029ec49.png)
![](.doc_images/67b08f2f.png)
![](.doc_images/00665ae1.png)


## Embedded
![](.doc_images/78569634.png)
![](.doc_images/2c95a406.png)

Bestehende Spalten überschreiben
![](.doc_images/f075d60d.png)

Test:
![](.doc_images/ec12765e.png)
![](.doc_images/f82e32f0.png)

## Creating JPA Repository

![](.doc_images/70b9864e.png)

![](.doc_images/2d81a3ee.png)

![](.doc_images/758bb6c0.png)

## JPQL Query

![](.doc_images/a7b4ed32.png)

![](.doc_images/a85a445c.png)

## Native Query
![](.doc_images/05c78621.png)

## Transactional and @Modifying Annotations

Rollback bei Fehler

![](.doc_images/cb06f353.png)

![](.doc_images/a60598da.png)

![](.doc_images/37e8b43d.png)


## JPA  Relationships <a name="jpa_relationships"></a>

### One to One relationship <a name="one_to_one"></a>
![](.doc_images/2f724f9c.png)

Course to CourseMaterial 

Entities
![](.doc_images/4b61586f.png)
![](.doc_images/03a0161d.png)

Beziehung einbauen
![](.doc_images/704fc76f.png)

Repository erstellen
![](.doc_images/b4737366.png)
![](.doc_images/ff61af28.png)

Testing
![](.doc_images/cc38dc30.png)
Fehler da versucht wurde Course zu speichern ohne einen course erstellt zu haben.

Cascading
Gibt die properties von den Eltern zum Kind
![](.doc_images/3ff483f2.png)

![](.doc_images/d46ead55.png)

![](.doc_images/d3d82a96.png)

 Fetch Type
![](.doc_images/1726170f.png)
![](.doc_images/fc3164eb.png)
![](.doc_images/37dcce74.png)

Ergebnis:
![](.doc_images/c81b3ea1.png)

Uni & Bi directional relationship
![](.doc_images/944108ae.png)

![](.doc_images/d059fb5c.png)

### One to Many Relationship <a name="one_to_many"></a>
![](.doc_images/10be965c.png)

Lehrer kann mehrere Kurse haben
![](.doc_images/64559962.png)

![](.doc_images/e8f491d6.png)

![](.doc_images/0f060b79.png)

#### Many to One:
Besser als One to Many
![](.doc_images/a8bf5e7b.png)

![](.doc_images/a934cf0e.png)

Test:
![](.doc_images/ae0c40c5.png)
![](.doc_images/746d01be.png)

![](.doc_images/5ba693c2.png)


