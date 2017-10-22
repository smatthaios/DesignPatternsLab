package gr.regenerationcodingschool.patterns.command;

//Invoker
public class Switch {
	public void storeAndExecute(Command command) {
		command.execute();
	}
}
