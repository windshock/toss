package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.VerifyRealNameRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VerifyRealNameRequest {
    public static final Companion Companion;
    private static char[] IAuthTabCallback;
    private static short[] IAuthTabCallbackDefault;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private final String authToken;
    private final String buildNo;
    private final String c1;
    private final String deviceDefaultName;
    private final String deviceNickname;
    private final String iv;
    private final String modelName;
    private final String osType;
    private final String osVersion;
    private final String txId;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = 115 - (b2 * 3);
        int i5 = b * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i3];
            i4 += i7;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i6) {
            }
        }
    }

    static {
        onTransact = 0;
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = asInterface + 31;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyRealNameRequest)) {
            return false;
        }
        VerifyRealNameRequest verifyRealNameRequest = (VerifyRealNameRequest) obj;
        if (!Intrinsics.areEqual(this.txId, verifyRealNameRequest.txId) || !Intrinsics.areEqual(this.authToken, verifyRealNameRequest.authToken)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.c1, verifyRealNameRequest.c1)) {
            int i2 = IAuthTabCallbackStub + 57;
            asBinder = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.iv, verifyRealNameRequest.iv)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.osType, verifyRealNameRequest.osType)) {
            int i3 = IAuthTabCallbackStub + 13;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.osVersion, verifyRealNameRequest.osVersion)) {
            int i5 = IAuthTabCallbackStub + 93;
            asBinder = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.modelName, verifyRealNameRequest.modelName) || !Intrinsics.areEqual(this.buildNo, verifyRealNameRequest.buildNo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceNickname, verifyRealNameRequest.deviceNickname)) {
            int i6 = asBinder + 117;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.deviceDefaultName, verifyRealNameRequest.deviceDefaultName)) {
            return true;
        }
        int i8 = asBinder + 123;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((this.txId.hashCode() * 31) + this.authToken.hashCode()) * 31) + this.c1.hashCode()) * 31) + this.iv.hashCode()) * 31) + this.osType.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.modelName.hashCode()) * 31) + this.buildNo.hashCode()) * 31) + this.deviceNickname.hashCode()) * 31) + this.deviceDefaultName.hashCode();
        int i4 = IAuthTabCallbackStub + 39;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.txId;
        String str2 = this.authToken;
        String str3 = this.c1;
        String str4 = this.iv;
        String str5 = this.osType;
        String str6 = this.osVersion;
        String str7 = this.modelName;
        String str8 = this.buildNo;
        String str9 = this.deviceNickname;
        String str10 = this.deviceDefaultName;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 27, 50, 15}, true, null, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new int[]{27, 12, 48, 12}, true, new byte[]{1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(new int[]{39, 5, 186, 0}, true, new byte[]{1, 0, 0, 1, 0}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str3);
        Object[] objArr4 = new Object[1];
        a(new int[]{44, 5, 119, 0}, true, new byte[]{0, 1, 1, 1, 0}, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str4);
        Object[] objArr5 = new Object[1];
        a(new int[]{49, 9, 5, 2}, true, new byte[]{1, 0, 1, 0, 1, 1, 1, 1, 0}, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str5);
        Object[] objArr6 = new Object[1];
        b((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126), (short) (102 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 1964749600, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 78, Color.argb(0, 0, 0, 0) + 692075332, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str6);
        Object[] objArr7 = new Object[1];
        a(new int[]{58, 12, 0, 10}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(str7);
        Object[] objArr8 = new Object[1];
        b((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 53), (short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15), (-1964749588) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 78, KeyEvent.keyCodeFromString("") + 692075332, objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(str8);
        Object[] objArr9 = new Object[1];
        b((byte) (KeyEvent.keyCodeFromString("") - 32), (short) ((-52) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (Process.myPid() >> 22) - 1964749578, (ViewConfiguration.getFadingEdgeLength() >> 16) - 78, 692075332 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(str9);
        Object[] objArr10 = new Object[1];
        b((byte) ((-66) - Color.green(0)), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 108), (-1964749562) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) - 78, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 692075331, objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(str10);
        Object[] objArr11 = new Object[1];
        b((byte) (MotionEvent.axisFromString("") - 12), (short) (TextUtils.indexOf("", "", 0, 0) - 30), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1964749541, (ViewConfiguration.getWindowTouchSlop() >> 8) - 78, 692075328 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
        sb.append(((String) objArr11[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ VerifyRealNameRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1023;
        if (1023 != (i & 1023)) {
            int i3 = asBinder + 51;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = VerifyRealNameRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 30231;
            } else {
                descriptor = VerifyRealNameRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.txId = str;
        this.authToken = str2;
        this.c1 = str3;
        this.iv = str4;
        this.osType = str5;
        this.osVersion = str6;
        this.modelName = str7;
        this.buildNo = str8;
        this.deviceNickname = str9;
        this.deviceDefaultName = str10;
    }

    public VerifyRealNameRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.txId = str;
        this.authToken = str2;
        this.c1 = str3;
        this.iv = str4;
        this.osType = str5;
        this.osVersion = str6;
        this.modelName = str7;
        this.buildNo = str8;
        this.deviceNickname = str9;
        this.deviceDefaultName = str10;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(VerifyRealNameRequest verifyRealNameRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, verifyRealNameRequest.txId);
        vylVar.onExtraCallback(serialDescriptor, 1, verifyRealNameRequest.authToken);
        vylVar.onExtraCallback(serialDescriptor, 2, verifyRealNameRequest.c1);
        vylVar.onExtraCallback(serialDescriptor, 3, verifyRealNameRequest.iv);
        vylVar.onExtraCallback(serialDescriptor, 4, verifyRealNameRequest.osType);
        vylVar.onExtraCallback(serialDescriptor, 5, verifyRealNameRequest.osVersion);
        vylVar.onExtraCallback(serialDescriptor, 6, verifyRealNameRequest.modelName);
        vylVar.onExtraCallback(serialDescriptor, 7, verifyRealNameRequest.buildNo);
        vylVar.onExtraCallback(serialDescriptor, 8, verifyRealNameRequest.deviceNickname);
        vylVar.onExtraCallback(serialDescriptor, 9, verifyRealNameRequest.deviceDefaultName);
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        long j = -1;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror(c) + 35235), 36 - (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)), 14239 - ExpandableListView.getPackedPositionGroup(0L), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = -1;
                    c = '0';
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
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i7 = $10 + 113;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 10936), 65 - TextUtils.getOffsetBefore("", 0), (Process.myTid() >> 22) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 10936), 65 - (ViewConfiguration.getTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 29 - Color.green(0), TextUtils.getCapsMode("", 0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 49467), TextUtils.indexOf("", "", 0) + 70, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
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
            int i12 = $11 + 47;
            $10 = i12 % 128;
            char c3 = 2;
            int i13 = i12 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[c3]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                c3 = 2;
            }
        }
        String str = new String(cArr3);
        int i14 = $10 + 31;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 43424), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, 22439 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i9 = -1;
            if (iIntValue == -1) {
                int i10 = $10 + 15;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 55;
                        $11 = i13 % 128;
                        int i14 = i13 % i7;
                        Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) i9;
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 55 - Color.red(0), Process.getGidForName("") + 2168, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i12++;
                        i7 = 2;
                        i9 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i15 = $10 + 3;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        byte[] bArr3 = onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43423), 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] | (-4629411779493505016L))) % ((int) (onExtraCallback - (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 42 - (Process.myTid() >> 22), 22439 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i6;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackDefault[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))) + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), Color.alpha(0) + 86, Color.red(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onNavigationEvent;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr6[i16] = (byte) (bArr5[i16] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i17 = $10 + 9;
                    $11 = i17 % 128;
                    boolean z = i17 % 2 != 0;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            int i18 = $10 + 85;
                            $11 = i18 % 128;
                            if (i18 % 2 == 0) {
                                byte[] bArr7 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent << 1;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback - (((byte) (((byte) (bArr7[r8] - 4629411779493505016L)) << s)) ^ b);
                            } else {
                                byte[] bArr8 = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                i5 = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr8[r8] ^ (-4629411779493505016L))) + s)) ^ b);
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) i5;
                        } else {
                            short[] sArr = IAuthTabCallbackDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{27338, 27353, 27345, 27357, 27342, 27344, 27357, 27353, 27338, 27365, 27350, 27349, 27370, 27353, 27334, 27169, 27352, 27189, 27364, 27368, 27156, 27368, 27371, 27353, 27369, 27373, 27353, 27256, 27339, 27351, 27350, 27347, 27359, 27328, 27344, 27370, 27349, 27198, 27160, 27189, 27327, 27466, 27317, 27310, 27156, 27294, 27304, 27381, 27347, 27228, 27237, 27255, 27160, 27169, 27191, 27173, 27174, 27192, 27256, 27168, 27175, 27178, 27174, 27155, 27161, 27177, 27175, 27167, 27258, 27240};
        onWarmupCompleted = -782472408;
        onExtraCallback = -1538795451;
        onExtraCallbackWithResult = 1928862944;
        onNavigationEvent = new byte[]{-73, 65, 17, 26, 42, 31, 3, 1, 61, 28, -63, 44, -75, -29, 14, -57, -75, 32, -71, 16, 111, -71, -52, 100, 68, 40, 79, 31, 20, 70, 39, 53, 30, 70, 79, 45, 29, -48, 64, -49, -15, -47, 77, 72, -1, 65, -44, 53, -48, 90, 58, -4, 71, -33, -24, 74, 90, -123, -43, -68};
    }
}
