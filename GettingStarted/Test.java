///Task2: “Test”. Create a project, enter, compile and run the following application.
public class Test
{
   //----------------------------------------------------
   //  Prints a statement.
   //----------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("An Emergency Broadcast");
   }
}
// a. Change Test to test.
// Error: The public type test must be defined in its own file.
// Its because the file should be named test.java and along with that the class should also have the same name.

// b. Change Emergency to emergency.
//No Error as we can print any string of any words and sentences as we want.

//c. Remove the first quotation mark in the string.
// Error: String literal is not properly closed by a double-quote.
// Its because the compiler expects balanced quotation marks.

//d. Change main to man.
// Error: Exception in thread "main" java.lang.Error: Unresolved compilation problem: at Test.main(HelloWorld.java:13)
// The main method is the program's entry point, so it will throw an error if the compiler couldnt find one.

//e. Change println to bogus.
// Error: The method bogus(String) is undefined for the type PrintStream.
// Its because the System class does not have a method named bogus.

//f. Remove the semicolon at the end of the println statement.
// Error: Syntax error, insert ";" to complete BlockStatements.
// Its because, in Java, statements are terminated by semicolons.

//g. Remove the last brace in the program.
//Error: Syntax error, insert "}" to complete ClassBody.
// Because every opening brace must have a matching closing brace.
