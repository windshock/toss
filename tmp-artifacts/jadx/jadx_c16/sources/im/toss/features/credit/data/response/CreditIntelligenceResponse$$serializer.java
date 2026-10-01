package im.toss.features.credit.data.response;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditIntelligenceResponse$$serializer implements aeu2<CreditIntelligenceResponse> {
    public static final CreditIntelligenceResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {126, 1, 26, -71};
    private static final int $$b = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i;
        int i2 = b2 * 3;
        byte[] bArr = $$a;
        int i3 = 4 - (s * 4);
        int i4 = (b * 4) + 105;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i4 += -i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i2) {
                return new String(bArr2, 0);
            }
            i5 = i3;
            i3 = bArr[i3];
            i4 += -i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i6 = i + 1;
            if (i == i2) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onNavigationEvent = 1;
        IAuthTabCallback();
        CreditIntelligenceResponse$$serializer creditIntelligenceResponse$$serializer = new CreditIntelligenceResponse$$serializer();
        INSTANCE = creditIntelligenceResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditIntelligenceResponse", creditIntelligenceResponse$$serializer, 10);
        setanimationsloop.onWarmupCompleted("id", true);
        Object[] objArr = new Object[1];
        a(5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, new char[]{65535, 7, 65532, 7, 65528}, true, 287 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 4 - ExpandableListView.getPackedPositionChild(0L), new char[]{6, 65527, 7, 65529, 65528, 2, 3, 65533, '\b', 4, 65533}, true, 285 - MotionEvent.axisFromString(""), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("linkUrl", true);
        setanimationsloop.onWarmupCompleted("iconFormat", true);
        setanimationsloop.onWarmupCompleted("sourceUrl", true);
        setanimationsloop.onWarmupCompleted("placeHolderUrl", true);
        setanimationsloop.onWarmupCompleted("bgColor", true);
        setanimationsloop.onWarmupCompleted("logType", true);
        setanimationsloop.onWarmupCompleted("bannerType", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 113;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private CreditIntelligenceResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {oty1.onExtraCallback, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditIntelligenceResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        int i;
        long j;
        String strAsInterface3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        boolean z;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 9;
        int i4 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallback + 73;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            String strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            String strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
            String strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
            str = strAsInterface5;
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 9);
            str2 = strAsInterface10;
            str4 = strAsInterface9;
            strAsInterface = strAsInterface8;
            str3 = strAsInterface6;
            str6 = strAsInterface11;
            str5 = strAsInterface7;
            i = 1023;
            j = jIAuthTabCallbackDefault;
            strAsInterface2 = strAsInterface4;
        } else {
            String strAsInterface12 = null;
            String strAsInterface13 = null;
            String strAsInterface14 = null;
            strAsInterface = null;
            String strAsInterface15 = null;
            String strAsInterface16 = null;
            String strAsInterface17 = null;
            boolean z2 = true;
            long jIAuthTabCallbackDefault2 = 0;
            strAsInterface2 = null;
            String strAsInterface18 = null;
            while (z2) {
                int i7 = onExtraCallback + 103;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                    case 0:
                        z = true;
                        c2 = 3;
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 9;
                    case 1:
                        z = true;
                        c2 = 3;
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 9;
                    case 2:
                        c = 3;
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 9;
                    case 3:
                        c = 3;
                        strAsInterface15 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i4 |= 8;
                        int i9 = onExtraCallback + 59;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        i3 = 9;
                    case 4:
                        strAsInterface17 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i4 |= 16;
                    case 5:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i4 |= 32;
                    case 6:
                        strAsInterface14 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i4 |= 64;
                    case 7:
                        strAsInterface13 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                        i4 |= 128;
                    case 8:
                        strAsInterface16 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 8);
                        i4 |= 256;
                    case 9:
                        strAsInterface18 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                        i4 |= 512;
                        int i11 = onExtraCallback + 109;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            i = i4;
            j = jIAuthTabCallbackDefault2;
            strAsInterface3 = strAsInterface18;
            str = strAsInterface12;
            String str7 = strAsInterface16;
            str2 = strAsInterface13;
            str3 = strAsInterface15;
            str4 = strAsInterface14;
            str5 = strAsInterface17;
            str6 = str7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditIntelligenceResponse(i, j, strAsInterface2, str, str3, str5, strAsInterface, str4, str2, str6, strAsInterface3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m164deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditIntelligenceResponse creditIntelligenceResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return creditIntelligenceResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditIntelligenceResponse creditIntelligenceResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditIntelligenceResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditIntelligenceResponse.IAuthTabCallback(creditIntelligenceResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 59 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(creditIntelligenceResponse, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            CreditIntelligenceResponse.IAuthTabCallback(creditIntelligenceResponse, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onWarmupCompleted + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditIntelligenceResponse) obj);
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 35125), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, TextUtils.indexOf((CharSequence) "", '0') + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12842);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 55;
                    int iAxisFromString = MotionEvent.axisFromString("") + 2168;
                    byte b = (byte) ($$a[1] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, iResolveSizeAndState, iAxisFromString, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 115;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 12843);
                    int iResolveSize = 55 - View.resolveSize(0, 0);
                    int iResolveOpacity = 2167 - Drawable.resolveOpacity(0, 0);
                    byte b3 = (byte) ($$a[1] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, iResolveSize, iResolveOpacity, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = $11 + 101;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 2083011369;
            }
            int i11 = $11 + 55;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 478309019;
    }
}
