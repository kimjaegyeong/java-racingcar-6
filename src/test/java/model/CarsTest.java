package model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    public void 자동차들_생성() {
        String input = "pobi,jun,woni";
        Cars cars = new Cars(input);
        assertThat(cars.getCars().size()).isEqualTo(3);
    }

}
