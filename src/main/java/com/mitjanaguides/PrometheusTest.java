package com.mitjanaguides;

/**
 * -javaagent:./jmx_prometheus_javaagent-0.16.1.jar=10087:./config/prom-config.yml
 */
public class PrometheusTest {

    public static void main(String[] args) {
        try {
            while(true) {
                Thread.sleep(1000);
                System.out.println("Aplicacion corriendo");
            }
        } catch (Exception e) {}
    }
}
