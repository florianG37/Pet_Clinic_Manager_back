package org.springframework.samples.petclinic.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "org.springframework.samples.petclinic.rest")
public class ApplicationSwaggerConfig {
}
