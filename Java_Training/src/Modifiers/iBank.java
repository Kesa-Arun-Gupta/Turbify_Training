package Modifiers;


public interface iBank {
	
		public int depositmoney(int cash);

		public String customerinfo(String name);

		public long balancecheck(int accountno);

		public long updatebalance(int accountno,int cash);	

		public long displaybankinfo();



}


