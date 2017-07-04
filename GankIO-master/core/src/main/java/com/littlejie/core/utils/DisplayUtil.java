package com.littlejie.core.utils;

import android.content.Context;

/**
 * dp、sp和px相互转化的工具类
 * 使用不带 Context 参数的方法时，请先调用 init 方法进行初始化
 * <p>
 * Created by littlejie on 2017/2/25.
 */

public class DisplayUtil {

    private static Context sContext;

    /**
     * 初始化 DisplayUtil
     *
     * @param context ApplicationContext
     */
    public static void init(Context context) {
        sContext = context;
    }

    /**
     * 将 px 转换为 dp 值
     *
     * @param px
     * @return
     */
    public static int px2dp(float px) {
        float scale = sContext.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }

    /**
     * 将 dp 转换为 sp 值
     *
     * @param dp
     * @return
     */
    public static int dp2px(float dp) {
        float scale = sContext.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    /**
     * 将 px 转换为 sp 值
     *
     * @param px
     * @return
     */
    public static int px2sp(float px) {
        float scale = sContext.getResources().getDisplayMetrics().scaledDensity;
        return (int) (px / scale + 0.5f);
    }

    /**
     * 将 sp 转换为 px 值
     *
     * @param sp
     * @return
     */
    public static int sp2px(float sp) {
        float scale = sContext.getResources().getDisplayMetrics().scaledDensity;
        return (int) (sp * scale + 0.5f);
    }

    /**
     * 将 px 转换为 dp 值
     *
     * @param context
     * @param px
     * @return
     */
    public static int px2dp(Context context, float px) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }

    /**
     * 将 dp 转换为 sp 值
     *
     * @param context
     * @param dp
     * @return
     */
    public static int dp2px(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    /**
     * 将 px 转换为 sp 值
     *
     * @param context
     * @param px
     * @return
     */
    public static int px2sp(Context context, float px) {
        float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (px / scale + 0.5f);
    }

    /**
     * 将 sp 转换为 px 值
     *
     * @param context
     * @param sp
     * @return
     */
    public static int sp2px(Context context, float sp) {
        float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (sp * scale + 0.5f);
    }
}
