package top.wisely.authserver.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import top.wisely.authserver.domain.model.SysUser;
import top.wisely.authserver.repository.SysUserRepository;

import java.util.Optional;

public class CusotmUserDetailsService implements UserDetailsService {

    SysUserRepository sysUserRepository;

    public CusotmUserDetailsService(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<SysUser> sysUserOptional = sysUserRepository.findByUsername(username);
        return  sysUserOptional
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
    }
}

