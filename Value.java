public enum Value{
	AS(1,"1"),TWO(2,"2"),TRHEE(3,"3"),FOUR(4,"4"),FIVE(5,"5"),SIX(6,"6"),SEVEN(7,"7"),EIGHT(8,"8"),NINE(9,"9"),TEN(10,"10"),JACK(10,"J"),QUEEN(10,"Q"),KING(10,"K");
	String symbole;
	int points;
	private Value(int points,String symbole){
		this.symbole=symbole;
		this.points=points;
	}
	public String getSymbole(){
		return this.symbole;
	}
	public int getPoints(){
		return this.points;
	}
}