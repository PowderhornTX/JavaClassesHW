public class State {

	private String name;
	private String founded;
	private String capital;
	private String nickname;
	
	public State() {}
	
	public State(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}
	
	public State(String name, String founded, String capital, String nickname) {
		this.name = name;
		this.founded = founded;
		this.capital = capital;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getDetails() {
		return capital + " is the capital of " + name + ". Founded in " + founded + ", it is known as \"" + nickname + ".\"";
	}
	
	public static boolean foundedSameYear(State s1, State s2) {
		return s1.founded.equals(s2.founded);
	}
	
}
