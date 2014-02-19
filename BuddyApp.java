// Venkata-Gautam Kanumuru (vrk7bp), Lab 0, Lab Section 101

//Check for null pointer exception in the attribtueId Method

import java.util.ArrayList;
import java.util.Scanner;

public class BuddyApp {

	public static void main(String[] args) {
		BuddyApp theApp = new BuddyApp();
		theApp.start();
	}

	private ArrayList<Person> allPersons = new ArrayList<Person>();
	private Person p1;

	public void start() {
		// STUDENTS: add code here to do testing, create a program for an
		// end-user,
		// whatever helps you create and debug your classes.
	}

	public ArrayList<Person> getFriends() {
		return allPersons;
	}

	public boolean addPerson(Person p) {
		if (allPersons.contains(p)) {
			return false;
		} else {
			allPersons.add(p);
			return true;
		}
	}

	public boolean addPerson(String name, int id) {
		if (allPersons.contains(id)) {
			return false;
		} else {
			p1 = new Person(name, id);
			allPersons.add(p1);
			return true;
		}
	}
	
	public boolean linkFriends(Person p1, Person p2) {
		if(!this.checkIfFriends(p1, p2)){
			p1.addFriend(p2);
			p2.addFriend(p1);
		}
		return !this.checkIfFriends(p1, p2);
	}
	
	public boolean linkFriends(int id1, int id2) {
		Person p1 = this.attributeId(id1);
		Person p2 = this.attributeId(id2);
		if(!this.checkIfFriendsIds(id1, id2)){
			p1.addFriend(p2);
			p2.addFriend(p1);
		}
		return !this.checkIfFriendsIds(id1, id2);
	}

	public boolean unlinkFriends(Person p1, Person p2) {
		if(this.checkIfFriends(p1, p2)){
			if(p1.isFriend(p2)){
				p1.deleteFriend(p2);
			}
			if(p2.isFriend(p1)){
				p2.deleteFriend(p1);
			}
		}
		return this.checkIfFriends(p1, p2);
	}

	public boolean unlinkFriends(int id1, int id2) {
		Person p1 = this.attributeId(id1);
		Person p2 = this.attributeId(id2);
		if(this.checkIfFriendsIds(id1, id2)){
			if(p1.isFriend(p2)){
				p1.deleteFriend(p2);
			}
			if(p2.isFriend(p1)){
				p2.deleteFriend(p1);
			}
		}
		return this.checkIfFriendsIds(id1, id2);
	}

	public boolean deletePerson(Person p) {
		if(allPersons.contains(p)){
			this.removePerson(p);
			return true;
		}
		else
			return false;
	}

	public boolean deletePerson(int id) {
		Person p1 = this.attributeId(id);
		if(allPersons.contains(p1)){
			this.removePerson(p1);
			return true;
		}
		else
			return false;
	}

	public ArrayList<Person> getAllPersons() {
		return allPersons;
	}

	/*
	 * From a data file creates Person objects and friends.
	 * 
	 * The filename passed to this is a file with a set of four-line entries.
	 * The 4th line is always blank. If the first line is "person", then the 2nd
	 * line is the person's name, and the 3rd line is their ID. A new Person
	 * object is created and stored in the allPersons list. If the first line is
	 * "friends", then the 2nd and 3rd lines are two ID values, and this makes
	 * the two Person objects with those IDs become friends with each other.
	 * This method returns false if the file cannot be opened or if there is a
	 * bad command name.
	 */
	public boolean loadBuddyData(String filename) {
		Scanner scanr = null;
		// STUDENTS: add code here. Like you did in Lab 1, you must open a file
		// and associate it with the Scanner variable defined above so you can
		// read data from the scanner.

		String command, line;

		// data guaranteed to always be in groups of 4 lines
		while (scanr.hasNext()) {
			line = scanr.nextLine();
			// remove any leading and trailing blanks and make lower-case
			command = line.trim().toLowerCase();

			// read data to create a new Person
			if (command.equals("person")) {
				String name = scanr.nextLine();
				line = scanr.nextLine();
				int id = Integer.parseInt(line);
				// now do what you need to do with the name and id
				// STUDENTS: add code here
			}

			// read data to establish a friendship
			else if (command.equals("friends")) {
				line = scanr.nextLine();
				int id1 = Integer.parseInt(line);
				line = scanr.nextLine();
				int id2 = Integer.parseInt(line);
				// now do what you need to do using the two id values
				// STUDENTS: add code here
			}

			// data error -- bad file format
			else {
				System.err
						.println("* Error: bad data file format. Unrecognized command: "
								+ command);
				return false;

			}
			String blankLine = scanr.nextLine(); // skip blank line
		}

		return true;
	}
	
//*************************************************************************************************************************************************************STUDENT ADDED METHODS

	public boolean checkIfFriends(Person p1, Person p2){
		if (p1.isFriend(p2) || p2.isFriend(p1)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Person attributeId(int id1){
		Person p1 = new Person("", -1);
		for(int x = 0; x<allPersons.size(); x++){
			if(allPersons.get(x).getId() == id1){
				p1 = allPersons.get(x);
			}
		}
		return p1;
	}
	
	public boolean checkIfFriendsIds(int id1, int id2){
		Person p1 = this.attributeId(id1);
		Person p2 = this.attributeId(id2);
		if(p1.isFriend(p2) || p2.isFriend(p1)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void removePerson(Person p1){
		allPersons.remove(p1);
		for(int x = 0; x<allPersons.size(); x++){
			Person p2 = allPersons.get(x);
			if(p2.isFriend(p1)){
				p2.deleteFriend(p1);
			}
		}
	}
}