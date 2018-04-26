package pesel;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class PeselValidatorTest {


    @Parameters({"92111108355", "23080930761", "99999999999", "99740917407409174174", "98728", "alaljkalajj"})
    @Test
    public void isntConvertedToNumbers(String pesel) {
        PeselValidator p = new PeselValidator();
    }

    @Parameters({"92111108355", "23080930761", "99999999999", "99740917407409174174", "98728", "alaljkalajj"})
    @Test (expected = IndexOutOfBoundsException.class)
    public void stringContainisToManyLetters(String pesel) {

    }

    @Parameters({"92111108355", "23080930761", "99999999999", "99740917407409174174", "98728", "alaljkalajj"})
    @Test
    public void stringContainsTooLittleLetters(String pesel) {

    }

    @Parameters({"92111108355", "23080930761", "99999999999", "99740917407409174174", "98728", "alaljkalajj"})
    @Test (expected = IllegalArgumentException.class)
    public void stringContainsCharactersOtherThanNumbers(String pesel) {

    }

    @Test
    public void wrongDate(){

    }

    @Test
    public void wrongIdNumber(){

    }
}