package com.gpt.ticketer;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TrainTicketController {

    private final TrainTicketService service;

    public TrainTicketController(TrainTicketService service) {
        this.service = service;
    }

    @GetMapping
    public List<TrainTicket> getAllTickets() {
        return service.getAllTickets();
    }

    @GetMapping("/{id}")
    public TrainTicket getTicket(@PathVariable Long id) {
        return service.getTicket(id);
    }

    @PostMapping
    public TrainTicket saveTicket(@RequestBody TrainTicket ticket) {
        return service.saveTicket(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        service.deleteTicket(id);
    }
}
