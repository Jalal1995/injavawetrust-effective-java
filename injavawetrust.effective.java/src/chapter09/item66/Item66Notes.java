package chapter09.item66;

public class Item66Notes {

	// #####
	// Item 66: Use native methods judiciously

	/*
	 * The Java Native Interface (JNI) allows Java programs to call native methods,
	 * which are methods written in native programming languages such as C or C++.
	 */

	// Historically, native methods have had three main uses.
	// - They provide access to platform-specific facilities such as registries.
	// - They provide access to existing libraries of native code, including legacy
	// libraries that provide access to legacy data
	// - Finally, native methods are used to write performance-critical parts of
	// applications in native languages for improved performance.

	//    It is rarely advisable to use native methods for improved performance.  
	//                         

	// The use of native methods has serious disadvantages. Because native
	// languages are not safe (Item 50), applications using native methods are no
	// longer immune to memory corruption errors.                 
	// Because native languages are more platform-dependent than Java, programs
	// using native methods are less portable.                 

	/*
	 * They are also harder to debug. If you aren’t careful, native methods can
	 * decrease performance because the garbage collector can’t automate, or even
	 * track, native memory usage (Item 8), and there is a cost associated with
	 * going into and out of native code. Finally, native methods require “glue
	 * code” that is difficult to read and tedious to write.
	 */

	/*
	 * In summary, think twice before using native methods. It is rare that you need
	 * to use them for improved performance. If you must use native methods to
	 * access low-level resources or native libraries, use as little native code as
	 * possible and test it thoroughly. A single bug in the native code can corrupt
	 * your entire application.
	 */
}
