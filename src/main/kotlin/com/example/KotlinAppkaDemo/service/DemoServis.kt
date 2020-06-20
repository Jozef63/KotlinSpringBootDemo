package com.example.KotlinAppkaDemo.service

import org.springframework.stereotype.Service
import org.springframework.context.annotation.Bean
import org.springframework.beans.factory.annotation.Autowired
import com.example.KotlinAppkaDemo.DemoRepo
import com.example.KotlinAppkaDemo.model.Skusobna_tabulka

@Service
class DemoServis {
	@Autowired
    private lateinit var repo: DemoRepo
	
	@Bean
	fun  vratVsetkyPortfolia() : List<Skusobna_tabulka>{
		var zoznamVsekychPortfolii : List<Skusobna_tabulka> = repo.findAll() as List<Skusobna_tabulka>
		zoznamVsekychPortfolii.forEach { println(it) }
		return zoznamVsekychPortfolii
	}
	
}