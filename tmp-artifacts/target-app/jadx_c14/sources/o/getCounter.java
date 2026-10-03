package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getCounter implements ALCFaceResult {
    public static final onExtraCallbackWithResult Companion;
    private static char[] onExtraCallback;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {20, 103, 109, 52};
    private static final int $$b = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = o.getCounter.$$a
            int r7 = r7 * 4
            int r7 = 97 - r7
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCounter.$$c(byte, short, short):java.lang.String");
    }

    static {
        onNavigationEvent = 0;
        onWarmupCompleted();
        Companion = new onExtraCallbackWithResult(null);
        int i = onExtraCallbackWithResult + 43;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 20 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = IAuthTabCallback + 83;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onTransact + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 != 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 6 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallback + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = onTransact + 25;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallback + 59;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = IAuthTabCallback + 53;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(Color.red(0), TextUtils.getOffsetBefore("", 0) + 3, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53947), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (!enableModuleArgumentNSNullConversionIOS.asInterface.IAuthTabCallbackDefault(strOnNavigationEvent)) {
            int i2 = onTransact + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                a(4 / TextUtils.getOffsetAfter("", 0), 72 - (Process.myPid() * 34), (char) (59251 / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                a(3 - TextUtils.getOffsetAfter("", 0), (Process.myPid() >> 22) + 36, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 59251), objArr3);
                obj = objArr3[0];
            }
            strOnNavigationEvent = ((String) obj).intern();
            int i3 = IAuthTabCallback + 89;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
        String str2 = strOnNavigationEvent;
        FragmentActivity activity = webViewContentOwner.getActivity();
        if (activity != null) {
            ALCFaceBox.onExtraCallback(settopguidebackgroundcolor, str2);
            SessionTrackerb.IAuthTabCallback(resumeForClick.asBinder, activity, str2, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(SigIObjectIdentifiers.onExtraCallbackWithResult);
            activity.finish();
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, int r29, char r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCounter.a(int, int, char, java.lang.Object[]):void");
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{16154, 21234, 58589, 2771, 26426, 53518, 17160, 48494, 12159, 39253, 2906, 26027, 55293, 16857, 46026, 11761, 40943, 2519, 31682, 54308, 17933, 45057, 8819, 40037, 3672, 30727, 60093, 17575, 46740, 8339, 37624, 3297, 32477, 59606, 17790, 46888, 8448, 37747, 3432};
        onWarmupCompleted = 5039928708706500667L;
    }
}
