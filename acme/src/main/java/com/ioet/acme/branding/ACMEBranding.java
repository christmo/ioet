package com.ioet.acme.branding;

import com.ioet.acme.process.CasesFile;
import com.ioet.acme.process.PaymentProcess;

import java.io.File;
import java.util.List;

public class ACMEBranding implements Branding {

    @Override
    public void banner() {
        System.out.println("|***********************************************************************************|");
        System.out.println("|                      ___       ______ .___  ___.  _______                         |");
        System.out.println("|                     /   \\     /      ||   \\/   | |   ____|                        |");
        System.out.println("|                    /  ^  \\   |  ,----'|  \\  /  | |  |__                           |");
        System.out.println("|                   /  /_\\  \\  |  |     |  |\\/|  | |   __|                          |");
        System.out.println("|                  /  _____  \\ |  `----.|  |  |  | |  |____                         |");
        System.out.println("|                 /__/     \\__\\ \\______||__|  |__| |_______|                        |");
        System.out.println("|                                                                                   |");
        System.out.println("|***********************************************************************************|");
    }

    @Override
    public void source(File file) {
        System.out.println("|");
        System.out.println("| File: " + file.getAbsolutePath());
        System.out.println("|");
    }

    @Override
    public void printCases(CasesFile casesFile) {
        String line;
        PaymentProcess process;
        List<String> cases = casesFile.cases();
        for (int i = 0; i < cases.size(); i++) {
            System.out.println(String.format("| Case %s:", i + 1));
            System.out.println("| INPUT");
            line = cases.get(i);
            System.out.println("| " + line);
            System.out.println("|");
            System.out.println("| OUTPUT:");
            process = new PaymentProcess(line);
            System.out.println("| " + process.calculate());
            System.out.println("|");
        }
    }

}
