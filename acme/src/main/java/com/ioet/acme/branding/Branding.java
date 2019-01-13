package com.ioet.acme.branding;

import com.ioet.acme.process.CasesFile;

import java.io.File;

public interface Branding {

    void banner();

    void source(File file);

    void printCases(CasesFile casesFile);
}
