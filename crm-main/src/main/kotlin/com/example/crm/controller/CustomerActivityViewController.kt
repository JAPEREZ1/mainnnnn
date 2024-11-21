package com.tu.proyecto.controller

import com.tu.proyecto.entity.CustomerActivityView
import com.tu.proyecto.service.CustomerActivityViewService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer-activities")
class CustomerActivityViewController {
    @Autowired
    lateinit var customerActivityViewService: CustomerActivityViewService

    @GetMapping
    fun getAllActivities(): List<CustomerActivityView> {
        return customerActivityViewService.getAllActivities()
    }
}
