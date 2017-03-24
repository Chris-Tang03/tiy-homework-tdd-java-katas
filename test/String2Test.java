import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class String2Test {

    @Test
    /**
     * Given a string of "Hello"
     * Then return string without first and last characters
     */

    public void whenGivenStringHelloThenRemoveChars (){
        //Act
        String returnStr = String2.withoutEnd("Hello");
        //Assert
        assertThat(returnStr, equalTo("ell"));
    }

    @Test
    /**
     * Given a string of "Java"
     * Then return string without first and last characters
     */

    public void whenGivenStringJavaThenRemoveChars (){
        //Act
        String returnStr = String2.withoutEnd("Java");
        //Assert
        assertThat(returnStr, equalTo("av"));
    }

    @Test
    /**
     * Given a string of "coding"
     * Then return string without first and last characters
     */

    public void whenGivenStringCodingThenRemoveChars (){
        //Act
        String returnStr = String2.withoutEnd("Coding");
        //Assert
        assertThat(returnStr, equalTo("odin"));
    }

}
