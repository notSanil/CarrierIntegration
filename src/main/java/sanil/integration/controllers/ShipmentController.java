package sanil.integration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sanil.integration.dto.CreateShipmentDto;
import sanil.integration.dto.CreateShipmentRequestDto;
import sanil.integration.dto.UpdateShipmentRequestDto;
import sanil.integration.services.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @PostMapping("/create")
    public CreateShipmentDto CreateShipment(@RequestBody CreateShipmentRequestDto createShipmentRequestDto) throws Exception {
        return shipmentService.CreateShipment(createShipmentRequestDto);
    }

    @PutMapping("/update")
    public String UpdateShipment(@RequestBody UpdateShipmentRequestDto updateShipmentRequestDto) throws Exception {
        return shipmentService.UpdateShipment(updateShipmentRequestDto);
    }

    @DeleteMapping("/")
    public String DeleteShipment(@RequestParam String waybill) throws Exception {
        return shipmentService.DeleteShipment(waybill);
    }
}
