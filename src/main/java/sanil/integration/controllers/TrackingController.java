package sanil.integration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sanil.integration.dto.ShipmentDataDto;
import sanil.integration.services.TrackingService;

@RestController
@RequestMapping("/track")
public class TrackingController {

    @Autowired
    private TrackingService trackingService;

    @GetMapping("/")
    public ShipmentDataDto GetTrackingDetails(@RequestParam String waybill) throws Exception {
        return trackingService.GetTrackingDetails(waybill);
    }
}
