package com.example.KotlinAppkaDemo.model

import lombok.Data
import java.util.Date
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Skusobna_tabulka (@Id var id_p : Int, var id_po : Int, var nazov : String, var pridane : Date)