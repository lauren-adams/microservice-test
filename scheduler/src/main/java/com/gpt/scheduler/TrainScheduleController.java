package com.gpt.scheduler;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class TrainScheduleController {

    private final TrainScheduleService service;

    public TrainScheduleController(TrainScheduleService service) {
        this.service = service;
    }

    @GetMapping
    public List<TrainSchedule> getAllSchedules() {
        return service.getAllSchedules();
    }

    @GetMapping("/{id}")
    public TrainSchedule getSchedule(@PathVariable Long id) {
        return service.getSchedule(id);
    }

    @PostMapping
    public TrainSchedule saveSchedule(@RequestBody TrainSchedule schedule) {
        return service.saveSchedule(schedule);
    }

    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        service.deleteSchedule(id);
    }
}
