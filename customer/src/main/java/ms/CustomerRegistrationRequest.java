package ms;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
