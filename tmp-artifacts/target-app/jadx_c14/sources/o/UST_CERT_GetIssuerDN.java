package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.shared.TossSecureStorageHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetIssuerDN implements ALCFaceResult, r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static char asBinder;
    private static char asInterface;
    private static final String onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{49094, 49072, 19871, 14411, 33868, 6418, 28490, 30840, 26999}, KeyEvent.normalizeMetaState(0) + 1, objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(new char[]{44499, 25777, 58682, 12570}, 3 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        IAuthTabCallback = ((String) objArr2[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = IAuthTabCallbackStub + 109;
        access100 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(str, str2);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(startrunning);
        int i4 = onTransact + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(startrunning);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(startrunning);
        int i3 = IAuthTabCallbackDefault + 39;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onTransact + 9;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i6 = onTransact + 65;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 107;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 31;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = onTransact + 125;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 41;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onTransact + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new TossSecureStorageHandler$.ExternalSyntheticLambda2());
        int i2 = IAuthTabCallbackDefault + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onNavigationEvent(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(uri);
        int i4 = IAuthTabCallbackDefault + 11;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 53;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 84, 21233 - (ViewConfiguration.getTouchSlop() >> 8), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 14186), View.combineMeasuredStates(0, 0) + 19, 8808 - (ViewConfiguration.getJumpTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $11 + 41;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r11
      0x0039: PHI (r11v2 im.toss.core.webkit.TossCoreWebView) = (r11v1 im.toss.core.webkit.TossCoreWebView), (r11v8 im.toss.core.webkit.TossCoreWebView) binds: [B:8:0x0037, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull im.toss.core.webkit.WebViewContentOwner r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r13, @org.jetbrains.annotations.NotNull o.setTopGuideBackgroundColor r14) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.UST_CERT_GetIssuerDN.IAuthTabCallbackDefault
            int r1 = r1 + 115
            int r2 = r1 % 128
            o.UST_CERT_GetIssuerDN.onTransact = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
            im.toss.core.webkit.TossCoreWebView r11 = r11.getWebView()
            r1 = 58
            int r1 = r1 / r2
            if (r11 == 0) goto L6a
            goto L39
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
            im.toss.core.webkit.TossCoreWebView r11 = r11.getWebView()
            if (r11 == 0) goto L6a
        L39:
            java.lang.String r11 = r11.onExtraCallbackWithResult()
            if (r11 == 0) goto L6a
            int r1 = o.UST_CERT_GetIssuerDN.onTransact
            int r1 = r1 + 11
            int r3 = r1 % 128
            o.UST_CERT_GetIssuerDN.IAuthTabCallbackDefault = r3
            int r1 = r1 % r0
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            int r4 = o.nSetPosition.onExtraCallbackWithResult()
            int r7 = o.nSetPosition.onExtraCallbackWithResult()
            int r3 = o.nSetPosition.onExtraCallbackWithResult()
            int r5 = o.nSetPosition.onExtraCallbackWithResult()
            r8 = 846257509(0x3270dd65, float:1.4020178E-8)
            r6 = -846257502(0xffffffffcd8f22a2, float:-3.0017645E8)
            java.lang.Object r11 = o.mergeParams.onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 != 0) goto L6c
        L6a:
            android.net.Uri r11 = android.net.Uri.EMPTY
        L6c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            o.TextRoundCornerProgressBarSavedState1 r0 = r10.onExtraCallbackWithResult(r11)
            if (r0 != 0) goto La9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 14
            char[] r0 = new char[r13]
            r0 = {x00ae: FILL_ARRAY_DATA , data: [7389, -16369, -4435, 32569, 32099, 28760, 4270, 7497, -22550, 21106, 16422, 20316, 7616, 15801} // fill-array
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 >> 16
            int r13 = r13 - r1
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            b(r0, r13, r1)
            r13 = r1[r2]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r13.intern()
            r12.append(r13)
            r12.append(r11)
            java.lang.String r1 = r12.toString()
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r14
            o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r0, r1, r2, r3, r4, r5)
            return
        La9:
            r10.IAuthTabCallback(r13, r12, r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetIssuerDN.onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner, java.lang.String, com.google.gson.JsonObject, o.setTopGuideBackgroundColor):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r5 != 1081274698) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r6 = r6 + 99;
        o.UST_CERT_GetIssuerDN.onTransact = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if ((r6 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r6 = new java.lang.Object[1];
        b(new char[]{26706, 12446, 14394, 16670, 49235, 50912, 47233, 50726, 58481, 58502, 42986, 21106, 63206, 59030, 7218, 47250, 8719, 21750, 27397, 7267, 25280, 15230, 17960, 17510, 25501, 1167}, 23 >>> (android.view.ViewConfiguration.getTouchSlop() - 14), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (r11.equals(((java.lang.String) r6[0]).intern()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        r6 = new java.lang.Object[1];
        b(new char[]{26706, 12446, 14394, 16670, 49235, 50912, 47233, 50726, 58481, 58502, 42986, 21106, 63206, 59030, 7218, 47250, 8719, 21750, 27397, 7267, 25280, 15230, 17960, 17510, 25501, 1167}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 25, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r11.equals(((java.lang.String) r6[0]).intern()) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        r4 = new java.lang.Object[1];
        a(new char[]{49094, 49072, 19871, 14411, 33868, 6418, 28490, 30840, 26999}, 1 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), r4);
        r12.onNavigationEvent(r10, r1.onNavigationEvent(((java.lang.String) r4[0]).intern(), ""));
        r13.IAuthTabCallback(new viva.republica.toss.common.web.message.shared.TossSecureStorageHandler$.ExternalSyntheticLambda0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        r0 = new java.lang.Object[1];
        b(new char[]{31491, 28684, 27609, 29695, 4480, 48808, 660, 3622, 37158, 62013, 15726, 9220, 59506, 32043, 31491, 28684, 1043, 53156, 32221, 24085, 38888, 41054, 42715, 14524, 30070, 15751, 59760, 39302}, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 28, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e8, code lost:
    
        if (r11.equals(((java.lang.String) r0[0]).intern()) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ea, code lost:
    
        r12.onTransact(r10);
        r13.IAuthTabCallback(new viva.republica.toss.common.web.message.shared.TossSecureStorageHandler$.ExternalSyntheticLambda1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0115, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (r5 != 914196460) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r5 != 914196460) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(com.google.gson.JsonObject r10, java.lang.String r11, o.TextRoundCornerProgressBarSavedState1 r12, o.setOnOutOfMemeryErrorCallback r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetIssuerDN.IAuthTabCallback(com.google.gson.JsonObject, java.lang.String, o.TextRoundCornerProgressBarSavedState1, o.setOnOutOfMemeryErrorCallback):void");
    }

    private static final Unit onExtraCallbackWithResult(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(startRunning startrunning) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(startrunning, "");
            startrunning.IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(startrunning, "");
        startrunning.IAuthTabCallback();
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 15;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $10 + 125;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i10 = 10 - (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int defaultSize = View.getDefaultSize(i3, i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, i10, defaultSize, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), ExpandableListView.getPackedPositionType(0L) + 10, TextUtils.getOffsetBefore("", 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + 14, 19901 - (Process.myPid() >> 22), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $11 + 55;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(Uri uri) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 34 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getSize(0) + 7094, -1088743663, false, "Companion", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                Object[] objArr = {uri};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2110240481);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (63468 - Color.alpha(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 52, 7127 - TextUtils.indexOf((CharSequence) "", '0', 0), -1283934321, false, "onExtraCallback", new Class[]{Uri.class});
                }
                throw null;
            }
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), Gravity.getAbsoluteGravity(0, 0) + 34, 7094 - Color.alpha(0), -1088743663, false, "Companion", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback3).get(null);
            Object[] objArr2 = {uri};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2110240481);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 63469), ((byte) KeyEvent.getModifierMetaStateMask()) + 53, 7128 - (ViewConfiguration.getEdgeSlop() >> 16), -1283934321, false, "onExtraCallback", new Class[]{Uri.class});
            }
            Enum r1 = (Enum) ((Method) objOnExtraCallback4).invoke(obj2, objArr2);
            if (r1 != null) {
                return getCRLIssuer.onWarmupCompleted$1b9a57e5(r1);
            }
            int i3 = IAuthTabCallbackDefault + 73;
            int i4 = i3 % 128;
            onTransact = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 3;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        r8lambdaM3DeYFFiQUGzHsjrfaArqWkL6N0.Companion.onExtraCallback().onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback);
        int i4 = IAuthTabCallbackDefault + 39;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        onNavigationEvent = -5920442080198062407L;
        onExtraCallbackWithResult = (char) 51284;
        onWarmupCompleted = (char) 1596;
        asBinder = (char) 8339;
        asInterface = (char) 51023;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
