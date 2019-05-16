package com.fahimhossain.bongomultimedia.core.commands

import com.fahimhossain.bongomultimedia.core.actions.RewindAction

class RewindCommand(private val rewindAction: RewindAction) : Command {
    override fun execute() {
        rewindAction.rewind()
    }
}