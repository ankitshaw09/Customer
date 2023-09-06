package sunbasedata.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import sunbasedata.demo.model.user;
import sunbasedata.demo.repository.UserRepository;
@Service
public class userServiceImpl implements userService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public user createUser(user ur) throws Exception {
        user local = this.userRepo.findByUserName(ur.getUserName());
        if (local != null) {
            throw new Exception("user already exists");
        } else {
            local = this.userRepo.save(ur);
        }
        return local;
    }

}
