package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.IssueAuthTokenRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda1;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class IssueAuthTokenRequest {
    public static final Companion Companion;
    private static long IAuthTabCallback;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String caAppId;
    private final String caRsaPubKey;
    private final int purpose;
    private final String sakCert;
    private final String signedWalletId;
    private final String walletAuthNo;
    private final String walletId;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onNavigationEvent = 0;

    private static String $$c(short s, short s2, int i) {
        int i2 = 105 - (i * 8);
        byte[] bArr = $$a;
        int i3 = s2 * 3;
        int i4 = 3 - (s * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            i4++;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i4]) + i2;
            i5 = i6;
        }
    }

    static {
        onExtraCallback = 1;
        onWarmupCompleted();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onNavigationEvent + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IssueAuthTokenRequest)) {
            return false;
        }
        IssueAuthTokenRequest issueAuthTokenRequest = (IssueAuthTokenRequest) obj;
        if (!Intrinsics.areEqual(this.caAppId, issueAuthTokenRequest.caAppId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.walletAuthNo, issueAuthTokenRequest.walletAuthNo)) {
            int i2 = asInterface + 89;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.walletId, issueAuthTokenRequest.walletId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.signedWalletId, issueAuthTokenRequest.signedWalletId)) {
            int i4 = IAuthTabCallbackDefault + 83;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sakCert, issueAuthTokenRequest.sakCert) || !Intrinsics.areEqual(this.caRsaPubKey, issueAuthTokenRequest.caRsaPubKey)) {
            return false;
        }
        if (this.purpose == issueAuthTokenRequest.purpose) {
            return true;
        }
        int i6 = IAuthTabCallbackDefault + 69;
        asInterface = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.caAppId.hashCode() * 31) + this.walletAuthNo.hashCode()) * 31) + this.walletId.hashCode()) * 31) + this.signedWalletId.hashCode()) * 31) + this.sakCert.hashCode()) * 31) + this.caRsaPubKey.hashCode()) * 31) + Integer.hashCode(this.purpose);
        int i4 = asInterface + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.caAppId;
        String str2 = this.walletAuthNo;
        String str3 = this.walletId;
        String str4 = this.signedWalletId;
        String str5 = this.sakCert;
        String str6 = this.caRsaPubKey;
        int i2 = this.purpose;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 30, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17742), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        b(8 - TextUtils.indexOf("", "", 0), 15 - Color.blue(0), new char[]{25, '\n', 17, 17, 6, 28, 65477, 65489, 65506, 20, 65523, '\r', 25, 26, 65510}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 121, true, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        b(7 - (Process.myTid() >> 22), 11 - Color.green(0), new char[]{21, 21, 14, 29, 65522, '\r', 65510, 65493, 65481, ' ', '\n'}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 117, false, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str3);
        Object[] objArr4 = new Object[1];
        a(30 - KeyEvent.keyCodeFromString(""), TextUtils.getTrimmedLength("") + 17, (char) (32286 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str4);
        Object[] objArr5 = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{16, 29, 31, 65512, 65495, 65483, 30, '\f', 22, 65518}, 115 - (Process.myTid() >> 22), false, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str5);
        Object[] objArr6 = new Object[1];
        b((ViewConfiguration.getPressedStateDuration() >> 16) + 2, 14 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{'\"', 65510, 65493, 65481, '\f', '\n', 65531, 28, '\n', 65529, 30, 11, 65524, 14}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 118, false, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str6);
        Object[] objArr7 = new Object[1];
        b((ViewConfiguration.getJumpTapTimeout() >> 16) + 2, KeyEvent.normalizeMetaState(0) + 10, new char[]{'\n', 65506, 65489, 65477, 21, 26, 23, 21, 20, 24}, View.MeasureSpec.makeMeasureSpec(0, 0) + 121, false, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(i2);
        Object[] objArr8 = new Object[1];
        a(47 - ExpandableListView.getPackedPositionGroup(0L), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (char) View.MeasureSpec.getSize(0), objArr8);
        sb.append(((String) objArr8[0]).intern());
        String string = sb.toString();
        int i3 = IAuthTabCallbackDefault + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public /* synthetic */ IssueAuthTokenRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, okycx okycxVar) {
        if (127 != (i & 127)) {
            int i3 = IAuthTabCallbackDefault + 7;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 127, IssueAuthTokenRequest$.serializer.INSTANCE.getDescriptor());
            int i5 = asInterface + 77;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this.caAppId = str;
        this.walletAuthNo = str2;
        this.walletId = str3;
        this.signedWalletId = str4;
        this.sakCert = str5;
        this.caRsaPubKey = str6;
        this.purpose = i2;
    }

    public IssueAuthTokenRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.caAppId = str;
        this.walletAuthNo = str2;
        this.walletId = str3;
        this.signedWalletId = str4;
        this.sakCert = str5;
        this.caRsaPubKey = str6;
        this.purpose = i;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(IssueAuthTokenRequest issueAuthTokenRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, issueAuthTokenRequest.caAppId);
        vylVar.onExtraCallback(serialDescriptor, 1, issueAuthTokenRequest.walletAuthNo);
        vylVar.onExtraCallback(serialDescriptor, 2, issueAuthTokenRequest.walletId);
        vylVar.onExtraCallback(serialDescriptor, 3, issueAuthTokenRequest.signedWalletId);
        vylVar.onExtraCallback(serialDescriptor, 4, issueAuthTokenRequest.sakCert);
        vylVar.onExtraCallback(serialDescriptor, 5, issueAuthTokenRequest.caRsaPubKey);
        vylVar.onExtraCallback(serialDescriptor, 6, issueAuthTokenRequest.purpose);
        int i4 = IAuthTabCallbackDefault + 33;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 75;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.indexOf((CharSequence) "", '0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16, 10973 - TextUtils.indexOf("", "", 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 46134), 31 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 44 - TextUtils.getOffsetAfter("", 0), 1494 - View.resolveSize(0, 0), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 71;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 49123), Color.argb(0, 0, 0, 0) + 44, TextUtils.getOffsetBefore("", 0) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35125), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, TextUtils.getOffsetAfter("", 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12843), (-16777161) - Color.rgb(0, 0, 0), TextUtils.getOffsetBefore("", 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i7 = $10 + 3;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i9 = $10 + 51;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getWindowTouchSlop() >> 8)), MotionEvent.axisFromString("") + 56, View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 55, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{43218, 13669, 37874, 28745, 57034, 47899, 6560, 58932, 17563, 8506, 36726, 28159, 51810, 43228, 13695, 37821, 28730, 57011, 47892, 6559, 59371, 17442, 8934, 36689, 28130, 51758, 43193, 13581, 37779, 28767, 37861, 3684, 43168, 19207, 58778, 32870, 8930, 56694, 32758, 6749, 46119, 22186, 61744, 37780, 3638, 43246, 19236, 60925};
        IAuthTabCallback = -1945031380184371111L;
        onWarmupCompleted = 478308919;
    }
}
