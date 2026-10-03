package viva.republica.toss.network.model.plcc.benefit;

import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
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
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PlccBenefitInfoResp$PlccBenefitGroup$$serializer implements aeu2<PlccBenefitInfoResp.PlccBenefitGroup> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    public static final PlccBenefitInfoResp$PlccBenefitGroup$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        PlccBenefitInfoResp$PlccBenefitGroup$$serializer plccBenefitInfoResp$PlccBenefitGroup$$serializer = new PlccBenefitInfoResp$PlccBenefitGroup$$serializer();
        INSTANCE = plccBenefitInfoResp$PlccBenefitGroup$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBenefitGroup", plccBenefitInfoResp$PlccBenefitGroup$$serializer, 2);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("benefits", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 79;
        asInterface = i % 128;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
    }

    private PlccBenefitInfoResp$PlccBenefitGroup$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{PlccBenefitInfoResp.PlccBenefitGroup.onExtraCallbackWithResult()[0].getValue(), getWriggleLayout.onNavigationEvent} : new KSerializer[]{getWriggleLayout.onNavigationEvent, PlccBenefitInfoResp.PlccBenefitGroup.onExtraCallbackWithResult()[1].getValue()};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m68deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroupM68deserialize = m68deserialize(decoder);
        int i3 = IAuthTabCallbackDefault + 105;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return plccBenefitGroupM68deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBenefitGroup m68deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r14) throws kotlinx.serialization.UnknownFieldException {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.descriptor
            o.yw r14 = r14.onWarmupCompleted(r1)
            kotlin.Lazy[] r2 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp.PlccBenefitGroup.onExtraCallbackWithResult()
            boolean r3 = r14.extraCallbackWithResult()
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L2f
            java.lang.String r0 = r14.asInterface(r1, r5)
            r2 = r2[r6]
            java.lang.Object r2 = r2.getValue()
            o.jp r2 = (o.jp) r2
            java.lang.Object r2 = r14.onNavigationEvent(r1, r6, r2, r4)
            java.util.List r2 = (java.util.List) r2
            r3 = 3
            goto L8a
        L2f:
            r3 = r4
            r7 = r3
            r8 = r5
            r9 = r6
        L33:
            if (r9 == 0) goto L87
            int r10 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.IAuthTabCallbackStub
            int r10 = r10 + 25
            int r11 = r10 % 128
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.IAuthTabCallbackDefault = r11
            int r10 = r10 % r0
            r11 = -1
            if (r10 != 0) goto L4b
            int r10 = r14.onNavigationEvent(r1)
            r12 = 47
            int r12 = r12 / r5
            if (r10 == r11) goto L85
            goto L51
        L4b:
            int r10 = r14.onNavigationEvent(r1)
            if (r10 == r11) goto L85
        L51:
            if (r10 == 0) goto L75
            if (r10 != r6) goto L6f
            int r10 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.IAuthTabCallbackStub
            int r10 = r10 + 89
            int r11 = r10 % 128
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.IAuthTabCallbackDefault = r11
            int r10 = r10 % r0
            r10 = r2[r6]
            java.lang.Object r10 = r10.getValue()
            o.jp r10 = (o.jp) r10
            java.lang.Object r7 = r14.onNavigationEvent(r1, r6, r10, r7)
            java.util.List r7 = (java.util.List) r7
            r8 = r8 | 2
            goto L33
        L6f:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r10)
            throw r14
        L75:
            java.lang.String r3 = r14.asInterface(r1, r5)
            r8 = r8 | 1
            int r10 = viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.IAuthTabCallbackDefault
            int r10 = r10 + 73
            int r11 = r10 % 128
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.IAuthTabCallbackStub = r11
            int r10 = r10 % r0
            goto L33
        L85:
            r9 = r5
            goto L33
        L87:
            r0 = r3
            r2 = r7
            r3 = r8
        L8a:
            r14.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup r14 = new viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup
            r14.<init>(r3, r0, r2, r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup$$serializer.m68deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.plcc.benefit.PlccBenefitInfoResp$PlccBenefitGroup");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PlccBenefitInfoResp.PlccBenefitGroup) obj);
        int i4 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PlccBenefitInfoResp.PlccBenefitGroup plccBenefitGroup) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(plccBenefitGroup, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PlccBenefitInfoResp.PlccBenefitGroup.onExtraCallbackWithResult(plccBenefitGroup, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(plccBenefitGroup, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PlccBenefitInfoResp.PlccBenefitGroup.onExtraCallbackWithResult(plccBenefitGroup, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $10 + 19;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) + 77, 20952 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), View.getDefaultSize(0, 0) + 75, 16037 - ExpandableListView.getPackedPositionGroup(0L), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (!(!IAuthTabCallback)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i5 = $11 + 29;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 63 - View.getDefaultSize(0, 0), ImageFormat.getBitsPerPixel(0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i7 = $10 + 97;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, (Process.myPid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i9 = $11 + 47;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 / 2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{32437, 32440, 32445, 32388};
        onExtraCallback = -1184334047;
        onExtraCallbackWithResult = true;
        IAuthTabCallback = true;
    }
}
