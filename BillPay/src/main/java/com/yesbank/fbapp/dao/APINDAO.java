package com.yesbank.fbapp.dao;

import java.util.ArrayList;
import java.util.List;

public class APINDAO {

	private static List<String> apinlist = new ArrayList<String>();

	public static void create(String newapin) {
		apinlist.add(newapin);
	}

	public static boolean verify(String apin) {
		return apinlist.contains(apin);
	}
}
