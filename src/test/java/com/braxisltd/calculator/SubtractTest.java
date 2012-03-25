package com.braxisltd.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SubtractTest {
    @Test
    public void shouldSubract() throws Exception {
        assertThat(new Subtract().operate(new Value("2"), new Value("1")), is(new Value("1")));
    }

}
