package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.ServiceTermsAgreeRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ServiceTermsAgreeRequest {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static byte[] onWarmupCompleted;
    private final String authToken;
    private final String txId;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private static int asBinder = 0;

    private static String $$c(int i, byte b, byte b2) {
        int i2 = 115 - (i * 2);
        int i3 = 4 - (b2 * 3);
        byte[] bArr = $$a;
        int i4 = b * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 = i3 + i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i3];
            i3++;
            i2 += i7;
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        onExtraCallback();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = asBinder + 117;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 35;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ServiceTermsAgreeRequest)) {
            int i4 = onTransact + 3;
            IAuthTabCallbackStub = i4 % 128;
            return !(i4 % 2 == 0);
        }
        ServiceTermsAgreeRequest serviceTermsAgreeRequest = (ServiceTermsAgreeRequest) obj;
        if (!Intrinsics.areEqual(this.txId, serviceTermsAgreeRequest.txId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.authToken, serviceTermsAgreeRequest.authToken)) {
            return true;
        }
        int i5 = onTransact + 93;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.txId.hashCode() * 31) + this.authToken.hashCode();
        int i4 = onTransact + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.txId;
        String str2 = this.authToken;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((-40) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 1260708453, (-1434050176) - Color.green(0), (-35) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) (65500 - AndroidCharacter.getMirror('0')), (byte) ((-1) - TextUtils.lastIndexOf("", '0')), 1260708481 + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1434050215) - KeyEvent.keyCodeFromString(""), (-54) - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a((short) (TextUtils.getTrimmedLength("") + 86), (byte) Color.red(0), ExpandableListView.getPackedPositionType(0L) + 1260708492, 8582 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0') - 64, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return string;
    }

    public /* synthetic */ ServiceTermsAgreeRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onTransact + 3;
            IAuthTabCallbackStub = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 != 0 ? ServiceTermsAgreeRequest$.serializer.INSTANCE : ServiceTermsAgreeRequest$.serializer.INSTANCE).getDescriptor());
            int i3 = IAuthTabCallbackStub + 109;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.txId = str;
        this.authToken = str2;
    }

    public ServiceTermsAgreeRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.txId = str;
        this.authToken = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(ServiceTermsAgreeRequest serviceTermsAgreeRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, serviceTermsAgreeRequest.txId);
        vylVar.onExtraCallback(serialDescriptor, 1, serviceTermsAgreeRequest.authToken);
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.green(0) + 42, 22439 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            char c = 3;
            if (i7 != 0) {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 91;
                        $10 = i9 % 128;
                        int i10 = i9 % i5;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) ($$a[c] - 1);
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.resolveSizeAndState(0, 0, 0)), TextUtils.getOffsetBefore("", 0) + 55, 2166 - ExpandableListView.getPackedPositionChild(0L), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8++;
                            i5 = 2;
                            c = 3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $11 + 55;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 43425), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    int i13 = $10 + 103;
                    $11 = i13 % 128;
                    i4 = 2;
                    int i14 = i13 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - i4) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i7;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 86, 9566 - TextUtils.lastIndexOf("", '0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i15 = 0;
                    while (i15 < length2) {
                        int i16 = $10;
                        int i17 = i16 + 81;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                        i15++;
                        int i19 = i16 + 3;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    static void onExtraCallback() {
        IAuthTabCallback = 278709652;
        onNavigationEvent = -1538795446;
        onExtraCallbackWithResult = -247593253;
        onWarmupCompleted = new byte[]{8, 74, -16, 35, 123, -45, 32, 61, 31, 35, 59, 50, 28, 47, 18, 58, 69, -3, 37, 42, 60, 48, 30, 33, 41, 18, 35, 60, 49, 43, 85, 70, 88, 103, 72, 64, 91, 96, -99, 64, 8, 8, 8};
    }
}
