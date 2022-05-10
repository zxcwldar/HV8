package com.example.kotlin2lesson6.base

interface BaseDiffModel {
    val id: String
    override fun equals(other: Any?): Boolean
}