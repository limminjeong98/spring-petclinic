package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment {

	Payment cash = new CashPerf();

	@Override
	public void pay(int amount) {
		if (amount > 100) {
			System.out.println(amount + "์ ์ฉ ์นด๋");
		} else {
			cash.pay(amount);
		}
	}
}
