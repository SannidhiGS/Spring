package com.xworkz.beauty.service;

import com.xworkz.beauty.dto.BeautyDTO;
import org.springframework.stereotype.Component;

public interface BeautyService {
    boolean validAndSave(BeautyDTO beautyDTO);
}
