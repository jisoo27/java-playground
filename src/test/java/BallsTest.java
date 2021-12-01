import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    @Test
    void nothing() {
        Balls answers = new Balls(Arrays.asList(1, 2, 3));
        BallStatus status =answers.play(new Ball(1, 4));
        assertThat(status).isEqualTo(BallStatus.NOTHING);

    }


}
