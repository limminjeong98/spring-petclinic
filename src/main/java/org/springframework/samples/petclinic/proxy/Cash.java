package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class Cash implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println(amount + "현금 결제");
	}
}
