package im.toss.features.credit.data.response.membership;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.credit.data.response.membership.CreditPlusGiftIntroResponse;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroResponse$HeaderSection$$serializer implements aeu2<CreditPlusGiftIntroResponse.HeaderSection> {
    public static final CreditPlusGiftIntroResponse$HeaderSection$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {120, -62, 63, 57};
    private static final int $$b = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = b + 4;
        int i4 = 105 - (s * 2);
        int i5 = i * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            i3++;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i4 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            i3++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            i3++;
            if (i2 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback = 1;
        onExtraCallbackWithResult();
        CreditPlusGiftIntroResponse$HeaderSection$$serializer creditPlusGiftIntroResponse$HeaderSection$$serializer = new CreditPlusGiftIntroResponse$HeaderSection$$serializer();
        INSTANCE = creditPlusGiftIntroResponse$HeaderSection$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.membership.CreditPlusGiftIntroResponse.HeaderSection", creditPlusGiftIntroResponse$HeaderSection$$serializer, 2);
        Object[] objArr = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 5, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5, new char[]{65535, 7, 65532, 7, 65528}, true, 203 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 89;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditPlusGiftIntroResponse$HeaderSection$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        }
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        return new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout2), sp.IAuthTabCallback(getwrigglelayout2)};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditPlusGiftIntroResponse.HeaderSection deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 3;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            int i5 = 0;
            str2 = null;
            str = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i6 = IAuthTabCallback + 3;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                    i5 |= 2;
                }
            }
            i4 = i5;
        } else {
            int i8 = onNavigationEvent + 85;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditPlusGiftIntroResponse.HeaderSection(i4, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m210deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        CreditPlusGiftIntroResponse.HeaderSection headerSectionDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return headerSectionDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditPlusGiftIntroResponse.HeaderSection headerSection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(headerSection, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditPlusGiftIntroResponse.HeaderSection.IAuthTabCallback(headerSection, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditPlusGiftIntroResponse.HeaderSection) obj);
        int i4 = onNavigationEvent + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        float f;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $10 + 63;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            f = 0.0f;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23, 10278 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 54 - TextUtils.indexOf((CharSequence) "", '0'), 2167 - View.MeasureSpec.getSize(0), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i9 = $10 + 65;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 5;
            }
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 85;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback * i];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 55, 2167 - TextUtils.indexOf("", "", 0), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12842), View.getDefaultSize(0, 0) + 55, 2167 - (ViewConfiguration.getScrollBarSize() >> 8), 1298711993, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
                f = 0.0f;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 478308983;
    }
}
