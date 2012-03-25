package com.braxisltd.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AddTest {
    @Test
    public void shouldAddValues() throws Exception {
        Value result = new Add().operate(new Value("1"), new Value("21.22"));
        assertThat(result.toString(), is("22.22"));
    }
}
