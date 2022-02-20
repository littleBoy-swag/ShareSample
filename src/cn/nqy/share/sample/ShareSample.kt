package cn.nqy.share.sample

import cn.nqy.share.DefaultShareListener
import cn.nqy.share.NqyShare
import cn.nqy.share.qq.QQShare
import cn.nqy.share.qq.QQShareConfig
import cn.nqy.share.share_type.ShareImageType
import cn.nqy.share.share_type.ShareMusicType

fun main(args: Array<String>) {

    NqyShare
        .get(QQShare(QQShareConfig
            .build()
            .setShareType(ShareMusicType("abc.mp3"))
            // .setShareType(ShareImageType("https://www.google.com","myAppLogo"))
            .addShareListener(object : DefaultShareListener() {
                override fun onShareStart() {
                    super.onShareStart()
                    println("开始分享")
                }

                override fun onShareError(message: String) {
                    super.onShareError(message)
                    println("哇，出错啦，原因是：$message")
                }
            })
            .create()))
        .share()
}