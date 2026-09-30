package im.toss.features.home.core.remote.model.consumption.transaction;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.consumption.transaction.HomeConsumptionTransactionResponse;
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
public final /* synthetic */ class HomeConsumptionTransactionResponse$EmptyState$$serializer implements aeu2<HomeConsumptionTransactionResponse.EmptyState> {
    public static final HomeConsumptionTransactionResponse$EmptyState$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {68, 4, -12, -68};
    private static final int $$b = 132;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3 = 3 - (s * 2);
        int i4 = (i * 4) + 105;
        int i5 = s2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i3;
            int i9 = (-i3) + i6;
            i2 = i7;
            int i10 = i8;
            i4 = i9;
            i3 = i10;
            bArr2[i2] = (byte) i4;
            int i11 = i3 + 1;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i8 = i11;
            i3 = bArr[i11];
            i7 = i2 + 1;
            i6 = i12;
            int i92 = (-i3) + i6;
            i2 = i7;
            int i102 = i8;
            i4 = i92;
            i3 = i102;
            bArr2[i2] = (byte) i4;
            int i112 = i3 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i1122 = i3 + 1;
            if (i2 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted = 1;
        onExtraCallback();
        HomeConsumptionTransactionResponse$EmptyState$$serializer homeConsumptionTransactionResponse$EmptyState$$serializer = new HomeConsumptionTransactionResponse$EmptyState$$serializer();
        INSTANCE = homeConsumptionTransactionResponse$EmptyState$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.transaction.HomeConsumptionTransactionResponse.EmptyState", homeConsumptionTransactionResponse$EmptyState$$serializer, 3);
        setanimationsloop.onWarmupCompleted("lottieUrl", false);
        Object[] objArr = new Object[1];
        a(5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1 - View.MeasureSpec.getMode(0), new char[]{65528, 7, 65532, 7, 65535}, false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 179, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a((Process.myPid() >> 22) + 6, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, new char[]{5, 0, 65535, 65523, 6, 5}, false, ((byte) KeyEvent.getModifierMetaStateMask()) + 183, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private HomeConsumptionTransactionResponse$EmptyState$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer.INSTANCE};
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeConsumptionTransactionResponse.EmptyState deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute buttonAttribute;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            str = strAsInterface2;
            buttonAttribute = (HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer.INSTANCE, (Object) null);
            str2 = strAsInterface3;
            i = 7;
        } else {
            String strAsInterface4 = null;
            HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute buttonAttribute2 = null;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallback;
                    int i5 = i4 + 15;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 86 / 0;
                        if (iOnNavigationEvent == 0) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i3 |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i3 |= 2;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i7 = i4 + 63;
                            IAuthTabCallback = i7 % 128;
                            buttonAttribute2 = (HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute) (i7 % 2 == 0 ? ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer.INSTANCE, buttonAttribute2) : ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer.INSTANCE, buttonAttribute2));
                            i3 |= 4;
                            int i8 = onExtraCallback + 79;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                    }
                } else {
                    z = false;
                }
            }
            str = strAsInterface4;
            str2 = strAsInterface;
            buttonAttribute = buttonAttribute2;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HomeConsumptionTransactionResponse.EmptyState emptyState = new HomeConsumptionTransactionResponse.EmptyState(i, str, str2, buttonAttribute, (okycx) null);
        int i10 = onExtraCallback + 95;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return emptyState;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m591deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeConsumptionTransactionResponse.EmptyState emptyStateDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return emptyStateDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeConsumptionTransactionResponse.EmptyState emptyState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(emptyState, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeConsumptionTransactionResponse.EmptyState.onExtraCallback(emptyState, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeConsumptionTransactionResponse.EmptyState) obj);
        int i4 = IAuthTabCallback + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
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
        int i6 = $10 + 119;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 35125), 23 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10278 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ExpandableListView.getPackedPositionChild(0L)), Process.getGidForName("") + 56, 2167 - Color.blue(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i9 = $10 + 49;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 51;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.blue(0)), 55 - (Process.myTid() >> 22), (Process.myTid() >> 22) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onNavigationEvent = 478308974;
    }
}
