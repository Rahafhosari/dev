
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * test
 */
public class test {

    public static void main(String[] args) {
        String[] selectedUserRoles = { "Everybody", "INV_PENNY_HU_IT" };
		Pattern regexPat = Pattern.compile("(?<=INV_PENNY_HU_)[A-Z]*");

		List<String> listOfRoles = new ArrayList<>();
		for (String role : selectedUserRoles) {
			Matcher match = regexPat.matcher(role);
			if (match.find()) {
				listOfRoles.add(match.group(0));
			}
		}
		System.out.println(listOfRoles); // [IT]
    }
}