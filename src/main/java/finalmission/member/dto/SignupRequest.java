package finalmission.member.dto;

public record SignupRequest(
        String name,
        String email,
        String password
) {
}
