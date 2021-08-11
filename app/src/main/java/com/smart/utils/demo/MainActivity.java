package com.smart.utils.demo;

import android.os.Bundle;
import android.os.Environment;

import com.smart.utils.LogUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath();
        final String logPath = SDCARD + "/" + this.getPackageName() + "/marssample/log";

        // this is necessary, or may crash for SIGBUS
        final String cachePath = SDCARD + "/Android/data/" + this.getPackageName() + "/xlog";
        String pubKey = "d5caa755197ea401323cbaf253269ecc193dc09bb00d2054f1bfaf9758a6f840e35ea83f2d0f5be49c65547dc7ba79e03f67ccdc8e40cda368ad041a3952a576";

        LogUtils.initXLog("testDemo", logPath, cachePath, pubKey, 0, true);
        LogUtils.e("xw", "logPath:" + logPath);
        LogUtils.e("xw", "cachepath:" + cachePath);
//        Log.getSysInfo()

        String format = "%1$s,%2$c,%3$d,%4$b,%5$f";
        LogUtils.e("xw", format, "test", 'A', 12, true, 1.0f);


        String s = "9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezM" +
                "dnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64B" +
                "GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87" +
                "K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K" +
                "9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezM\" +\n" +
                "                \"dnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64B\" +\n" +
                "                \"GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87\" +\n" +
                "                \"K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K" +
                "9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezM\" +\n" +
                "                \"dnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64B\" +\n" +
                "                \"GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87\" +\n" +
                "                \"K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K" +
                "9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezM\" +\n" +
                "                \"dnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64B\" +\n" +
                "                \"GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87\" +\n" +
                "                \"K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K" +
                "9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezM\" +\n" +
                "                \"dnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64B\" +\n" +
                "                \"GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87\" +\n" +
                "                \"K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K" +
                "GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87\" +\n" +
                "                \"K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K\" +\n" +
                "                \"9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezM\\\" +\\n\" +\n" +
                "                \"                \\\"dnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64B\\\" +\\n\" +\n" +
                "                \"                \\\"GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87\\\" +\\n\" +\n" +
                "                \"                \\\"K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K\" +\n" +
                "                \"9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezM\\\" +\\n\" +\n" +
                "                \"                \\\"dnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64B\\\" +\\n\" +\n" +
                "                \"                \\\"GXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87K9g64BGXRePyNpAzpxXezMdnqJa31Q87\\\" +\\n\" ";

        String result = "";
        for (int i = 0; i < 20; i++) {
            result += s;
        }
//        LogUtils.e1("xw", result);
        LogUtils.e("xw", result);

//        int i = 1 / 0;
    }
}
