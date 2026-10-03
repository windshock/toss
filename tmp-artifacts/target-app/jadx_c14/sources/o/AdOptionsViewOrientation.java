package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.setSingleIcon;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdOptionsViewOrientation {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static boolean asInterface = false;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    public static final AdOptionsViewOrientation onNavigationEvent;
    private static int onTransact = 1;
    private static final List<String> onWarmupCompleted;

    private AdOptionsViewOrientation() {
    }

    static {
        onNavigationEvent();
        onNavigationEvent = new AdOptionsViewOrientation();
        onWarmupCompleted = CollectionsKt.listOf(new String[]{"lightText", "darkText", "adaptive"});
        int i = asBinder + 67;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 42 / 0;
        }
    }

    public final setSingleIcon IAuthTabCallback(@NotNull AdOptionsView adOptionsView, boolean z) throws Throwable {
        AdSDKNotificationListener adSDKNotificationListener;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adOptionsView, "");
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(adOptionsView);
        if (strOnExtraCallbackWithResult != null) {
            return new setSingleIcon.onWarmupCompleted(strOnExtraCallbackWithResult);
        }
        getAdExperienceType getadexperiencetypeOnExtraCallbackWithResult = getAdExperienceType.Companion.onExtraCallbackWithResult(adOptionsView.onExtraCallback());
        if (!z) {
            adSDKNotificationListener = AdSDKNotificationListener.External;
            int i2 = onTransact + 27;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onTransact + 101;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            adSDKNotificationListener = AdSDKNotificationListener.Internal;
        }
        return new setSingleIcon.onNavigationEvent(getadexperiencetypeOnExtraCallbackWithResult, adSDKNotificationListener);
    }

    private final String onExtraCallbackWithResult(AdOptionsView adOptionsView) throws Throwable {
        int i = 2 % 2;
        String strIAuthTabCallback = adOptionsView.IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -127}, 127 - TextUtils.getCapsMode("", 0, 0), objArr);
        if (StringsKt.equals(strIAuthTabCallback, ((String) objArr[0]).intern(), true)) {
            int i2 = IAuthTabCallbackDefault + 85;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return "ui=v2";
        }
        if (IAuthTabCallback(adOptionsView.onWarmupCompleted())) {
            return "external=" + adOptionsView.onWarmupCompleted();
        }
        String strOnExtraCallbackWithResult = adOptionsView.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            int i7 = IAuthTabCallbackDefault + 95;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (!StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                return "style=" + adOptionsView.onExtraCallbackWithResult();
            }
        }
        if (!StringsKt.equals(adOptionsView.onTransact(), "true", true)) {
            return onWarmupCompleted(adOptionsView.onNavigationEvent());
        }
        int i9 = IAuthTabCallbackDefault + 47;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            return "universal_link=true";
        }
        throw null;
    }

    private final boolean IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0 ? !StringsKt.equals(str, "true", true) : !StringsKt.equals(str, "true", false)) {
            int i3 = onTransact + 111;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            if (!StringsKt.equals(str, "browser", true)) {
                int i5 = onTransact + 57;
                IAuthTabCallbackDefault = i5 % 128;
                return i5 % 2 != 0;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String onWarmupCompleted(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r6 == 0) goto L18
            int r2 = o.AdOptionsViewOrientation.IAuthTabCallbackDefault
            int r2 = r2 + 97
            int r3 = r2 % 128
            o.AdOptionsViewOrientation.onTransact = r3
            int r2 = r2 % r0
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
            java.lang.String r6 = r6.toString()
            goto L19
        L18:
            r6 = r1
        L19:
            if (r6 != 0) goto L1d
            java.lang.String r6 = ""
        L1d:
            int r2 = r6.length()
            if (r2 != 0) goto L24
            return r1
        L24:
            java.util.List<java.lang.String> r2 = o.AdOptionsViewOrientation.onWarmupCompleted
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L4a
            int r3 = o.AdOptionsViewOrientation.onTransact
            int r3 = r3 + 5
            int r4 = r3 % 128
            o.AdOptionsViewOrientation.IAuthTabCallbackDefault = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L41
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L8b
            goto L4a
        L41:
            java.util.Collection r2 = (java.util.Collection) r2
            r2.isEmpty()
            r1.hashCode()
            throw r1
        L4a:
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8b
            int r3 = o.AdOptionsViewOrientation.onTransact
            int r3 = r3 + 71
            int r4 = r3 % 128
            o.AdOptionsViewOrientation.IAuthTabCallbackDefault = r4
            int r3 = r3 % r0
            r4 = 1
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = kotlin.text.StringsKt.equals(r3, r6, r4)
            if (r3 == 0) goto L4e
            goto L79
        L6d:
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = kotlin.text.StringsKt.equals(r3, r6, r4)
            if (r3 == 0) goto L4e
        L79:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "transparent="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdOptionsViewOrientation.onWarmupCompleted(java.lang.String):java.lang.String");
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int i3 = $10 + 111;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 77 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf("", "", 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $10 + 19;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 75 - TextUtils.indexOf("", "", 0, 0), 16037 - (ViewConfiguration.getLongPressTimeout() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i8 = 1052772399;
        if (asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i9 = $10 + 41;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $10 + 111;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 63 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i13 = $10 + 85;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 63, Color.argb(0, 0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i15 = $11 + 91;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            i8 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{32631, 32563};
        onExtraCallback = -1184333843;
        onExtraCallbackWithResult = true;
        asInterface = true;
    }
}
