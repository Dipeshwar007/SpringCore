package com.springcore.springExpLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+12}")
	private int x;
	@Value("#{8>12?32:12}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(143)}")
	private double rootOf;

	public double getRootOf() {
		return rootOf;
	}

	public void setRootOf(double rootOf) {
		this.rootOf = rootOf;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", rootOf=" + rootOf + "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
