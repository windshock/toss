package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$ToastLayout$$serializer implements aeu2<TransferResultPage.ToastLayout> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final TransferResultPage$ToastLayout$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 107;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 5;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i6 = i3;
            while (i6 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i7 = (c2 + i5) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int offsetBefore = TextUtils.getOffsetBefore("", i3) + 10;
                        int i9 = (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, offsetBefore, i9, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10, (ViewConfiguration.getLongPressTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i10 = $11 + 51;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.lastIndexOf("", '0', 0)), 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onNavigationEvent();
        TransferResultPage$ToastLayout$$serializer transferResultPage$ToastLayout$$serializer = new TransferResultPage$ToastLayout$$serializer();
        INSTANCE = transferResultPage$ToastLayout$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.ToastLayout", transferResultPage$ToastLayout$$serializer, 2);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        Object[] objArr = new Object[1];
        a(new char[]{23996, 40977, 9407, 11800, 53194, 31541, 13456, 17021}, Color.argb(0, 0, 0, 0) + 7, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onTransact + 33;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private TransferResultPage$ToastLayout$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{sp.IAuthTabCallback(kSerializer), kSerializer};
        }
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = new KSerializer[2];
        kSerializerArr[0] = sp.IAuthTabCallback(kSerializer2);
        kSerializerArr[0] = kSerializer2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return m126deserialize(decoder);
        }
        m126deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[PHI: r1 r15
      0x0042: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r15v5 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r15
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.TransferResultPage.ToastLayout m126deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r15) throws kotlinx.serialization.UnknownFieldException {
        /*
            r14 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.IAuthTabCallbackDefault
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r2 = 3
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            r6 = 1
            if (r1 != 0) goto L26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.descriptor
            o.yw r15 = r15.onWarmupCompleted(r1)
            boolean r3 = r15.extraCallbackWithResult()
            r7 = 2
            int r7 = r7 / r5
            if (r3 == 0) goto L42
            goto L35
        L26:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.descriptor
            o.yw r15 = r15.onWarmupCompleted(r1)
            boolean r3 = r15.extraCallbackWithResult()
            if (r3 == 0) goto L42
        L35:
            o.getWriggleLayout r0 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r0 = r15.onExtraCallbackWithResult(r1, r5, r0, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r15.asInterface(r1, r6)
            goto L4d
        L42:
            r3 = r4
            r7 = r3
            r9 = r5
            r8 = r6
        L46:
            r10 = r8 ^ 1
            if (r10 == 0) goto L56
            r0 = r3
            r3 = r7
            r2 = r9
        L4d:
            r15.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout r15 = new viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout
            r15.<init>(r2, r0, r3, r4)
            return r15
        L56:
            int r10 = r15.onNavigationEvent(r1)
            r11 = -1
            if (r10 == r11) goto L94
            int r11 = viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.IAuthTabCallbackDefault
            int r12 = r11 + 21
            int r13 = r12 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.IAuthTabCallbackStub = r13
            int r12 = r12 % r0
            if (r12 == 0) goto L93
            if (r10 == 0) goto L88
            if (r10 != r6) goto L82
            int r11 = r11 + 83
            int r7 = r11 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.IAuthTabCallbackStub = r7
            int r11 = r11 % r0
            if (r11 != 0) goto L7b
            java.lang.String r7 = r15.asInterface(r1, r5)
            r9 = r2
            goto L46
        L7b:
            java.lang.String r7 = r15.asInterface(r1, r6)
            r9 = r9 | 2
            goto L46
        L82:
            kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
            r15.<init>(r10)
            throw r15
        L88:
            o.getWriggleLayout r10 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r3 = r15.onExtraCallbackWithResult(r1, r5, r10, r3)
            java.lang.String r3 = (java.lang.String) r3
            r9 = r9 | 1
            goto L46
        L93:
            throw r4
        L94:
            r8 = r5
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout$$serializer.m126deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.TransferResultPage$ToastLayout");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.ToastLayout) obj);
        int i4 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.ToastLayout toastLayout) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(toastLayout, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferResultPage.ToastLayout.IAuthTabCallback(toastLayout, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 93 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(toastLayout, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            TransferResultPage.ToastLayout.IAuthTabCallback(toastLayout, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 53034;
        onExtraCallback = (char) 27038;
        onNavigationEvent = 'P';
        onWarmupCompleted = (char) 14813;
    }
}
