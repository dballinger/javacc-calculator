package com.braxisltd.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArithmeticParserTest {

    @Test
    public void shouldJustPrintOutCalculation() throws Exception {
        new ArithmeticParser("1.2 + 300").parse();
    }

    @Test
    public void shouldAddIntegers() throws Exception {
        ArithmeticParser parser = new ArithmeticParser("1 + 2");
        parser.parse();
        assertThat(parser.evaluate(), is(new Value("3")));
    }

    @Test
    public void shouldSubtractIntegers() throws Exception {
        ArithmeticParser parser = new ArithmeticParser("1 - 2");
        parser.parse();
        assertThat(parser.evaluate(), is(new Value("-1")));
    }

    @Test
    public void shouldDivideIntegers() throws Exception {
        ArithmeticParser parser = new ArithmeticParser("1 / 2");
        parser.parse();
        assertThat(parser.evaluate(), is(new Value("0.5")));
    }

    @Test
    public void shouldMultiplyIntegers() throws Exception {
        ArithmeticParser parser = new ArithmeticParser("1 * 2");
        parser.parse();
        assertThat(parser.evaluate(), is(new Value("2")));
    }
}
