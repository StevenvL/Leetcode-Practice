
public class DeFangingAddress {
	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}

	public String defanIpAddr2(String address) {
		StringBuilder s = new StringBuilder("");
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.')
				s.append("[.]");
			else
				s.append(address.charAt(i));
		}
		return s.toString();
	}
}
