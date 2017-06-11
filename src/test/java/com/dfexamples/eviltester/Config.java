package com.dfexamples.eviltester;

public interface Config {

    final String baseUrl = System.getProperty("baseUrl","http://www.waveville.net/~dforshaw/seleniumTestPages-ajr/pages");

    final String browser = System.getProperty("browser", "firefox");
}
