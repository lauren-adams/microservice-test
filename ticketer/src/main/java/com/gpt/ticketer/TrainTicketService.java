package com.gpt.ticketer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainTicketService {

    private final TrainTicketRepository repository;

    public TrainTicketService(TrainTicketRepository repository) {
        this.repository = repository;
    }

    public List<TrainTicket> getAllTickets() {
        return repository.findAll();
    }

    public TrainTicket getTicket(Long id) {
        return repository.findById(id).orElse(null);
    }

    public TrainTicket saveTicket(TrainTicket ticket) {
        return repository.save(ticket);
    }

    public void deleteTicket(Long id) {
        repository.deleteById(id);
    }
}
