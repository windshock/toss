package im.toss.features.credit.data.response;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer implements aeu2<CreditHighInterestComparisonResponse.BottomSheetInfo> {
    public static final CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2;
        int i3 = s2 * 2;
        int i4 = b + 4;
        ?? r7 = (s * 4) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            byte b2 = r7;
            i = 0;
            int i6 = i4;
            int i7 = i6;
            i2 = i4 + b2;
            i4 = i7;
            int i8 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            b2 = bArr[i8];
            i++;
            int i9 = i2;
            i6 = i8;
            i4 = i9;
            int i72 = i6;
            i2 = i4 + b2;
            i4 = i72;
            int i82 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            i2 = r7;
            int i822 = i4 + 1;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallback = 0;
        onWarmupCompleted();
        CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer creditHighInterestComparisonResponse$BottomSheetInfo$$serializer = new CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer();
        INSTANCE = creditHighInterestComparisonResponse$BottomSheetInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditHighInterestComparisonResponse.BottomSheetInfo", creditHighInterestComparisonResponse$BottomSheetInfo$$serializer, 5);
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 5, 2 - ExpandableListView.getPackedPositionType(0L), new char[]{65532, 7, 65528, 65535, 7}, true, 275 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(8 - TextUtils.getOffsetAfter("", 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 8, new char[]{65535, 7, 65532, 7, 65525, '\b', 6, 65528}, true, 273 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("organizationName", true);
        setanimationsloop.onWarmupCompleted("content", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 3;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CreditHighInterestComparisonResponse$BottomSheetInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditHighInterestComparisonResponse.BottomSheetInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String strAsInterface2;
        String str2;
        String strAsInterface3;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = strAsInterface4;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str2 = strAsInterface5;
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            i = 31;
        } else {
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            int i6 = 0;
            int i7 = 1;
            while (i7 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i7 = i3;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent == 1) {
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i8 = onWarmupCompleted + 71;
                        int i9 = i8 % 128;
                        onExtraCallbackWithResult = i9;
                        int i10 = i8 % 2;
                        if (iOnNavigationEvent != 3) {
                            int i11 = i9 + 63;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 == 0) {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                                i6 |= 16;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                                i6 |= 16;
                            }
                        } else {
                            strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                        }
                    } else {
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                    }
                    i3 = 0;
                } else {
                    strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                    i6 |= 1;
                    int i12 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            strAsInterface = strAsInterface6;
            str = strAsInterface7;
            strAsInterface2 = strAsInterface8;
            str2 = strAsInterface9;
            strAsInterface3 = strAsInterface10;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CreditHighInterestComparisonResponse.BottomSheetInfo(i, str, str2, strAsInterface, strAsInterface2, strAsInterface3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m148deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfoDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return bottomSheetInfoDeserialize;
        }
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(bottomSheetInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CreditHighInterestComparisonResponse.BottomSheetInfo.IAuthTabCallback(bottomSheetInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bottomSheetInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CreditHighInterestComparisonResponse.BottomSheetInfo.IAuthTabCallback(bottomSheetInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditHighInterestComparisonResponse.BottomSheetInfo) obj);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        int i5 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = -1;
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i7 = $10 + 119;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.resolveSizeAndState(0, 0, 0)), 23 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12842), KeyEvent.keyCodeFromString("") + 55, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2166, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i10 = $10 + 111;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i12 = $10 + 63;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 12844), TextUtils.getOffsetBefore("", 0) + 55, 2167 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = -1;
                i5 = 2083011369;
            }
            int i14 = $10 + 113;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 478309004;
    }
}
