package cn.nqy.share

interface IShareConfig {

    fun getShareListener(): IShareListener?

    fun setShareListener(listener: IShareListener)

}