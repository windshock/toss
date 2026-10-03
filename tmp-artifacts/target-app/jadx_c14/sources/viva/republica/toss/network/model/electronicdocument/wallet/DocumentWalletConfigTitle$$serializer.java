package viva.republica.toss.network.model.electronicdocument.wallet;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.NativeFrameRateLoggerSpec;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DocumentWalletConfigTitle$$serializer implements aeu2<DocumentWalletConfigTitle> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final DocumentWalletConfigTitle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        DocumentWalletConfigTitle$$serializer documentWalletConfigTitle$$serializer = new DocumentWalletConfigTitle$$serializer();
        INSTANCE = documentWalletConfigTitle$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle", documentWalletConfigTitle$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{49303, 50541, 52057, 53562, 55066}, 1511 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{49296, 22617, 61727, 2810, 41910, 15516, 21589, 60719}, Drawable.resolveOpacity(0, 0) + 39119, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{49280, 8072, 32444, 24042, 48374, 39692, 64053, 55647}, 57119 - TextUtils.getCapsMode("", 0, 0), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("titleType", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DocumentWalletConfigTitle$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = DocumentWalletConfigTitle.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[3].getValue())};
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletConfigTitle documentWalletConfigTitleM12deserialize = m12deserialize(decoder);
        int i4 = onExtraCallback + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return documentWalletConfigTitleM12deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final DocumentWalletConfigTitle m12deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        NativeFrameRateLoggerSpec nativeFrameRateLoggerSpec;
        String str2;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = DocumentWalletConfigTitle.onExtraCallback();
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            nativeFrameRateLoggerSpec = (NativeFrameRateLoggerSpec) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), (Object) null);
            i = 15;
            str3 = str5;
            str2 = str6;
        } else {
            int i3 = 0;
            boolean z = true;
            NativeFrameRateLoggerSpec nativeFrameRateLoggerSpec2 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onNavigationEvent + 55;
                    int i5 = i4 % 128;
                    onExtraCallback = i5;
                    int i6 = i4 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i7 = i5 + 109;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        if (iOnNavigationEvent == 1) {
                            str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str7);
                            i3 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                            i3 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            nativeFrameRateLoggerSpec2 = (NativeFrameRateLoggerSpec) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), nativeFrameRateLoggerSpec2);
                            i3 |= 8;
                        }
                    } else {
                        str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str8);
                        i3 |= 1;
                        int i9 = onNavigationEvent + 67;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 2 / 5;
                        }
                    }
                } else {
                    z = false;
                }
            }
            i = i3;
            str = str4;
            nativeFrameRateLoggerSpec = nativeFrameRateLoggerSpec2;
            str2 = str7;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DocumentWalletConfigTitle(i, str3, str2, str, nativeFrameRateLoggerSpec, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DocumentWalletConfigTitle) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DocumentWalletConfigTitle documentWalletConfigTitle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(documentWalletConfigTitle, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DocumentWalletConfigTitle.onExtraCallbackWithResult(documentWalletConfigTitle, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigTitle$$serializer.a(char[], int, java.lang.Object[]):void");
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = -6756790392769853996L;
    }
}
