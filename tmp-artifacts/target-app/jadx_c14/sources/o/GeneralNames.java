package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.AuthCsHandler$;
import viva.republica.toss.verify.auth.AuthCsWebActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GeneralNames implements ALCFaceResult {
    public static final onExtraCallbackWithResult Companion;
    public static final String IAuthTabCallback;
    private static byte[] IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static int asBinder;
    private static short[] asInterface;
    public static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static long onTransact;
    public static final String onWarmupCompleted;
    private static final byte[] $$a = {4, -80, 45, 109};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = o.GeneralNames.$$a
            int r6 = r6 * 4
            int r6 = 115 - r6
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GeneralNames.$$c(short, int, short):java.lang.String");
    }

    static {
        IAuthTabCallbackStubProxy = 0;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((short) (KeyEvent.getMaxKeyCode() >> 16), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 938709450 - ExpandableListView.getPackedPositionChild(0L), (-503985018) + (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-28) - (ViewConfiguration.getTouchSlop() >> 8), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 938709463 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) - 503984998, KeyEvent.keyCodeFromString("") - 34, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(new char[]{22452, 11682, 41881, 14733}, 31250 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
        onExtraCallback = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(new char[]{22455, 3823, 58668, 23663, 12967, 59892, 16425, 10051, 40328, 29904, 11026, 33370, 30861, 57148, 46704, 27836}, (Process.myTid() >> 22) + 22853, objArr4);
        IAuthTabCallback = ((String) objArr4[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = access100 + 69;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        Unit unit = (Unit) onWarmupCompleted(-1810640060, forceDomainCheck.IAuthTabCallback(), 1810640061, iIAuthTabCallback, new Object[]{th}, iIAuthTabCallback2, forceDomainCheck.IAuthTabCallback());
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        GeneralNames generalNames = (GeneralNames) objArr[1];
        Intent intent = (Intent) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settopguidebackgroundcolor, generalNames, intent);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i4) | i7)) | i9;
        int i11 = (~(i4 | i7)) | i9;
        int i12 = ~(i8 | i3);
        int i13 = i3 + i + i5 + (104229478 * i2) + ((-1414784667) * i6);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-393484327)) - 513802240) + ((-393484327) * i) + (i10 * 23337000) + (i11 * 23337000) + (23337000 * i12) + ((-370147328) * i5) + ((-1784676352) * i2) + ((-1146093568) * i6) + ((-1043988480) * i14);
        int i16 = ((i3 * 256725217) - 1927268364) + (i * 256725217) + (i10 * 872) + (i11 * 872) + (i12 * 872) + (i5 * 256726089) + (i2 * (-1692676330)) + (i6 * (-87465523)) + (i14 * 964034560);
        return i15 + ((i16 * i16) * (-1055260672)) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallback();
        }
        super/*o.drawTextBox*/.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = getInterfaceDescriptor + 27;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i3 = IAuthTabCallback_Parcel + 121;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = IAuthTabCallback_Parcel + 49;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        b(new char[]{22455, 3823, 58668, 23663, 12967, 59892, 16425, 10051, 40328, 29904, 11026, 33370, 30861, 57148, 46704, 27836}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22852, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object obj = null;
        if (i2 == -1) {
            int i4 = getInterfaceDescriptor + 91;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (i == 300) {
                ALCFaceBox.onWarmupCompleted(settopguidebackgroundcolor, new JsonObject());
                int i6 = IAuthTabCallback_Parcel + 105;
                getInterfaceDescriptor = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        onWarmupCompleted(settopguidebackgroundcolor, strOnNavigationEvent);
        int i7 = getInterfaceDescriptor + 45;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onTransact ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 59, TextUtils.getCapsMode("", 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 85;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 59, ImageFormat.getBitsPerPixel(0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = 53 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 59 - View.MeasureSpec.getMode(0), 6383 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        String str = new String(cArr2);
        int i8 = $10 + 63;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            webViewContentOwner.getActivity();
            throw null;
        }
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        FragmentActivity activity = webViewContentOwner.getActivity();
        if (activity == null) {
            int i3 = getInterfaceDescriptor + 43;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) Color.green(0), 938709469 - View.combineMeasuredStates(0, 0), (-503984968) + (ViewConfiguration.getLongPressTimeout() >> 16), (-32) - KeyEvent.getDeadChar(0, 0), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a((short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), MotionEvent.axisFromString("") + 938709478, Color.green(0) - 503984983, (-30) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        b(new char[]{22419, 61292, 9808, 32091, 46090, 51996, 512, 23034}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47339, objArr3);
        String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr3[0]).intern(), "");
        Object[] objArr4 = new Object[1];
        b(new char[]{22419, 42638, 46497, 33997, 37866, 57916, 61748}, 61723 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        Object[] objArr5 = new Object[1];
        b(new char[]{22417, 28197, 9453, 64161, 45408, 30508, 3556, 50050, 39534}, 14782 - ImageFormat.getBitsPerPixel(0), objArr5);
        String strOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr5[0]).intern(), "");
        onExtraCallbackWithResult(webViewContentOwner, settext, settopguidebackgroundcolor);
        int i4 = onNavigationEvent.onExtraCallback[hideOffscreenVirtualViewsOnIOS.valueOf(strOnNavigationEvent3).ordinal()];
        if (i4 == 1) {
            activity.startActivity(AuthCsWebActivity.Companion.onExtraCallbackWithResult(activity, strOnNavigationEvent, strOnNavigationEvent2, strOnNavigationEvent3, strOnNavigationEvent4, strOnNavigationEvent5));
            int i5 = getInterfaceDescriptor + 123;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
                return;
            }
            return;
        }
        int i7 = IAuthTabCallback_Parcel + 75;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 != 0 ? i4 != 2 : i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        IAuthTabCallback(activity, new setCurrentIndex(strOnNavigationEvent, strOnNavigationEvent5, strOnNavigationEvent2, strOnNavigationEvent3, strOnNavigationEvent4));
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, GeneralNames generalNames, Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b(new char[]{22455, 3823, 58668, 23663, 12967, 59892, 16425, 10051, 40328, 29904, 11026, 33370, 30861, 57148, 46704, 27836}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22853, objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i4 = getInterfaceDescriptor + 51;
            int i5 = i4 % 128;
            IAuthTabCallback_Parcel = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 69;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            stringExtra = "";
        }
        if (StringsKt.isBlank(stringExtra)) {
            ALCFaceBox.onWarmupCompleted(settopguidebackgroundcolor, new JsonObject());
        } else {
            generalNames.onWarmupCompleted(settopguidebackgroundcolor, stringExtra);
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 938709451 + View.resolveSize(0, 0), (-503985016) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) - 28, objArr2);
        convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr2[0]).intern(), th);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 75;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(WebViewContentOwner webViewContentOwner, setText settext, setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = override.onNavigationEvent.onWarmupCompleted().onWarmupCompleted(new AuthCsHandler$.ExternalSyntheticLambda1(new AuthCsHandler$.ExternalSyntheticLambda0(settopguidebackgroundcolor, this)), new AuthCsHandler$.ExternalSyntheticLambda3(new AuthCsHandler$.ExternalSyntheticLambda2()));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted, webViewContentOwner);
        int i2 = IAuthTabCallback_Parcel + 65;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
    }

    private final void IAuthTabCallback(FragmentActivity fragmentActivity, setCurrentIndex setcurrentindex) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        fragmentActivity.startActivityForResult(overrideEventDispatcher.onNavigationEvent.IAuthTabCallback(fragmentActivity, setcurrentindex), 300);
        int i4 = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, (String) null, str, (Map) null, 5, (Object) null);
        int i4 = getInterfaceDescriptor + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $11 + 71;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i10 = $11 + 17;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArr = IAuthTabCallbackDefault;
                long j2 = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 43;
                        $11 = i13 % 128;
                        if (i13 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1))), 55 - (ViewConfiguration.getTouchSlop() >> 8), 2167 - KeyEvent.keyCodeFromString(""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i12])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0') + 56, 2215 - AndroidCharacter.getMirror('0'), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i12++;
                        }
                        i6 = 2;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i14 = $11 + 93;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    byte[] bArr3 = IAuthTabCallbackDefault;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), KeyEvent.keyCodeFromString("") + 42, ExpandableListView.getPackedPositionType(0L) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (asInterface[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i16 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j));
                if (z) {
                    int i17 = $11 + 47;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i16 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asBinder), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 86, Color.red(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallbackDefault;
                if (bArr4 != null) {
                    int i19 = $10 + 83;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i21 = 0; i21 < length2; i21++) {
                        bArr5[i21] = (byte) (bArr4[i21] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        int i22 = $11 + 29;
                        $10 = i22 % 128;
                        if (i22 % 2 != 0) {
                            byte[] bArr6 = IAuthTabCallbackDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >>> 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback * (((byte) (((byte) (bArr6[r8] * (-4629411779493505016L))) >>> s)) ^ b);
                        } else {
                            byte[] bArr7 = IAuthTabCallbackDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                    } else {
                        short[] sArr = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, GeneralNames generalNames, Intent intent) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onWarmupCompleted(70121966, forceDomainCheck.IAuthTabCallback(), -70121966, iIAuthTabCallback, new Object[]{settopguidebackgroundcolor, generalNames, intent}, iIAuthTabCallback2, forceDomainCheck.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onWarmupCompleted(-1810640060, forceDomainCheck.IAuthTabCallback(), 1810640061, iIAuthTabCallback, new Object[]{th}, iIAuthTabCallback2, forceDomainCheck.IAuthTabCallback());
    }

    static void IAuthTabCallback() {
        onNavigationEvent = 1816901181;
        IAuthTabCallbackStub = -1538795487;
        asBinder = -1169298510;
        IAuthTabCallbackDefault = new byte[]{5, -15, 0, -2, 5, 17, -35, 56, -45, -4, -9, 60, 8, 6, 10, 8, -26, 10, 19, -35, 9, 6, -8, 12, 4, -5, -3, -1, 45, -32, 15, -1, 8, 5, -15, 13, 8, 8, 8, 8};
        onTransact = 4068120303658062533L;
    }
}
