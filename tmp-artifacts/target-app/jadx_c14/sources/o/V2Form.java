package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.GeneralAccountChooserActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class V2Form implements ALCFaceQuality {
    private static final byte[] $$a = {113, 66, 51, 67};
    private static final int $$b = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted = {27263, 27180, 27176, 27170, 27177, 27183, 27180, 27177, 27262, 27180, 27181, 27175, 27196, 27199, 27199, 27150, 27342, 27339, 27195, 27197, 27334, 27341, 27187, 27252, 27199, 27199, 27183, 27183, 27199, 27177, 27181, 27173, 27175, 27180, 27181, 27175, 27252, 27182, 27181, 27155, 27164, 27181, 27175, 27196, 27199, 27199, 27197, 27170, 27174, 27174, 27178, 27260, 27178, 27180, 27181, 27176, 27176, 27174, 27198, 27168, 27152, 27181, 27166, 27364, 27389, 27362, 27351, 27345, 27365, 27370, 27372, 27373, 27368, 27368, 27368, 27252, 27194, 27196, 27169, 27157, 27156, 27176, 27173, 27199, 27177, 27161, 27182, 27197, 27198, 27169, 27198, 27196, 27194, 27330, 27475, 27497, 27479, 27481, 27498, 27498, 27499, 27474, 27480, 27467, 27467, 27481, 27483, 27257, 27199, 27196, 27175, 27181, 27164, 27160, 27170, 27176, 27172};
    private static char[] IAuthTabCallback = {60853, 48893, 19235, 5221, 41097, 19912, 7708, 43675, 30688, 1953, 21737, 41274, 65136, 19080, 42961, 62493, 16559, 40370, 59947, 18254, 37763, 57551, 15724, 35242, 59060, 13068, 32839, 56450, 10652, 34408, 53941, 12222, 31745, 51551, 9608, 29234, 53109, 60832, 48887, 19252, 5222, 41113, 60860, 48887, 19236, 5231, 41128, 19913, 7707, 43681, 30661, '-', 44371, 31125, 2777, 55160, 25516, 3313};
    private static long onExtraCallbackWithResult = 322579788388089502L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            byte[] r0 = o.V2Form.$$a
            int r6 = r6 * 2
            int r6 = r6 + 97
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.V2Form.$$c(int, byte, byte):java.lang.String");
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onNavigationEvent + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        String string = context.getString(R.string.app_common_web_message_handlers___0100b3faf5);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = new Object[1];
        b(5 - TextUtils.getOffsetBefore("", 0), (char) (Process.myPid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) + 38, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), string);
        Object[] objArr2 = new Object[1];
        a(new int[]{51, 11, 0, 5}, true, new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0}, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        a(new int[]{62, 13, 64, 11}, true, new byte[]{1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0}, objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        b(15 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 42 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
        Object[] objArr5 = {settext, ((String) objArr4[0]).intern(), false};
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr5)).booleanValue();
        Object[] objArr6 = new Object[1];
        a(new int[]{75, 18, 0, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}, objArr6);
        Object[] objArr7 = {settext, ((String) objArr6[0]).intern(), true};
        boolean zBooleanValue2 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr7)).booleanValue();
        Object[] objArr8 = new Object[1];
        a(new int[]{93, 14, 179, 0}, true, new byte[]{0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1}, objArr8);
        String strIntern = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a(new int[]{107, 10, 0, 9}, true, new byte[]{0, 1, 0, 0, 0, 0, 1, 0, 1, 1}, objArr9);
        String strOnNavigationEvent4 = settext.onNavigationEvent(strIntern, ((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        a(new int[]{0, 8, 0, 0}, false, new byte[]{1, 0, 1, 0, 0, 1, 0, 0}, objArr10);
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, GeneralAccountChooserActivity.Companion.onNavigationEvent(context, strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent3, zBooleanValue2, strOnNavigationEvent4, zBooleanValue, settext.onNavigationEvent(((String) objArr10[0]).intern(), "")), 202, (Bundle) null, 4, (Object) null);
        int i4 = onNavigationEvent + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i2 == -1) {
            int i6 = onNavigationEvent;
            int i7 = i6 + 83;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                if (i != 454) {
                    return;
                }
            } else if (i != 202) {
                return;
            }
            int i8 = i6 + 73;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            if (bundle != null) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 8, 0, 0}, false, new byte[]{1, 0, 1, 0, 0, 1, 0, 0}, objArr);
                String string = bundle.getString(((String) objArr[0]).intern(), "");
                Object[] objArr2 = new Object[1];
                a(new int[]{8, 7, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 1, 0}, objArr2);
                KeyBoardVisiblePoint parcelable = bundle.getParcelable(((String) objArr2[0]).intern());
                if (parcelable != null) {
                    JsonObject jsonObject2 = new JsonObject();
                    Object[] objArr3 = new Object[1];
                    a(new int[]{15, 8, 28, 0}, true, new byte[]{1, 1, 1, 0, 0, 1, 1, 1}, objArr3);
                    jsonObject2.addProperty(((String) objArr3[0]).intern(), parcelable.asInterface());
                    Object[] objArr4 = new Object[1];
                    a(new int[]{23, 13, 0, 9}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0}, objArr4);
                    jsonObject2.addProperty(((String) objArr4[0]).intern(), parcelable.bP_());
                    Object[] objArr5 = new Object[1];
                    b((ViewConfiguration.getPressedStateDuration() >> 16) + 9, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0), objArr5);
                    jsonObject2.addProperty(((String) objArr5[0]).intern(), parcelable.onExtraCallbackWithResult());
                    Intrinsics.checkNotNull(string);
                    if (string.length() != 0) {
                        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject2);
                        return;
                    }
                    int i9 = onExtraCallback + 109;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr6 = new Object[1];
                    a(new int[]{36, 15, 0, 10}, false, new byte[]{0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr6);
                    String strIntern = ((String) objArr6[0]).intern();
                    Object[] objArr7 = new Object[1];
                    b(28 - Color.alpha(0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 59925), TextUtils.indexOf("", "", 0) + 9, objArr7);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr7[0]).intern(), (String) null, (Map) null, false, 28, (Object) null);
                }
            }
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 47;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i6 = $11 + 121;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "", 0)), 16 - TextUtils.lastIndexOf("", '0', 0), 10973 - (Process.myTid() >> 22), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - TextUtils.getOffsetAfter("", 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30, 20221 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, 1495 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i9 = $11 + 49;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49123), (ViewConfiguration.getPressedStateDuration() >> 16) + 44, (ViewConfiguration.getTouchSlop() >> 8) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i10 = 34 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.resolveSizeAndState(0, 0, 0)), (Process.myTid() >> 22) + 44, 1494 - TextUtils.indexOf("", "", 0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 95;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 35283), 35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i11 = $11 + 49;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                c = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i12 = $10 + 91;
                $11 = i12 % 128;
                if (i12 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 28 - ExpandableListView.getPackedPositionChild(0L), 17657 - (ViewConfiguration.getScrollBarSize() >> 8), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.getOffsetBefore("", 0)), 64 - Process.getGidForName(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 49467), (ViewConfiguration.getJumpTapTimeout() >> 16) + 70, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i15 = $11 + 29;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i17, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i18 = $11 + 71;
            $10 = i18 % 128;
            int i19 = 2;
            int i20 = i18 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i21 = $10 + 57;
                $11 = i21 % 128;
                if (i21 % i19 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent * i5];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                i19 = 2;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
