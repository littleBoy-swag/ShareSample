package cn.nqy.share.qq

import cn.nqy.share.IShareStrategy
import cn.nqy.share.share_type.ShareImageType

class QQShare(private val config: QQShareConfig) : IShareStrategy {
    override fun share() {
        config.listener.onShareStart()
        if (config.shareType is ShareImageType) {
            (config.shareType as ShareImageType).let {
                println("current share type is ShareImageType. link is ${it.link}, appLogo is ${it.appLogo}")
                config.listener.onShareSuccess()
            }
        } else {
            config.listener.onShareError("不支持的分享类型")
        }
    }
}