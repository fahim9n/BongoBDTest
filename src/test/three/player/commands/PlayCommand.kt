package com.fahimhossain.bongomultimedia.core.commands

import com.fahimhossain.bongomultimedia.core.actions.PlayAction

class PlayCommand(private val playAction: PlayAction) : Command {

    override fun execute() {
        playAction.play()
    }
}