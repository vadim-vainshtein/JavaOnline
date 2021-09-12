package algorithmization.sorting.task07;

import java.lang.Math;
import algorithmization.Util;

public class Fraction {
	/**
	 * Класс, описывающий дроби вида p/q, p и q - целые
	 */
	 
	 private final int MAX_VALUE = 10;
	 
	 private int numerator, denominator;
	 
	 public Fraction() {
	 	/**
	 	 * Конструктор по умолчанию инициализирует дробь случайным числом
	 	 */
	 	 
	 	this.numerator = (int)(Math.random() * MAX_VALUE);
		// Denominator should be greater than 0, so +1
	 	this.denominator = (int)(Math.random() * (MAX_VALUE - 1)) + 1;
	 }
	 
	 public Fraction(int numerator, int denominator) {
	 	this.numerator = numerator;
	 	this.denominator = denominator;
	 }
	 
	 public int getNumerator() {
	 	return numerator;
	 }
	 
	 public int getDenominator() {
	 	return denominator;
	 }
	 
	 public void setNumerator(int numerator) {
		 this.numerator = numerator;
	 }
	 
	 public void setDenominator(int denominator) {
		 this.denominator = denominator;
	 }
	 
	 public void multiplyBoth(int multiplier) {
	 	/**
	 	 * Умножает числитель и знаменатель на multiplier
	 	 * Название - ?..
	 	 */
	 	 
	 	 numerator *= multiplier;
	 	 denominator *= multiplier;
	 }
	 
	 public void reduce() {
		 
		 int gcd = Util.GCD(numerator, denominator);
		 numerator /= gcd;
		 denominator /= gcd;
	 }
	 
	 public String toString() {
	 	
	 	return numerator + "/" + denominator;
	 }
}
