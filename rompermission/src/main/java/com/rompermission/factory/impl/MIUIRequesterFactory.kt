package com.rompermission.factory.impl

import com.rompermission.factory.RomRequesterFactory
import com.rompermission.requester.impl.DefaultRequester
import com.rompermission.requester.impl.miui.MIUI5Requester
import com.rompermission.requester.impl.miui.MIUI6Requester
import com.rompermission.requester.impl.miui.MIUI7Requester
import com.rompermission.requester.impl.miui.MIUI8Requester

class MIUIRequesterFactory : RomRequesterFactory() {
    override fun getRequester(romVersion: String): DefaultRequester {
        return if (isBetween("V8", "V10", romVersion)) {
            MIUI8Requester()
        } else if (isBetween("V7", "V8", romVersion)) {
            MIUI7Requester()
        } else if (isBetween("V6", "V7", romVersion)) {
            MIUI6Requester()
        } else if (isBetween("V5", "V6", romVersion)) {
            MIUI5Requester()
        } else {
            DefaultRequester()
        }
    }
}
