package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackNativeAdCustomTabsNavigationFailed implements updateAdInfo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 31828;
    private static int asInterface = 1;
    private static char onExtraCallback = 43832;
    private static char onExtraCallbackWithResult = 12559;
    private static char onNavigationEvent = 39684;
    private static int onWarmupCompleted;

    @Inject
    public trackNativeAdCustomTabsNavigationFailed() {
    }

    @Override // o.updateAdInfo
    public Set<String> IAuthTabCallback(@Nullable String str) throws Throwable {
        String strSubstringBefore$default;
        int i = 2 % 2;
        String lowerCase = null;
        if (str != null) {
            int i2 = asInterface + 79;
            onWarmupCompleted = i2 % 128;
            strSubstringBefore$default = i2 % 2 != 0 ? StringsKt.substringBefore$default(str, ":", (String) null, 4, (Object) null) : StringsKt.substringBefore$default(str, ":", (String) null, 2, (Object) null);
        } else {
            strSubstringBefore$default = null;
        }
        Object[] objArr = new Object[1];
        a(new char[]{16083, 43193, 51018, 18855}, (Process.myPid() >> 22) + 4, objArr);
        Set<String> setOnWarmupCompleted = clearFaultAdjacentMetadata.onWarmupCompleted(new String[]{((String) objArr[0]).intern()});
        if (strSubstringBefore$default != null) {
            int i3 = onWarmupCompleted + 41;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(strSubstringBefore$default.toLowerCase(Locale.ROOT), "");
                lowerCase.hashCode();
                throw null;
            }
            lowerCase = strSubstringBefore$default.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        if (Intrinsics.areEqual(lowerCase, "bank")) {
            int i4 = asInterface + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            setOnWarmupCompleted.add("bank");
        }
        return setOnWarmupCompleted;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 95;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i5 = 58224;
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $11 + 97;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(i3);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i3, i3) + 11;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iIndexOf, scrollBarSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 10 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16014), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
