package com.rekeningrijden.simulation

import com.rekeningrijden.simulation.services.CarService
import com.rekeningrijden.simulation.services.MessageService
import com.rekeningrijden.simulation.services.RouteService
import com.rekeningrijden.simulation.services.SimulationService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SimulationApplication {
    @Bean
    fun start(carService: CarService, messageService: MessageService, simulationService: SimulationService, routeService: RouteService) = CommandLineRunner {
        messageService.initialize()
        simulationService.initialize()

        simulationService.startSimulation()
    }
}

fun main(args: Array<String>) {
    runApplication<SimulationApplication>(*args)
}
