# prometheus-metrics-example
Basic Java Application with Prometheus metrics

Uses: https://github.com/prometheus/jmx_exporter 

Start the application adding this VM param:

-javaagent:./jmx_prometheus_javaagent-0.16.1.jar=10087:./config/prom-config.yml