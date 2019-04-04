package romannumberconverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {
  RomanNumberConverter romanNumberConverter;

  @Before
  public void setup() {
    romanNumberConverter = new RomanNumberConverter();
  }

  @Test
  public void check() {
      assertThat(romanNumberConverter.convert(7))
        .isNotEmpty()
        .isEqualTo("VII");
   }

   @Test
   public void check_positif() {
     assertThatThrownBy(() -> romanNumberConverter.convert(-1))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("number can't be negative");
    }
}
