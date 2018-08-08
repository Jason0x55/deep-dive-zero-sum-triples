package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ZeroSumTriples {

  private static final int[][] values = new int [][]
      {{7, 2, -9},
      {7, -6, -1},
      {7, -10, 3},
      {7, -2, -5},
      {10, -4, -6},
      {10, -8, -2},
      {10, -9, -1},
      {2, -7, 5},
      {2, -6, 4},
      {2, -8, 6},
      {2, 8, -10},
      {2, -5, 3},
      {-4, 9, -5},
      {-4, 6, -2},
      {-4, 5, -1},
      {-7, 9, -2},
      {-7, 8, -1},
      {-7, 4, 3},
      {9, -8, -1},
      {-6, 8, -2},
      {-8, 5, 3},
      {6, -10, 4},
      {6, -9, 3},
      {6, -1, -5},
      {-9, 5, 4},
      {-2, -1, 3}};

  public static void main(String[] args) {
    System.out.println(isEqual(zeroSumTriples(new int[] { 7, 10, 2, -4, -7, 9, -6, -8, 8, 6, -10, -9, 5, 4, -2, -1, -5, 3})));
  }

  private static Set<int[]> zeroSumTriples(int[] data) {
    Set<int[]> triples = new LinkedHashSet<>();
    for (int i = 0; i < data.length - 2; i++) {
      for (int j = i + 1; j < data.length - 1; j++) {
        for (int k = j + 1; k < data.length; k++) {
          if (data[i] + data[j] + data[k] == 0) {
            triples.add(new int[] {data[i], data[j], data[k]});
          }
        }
      }
    }
    return triples;
  }

  private static boolean isEqual(Set<int[]> set) {
    boolean equal = false;
    int i = 0;
    for (int[] triples: set) {
      equal = Arrays.equals(values[i++], triples);
    }
    return equal;
  }
}

