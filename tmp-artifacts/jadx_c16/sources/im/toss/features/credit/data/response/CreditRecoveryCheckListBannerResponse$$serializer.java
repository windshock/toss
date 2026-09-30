package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditRecoveryCheckListBannerResponse$$serializer implements aeu2<CreditRecoveryCheckListBannerResponse> {
    public static final CreditRecoveryCheckListBannerResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 173;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onExtraCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3;
        int i4 = 3 - (b * 3);
        byte[] bArr = $$a;
        int i5 = (i * 2) + 1;
        int i6 = 105 - (b2 * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            int i8 = i4;
            int i9 = i4 + i7;
            i2 = i3;
            int i10 = i8;
            i6 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i6;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i12;
            int i92 = i4 + i7;
            i2 = i3;
            int i102 = i8;
            i6 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i1122 = i4 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted = 1;
        onExtraCallback();
        CreditRecoveryCheckListBannerResponse$$serializer creditRecoveryCheckListBannerResponse$$serializer = new CreditRecoveryCheckListBannerResponse$$serializer();
        INSTANCE = creditRecoveryCheckListBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditRecoveryCheckListBannerResponse", creditRecoveryCheckListBannerResponse$$serializer, 4);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{65528, 7, 65532, 7, 65535}, false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 146, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("linkUrl", false);
        setanimationsloop.onWarmupCompleted("isChecked", false);
        setanimationsloop.onWarmupCompleted("logType", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 101;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    private CreditRecoveryCheckListBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getBgColor.IAuthTabCallback, getwrigglelayout};
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreditRecoveryCheckListBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String strAsInterface;
        boolean zOnExtraCallbackWithResult;
        int i;
        int iOnNavigationEvent;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                boolean zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                i2 = 113;
                str = strAsInterface2;
                str2 = strAsInterface3;
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            } else {
                String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                i2 = 15;
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                str = strAsInterface4;
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                str2 = strAsInterface5;
            }
            i = i2;
        } else {
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            boolean z = true;
            boolean zOnExtraCallbackWithResult3 = false;
            int i5 = 0;
            while (z) {
                int i6 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i7 = 90 / 0;
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                        int i8 = onExtraCallbackWithResult + 59;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 3 / 2;
                        }
                    } else if (iOnNavigationEvent != 1) {
                        int i10 = onExtraCallbackWithResult;
                        int i11 = i10 + 1;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (iOnNavigationEvent == 3) {
                                zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                                i5 |= 4;
                            } else {
                                if (iOnNavigationEvent == 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i12 = i10 + 111;
                                IAuthTabCallback = i12 % 128;
                                int i13 = i12 % 2;
                                strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                                i5 |= 8;
                            }
                        } else if (iOnNavigationEvent == 2) {
                            zOnExtraCallbackWithResult3 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i5 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                        }
                    } else {
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            str = strAsInterface6;
            str2 = strAsInterface7;
            strAsInterface = strAsInterface8;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditRecoveryCheckListBannerResponse(i, str, str2, zOnExtraCallbackWithResult, strAsInterface, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m170deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        CreditRecoveryCheckListBannerResponse creditRecoveryCheckListBannerResponseDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return creditRecoveryCheckListBannerResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditRecoveryCheckListBannerResponse creditRecoveryCheckListBannerResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditRecoveryCheckListBannerResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditRecoveryCheckListBannerResponse.onWarmupCompleted(creditRecoveryCheckListBannerResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditRecoveryCheckListBannerResponse) obj);
        int i4 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
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
            int i6 = $11 + 105;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 35125), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, 10278 - (KeyEvent.getMaxKeyCode() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf((CharSequence) "", '0', 0)), 54 - ExpandableListView.getPackedPositionChild(0L), 2167 - TextUtils.getTrimmedLength(""), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        }
        if (z) {
            int i9 = $10 + 57;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $11 + 69;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12843), Color.alpha(0) + 55, View.resolveSizeAndState(0, 0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onNavigationEvent = 478308879;
    }
}
