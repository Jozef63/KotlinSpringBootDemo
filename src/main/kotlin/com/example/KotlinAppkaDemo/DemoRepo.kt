package com.example.KotlinAppkaDemo

import org.springframework.data.repository.CrudRepository
import com.example.KotlinAppkaDemo.model.Skusobna_tabulka

interface DemoRepo : CrudRepository<Skusobna_tabulka, Int> {
}