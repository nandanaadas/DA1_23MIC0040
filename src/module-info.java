package calculator;

public class CalculatorService {
    
    public int multiply(int a, int b) {
        return a * b;
    }
}

pom
  <project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.calc</groupId>
    <artifactId>calculator</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>calculator</name>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.3</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0</version>
            </plugin>
        </plugins>
    </build>

</project>

  test
  package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testClass {

    @Test
    void checkmultiply() {
        CalculatorService service = new CalculatorService();
        int result = service.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    void checkmultiplywithzero() {
        CalculatorService service = new CalculatorService();
        int result = service.multiply(4, 0);
        assertEquals(0, result);
    }
}
