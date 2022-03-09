package clean.code.houseutils.service;

import clean.code.houseutils.exception.ErrorCode;
import clean.code.houseutils.exception.HouseUtilsException;
import clean.code.houseutils.repository.ApartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApartmentService {
    private final
    ApartmentRepository apartmentRepository;

    public Long getPrice(Long apartmentId) {
        return apartmentRepository.findById(apartmentId)
                .orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND))
                .getPrice();
    }

    public Long postApartment(){
        String result =  apartmentRepository.findById(apartmentId)
                .orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND))
        if(!result){
            throw new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND);
        }
    }
}
