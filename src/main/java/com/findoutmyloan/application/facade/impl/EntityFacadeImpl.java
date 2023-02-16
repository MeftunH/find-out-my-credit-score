package com.findoutmyloan.application.facade.impl;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.findoutmyloan.application.collateral.dto.CollateralSaveRequestDTO;
import com.findoutmyloan.application.collateral.service.CollateralService;
import com.findoutmyloan.application.facade.EntityFacade;
import com.findoutmyloan.application.surety.dto.SuretySaveRequestDTO;
import com.findoutmyloan.application.surety.service.SuretyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class EntityFacadeImpl implements EntityFacade {
    private final SuretyService suretyService;
    private final CollateralService collateralService;

    @Override
    public void saveEntity(SuretySaveRequestDTO suretySaveRequestDTO, CollateralSaveRequestDTO collateralSaveRequestDTO) {
        if (suretySaveRequestDTO.getSuretyType()!=null) {
            suretyService.saveSurety(suretySaveRequestDTO);
        }

        if (collateralSaveRequestDTO!=null) {
            collateralService.saveCollateral(collateralSaveRequestDTO);
        }
    }
}
