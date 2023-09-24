import fr.emile.laze.entity.Address;
import fr.emile.laze.entity.User;
import fr.emile.laze.utils.Utils;
public class Laze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User myUser = new User("hilaire", "DURAND", Utils.string2Date("20/12/1999", "dd/MM/yyyy"));
		Address myAddress = new Address("10 ter", "allée Paul Adam", "etercy", "12314");
		
	}

}
