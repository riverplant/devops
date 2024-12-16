package com.devops.demo.spi.importSelector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ZooImportSelector.class})
public class ConfigB {

}
