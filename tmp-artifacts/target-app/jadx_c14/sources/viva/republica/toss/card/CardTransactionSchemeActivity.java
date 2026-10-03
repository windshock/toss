package viva.republica.toss.card;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.features.password.api.annotation.RequiresAuth;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SessionTrackerb;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UTF8Decoder;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresAuth(onExtraCallback = 50, onExtraCallbackWithResult = true, onWarmupCompleted = UTF8Decoder.HOME_CARD_DETAIL)
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardTransactionSchemeActivity extends Hilt_CardTransactionSchemeActivity {
    private static short[] IAuthTabCallbackDefault;

    @Inject
    public zzad environments;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {120, 11, 65, 93};
    private static final int $$b = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access100 = 1;
    private static int asInterface = -1409917206;
    private static int asBinder = -1538795504;
    private static int onTransact = 1258176744;
    private static byte[] IAuthTabCallbackStub = {6, -52, 54, -49, 60, -40, -53, 39, -52, -60, 38, 55, -116, 2, 59, -40, 55, -3, 114, -56, -58, -4, 3, 49, 55, -50, -16, -55, 60, 14, -55, -51, 50, -53, -60, 60, 50, -53};

    private static String $$c(byte b, short s, byte b2) {
        byte[] bArr = $$a;
        int i = (b2 * 4) + 115;
        int i2 = b * 3;
        int i3 = (s * 4) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i = i3 + i2;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            int i5 = bArr[i3];
            i3++;
            i += i5;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 115;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 115;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i5 = i2 + 53;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = getInterfaceDescriptor + 85;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final zzad onNavigationEvent() {
        int i = 2 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar != null) {
            int i2 = access100 + 67;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = access100 + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.card.Hilt_CardTransactionSchemeActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        onWarmupCompleted(getIntent());
        int i4 = getInterfaceDescriptor + 47;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        onWarmupCompleted(intent);
        int i4 = access100 + 93;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.card.CardTransactionSchemeActivity] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r2v114, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v115, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r2v116, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r2v117, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v118, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v120, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v94, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onWarmupCompleted(android.content.Intent r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.card.CardTransactionSchemeActivity.onWarmupCompleted(android.content.Intent):void");
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return "CardTransactionSchemeActivity";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int length;
        byte[] bArr;
        int length2;
        byte[] bArr2;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43423), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 22438 - TextUtils.lastIndexOf("", '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i7 = $10 + 85;
                int i8 = i7 % 128;
                $11 = i8;
                int i9 = i7 % 2;
                byte[] bArr3 = IAuthTabCallbackStub;
                if (bArr3 != null) {
                    int i10 = i8 + 45;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i5 = 0;
                    }
                    while (i5 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr3[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 12843), 54 - TextUtils.lastIndexOf("", c), (ViewConfiguration.getPressedStateDuration() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i5++;
                        c = '0';
                    }
                    bArr3 = bArr2;
                }
                if (bArr3 != null) {
                    byte[] bArr4 = IAuthTabCallbackStub;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (Process.myPid() >> 22)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, 22439 - Color.argb(0, 0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallbackDefault[i + ((int) (asInterface ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (asInterface ^ j));
                if (z) {
                    int i12 = $11 + 55;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onTransact), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (Process.myPid() >> 22) + 86, (ViewConfiguration.getScrollBarSize() >> 8) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = IAuthTabCallbackStub;
                if (bArr5 != null) {
                    int i14 = $11 + 77;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i15 = 0; i15 < length; i15++) {
                        bArr[i15] = (byte) (bArr5[i15] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i16 = $10 + 67;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!z2) {
                        short[] sArr = IAuthTabCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = IAuthTabCallbackStub;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
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

    @Override // viva.republica.toss.card.Hilt_CardTransactionSchemeActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access100 + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.card.Hilt_CardTransactionSchemeActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onResume();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 23;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.card.Hilt_CardTransactionSchemeActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access100 + 39;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.card.Hilt_CardTransactionSchemeActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = getInterfaceDescriptor + 115;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
