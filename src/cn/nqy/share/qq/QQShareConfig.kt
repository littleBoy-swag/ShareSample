package cn.nqy.share.qq

import cn.nqy.share.DefaultShareListener
import cn.nqy.share.IShareConfig
import cn.nqy.share.IShareListener
import cn.nqy.share.share_type.IShareType

class QQShareConfig private constructor() : IShareConfig {

    /**
     * ShareType
     */
    var shareType: IShareType? = null

    var listener: IShareListener = DefaultShareListener()

    companion object {
        fun build(): Builder {
            return Builder()
        }
    }


    class Builder {
        private var qqConfig = QQShareConfig()

        fun setShareType(shareType: IShareType): Builder {
            qqConfig.shareType = shareType
            return this
        }

        fun addShareListener(listener: IShareListener): Builder {
            qqConfig.listener = listener
            return this
        }

        fun create(): QQShareConfig = qqConfig

    }

    override fun getShareListener(): IShareListener {
        return listener
    }

    override fun setShareListener(listener: IShareListener) {
        this.listener = listener
    }

}