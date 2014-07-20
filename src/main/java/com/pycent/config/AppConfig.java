package com.pycent.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
 /**
  * 
  * @author wxd
  *
  */
@Configuration
@ComponentScan(basePackages = {"com.pycent"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})
})
public class AppConfig {
}