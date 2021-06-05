package com.moviles.daggercar

import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car;
}