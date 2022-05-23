package _22y._05m.maven;
// Apache Maven - nástroj pro správu projektu, nástupce Apache Ant.
// Nutno zmínit, že jeden z nejstarších a dfochovalých nástrojů
// pro správu projektu je GNU Make.

// Nový projekt -> Maven
// Přidání závislostí:
// Otevřít pom.xml, alt+insert -> přidat Dependency

// Možnost vygenerování jar souboru pomocí mvn install:
// Otevřít pom.xml, alt+insert -> přidat plugin a nakonfigurovat:

//<build>
//  <plugins>
//    <plugin>
//      <groupId>org.apache.maven.plugins</groupId>
//      <artifactId>maven-jar-plugin</artifactId>
//      <version>2.4</version>
//      <configuration>
//        <archive>
//          <manifest>
//            <addClasspath>true</addClasspath>
//            <mainClass>dbTest.AutoimkrementId</mainClass>
//          </manifest>
//        </archive>
//      </configuration>
//    </plugin>
//  </plugins>
//</build>


public class Uvod {
}
