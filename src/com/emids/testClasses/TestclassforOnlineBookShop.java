package com.emids.testClasses;

import java.util.Scanner;

import org.junit.Test;

import com.emids.main.HelperClass;
import com.emids.main.OnlineBookShop;
import com.emids.services.Order;

public class TestclassforOnlineBookShop {

	@Test
	public final void whenshowallThenitmustshowtheInventory() {

		OnlineBookShop shop = new OnlineBookShop();
		Scanner scanner = new Scanner(System.in);
		boolean condition = true;
		Order order1 = new Order();
		HelperClass.supportingMethod(scanner, shop, order1, condition);
	}

}
