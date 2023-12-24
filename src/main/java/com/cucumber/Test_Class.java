package com.cucumber;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test_Class {

	public static void main(String[] args) {
		statPattern_LeftTrangle(5);
		System.out.println();
		statPattern3_Piramid_Ulta(5);
		starpattern4pyramid();
		starpattern4Trangle();
	}

	static void statPattern_LeftTrangle(int n) {
		for (int row = 1; row <= n; row++) {
			// System.out.print("1");
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void statPattern_2_Ulta_leftTrangle(int N) {
		for (int row = 1; row <= N; row++) {
			// System.out.print("1");
			for (int col = N; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void statPattern3_Piramid_Ulta(int n) {

		for (int i = 0; i < 5; i++) {
			// Print spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// Print asterisks
			for (int j = i; j < 5; j++) {
				System.out.print("o ");
			}
			System.out.println();
		}
	}

	static void starpattern4pyramid() {

		for (int i = 0; i < 5; i++) {
			// Print spaces
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			// Print asterisks
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void starpattern4Trangle() {

		for (int i = 0; i < 5; i++) {
			// Print spaces
			for (int j = 1; j < 5- i; j++) {
				System.out.print(" ");
			}
			// Print asterisks
			for (int k = 0; k < 2*i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}