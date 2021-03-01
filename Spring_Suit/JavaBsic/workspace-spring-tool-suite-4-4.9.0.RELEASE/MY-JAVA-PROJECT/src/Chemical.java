
class Chemical {
	
	int ano;
	String symbolname ,Fullname;
	static boolean[] alkmetal=new boolean[120];
	static {
		alkmetal[3]=true;
		alkmetal[11]=true;
		
		alkmetal[19]=true;
		alkmetal[37]=true;
		
		alkmetal[55]=true;
		
		alkmetal[87]=true;
		
	}
	Chemical(int ano, String symbolname, String Fullname){
		this.ano=ano;
		this.symbolname=symbolname;
		this.Fullname=Fullname;
		
	}
	//instance methods make use of instance variables so no need to pass
	public boolean isAlkali() {
		// 3 11 19 37 55 87 as indexes
		
		
		return alkmetal[ano];//true if ano matches
		
		
		
		   
		 
	}
	public boolean isTransition() {
		// range 21-31, 39-48 and so on
		
		return (ano>=21 && ano<=31 || ano>=39 && ano<=48 || ano>=72 && ano<=80
				|| ano>=104 && ano<=112);
		
		
	 
		
	}

	public boolean isMetal() {
		 switch(ano) {
		 case 13:
		 case 49:
		 case 50:
		 case 81:
		 case 83:
		 case 82:
		 case 113:
		 case 114:
		 case 116:
			 return true;
			 
		default:
				return false;
			 
		 }
	}
	
	public boolean equals(Object o) {
		Chemical other=(Chemical) o;
		if(this.ano==other.ano) {
			return true;
		}
		else {
			return false;
		}
	}//return this.ano==other.ano(shorthand)
	 

}
