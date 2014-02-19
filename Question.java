//Class for each individual question. Have to have a print statement, a true or false statement, difficulty statement, etc.


public class Question {
	
	//Fields for the Question Class
	public String RFIDTag;
	public boolean Result = false;
	public boolean QuestionFinished = false;
	public String Statement;
	public int DiffLevel;
	public int PointValue;
	public int PlaceHolder = 0;
	public String Continent;
	
	//The Question Constructor
	public Question(String Segment, String RFID, int Level, int Point, String Contin){
		RFIDTag = RFID;
		Statement = Segment;
		DiffLevel = Level;
		PointValue = Point;
		Continent = Contin;
	}
	
//*************************************************************************************************************************************************
	//The Getter and Setter Methods
	public String getContinent() {		//Get RFID Tag
		return Continent;
	}
	public String getRFIDTag() {		//Get RFID Tag
		return RFIDTag;
	}

	public void setRFIDTag(String rFIDTag) {		//Set RFID Tag
		RFIDTag = rFIDTag;
	}

	public boolean isResult() {		//Get Boolean
		return Result;
	}

	public void setResult(boolean result) {		//Set Boolean
		Result = result;
	}
	
	public boolean isQuestionFinished() {		//Get Boolean
		return QuestionFinished;
	}

	public void setQuestionFinished(boolean result) {		//Set Boolean
		QuestionFinished = result;
	}

	public String getStatement() {		//Get Statement for the Question
		return Statement;
	}

	public void setStatement(String statement) {		//Set the Questions
		Statement = statement;
	}

	public int getDiffLevel() {		//Get the Difficulty Level
		return DiffLevel;
	}

	public void setDiffLevel(int diffLevel) {		//Set the Difficulty Level
		DiffLevel = diffLevel;
	}

	public int getPointValue() {		//Get the Point Value
		return PointValue;
	}

	public void setPointValue(int pointValue) {		//Set the Point Value
		PointValue = pointValue;
	}
	
	public int getPlaceHolder() {		//Get the Difficulty Level
		return PlaceHolder;
	}

	public void setPlaceHolder(int Hold) {		//Set the Difficulty Level
		PlaceHolder = Hold;
	}

//*************************************************************************************************************************************************
	public boolean isAnswerRight(){			//Method to return whether the answer is right or not
		boolean RightOrWrong = false;		// I didn't really use this, but may come and play a role later
		if(Result == false){
			RightOrWrong = false;
		}
		else if (Result == true){
			RightOrWrong = true;
		}
		return RightOrWrong;
	}
	
	public boolean checkResult(String s){
		if(RFIDTag.equals(s)){
			Result = true;
		}
		else if (!RFIDTag.equals(s)){
			Result = false;
		}
		return Result;
	}
	
	public void display(){		//More just for convenience so that we have to type less code.
		System.out.println(Statement);
	}
		
	

}
