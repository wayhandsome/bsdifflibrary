package com.jfeng.bsdifflibrary;

/**
 * 生成差异包工具类
 * Created by jfeng on 2018/4/11.
 */
public class BsDiff
{
    // Used to load the 'bspatch' library on application startup.
    static
    {
        System.loadLibrary("bsdiff");
    }

    /**
     * 生成差异包<br>
     * ./bsdiff old.apk new.apk old-to-new.apk
     * @param  oldApk 旧apk完整路径
     * @param  newApk 新apk完整路径
     * @param  patch 生成后的差异包完整路径
     */
    public static native int bsdiff(String oldApk, String newApk, String patch);
}
