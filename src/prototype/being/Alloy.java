package prototype.being;
import misc.Tools;
import prototype.core.BasicBeing;
import prototype.core.BasicRoom;
import prototype.items.Inventory;
import prototype.room.EntryRoom;
import prototype.core.PrototypeGame;

public class Alloy extends BasicBeing {

	public boolean stayPut = true;
	
	public Alloy(BasicRoom room){
		super("Alloy", "Our hero's faithful companion.", 30, room);
	}
	
	public boolean getStayPut() {
		return this.stayPut;
	}

	public void interact() {
		System.out.println("1 - Give Alloy a good head rub.");
	    System.out.println("2 - Command Alloy to attack!");
	    System.out.println("3 - Command Alloy to stick to your side.");
	    System.out.println("4 - Command Alloy to stay in this room.");
	    System.out.println();
		int choice = Tools.getWholeNumberInput();
		
		if(choice ==1) {
			
			
			//Alloy increases in health by 1
			if (this.getHealth() < 50) {
				this.changeHealth(4);
				System.out.println("");
				System.out.println("Ahhhh, he really enjoyed that. You notice he looks happier.");
			}
			
			else {
				System.out.println("");
				System.out.println("He doesn't look like he wants you to pet him anymore.");
			}
			
			PrototypeGame.transitionText();
		}
		
		else if(choice==2) {
			//this can be improved so that choice 3 doesn't display if the bug isn't present
			if(this.getLocation().getBeings().size()<3) {
				System.out.println("");
				System.out.println("Alloy looks confused. Since it's just you and him here "
						+ "who is there to attack?");
			}
			else {

				int indexOfBug = -1;
				for(int i = 0; i < this.getLocation().getBeings().size(); i++) {
					if (this.getLocation().getBeings().get(i) instanceof Bug) {
						indexOfBug = i;
					}
				}

				System.out.println("");
				System.out.println("Alloy bit the bug! After the scuffle you see bug parts on the floor.");
				this.getLocation().getBeings().get(indexOfBug).changeHealth(-20);
			}
			PrototypeGame.transitionText();
		}
		
		else if(choice==3) {
			System.out.println("");
			System.out.println("Alloy looks happy to be your companion and walk around with you.");
			stayPut = false;
			PrototypeGame.transitionText();
		}
		
		else if(choice==4) {
			System.out.println("");
			System.out.println("He appears to understand the command. He'll stay put.");
			stayPut = true;
			PrototypeGame.transitionText();
		}
	}
	
}

