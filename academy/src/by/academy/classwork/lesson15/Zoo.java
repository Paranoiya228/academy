package by.academy.classwork.lesson15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jdk.jfr.MetadataDefinition;

@MetadataDefinition
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Zoo {
	String number();
}
