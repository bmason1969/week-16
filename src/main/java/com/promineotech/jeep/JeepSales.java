package com.promineotech.jeep;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class})

public class JeepSales implements CommandLineRunner{

  public static void main(String[] args) {
    SpringApplication.run(JeepSales.class, args);
    
    }

  @Override
  public void run(String... args) throws Exception {
   }
    
}

  


