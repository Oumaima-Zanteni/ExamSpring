package com.example.oumaimazanteniexblanc.Schedulars;

import com.example.oumaimazanteniexblanc.Service.IExamenService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class schedular {
    IExamenService iExamenService;

   /* @Scheduled(fixedRate = 60000)
    public void method(){
        iExamenService.annulerReservation();
    }*/
}
