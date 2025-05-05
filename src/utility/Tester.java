package utility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entity.Employee;

public class Tester {
    public static void testProblem1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().forEach(System.out::println);
    }

    public static void testProblem2() {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }

    public static void testProblem3() {
        List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "John", "Arun", "alice");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }

    public static void testProblem4() {
        List<String> words = Arrays.asList("java", "stream", "api");
        words.stream().map(word -> word.toUpperCase()).forEach(System.out::println);
        words.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void testProblem5() {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        numbers.stream().sorted().forEach(System.out::println);
    }

    public static void testProblem6() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
        numbers.stream().distinct().forEach(System.out::println);
    }

    public static void testProblem7() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(numbers.stream().count());
    }

    public static void testProblem8() {
        List<Integer> numbers = Arrays.asList(9, 2, 14, 7, 3);
        System.out.println("Max: " + numbers.stream().max(Integer::compareTo).get());
        System.out.println("Min: " + numbers.stream().min(Integer::compareTo).get());
    }

    public static void testProblem9() {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 7);
        System.out.println(numbers.stream().reduce(Integer::sum).get());
    }

    public static void testProblem10() {
        List<Integer> numbers = Arrays.asList(2, 3, 4);
        System.out.println(numbers.stream().reduce((x, y) -> x * y).get());
    }

    public static void testProblem11() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()));

        System.out.println(numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0)));
    }

    public static void testProblem12() {
        List<String> words = Arrays.asList("java", "stream", "api", "stream");
        System.out.println(words.stream().mapToInt(String::length).boxed().collect(Collectors.toSet()));
    }

    public static void testProblem13() {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }

    public static void testProblem14() {
        List<String> words = Arrays.asList("Java", "Streams", "Are", "Powerful");
        System.out.println(words.stream().collect(Collectors.joining(",")));
    }

    public static void testProblem15() {
        List<String> words = Arrays.asList("Java", "is", "awesome", "and", "fast");
        words.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);

        words.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
    }

    public static void testProblem16() {
        List<String> words = Arrays.asList("banana", "apple", "orange", "apricot");
        System.out.println(words.stream().filter(word -> word.startsWith("a") || word.startsWith("A")).findFirst()
                .orElse("No Match"));
    }

    public static void testProblem17() {
        List<String> words = Arrays.asList("JavaScript", "Python", "Java", "C++");
        System.out.println(words.stream().filter(word -> word.contains("Java")).findAny().isPresent());

        System.out.println(words.stream().anyMatch(word -> word.contains("Java")));
    }

    public static void testProblem18() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println(words.stream().distinct().toList());
    }

    public static void testProblem21to30() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, "HR", 55000, 6),
                new Employee("Bob", 24, "Engineering", 48000, 2),
                new Employee("Charlie", 28, "Engineering", 52000, 4),
                new Employee("David", 35, "HR", 75000, 10),
                new Employee("Eve", 40, "Management", 95000, 15),
                new Employee("Frank", 29, "Engineering", 60000, 5),
                new Employee("Grace", 26, "Support", 40000, 3),
                new Employee("Alice", 30, "HR", 55000, 6), // Duplicate name and details
                new Employee("Heidi", 32, "Support", 42000, 6),
                new Employee("Ivan", 38, "Management", 85000, 12));
        // System.out.println(employees.stream().filter(employee -> employee.getSalary()
        // > 50000).toList());
        // System.out.println(employees.stream().sorted(Comparator.comparingInt(employee
        // -> employee.getAge())).toList());
        // System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)));
        // System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        // Collectors.counting())));

    }
}
