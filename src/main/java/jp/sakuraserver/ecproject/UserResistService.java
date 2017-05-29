package jp.sakuraserver.ecproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserResistService {

    @Autowired
    private IUserRepository userRepository;

    public String test(){
        long count = userRepository.count();
        return String.valueOf(count);
    }
}
