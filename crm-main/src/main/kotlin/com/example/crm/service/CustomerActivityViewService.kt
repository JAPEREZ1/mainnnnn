package com.tu.proyecto.service

import com.tu.proyecto.entity.CustomerActivityView
import com.tu.proyecto.repository.CustomerActivityViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerActivityViewService {
    @Autowired
    lateinit var customerActivityViewRepository: CustomerActivityViewRepository

    fun getAllActivities(): List<CustomerActivityView> {
        return customerActivityViewRepository.findAll()
    }
}
