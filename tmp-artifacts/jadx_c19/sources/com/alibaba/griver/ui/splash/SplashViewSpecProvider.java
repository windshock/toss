package com.alibaba.griver.ui.splash;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SplashViewSpecProvider extends DefaultViewSpecProvider {
    public static boolean b = false;
    public static int c;
    public Activity a;

    public SplashViewSpecProvider(Activity activity) {
        super(activity);
        this.a = activity;
    }

    public static void initWidthAndHeight(Context context) {
        if (b) {
            return;
        }
        int screenWidth = DimensionUtil.getScreenWidth(context);
        int screenHeight = DimensionUtil.getScreenHeight(context);
        if (screenWidth < screenHeight) {
            c = screenWidth;
        } else {
            c = screenHeight;
        }
        b = true;
    }

    @Override // com.alibaba.ariver.app.ui.DefaultViewSpecProvider
    public int getHeightSpec() {
        RVLogger.debug("SplashViewSpecProvider", "fragmentOptEnabled not calculate for getHeightSpec");
        return View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
    }

    @Override // com.alibaba.ariver.app.ui.DefaultViewSpecProvider
    public int getWidthSpec() {
        initWidthAndHeight(this.a);
        RVLogger.debug("SplashViewSpecProvider", "fragmentOptEnabled getWidthSpec: " + c);
        return View.MeasureSpec.makeMeasureSpec(c, 1073741824);
    }
}
