package com.devops.demo.spi.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ZooImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		
		return new String[] {"com.devops.demo.spi.importSelector.ZoonConfig"};
	}

}
