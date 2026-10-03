package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.appInfo;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTarget;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DepositTarget$Account$$serializer implements aeu2<DepositTarget.Account> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final DepositTarget$Account$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback implements appInfo {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final /* synthetic */ String discriminator;

        public IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.discriminator = str;
        }

        public final /* synthetic */ String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.discriminator;
            int i5 = i2 + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final /* synthetic */ Class annotationType() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
            return appInfo.class;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof appInfo)) {
                return false;
            }
            if (!Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback())) {
                int i2 = onExtraCallback + 75;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
            }
            return true;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            String str = this.discriminator;
            if (i3 != 0) {
                return str.hashCode() ^ 707790692;
            }
            str.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallback();
        DepositTarget$Account$$serializer depositTarget$Account$$serializer = new DepositTarget$Account$$serializer();
        INSTANCE = depositTarget$Account$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("ACCOUNT", depositTarget$Account$$serializer, 3);
        setanimationsloop.onWarmupCompleted("bankCode", false);
        setanimationsloop.onWarmupCompleted("accountNo", false);
        setanimationsloop.onWarmupCompleted("reserveKey", true);
        Object[] objArr = new Object[1];
        a(new int[]{1026661815, -1565125707}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, objArr);
        setanimationsloop.onWarmupCompleted(new IAuthTabCallback(((String) objArr[0]).intern()));
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 99;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private DepositTarget$Account$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = onWarmupCompleted + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DepositTarget.Account accountM79deserialize = m79deserialize(decoder);
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return accountM79deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.DepositTarget.Account m79deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r18) throws kotlinx.serialization.UnknownFieldException {
        /*
            r17 = this;
            r0 = r18
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.onWarmupCompleted
            int r2 = r2 + 21
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.IAuthTabCallback = r3
            int r2 = r2 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L38
            int r3 = r0.onTransact(r2, r5)
            java.lang.String r5 = r0.asInterface(r2, r6)
            o.getWriggleLayout r6 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r1 = r0.onExtraCallbackWithResult(r2, r1, r6, r4)
            java.lang.String r1 = (java.lang.String) r1
            r4 = 7
            r15 = r1
            r13 = r3
            r12 = r4
            r14 = r5
            goto L51
        L38:
            int r3 = viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.onWarmupCompleted
            int r3 = r3 + 125
            int r7 = r3 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.IAuthTabCallback = r7
            int r3 = r3 % r1
            if (r3 != 0) goto L45
            r3 = 5
            int r3 = r3 % r1
        L45:
            r7 = r4
            r3 = r5
            r8 = r3
            r9 = r6
        L49:
            r10 = r9 ^ 1
            if (r10 == 0) goto L5d
            r13 = r3
            r15 = r4
            r14 = r7
            r12 = r8
        L51:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.transfer.DepositTarget$Account r0 = new viva.republica.toss.network.model.transfer.DepositTarget$Account
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            return r0
        L5d:
            int r10 = r0.onNavigationEvent(r2)
            r11 = -1
            if (r10 == r11) goto La5
            int r11 = viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.IAuthTabCallback
            int r11 = r11 + 51
            int r12 = r11 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.onWarmupCompleted = r12
            int r11 = r11 % r1
            if (r10 == 0) goto L9e
            int r11 = r12 + 49
            int r13 = r11 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.IAuthTabCallback = r13
            int r11 = r11 % r1
            if (r11 != 0) goto L7b
            if (r10 == 0) goto L97
            goto L7d
        L7b:
            if (r10 == r6) goto L97
        L7d:
            if (r10 != r1) goto L91
            int r12 = r12 + 55
            int r10 = r12 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.IAuthTabCallback = r10
            int r12 = r12 % r1
            o.getWriggleLayout r10 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r4 = r0.onExtraCallbackWithResult(r2, r1, r10, r4)
            java.lang.String r4 = (java.lang.String) r4
            r8 = r8 | 4
            goto L49
        L91:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L97:
            java.lang.String r7 = r0.asInterface(r2, r6)
            r8 = r8 | 2
            goto L49
        L9e:
            int r3 = r0.onTransact(r2, r5)
            r8 = r8 | 1
            goto L49
        La5:
            int r9 = viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.IAuthTabCallback
            int r9 = r9 + 93
            int r10 = r9 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.onWarmupCompleted = r10
            int r9 = r9 % r1
            r9 = r5
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer.m79deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.DepositTarget$Account");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTarget.Account) obj);
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTarget.Account account) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(account, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DepositTarget.Account.onExtraCallbackWithResult(account, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        long j = 0;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), Gravity.getAbsoluteGravity(0, 0) + 72, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int i8 = $11 + 111;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 55;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', i4)), TextUtils.getCapsMode("", i4, i4) + 72, TextUtils.indexOf((CharSequence) "", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10 = 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), Color.green(0) + 72, ExpandableListView.getPackedPositionGroup(0L) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i10++;
                }
                i3 = -1469660336;
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i4;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $10 + 81;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i15 = 0; i15 < 16; i15++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22252), KeyEvent.keyCodeFromString("") + 39, (ViewConfiguration.getScrollBarSize() >> 8) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 78 - View.resolveSize(0, 0), 7398 - View.MeasureSpec.makeMeasureSpec(0, 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onNavigationEvent = new int[]{723139236, 2134482812, -483872212, -1628254100, 1108773741, 1796503305, -1897071344, 1247940123, 2020983607, -2082535754, 1679103539, 618185074, 1650784696, -2090346813, 799188629, 501738990, -97281949, -1264923715};
    }
}
