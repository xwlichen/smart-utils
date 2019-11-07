package com.smart.utils;

import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;

/**
 * @date : 2019-07-04 15:05
 * @author: lichen
 * @email : 1960003945@qq.com
 * @description :
 */
public class LogUtils {
    private final static int MAX_LENGTH = 3500;
    private final static int LOG_LEVEL_D = 0; //debug
    private final static int LOG_LEVEL_I = 1; //info
    private final static int LOG_LEVEL_W = 2; //warn
    private final static int LOG_LEVEL_E = 3; //error


    private static String DEFAULT_TAG = "smart";
    private static boolean isLog = true;


    public static void initXLog(String appName, final String logPath, final String cachePath, boolean isLog) {
        System.loadLibrary("c++_shared");
        System.loadLibrary("marsxlog");
        LogUtils.isLog = isLog;

//        final String SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath();
//        final String logPath = SDCARD +application.getPackageName()+ "/marssample/log";
//
//        // this is necessary, or may crash for SIGBUS
//        final String cachePath = application.getFilesDir() + "/xlog";

        //init xlog
        if (isLog) {
            Xlog.appenderOpen(Xlog.LEVEL_DEBUG, Xlog.AppednerModeAsync, cachePath, logPath, appName, 0, "");
            Xlog.setConsoleLogOpen(true);

        } else {
            Xlog.appenderOpen(Xlog.LEVEL_INFO, Xlog.AppednerModeAsync, cachePath, logPath, appName, 0, "");
            Xlog.setConsoleLogOpen(false);
        }

        Log.setLogImp(new Xlog());
    }


    public static void setDefaultTag(String defaultTag) {
        DEFAULT_TAG = defaultTag;
    }

    /**
     * debug级别日志
     *
     * @param msg 相关内容
     */
    public static void d(String msg) {
        d(DEFAULT_TAG, msg);
    }


    /**
     * debug级别日志
     *
     * @param tag tag
     * @param msg 相关内容
     */
    public static void d(String tag, String msg) {
        printLong(LOG_LEVEL_D, tag, msg);
    }


    /**
     * info级别日志
     *
     * @param msg 相关内容
     */
    public static void i(String msg) {
        i(DEFAULT_TAG, msg);
    }


    /**
     * info级别日志
     *
     * @param tag tag
     * @param msg 相关内容
     */
    public static void i(String tag, String msg) {
        printLong(LOG_LEVEL_I, tag, msg);
    }


    /**
     * warn级别日志
     *
     * @param msg 相关内容
     */
    public static void w(String msg) {
        w(DEFAULT_TAG, msg);
    }


    /**
     * warn级别日志
     *
     * @param tag tag
     * @param msg 相关内容
     */
    public static void w(String tag, String msg) {
        printLong(LOG_LEVEL_W, tag, msg);
    }


    /**
     * error级别日志
     *
     * @param msg 相关内容
     */
    public static void e(String msg) {
        e(DEFAULT_TAG, msg);
    }


    /**
     * error级别日志
     *
     * @param tag tag
     * @param msg 相关内容
     */
    public static void e(String tag, String msg) {
        printLong(LOG_LEVEL_E, tag, msg);
    }


    /**
     * 打印较长的日志
     *
     * @param level d/i/w/e  0/1/2/3
     * @param tag   tag
     * @param msg   msg
     */
    private static void printLong(int level, String tag, String msg) {

        msg = msg.trim();
        int index = 0;
        int maxLength = MAX_LENGTH;
        String sub = null;
        while (index < msg.length()) {
            if (msg.length() <= index + maxLength) {
                sub = msg.substring(index);
            } else {
                sub = msg.substring(index, index + maxLength);
            }

            index += maxLength;

            switch (level) {
                case LOG_LEVEL_D: //debug
                    Log.d(tag, msg);
                    break;
                case LOG_LEVEL_I: //info
                    Log.i(tag, msg);
                    break;
                case LOG_LEVEL_W: //warn
                    Log.w(tag, msg);
                    break;
                case LOG_LEVEL_E: //error
                    Log.e(tag, msg);
                    break;
                default:
                    break;
            }

        }


    }
}
