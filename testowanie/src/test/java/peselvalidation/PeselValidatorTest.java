package peselvalidation;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;

public class PeselValidatorTest {

    @Test
    public void hasCorrectLengthDetectsShortStrings() {
        assertFalse(PeselValidator.hasCorrectLength("1234"));
    }

    @Test
    public void hasCorrectLengthDetectsLongStrings() {
        assertFalse(PeselValidator.hasCorrectLength("12936963598659234"));
    }

    @Test
    public void hasCorrectLengthDetectsCorrectsStrings() {
        assertTrue(PeselValidator.hasCorrectLength("12345678910"));
    }

    @Test
    public void hasOnlyDigitsDetectsNonDigits() {
        assertFalse(PeselValidator.hasOnlyDigits("12345afafaga10"));
    }

    @Test
    public void hasOnlyDigitsDetectsNumericalString() {
        assertTrue(PeselValidator.hasOnlyDigits("1234510"));
    }

    @Test
    public void hasCorrectChecksumDetectsCorrectChecksum() {
        assertFalse(PeselValidator.hasCorrectChecksum("00211369613"));
    }

    @Test
    public void hasCorrectBirthDateDetectsIncorrectMonth() {
        assertFalse(PeselValidator.hasCorrectBirthDate("00131369613"));
    }

    @Test
    public void hasCorrectBirthDateDetectsIncorrectDayInMonth() {
        assertFalse(PeselValidator.hasCorrectBirthDate("00843169613"));
    }

    @Test
    public void hasCorrectBirthDateDetectsIncorrectFebruaryInLeapYear() {
        assertFalse(PeselValidator.hasCorrectBirthDate("00022969613"));
        assertFalse(PeselValidator.hasCorrectBirthDate("89022969613"));
        assertTrue(PeselValidator.hasCorrectBirthDate("88022969613"));
        assertTrue(PeselValidator.hasCorrectBirthDate("00222969613"));
    }

    @Test
    public void hasCorrectBirthDateDetectsCorrectBirthDate() {
        assertTrue(PeselValidator.hasCorrectBirthDate("00211369613"));
    }

    @Test
    public void validateCorrectly() {
        List<ValidationErrors> errors;
        errors = PeselValidator.validate("00211369615");
        assertTrue(errors.isEmpty());

        errors = PeselValidator.validate("002113696");
        assertEquals(1, errors.size());
        assertTrue(errors.contains(ValidationErrors.INVALID_LENGHT));

        assertThat(PeselValidator.validate("002113696"))
                .hasSize(1)
                .contains(ValidationErrors.INVALID_LENGHT);

        errors = PeselValidator.validate("3238hrhr8j9");
        assertThat(PeselValidator.validate("3238hrhr8j9"))
                .hasSize(1)
                .containsExactly(ValidationErrors.NOT_ONLY_DIGITS);

        errors = PeselValidator.validate("00211369613");
        assertThat(PeselValidator.validate("00211369613"))
                .hasSize(1)
                .containsExactly(ValidationErrors.INVALID_CHECK_SUM);

        errors = PeselValidator.validate("20219369615");
        assertThat(PeselValidator.validate("20219369615"))
                .hasSize(1)
                .containsExactly(ValidationErrors.INVALID_DATE);

        errors = PeselValidator.validate("02741369614");
        assertThat(PeselValidator.validate("02741369614"))
                .hasSize(2)
                .containsExactly(ValidationErrors.INVALID_CHECK_SUM, ValidationErrors.INVALID_DATE);
    }
}