package oopsConcept;

public class Abstraction {

	/**
	 * OO Abstraction occurs during class level design, with the objective of
	 * hiding the implementation complexity of how the the features offered by
	 * an API / design / system were implemented, in a sense simplifying the
	 * 'interface' to access the underlying implementation.
	 * 
	 * This process can be repeated at increasingly 'higher' levels (layers) of
	 * abstraction, which enables large systems to be built without increasing
	 * the complexity of code and understanding, at higher layers.
	 * 
	 * For example, a Java developer can make use of the high level features of
	 * FileInputStream without concern for how it works (i.e. file handles, file
	 * system security checks, memory allocation and buffering will be managed
	 * internally, and are hidden from consumers). This allows the
	 * implementation of FileInputStream to be changed, and as long as the API
	 * (interface) to FileInputStream remains consistent, code built against
	 * previous versions will still work.
	 * 
	 * Similarly, when designing your classes, you will want to hide internal
	 * implementation from others as far as possible
	 * 
	 * How we can achieve abstraction? -- abstract class and interface
	 * 
	 * Hiding Implementation and showing only functionality to end user is known
	 * as abstraction. It can be achieved through ‘abstract class’ and
	 * ‘interface’.
	 */

}
