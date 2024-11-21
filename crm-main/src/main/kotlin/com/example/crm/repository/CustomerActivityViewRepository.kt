package com.tu.proyecto.repository

import com.tu.proyecto.entity.CustomerActivityView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerActivityViewRepository : JpaRepository<CustomerActivityView, Long>
