package com.smart.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

/**
 * @date : 2019-11-12 11:28
 * @author: lichen
 * @email : 1960003945@qq.com
 * @description :
 */
public class BitmapUtils {


    /**
     * 兼容 anydpi-v26  BitmapFactory.decodeResource会范围null
     *
     * @param context
     * @param vectorResourcesId
     * @return
     */
    public Bitmap getVectorBitmap(Context context, int vectorResourcesId) {
        final VectorDrawableCompat drawable = VectorDrawableCompat.create(context.getResources(), vectorResourcesId, null);
        if (drawable == null) {
            return null;
        }
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(),
                drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }
}
