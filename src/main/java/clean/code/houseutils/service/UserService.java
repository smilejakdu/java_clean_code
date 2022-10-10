package clean.code.houseutils.service;

import clean.code.houseutils.entity.User;
import clean.code.houseutils.exception.ErrorCode;
import clean.code.houseutils.exception.HouseUtilsException;
import clean.code.houseutils.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUser(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND));
    }

}
