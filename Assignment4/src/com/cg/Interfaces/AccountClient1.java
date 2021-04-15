package com.cg.Interfaces;

import java.util.Scanner;

public class AccountClient1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the menu 1--ATM\n 2--CDM\n 3--Admin");
		String str = sc.next();
		try
		{
			Menu menu = Menu.valueOf(str.toUpperCase());
			switch(menu)
			{
				case ATM:
					Atm atm = AccContainer.getAtm();
					atm.getBalance();
					atm.withdraw();
					break;
				case ADMIN:
					Admin admin = AccContainer.getAdmin();
					admin.clearPdc();
					break;
				case CDM:
					Cdm cdm = AccContainer.getCdm();
					cdm.deposit();
					cdm.getBalance();
					cdm.withdraw();
					
			}
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
