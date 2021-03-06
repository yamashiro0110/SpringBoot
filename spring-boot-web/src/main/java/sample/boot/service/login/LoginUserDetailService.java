package sample.boot.service.login;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sample.boot.domain.model.login.LoginUserDetail;
import sample.boot.domain.model.user.auth.AuthUser;
import sample.boot.domain.model.user.auth.AuthUserRepository;

import javax.annotation.Resource;

@Service
public class LoginUserDetailService implements UserDetailsService {

    @Resource
    private AuthUserRepository authUserRepository;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final AuthUser authUser = this.authUserRepository.findByMail(username);

        if (authUser == null) {
            throw new UsernameNotFoundException("存在しないUserです");
        }

        return new LoginUserDetail(authUser);
    }
}
