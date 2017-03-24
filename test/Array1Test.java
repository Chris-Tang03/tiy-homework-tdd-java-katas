import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Cwolf on 3/23/17.
 */
public class Array1Test {

    @Test
    public void whenLengthIsZeroThenReturnZero (){
        int[] returnNum = new int[0];
        assertThat(Array1.sum2(returnNum), equalTo(0));
    }

    @Test
    public void whenLengthIsOneThenReturnNumber (){
        //Creating an integer array and assigning a new int array to returnNum
        int[] returnNum = new int[1];
        //Changing the array value at the zeroeth index
        returnNum[0] = 13;

        assertThat(Array1.sum2(returnNum), equalTo(13));
    }

    @Test
    public void whenLengthIs2OrMoreThenReturnSumOfFirstTwoNums (){
        int[] returnNum = new int[2];
        assertThat(Array1.sum2(returnNum), equalTo(returnNum[0] + returnNum[1]));
    }
}


/*

    String[] myStrings = new String[1]


    //
    {"Word",}

    {"Word" , "word2". "word3}



    myString[] =




 */