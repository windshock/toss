package viva.republica.toss.network.model.loan;

import android.text.TextUtils;
import android.util.TypedValue;
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
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.loan.AppliedLoan;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class AppliedLoan$LoanText$$serializer implements aeu2<AppliedLoan.LoanText> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    public static final AppliedLoan$LoanText$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        AppliedLoan$LoanText$$serializer appliedLoan$LoanText$$serializer = new AppliedLoan$LoanText$$serializer();
        INSTANCE = appliedLoan$LoanText$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.AppliedLoan.LoanText", appliedLoan$LoanText$$serializer, 2);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127, -125, -126, -127}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("color", true);
        descriptor = setanimationsloop;
        int i = asInterface + 59;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AppliedLoan$LoanText$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout};
        int i4 = IAuthTabCallbackStub + 35;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        AppliedLoan.LoanText loanTextM23deserialize = m23deserialize(decoder);
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return loanTextM23deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.loan.AppliedLoan.LoanText m23deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r13) throws kotlinx.serialization.UnknownFieldException {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.IAuthTabCallbackStub
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.asBinder = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.descriptor
            o.yw r13 = r13.onWarmupCompleted(r1)
            boolean r2 = r13.extraCallbackWithResult()
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2a
            java.lang.String r0 = r13.asInterface(r1, r4)
            java.lang.String r2 = r13.asInterface(r1, r5)
            r4 = 3
            goto L85
        L2a:
            int r2 = viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.asBinder
            int r2 = r2 + 27
            int r6 = r2 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.IAuthTabCallbackStub = r6
            int r2 = r2 % r0
            r2 = r3
            r6 = r2
            r7 = r4
            r8 = r5
        L37:
            if (r8 == 0) goto L82
            int r9 = viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.asBinder
            int r9 = r9 + 53
            int r10 = r9 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.IAuthTabCallbackStub = r10
            int r9 = r9 % r0
            r10 = -1
            if (r9 == 0) goto L4f
            int r9 = r13.onNavigationEvent(r1)
            r11 = 97
            int r11 = r11 / r4
            if (r9 == r10) goto L80
            goto L55
        L4f:
            int r9 = r13.onNavigationEvent(r1)
            if (r9 == r10) goto L80
        L55:
            if (r9 == 0) goto L79
            if (r9 != r5) goto L73
            int r6 = viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.asBinder
            int r6 = r6 + 7
            int r9 = r6 % 128
            viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.IAuthTabCallbackStub = r9
            int r6 = r6 % 2
            if (r6 == 0) goto L6c
            java.lang.String r6 = r13.asInterface(r1, r5)
            r7 = r7 | 5
            goto L37
        L6c:
            java.lang.String r6 = r13.asInterface(r1, r5)
            r7 = r7 | 2
            goto L37
        L73:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>(r9)
            throw r13
        L79:
            java.lang.String r2 = r13.asInterface(r1, r4)
            r7 = r7 | 1
            goto L37
        L80:
            r8 = r4
            goto L37
        L82:
            r0 = r2
            r2 = r6
            r4 = r7
        L85:
            r13.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.loan.AppliedLoan$LoanText r13 = new viva.republica.toss.network.model.loan.AppliedLoan$LoanText
            r13.<init>(r4, r0, r2, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.AppliedLoan$LoanText$$serializer.m23deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.loan.AppliedLoan$LoanText");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AppliedLoan.LoanText) obj);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppliedLoan.LoanText loanText) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loanText, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AppliedLoan.LoanText.onWarmupCompleted(loanText, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loanText, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AppliedLoan.LoanText.onWarmupCompleted(loanText, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = asBinder + 113;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 61;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        Object obj = null;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 77 - TextUtils.indexOf("", "", 0), 20952 - (ViewConfiguration.getTouchSlop() >> 8), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 33;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 75 - (ViewConfiguration.getScrollBarSize() >> 8), 16037 - View.resolveSizeAndState(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (!onNavigationEvent) {
            if (!onWarmupCompleted) {
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
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 63 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12214 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i7 = $10 + 109;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $11 + 111;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] % iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetAfter("", 0) + 63, 12214 - View.resolveSize(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(obj, objArr5);
            } else {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 62 - ((byte) KeyEvent.getModifierMetaStateMask()), 12214 - (ViewConfiguration.getEdgeSlop() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            obj = null;
            i6 = 1052772399;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{32387, 32402, 32391};
        IAuthTabCallback = -1184334017;
        onWarmupCompleted = true;
        onNavigationEvent = true;
    }
}
