package de.thi.annotations;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.*;

@Retention(RUNTIME)
public @interface AuthorAnnotation
{
	String author() default "Anonymous";

	String date();
}