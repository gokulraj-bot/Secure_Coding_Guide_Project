import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

/**
 * Defensive teaching examples. Supply a real, trusted JDBC connection and
 * a maintained password-hashing implementation in an actual application.
 */
public class SecureCodingExamples {
    private static final Pattern AGE_PATTERN = Pattern.compile("\\d{1,3}");

    public static void findUserByEmail(Connection connection, String email) throws SQLException {
        String sql = "SELECT id, email FROM users WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);
            try (ResultSet results = statement.executeQuery()) {
                while (results.next()) {
                    System.out.println("Matched user id: " + results.getLong("id"));
                }
            }
        }
    }

    public static int validateAge(String rawAge) {
        if (rawAge == null || !AGE_PATTERN.matcher(rawAge).matches()) {
            throw new IllegalArgumentException("Age must be a whole number.");
        }
        int age = Integer.parseInt(rawAge);
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        return age;
    }

    // Authorization must be enforced server-side for every requested resource.
    public static boolean mayReadDocument(String authenticatedUserId, String ownerUserId) {
        return authenticatedUserId != null && authenticatedUserId.equals(ownerUserId);
    }

    public static void main(String[] args) {
        System.out.println("Secure coding demo — defensive examples only.");
        System.out.println("Age 20 valid: " + (validateAge("20") == 20));
        System.out.println("Age 'abc' valid: " + isValidAge("abc"));
        System.out.println("Owner can read: " + mayReadDocument("user-1", "user-1"));
        System.out.println("Other user can read: " + mayReadDocument("user-1", "user-2"));
    }

    private static boolean isValidAge(String value) {
        try { validateAge(value); return true; }
        catch (IllegalArgumentException ex) { return false; }
    }
}
