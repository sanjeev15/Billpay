package com.yesbank.fbapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BillDetailsDAO {

	static int count=0;
	static HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

	static HashMap<Integer,Integer> billList=new HashMap<Integer,Integer>();
	public static Integer getDetail(Integer id) {
		 hm.put(1,1000);
		 hm.put(2,1000);
		 hm.put(3,1000);
		 hm.put(4,1000);
		return hm.get(id);
	}

	public static void payBill() {
		
		count++;
		//System.out.println(count);
	}

	

	public static Integer billList() {
		billList.put(1,1000);
		billList.put(2,2000);
		billList.put(3,1000);
		billList.put(4,1000);
		return billList.get(2);
	}

	
	  
	
}
