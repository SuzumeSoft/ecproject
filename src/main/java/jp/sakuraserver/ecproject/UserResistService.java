package jp.sakuraserver.ecproject;

import jp.sakuraserver.ecproject.Entity.UserEntity;
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

    public void write(){
        UserEntity entity = new UserEntity();
        entity.setId(10);
        entity.setLastName("a");
        entity.setFirstName("a");

        userRepository.saveAndFlush(entity);

    }
}
