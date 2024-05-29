package com.eflash.venezia.googlefit

import android.util.Log


/**
 * 디버그 로그 유틸리티 클래스
 */
object DLog {

    private const val TAG = "DLog"

    /**
     * 호출한 위치 정보를 포함한 로그 태그 생성
     *
     * @return 로그 태그
     */
    private fun tag(): String {
        var traceInfo = ""
        traceInfo = Thread.currentThread().stackTrace[4].let {
            val link = "(${it.fileName}:${it.lineNumber})"
            val path = " ${it.className.substringAfterLast(".")}.${it.methodName}"
            if (path.length + link.length > 80) {
                "${link}${path.take(80 - link.length)}..."
            } else {
                "$link$path"
            }
        }

        return traceInfo
    }

    /**
     * 상세 로그를 출력
     *
     * @param msg 출력할 메시지
     */
    fun v(msg: String) {
            val strMessage = "$msg"
            Log.v(tag(), strMessage)
    }

    /**
     * 디버그 로그를 출력
     *
     * @param msg 출력할 메시지
     */
    fun d(msg: String) {
            val strMessage = "$msg"
            Log.d(tag(), strMessage)
    }

    /**
     * 정보 로그를 출력
     *
     * @param msg 출력할 메시지
     */
    fun i(msg: String) {
            val strMessage = "$msg"
            Log.i(tag(), strMessage)
    }

    /**
     * 경고 로그를 출력
     *
     * @param msg 출력할 메시지
     */
    fun w(msg: String) {
            val strMessage = "$msg"
            Log.w(tag(), strMessage)
    }

    /**
     * 경고 로그와 예외를 출력
     *
     * @param e 출력할 예외
     */
    fun w(e: Exception) {
            val strMessage = "${e?.localizedMessage}"
            Log.w(tag(), strMessage)
            e?.printStackTrace()
    }

    /**
     * 오류 로그를 출력
     *
     * @param msg 출력할 메시지
     */
    fun e(msg: String) {
            val strMessage = "$msg"
            Log.e(tag(), strMessage)
    }

    /**
     * 오류 로그와 Throwable을 출력
     *
     * @param e 출력할 Throwable
     */
    fun e(e: Throwable) {
            val strMessage = "${e?.localizedMessage}"
            Log.e(tag(), strMessage)
            e?.printStackTrace()
    }

    /**
     * 오류 로그와 예외를 출력
     *
     * @param e 출력할 예외
     */
    fun e(e: java.lang.Exception) {
            val strMessage = "${e?.localizedMessage}"
            Log.e(tag(), strMessage)
            e?.printStackTrace()
    }

}