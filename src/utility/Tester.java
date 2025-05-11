package utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entity.Employee;

public class Tester {

    private static List<Employee> employees = populateEmployees();

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

    public static void testProblem21() {
        List<Employee> employees = populateEmployees();
        employees.stream().filter(employee -> employee.getSalary() > 50000)
                .forEach(employee -> System.out.println(employee.toString()));
    }

    public static List<Employee> populateEmployees() {
        return Arrays.asList(
                new Employee(1, "Alice", "HR", "Manager", 90000, 7, 35),
                new Employee(2, "Bob", "IT", "Developer", 85000, 4, 28),
                new Employee(3, "Charlie", "IT", "Developer", 78000, 3, 26),
                new Employee(4, "David", "Finance", "Analyst", 95000, 8, 40),
                new Employee(5, "Eve", "HR", "Recruiter", 62000, 2, 24),
                new Employee(6, "Frank", "Finance", "Manager", 105000, 10, 45),
                new Employee(7, "Grace", "IT", "Tester", 67000, 2, 25),
                new Employee(8, "Hannah", "HR", "Manager", 88000, 6, 34),
                new Employee(9, "Ivy", "Finance", "Analyst", 74000, 5, 32),
                new Employee(10, "Jack", "IT", "Developer", 79000, 4, 27));

    }

    public static void testProblem22() {
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .forEach(employee -> System.out.println(employee.toString()));
    }

    public static void testProblem23() {
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).toString());
    }

    public static void testProblem24() {
        System.out.println(
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
    }

    public static void testProblem25() {
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(employee -> employee.getSalary()))));
    }

    public static void testProblem26() {
        System.out.println(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst().orElse(null));
    }

    public static void testProblem27() {
        employees.stream().forEach(employee -> System.out.println(employee.getName()));
        System.out.println(employees.stream().map(Employee::getName).collect(Collectors.toList()));
    }

    public static void testProblem28() {
        employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    public static void testProblem29() {
        System.out.println(employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList()));
    }

    public static void testProblem30() {
        System.out.println(
                employees.stream().collect(Collectors.partitioningBy(employee -> employee.getYearsOfExperience() > 5)));
    }

    public static void testProblem31() {
        System.out.println(employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName)));
    }

    public static void testProblem32() {
        System.out.println(employees.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getSalary, Double::sum)));
    }

    public static void testProblem33() {
        System.out.println(employees.stream().map(Employee::getName).reduce((a, b) -> a.length() > b.length() ? a : b)
                .orElse("Not String Found"));
        System.out.println(employees.stream().map(Employee::getName).max(Comparator.comparingInt(String::length)));
    }

    public static void testProblem34() {
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getRole))));
    }

    public static void testProblem35() {
        System.out.println(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList()).get(1));
        System.out.println(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
                .findFirst());
    }

    public static void testProblem36() {
        System.out.println(
                employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
                        .collect(Collectors.toList()));
    }

    public static void testProblem37() {
        Map<String, List<String>> categoryMap = new HashMap<>();
        categoryMap.put("Fruits", Arrays.asList("Apple", "Banana", "Orange"));
        categoryMap.put("Vegetables", Arrays.asList("Carrot", "Potato", "Spinach"));
        categoryMap.put("Dairy", Arrays.asList("Milk", "Cheese"));

        System.out.println(categoryMap.values().stream().flatMap(List::stream).collect(Collectors.toList()));
    }

    public static void testProblem38() {
        System.out.println(employees.stream().collect(Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(employees.stream().collect(() -> new double[2], (a, b) -> {
            a[0] += b.getSalary();
            a[1]++;
        }, (a, b) -> {
            a[0] += b[0];
            a[1] += b[1];
        })[0] / employees.size());
    }

    public static void testProblem39() {
        System.out.println(employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
    }

    public static void testProblem40() {
        employees.stream().filter(employee -> employee.getSalary() > 50000d).peek(System.out::println)
                .map(Employee::getName)
                .peek(System.out::println).collect(Collectors.toList());
    }

    public static void testProblem41() {
        employees.parallelStream().peek(employee -> {
            System.out.println(employee.toString());
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        }).collect(Collectors.toList());

        employees.stream().sequential().peek(employee -> {
            System.out.println(employee.toString());
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        }).collect(Collectors.toList());
    }

    public static void testProblem42() {
        long startTimeParallel = System.currentTimeMillis();
        employees.parallelStream().forEach(employee -> {
            System.out.println(employee.toString());
            try {
                System.out.println("Current Thread: " + Thread.currentThread().getName());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("execution time: " + (endTimeParallel - startTimeParallel));

        long startTimeSequential = System.currentTimeMillis();
        employees.stream().forEach(employee -> {
            System.out.println(employee.toString());
            try {
                System.out.println("Current Thread: " + Thread.currentThread().getName());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long endTimeSequential = System.currentTimeMillis();
        System.out.println("execution time: " + (endTimeSequential - startTimeSequential));
    }

    public static void testProblem43() {
        List<String> names = new ArrayList<>();
        employees.parallelStream().forEach(employee -> {
            names.add(employee.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(names);

    }

    public static void testProblem44() {
        List<Employee> employees = Employee.generateEmployees(100000);
        System.out.println(employees.size());
        List<String> employeeNames = new ArrayList<>();
        long startTimeParallel = System.currentTimeMillis();
        employees.parallelStream().forEach(employee -> employeeNames.add(employee.getName()));
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Execution Time: " + (endTimeParallel - startTimeParallel));
        System.out.println(employeeNames.size());

        startTimeParallel = System.currentTimeMillis();
        final List<String> employeeNames2 = employees.parallelStream().map(Employee::getName)
                .collect(Collectors.toList());
        endTimeParallel = System.currentTimeMillis();
        System.out.println("Execution Time: " + (endTimeParallel - startTimeParallel));
        System.out.println(employeeNames2.size());

    }

    public static void testProblem45() {
        List<Employee> employees = Employee.generateEmployees(100000);
        System.out.println(employees.size());
        long startTimeParallel = System.currentTimeMillis();
        employees.parallelStream().forEach(employee -> System.out.print(employee.getAge()));
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("\nparallelStream execution time: " + (endTimeParallel - startTimeParallel));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long startTimeSequential = System.currentTimeMillis();
        employees.stream().forEach(employee -> System.out.print(employee.getAge()));
        long endTimeSequential = System.currentTimeMillis();
        System.out.println("\nsequential stream execution time: " + (endTimeSequential - startTimeSequential));
    }

    public static void testProblem46() {
        List<String> words = Arrays.asList(
                "listen", "silent", "enlist", "rat", "tar", "art",
                "evil", "vile", "live", "veil", "angel", "glean",
                "stone", "tones", "onest", "bat", "tab", "act", "cat");
        System.out.println(words.stream().collect(Collectors.groupingBy(word -> {
            char[] letters = word.toString().toCharArray();
            Arrays.sort(letters);
            return new String(letters);
        })));
    }

    public static void testProblem47() {
        String input = "Java is great and Java is powerful. Java Java streams are powerful too!";
        System.out.println(Stream.of(input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }

    public static void testProblem48() {
        List<String> words = Arrays.asList(
                "madam", "racecar", "hello", "level", "world", "deified", "openai", "rotor", "java", "civic");
        System.out.println(words.stream().filter((a) -> a.equals(new StringBuilder(a).reverse().toString()))
                .collect(Collectors.toList()));
    }

    public static void testProblem49() {
        String word = "Streams in Java can be powerful and expressive";
        System.out.println(Stream.of(word.split(" ")).reduce((a, b) -> a.length() - b.length() > 0 ? a : b));
        System.out.println(Stream.of(word.split(" ")).max(Comparator.comparingInt(String::length)));
    }

    public static void testProblem50() {
        List<Employee> employees = Employee.populateEmployees();
        System.out.println(employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                        .thenComparing(Comparator.comparingInt(Employee::getAge)).thenComparing(Employee::getName))
                .collect(Collectors.toList()));
    }
}
