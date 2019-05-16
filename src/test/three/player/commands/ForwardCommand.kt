package com.fahimhossain.bongomultimedia.core.commands

import com.fahimhossain.bongomultimedia.core.actions.ForwardAction

class ForwardCommand(private val forwardAction: ForwardAction) : Command {
    override fun execute() {
        forwardAction.forward()
    }
}