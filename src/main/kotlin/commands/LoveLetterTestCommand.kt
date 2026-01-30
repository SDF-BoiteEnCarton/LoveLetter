package io.boiteencarton.loveletter.commands

import com.hypixel.hytale.server.core.Message
import com.hypixel.hytale.server.core.command.system.AbstractCommand
import com.hypixel.hytale.server.core.command.system.CommandContext
import java.util.concurrent.CompletableFuture

class LoveLetterTestCommand(name: String, description: String) : AbstractCommand(name, description) {
    override fun execute(context: CommandContext): CompletableFuture<Void>? {
        context.sendMessage(Message.raw("LoveLetter is up"))
        return CompletableFuture.completedFuture(null)
    }
}