package com.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Wazid Ullah Murad on 5/29/2020.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
