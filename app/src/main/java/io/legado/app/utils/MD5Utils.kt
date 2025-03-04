package io.legado.app.utils

import cn.hutool.crypto.digest.DigestUtil
import java.io.InputStream

/**
 * 将字符串转化为MD5
 */
@Suppress("unused")
object MD5Utils {

    private val MD5Digester by lazy {
        DigestUtil.digester("MD5")
    }

    fun md5Encode(str: String?): String {
        return MD5Digester.digestHex(str)
    }

    fun md5Encode(inputStream: InputStream): String {
        return MD5Digester.digestHex(inputStream)
    }

    fun md5Encode16(str: String): String {
        var reStr = md5Encode(str)
        reStr = reStr.substring(8, 24)
        return reStr
    }
}
