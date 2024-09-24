# Functionality : Spring boot app which exposes metrics
Simple spring boot app which exposes some metrics


# Technical details and Pre-requisites
- Written using core java and spring boot framework
- Leverages spring boot actuator dependency and also uses prometheus


# How to run locally
- Clone this branch (spring-boot-actuator-demo) to your laptop with the below command:
  (`git clone --branch spring-boot-actuator-demo https://github.com/msoumik78/hireable-coder-java`)
- Ensure that you have latest JDK and Maven3.8.5 available
- Build the project using the command :
  (`mvn clean package`)
- Now run the app using the below command :
  (`java -jar target/spring-boot-actuator-demo-0.0.1-SNAPSHOT.jar`)
- The management endpoint is exposed at : http://localhost:8085/management:
- Prometheus endpoint is exposed at : http://localhost:8085/management/prometheus


# How to set up Prometheus and point to spring boot server
- Download and install prometheus from [here](https://prometheus.io/download/)
- Create a config file named prometheus-config.,yml with the below content:
```kotlin
scrape_configs:
- job_name: 'spring-boot-application'
  metrics_path: '/management/prometheus'
  scrape_interval: 5s
  static_configs:
    - targets: ['localhost:8085']
  ```
- Now start promethus with the below command so that it starts scraping the spring boot endpoint
  (For windows, you will have to use prometheus.exe in place of prometheus and for linux OS, you will have to run it as ./prometheus):
  `prometheus --config.file=prometheus-config.yml`

