package de.thi.annotations;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.util.Set;

public class App
{
	public static void main(String[] args)
	{
		Reflections reflections = new Reflections("de.thi", new TypeAnnotationsScanner(), new SubTypesScanner());
		Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(AuthorAnnotation.class);

		for (Class<?> clazz : annotated)
		{
			AuthorAnnotation annotation = clazz.getAnnotation(AuthorAnnotation.class);
			System.out.println("Class " + clazz.getName() + " was written by " + annotation.author() + " on " + annotation.date());
		}
	}
}
