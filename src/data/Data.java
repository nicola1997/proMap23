package data;


class Data {
// Le visibilità di classi , attributi e metodi devono essere decise dagli studenti	
	Object data [][];
	int numberOfExamples;
	Attribute attributeSet[];
	
	
	Data(){
		
		//data
		
		data = new Object [14][5];

		data[0][0]=new String ("sunny");
		data[1][0]=new String ("sunny");
		data[2][0]=new String ("sunny");
		data[3][0]=new String ("rain");
		data[4][0]=new String ("rain");
		data[5][0]=new String ("rain");
		data[6][0]=new String ("rain");
		data[7][0]=new String ("rain");
		data[8][0]=new String ("rain");
		data[9][0]=new String ("rain");
		data[10][0]=new String ("overcast");
		data[11][0]=new String ("overcast");
		data[12][0]=new String ("overcast");
		data[13][0]=new String ("overcast");
		
		data[0][1]=new String ("hot");
		data[1][1]=new String ("hot");
		data[2][1]=new String ("hot");
		data[3][1]=new String ("mild");
		data[4][1]=new String ("mild");
		data[5][1]=new String ("mild");
		data[6][1]=new String ("mild");
		data[7][1]=new String ("mild");
		data[8][1]=new String ("mild");
		data[9][1]=new String ("mild");
		data[10][1]=new String ("cold");
		data[11][1]=new String ("cold");
		data[12][1]=new String ("cold");
		data[13][1]=new String ("cold");
		
		data[0][2]=new String ("high");
		data[1][2]=new String ("high");
		data[2][2]=new String ("high");
		data[3][2]=new String ("normal");
		data[4][2]=new String ("normal");
		data[5][2]=new String ("normal");
		data[6][2]=new String ("normal");
		data[7][2]=new String ("normal");
		data[8][2]=new String ("normal");
		data[9][2]=new String ("normal");
		data[10][2]=new String ("high");
		data[11][2]=new String ("high");
		data[12][2]=new String ("high");
		data[13][2]=new String ("high");
		
		
		data[0][3]=new String ("weak");
		data[1][3]=new String ("weak");
		data[2][3]=new String ("weak");
		data[3][3]=new String ("strong");
		data[4][3]=new String ("strong");
		data[5][3]=new String ("strong");
		data[6][3]=new String ("strong");
		data[7][3]=new String ("strong");
		data[8][3]=new String ("strong");
		data[9][3]=new String ("strong");
		data[10][3]=new String ("strong");
		data[11][3]=new String ("strong");
		data[12][3]=new String ("strong");
		data[13][3]=new String ("strong");
		

		data[0][4]=new String ("no");
		data[1][4]=new String ("no");
		data[2][4]=new String ("no");
		data[3][4]=new String ("yes");
		data[4][4]=new String ("yes");
		data[5][4]=new String ("yes");
		data[6][4]=new String ("yes");
		data[7][4]=new String ("yes");
		data[8][4]=new String ("yes");
		data[9][4]=new String ("yes");
		data[10][4]=new String ("yes");
		data[11][4]=new String ("yes");
		data[12][4]=new String ("yes");
		data[13][4]=new String ("yes");
		
		
		// numberOfExamples
		
		 numberOfExamples=14;		 
		 
		
		//explanatory Set
		
		attributeSet = new Attribute[5];

		// TO DO : avvalorare ciascune elemento di attributeSet con un oggetto della classe DiscreteAttribute che modella il corrispondente attributo (e.g. outlook, temperature,etc)
		// nel seguito si fornisce l'esempio per outlook
		
		String outLookValues[]=new String[3];
		outLookValues[0]="overcast";
		outLookValues[1]="rain";
		outLookValues[2]="sunny";
		attributeSet[0] = new DiscreteAttribute("Outlook",0, outLookValues);
		
		// similmente per gli altri attributi
		
		
	}
	
	int getNumberOfExamples(){
		//TO DO
	}
	
	int getNumberOfAttributes(){
		//TO DO
	}
	
	
	
	Object getAttributeValue(int exampleIndex, int attributeIndex){
		//TO DO
	}
	
	Attribute getAttribute(int index){
		//TO DO
	}
	
	
	public String toString(){
		//TO DO
		
		
	}


	
	public static void main(String args[]){
		Data trainingSet=new Data();
		System.out.println(trainingSet);
		
		
	}

}
