101 C# LINQ Samples in Java
===========================

Port of the [C# 101 LINQ Samples](http://code.msdn.microsoft.com/101-LINQ-Samples-3fb9811b) rewritten into Andriod-compatible [Java 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html).

Compare Java to other LINQ examples written in:

 - [Kotlin](https://github.com/mythz/kotlin-linq-examples)
 - [Swift](https://github.com/mythz/swift-linq-examples)
 - [Clojure](https://github.com/mythz/clojure-linq-examples)
 - [Dart](https://github.com/mythz/dart-linq-examples)
 - [Elixir](https://github.com/omnibs/elixir-linq-examples)
 - [Templates](http://templates.servicestack.net/linq/restriction-operators)

## [Call .NET Web Services from Java](http://docs.servicestack.net/java-add-servicestack-reference)

If you're looking for an effortles typed API for consuming .NET Web Services in pure Java or Android Java Apps checkout ServiceStack's [Java Add ServiceStack Reference](https://github.com/ServiceStack/ServiceStack/wiki/Java-Add-ServiceStack-Reference).

### Running the examples

Each of the LINQ Examples can be run from the included Android App with its results logged to the screen:

![](https://raw.githubusercontent.com/ServiceStack/Assets/master/img/wikis/java/linq-examples-screenshot.png)

Run the included [Android Studio project](https://github.com/mythz/java-linq-examples/tree/master/src) to execute all the examples. You can also choose to only run specific examples by commenting out any of the sections you're not interested in [MainActivity.java](https://github.com/mythz/java-linq-examples/blob/432dfeb0ea3c95ecdd8e007886a77d1508d6f312/src/app/src/main/java/servicestack/net/javalinqexamples/MainActivity.java#L54-L67).

A copy of the LINQ examples output is also available in [linq-log.txt](https://raw.githubusercontent.com/mythz/java-linq-examples/master/linq-log.txt).


### Contents

The samples below mirrors the C# LINQ samples layout with the names of the top-level Java methods matching their corresponding C# examples.

#### [LINQ - Restriction Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/Restrictions.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Restriction-Operators-b15d29ca)
#### [LINQ - Projection Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/Projections.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-to-DataSets-09787825)
#### [LINQ - Partitioning Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/Partitioning.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Partitioning-Operators-c68aaccc)
#### [LINQ - Ordering Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/Ordering.java) / [MSDN C#](http://code.msdn.microsoft.com/SQL-Ordering-Operators-050af19e)
#### [LINQ - Grouping Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/Grouping.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-to-DataSets-Grouping-c62703ea)
#### [LINQ - Set Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/SetOperators.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Set-Operators-374f34fe)
#### [LINQ - Conversion Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/Conversion.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Conversion-Operators-e4e59714)
#### [LINQ - Element Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/ElementOperators.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Element-Operators-0f3f12ce)
#### [LINQ - Generation Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/GenerationOperators.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Generation-Operators-8a3fbff7)
#### [LINQ - Quantifiers](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/Quantifiers.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Quantifiers-f00e7e3e)
#### [LINQ - Aggregate Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/AggregateOperators.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Aggregate-Operators-c51b3869)
#### [LINQ - Miscellaneous Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/MiscOperators.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Miscellaneous-6b72bb2a)
#### [LINQ - Query Execution](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/QueryExecution.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Query-Execution-ce0d3b95)
#### [LINQ - Join Operators](https://github.com/mythz/java-linq-examples/blob/master/src/app/src/main/java/servicestack/net/javalinqexamples/JoinOperators.java) / [MSDN C#](http://code.msdn.microsoft.com/LINQ-Join-Operators-dabef4e9)

## Java Functional Utils

Unlike many modern languages supporting a functional-style, Java doesn't have any LINQ-like utils built-in by default. It's also not very extensible which combined with the lack of proper Type Inference, Type Erasure and Closures in Java 1.7 makes the equivalent Java source code particularly more verbose.

To improve the development experience in Java, we've added common functional utils to simplify programming in a functional style inside [ServiceStack's Java and Android Client Library](https://github.com/ServiceStack/ServiceStack/wiki/Java-Add-ServiceStack-Reference): **net.servicestack:android**. 

### Install

To include it in your Android Studio project, add it to your **build.gradle** dependency, e.g:

    dependencies {
        compile fileTree(dir: 'libs', include: ['*.jar'])
        compile 'net.servicestack:android:1.0.24'
    }

Pure Java projects should add the **net.servicestack:client** dependency instead:

    dependencies {
        compile 'net.servicestack:client:1.0.24'
    }

Alternatively this library is also automatically added when Adding a Typed Remote Service Reference with ServiceStack IDE Plugins for [Intellij IDEA](https://github.com/ServiceStack/ServiceStack/wiki/Java-Add-ServiceStack-Reference#servicestack-idea-android-studio-plugin
) and [Eclipse Maven projects](https://github.com/ServiceStack/ServiceStack.Java/tree/master/src/ServiceStackEclipse#eclipse-integration-with-servicestack).

### Usage

Once the dependency is added you can add a static import to access [all the functional utils](https://github.com/ServiceStack/ServiceStack.Java/blob/master/src/AndroidClient/client/src/main/java/net/servicestack/func/Func.java) used in the LINQ examples below:

```java
import static net.servicestack.func.Func.*;
```

##  Side-by-side - C# LINQ vs Java

For a side-by-side comparison, the original **C#** source code is displayed above the equivalent **Java** translation. 

  - The **Output** shows the logging output of running the **Java** Android App. 
  - Outputs ending with `...` illustrates only a partial response is displayed. 
  - The C# ObjectDumper util used is downloadable from MSDN - [ObjectDumper.zip](http://code.msdn.microsoft.com/Visual-Studio-2008-C-d295cdba/file/46086/1/ObjectDumper.zip)

The Java LINQ Examples are limited to Java 1.7 so they're available on Android. 


LINQ - Restriction Operators
----------------------------

### linq1: Where - Simple 1

```csharp
//c#
public void Linq1() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var lowNums = 
        from n in numbers 
        where n < 5 
        select n; 
  
    Console.WriteLine("Numbers < 5:"); 
    foreach (var x in lowNums) 
    { 
        Console.WriteLine(x); 
    } 
}  
```
```java
//java
public void linq1(){
    int[] numbers = new int[]{ 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Integer> lowNums = filter(toList(numbers), new Predicate<Integer>() {
        @Override
        public boolean apply(Integer n) {
            return n < 5;
        }
    });

    Log.d("Numbers < 5:");
    for (int n : lowNums){
        Log.d(n);
    }
}
```
#### Output

    Numbers < 5:
    4
    1
    3
    2
    0

### linq2: Where - Simple 2
```csharp
//c#
public void Linq2() 
{ 
    List<Product> products = GetProductList(); 
  
    var soldOutProducts = 
        from p in products 
        where p.UnitsInStock == 0 
        select p; 
  
    Console.WriteLine("Sold out products:"); 
    foreach (var product in soldOutProducts) 
    { 
        Console.WriteLine("{0} is sold out!", product.ProductName); 
    } 
} 
```
```java
//java
public void linq2(){
    List<Product> products = getProductList();

    List<Product> soldOutProducts = filter(products, new Predicate<Product>() {
        @Override
        public boolean apply(Product p) {
            return p.unitsInStock == 0;
        }
    });

    Log.d("Sold out products:");
    for (Product p : soldOutProducts) {
        Log.d(p.productName + " is sold out!");
    }
}
```
#### Output

    Sold out products:
    Chef Anton's Gumbo Mix is sold out!
    Alice Mutton is sold out!
    Thüringer Rostbratwurst is sold out!
    Gorgonzola Telino is sold out!
    Perth Pasties is sold out!

### linq3: Where - Simple 3
```csharp
//c#
public void Linq3() 
{ 
    List<Product> products = GetProductList(); 
  
    var expensiveInStockProducts = 
        from p in products 
        where p.UnitsInStock > 0 && p.UnitPrice > 3.00M 
        select p; 
  
    Console.WriteLine("In-stock products that cost more than 3.00:"); 
    foreach (var product in expensiveInStockProducts) 
    { 
        Console.WriteLine("{0} is in stock and costs more than 3.00.", product.ProductName); 
    } 
} 
```
```java
//java
public void linq3(){
    List<Product> products = getProductList();

    ArrayList<Product> expensiveInStockProducts = filter(products, new Predicate<Product>() {
        @Override
        public boolean apply(Product p) {
            return p.unitsInStock > 0 && p.unitPrice > 3.00;
        }
    });

    Log.d("In-stock products that cost more than 3.00:");
    for (Product p : expensiveInStockProducts) {
        Log.d(p.productName + " is in stock and costs more than 3.00.");
    }
}
```
#### Output

    In-stock products that cost more than 3.00:
    Chai is in stock and costs more than 3.00.
    Chang is in stock and costs more than 3.00.
    Aniseed Syrup is in stock and costs more than 3.00.
    ...

### linq4: Where - Drilldown
```csharp
//c#
public void Linq4() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var waCustomers = 
        from c in customers 
        where c.Region == "WA" 
        select c; 
  
    Console.WriteLine("Customers from Washington and their orders:"); 
    foreach (var customer in waCustomers) 
    { 
        Console.WriteLine("Customer {0}: {1}", customer.CustomerID, customer.CompanyName); 
        foreach (var order in customer.Orders) 
        { 
            Console.WriteLine("  Order {0}: {1}", order.OrderID, order.OrderDate); 
        } 
    } 
} 
```
```java
//java
public void linq4(){
    List<Customer> customers = getCustomerList();

    List<Customer> waCustomers = filter(customers, new Predicate<Customer>() {
        @Override
        public boolean apply(Customer c) {
            return "WA".equals(c.region);
        }
    });

    Log.d("Customers from Washington and their orders:");
    for (Customer c : waCustomers){
        Log.d("Customer " + c.customerId + " " + c.companyName);
        for (Order o : c.orders){
            Log.d("  Order " + o.orderId + ": " + dateFmt(o.orderDate));
        }
    }
}
```
#### Output

    Customers from Washington and their orders:
    Customer LAZYK Lazy K Kountry Store
      Order 10482: 1997/03/21
      Order 10545: 1997/05/22
    Customer TRAIH Trail's Head Gourmet Provisioners
      Order 10574: 1997/06/19
      Order 10577: 1997/06/23
      Order 10822: 1998/01/08
      ...

### linq5: Where - Indexed
```csharp
//c#
public void Linq5() 
{ 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var shortDigits = digits.Where((digit, index) => digit.Length < index); 
  
    Console.WriteLine("Short digits:"); 
    foreach (var d in shortDigits) 
    { 
        Console.WriteLine("The word {0} is shorter than its value.", d); 
    } 
}
```
```java
//java
public void linq5(){
    String[] digits = new String[]{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    List<String> shortDigits = filteri(digits, new PredicateIndex<String>() {
        @Override
        public boolean apply(String s, int i) {
            return s.length() < i;
        }
    });

    Log.d("Short digits:");
    for (String d : shortDigits){
        Log.d("The word " + d + " is shorter than its value.");
    }
}
```
#### Output

    Short digits:
    The word five is shorter than its value.
    The word six is shorter than its value.
    The word seven is shorter than its value.
    The word eight is shorter than its value.
    The word nine is shorter than its value.

LINQ - Projection Operators
---------------------------

### linq6: Select - Simple 1
```csharp
//c#
public void Linq6() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var numsPlusOne = 
        from n in numbers 
        select n + 1; 
  
    Console.WriteLine("Numbers + 1:"); 
    foreach (var i in numsPlusOne) 
    { 
        Console.WriteLine(i); 
    } 
}
```
```java
//java
public void linq06(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Integer> numsPlusOne = map(toList(numbers), new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer i) {
            return i + 1;
        }
    });

    Log.d("Numbers + 1:");
    for (Integer n : numsPlusOne){
        Log.d(n);
    }
}
```
#### Output

    Numbers + 1:
    6
    5
    2
    4
    10
    9
    7
    8
    3
    1

### linq7: Select - Simple 2
```csharp
//c#
public void Linq7() 
{ 
    List<Product> products = GetProductList(); 
  
    var productNames = 
        from p in products 
        select p.ProductName; 
  
    Console.WriteLine("Product Names:"); 
    foreach (var productName in productNames) 
    { 
        Console.WriteLine(productName); 
    } 
}
```
```java
//java
public void linq07(){
    List<Product> products = getProductList();

    List<String> productNames = map(products, new Function<Product, String>() {
        @Override
        public String apply(Product p) {
            return p.productName;
        }
    });

    Log.d("Product Names:");
    for (String productName : productNames){
        Log.d(productName);
    }
}
```
#### Output

    Product Names:
    Chai
    Chang
    Aniseed Syrup
    Chef Anton's Cajun Seasoning
    Chef Anton's Gumbo Mix
    ...

### linq8: Select - Transformation
```csharp
//c#
public void Linq8() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    string[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var textNums = 
        from n in numbers 
        select strings[n]; 
  
    Console.WriteLine("Number strings:"); 
    foreach (var s in textNums) 
    { 
        Console.WriteLine(s); 
    } 
}
```
```java
//java
public void linq08(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };
    final String[] strings = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    List<String> textNums = map(toList(numbers), new Function<Integer, String>() {
        @Override
        public String apply(Integer n) {
            return strings[n];
        }
    });

    Log.d("Number strings:");
    for (String s : textNums){
        Log.d(s);
    }
}
```
#### Output

    Number strings:
    five
    four
    one
    three
    nine
    eight
    six
    seven
    two
    zero

### linq9: Select - Anonymous Types 1
```csharp
//c#
public void Linq9() 
{ 
    string[] words = { "aPPLE", "BlUeBeRrY", "cHeRry" }; 
  
    var upperLowerWords = 
        from w in words 
        select new { Upper = w.ToUpper(), Lower = w.ToLower() }; 
  
    foreach (var ul in upperLowerWords) 
    { 
        Console.WriteLine("Uppercase: {0}, Lowercase: {1}", ul.Upper, ul.Lower); 
    } 
}
```
```java
//java
public void linq09(){
    String[] words = new String[]{ "aPPLE", "BlUeBeRrY", "cHeRry" };

    List<Tuple<String,String>> upperLowerWords = map(words, new Function<String, Tuple<String,String>>(){
        @Override
        public Tuple<String,String> apply(String w) {
            return new Tuple<>(w.toUpperCase(), w.toLowerCase());
        }
    });

    for (Tuple<String,String> ul : upperLowerWords){
        Log.d("Uppercase: " + ul.A + ", Lowercase: " + ul.B);
    }
}
```
#### Output

    Uppercase: APPLE, Lowercase: apple
    Uppercase: BLUEBERRY, Lowercase: blueberry
    Uppercase: CHERRY, Lowercase: cherry

### linq10: Select - Anonymous Types 2
```csharp
//c#
public void Linq10() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    string[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var digitOddEvens = 
        from n in numbers 
        select new { Digit = strings[n], Even = (n % 2 == 0) }; 
  
    foreach (var d in digitOddEvens) 
    { 
        Console.WriteLine("The digit {0} is {1}.", d.Digit, d.Even ? "even" : "odd"); 
    } 
}
```
```java
//java
public void linq10(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };
    final String[] strings = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    List<Tuple<String, Boolean>> digitOddEvens = map(toList(numbers), new Function<Integer, Tuple<String, Boolean>>() {
        @Override
        public Tuple<String, Boolean> apply(Integer n) {
            return new Tuple<>(strings[n], n % 2 == 0);
        }
    });

    for (Tuple<String,Boolean> d : digitOddEvens){
        Log.d("The digit " + d.A + " is " + (d.B ? "even" : "odd") + ".");
    }
}
```
#### Output

    The digit five is odd.
    The digit four is even.
    The digit one is odd.
    The digit three is odd.
    The digit nine is odd.
    The digit eight is even.
    The digit six is even.
    The digit seven is odd.
    The digit two is even.
    The digit zero is even.

### linq11: Select - Anonymous Types 3
```csharp
//c#
public void Linq11() 
{ 
    List<Product> products = GetProductList(); 
  
    var productInfos = 
        from p in products 
        select new { p.ProductName, p.Category, Price = p.UnitPrice }; 
  
    Console.WriteLine("Product Info:"); 
    foreach (var productInfo in productInfos) 
    { 
        Console.WriteLine("{0} is in the category {1} and costs {2} per unit.", productInfo.ProductName, productInfo.Category, productInfo.Price); 
    } 
}
```
```java
//java
public void linq11(){
    List<Product> products = getProductList();

    List<Tuple3<String,String,Double>> productInfos = map(products, new Function<Product, Tuple3<String, String, Double>>() {
        @Override
        public Tuple3<String, String, Double> apply(Product p) {
            return new Tuple3<>(p.productName, p.category, p.unitPrice);
        }
    });

    Log.d("Product Info:");
    for (Tuple3<String,String,Double> productInfo : productInfos){
        Log.d(productInfo.A + " is in the category " + productInfo.B + " and costs " + productInfo.C + " per unit.");
    }
}
```
#### Output

    Product Info:
    Chai is in the category Beverages and costs 18.0 per unit.
    Chang is in the category Beverages and costs 19.0 per unit.
    Aniseed Syrup is in the category Condiments and costs 10.0 per unit.
    ...

### linq12: Select - Indexed
```csharp
//c#
public void Linq12() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var numsInPlace = numbers.Select((num, index) => new { Num = num, InPlace = (num == index) }); 
  
    Console.WriteLine("Number: In-place?"); 
    foreach (var n in numsInPlace) 
    { 
        Console.WriteLine("{0}: {1}", n.Num, n.InPlace); 
    } 
}
```
```java
//java
public void linq12(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Tuple<Integer,Boolean>> numsInPlace = mapi(toList(numbers), new FunctionIndex<Integer, Tuple<Integer, Boolean>>() {
        @Override
        public Tuple<Integer, Boolean> apply(Integer num, int index) {
            return new Tuple<>(num, num == index);
        }
    });

    Log.d("Number: In-place?");
    for (Tuple<Integer,Boolean> n : numsInPlace){
        Log.d(n.A + ": " + n.B);
    }
}
```
#### Output

    Number: In-place?
    5: false
    4: false
    1: false
    3: true
    9: false
    8: false
    6: true
    7: true
    2: false
    0: false

### linq13: Select - Filtered
```csharp
//c#
public void Linq13() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var lowNums = 
        from n in numbers 
        where n < 5 
        select digits[n]; 
  
    Console.WriteLine("Numbers < 5:"); 
    foreach (var num in lowNums) 
    { 
        Console.WriteLine(num); 
    } 
}
```
```java
//java
public void linq13(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };
    final String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    List<String> lowNums = map(
        filter(toList(numbers), new Predicate<Integer>() {
            @Override
            public boolean apply(Integer n) {
                return n < 5;
            }
        }),
        new Function<Integer, String>() {
            @Override
            public String apply(Integer n){
                return digits[n];
            }
        });

    Log.d("Numbers < 5:");
    for (String num : lowNums){
        Log.d(num);
    }
}
```
#### Output

    Numbers < 5:
    four
    one
    three
    two
    zero

### linq14: SelectMany - Compound from 1
```csharp
//c#
public void Linq14() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var pairs = 
        from a in numbersA 
        from b in numbersB 
        where a < b 
        select new { a, b }; 
  
    Console.WriteLine("Pairs where a < b:"); 
    foreach (var pair in pairs) 
    { 
        Console.WriteLine("{0} is less than {1}", pair.a, pair.b); 
    } 
}
```
```java
//java
public void linq14(){
    int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
    final int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

    List<Tuple<Integer,Integer>> pairs = expand(
        map(toList(numbersA), new Function<Integer,List<Tuple<Integer,Integer>>>() {
            @Override
            public List<Tuple<Integer,Integer>> apply(final Integer a) {
                return map(filter(toList(numbersB), new Predicate<Integer>() {
                    @Override
                    public boolean apply(Integer b) {
                        return a < b;
                    }
                }), new Function<Integer, Tuple<Integer,Integer>>() {
                    @Override
                    public Tuple<Integer, Integer> apply(Integer b) {
                        return new Tuple<>(a,b);
                    }
                });
            }
        })
    );

    Log.d("Pairs where a < b:");
    for (Tuple<Integer,Integer> pair : pairs){
        Log.d(pair.A + " is less than " + pair.B);
    }
}
```
#### Output

    Pairs where a < b:
    0 is less than 1
    0 is less than 3
    0 is less than 5
    0 is less than 7
    0 is less than 8
    2 is less than 3
    2 is less than 5
    2 is less than 7
    2 is less than 8
    4 is less than 5
    4 is less than 7
    4 is less than 8
    5 is less than 7
    5 is less than 8
    6 is less than 7
    6 is less than 8

### linq15: SelectMany - Compound from 2
```csharp
//c#
public void Linq15() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orders = 
        from c in customers 
        from o in c.Orders 
        where o.Total < 500.00M 
        select new { c.CustomerID, o.OrderID, o.Total }; 
  
    ObjectDumper.Write(orders); 
}
```
```java
//java
public void linq15(){
    List<Customer> customers = getCustomerList();

    List<Tuple3<String, Integer, Double>> orders = expand(
        map(customers, new Function<Customer, List<Tuple3<String, Integer, Double>>>() {
            @Override
            public List<Tuple3<String, Integer, Double>> apply(final Customer c) {
                return map(filter(c.orders, new Predicate<Order>() {
                    @Override
                    public boolean apply(Order o) {
                        return o.total < 500;
                    }
                }), new Function<Order, Tuple3<String, Integer, Double>>() {
                    @Override
                    public Tuple3<String, Integer, Double> apply(Order o) {
                        return new Tuple3<>(c.customerId, o.orderId, o.total);
                    }
                });
            }
        })
    );

    for (Tuple3<?,?,?> o : orders){
        Log.d(o);
    }
}
```
#### Output

    (ALFKI, 10702, 330.0)
    (ALFKI, 10952, 471.2)
    (ANATR, 10308, 88.8)
    (ANATR, 10625, 479.75)
    ...

### linq16: SelectMany - Compound from 3
```csharp
//c#
public void Linq16() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orders = 
        from c in customers 
        from o in c.Orders 
        where o.OrderDate >= new DateTime(1998, 1, 1) 
        select new { c.CustomerID, o.OrderID, o.OrderDate }; 
  
    ObjectDumper.Write(orders); 
}
```
```java
//java
public void linq16(){
    List<Customer> customers = getCustomerList();

    final Date date = new Date(98, 0, 1); //= 1998-01-01

    List<Tuple3<String, Integer, Date>> orders = expand(
        map(customers, new Function<Customer, List<Tuple3<String, Integer, Date>>>() {
            @Override
            public List<Tuple3<String, Integer, Date>> apply(final Customer c) {
                return map(filter(c.orders, new Predicate<Order>() {
                    @Override
                    public boolean apply(Order o) {
                        return o.orderDate.after(date);
                    }
                }), new Function<Order, Tuple3<String, Integer, Date>>() {
                    @Override
                    public Tuple3<String, Integer, Date> apply(Order o) {
                        return new Tuple3<>(c.customerId, o.orderId, o.orderDate);
                    }
                });
            }
        })
    );

    for (Tuple3<?,?,?> o : orders){
        Log.d(o);
    }
}
```
#### Output

    (ALFKI, 10835, Thu Jan 15 00:00:00 GMT+08:00 1998)
    (ALFKI, 10952, Mon Mar 16 00:00:00 GMT+08:00 1998)
    (ALFKI, 11011, Thu Apr 09 00:00:00 GMT+08:00 1998)
    (ANATR, 10926, Wed Mar 04 00:00:00 GMT+08:00 1998)
    (ANTON, 10856, Wed Jan 28 00:00:00 GMT+08:00 1998)
    ...

### linq17: SelectMany - from Assignment
```csharp
//c#
public void Linq17() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orders = 
        from c in customers 
        from o in c.Orders 
        where o.Total >= 2000.0M 
        select new { c.CustomerID, o.OrderID, o.Total }; 
  
    ObjectDumper.Write(orders); 
}
```
```java
//java
public void linq17(){
    List<Customer> customers = getCustomerList();

    List<Tuple3<String, Integer, Double>> orders = expand(
            map(customers, new Function<Customer, List<Tuple3<String, Integer, Double>>>() {
                @Override
                public List<Tuple3<String, Integer, Double>> apply(final Customer c) {
                    return map(filter(c.orders, new Predicate<Order>() {
                        @Override
                        public boolean apply(Order o) {
                            return o.total >= 2000;
                        }
                    }), new Function<Order, Tuple3<String, Integer, Double>>() {
                        @Override
                        public Tuple3<String, Integer, Double> apply(Order o) {
                            return new Tuple3<>(c.customerId, o.orderId, o.total);
                        }
                    });
                }
            })
    );

    for (Tuple3<?,?,?> o : orders){
        Log.d(o);
    }
}
```
#### Output

    (ANTON, 10573, 2082.0)
    (AROUT, 10558, 2142.9)
    (AROUT, 10953, 4441.25)
    (BERGS, 10384, 2222.4)
    (BERGS, 10524, 3192.65)
    ...

### linq18: SelectMany - Multiple from
```csharp
//c#
public void Linq18() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    DateTime cutoffDate = new DateTime(1997, 1, 1); 
  
    var orders = 
        from c in customers 
        where c.Region == "WA" 
        from o in c.Orders 
        where o.OrderDate >= cutoffDate 
        select new { c.CustomerID, o.OrderID }; 
  
    ObjectDumper.Write(orders); 
}
```
```java
//java
public void linq18(){
    List<Customer> customers = getCustomerList();

    final Date cutoffDate = new Date(97,0,1); //1997-01-01

    List<Tuple<String, Integer>> orders = expand(
        map(
            filter(customers, new Predicate<Customer>() {
                @Override
                public boolean apply(Customer c) {
                    return "WA".equals(c.region);
                }
            })
            , new Function<Customer, List<Tuple<String, Integer>>>() {
            @Override
            public List<Tuple<String, Integer>> apply(final Customer c) {
                return map(filter(c.orders, new Predicate<Order>() {
                    @Override
                    public boolean apply(Order o) {
                        return o.orderDate.after(cutoffDate);
                    }
                }), new Function<Order, Tuple<String, Integer>>() {
                    @Override
                    public Tuple<String, Integer> apply(Order o) {
                        return new Tuple<>(c.customerId, o.orderId);
                    }
                });
            }
        })
    );

    for (Tuple<?,?> o : orders){
        Log.d(o);
    }
}
```
#### Output

    (LAZYK, 10482)
    (LAZYK, 10545)
    (TRAIH, 10574)
    (TRAIH, 10577)
    (TRAIH, 10822)
    (WHITC, 10469)
    (WHITC, 10483)
    (WHITC, 10504)
    (WHITC, 10596)
    (WHITC, 10693)
    (WHITC, 10696)
    (WHITC, 10723)
    (WHITC, 10740)
    (WHITC, 10861)
    (WHITC, 10904)
    (WHITC, 11032)
    (WHITC, 11066)

### linq19: SelectMany - Indexed
```csharp
//c#
public void Linq19() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var customerOrders = 
        customers.SelectMany( 
            (cust, custIndex) => 
            cust.Orders.Select(o => "Customer #" + (custIndex + 1) + 
                                    " has an order with OrderID " + o.OrderID)); 
  
    ObjectDumper.Write(customerOrders); 
}
```
```java
//java
public void linq19(){
    List<Customer> customers = getCustomerList();

    List<String> customerOrders = expand(
      mapi(customers, new FunctionIndex<Customer, List<String>>() {
          @Override
          public List<String> apply(Customer cust, final int custIndex) {
              return map(cust.orders, new Function<Order, String>() {
                  @Override
                  public String apply(Order o) {
                      return "Customer #" + (custIndex + 1) + " has an order with OrderID " + o.orderId;
                  }
              });
          }
      })
    );

    for (String x : customerOrders){
        Log.d(x);
    }
}
```
#### Output

    Customer #1 has an order with OrderID 10643
    Customer #1 has an order with OrderID 10692
    Customer #1 has an order with OrderID 10702
    Customer #1 has an order with OrderID 10835
    Customer #1 has an order with OrderID 10952
    Customer #1 has an order with OrderID 11011
    Customer #2 has an order with OrderID 10308
    Customer #2 has an order with OrderID 10625
    Customer #2 has an order with OrderID 10759
    Customer #2 has an order with OrderID 10926
    ...

LINQ - Partitioning Operators
-----------------------------

### linq20: Take - Simple
```csharp
//c#
public void Linq20() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 

    var first3Numbers = numbers.Take(3); 
  
    Console.WriteLine("First 3 numbers:"); 
  
    foreach (var n in first3Numbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq20() {
    int[] numbers = new int[]{5, 4, 1, 3, 9, 8, 6, 7, 2, 0};

    List<Integer> first3Numbers = take(toList(numbers), 3);

    Log.d("First 3 numbers:");
    for (Integer n : first3Numbers) {
        Log.d(n);
    }
}
```
#### Output

    First 3 numbers:
    5
    4
    1

### linq21: Take - Nested
```csharp
//c#
public void Linq21()   
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var first3WAOrders = ( 
        from c in customers 
        from o in c.Orders 
        where c.Region == "WA" 
        select new { c.CustomerID, o.OrderID, o.OrderDate }) 
        .Take(3); 
  
    Console.WriteLine("First 3 orders in WA:"); 
    foreach (var order in first3WAOrders) 
    { 
        ObjectDumper.Write(order); 
    } 
}
```
```java
//java
public void linq21() {
    List<Customer> customers = getCustomerList();

    List<Tuple3<String, Integer, Date>> first3WAOrders =
        take(
            expand(
                map(filter(customers, new Predicate<Customer>() {
                    @Override
                    public boolean apply(Customer c) {
                        return "WA".equals(c.region);
                    }
                }),
                new Function<Customer, List<Tuple3<String, Integer, Date>>>() {
                    @Override
                    public List<Tuple3<String, Integer, Date>> apply(final Customer c) {
                        return map(c.orders, new Function<Order, Tuple3<String, Integer, Date>>() {
                            @Override
                            public Tuple3<String, Integer, Date> apply(Order o) {
                                return new Tuple3<>(c.customerId, o.orderId, o.orderDate);
                            }
                        });
                    }
                })
            ),
        3);

    Log.d("First 3 orders in WA:");
    for (Tuple3<?, ?, ?> o : first3WAOrders) {
        Log.d(o);
    }
}
```
#### Output

    First 3 orders in WA:
    (LAZYK, 10482, Fri Mar 21 00:00:00 GMT+08:00 1997)
    (LAZYK, 10545, Thu May 22 00:00:00 GMT+08:00 1997)
    (TRAIH, 10574, Thu Jun 19 00:00:00 GMT+08:00 1997)


### linq22: Skip - Simple
```csharp
//c#
public void Linq22() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var allButFirst4Numbers = numbers.Skip(4); 
  
    Console.WriteLine("All but first 4 numbers:"); 
    foreach (var n in allButFirst4Numbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq22() {
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Integer> allButFirst4Numbers = skip(toList(numbers), 4);

    Log.d("All but first 4 numbers:");
    for (Integer n : allButFirst4Numbers){
        Log.d(n);
    }
}
```
#### Output

    All but first 4 numbers:
    9
    8
    6
    7
    2
    0

### linq23: Skip - Nested
```csharp
//c#
public void Linq23()   
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var waOrders = 
        from c in customers 
        from o in c.Orders 
        where c.Region == "WA" 
        select new { c.CustomerID, o.OrderID, o.OrderDate }; 
  
    var allButFirst2Orders = waOrders.Skip(2); 
  
    Console.WriteLine("All but first 2 orders in WA:"); 
    foreach (var order in allButFirst2Orders) 
    { 
        ObjectDumper.Write(order); 
    } 
}
```
```java
//java
public void linq23() {
    List<Customer> customers = getCustomerList();

    List<Tuple3<String, Integer, Date>> allButFirst2Orders =
        skip(
            expand(
                map(filter(customers, new Predicate<Customer>() {
                        @Override
                        public boolean apply(Customer c) {
                            return "WA".equals(c.region);
                        }
                    }),
                    new Function<Customer, List<Tuple3<String, Integer, Date>>>() {
                        @Override
                        public List<Tuple3<String, Integer, Date>> apply(final Customer c) {
                            return map(c.orders, new Function<Order, Tuple3<String, Integer, Date>>() {
                                @Override
                                public Tuple3<String, Integer, Date> apply(Order o) {
                                    return new Tuple3<>(c.customerId, o.orderId, o.orderDate);
                                }
                            });
                        }
                    })
                ),
            2);

    Log.d("All but first 2 orders in WA:");
    for (Tuple3<?, ?, ?> o : allButFirst2Orders) {
        Log.d(o);
    }
}
```
#### Output

    All but first 2 orders in WA:
    (TRAIH, 10574, Thu Jun 19 00:00:00 GMT+08:00 1997)
    (TRAIH, 10577, Mon Jun 23 00:00:00 GMT+08:00 1997)
    (TRAIH, 10822, Thu Jan 08 00:00:00 GMT+08:00 1998)
    (WHITC, 10269, Wed Jul 31 00:00:00 GMT+08:00 1996)
    (WHITC, 10344, Fri Nov 01 00:00:00 GMT+08:00 1996)
    (WHITC, 10469, Mon Mar 10 00:00:00 GMT+08:00 1997)
    (WHITC, 10483, Mon Mar 24 00:00:00 GMT+08:00 1997)
    (WHITC, 10504, Fri Apr 11 00:00:00 GMT+08:00 1997)
    (WHITC, 10596, Fri Jul 11 00:00:00 GMT+08:00 1997)
    (WHITC, 10693, Mon Oct 06 00:00:00 GMT+08:00 1997)
    (WHITC, 10696, Wed Oct 08 00:00:00 GMT+08:00 1997)
    (WHITC, 10723, Thu Oct 30 00:00:00 GMT+08:00 1997)
    (WHITC, 10740, Thu Nov 13 00:00:00 GMT+08:00 1997)
    (WHITC, 10861, Fri Jan 30 00:00:00 GMT+08:00 1998)
    (WHITC, 10904, Tue Feb 24 00:00:00 GMT+08:00 1998)
    (WHITC, 11032, Fri Apr 17 00:00:00 GMT+08:00 1998)
    (WHITC, 11066, Fri May 01 00:00:00 GMT+08:00 1998)

### linq24: TakeWhile - Simple
```csharp
//c#
public void Linq24() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var firstNumbersLessThan6 = numbers.TakeWhile(n => n < 6); 
  
    Console.WriteLine("First numbers less than 6:"); 
    foreach (var n in firstNumbersLessThan6) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq24() {
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Integer> firstNumbersLessThan6 = takeWhile(toList(numbers), new Predicate<Integer>() {
        @Override
        public boolean apply(Integer n) {
            return n < 6;
        }
    });

    Log.d("First numbers less than 6:");
    for (Integer n : firstNumbersLessThan6){
        Log.d(n);
    }
}
```
#### Output

    First numbers less than 6:
    5
    4
    1
    3

### linq25: TakeWhile - Indexed
```csharp
//c#
public void Linq25() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var firstSmallNumbers = numbers.TakeWhile((n, index) => n >= index); 
  
    Console.WriteLine("First numbers not less than their position:"); 
    foreach (var n in firstSmallNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq25() {
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Integer> firstSmallNumbers = takeWhilei(toList(numbers), new PredicateIndex<Integer>() {
        @Override
        public boolean apply(Integer n, int index) {
            return n >= index;
        }
    });

    Log.d("First numbers not less than their position:");
    for (Integer n : firstSmallNumbers){
        Log.d(n);
    }
}
```
#### Output

    First numbers not less than their position:
    5
    4

### linq26: SkipWhile - Simple
```csharp
//c#
public void Linq26() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var allButFirst3Numbers = numbers.SkipWhile(n => n % 3 != 0); 
  
    Console.WriteLine("All elements starting from first element divisible by 3:"); 
    foreach (var n in allButFirst3Numbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq26() {
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Integer> allButFirst3Numbers = skipWhile(toList(numbers), new Predicate<Integer>() {
        @Override
        public boolean apply(Integer n) {
            return n % 3 != 0;
        }
    });

    Log.d("All elements starting from first element divisible by 3:");
    for (Integer n : allButFirst3Numbers){
        Log.d(n);
    }
}
```
#### Output

    All elements starting from first element divisible by 3:
    3
    9
    8
    6
    7
    2
    0

### linq27: SkipWhile - Indexed
```csharp
//c#
public void Linq27() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var laterNumbers = numbers.SkipWhile((n, index) => n >= index); 
  
    Console.WriteLine("All elements starting from first element less than its position:"); 
    foreach (var n in laterNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq27() {
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Integer> laterNumbers = skipWhilei(toList(numbers), new PredicateIndex<Integer>() {
        @Override
        public boolean apply(Integer n, int index) {
            return n >= index;
        }
    });

    Log.d("All elements starting from first element less than its position:");
    for (Integer n : laterNumbers){
        Log.d(n);
    }
}
```
#### Output

    All elements starting from first element less than its position:
    1
    3
    9
    8
    6
    7
    2
    0


LINQ - Ordering Operators
-------------------------

### linq28: OrderBy - Simple 1
```csharp
//c#
public void Linq28() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    var sortedWords = 
        from w in words 
        orderby w 
        select w; 
  
    Console.WriteLine("The sorted list of words:"); 
    foreach (var w in sortedWords) 
    { 
        Console.WriteLine(w); 
    } 
}
```
```java
//java
public void linq28(){
    String[] words = new String[] { "cherry", "apple", "blueberry" };

    List<String> sortedWords = orderBy(words);

    Log.d("The sorted list of words:");
    for (String w : sortedWords){
        Log.d(w);
    }
}
```
#### Output

    The sorted list of words:
    apple
    blueberry
    cherry

### linq29: OrderBy - Simple 2
```csharp
//c#
public void Linq29() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    var sortedWords = 
        from w in words 
        orderby w.Length 
        select w; 
  
    Console.WriteLine("The sorted list of words (by length):"); 
    foreach (var w in sortedWords) 
    { 
        Console.WriteLine(w); 
    } 
}
```
```java
//java
public void linq29(){
    String[] words = new String[] { "cherry", "apple", "blueberry" };

    List<String> sortedWords = orderBy(words, new Function<String, Comparable>() {
        @Override
        public Comparable apply(String s) {
            return s.length();
        }
    });

    Log.d("The sorted list of words (by length):");
    for (String w : sortedWords){
        Log.d(w);
    }
}
```
#### Output

    The sorted list of words (by length):
    apple
    cherry
    blueberry

### linq30: OrderBy - Simple 3
```csharp
//c#
public void Linq30() 
{ 
    List<Product> products = GetProductList(); 
  
    var sortedProducts = 
        from p in products 
        orderby p.ProductName 
        select p; 
  
    ObjectDumper.Write(sortedProducts); 
}
```
```java
//java
public void linq30(){
    List<Product> products = getProductList();

    List<Product> sortedProducts = orderBy(products, new Function<Product, Comparable>() {
        @Override
        public Comparable apply(Product p) {
            return p.productName;
        }
    });

    for (Product p : sortedProducts){
        Log.d(p);
    }
}
```
#### Output

    (Product id=17, name=Alice Mutton, cat=Meat/Poultry, price=39.0, inStock=0)
    (Product id=3, name=Aniseed Syrup, cat=Condiments, price=10.0, inStock=13)
    (Product id=40, name=Boston Crab Meat, cat=Seafood, price=18.4, inStock=123)
    (Product id=60, name=Camembert Pierrot, cat=Dairy Products, price=34.0, inStock=19)
    (Product id=18, name=Carnarvon Tigers, cat=Seafood, price=62.5, inStock=42)
    ...

### linq31: OrderBy - Comparer
```csharp
//c#
public void Linq31() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = words.OrderBy(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```java
//java
public void linq31(){
    String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

    List<String> sortedWords = orderBy(words, String.CASE_INSENSITIVE_ORDER);

    for (String w : sortedWords){
        Log.d(w);
    }
}
```
#### Output

    AbAcUs
    aPPLE
    BlUeBeRrY
    bRaNcH
    cHeRry
    ClOvEr

### linq32: OrderByDescending - Simple 1
```csharp
//c#
public void Linq32() 
{ 
    double[] doubles = { 1.7, 2.3, 1.9, 4.1, 2.9 }; 
  
    var sortedDoubles = 
        from d in doubles 
        orderby d descending 
        select d; 
  
    Console.WriteLine("The doubles from highest to lowest:"); 
    foreach (var d in sortedDoubles) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```java
//java
public void linq32(){
    double[] doubles = new double[] { 1.7, 2.3, 1.9, 4.1, 2.9 };

    List<Double> sortedDoubles = orderByDesc(toList(doubles));

    Log.d("The doubles from highest to lowest:");
    for (Double d : sortedDoubles){
        Log.d(d);
    }
}
```
#### Output

    The doubles from highest to lowest:
    4.1
    2.9
    2.3
    1.9
    1.7

### linq33: OrderByDescending - Simple 2
```csharp
//c#
public void Linq33() 
{ 
    List<Product> products = GetProductList(); 
  
    var sortedProducts = 
        from p in products 
        orderby p.UnitsInStock descending 
        select p; 
  
    ObjectDumper.Write(sortedProducts); 
}
```
```java
//java
public void linq33(){
    List<Product> products = getProductList();

    List<Product> sortedProducts = orderByDesc(products, new Function<Product, Integer>(){
        @Override
        public Integer apply(Product p) {
            return p.unitsInStock;
        }
    });

    for (Product p : sortedProducts){
        Log.d(p);
    }
}
```
#### Output

    (Product id=75, name=Rhönbräu Klosterbier, cat=Beverages, price=7.75, inStock=125)
    (Product id=40, name=Boston Crab Meat, cat=Seafood, price=18.4, inStock=123)
    (Product id=6, name=Grandma's Boysenberry Spread, cat=Condiments, price=25.0, inStock=120)
    (Product id=55, name=Pâté chinois, cat=Meat/Poultry, price=24.0, inStock=115)
    (Product id=61, name=Sirop d'érable, cat=Condiments, price=28.5, inStock=113)
    ...

### linq34: OrderByDescending - Comparer
```csharp
//c#
public void Linq34() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = words.OrderByDescending(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```java
//java
public void linq34(){
    String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

    List<String> sortedWords = orderByDesc(words, String.CASE_INSENSITIVE_ORDER);

    for (String w : sortedWords){
        Log.d(w);
    }
}
```
#### Output

    ClOvEr
    cHeRry
    bRaNcH
    BlUeBeRrY
    aPPLE
    AbAcUs

### linq35: ThenBy - Simple
```csharp
//c#
public void Linq35() 
{ 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var sortedDigits = 
        from d in digits 
        orderby d.Length, d 
        select d; 
  
    Console.WriteLine("Sorted digits:"); 
    foreach (var d in sortedDigits) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```java
//java
public void linq35(){
    String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    List<String> sortedDigits = orderBy(orderBy(digits), new Function<String, Comparable>() {
        @Override
        public Comparable apply(String s) {
            return s.length();
        }
    });

    Log.d("Sorted digits:");
    for (String d : sortedDigits){
        Log.d(d);
    }
}
```
#### Output

    Sorted digits:
    one
    six
    two
    five
    four
    nine
    zero
    eight
    seven
    three

### linq36: ThenBy - Comparer
```csharp
//c#
public void Linq36() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = 
        words.OrderBy(a => a.Length) 
             .ThenBy(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```java
//java
public void linq36(){
    String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

    List<String> sortedWords = orderBy(orderBy(words, String.CASE_INSENSITIVE_ORDER), new Function<String, Comparable>() {
        @Override
        public Comparable apply(String s) {
            return s.length();
        }
    });

    for (String w : sortedWords){
        Log.d(w);
    }
}
```
#### Output

    aPPLE
    AbAcUs
    bRaNcH
    cHeRry
    ClOvEr
    BlUeBeRrY

### linq37: ThenByDescending - Simple
```csharp
//c#
public void Linq37() 
{ 
    List<Product> products = GetProductList(); 
  
    var sortedProducts = 
        from p in products 
        orderby p.Category, p.UnitPrice descending 
        select p; 
  
    ObjectDumper.Write(sortedProducts); 
}
```
```java
//java
public void linq37(){
    List<Product> products = getProductList();

    List<Product> sortedProducts = orderByAll(products,
        new Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                return a.category.compareTo(b.category);
            }
        },
        new Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                return b.unitPrice.compareTo(a.unitPrice);
            }
        }
    );

    for (Product p : sortedProducts){
        Log.d(p);
    }
}
```
#### Output

    (Product id=38, name=Côte de Blaye, cat=Beverages, price=263.5, inStock=17)
    (Product id=43, name=Ipoh Coffee, cat=Beverages, price=46.0, inStock=17)
    (Product id=2, name=Chang, cat=Beverages, price=19.0, inStock=17)
    (Product id=1, name=Chai, cat=Beverages, price=18.0, inStock=39)
    (Product id=35, name=Steeleye Stout, cat=Beverages, price=18.0, inStock=20)
    (Product id=39, name=Chartreuse verte, cat=Beverages, price=18.0, inStock=69)
    (Product id=76, name=Lakkalikööri, cat=Beverages, price=18.0, inStock=57)
    (Product id=70, name=Outback Lager, cat=Beverages, price=15.0, inStock=15)
    (Product id=34, name=Sasquatch Ale, cat=Beverages, price=14.0, inStock=111)
    ...

### linq38: ThenByDescending - Comparer
```csharp
//c#
public void Linq38() 
{ 
    string[] words = { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" }; 
  
    var sortedWords = 
        words.OrderBy(a => a.Length) 
             .ThenByDescending(a => a, new CaseInsensitiveComparer()); 
  
    ObjectDumper.Write(sortedWords); 
} 
```
```java
//java
public void linq38(){
    String[] words = new String[] { "aPPLE", "AbAcUs", "bRaNcH", "BlUeBeRrY", "ClOvEr", "cHeRry" };

    List<String> sortedWords = orderByAll(words,
        new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        },
        new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return String.CASE_INSENSITIVE_ORDER.compare(b,a);
            }
        });

    for (String w : sortedWords){
        Log.d(w);
    }
}
```
#### Output

    aPPLE
    ClOvEr
    cHeRry
    bRaNcH
    AbAcUs
    BlUeBeRrY

### linq39: Reverse
```csharp
//c#
public void Linq39() 
{ 
    string[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    var reversedIDigits = ( 
        from d in digits 
        where d[1] == 'i' 
        select d) 
        .Reverse(); 
  
    Console.WriteLine("A backwards list of the digits with a second character of 'i':"); 
    foreach (var d in reversedIDigits) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```java
//java
public void linq39(){
    String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    List<String> reversedIDigits = reverse(filter(digits, new Predicate<String>() {
        @Override
        public boolean apply(String d) {
            return d.charAt(1) == 'i';
        }
    }));

    Log.d("A backwards list of the digits with a second character of 'i':");
    for (String d : reversedIDigits){
        Log.d(d);
    }
}
```
#### Output

    A backwards list of the digits with a second character of 'i':
    nine
    eight
    six
    five


LINQ - Grouping Operators
-------------------------

### linq40: GroupBy - Simple 1
```csharp
//c#
public void Linq40() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    var numberGroups = 
        from n in numbers 
        group n by n % 5 into g 
        select new { Remainder = g.Key, Numbers = g }; 
  
    foreach (var g in numberGroups) 
    { 
        Console.WriteLine("Numbers with a remainder of {0} when divided by 5:", g.Remainder); 
        foreach (var n in g.Numbers) 
        { 
            Console.WriteLine(n); 
        } 
    } 
}
```
```java
//java
public void linq40(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    List<Tuple<Integer, Group<Integer,Integer>>> numberGroups = map(
        groupBy(toList(numbers), new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n){
                return n % 5;
            }
        }),
        new Function<Group<Integer, Integer>, Tuple<Integer, Group<Integer,Integer>>>() {
            @Override
            public Tuple<Integer, Group<Integer,Integer>> apply(Group<Integer, Integer> g){
                return new Tuple<>(g.key, g);
            }
        });

    for (Tuple<Integer, Group<Integer,Integer>> g : numberGroups){
        Log.d("Numbers with a remainder of " + g.A + " when divided by 5:");
        for (Integer n : g.B){
            Log.d(n);
        }
    }
}
```
#### Output

    Numbers with a remainder of 4 when divided by 5:
    4
    9
    Numbers with a remainder of 1 when divided by 5:
    1
    6
    Numbers with a remainder of 0 when divided by 5:
    5
    0
    Numbers with a remainder of 2 when divided by 5:
    7
    2
    Numbers with a remainder of 3 when divided by 5:
    3
    8

### linq41: GroupBy - Simple 2
```csharp
//c#
public void Linq41() 
{ 
    string[] words = { "blueberry", "chimpanzee", "abacus", "banana", "apple", "cheese" }; 
  
    var wordGroups = 
        from w in words 
        group w by w[0] into g 
        select new { FirstLetter = g.Key, Words = g }; 
  
    foreach (var g in wordGroups) 
    { 
        Console.WriteLine("Words that start with the letter '{0}':", g.FirstLetter); 
        foreach (var w in g.Words) 
        { 
            Console.WriteLine(w); 
        } 
    } 
}
```
```java
//java
public void linq41(){
    String[] words = new String[] { "blueberry", "chimpanzee", "abacus", "banana", "apple", "cheese" };

    List<Tuple<Character, Group<Character,String>>> wordGroups = map(
        groupBy(toList(words), new Function<String, Character>() {
            @Override
            public Character apply(String s){
                return s.charAt(0);
            }
        }),
        new Function<Group<Character, String>, Tuple<Character, Group<Character,String>>>() {
            @Override
            public Tuple<Character, Group<Character,String>> apply(Group<Character,String> g){
                return new Tuple<>(g.key, g);
            }
        });

    for (Tuple<Character, Group<Character,String>> g : wordGroups){
        Log.d("Words that start with the letter '" + g.A + "':");
        for (String w : g.B){
            Log.d(w);
        }
    }
}
```
#### Output

    Words that start with the letter 'a':
    abacus
    apple
    Words that start with the letter 'b':
    blueberry
    banana
    Words that start with the letter 'c':
    chimpanzee
    cheese

### linq42: GroupBy - Simple 3
```csharp
//c#
public void Linq42() 
{ 
    List<Product> products = GetProductList(); 
  
    var orderGroups = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, Products = g }; 
  
    ObjectDumper.Write(orderGroups, 1); 
} 
```
```java
//java
public void linq42(){
    List<Product> products = getProductList();

    List<Tuple<String,Group<String,Product>>> orderGroups = map(
        groupBy(products, new Function<Product, String>() {
            @Override
            public String apply(Product p){
                return p.category;
            }
        }),
        new Function<Group<String,Product>, Tuple<String, Group<String,Product>>>() {
            @Override
            public Tuple<String, Group<String,Product>> apply(Group<String,Product> g){
                return new Tuple<>(g.key, g);
            }
        });

    for (Tuple<String,Group<String,Product>> x : orderGroups){
        Log.d(x.B);
    }
}
```
#### Output

    Confections:
    (Product id=16, name=Pavlova, cat=Confections, price=17.45, inStock=29)
    (Product id=19, name=Teatime Chocolate Biscuits, cat=Confections, price=9.2, inStock=25)
    (Product id=20, name=Sir Rodney's Marmalade, cat=Confections, price=81.0, inStock=40)
    (Product id=21, name=Sir Rodney's Scones, cat=Confections, price=10.0, inStock=3)
    (Product id=25, name=NuNuCa Nuß-Nougat-Creme, cat=Confections, price=14.0, inStock=76)
    (Product id=26, name=Gumbär Gummibärchen, cat=Confections, price=31.23, inStock=15)
    (Product id=27, name=Schoggi Schokolade, cat=Confections, price=43.9, inStock=49)
    (Product id=47, name=Zaanse koeken, cat=Confections, price=9.5, inStock=36)
    (Product id=48, name=Chocolade, cat=Confections, price=12.75, inStock=15)
    (Product id=49, name=Maxilaku, cat=Confections, price=20.0, inStock=10)
    (Product id=50, name=Valkoinen suklaa, cat=Confections, price=16.25, inStock=65)
    (Product id=62, name=Tarte au sucre, cat=Confections, price=49.3, inStock=17)
    (Product id=68, name=Scottish Longbreads, cat=Confections, price=12.5, inStock=6)
    
    Seafood:
    (Product id=10, name=Ikura, cat=Seafood, price=31.0, inStock=31)
    (Product id=13, name=Konbu, cat=Seafood, price=6.0, inStock=24)

### linq43: GroupBy - Nested
```csharp
//c#
public void Linq43() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var customerOrderGroups = 
        from c in customers 
        select 
            new 
            { 
                c.CompanyName, 
                YearGroups = 
                    from o in c.Orders 
                    group o by o.OrderDate.Year into yg 
                    select 
                        new 
                        { 
                            Year = yg.Key, 
                            MonthGroups = 
                                from o in yg 
                                group o by o.OrderDate.Month into mg 
                                select new { Month = mg.Key, Orders = mg } 
                        } 
            }; 
  
    ObjectDumper.Write(customerOrderGroups, 3); 
} 
```
```java
//java
public void linq43(){
    List<Customer> customers = getCustomerList();

    List<Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>>> customerOrderGroups =
        map(customers, new Function<Customer, Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>>>() {
            @Override
            public Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>> apply(Customer c) {
                return new Tuple<>( //Yay Type Inference!
                    c.companyName,
                    map(groupBy(c.orders, new Function<Order, Integer>() {
                            @Override
                            public Integer apply(Order o) {
                                return o.orderDate.getYear() + 1900;
                            }
                        }),
                        new Function<Group<Integer, Order>, Tuple<Integer, ArrayList<Group<Integer, Order>>>>() {
                            @Override
                            public Tuple<Integer, ArrayList<Group<Integer, Order>>> apply(Group<Integer, Order> yg) {
                                return new Tuple<>( //Yay Type Inference!
                                    yg.key,
                                    groupBy(yg.items, new Function<Order, Integer>() {
                                        @Override
                                        public Integer apply(Order o) {
                                            return o.orderDate.getMonth() + 1;
                                        }
                                    })
                                );
                            }
                        }
                    )
                );
            }
        });

    for (Tuple<String, ArrayList<Tuple<Integer, ArrayList<Group<Integer, Order>>>>> g : customerOrderGroups){
        Log.d("\n# " + g.A);
        for (Tuple<Integer, ArrayList<Group<Integer, Order>>> yg : g.B){
            Log.d(yg.A + ": ");
            for (Group<Integer, Order> mg : yg.B){
                Log.d("  " + mg.key + ": ");
                for (Order o : mg){
                    Log.d("    " + o);
                }
            }
        }
    }
}
```
#### Output

    # Alfreds Futterkiste
    1997: 
      8: 
        (Order id=10643, total=814.5)
      10: 
        (Order id=10692, total=878.0)
        (Order id=10702, total=330.0)
    1998: 
      4: 
        (Order id=11011, total=933.5)
      1: 
        (Order id=10835, total=845.8)
      3: 
        (Order id=10952, total=471.2)

### linq44: GroupBy - Comparer
```csharp
//c#
public void Linq44() 
{ 
    string[] anagrams = { "from   ", " salt", " earn ", "  last   ", " near ", " form  " }; 
  
    var orderGroups = anagrams.GroupBy(w => w.Trim(), new AnagramEqualityComparer()); 
  
    ObjectDumper.Write(orderGroups, 1); 
} 
```
```java
//java
public void linq44(){
    String[] anagrams = new String[] { "from   ", " salt", " earn ", "  last   ", " near ", " form  " };

    List<Group<String, String>> orderGroups = groupBy(toList(anagrams),
            new Function<String, String>() {
                @Override
                public String apply(String w) {
                    return w.trim();
                }
            },
            new Predicate2<String, String>() {
                @Override
                public boolean apply(String a, String b) {
                    char[] aChars = a.toCharArray();
                    char[] bChars = b.toCharArray();
                    Arrays.sort(aChars);
                    Arrays.sort(bChars);
                    return Arrays.equals(aChars, bChars);
                }
            });

    for (Group<String, String> g : orderGroups){
        StringBuilder sb = new StringBuilder();
        for (String w : g){
            if (sb.length() > 0)
                sb.append(", ");

            sb.append("'").append(w).append("'");
        }
        Log.d("[ " + sb + " ]");
    }
}
```
#### Output

    [ ' earn ', ' near ' ]
    [ ' salt', '  last   ' ]
    [ 'from   ', ' form  ' ]

### linq45: GroupBy - Comparer, Mapped    
```csharp
//c#
public void Linq45() 
{ 
    string[] anagrams = { "from   ", " salt", " earn ", "  last   ", " near ", " form  " }; 
  
    var orderGroups = anagrams.GroupBy( 
                w => w.Trim(), 
                a => a.ToUpper(), 
                new AnagramEqualityComparer() 
                ); 
  
    ObjectDumper.Write(orderGroups, 1); 
} 
```
```java
//java
public void linq45(){
    String[] anagrams = new String[] { "from   ", " salt", " earn ", "  last   ", " near ", " form  " };

    List<Group<String, String>> orderGroups = groupBy(toList(anagrams),
            new Function<String, String>() {
                @Override
                public String apply(String w) {
                    return w.trim();
                }
            },
            new Predicate2<String, String>() {
                @Override
                public boolean apply(String a, String b) {
                    char[] aChars = a.toCharArray();
                    char[] bChars = b.toCharArray();
                    Arrays.sort(aChars);
                    Arrays.sort(bChars);
                    return Arrays.equals(aChars, bChars);
                }
            },
            new Function<String, String>() {
                @Override
                public String apply(String s) {
                    return s.toUpperCase();
                }
            });

    for (Group<String, String> g : orderGroups){
        StringBuilder sb = new StringBuilder();
        for (String w : g){
            if (sb.length() > 0)
                sb.append(", ");

            sb.append("'").append(w).append("'");
        }
        Log.d("[ " + sb + " ]");
    }
}
```
#### Output

    [ ' EARN ', ' NEAR ' ]
    [ ' SALT', '  LAST   ' ]
    [ 'FROM   ', ' FORM  ' ]


LINQ - Set Operators
--------------------

### linq46: Distinct - 1
```csharp
//c#
public void Linq46() 
{ 
    int[] factorsOf300 = { 2, 2, 3, 5, 5 }; 
  
    var uniqueFactors = factorsOf300.Distinct(); 
  
    Console.WriteLine("Prime factors of 300:"); 
    foreach (var f in uniqueFactors) 
    { 
        Console.WriteLine(f); 
    } 
}
```
```java
//java
public void linq46(){
    int[] factorsOf300 = new int[] { 2, 2, 3, 5, 5 };

    List<Integer> uniqueFactors = distinct(toList(factorsOf300));

    Log.d("Prime factors of 300:");
    for (Integer f : uniqueFactors){
        Log.d(f);
    }
}
```
#### Output

    Prime factors of 300:
    5
    3
    2

### linq47: Distinct - 2
```csharp
//c#
public void Linq47() 
{ 
    List<Product> products = GetProductList(); 
  
    var categoryNames = ( 
        from p in products 
        select p.Category) 
        .Distinct(); 
  
    Console.WriteLine("Category names:"); 
    foreach (var n in categoryNames) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq47(){
    List<Product> products = getProductList();

    List<String> categoryNames = distinct(
        map(products, new Function<Product, String>() {
            @Override
            public String apply(Product p) {
                return p.category;
            }
        }));

    Log.d("Category names:");
    for (String n : categoryNames){
        Log.d(n);
    }
}
```
#### Output

    Category names:
    Confections
    Seafood
    Grains/Cereals
    Meat/Poultry
    Beverages
    Condiments
    Dairy Products
    Produce

### linq48: Union - 1
```csharp
//c#
public void Linq48() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var uniqueNumbers = numbersA.Union(numbersB); 
  
    Console.WriteLine("Unique numbers from both arrays:"); 
    foreach (var n in uniqueNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq48(){
    int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
    int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

    List<Integer> uniqueNumbers = union(toList(numbersA), toList(numbersB));

    Log.d("Unique numbers from both arrays:");
    for (Integer n : uniqueNumbers){
        Log.d(n);
    }
}
```
#### Output

    Unique numbers from both arrays:
    0
    2
    4
    5
    6
    8
    9
    1
    3
    7

### linq49: Union - 2
```csharp
//c#
public void Linq49() 
{ 
    List<Product> products = GetProductList(); 
    List<Customer> customers = GetCustomerList(); 
  
    var productFirstChars = 
        from p in products 
        select p.ProductName[0]; 
    var customerFirstChars = 
        from c in customers 
        select c.CompanyName[0]; 
  
    var uniqueFirstChars = productFirstChars.Union(customerFirstChars); 
  
    Console.WriteLine("Unique first letters from Product names and Customer names:"); 
    foreach (var ch in uniqueFirstChars) 
    { 
        Console.WriteLine(ch); 
    } 
}
```
```java
//java
public void linq49(){
    List<Product> products = getProductList();
    List<Customer> customers = getCustomerList();

    List<Character> productFirstChars = map(products, new Function<Product, Character>() {
        @Override
        public Character apply(Product p) {
            return p.productName.charAt(0);
        }
    });

    List<Character> customerFirstChars = map(customers, new Function<Customer, Character>() {
        @Override
        public Character apply(Customer c) {
            return c.companyName.charAt(0);
        }
    });

    List<Character> uniqueFirstChars = union(productFirstChars, customerFirstChars);

    Log.d("Unique first letters from Product names and Customer names:");
    for (Character ch : uniqueFirstChars){
        Log.d(ch);
    }
}
```
#### Output

    Unique first letters from Product names and Customer names:
    C
    A
    G
    U
    N
    M
    I
    Q
    K
    T
    P
    S
    R
    B
    J
    Z
    V
    F
    E
    W
    L
    O
    D
    H

### linq50: Intersect - 1
```csharp
//c#
public void Linq50() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var commonNumbers = numbersA.Intersect(numbersB); 
  
    Console.WriteLine("Common numbers shared by both arrays:"); 
    foreach (var n in commonNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq50(){
    int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
    int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

    List<Integer> commonNumbers = intersect(toList(numbersA), toList(numbersB));

    Log.d("Common numbers shared by both arrays:");
    for (Integer n : commonNumbers){
        Log.d(n);
    }
}
```
#### Output

    Common numbers shared by both arrays:
    5
    8

### linq51: Intersect - 2
```csharp
//c#
public void Linq51() 
{ 
    List<Product> products = GetProductList(); 
    List<Customer> customers = GetCustomerList(); 
  
    var productFirstChars = 
        from p in products 
        select p.ProductName[0]; 
    var customerFirstChars = 
        from c in customers 
        select c.CompanyName[0]; 
  
    var commonFirstChars = productFirstChars.Intersect(customerFirstChars); 
  
    Console.WriteLine("Common first letters from Product names and Customer names:"); 
    foreach (var ch in commonFirstChars) 
    { 
        Console.WriteLine(ch); 
    } 
}
```
```java
//java
public void linq51(){
    List<Product> products = getProductList();
    List<Customer> customers = getCustomerList();

    List<Character> productFirstChars = map(products, new Function<Product, Character>() {
        @Override
        public Character apply(Product p) {
            return p.productName.charAt(0);
        }
    });

    List<Character> customerFirstChars = map(customers, new Function<Customer, Character>() {
        @Override
        public Character apply(Customer c) {
            return c.companyName.charAt(0);
        }
    });

    List<Character> commonFirstChars = intersect(productFirstChars, customerFirstChars);

    Log.d("Common first letters from Product names and Customer names:");
    for (Character ch : commonFirstChars){
        Log.d(ch);
    }
}
```
#### Output

    Common first letters from Product names and Customer names:
    C
    A
    G
    N
    M
    I
    Q
    K
    T
    P
    S
    R
    B
    V
    F
    E
    W
    L
    O

### linq52: Except - 1
```csharp
//c#
public void Linq52() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    IEnumerable<int> aOnlyNumbers = numbersA.Except(numbersB); 
  
    Console.WriteLine("Numbers in first array but not second array:"); 
    foreach (var n in aOnlyNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq52(){
    int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
    int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

    List<Integer> aOnlyNumbers = difference(toList(numbersA), toList(numbersB));

    Log.d("Numbers in first array but not second array:");
    for(Integer n: aOnlyNumbers){
        Log.d(n);
    }
}
```
#### Output

    Numbers in first array but not second array:
    0
    2
    4
    6
    9

### linq53: Except - 2
```csharp
//c#
public void Linq53() 
{ 
    List<Product> products = GetProductList(); 
    List<Customer> customers = GetCustomerList(); 
  
    var productFirstChars = 
        from p in products 
        select p.ProductName[0]; 
    var customerFirstChars = 
        from c in customers 
        select c.CompanyName[0]; 
  
    var productOnlyFirstChars = productFirstChars.Except(customerFirstChars); 
  
    Console.WriteLine("First letters from Product names, but not from Customer names:"); 
    foreach (var ch in productOnlyFirstChars) 
    { 
        Console.WriteLine(ch); 
    } 
}
```
```java
//java
public void linq53(){
    List<Product> products = getProductList();
    List<Customer> customers = getCustomerList();

    List<Character> productFirstChars = map(products, new Function<Product, Character>() {
        @Override
        public Character apply(Product p) {
            return p.productName.charAt(0);
        }
    });

    List<Character> customerFirstChars = map(customers, new Function<Customer, Character>() {
        @Override
        public Character apply(Customer c) {
            return c.companyName.charAt(0);
        }
    });

    List<Character> productOnlyFirstChars = difference(productFirstChars, customerFirstChars);

    Log.d("First letters from Product names, but not from Customer names:");
    for (Character ch : productOnlyFirstChars){
        Log.d(ch);
    }
}
```
#### Output

    First letters from Product names, but not from Customer names:
    U
    J
    Z


LINQ - Conversion Operators
---------------------------

### linq54: ToArray
```csharp
//c#
public void Linq54() 
{ 
    double[] doubles = { 1.7, 2.3, 1.9, 4.1, 2.9 }; 
  
    var sortedDoubles = 
        from d in doubles 
        orderby d descending 
        select d; 
    var doublesArray = sortedDoubles.ToArray(); 
  
    Console.WriteLine("Every other double from highest to lowest:"); 
    for (int d = 0; d < doublesArray.Length; d += 2) 
    { 
        Console.WriteLine(doublesArray[d]); 
    } 
}
```
```java
//java
public void linq54(){
    double[] doubles = new double[] { 1.7, 2.3, 1.9, 4.1, 2.9 };

    List<Double> sortedDoubles = orderByDesc(toList(doubles));

    Double[] doublesArray = toArray(sortedDoubles, Double.class);

    Log.d("Every other double from highest to lowest:");
    for (int d = 0; d < doublesArray.length; d += 2){
        Log.d(doublesArray[d]);
    }
}
```
#### Output

    Every other double from highest to lowest:
    4.1
    2.3
    1.7

### linq55: ToList
```csharp
//c#
public void Linq55() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    var sortedWords = 
        from w in words 
        orderby w 
        select w; 
    var wordList = sortedWords.ToList(); 
  
    Console.WriteLine("The sorted word list:"); 
    foreach (var w in wordList) 
    { 
        Console.WriteLine(w); 
    } 
}
```
```java
//java
public void linq55(){
    String[] words = new String[] { "cherry", "apple", "blueberry" };

    List<String> sortedWords = orderBy(words);
    List<String> wordList = toList(sortedWords);

    Log.d("The sorted word list:");
    for (String w : wordList){
        Log.d(w);
    }
}
```
#### Output

    The sorted word list:
    apple
    blueberry
    cherry

### linq56: ToDictionary
```csharp
//c#
public void Linq56() 
{ 
    var scoreRecords = new[] { new {Name = "Alice", Score = 50}, 
                                new {Name = "Bob"  , Score = 40}, 
                                new {Name = "Cathy", Score = 45} 
                            }; 
  
    var scoreRecordsDict = scoreRecords.ToDictionary(sr => sr.Name); 
  
    Console.WriteLine("Bob's score: {0}", scoreRecordsDict["Bob"]); 
}
```
```java
//java
public void linq56(){
    List<Tuple<String,Integer>> scoreRecords = toList(
        new Tuple<>("Alice", 50),
        new Tuple<>("Bob", 40),
        new Tuple<>("Cathy", 45)
    );

    Map<String,Tuple<String,Integer>> scoreRecordsDict = toDictionary(scoreRecords, new Function<Tuple<String, Integer>, String>() {
        @Override
        public String apply(Tuple<String, Integer> t) {
            return t.A;
        }
    });

    Log.d("Bob's score: " + scoreRecordsDict.get("Bob"));
}
```
#### Output

    Bob's score: (Bob, 40)

### linq57: OfType    
```csharp
//c#
public void Linq57() 
{ 
    object[] numbers = { null, 1.0, "two", 3, "four", 5, "six", 7.0 }; 
  
    var doubles = numbers.OfType<double>(); 
  
    Console.WriteLine("Numbers stored as doubles:"); 
    foreach (var d in doubles) 
    { 
        Console.WriteLine(d); 
    } 
}
```
```java
//java
public void linq57(){
    Object[] numbers = new Object[] { null, 1.0, "two", 3, "four", 5, "six", 7.0 };

    List<Double> doubles = ofType(toList(numbers), Double.class);

    Log.d("Numbers stored as doubles:");
    for (Double d : doubles){
        Log.d(d);
    }
}
```
#### Output

    Numbers stored as doubles:
    1.0
    7.0


LINQ - Element Operators
------------------------

### linq58: First - Simple
```csharp
//c#
public void Linq58() 
{ 
    List<Product> products = GetProductList(); 
 
    Product product12 = ( 
        from p in products 
        where p.ProductID == 12 
        select p) 
        .First(); 
  
    ObjectDumper.Write(product12); 
}
```
```java
//java
public void linq58(){
    List<Product> products = getProductList();

    Product product12 = first(products, new Predicate<Product>() {
        @Override
        public boolean apply(Product p) {
            return p.productId == 12;
        }
    });

    Log.d(product12);
}
```
#### Output

    (Product id=12, name=Queso Manchego La Pastora, cat=Dairy Products, price=38.0, inStock=86)

### linq59: First - Condition
```csharp
//c#
public void Linq59() 
{ 
    string[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; 
  
    string startsWithO = strings.First(s => s[0] == 'o'); 
  
    Console.WriteLine("A string starting with 'o': {0}", startsWithO); 
}
```
```java
//java
public void linq59(){
    String[] strings = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    String startsWithO = first(strings, new Predicate<String>() {
        @Override
        public boolean apply(String s) {
            return s.charAt(0) == 'o';
        }
    });

    Log.d("A string starting with 'o': " + startsWithO);
}
```
#### Output

    A string starting with 'o': one

### linq61: FirstOrDefault - Simple
```csharp
//c#
public void Linq61() 
{ 
    int[] numbers = { }; 
  
    int firstNumOrDefault = numbers.FirstOrDefault(); 
  
    Console.WriteLine(firstNumOrDefault); 
}
```
```java
//java
public void linq61(){
    int[] numbers = { };

    int firstNumOrDefault = first(toList(numbers), 0);

    Log.d(firstNumOrDefault);
}
```
#### Output

    0

### linq62: FirstOrDefault - Condition
```csharp
//c#
public void Linq62() 
{ 
    List<Product> products = GetProductList(); 
  
    Product product789 = products.FirstOrDefault(p => p.ProductID == 789); 
 
    Console.WriteLine("Product 789 exists: {0}", product789 != null); 
}
```
```java
//java
public void linq62(){
    List<Product> products = getProductList();

    Product product789 = first(products, new Predicate<Product>() {
        @Override
        public boolean apply(Product p) {
            return p.productId == 789;
        }
    });

    Log.d("Product 789 exists: " + (product789 != null));
}
```
#### Output

    Product 789 exists: false

### linq64: ElementAt
```csharp
//c#
public void Linq64() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int fourthLowNum = ( 
        from n in numbers 
        where n > 5 
        select n) 
        .ElementAt(1);  // second number is index 1 because sequences use 0-based indexing 
 
    Console.WriteLine("Second number > 5: {0}", fourthLowNum); 
}
```
```java
//java
public void linq64(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    Integer fourthLowNum = filter(toList(numbers), new Predicate<Integer>() {
            @Override
            public boolean apply(Integer n) {
                return n > 5;
            }
        })
        .get(1);  // second number is index 1 because sequences use 0-based indexing

    Log.d("Second number > 5: " + fourthLowNum);
}
```
#### Output

    Second number > 5: 8


LINQ - Generation Operators
---------------------------

### linq65: Range
```csharp
//c#
public void Linq65() 
{ 
    var numbers = 
        from n in Enumerable.Range(100, 50) 
  
        select new { Number = n, OddEven = n % 2 == 1 ? "odd" : "even" }; 
  
    foreach (var n in numbers) 
    { 
        Console.WriteLine("The number {0} is {1}.", n.Number, n.OddEven); 
    } 
}
```
```java
//java
public void linq65(){
    List<Tuple<Integer, String>> numbers = map(toList(range(100, 150)), new Function<Integer, Tuple<Integer, String>>() {
        @Override
        public Tuple<Integer, String> apply(Integer n) {
            return new Tuple<>(n, n % 2 == 1 ? "odd" : "even");
        }
    });

    for (Tuple<Integer,String> n : numbers){
        Log.d("The number " + n.A + " is " + n.B);
    }
}
```
#### Output

    The number 100 is even
    The number 101 is odd
    The number 102 is even
    The number 103 is odd
    The number 104 is even
    The number 105 is odd
    The number 106 is even
    The number 107 is odd
    The number 108 is even
    The number 109 is odd
    The number 110 is even
    ...

### linq66: Repeat
```csharp
//c#
public void Linq66() 
{ 
    var numbers = Enumerable.Repeat(7, 10); 
  
    foreach (var n in numbers) 
    {  
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq66(){
    int[] numbers = repeat(7, 10);

    for (int n : numbers){
        Log.d(n);
    }
}
```
#### Output

    7
    7
    7
    7
    7
    7
    7
    7
    7
    7


LINQ - Quantifiers
------------------

### linq67: Any - Simple
```csharp
//c#
public void Linq67() 
{ 
    string[] words = { "believe", "relief", "receipt", "field" }; 
  
    bool iAfterE = words.Any(w => w.Contains("ei")); 
 
    Console.WriteLine("There is a word that contains in the list that contains 'ei': {0}", iAfterE); 
}
```
```java
//java
public void linq67(){
    String[] words = new String[] { "believe", "relief", "receipt", "field" };

    boolean iAfterE = any(words, new Predicate<String>() {
        @Override
        public boolean apply(String w) {
            return w.contains("ei");
        }
    });

    Log.d("There is a word that contains in the list that contains 'ei': " + iAfterE);
}
```
#### Output

    There is a word that contains in the list that contains 'ei': true

### linq69: Any - Grouped
```csharp
//c#
public void Linq69() 
{ 
    List<Product> products = GetProductList(); 
    var productGroups = 
        from p in products 
        group p by p.Category into g 
        where g.Any(p => p.UnitsInStock == 0) 
        select new { Category = g.Key, Products = g }; 
 
    ObjectDumper.Write(productGroups, 1);  
}
```
```java
//java
public void linq69(){
    List<Product> products = getProductList();

    List<Tuple<String, Group<String,Product>>> productGroups =
        map(
            filter(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Predicate<Group<String, Product>>() {
                    @Override
                    public boolean apply(Group<String, Product> g) {
                        return any(g, new Predicate<Product>() {
                            @Override
                            public boolean apply(Product p) {
                                return p.unitsInStock == 0;
                            }
                        });
                    }
                })
            , new Function<Group<String, Product>, Tuple<String, Group<String, Product>>>() {
                @Override
                public Tuple<String, Group<String, Product>> apply(Group<String, Product> g) {
                    return new Tuple<>(g.key, g);
                }
            }
        );

    for (Tuple<String, Group<String,Product>> t : productGroups){
        Log.d(t.B);
    }
}
```
#### Output

    Meat/Poultry:
    (Product id=9, name=Mishi Kobe Niku, cat=Meat/Poultry, price=97.0, inStock=29)
    (Product id=17, name=Alice Mutton, cat=Meat/Poultry, price=39.0, inStock=0)
    (Product id=29, name=Thüringer Rostbratwurst, cat=Meat/Poultry, price=123.79, inStock=0)
    (Product id=53, name=Perth Pasties, cat=Meat/Poultry, price=32.8, inStock=0)
    (Product id=54, name=Tourtière, cat=Meat/Poultry, price=7.45, inStock=21)
    (Product id=55, name=Pâté chinois, cat=Meat/Poultry, price=24.0, inStock=115)
    
    Condiments:
    (Product id=3, name=Aniseed Syrup, cat=Condiments, price=10.0, inStock=13)
    (Product id=4, name=Chef Anton's Cajun Seasoning, cat=Condiments, price=22.0, inStock=53)
    ...

### linq70: All - Simple
```csharp
//c#
public void Linq70() 
{  
    int[] numbers = { 1, 11, 3, 19, 41, 65, 19 }; 
  
    bool onlyOdd = numbers.All(n => n % 2 == 1); 
  
    Console.WriteLine("The list contains only odd numbers: {0}", onlyOdd); 
}
```
```java
//java
public void linq70(){
    int[] numbers = new int[] { 1, 11, 3, 19, 41, 65, 19 };

    boolean onlyOdd = all(toList(numbers), new Predicate<Integer>() {
        @Override
        public boolean apply(Integer n) {
            return n % 2 == 1;
        }
    });

    Log.d("The list contains only odd numbers: " + onlyOdd);
}
```
#### Output

    The list contains only odd numbers: true

### linq72: All - Grouped    
```csharp
//c#
public void Linq72() 
{ 
    List<Product> products = GetProductList(); 
  
    var productGroups = 
        from p in products 
        group p by p.Category into g 
        where g.All(p => p.UnitsInStock > 0) 
        select new { Category = g.Key, Products = g }; 
     
    ObjectDumper.Write(productGroups, 1); 
}
```
```java
//java
public void linq72(){
    List<Product> products = getProductList();

    List<Tuple<String, Group<String,Product>>> productGroups =
        map(
            filter(
                groupBy(products, new Function<Product, String>() {
                    @Override
                    public String apply(Product p) {
                        return p.category;
                    }
                }),
                new Predicate<Group<String, Product>>() {
                    @Override
                    public boolean apply(Group<String, Product> g) {
                        return all(g, new Predicate<Product>() {
                            @Override
                            public boolean apply(Product p) {
                                return p.unitsInStock > 0;
                            }
                        });
                    }
                })
            , new Function<Group<String, Product>, Tuple<String, Group<String, Product>>>() {
                @Override
                public Tuple<String, Group<String, Product>> apply(Group<String, Product> g) {
                    return new Tuple<>(g.key, g);
                }
            }
        );

    for (Tuple<String, Group<String,Product>> t : productGroups){
        Log.d(t.B);
    }
}
```
#### Output

    Confections:
    (Product id=16, name=Pavlova, cat=Confections, price=17.45, inStock=29)
    (Product id=19, name=Teatime Chocolate Biscuits, cat=Confections, price=9.2, inStock=25)
    (Product id=20, name=Sir Rodney's Marmalade, cat=Confections, price=81.0, inStock=40)
    (Product id=21, name=Sir Rodney's Scones, cat=Confections, price=10.0, inStock=3)
    (Product id=25, name=NuNuCa Nuß-Nougat-Creme, cat=Confections, price=14.0, inStock=76)
    (Product id=26, name=Gumbär Gummibärchen, cat=Confections, price=31.23, inStock=15)
    (Product id=27, name=Schoggi Schokolade, cat=Confections, price=43.9, inStock=49)
    (Product id=47, name=Zaanse koeken, cat=Confections, price=9.5, inStock=36)
    (Product id=48, name=Chocolade, cat=Confections, price=12.75, inStock=15)
    (Product id=49, name=Maxilaku, cat=Confections, price=20.0, inStock=10)
    (Product id=50, name=Valkoinen suklaa, cat=Confections, price=16.25, inStock=65)
    (Product id=62, name=Tarte au sucre, cat=Confections, price=49.3, inStock=17)
    (Product id=68, name=Scottish Longbreads, cat=Confections, price=12.5, inStock=6)
    ...


LINQ - Aggregate Operators
--------------------------

### linq73: Count - Simple
```csharp
//c#
public void Linq73() 
{ 
    int[] factorsOf300 = { 2, 2, 3, 5, 5 }; 
  
    int uniqueFactors = factorsOf300.Distinct().Count(); 
  
    Console.WriteLine("There are {0} unique factors of 300.", uniqueFactors); 
}
```
```java
//java
public void linq73(){
    int[] factorsOf300 = new int[] { 2, 2, 3, 5, 5 };

    int uniqueFactors = distinct(toList(factorsOf300)).size();

    Log.d("There are " + uniqueFactors + " unique factors of 300.");
}
```
#### Output

    There are 3 unique factors of 300.

### linq74: Count - Conditional
```csharp
//c#
public void Linq74() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int oddNumbers = numbers.Count(n => n % 2 == 1); 
  
    Console.WriteLine("There are {0} odd numbers in the list.", oddNumbers); 
}
```
```java
//java
public void linq74(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    int oddNumbers = count(toList(numbers), new Predicate<Integer>() {
        @Override
        public boolean apply(Integer n) {
            return n % 2 == 1;
        }
    });

    Log.d("There are " + oddNumbers + " odd numbers in the list.");
}
```
#### Output

    There are 5 odd numbers in the list.

### linq76: Count - Nested
```csharp
//c#
public void Linq76() 
{ 
    List<Customer> customers = GetCustomerList(); 
  
    var orderCounts = 
        from c in customers 
        select new { c.CustomerID, OrderCount = c.Orders.Count() }; 
  
    ObjectDumper.Write(orderCounts); 
}
```
```java
//java
public void linq76(){
    List<Customer> customers = getCustomerList();

    List<Tuple<String, Integer>> orderCounts =
        map(customers, new Function<Customer, Tuple<String, Integer>>() {
            @Override
            public Tuple<String, Integer> apply(Customer c) {
                return new Tuple<>(c.customerId, c.orders.size());
            }
        });

    for (Tuple<?,?> t : orderCounts){
        Log.d(t);
    }
}
```
#### Output

    (ALFKI, 6)
    (ANATR, 4)
    (ANTON, 7)
    (AROUT, 13)
    (BERGS, 18)
    (BLAUS, 7)
    (BLONP, 11)
    ...

### linq77: Count - Grouped
```csharp
//c#
public void Linq77() 
{ 
    List<Product> products = GetProductList(); 
  
    var categoryCounts = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, ProductCount = g.Count() }; 
  
    ObjectDumper.Write(categoryCounts 
}
```
```java
//java
public void linq77(){
    List<Product> products = getProductList();

    List<Tuple<String,Integer>> categoryCounts =
        map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            }),
            new Function<Group<String, Product>, Tuple<String,Integer>>() {
                @Override
                public Tuple<String, Integer> apply(Group<String, Product> g) {
                    return new Tuple<>(g.key, g.items.size());
                }
            }
        );

    for (Tuple<?,?> t : categoryCounts){
        Log.d(t);
    }
}
```
#### Output

    (Confections, 13)
    (Seafood, 12)
    (Grains/Cereals, 7)
    (Meat/Poultry, 6)
    (Beverages, 12)
    (Condiments, 12)
    (Dairy Products, 10)
    (Produce, 5)

### linq78: Sum - Simple
```csharp
//c#
public void Linq78() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    double numSum = numbers.Sum(); 
  
    Console.WriteLine("The sum of the numbers is {0}.", numSum); 
}
```
```java
//java
public void linq78(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    double numSum = sum(numbers);

    Log.d("The sum of the numbers is " + numSum);
}
```
#### Output

    The sum of the numbers is 45.0

### linq79: Sum - Projection
```csharp
//c#
public void Linq79() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    double totalChars = words.Sum(w => w.Length); 
  
    Console.WriteLine("There are a total of {0} characters in these words.", totalChars); 
}
```
```java
//java
public void linq79(){
    String[] words = new String[] { "cherry", "apple", "blueberry" };

    Integer totalChars = sum(toList(words), new Function<String, Integer>() {
        @Override
        public Integer apply(String w) {
            return w.length();
        }
    });

    Log.d("There are a total of " + totalChars + " characters in these words.");
}
```
#### Output

    There are a total of 20 characters in these words.

### linq80: Sum - Grouped
```csharp
//c#
public void Linq80() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, TotalUnitsInStock = g.Sum(p => p.UnitsInStock) }; 
  
    ObjectDumper.Write(categories); 
}
```
```java
//java
public void linq80(){
    List<Product> products = getProductList();

    List<Tuple<String, Integer>> categories =
        map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            })
            , new Function<Group<String,Product>, Tuple<String, Integer>>() {
                @Override
                public Tuple<String, Integer> apply(Group<String, Product> g) {
                    return new Tuple<>(g.key, sum(g, new Function<Product, Integer>() {
                        @Override
                        public Integer apply(Product p) {
                            return p.unitsInStock;
                        }
                    }));
                }
            }
        );

    for (Tuple<?,?> t : categories){
        Log.d(t);
    }
}
```
#### Output

    (Confections, 386)
    (Seafood, 701)
    (Grains/Cereals, 308)
    (Meat/Poultry, 165)
    (Beverages, 559)
    (Condiments, 507)
    (Dairy Products, 393)
    (Produce, 100)

### linq81: Min - Simple
```csharp
//c#
public void Linq81() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int minNum = numbers.Min(); 
  
    Console.WriteLine("The minimum number is {0}.", minNum); 
}
```
```java
//java
public void linq81(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    int minNum = min(numbers);

    Log.d("The minimum number is " +  minNum);
}
```
#### Output

    The minimum number is 0

### linq82: Min - Projection
```csharp
//c#
public void Linq82() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    int shortestWord = words.Min(w => w.Length); 
  
    Console.WriteLine("The shortest word is {0} characters long.", shortestWord); 
}
```
```java
//java
public void linq82(){
    String[] words = new String[] { "cherry", "apple", "blueberry" };

    int shortestWord = min(words, new Function<String, Integer>() {
        @Override
        public Integer apply(String w) {
            return w.length();
        }
    });

    Log.d("The shortest word is " + shortestWord + " characters long.");
}
```
#### Output

    The shortest word is 5 characters long.

### linq83: Min - Grouped
```csharp
//c#
public void Linq83() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, CheapestPrice = g.Min(p => p.UnitPrice) }; 
  
    ObjectDumper.Write(categories); 
}
```
```java
//java
public void linq83(){
    List<Product> products = getProductList();

    List<Tuple<String,Double>> categories =
        map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            }),
            new Function<Group<String, Product>, Tuple<String, Double>>() {
                @Override
                public Tuple<String, Double> apply(Group<String, Product> g) {
                    return new Tuple<>(g.key, minDouble(g, new Function<Product, Double>() {
                        @Override
                        public Double apply(Product p) {
                            return p.unitPrice;
                        }
                    }));
                }
            }
        );

    for (Tuple<?,?> t : categories){
        Log.d(t);
    }
}
```
#### Output

    (Confections, 9.2)
    (Seafood, 6.0)
    (Grains/Cereals, 7.0)
    (Meat/Poultry, 7.45)
    (Beverages, 4.5)
    (Condiments, 10.0)
    (Dairy Products, 2.5)
    (Produce, 10.0)

### linq84: Min - Elements
```csharp
//c#
public void Linq84() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        let minPrice = g.Min(p => p.UnitPrice) 
        select new { Category = g.Key, CheapestProducts = g.Where(p => p.UnitPrice == minPrice) }; 
  
    ObjectDumper.Write(categories, 1); 
}
```
```java
//java
public void linq84(){
    List<Product> products = getProductList();

    List<Tuple<String,ArrayList<Product>>> categories =
        map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            }),
            new Function<Group<String, Product>, Tuple<String, ArrayList<Product>>>() {
                @Override
                public Tuple<String, ArrayList<Product>> apply(Group<String, Product> g) {
                    final double minPrice = minDouble(g, new Function<Product, Double>() {
                        @Override
                        public Double apply(Product p) {
                            return p.unitPrice;
                        }
                    });
                    return new Tuple<>(
                        g.key,
                        filter(g.items, new Predicate<Product>() {
                            @Override
                            public boolean apply(Product p) {
                                return p.unitPrice == minPrice;
                            }
                        })
                    );
                }
            }
        );

    for (Tuple<String,ArrayList<Product>> t : categories){
        Log.d(t.A + ": ");
        Log.d(t.B);
    }
}
```
#### Output

    Confections: 
    [(Product id=19, name=Teatime Chocolate Biscuits, cat=Confections, price=9.2, inStock=25)]
    Seafood: 
    [(Product id=13, name=Konbu, cat=Seafood, price=6.0, inStock=24)]
    Grains/Cereals: 
    [(Product id=52, name=Filo Mix, cat=Grains/Cereals, price=7.0, inStock=38)]
    Meat/Poultry: 
    [(Product id=54, name=Tourtière, cat=Meat/Poultry, price=7.45, inStock=21)]
    Beverages: 
    [(Product id=24, name=Guaraná Fantástica, cat=Beverages, price=4.5, inStock=20)]
    Condiments: 
    [(Product id=3, name=Aniseed Syrup, cat=Condiments, price=10.0, inStock=13)]
    Dairy Products: 
    [(Product id=33, name=Geitost, cat=Dairy Products, price=2.5, inStock=112)]
    Produce: 
    [(Product id=74, name=Longlife Tofu, cat=Produce, price=10.0, inStock=4)]

### linq85: Max - Simple
```csharp
//c#
public void Linq85() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int maxNum = numbers.Max(); 
  
    Console.WriteLine("The maximum number is {0}.", maxNum); 
}
```
```java
//java
public void linq85(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    int maxNum = max(numbers);

    Log.d("The maximum number is " + maxNum);
}
```
#### Output

    The maximum number is 9

### linq86: Max - Projection
```csharp
//c#
public void Linq86() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    int longestLength = words.Max(w => w.Length); 
  
    Console.WriteLine("The longest word is {0} characters long.", longestLength); 
}
```
```java
//java
public void linq86(){
    String[] words = new String[] { "cherry", "apple", "blueberry" };

    int longestLength = max(words, new Function<String, Integer>() {
        @Override
        public Integer apply(String w) {
            return w.length();
        }
    });

    Log.d("The longest word is " + longestLength + " characters long.");
}
```
#### Output

    The longest word is 9 characters long.

### linq87: Max - Grouped
```csharp
//c#
public void Linq87() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, MostExpensivePrice = g.Max(p => p.UnitPrice) }; 
  
    ObjectDumper.Write(categories); 
}
```
```java
//java
public void linq87(){
    List<Product> products = getProductList();

    ArrayList<Tuple<String, Double>> categories =
        map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            }),
            new Function<Group<String, Product>, Tuple<String, Double>>() {
                @Override
                public Tuple<String, Double> apply(Group<String, Product> g) {
                    return new Tuple<>(
                        g.key,
                        maxDouble(g, new Function<Product, Double>() {
                            @Override
                            public Double apply(Product p) {
                                return p.unitPrice;
                            }
                        })
                    );
                }
            }
        );

    for (Tuple<?,?> t : categories){
        Log.d(t);
    }
}
```
#### Output

    (Confections, 81.0)
    (Seafood, 62.5)
    (Grains/Cereals, 38.0)
    (Meat/Poultry, 123.79)
    (Beverages, 263.5)
    (Condiments, 43.9)
    (Dairy Products, 55.0)
    (Produce, 53.0)

### linq88: Max - Elements
```csharp
//c#
public void Linq88() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        let maxPrice = g.Max(p => p.UnitPrice) 
        select new { Category = g.Key, MostExpensiveProducts = g.Where(p => p.UnitPrice == maxPrice) }; 
  
    ObjectDumper.Write(categories, 1); 
}
```
```java
//java
public void linq88(){
    List<Product> products = getProductList();

    List<Tuple<String,ArrayList<Product>>> categories =
        map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            }),
            new Function<Group<String, Product>, Tuple<String, ArrayList<Product>>>() {
                @Override
                public Tuple<String, ArrayList<Product>> apply(Group<String, Product> g) {
                    final double maxPrice = maxDouble(g, new Function<Product, Double>() {
                        @Override
                        public Double apply(Product p) {
                            return p.unitPrice;
                        }
                    });
                    return new Tuple<>(
                        g.key,
                        filter(g.items, new Predicate<Product>() {
                            @Override
                            public boolean apply(Product p) {
                                return p.unitPrice == maxPrice;
                            }
                        })
                    );
                }
            }
        );

    for (Tuple<String,ArrayList<Product>> t : categories){
        Log.d(t.A + ": ");
        Log.d(t.B);
    }
}
```
#### Output

    Confections: 
    [(Product id=20, name=Sir Rodney's Marmalade, cat=Confections, price=81.0, inStock=40)]
    Seafood: 
    [(Product id=18, name=Carnarvon Tigers, cat=Seafood, price=62.5, inStock=42)]
    Grains/Cereals: 
    [(Product id=56, name=Gnocchi di nonna Alice, cat=Grains/Cereals, price=38.0, inStock=21)]
    Meat/Poultry: 
    [(Product id=29, name=Thüringer Rostbratwurst, cat=Meat/Poultry, price=123.79, inStock=0)]
    Beverages: 
    [(Product id=38, name=Côte de Blaye, cat=Beverages, price=263.5, inStock=17)]
    Condiments: 
    [(Product id=63, name=Vegie-spread, cat=Condiments, price=43.9, inStock=24)]
    Dairy Products: 
    [(Product id=59, name=Raclette Courdavault, cat=Dairy Products, price=55.0, inStock=79)]
    Produce: 
    [(Product id=51, name=Manjimup Dried Apples, cat=Produce, price=53.0, inStock=20)]

### linq89: Average - Simple
```csharp
//c#
public void Linq89() 
{ 
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    double averageNum = numbers.Average(); 
  
    Console.WriteLine("The average number is {0}.", averageNum); 
}
```
```java
//java
public void linq89(){
    int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    double averageNum = avg(numbers);

    Log.d("The average number is " + averageNum);
}
```
#### Output

    The average number is 4.5

### linq90: Average - Projection
```csharp
//c#
public void Linq90() 
{ 
    string[] words = { "cherry", "apple", "blueberry" }; 
  
    double averageLength = words.Average(w => w.Length); 
  
    Console.WriteLine("The average word length is {0} characters.", averageLength); 
}
```
```java
//java
public void linq90(){
    String[] words = new String[] { "cherry", "apple", "blueberry" };

    double averageLength = avg(words, new Function<String, Integer>() {
        @Override
        public Integer apply(String w) {
            return w.length();
        }
    });

    Log.d("The average word length is " + averageLength + " characters.");
}
```
#### Output

    The average word length is 6.666666666666667 characters.

### linq91: Average - Grouped
```csharp
//c#
public void Linq91() 
{ 
    List<Product> products = GetProductList(); 
  
    var categories = 
        from p in products 
        group p by p.Category into g 
        select new { Category = g.Key, AveragePrice = g.Average(p => p.UnitPrice) }; 
  
    ObjectDumper.Write(categories); 
}
```
```java
//java
public void linq91(){
    List<Product> products = getProductList();

    ArrayList<Tuple<String, Double>> categories =
        map(
            groupBy(products, new Function<Product, String>() {
                @Override
                public String apply(Product p) {
                    return p.category;
                }
            }),
            new Function<Group<String, Product>, Tuple<String, Double>>() {
                @Override
                public Tuple<String, Double> apply(Group<String, Product> g) {
                    return new Tuple<>(
                        g.key,
                        avgDouble(g, new Function<Product, Double>() {
                            @Override
                            public Double apply(Product p) {
                                return p.unitPrice;
                            }
                        })
                    );
                }
            }
        );

    for (Tuple<?,?> t : categories){
        Log.d(t);
    }
}
```
#### Output

    (Confections, 25.16)
    (Seafood, 20.6825)
    (Grains/Cereals, 20.25)
    (Meat/Poultry, 54.00666666666667)
    (Beverages, 37.979166666666664)
    (Condiments, 23.0625)
    (Dairy Products, 28.73)
    (Produce, 32.37)

### linq92: Aggregate - Simple
```csharp
//c#
public void Linq92() 
{ 
    double[] doubles = { 1.7, 2.3, 1.9, 4.1, 2.9 }; 
  
    double product = doubles.Aggregate((runningProduct, nextFactor) => runningProduct * nextFactor); 
  
    Console.WriteLine("Total product of all numbers: {0}", product); 
}
```
```java
//java
public void linq92(){
    double[] doubles = new double[]  { 1.7, 2.3, 1.9, 4.1, 2.9 };

    double product = reduce(toList(doubles), 1d, new Reducer<Double, Double>() {
        @Override
        public Double reduce(Double runningProduct, Double nextFactor) {
            return runningProduct * nextFactor;
        }
    });

    Log.d("Total product of all numbers: " + product);
}
```
#### Output

    Total product of all numbers: 88.33080999999999

### linq93: Aggregate - Seed
```csharp
//c#
public void Linq93() 
{ 
    double startBalance = 100.0; 
  
    int[] attemptedWithdrawals = { 20, 10, 40, 50, 10, 70, 30 }; 
  
    double endBalance = 
        attemptedWithdrawals.Aggregate(startBalance, 
            (balance, nextWithdrawal) => 
                ((nextWithdrawal <= balance) ? (balance - nextWithdrawal) : balance)); 
  
    Console.WriteLine("Ending balance: {0}", endBalance); 
}
```
```java
//java
public void linq93(){
    double startBalance = 100.0;

    int[] attemptedWithdrawals = new int[] { 20, 10, 40, 50, 10, 70, 30 };

    double endBalance =
        reduce(
            toList(attemptedWithdrawals),
            startBalance,
            new Reducer<Integer, Double>() {
                @Override
                public Double reduce(Double balance, Integer nextWithdrawal) {
                    return (nextWithdrawal <= balance) ? (balance - nextWithdrawal) : balance;
                }
            }
        );

    Log.d("Ending balance: " + endBalance);
}
```
#### Output

    Ending balance: 20.0


LINQ - Miscellaneous Operators
------------------------------

### linq94: Concat - 1
```csharp
//c#
public void Linq94() 
{ 
    int[] numbersA = { 0, 2, 4, 5, 6, 8, 9 }; 
    int[] numbersB = { 1, 3, 5, 7, 8 }; 
  
    var allNumbers = numbersA.Concat(numbersB); 
  
    Console.WriteLine("All numbers from both arrays:"); 
    foreach (var n in allNumbers) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq94(){
    int[] numbersA = new int[] { 0, 2, 4, 5, 6, 8, 9 };
    int[] numbersB = new int[] { 1, 3, 5, 7, 8 };

    List<Integer> allNumbers = concat(toList(numbersA), toList(numbersB));

    Log.d("All numbers from both arrays:");
    for (Integer n : allNumbers){
        Log.d(n);
    }
}
```
#### Output

    All numbers from both arrays:
    0
    2
    4
    5
    6
    8
    9
    1
    3
    5
    7
    8

### linq95: Concat - 2
```csharp
//c#
public void Linq95() 
{ 
    List<Customer> customers = GetCustomerList(); 
    List<Product> products = GetProductList(); 
  
    var customerNames = 
        from c in customers 
        select c.CompanyName; 
    var productNames = 
        from p in products 
        select p.ProductName; 
  
    var allNames = customerNames.Concat(productNames); 
  
    Console.WriteLine("Customer and product names:"); 
    foreach (var n in allNames) 
    { 
        Console.WriteLine(n); 
    } 
}
```
```java
//java
public void linq95(){
    List<Customer> customers = getCustomerList();
    List<Product> products = getProductList();

    List<String> customerNames = map(customers, new Function<Customer, String>() {
        @Override
        public String apply(Customer c) {
            return c.companyName;
        }
    });

    List<String> productNames = map(products, new Function<Product, String>() {
        @Override
        public String apply(Product p) {
            return p.productName;
        }
    });

    List<String> allNames = concat(customerNames, productNames);

    Log.d("Customer and product names:");
    for (String n : allNames){
        Log.d(n);
    }
}
```
#### Output

    Customer and product names:
    Alfreds Futterkiste
    Ana Trujillo Emparedados y helados
    Antonio Moreno Taquería
    Around the Horn
    Berglunds snabbköp
    Blauer See Delikatessen
    ...

### linq96: EqualAll - 1
```csharp
//c#
public void Linq96() 
{ 
    var wordsA = new string[] { "cherry", "apple", "blueberry" }; 
    var wordsB = new string[] { "cherry", "apple", "blueberry" }; 
  
    bool match = wordsA.SequenceEqual(wordsB); 
  
    Console.WriteLine("The sequences match: {0}", match); 
}
```
```java
//java
public void linq96(){
    String[] wordsA = new String[] { "cherry", "apple", "blueberry" };
    String[] wordsB = new String[] { "cherry", "apple", "blueberry" };

    boolean match = Arrays.equals(wordsA, wordsB);

    Log.d("The sequences match: " + match);
}
```
#### Output

    The sequences match: true

### linq97: EqualAll - 2
```csharp
//c#
public void Linq97() 
{ 
    var wordsA = new string[] { "cherry", "apple", "blueberry" }; 
    var wordsB = new string[] { "apple", "blueberry", "cherry" }; 
  
    bool match = wordsA.SequenceEqual(wordsB); 
  
    Console.WriteLine("The sequences match: {0}", match); 
}
```
```java
//java
public void linq97(){
    String[] wordsA = new String[] { "cherry", "apple", "blueberry" };
    String[] wordsB = new String[] { "cherry", "blueberry", "cherry" };

    boolean match = Arrays.equals(wordsA, wordsB);

    Log.d("The sequences match: " + match);
}
```
#### Output

    The sequences match: false

LINQ - Query Execution
----------------------

### linq99: Deferred Execution
```csharp
//c#
public void Linq99() 
{ 
    // Sequence operators form first-class queries that 
    // are not executed until you enumerate over them. 
  
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int i = 0; 
    var q = 
        from n in numbers 
        select ++i; 
  
    // Note, the local variable 'i' is not incremented 
    // until each element is evaluated (as a side-effect): 
    foreach (var v in q) 
    { 
        Console.WriteLine("v = {0}, i = {1}", v, i); 
    } 
}
```
```java
//java
public void linq099(){
    final int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    final int[] i = {0};
    List<FunctionResult<Integer>> q =
        map(toList(numbers), new Function<Integer, FunctionResult<Integer>>() {
            @Override
            public FunctionResult<Integer> apply(Integer n) {
                return new FunctionResult<Integer>() {
                    @Override
                    public Integer apply() {
                        return ++i[0];
                    }
                };
            }
        });

    for (FunctionResult<Integer> f : q){
        Integer v = f.apply();
        Log.d("v = " + v + ", i = " + i[0]);
    }
}
```
#### Output

    v = 1, i = 1
    v = 2, i = 2
    v = 3, i = 3
    v = 4, i = 4
    v = 5, i = 5
    v = 6, i = 6
    v = 7, i = 7
    v = 8, i = 8
    v = 9, i = 9
    v = 10, i = 10

### linq100: Immediate Execution
```csharp
//c#
public void Linq100() 
{ 
    // Methods like ToList() cause the query to be 
    // executed immediately, caching the results. 
  
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
  
    int i = 0; 
    var q = ( 
        from n in numbers 
        select ++i) 
        .ToList(); 
  
    // The local variable i has already been fully 
    // incremented before we iterate the results: 
    foreach (var v in q) 
    { 
        Console.WriteLine("v = {0}, i = {1}", v, i); 
    } 
} 
```
```java
//java
public void linq100(){
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    final int[] i = {0};
    List<Integer> q = map(toList(numbers), new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer n) {
            return ++i[0];
        }
    });

    for (Integer v : q){
        Log.d("v = " + v + ", i = " + i[0]);
    }
}
```
#### Output

    v = 1, i = 10
    v = 2, i = 10
    v = 3, i = 10
    v = 4, i = 10
    v = 5, i = 10
    v = 6, i = 10
    v = 7, i = 10
    v = 8, i = 10
    v = 9, i = 10
    v = 10, i = 10

### linq101: Query Reuse
```csharp
//c#
public void Linq101() 
{ 
    // Deferred execution lets us define a query once 
    // and then reuse it later after data changes. 
  
    int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 }; 
    var lowNumbers = 
        from n in numbers 
        where n <= 3 
        select n; 
  
    Console.WriteLine("First run numbers <= 3:"); 
    foreach (int n in lowNumbers) 
    { 
        Console.WriteLine(n); 
    } 
  
    for (int i = 0; i < 10; i++) 
    { 
        numbers[i] = -numbers[i]; 
    } 
  
    // During this second run, the same query object, 
    // lowNumbers, will be iterating over the new state 
    // of numbers[], producing different results: 
    Console.WriteLine("Second run numbers <= 3:"); 
    foreach (int n in lowNumbers) 
    { 
        Console.WriteLine(n); 
    } 
} 
```
```java
//java
public void linq101(){
    final int[] numbers = new int[] { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

    FunctionResult<List<Integer>> lowNumbers =
        new FunctionResult<List<Integer>>() {
            @Override
            public List<Integer> apply() {
                return filter(toList(numbers), new Predicate<Integer>() {
                    @Override
                    public boolean apply(Integer n) {
                        return n <= 3;
                    }
                });
            }
        };

    Log.d("First run numbers <= 3:");
    for (Integer n : lowNumbers.apply()){
        Log.d(n);
    }

    for (int i = 0; i < 10; i++){
        numbers[i] = -numbers[i];
    }

    Log.d("Second run numbers <= 3:");
    for (Integer n : lowNumbers.apply()){
        Log.d(n);
    }
}
```
#### Output

    First run numbers <= 3:
    1
    3
    2
    0
    Second run numbers <= 3:
    -5
    -4
    -1
    -3
    -9
    -8
    -6
    -7
    -2
    0


LINQ - Join Operators
---------------------

### linq102: Cross Join
```csharp
//c#
public void Linq102() 
{ 
    string[] categories = new string[]{  
        "Beverages",   
        "Condiments",   
        "Vegetables",   
        "Dairy Products",   
        "Seafood" };  
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category 
        select new { Category = c, p.ProductName }; 
 
    foreach (var v in q) 
    { 
        Console.WriteLine(v.ProductName + ": " + v.Category);  
    } 
}
```
```java
//java
public void linq102(){
    String[] categories = new String[]{
        "Beverages",
        "Condiments",
        "Vegetables",
        "Dairy Products",
        "Seafood" };

    List<Product> products = getProductList();

    List<Tuple<String, String>> q =
        map(
            join(toList(categories), products, new Predicate2<String, Product>() {
                @Override
                public boolean apply(String c, Product p) {
                    return c.equals(p.category);
                }
            }),
            new Function<Tuple<String, Product>, Tuple<String, String>>() {
                @Override
                public Tuple<String, String> apply(Tuple<String, Product> t) {
                    return new Tuple<>(t.A, t.B.productName);
                }
            }
        );

    for (Tuple<String,String> v : q){
        Log.d(v.A + ": " + v.B);
    }
}
```
#### Output

    Beverages: Chai
    Beverages: Chang
    Beverages: Guaraná Fantástica
    Beverages: Sasquatch Ale
    Beverages: Steeleye Stout
    Beverages: Côte de Blaye
    Beverages: Chartreuse verte
    Beverages: Ipoh Coffee
    ...

### linq103: Group Join
```csharp
//c#
public void Linq103() 
{ 
    string[] categories = new string[]{  
        "Beverages",  
        "Condiments",  
        "Vegetables",  
        "Dairy Products",  
        "Seafood" }; 
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category into ps 
        select new { Category = c, Products = ps }; 
  
    foreach (var v in q) 
    { 
        Console.WriteLine(v.Category + ":"); 
        foreach (var p in v.Products) 
        { 
            Console.WriteLine("   " + p.ProductName); 
        } 
    } 
}
```
```java
//java
public void linq103(){
    String[] categories = new String[]{
        "Beverages",
        "Condiments",
        "Vegetables",
        "Dairy Products",
        "Seafood" };

    List<Product> products = getProductList();

    List<Tuple<String,ArrayList<Product>>> q =
        map(
            joinGroup(toList(categories), products, new Predicate2<String, Product>() {
                @Override
                public boolean apply(String c, Product p) {
                    return c.equals(p.category);
                }
            }),
            new Function<Group<String, Tuple<String, Product>>, Tuple<String, ArrayList<Product>>>() {
                @Override
                public Tuple<String, ArrayList<Product>> apply(Group<String, Tuple<String, Product>> g) {
                    return new Tuple<>(
                        g.key,
                        map(g.items, new Function<Tuple<String,Product>, Product>() {
                            @Override
                            public Product apply(Tuple<String, Product> t) {
                                return t.B;
                            }
                        })
                    );
                }
            }
        );

    for (Tuple<String,ArrayList<Product>> v : q){
        Log.d(v.A + ":");
        for (Product p : v.B){
            Log.d("   " + p.productName);
        }
    }
}
```
#### Output

    Beverages:
       Chai
       Chang
       Guaraná Fantástica
       Sasquatch Ale
       Steeleye Stout
       Côte de Blaye
       Chartreuse verte
       Ipoh Coffee
       Laughing Lumberjack Lager
       Outback Lager
       Rhönbräu Klosterbier
       Lakkalikööri
    Seafood:
       Ikura
       Konbu
       Carnarvon Tigers
       Nord-Ost Matjeshering
       Inlagd Sill
       Gravad lax
       Boston Crab Meat
       Jack's New England Clam Chowder
       Rogede sild
       Spegesild
       Escargots de Bourgogne
       Röd Kaviar
    ...

### linq104: Cross Join with Group Join
```csharp
//c#
public void Linq104() 
{ 
    string[] categories = new string[]{   
        "Beverages",  
        "Condiments",  
        "Vegetables", 
        "Dairy Products",   
        "Seafood" }; 
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category into ps 
        from p in ps 
        select new { Category = c, p.ProductName }; 
  
    foreach (var v in q) 
    { 
        Console.WriteLine(v.ProductName + ": " + v.Category); 
    } 
}
```
```java
//java
public void linq104(){
    String[] categories = new String[]{
        "Beverages",
        "Condiments",
        "Vegetables",
        "Dairy Products",
        "Seafood" };

    List<Product> products = getProductList();

    List<Tuple<String,String>> q =
        expand(
            map(
                joinGroup(toList(categories), products, new Predicate2<String, Product>() {
                    @Override
                    public boolean apply(String c, Product p) {
                        return c.equals(p.category);
                    }
                }),
                new Function<Group<String, Tuple<String, Product>>, List<Tuple<String, String>>>() {
                    @Override
                    public List<Tuple<String, String>> apply(Group<String, Tuple<String, Product>> g) {
                        return map(g.items, new Function<Tuple<String, Product>, Tuple<String, String>>() {
                            @Override
                            public Tuple<String, String> apply(Tuple<String, Product> t) {
                                return new Tuple<>(t.A, t.B.productName);
                            }
                        });
                    }
                }
            )
        );

    for (Tuple<String,String> v : q){
        Log.d(v.B + ": " + v.A);
    }
}
```
#### Output

    Chai: Beverages
    Chang: Beverages
    Guaraná Fantástica: Beverages
    Sasquatch Ale: Beverages
    Steeleye Stout: Beverages
    Côte de Blaye: Beverages
    Chartreuse verte: Beverages
    Ipoh Coffee: Beverages
    Laughing Lumberjack Lager: Beverages
    Outback Lager: Beverages
    Rhönbräu Klosterbier: Beverages
    Lakkalikööri: Beverages
    Ikura: Seafood
    Konbu: Seafood
    Carnarvon Tigers: Seafood
    ...

### linq105: Left Outer Join
```csharp
//c#
public void Linq105()  
{ 
    string[] categories = new string[]{   
        "Beverages",  
        "Condiments",   
        "Vegetables",   
        "Dairy Products",  
        "Seafood" }; 
  
    List<Product> products = GetProductList(); 
  
    var q = 
        from c in categories 
        join p in products on c equals p.Category into ps 
        from p in ps.DefaultIfEmpty() 
        select new { Category = c, ProductName = p == null ? "(No products)" : p.ProductName }; 
  
    foreach (var v in q) 
    { 
        Console.WriteLine(v.ProductName + ": " + v.Category); 
    } 
}
```
```java
//java
public void linq105(){
    String[] categories = new String[]{
        "Beverages",
        "Condiments",
        "Vegetables",
        "Dairy Products",
        "Seafood" };

    final List<Product> products = getProductList();

    List<Tuple<String,String>> q =
        expand(
            map(toList(categories), new Function<String, List<Tuple<String, String>>>() {
                @Override
                public List<Tuple<String, String>> apply(final String c) {
                    List<Product> catProducts = filter(products, new Predicate<Product>() {
                        @Override
                        public boolean apply(Product p) {
                            return c.equals(p.category);
                        }
                    });
                    return catProducts.isEmpty()
                        ? toList(new Tuple<>(c, "(No products)"))
                        : map(catProducts, new Function<Product, Tuple<String, String>>() {
                        @Override
                        public Tuple<String, String> apply(Product p) {
                            return new Tuple<>(c, p.productName);
                        }
                    });
                }
            })
        );

    for (Tuple<String,String> v : q){
        Log.d(v.B + ": " + v.A);
    }
}
```
#### Output

    Chai: Beverages
    Chang: Beverages
    Guaraná Fantástica: Beverages
    Sasquatch Ale: Beverages
    Steeleye Stout: Beverages
    Côte de Blaye: Beverages
    Chartreuse verte: Beverages
    Ipoh Coffee: Beverages
    Laughing Lumberjack Lager: Beverages
    Outback Lager: Beverages
    Rhönbräu Klosterbier: Beverages
    Lakkalikööri: Beverages
    Aniseed Syrup: Condiments
    Chef Anton's Cajun Seasoning: Condiments
    Chef Anton's Gumbo Mix: Condiments
    Grandma's Boysenberry Spread: Condiments
    Northwoods Cranberry Sauce: Condiments
    Genen Shouyu: Condiments
    Gula Malacca: Condiments
    Sirop d'érable: Condiments
    Vegie-spread: Condiments
    Louisiana Fiery Hot Pepper Sauce: Condiments
    Louisiana Hot Spiced Okra: Condiments
    Original Frankfurter grüne Soße: Condiments
    (No products): Vegetables
    ...


### Contributors

  - [mythz](https://github.com/mythz) (Demis Bellot)

