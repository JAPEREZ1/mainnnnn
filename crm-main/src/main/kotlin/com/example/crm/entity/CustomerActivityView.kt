package com.tu.proyecto.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Timestamp

@Entity
@Table(name = "customer_activity_view")
class CustomerActivityView {
    @Id
    var customerId: Long? = null
    var customerName: String? = null
    var customerEmail: String? = null
    var leadStatus: String? = null
    var leadSource: String? = null
    var activityDescription: String? = null
    var activityDate: Timestamp? = null
}
