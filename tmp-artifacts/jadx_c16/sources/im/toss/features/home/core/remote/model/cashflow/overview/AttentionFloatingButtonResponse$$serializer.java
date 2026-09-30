package im.toss.features.home.core.remote.model.cashflow.overview;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowButtonResponse;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowButtonResponse$;
import im.toss.features.home.core.remote.model.cashflow.common.CashflowImageResponse;
import im.toss.features.home.core.remote.model.cashflow.overview.AttentionFloatingButtonResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse;
import im.toss.features.home.core.remote.model.dst.widget.TextContentResponse$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.deleteSnapshot;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AttentionFloatingButtonResponse$$serializer implements aeu2<AttentionFloatingButtonResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    public static final AttentionFloatingButtonResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onExtraCallback();
        AttentionFloatingButtonResponse$$serializer attentionFloatingButtonResponse$$serializer = new AttentionFloatingButtonResponse$$serializer();
        INSTANCE = attentionFloatingButtonResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.cashflow.overview.AttentionFloatingButtonResponse", attentionFloatingButtonResponse$$serializer, 6);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("icon", true);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 101, 0}, false, new byte[]{1, 1, 1, 0}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 6, 0, 4}, true, new byte[]{0, 0, 1, 1, 0, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{10, 5, 0, 3}, false, new byte[]{1, 1, 1, 0, 1}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("logParams", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 51;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private AttentionFloatingButtonResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(deleteSnapshot.onExtraCallback), sp.IAuthTabCallback(TextContentResponse$.serializer.INSTANCE), sp.IAuthTabCallback(CashflowButtonResponse$.serializer.INSTANCE), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(AttentionFloatingButtonResponse$LogParamsResponse$$serializer.INSTANCE)};
        int i4 = onExtraCallback + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0077 A[PHI: r0 r2
      0x0077: PHI (r0v6 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r0 r2
      0x003b: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v11 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0039, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AttentionFloatingButtonResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String str;
        String str2;
        TextContentResponse textContentResponse;
        AttentionFloatingButtonResponse.LogParamsResponse logParamsResponse;
        CashflowButtonResponse cashflowButtonResponse;
        int i;
        CashflowImageResponse cashflowImageResponse;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i4 = 26 / 0;
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
                getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
                String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
                CashflowImageResponse cashflowImageResponse2 = (CashflowImageResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, deleteSnapshot.onExtraCallback, (Object) null);
                TextContentResponse textContentResponse2 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentResponse$.serializer.INSTANCE, (Object) null);
                CashflowButtonResponse cashflowButtonResponse2 = (CashflowButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CashflowButtonResponse$.serializer.INSTANCE, (Object) null);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
                str2 = str3;
                textContentResponse = textContentResponse2;
                logParamsResponse = (AttentionFloatingButtonResponse.LogParamsResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, AttentionFloatingButtonResponse$LogParamsResponse$$serializer.INSTANCE, (Object) null);
                cashflowButtonResponse = cashflowButtonResponse2;
                i = 63;
                cashflowImageResponse = cashflowImageResponse2;
            } else {
                int i5 = 0;
                boolean z = true;
                AttentionFloatingButtonResponse.LogParamsResponse logParamsResponse2 = null;
                CashflowButtonResponse cashflowButtonResponse3 = null;
                String str4 = null;
                String str5 = null;
                CashflowImageResponse cashflowImageResponse3 = null;
                TextContentResponse textContentResponse3 = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                            i5 |= 1;
                            break;
                        case 1:
                            cashflowImageResponse3 = (CashflowImageResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, deleteSnapshot.onExtraCallback, cashflowImageResponse3);
                            i5 |= 2;
                            break;
                        case 2:
                            textContentResponse3 = (TextContentResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, TextContentResponse$.serializer.INSTANCE, textContentResponse3);
                            i5 |= 4;
                            break;
                        case 3:
                            cashflowButtonResponse3 = (CashflowButtonResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CashflowButtonResponse$.serializer.INSTANCE, cashflowButtonResponse3);
                            i5 |= 8;
                            break;
                        case 4:
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str4);
                            i5 |= 16;
                            break;
                        case 5:
                            logParamsResponse2 = (AttentionFloatingButtonResponse.LogParamsResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, AttentionFloatingButtonResponse$LogParamsResponse$$serializer.INSTANCE, logParamsResponse2);
                            i5 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                cashflowButtonResponse = cashflowButtonResponse3;
                str = str4;
                i = i5;
                cashflowImageResponse = cashflowImageResponse3;
                textContentResponse = textContentResponse3;
                logParamsResponse = logParamsResponse2;
                str2 = str5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AttentionFloatingButtonResponse attentionFloatingButtonResponse = new AttentionFloatingButtonResponse(i, str2, cashflowImageResponse, textContentResponse, cashflowButtonResponse, str, logParamsResponse, (okycx) null);
        int i6 = onWarmupCompleted + 111;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return attentionFloatingButtonResponse;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m563deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AttentionFloatingButtonResponse attentionFloatingButtonResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return attentionFloatingButtonResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AttentionFloatingButtonResponse attentionFloatingButtonResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(attentionFloatingButtonResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        AttentionFloatingButtonResponse.onExtraCallback(attentionFloatingButtonResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AttentionFloatingButtonResponse) obj);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = onExtraCallback + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - KeyEvent.getDeadChar(0, 0)), TextUtils.getTrimmedLength("") + 35, 14238 - ((byte) KeyEvent.getModifierMetaStateMask()), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i7 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i8 = $10 + 103;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 66 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 16718 - Color.green(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49466), 70 - TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i11 = $10 + 49;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i12 = i3 << i5;
                System.arraycopy(cArr5, 1, cArr3, i12, i5);
                System.arraycopy(cArr5, i5, cArr3, 1, i12);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i13, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $10 + 99;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{27170, 27295, 27293, 27285, 27252, 27194, 27194, 27173, 27174, 27168, 27250, 27196, 27174, 27170, 27197};
    }
}
