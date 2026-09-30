package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.bridge.HighlightV2Handler$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.tooltip.TdsHighlightV2View;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class base64StringImage implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static char[] onExtraCallback = {27333, 27473, 27494, 27503, 27472, 27500, 27473, 27475, 27473, 27461, 27462, 27477, 27168, 27258, 27168, 27170, 27176, 27198, 27353, 27492, 27491, 27514, 27493, 27499, 27497, 27159, 27362, 27371, 27368, 27365, 27194, 27306, 27311, 27303};
    private static long onExtraCallbackWithResult = -1616864542874581411L;
    private static int onNavigationEvent;

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(str, str2);
        }
        IAuthTabCallback(str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onNavigationEvent + 9;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onWarmupCompleted(str);
            obj.hashCode();
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
        int i6 = IAuthTabCallback + 1;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new HighlightV2Handler$.ExternalSyntheticLambda0());
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallback(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        boolean zOnTransact = filterCreatePageParams.onTransact(uri);
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnTransact;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 41;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 23;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45812), 83 - Process.getGidForName(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - TextUtils.getOffsetAfter("", 0)), 19 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf("", "") + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x02c9  */
    @Override // o.ALCFaceQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        TdsHighlightV2View.onWarmupCompleted onwarmupcompleted;
        TdsHighlightV2View.onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            int i4 = IAuthTabCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{8122, 8136, 23347, 7858, 26115, 26976, 25716, 60043, 57082, 21733}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        int iFloatValue = (int) ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr[0]).intern(), Float.valueOf(16.0f)})).floatValue();
        Object[] objArr2 = new Object[1];
        a(new char[]{23593, 23620, 26514, 56882, 23206, 37332, 42211, 43276, 9812, 26708, 52064, 35635, 46798, 32012, 49568, 33883, 33676, 18388, 65251}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        b(true, new byte[]{0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0}, new int[]{0, 12, 181, 5}, objArr3);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        a(new char[]{29217, 29273, 24338, 42005, 39070}, Color.alpha(0) + 1, objArr4);
        int iFloatValue2 = (int) ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr4[0]).intern(), Float.valueOf(0.0f)})).floatValue();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(iFloatValue2), displayMetrics);
        Object[] objArr5 = new Object[1];
        b(false, new byte[]{1}, new int[]{12, 1, 100, 1}, objArr5);
        int iFloatValue3 = (int) ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr5[0]).intern(), Float.valueOf(0.0f)})).floatValue();
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Integer.valueOf(iFloatValue3), displayMetrics2) + M_.onExtraCallback.access000();
        Object[] objArr6 = new Object[1];
        b(true, new byte[]{0, 0, 0, 1, 0}, new int[]{13, 5, 0, 0}, objArr6);
        int iOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr6[0]).intern(), 0);
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent4 = varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent3), displayMetrics3);
        Object[] objArr7 = new Object[1];
        a(new char[]{24353, 24393, 5132, 41249, 10552, 1477, 56298, 43533, 45649, 7129}, Drawable.resolveOpacity(0, 0) + 1, objArr7);
        int iOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr7[0]).intern(), 0);
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        int iOnNavigationEvent6 = varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent5), displayMetrics4);
        Object[] objArr8 = new Object[1];
        b(false, new byte[]{0, 0, 0, 0, 0, 0, 0}, new int[]{18, 7, 193, 0}, objArr8);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr8[0]).intern(), "");
        Rect rect = new Rect(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent4 + iOnNavigationEvent, iOnNavigationEvent6 + iOnNavigationEvent2);
        TdsHighlightV2View.IAuthTabCallback iAuthTabCallback = TdsHighlightV2View.Companion;
        Object[] objArr9 = new Object[1];
        a(new char[]{43329, 43267, 55389, 59340, 58691, 5500, 40250, 23626, 41691, 55195}, -TextUtils.lastIndexOf("", '0'), objArr9);
        if (StringsKt.equals(strOnNavigationEvent, ((String) objArr9[0]).intern(), true)) {
            onwarmupcompleted = TdsHighlightV2View.onWarmupCompleted.BOTTOM;
        } else {
            onwarmupcompleted = TdsHighlightV2View.onWarmupCompleted.TOP;
            int i6 = onNavigationEvent + 15;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        String upperCase = strOnNavigationEvent2.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int iHashCode = upperCase.hashCode();
        Object obj = null;
        if (iHashCode == 2332679) {
            Object[] objArr10 = new Object[1];
            b(false, new byte[]{0, 1, 1, 0}, new int[]{30, 4, 156, 0}, objArr10);
            if (upperCase.equals(((String) objArr10[0]).intern())) {
                onextracallbackwithresult = TdsHighlightV2View.onExtraCallbackWithResult.LEFT;
            }
        } else if (iHashCode == 77974012) {
            Object[] objArr11 = new Object[1];
            b(true, new byte[]{0, 0, 1, 0, 1}, new int[]{25, 5, 94, 5}, objArr11);
            if (upperCase.equals(((String) objArr11[0]).intern())) {
                int i8 = IAuthTabCallback + 113;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    TdsHighlightV2View.onExtraCallbackWithResult onextracallbackwithresult2 = TdsHighlightV2View.onExtraCallbackWithResult.RIGHT;
                    obj.hashCode();
                    throw null;
                }
                onextracallbackwithresult = TdsHighlightV2View.onExtraCallbackWithResult.RIGHT;
            }
        } else if (iHashCode == 1984282709) {
            Object[] objArr12 = new Object[1];
            a(new char[]{33092, 33031, 22904, 2590, 25708, 46744, 28914, 29765, 319, 22187}, View.MeasureSpec.getSize(0) + 1, objArr12);
            onextracallbackwithresult = upperCase.equals(((String) objArr12[0]).intern()) ? TdsHighlightV2View.onExtraCallbackWithResult.CENTER : TdsHighlightV2View.onExtraCallbackWithResult.DEFAULT;
        }
        if (!(!TdsHighlightV2View.IAuthTabCallback.onNavigationEvent(iAuthTabCallback, context, strOnNavigationEvent3, rect, onwarmupcompleted, iFloatValue, onextracallbackwithresult, (TdsHighlightV2View.onExtraCallback) null, 0L, 96, (Object) null))) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, null, 1, null);
            return;
        }
        Object[] objArr13 = new Object[1];
        a(new char[]{13300, 13212, 10557, 18872, 5125, 2838, 13181, 50908, 48269, 9977, 23804, 4562, 55560, 13308, 22073, 7833, 60492, 2360, 27002, 11100, 59021, 1552, 31910, 12783, 63956, 5061, 30703}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr13);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr13[0]).intern(), null, null, 6, null);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallback;
        long j = 0;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $11 + 67;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 35283), AndroidCharacter.getMirror('0') - '\r', 14239 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    j = 0;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $10 + 125;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 65, View.combineMeasuredStates(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 29, 17657 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 70 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i13 = $10 + 1;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i15 = $10 + 105;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i17, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
