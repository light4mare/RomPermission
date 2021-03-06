package com.rompermission.factory.impl

import com.rompermission.factory.RomRequesterFactory
import com.rompermission.requester.impl.DefaultRequester
import com.rompermission.requester.impl.vivo.VIVO4Requester

class VIVORequesterFactory : RomRequesterFactory() {
    override fun getRequester(romVersion: String): DefaultRequester {
        return if (isBetween("4.0", "5.0", romVersion)) {
            VIVO4Requester()
        } else {
            DefaultRequester()
        }
    }
}
