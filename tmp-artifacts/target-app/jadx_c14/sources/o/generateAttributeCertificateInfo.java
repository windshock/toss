package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.mvno.UsimScannerActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class generateAttributeCertificateInfo implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 1;
    private static int asInterface = 0;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static final String onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{0, 8, 169, 0}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 0}, objArr);
        onWarmupCompleted = ((String) objArr[0]).intern();
        Companion = new onExtraCallbackWithResult(null);
        int i = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onTransact + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = asInterface + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onTransact + 79;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onTransact + 117;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        String string = context.getString(R.string.tossmobile_scan_usim_navigation_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = new Object[1];
        b(new char[]{35273, 35239, 59898, 11311, 32812, 42457, 46301, 25731, 47270, 38097, 58839, 38283, 60342, 18374, 55023, 50835, 6821, 14028, 2006}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), string);
        String string2 = context.getString(R.string.tossmobile_scan_usim_guide_title);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = new Object[1];
        a(new int[]{24, 10, 0, 0}, true, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 0}, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), string2);
        Object[] objArr3 = new Object[1];
        b(new char[]{7772, 7739, 35648, 35409, 26166, 51063, 4796, 33428, 12081, 63054, 17336, 29579, 31791, 9568, 28844, 8336, 36144, 21619, 41378, 4486}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        String string3 = context.getString(R.string.tossmobile_scan_usim_bottom_button_title);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Object[] objArr4 = new Object[1];
        a(new int[]{34, 17, 0, 15}, false, new byte[]{0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1}, objArr4);
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, UsimScannerActivity.Companion.onWarmupCompleted(context, new fromWidthAndHeight(strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent3, settext.onNavigationEvent(((String) objArr4[0]).intern(), string3))), 16711935, (Bundle) null, 4, (Object) null);
        int i3 = asInterface + 109;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 101;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 45812), 83 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 21233 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 14185), 19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 8808 - (ViewConfiguration.getWindowTouchSlop() >> 8), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 31;
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i != 16711935) {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", (String) null, (Map) null, 6, (Object) null);
            return;
        }
        int i4 = onTransact + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (i2 != -1) {
            if (i2 != 0) {
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", (String) null, (Map) null, 6, (Object) null);
                return;
            }
            Object[] objArr = new Object[1];
            a(new int[]{0, 8, 169, 0}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 0}, objArr);
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, ALCEyeBlink.onWarmupCompleted.onExtraCallbackWithResult(new UsimScannerActivity.onExtraCallback(((String) objArr[0]).intern(), null)));
            int i6 = asInterface + 91;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (bundle != null) {
            Object[] objArr2 = new Object[1];
            a(new int[]{8, 16, 0, 0}, true, new byte[]{0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1}, objArr2);
            UsimScannerActivity.onExtraCallback onextracallback = (UsimScannerActivity.onExtraCallback) bundle.getParcelable(((String) objArr2[0]).intern());
            if (onextracallback == null) {
                return;
            }
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, ALCEyeBlink.onWarmupCompleted.onExtraCallbackWithResult(onextracallback));
            int i8 = onTransact + 121;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        char[] cArr;
        char c;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        if (cArr2 != null) {
            int i9 = $11 + 41;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr2[i11]);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.getOffsetAfter("", i4) + 35, 14240 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i11++;
                    i4 = 0;
                    j = 0;
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
        char[] cArr4 = new char[i6];
        System.arraycopy(cArr2, i5, cArr4, 0, i6);
        if (bArr != null) {
            int i12 = $11 + 87;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr = new char[i6];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr = new char[i6];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i13 = $11 + 63;
                $10 = i13 % 128;
                if (i13 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10983 - AndroidCharacter.getMirror('0')), 66 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - KeyEvent.normalizeMetaState(0)), ExpandableListView.getPackedPositionGroup(0L) + 70, 12534 - AndroidCharacter.getMirror('0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i16 = $10 + 33;
            $11 = i16 % 128;
            i = 2;
            int i17 = i16 % 2;
            cArr4 = cArr;
        } else {
            i = 2;
        }
        if (i8 > 0) {
            int i18 = $10 + 45;
            $11 = i18 % 128;
            if (i18 % i == 0) {
                char[] cArr5 = new char[i6];
                i2 = 0;
                System.arraycopy(cArr4, 0, cArr5, 0, i6);
                System.arraycopy(cArr5, 0, cArr4, i6 >>> i8, i8);
                System.arraycopy(cArr5, i8, cArr4, 0, i6 - i8);
            } else {
                i2 = 0;
                char[] cArr6 = new char[i6];
                System.arraycopy(cArr4, 0, cArr6, 0, i6);
                int i19 = i6 - i8;
                System.arraycopy(cArr6, 0, cArr4, i19, i8);
                System.arraycopy(cArr6, i8, cArr4, 0, i19);
            }
        } else {
            i2 = 0;
        }
        if (z) {
            char[] cArr7 = new char[i6];
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i6) {
                    break;
                }
                int i20 = $10 + 23;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[i6 % trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent >>> 1;
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i21 = 0;
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i21;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i6) {
                    break;
                }
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                i21 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{27192, 27299, 27327, 27327, 27299, 27327, 27326, 27301, 27252, 27198, 27198, 27194, 27170, 27157, 27182, 27177, 27180, 27173, 27166, 27145, 27175, 27197, 27192, 27168, 27260, 27174, 27198, 27168, 27152, 27154, 27178, 27176, 27169, 27168, 27252, 27194, 27199, 27168, 27161, 27157, 27194, 27194, 27199, 27168, 27183, 27152, 27168, 27198, 27174, 27181, 27174};
        onExtraCallback = 3916545368186304334L;
    }
}
