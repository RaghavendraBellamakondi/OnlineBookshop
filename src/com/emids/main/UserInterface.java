package com.emids.main;

import java.util.Scanner;

import com.emids.services.Order;

public class UserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		OnlineBookShop shop = new OnlineBookShop();
		Order order1 = new Order();
		boolean condition = true;
		condition = HelperClass.supportingMethod(scanner, shop, order1, condition);
	}

}
