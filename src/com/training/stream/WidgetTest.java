package com.training.stream;

import java.util.ArrayList;
import java.util.List;

public class WidgetTest {

	public static void main(String[] args) {

		Widget widget1 = new Widget("yellow", 100);
		Widget widget2 = new Widget("blue", 200);
		Widget widget3 = new Widget("red", 300);
		Widget widget4 = new Widget("red", 400);
		Widget widget5 = new Widget("yellow", 100);

		List<Widget> widgets = new ArrayList<>();
		widgets.add(widget1);
		widgets.add(widget2);
		widgets.add(widget3);
		widgets.add(widget4);
		widgets.add(widget5);

		int sum1 = 0;
		// Prior to Java 8
		for (Widget w : widgets) {
			if (w.getColor() == "red") {
				sum1 += w.getWeight();
			}
		}
		System.out.println("Prior to Java 8 Sum is " + sum1);
		// In Java 8
		int sum2 = widgets.stream()
			.filter(w->w.getColor()=="red")
			.mapToInt(w -> w.getWeight())
			.sum();
		System.out.println("In Java Sum is " + sum2);
	}

}
