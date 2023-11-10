package yes.no.spaceempires.security;

import org.springframework.security.core.GrantedAuthority;

public enum Authority implements GrantedAuthority {
    USER,
    ADMIN;

    @Override
    public String toString() {
        return "SCOPE_" + name();
    }

    @Override
    public String getAuthority() {
        return name();
    }
}
