package com.ioet.acme.process;

import com.ioet.acme.data.Period;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputProcessor {

    private final String[] portions;

    public InputProcessor(String input) {
        this.portions = input.split("=");
        if (portions.length != 2) {
            throw new RuntimeException("Input format does not match, we need NAME=BLOCK,BLOCK");
        }
    }

    public String name() {
        return portions[0];
    }

    public List<Period> periods() {
        String blockLine = portions[1];
        String[] blocks = blockLine.split(",");
        return Arrays.stream(blocks)
                .map(InputProcessor::parser)
                .collect(Collectors.toList());
    }

    private static Period parser(String block) {
        return new Period(block);
    }
}
