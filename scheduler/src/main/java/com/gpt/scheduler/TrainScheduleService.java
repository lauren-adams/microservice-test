package com.gpt.scheduler;


import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrainScheduleService {

    private final TrainScheduleRepository repository;

    public TrainScheduleService(TrainScheduleRepository repository) {
        this.repository = repository;
    }

    public List<TrainSchedule> getAllSchedules() {
        return repository.findAll();
    }

    public TrainSchedule getSchedule(Long id) {
        return repository.findById(id).orElse(null);
    }

    public TrainSchedule saveSchedule(TrainSchedule schedule) {
        return repository.save(schedule);
    }

    public void deleteSchedule(Long id) {
        repository.deleteById(id);
    }
}
