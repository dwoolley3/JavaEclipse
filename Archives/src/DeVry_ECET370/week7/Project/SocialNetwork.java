package DeVry_ECET370.week7.Project;

import java.io.Serializable;
import java.util.HashMap;

/**************************************
*  Week 7-8 Course Project            *
***************************************/

/**
 * Class implementing a Social Network of Members.
 * Assumption: Full names are all unique: first + " " + last name; 
 */
public class SocialNetwork implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Member sessionUser;
	private HashMap<String, Member> users;

    public static final int SUCCESS = 1;
    public static final int NO_SUCH_USER = 2;
    public static final int WRONG_PASSWORD = 3;
    public static final int USER_ALREADY_EXISTS = 4;
       
	
    /**
     * Initializes the Social Network to empty.
     */
    public SocialNetwork()
    {
    	users = new HashMap<String, Member>(); 
	}
    
    /**
     * Check if username already exists, since user only needs to join once;
     * If first time user, then add member to the Network.
     * Name and Password are created when joining network. 
     *
     * @param username of member joining network
     * @param password of member joining network
     * @return integer indicating the status of the action of joining the network
     */
    public int joinNetwork(String username, String password)
    {
    	if (users.containsKey(username))
    		return USER_ALREADY_EXISTS;
    	
    	Member myMember = new Member(username, password);
    	users.put(username, myMember);
    	return SUCCESS;
    }
    /**
     * Enable user to login to network if the username and password
     * match an existing user and password in the users HashMap.
     * 
     * @param username of member attempting to login
     * @param password of member attempting to login
     * @return int indicating the status of logging into the network
     */
    public int login(String username, String password)
    {
    	if (users.containsKey(username))
    	{
    		Member myMember = users.get(username);
    		if (myMember.getPassword().equals(password))
    		{
    			sessionUser = myMember;
    			return SUCCESS;
    		}
    		else
    			return WRONG_PASSWORD;
    	}
    	else
    		return NO_SUCH_USER;
    }
    
    /**
     * Leave the network by removing sessionUser from users.
     */    
    public void leaveNetwork()
    {
   		users.remove(sessionUser.getName());
    }
    
    /**
     * Create a profile from the user's status.
     * 
     * @param status to place into the user's profile
     */
    public void createProfile(String status)
    {
    	sessionUser.setStatus(status);
    }
    
    /**
     * Update a profile for the user, given a status.
     * 
     * @param status to place into the user's profile
     */
    public void updateProfile(String status)
    {
    	sessionUser.setStatus(status);
    }
    
    /**
     * Find the member profile for a given user name.
     * 
     * @param name of person for which to find a member profile
     * @return member matching the person's name; null if no match
     */
    public Member findProfile(String name)
    {
    	Member memberProfile = users.get(name);    	
    	return memberProfile;
    }
    
    /**
     * Add the Member friend to Social Network, given a friend's name.
     *
     * @param name of friend to be added to the Social Network
     * @return true if friend was successfully added; false otherwise
     */
    public boolean addFriend(String name)  //Need parm
    {
    	Member friend = users.get(name);
    	if (friend != null)
    		return sessionUser.addFriend(friend);
    	return false;
    }
    
    /**
     * Remove the Member friend from Social Network, given a friend's name.
     * 
     * @param name of friend to be removed from the Social Network
     * @return true if friend was successfully removed; false otherwise
     */
    public boolean removeFriend(String name)
    {
    	Member friend = users.get(name);
    	if (friend != null)
    		return sessionUser.removeFriend(friend);
    	return false;    		
    }
}
