package use_cases;


//imports do package business

import business.*; 

/**
* @author Andre Ramos, 53299
* 
*/
public class HandlerJoinTheGroup {
	
	// ...
	public  HandlerJoinTheGroup() {
		
	}
	
	public void join(User user, Group group) {
		System.out.println(startVoting(group, user)); 
	}
	
	public String startVoting(Group group, User user) {
		int accepted = 0;
		int rejected = 0;
		for(Member m : group.members) {
			if (m.vote() == "ACCEPT") {
				accepted += 1;
			}else {
				rejected += 1;
			}
		}
		if (accepted > rejected) {
			group.addMember(user);
			return "Was accepted in the group";
		}else {
			return "Wasn't accepted in the group";
		}
	}
	
}
