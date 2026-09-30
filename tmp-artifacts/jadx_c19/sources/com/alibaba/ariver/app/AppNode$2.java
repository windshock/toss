package com.alibaba.ariver.app;

import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.app.api.AppRestartResult;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class AppNode$2 implements SendToRenderCallback {
    final /* synthetic */ AppNode this$0;
    final /* synthetic */ AppRestartResult val$result;

    AppNode$2(AppNode appNode, AppRestartResult appRestartResult) {
        this.this$0 = appNode;
        this.val$result = appRestartResult;
    }

    @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
    public void onCallBack(JSONObject jSONObject) {
        if (!this.val$result.canRestart || !this.this$0.isTinyApp()) {
            AppNode.access$002(this.this$0, false);
            return;
        }
        if (jSONObject != null) {
            RVLogger.d("AriverApp:App", "resume onCallback: " + jSONObject);
        }
        ExecutorUtils.runOnMain(new Runnable() { // from class: com.alibaba.ariver.app.AppNode$2.1
            private static int $10 = 0;
            private static int $11 = 1;
            private static char IAuthTabCallback = 59567;
            private static int asInterface = 1;
            private static char onExtraCallback = 41039;
            private static char onExtraCallbackWithResult = 50398;
            private static char onNavigationEvent = 61790;
            private static int onWarmupCompleted;

            private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                char[] cArr2 = new char[cArr.length];
                int i4 = 0;
                defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                char[] cArr3 = new char[2];
                while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                    int i5 = $11 + 73;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    char c = 1;
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                    int i7 = $11 + 121;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 58224;
                    int i10 = i4;
                    while (i10 < 16) {
                        char c2 = cArr3[c];
                        char c3 = cArr3[i4];
                        int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                        int i12 = c3 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(onNavigationEvent);
                            objArr2[2] = Integer.valueOf(i12);
                            objArr2[c] = Integer.valueOf(i11);
                            objArr2[i4] = Integer.valueOf(c2);
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback == null) {
                                char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1));
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 11;
                                int iIndexOf2 = 12433 - TextUtils.indexOf((CharSequence) "", '0');
                                Class[] clsArr = new Class[4];
                                clsArr[i4] = Integer.TYPE;
                                clsArr[c] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c4, iIndexOf, iIndexOf2, -787580090, false, "C", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            cArr3[c] = cCharValue;
                            int i13 = i10;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 9 - MotionEvent.axisFromString(""), 12434 - View.MeasureSpec.makeMeasureSpec(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i9 -= 40503;
                            i10 = i13 + 1;
                            i4 = 0;
                            c = 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                    cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 16014), 14 - View.MeasureSpec.getMode(0), AndroidCharacter.getMirror('0') + 19853, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 0;
                }
                String str = new String(cArr2, 0, i2);
                int i14 = $10 + 47;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                objArr[0] = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                int i2 = 2 % 2;
                AppNode$2 appNode$2 = AppNode$2.this;
                String str = appNode$2.val$result.startUrl;
                Bundle bundleClone = BundleUtils.clone(appNode$2.this$0.getStartParams());
                Object[] objArr = new Object[1];
                a(new char[]{12771, 45779, 41864, 45631, 23257, 51696, 34305, 951}, 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                bundleClone.putString(((String) objArr[0]).intern(), "relaunch");
                Bundle bundleClone2 = BundleUtils.clone(AppNode$2.this.this$0.getSceneParams());
                AppNode$2 appNode$22 = AppNode$2.this;
                if (true ^ appNode$22.val$result.closeAllWindow) {
                    appNode$22.this$0.pushPage(str, bundleClone, bundleClone2);
                } else {
                    int i3 = onWarmupCompleted + 31;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    appNode$22.this$0.relaunchToUrl(str, bundleClone, bundleClone2);
                }
                AppNode.access$002(AppNode$2.this.this$0, false);
                int i5 = asInterface + 11;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 7 / 0;
                }
            }
        });
    }
}
