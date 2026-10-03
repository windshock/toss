package o;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CatalystInstanceImplJSProfilerTraceListener implements isJSONTypeIgnore {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<CatalystInstanceImplJSProfilerTraceListener> CREATOR;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static long access000 = 0;
    private static char access100 = 0;
    private static int extraCallbackWithResult = 1;
    private static int getInterfaceDescriptor = 1;
    private static char onTransact;
    private static int readTypedObject;
    private final isNumber IAuthTabCallback;
    private final UTF8Decoder IAuthTabCallbackDefault;
    private final String asBinder;
    private final String asInterface;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final boolean onWarmupCompleted;

    public static final class onNavigationEvent implements Parcelable.Creator<CatalystInstanceImplJSProfilerTraceListener> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CatalystInstanceImplJSProfilerTraceListener createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CatalystInstanceImplJSProfilerTraceListener(isNumber.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UTF8Decoder.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CatalystInstanceImplJSProfilerTraceListener[] newArray(int i) {
            return new CatalystInstanceImplJSProfilerTraceListener[i];
        }
    }

    static {
        IAuthTabCallbackStub();
        CREATOR = new onNavigationEvent();
        int i = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public final int describeContents() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalystInstanceImplJSProfilerTraceListener)) {
            return false;
        }
        CatalystInstanceImplJSProfilerTraceListener catalystInstanceImplJSProfilerTraceListener = (CatalystInstanceImplJSProfilerTraceListener) obj;
        if (this.IAuthTabCallback != catalystInstanceImplJSProfilerTraceListener.IAuthTabCallback) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, catalystInstanceImplJSProfilerTraceListener.asInterface)) {
            int i2 = readTypedObject + 113;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, catalystInstanceImplJSProfilerTraceListener.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, catalystInstanceImplJSProfilerTraceListener.asBinder)) {
            int i4 = readTypedObject + 125;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.IAuthTabCallbackDefault != catalystInstanceImplJSProfilerTraceListener.IAuthTabCallbackDefault) {
            return false;
        }
        if (this.onExtraCallback != catalystInstanceImplJSProfilerTraceListener.onExtraCallback) {
            int i6 = extraCallbackWithResult + 85;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onWarmupCompleted != catalystInstanceImplJSProfilerTraceListener.onWarmupCompleted) {
            int i8 = extraCallbackWithResult + 109;
            readTypedObject = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.onNavigationEvent == catalystInstanceImplJSProfilerTraceListener.onNavigationEvent) {
            return true;
        }
        int i10 = extraCallbackWithResult + 77;
        readTypedObject = i10 % 128;
        return i10 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.asInterface.hashCode();
        String str = this.onExtraCallbackWithResult;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.asBinder;
        if (str2 == null) {
            int i2 = readTypedObject + 85;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        UTF8Decoder uTF8Decoder = this.IAuthTabCallbackDefault;
        if (uTF8Decoder != null) {
            iHashCode4 = uTF8Decoder.hashCode();
            int i4 = extraCallbackWithResult + 87;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode4) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onNavigationEvent);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        isNumber isnumber = this.IAuthTabCallback;
        String str = this.asInterface;
        String str2 = this.onExtraCallbackWithResult;
        String str3 = this.asBinder;
        UTF8Decoder uTF8Decoder = this.IAuthTabCallbackDefault;
        boolean z = this.onExtraCallback;
        boolean z2 = this.onWarmupCompleted;
        boolean z3 = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{60505, 40181, 26840, 22209, 56546, 63358, 4763, 12783, 8933, 6920, 14343, 60176, 49669, 13894, 22697, 2480, 38042, 38757, 48588, 29070, 2603, 25287, 42959, 37745, 3605, 44717}, Gravity.getAbsoluteGravity(0, 0) + 26, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(isnumber);
        Object[] objArr2 = new Object[1];
        a(new char[]{26969, 12599, 9809, 44051, 54824, 12336, 2603, 25287, 7372, 56455, 13722, 2751}, 12 - ExpandableListView.getPackedPositionType(0L), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(new char[]{26969, 12599, 63916, 40463, 65108, 24951, 62791, 22041, 13235, 47662, 45891, 39658}, 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str2);
        Object[] objArr4 = new Object[1];
        b(new char[]{42402, 15191, 38921, 30998, 56847, 48929, 7179, 64800, 21034, 13115, 36991, 29016, 54875, 46870}, 40697 - Color.green(0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str3);
        Object[] objArr5 = new Object[1];
        a(new char[]{26969, 12599, 51346, 9064, 43316, 28974, 57337, 57831, 21650, 36156, 6863, 41417, 43464, 16651, 45891, 39658}, 15 - TextUtils.getOffsetAfter("", 0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(uTF8Decoder);
        Object[] objArr6 = new Object[1];
        b(new char[]{42402, 28345, 13250, 50338, 35261, 21136, 26465, 10331, 64836, 34344, 19211, 7201, 8447, 62914, 48805, 17316, 5258, 55660, 57954, 46970, 30757, 3359, 54801, 39674, 44994, 28812}, 51991 - (ViewConfiguration.getScrollBarSize() >> 8), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(z);
        Object[] objArr7 = new Object[1];
        b(new char[]{42402, 61919, 3333, 22702, 62490, 979, 24391, 60151, 1635, 21049, 59793, 1336, 20640, 60502, 15314, 22360, 58096, 15980, 18960, 57752, 15678, 18606, 58460, 13204}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21617, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(z2);
        Object[] objArr8 = new Object[1];
        a(new char[]{26969, 12599, 42774, 38165, 4763, 12783, 5747, 26969, 41538, 43401, 60505, 40181, 26840, 22209, 52920, 42674, 65108, 24951, 62623, 14914, 20734, 16721, 45891, 39658}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(z3);
        Object[] objArr9 = new Object[1];
        b(new char[]{42407}, 21142 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr9);
        sb.append(((String) objArr9[0]).intern());
        String string = sb.toString();
        int i2 = extraCallbackWithResult + 57;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d A[PHI: r0
      0x005d: PHI (r0v13 o.UTF8Decoder) = (r0v9 o.UTF8Decoder), (r0v19 o.UTF8Decoder) binds: [B:8:0x004e, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = o.CatalystInstanceImplJSProfilerTraceListener.extraCallbackWithResult
            int r0 = r0 + 49
            int r1 = r0 % 128
            o.CatalystInstanceImplJSProfilerTraceListener.readTypedObject = r1
            int r0 = r0 % r5
            r1 = 0
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            if (r0 == 0) goto L34
            o.isNumber r0 = r3.IAuthTabCallback
            java.lang.String r0 = r0.name()
            r4.writeString(r0)
            java.lang.String r0 = r3.asInterface
            r4.writeString(r0)
            java.lang.String r0 = r3.onExtraCallbackWithResult
            r4.writeString(r0)
            java.lang.String r0 = r3.asBinder
            r4.writeString(r0)
            o.UTF8Decoder r0 = r3.IAuthTabCallbackDefault
            r2 = 23
            int r2 = r2 / r1
            if (r0 != 0) goto L5d
            goto L50
        L34:
            o.isNumber r0 = r3.IAuthTabCallback
            java.lang.String r0 = r0.name()
            r4.writeString(r0)
            java.lang.String r0 = r3.asInterface
            r4.writeString(r0)
            java.lang.String r0 = r3.onExtraCallbackWithResult
            r4.writeString(r0)
            java.lang.String r0 = r3.asBinder
            r4.writeString(r0)
            o.UTF8Decoder r0 = r3.IAuthTabCallbackDefault
            if (r0 != 0) goto L5d
        L50:
            r4.writeInt(r1)
            int r0 = o.CatalystInstanceImplJSProfilerTraceListener.readTypedObject
            int r0 = r0 + 79
            int r1 = r0 % 128
            o.CatalystInstanceImplJSProfilerTraceListener.extraCallbackWithResult = r1
            int r0 = r0 % r5
            goto L68
        L5d:
            r5 = 1
            r4.writeInt(r5)
            java.lang.String r5 = r0.name()
            r4.writeString(r5)
        L68:
            boolean r5 = r3.onExtraCallback
            r4.writeInt(r5)
            boolean r5 = r3.onWarmupCompleted
            r4.writeInt(r5)
            boolean r5 = r3.onNavigationEvent
            r4.writeInt(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CatalystInstanceImplJSProfilerTraceListener.writeToParcel(android.os.Parcel, int):void");
    }

    public CatalystInstanceImplJSProfilerTraceListener(@NotNull isNumber isnumber, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable UTF8Decoder uTF8Decoder, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(isnumber, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = isnumber;
        this.asInterface = str;
        this.onExtraCallbackWithResult = str2;
        this.asBinder = str3;
        this.IAuthTabCallbackDefault = uTF8Decoder;
        this.onExtraCallback = z;
        this.onWarmupCompleted = z2;
        this.onNavigationEvent = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CatalystInstanceImplJSProfilerTraceListener(isNumber isnumber, String str, String str2, String str3, UTF8Decoder uTF8Decoder, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        UTF8Decoder uTF8Decoder2;
        boolean z4;
        boolean z5;
        if ((i & 4) != 0) {
            int i2 = extraCallbackWithResult + 93;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str4 = null;
        } else {
            str4 = str2;
        }
        String str5 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            int i4 = extraCallbackWithResult + 61;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            uTF8Decoder2 = null;
        } else {
            uTF8Decoder2 = uTF8Decoder;
        }
        if ((i & 32) != 0) {
            int i5 = 2 % 2;
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 64) != 0) {
            int i6 = readTypedObject + 39;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        this(isnumber, str, str4, str5, uTF8Decoder2, z4, z5, (i & 128) != 0 ? false : z3);
    }

    public isNumber IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 51;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.asInterface;
            int i4 = 52 / 0;
        } else {
            str = this.asInterface;
        }
        int i5 = i2 + 33;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return str;
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 51;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i2 + 7;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 81;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asBinder;
        int i5 = i2 + 125;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean asBinder() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i3 + 109;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return z;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 24, 19628 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 59 - TextUtils.indexOf("", ""), 6383 - TextUtils.indexOf("", ""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            int i4 = $11 + 85;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 59 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i6 = $11 + 3;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 85;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 27;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback_Parcel ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(access100);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cKeyCodeFromString, doubleTapTimeout, scrollDefaultDelay, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackStub)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, 12434 - TextUtils.getCapsMode("", 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, 19901 - (ViewConfiguration.getLongPressTimeout() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallbackStub() {
        onTransact = (char) 3655;
        IAuthTabCallbackStub = (char) 49590;
        IAuthTabCallback_Parcel = (char) 46834;
        access100 = (char) 44468;
        access000 = -5520804262549249863L;
    }
}
