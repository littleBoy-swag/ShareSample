package cn.nqy.share

interface IShareListener {

    /**
     * 分享开始的回调
     */
    fun onShareStart()

    /**
     * 分享成果的回调
     */
    fun onShareSuccess()

    /**
     * 分享失败的回调
     */
    fun onShareError(message: String)

}