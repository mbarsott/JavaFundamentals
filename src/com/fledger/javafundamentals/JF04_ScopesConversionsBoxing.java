// Java Fundamentals 04 - variable scope, type conversion, boxing and unboxing primitive types
package com.fledger.javafundamentals;

public class JF04_ScopesConversionsBoxing {

  // Scope: when you create a variable, it exists within a defined scope. During the execution of a program
  // scopes are created and destroyed according to the flow of execution of the program.
  // In general, a pair of curly braces ({}) define a scope.
  // Class level scope variables are those defined within the class definition curly braces, but out of any method.
  // The variables i and k are at the class level scope (we will explain static later):
  static int i = 0;
  static int k = 2;

  public static void main(String[] args) {
    // Variables declared within a method have local scope.
    // Within a method, you still can access class scoped variables:
    System.out.println(i);
    // The variables i below has local scope, and hides the class scoped variable i:
    int i = 10;
    System.out.println(i);

    {
      // You can have blocks within methods. Variables declared within these blocks also have local scope.
      // The variable j below has local scope, and you still can access variables from outer scopes:
      int j = i; // assigns 10 to j because local scoped variables have precedence over class scoped variables.
      System.out.println(j); // prints 10
      int k = 20; // hides class scoped k
      System.out.println(k); // prints 20
      // you cannot redeclare variables already defined in the same scope. you cannot put another "int i;" here.
    }

    // You cannot access a local scoped variable out of its definition block... no access to j here.
    // System.out.println(j); this statement would then cause a compiler error here
    // But since the local scope from the block above does not exist anymore, you can declare another local j here
    int j = 100;
    System.out.println(j); // prints 100

    // we are out of the previous block, so local k is out of scope and class scoped k is visible again:
    System.out.println(k); // prints 2

    // and since there is no local scoped k defined anymore, you can declare another local scoped k:
    int k = 200; // this hides class scoped k again
    System.out.println(k); // prints 200

    // Type Conversion - implicit type conversion
    // Some different types are compatible and thus can be assigned directly with automatic conversion:
    int anInt = 42;
    long aLong = anInt; // this is ok, because a long can accommodate any int. This is an implicit type conversion.
    // Implicit type conversions are also called widening conversions because they convert a type into a wider type.
    // In mathematical expressions the compiler converts to the widest type necessary:
    short aShort = 16;
    System.out.println(aShort + anInt + aLong); // the result printed is of type long because the widest one is a long.
    System.out.println(aLong * 10f); // the result printed is a float because the float literal 10f is the widest
    System.out.println(anInt * aLong / 100.0); // the result printed is a double because 100.0 is a double literal
    anInt = 2000000000; // 2 billion
    // be careful, though. 2 billion squared does not fit in an int. Even if it is afterwards assigned to a long
    aLong = anInt * anInt; // the expression overflows to a negative int, which is then converted to a long
    System.out.println(aLong); // prints -1651607200... pay attention to the limits that primitive types can hold

    // Type conversion - explicit type conversion
    // When converting from one type to another, you may run into problems like the overflow above.
    // Most of the time, if the conversion is risky the compiler will not allow an implicit conversion.
    // So, if you are sure of what you are doing, you can use a cast, the name of the type in parenthesis:
    aLong = 42; // this is a pretty small number. You know it fits in a short too!
    aShort = (short) aLong; // (short) is a cast. The compiler would not allow a narrowing conversion without it.
    anInt = (int) 2000000000.9; // you can cast floating point types to integer types...
    System.out.println(anInt); // prints 2000000000. The fraction part is ignored because of the cast to int.
    // and even use a widening cast, so this now works! The widest type in the expression is now a long!
    aLong = anInt * (long) anInt; // now every type in the expression is converted to a long too!
    System.out.println(aLong); // prints 4000000000000000000

    // Boxing and Unboxing
    // You know primitive types are stored by value and objects are stored by reference (see the previous module)
    // There are some situations where you have to pass a primitive type by reference.
    // In that case you can box the variable. All primitive types have a boxing type that has the same name,
    // starting with an upper case letter. For example: boolean -> Boolean. long -> Long. etc.
    Long boxedLong = 42l; // java can automatically convert a primitive type to a boxed type (boxing)
    aLong = getSquared(boxedLong); // and also from a boxed type to a primitive type (unboxing)
    System.out.println(aLong);
    System.out.println(getSquared(42l)); // same result as three lines above, because boxing and unboxing work!
    // Pay attention that the boxing type for int is Integer, though.
    // Boxing and Unboxing is used a lot with collections, a subject we will address a few modules ahead
  }

  static Long getSquared(Long l) {
    return l * l;
  }
}

// previous file: src/com/fledger/javafundamentals/JF03_VarsTypesOperators.java -> https://goo.gl/oQEf6N
// next file:
