package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.hExternalSyntheticLambda11;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hExternalSyntheticLambda12 implements r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ {
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static char[] onExtraCallback = {31950, 36711, 39821, 42956, 45683, 48808, 51927, 54554, 57767, 60888, 63513, 1212, 4322};
    private static long IAuthTabCallback = 2858664468163599994L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3;
        int i4 = 4 - (b2 * 3);
        byte[] bArr = $$a;
        int i5 = 97 - (b * 2);
        int i6 = (i * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i5 = i6;
            i3 = 0;
            i5 += i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i5 += i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        String strIAuthTabCallback = hExternalSyntheticLambda13.IAuthTabCallback(settext.onExtraCallbackWithResult(), "eventName");
        if (strIAuthTabCallback == null || StringsKt.isBlank(strIAuthTabCallback)) {
            strIAuthTabCallback = null;
        }
        if (strIAuthTabCallback == null) {
            Object[] objArr = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 13 - Color.alpha(0), (char) (37204 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "Invalid eventName", ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
            int i2 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        hExternalSyntheticLambda11.onExtraCallback onExtraCallback2 = hExternalSyntheticLambda13.onExtraCallback(strIAuthTabCallback, jsonObject, settext.onExtraCallbackWithResult());
        if (!(onExtraCallback2 instanceof hExternalSyntheticLambda11.onExtraCallbackWithResult)) {
            if (!(onExtraCallback2 instanceof hExternalSyntheticLambda11.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new getAdUnitId(IAuthTabCallback(reactNativeContentOwner), strIAuthTabCallback, onExtraCallback2.onExtraCallbackWithResult()));
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
            return;
        }
        int i4 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String strOnNavigationEvent = ((hExternalSyntheticLambda11.onExtraCallbackWithResult) onExtraCallback2).onNavigationEvent();
        Object[] objArr2 = new Object[1];
        a(TextUtils.indexOf("", ""), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (37203 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr2);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strOnNavigationEvent, ((String) objArr2[0]).intern(), (Map) null, 4, (Object) null);
    }

    private final String IAuthTabCallback(ReactNativeContentOwner reactNativeContentOwner) {
        onNativeAdLoaded onnativeadloadedOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FragmentActivity activity = reactNativeContentOwner.getActivity();
        if (activity == null) {
            return null;
        }
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intent intent = activity.getIntent();
        if (intent == null || (onnativeadloadedOnExtraCallbackWithResult = onNativeAdLoaded.Companion.onExtraCallbackWithResult(intent.getExtras())) == null) {
            return null;
        }
        return onnativeadloadedOnExtraCallbackWithResult.IAuthTabCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        float f;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            f = 0.0f;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 17 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 46134), 31 - (ViewConfiguration.getScrollBarSize() >> 8), Drawable.resolveOpacity(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 49123), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, View.getDefaultSize(0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 35;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 5;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            f = 0.0f;
        }
        objArr[0] = new String(cArr);
    }
}
