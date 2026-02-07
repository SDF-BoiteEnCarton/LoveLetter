package io.boiteencarton.loveletter

import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit

class LoveLetter(init: JavaPluginInit) : JavaPlugin(init) {

    companion object {
        lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override fun setup() {}
}