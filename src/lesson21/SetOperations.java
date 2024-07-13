package lesson21;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Populate sets
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        // Perform operations
        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectionSet = intersection(set1, set2);
        Set<Integer> nonIntersectingSet = nonIntersecting(set1, set2);

        // Print results
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
        System.out.println("Non-Intersecting: " + nonIntersectingSet);
         }

    // Union method
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    // Intersection method
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    // Non-Intersecting method
    public static Set<Integer> nonIntersecting(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        Set<Integer> tempSet = new HashSet<>(set1);
        tempSet.retainAll(set2);
        resultSet.removeAll(tempSet);
        return resultSet;
    }


}
