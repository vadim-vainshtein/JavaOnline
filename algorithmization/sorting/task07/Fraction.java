package algorithmization.sorting.task07;

import java.lang.Math;

public class Fraction {
	/**
	 * Класс, описывающий дроби вида p/q, p и q - целые
	 */
	 
	 private final int MAX_VALUE = 20;
	 
	 private int numerator, denominator;
	 
	 public Fraction() {
	 	/**
	 	 * Конструктор по умолчанию инициализирует дробь случайным числом
	 	 */
	 	 
	 	this.numerator = (int)(Math.random() * MAX_VALUE);
	 	this.denominator = (int)(Math.random() * MAX_VALUE);
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
	 
	 
	 public multiplyBoth(int multiplier) {
	 	/**
	 	 * Умножает числитель и знаменатель на multiplier
	 	 * Название - ?..
	 	 */
	 	 
	 	 numerator =* multiplier;
	 	 denominator =* multiplier;
	 }
	 
	 
	 public String toString() {
	 	
	 	return numerator + "/" + denominator;
	 }
}