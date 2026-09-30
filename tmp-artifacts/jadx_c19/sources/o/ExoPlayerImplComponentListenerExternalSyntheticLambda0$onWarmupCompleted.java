package o;

import com.alibaba.ariver.kernel.RVParams;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ExoPlayerImplComponentListenerExternalSyntheticLambda0$onWarmupCompleted {
    private static final ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult[] onExtraCallbackWithResult;
    private static final int[] onWarmupCompleted;

    private static int IAuthTabCallback(int i2) {
        if (i2 < 350) {
            return 400;
        }
        if (i2 < 550) {
            return 700;
        }
        if (i2 < 900) {
            return 900;
        }
        return i2;
    }

    private static int onExtraCallback(int i2) {
        if (i2 < 100) {
            return i2;
        }
        if (i2 < 550) {
            return 100;
        }
        return i2 < 750 ? 400 : 700;
    }

    ExoPlayerImplComponentListenerExternalSyntheticLambda0$onWarmupCompleted() {
    }

    static {
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.w100;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult2 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.w200;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult3 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.w300;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult4 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.Normal;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult5 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.w500;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult6 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.w600;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult7 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.Bold;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult8 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.w800;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult9 = ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.w900;
        onExtraCallbackWithResult = new ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult[]{onextracallbackwithresult, onextracallbackwithresult, onextracallbackwithresult2, onextracallbackwithresult3, onextracallbackwithresult4, onextracallbackwithresult5, onextracallbackwithresult6, onextracallbackwithresult7, onextracallbackwithresult8, onextracallbackwithresult9, onextracallbackwithresult9};
        onWarmupCompleted = new int[]{400, 700, 100, RVParams.WEBVIEW_FONT_SIZE_LARGEST, 300, 400, 500, 600, 700, 800, 900};
    }

    static ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onWarmupCompleted(int i2) {
        return onExtraCallbackWithResult[Math.round(i2 / 100.0f)];
    }

    static int onExtraCallback(ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult, ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0) {
        if (onextracallbackwithresult == ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.Bolder) {
            return IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallback);
        }
        if (onextracallbackwithresult == ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.Lighter) {
            return onExtraCallback(exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallback);
        }
        return onWarmupCompleted[onextracallbackwithresult.ordinal()];
    }
}
