package my.project.module2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleClass2Test {

    @Test
    void testSum() {
        // given
        final var object = new SimpleClass2();
        // when
        final var sum = object.sum(1, 2);
        // then
        assertEquals(3, sum);
    }

}
