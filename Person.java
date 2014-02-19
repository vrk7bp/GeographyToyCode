// Venkata-Gautam Kanumuru (vrk7bp), Lab 0, Lab Section 101

/*As per the assignment, all of the methods perform the actions that they are supposed to (based on logic, no testing yet). 
 * What has to be analyzed is the specific part of the assignment asking for all the fields to be initialezed in the constructor (not exactly sure what this means)
 * and for the "equals" method to be checked with the "double else loop". Is this double loop really necessary, or can one be taken out?
 * Does this also follow the typical naming conventions?
 */

//Import of ArrayList in order to maintain the Friends List of the Person.
import java.util.ArrayList;

public class Person {

	//Two Instances that are used in the constructor
	private String Name;
	private int ProfileID;
	private ArrayList<Integer> FriendsList = new ArrayList<Integer>();

	public Person(String name, int id) {
		//All fields initialized in the constructor
		name = Name;
		id = ProfileID;
	}

	public String getName() {
		//Simply returns the name provided in the Constructor
		return Name;
	}

	public int getId() {
		//Returns the ID provided in the Constructor
		return ProfileID;
	}

	public ArrayList<Integer> getFriends() {
		//Returns the Array List
		return FriendsList;
	}

	public boolean addFriend(Person p2) {

		//This "if loop" checks to make sure that the ID is in the Array List
		if(FriendsList.contains(p2.getId()))
		{
			//If the ID is in the Array List, the method returns false...
			return false;
		}
		else
		{
			//Otherwise, the method adds the ID to the Array List and returns true.
			FriendsList.add(p2.getId());
			return true;
		}
	}

	public boolean isFriend(Person p2) {

		//This "if loop" checks to make sure that the ID is in the Array List
		if(FriendsList.contains(p2.getId()))
		{
			//If the ID is in the Array List, the method returns true.
			return true;
		}
		else
			//Otherwise, the method will return false.
			return false;
	}

	public boolean deleteFriend(Person p2) {

		//This integer is defined for convenience, so that the code is concise and avoids constant accessing methods
		int ReferencedID = p2.getId();

		//Checks if the ArrayList has the ID of the p2 Constructor
		if(FriendsList.contains(ReferencedID))
		{
			//If found, the method finds the particular index (place) of the ID and removes it. Then it returns true.
			FriendsList.remove(FriendsList.indexOf(ReferencedID));
			return true;
		}
		else
			//Otherwise, it returns false.
			return false;
	}

	public int numFriends() {
		//Just returns the size of the ArrayList. Since the ArrayList automatically adjusts in size, this number represents the number of friends.
		return FriendsList.size();
	}

	public boolean equals(Object o) {
		//First checks if the object provided by the method is a person
		if(o.getClass().equals(this))
		{
			//If it is, the Object provided is caste as a Person Class so that the methods of the Person class can be used
			Person PlaceHolder = (Person) o;

			//Then the ID of the Object is checked with the ID of this Person Class
			if(PlaceHolder.getId() == this.getId())
				//If they match, then the method returns true
				return true;
			else
				//Otherwise, the method returns false.
				return false;
		}
		else
			return false;
	}

	public String toString() {
		//In order to put all of the Friend's IDs into one return statement, this String is used as a "Placeholder"
		String FriendIDs = "";

		//This "for loop" obtains all of the IDs in the FriendList Array and puts them into one String
		for (int size = 0; size<FriendsList.size(); size++)
		{
			FriendIDs = FriendIDs + "\n" + FriendsList.get(size);
		}

		//Then the Name of this Person, the ID of this Person, and its Friends List are returned.
		return "Name: " + this.Name + "\n" + "ID: " + this.ProfileID + "\n" + "Friend's IDs:" + FriendIDs;
	}

}
