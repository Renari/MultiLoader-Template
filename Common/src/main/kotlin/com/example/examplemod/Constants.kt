package com.example.examplemod

import org.apache.logging.log4j.LogManager

class Constants {
    companion object {
        const val MOD_ID = "examplemod"
        const val MOD_NAME = "Example Mod"
        val LOG = LogManager.getLogger(MOD_NAME)
    }
}