package com.sapient.client;

import com.sapient.beans.mTable;

public class ClientA {
  public static void main(String[] args){
	  mTable tbl =new mTable();
	  try {
		  tbl.setNum(5);
		  tbl.display(7);
		  }
	  catch (Exception e){
		  System.out.println(e.getMessage());
		  
		  
		  
	  }
	  
	  
	  
	  
  }
}
