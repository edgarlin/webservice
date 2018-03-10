package sample.pkg;

public @interface SampleAnnotation {
	String[] strs() default { "A", "B" };
	int[] ints();
}
