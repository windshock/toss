package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.credit.data.response.CreditHomeLargeBannerResponse;
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
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeLargeBannerResponse$DualCtaContents$$serializer implements aeu2<CreditHomeLargeBannerResponse.DualCtaContents> {
    public static final CreditHomeLargeBannerResponse$DualCtaContents$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {119, -27, 13, -93};
    private static final int $$b = 160;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i;
        int i2;
        int i3 = 105 - (b2 * 3);
        byte[] bArr = $$a;
        int i4 = 3 - (s * 2);
        int i5 = (b * 4) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i4++;
            i6 = bArr[i4];
            i3 += -i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 33;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallback = 1;
        IAuthTabCallback();
        CreditHomeLargeBannerResponse$DualCtaContents$$serializer creditHomeLargeBannerResponse$DualCtaContents$$serializer = new CreditHomeLargeBannerResponse$DualCtaContents$$serializer();
        INSTANCE = creditHomeLargeBannerResponse$DualCtaContents$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHomeLargeBannerResponse.DualCtaContents", creditHomeLargeBannerResponse$DualCtaContents$$serializer, 7);
        Object[] objArr = new Object[1];
        a(Color.alpha(0) + 5, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1, new char[]{65535, 65528, 7, 65532, 7}, false, TextUtils.lastIndexOf("", '0', 0, 0) + 112, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(8 - KeyEvent.getDeadChar(0, 0), 7 - TextUtils.getOffsetBefore("", 0), new char[]{65535, 7, 65532, 7, 65525, '\b', 6, 65528}, true, 111 - KeyEvent.getDeadChar(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, 6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{65531, 1, 65535, 65519, '\f', 6, 3, 7}, false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 104, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("darkImageUrl", true);
        setanimationsloop.onWarmupCompleted("primary", false);
        setanimationsloop.onWarmupCompleted("secondary", false);
        setanimationsloop.onWarmupCompleted("needsShowAnimation", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 1;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditHomeLargeBannerResponse$DualCtaContents$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer creditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer = CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, kSerializer, kSerializer, sp.IAuthTabCallback(creditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer), sp.IAuthTabCallback(creditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer), sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        int i4 = IAuthTabCallback + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditHomeLargeBannerResponse.DualCtaContents deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButton;
        CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButton2;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        char c;
        boolean z;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 6;
        CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButton3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer creditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer = CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer.INSTANCE;
            CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButton4 = (CreditHomeLargeBannerResponse.DualCtaContents.CtaButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, creditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer, (Object) null);
            CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButton5 = (CreditHomeLargeBannerResponse.DualCtaContents.CtaButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, creditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer, (Object) null);
            str2 = strAsInterface2;
            str4 = strAsInterface;
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getBgColor.IAuthTabCallback, (Object) null);
            ctaButton2 = ctaButton5;
            str = strAsInterface3;
            ctaButton = ctaButton4;
            str3 = str5;
            i = 127;
        } else {
            boolean z2 = true;
            int i4 = 0;
            CreditHomeLargeBannerResponse.DualCtaContents.CtaButton ctaButton6 = null;
            Boolean bool2 = null;
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String str6 = null;
            String strAsInterface6 = null;
            while (z2) {
                int i5 = IAuthTabCallback + 61;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i6 == 0) {
                    int i7 = 66 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = true;
                            z2 = false;
                            i3 = 6;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i4 |= 1;
                            i3 = 6;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str6);
                            i4 |= 2;
                            i3 = 6;
                            break;
                        case 2:
                            c = 3;
                            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i4 |= 4;
                            break;
                        case 3:
                            c = 3;
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i4 |= 8;
                            break;
                        case 4:
                            ctaButton3 = (CreditHomeLargeBannerResponse.DualCtaContents.CtaButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer.INSTANCE, ctaButton3);
                            i4 |= 16;
                            int i8 = onNavigationEvent + 79;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            break;
                        case 5:
                            ctaButton6 = (CreditHomeLargeBannerResponse.DualCtaContents.CtaButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer.INSTANCE, ctaButton6);
                            i4 |= 32;
                            break;
                        case 6:
                            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getBgColor.IAuthTabCallback, bool2);
                            i4 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = true;
                            z2 = false;
                            i3 = 6;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i4 |= 1;
                            i3 = 6;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str6);
                            i4 |= 2;
                            i3 = 6;
                            break;
                        case 2:
                            c = 3;
                            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i4 |= 4;
                            break;
                        case 3:
                            c = 3;
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i4 |= 8;
                            break;
                        case 4:
                            ctaButton3 = (CreditHomeLargeBannerResponse.DualCtaContents.CtaButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer.INSTANCE, ctaButton3);
                            i4 |= 16;
                            int i82 = onNavigationEvent + 79;
                            IAuthTabCallback = i82 % 128;
                            int i92 = i82 % 2;
                            break;
                        case 5:
                            ctaButton6 = (CreditHomeLargeBannerResponse.DualCtaContents.CtaButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, CreditHomeLargeBannerResponse$DualCtaContents$CtaButton$$serializer.INSTANCE, ctaButton6);
                            i4 |= 32;
                            break;
                        case 6:
                            bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getBgColor.IAuthTabCallback, bool2);
                            i4 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            int i10 = onNavigationEvent + 17;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i = i4;
            ctaButton = ctaButton3;
            ctaButton2 = ctaButton6;
            bool = bool2;
            str = strAsInterface4;
            str2 = strAsInterface5;
            str3 = str6;
            str4 = strAsInterface6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHomeLargeBannerResponse.DualCtaContents(i, str4, str3, str2, str, ctaButton, ctaButton2, bool, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m160deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHomeLargeBannerResponse.DualCtaContents dualCtaContents) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dualCtaContents, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditHomeLargeBannerResponse.DualCtaContents.onExtraCallbackWithResult(dualCtaContents, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHomeLargeBannerResponse.DualCtaContents) obj);
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            j = 0;
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0', 0)), 23 - ExpandableListView.getPackedPositionType(0L), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 12843), ((Process.getThreadPriority(0) + 20) >> 6) + 55, 2167 - (Process.myPid() >> 22), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $10 + 17;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i9 = $11 + 45;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 99;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback * i];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 12842), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 55, 2167 - (ViewConfiguration.getTouchSlop() >> 8), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTouchSlop() >> 8)), 55 - (ViewConfiguration.getScrollBarSize() >> 8), 2167 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    i4 = 2083011369;
                }
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 478308907;
    }
}
