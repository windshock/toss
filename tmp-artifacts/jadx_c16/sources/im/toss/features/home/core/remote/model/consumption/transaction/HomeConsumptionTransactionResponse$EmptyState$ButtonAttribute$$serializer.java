package im.toss.features.home.core.remote.model.consumption.transaction;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.consumption.transaction.HomeConsumptionTransactionResponse;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultToastImplExtension;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer implements aeu2<HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer homeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer = new HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer();
        INSTANCE = homeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.consumption.transaction.HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute", homeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer, 5);
        Object[] objArr = new Object[1];
        a(new int[]{0, 5, 12, 0}, true, new byte[]{1, 1, 0, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("theme", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{5, 5, 69, 0}, false, new byte[]{0, 1, 1, 1, 1}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("size", false);
        setanimationsloop.onWarmupCompleted("link", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 115;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private HomeConsumptionTransactionResponse$EmptyState$ButtonAttribute$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, lazyArrIAuthTabCallback[1].getValue(), lazyArrIAuthTabCallback[2].getValue(), lazyArrIAuthTabCallback[3].getValue(), getwrigglelayout};
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0090 A[PHI: r0 r2 r3
      0x0090: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r3v11 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0 r2 r3
      0x0041: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v10 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r3v3 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003f, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        DefaultToastImplExtension.onWarmupCompleted onwarmupcompleted;
        int i;
        SerialDescriptor serialDescriptor2;
        DefaultToastImplExtension.onNavigationEvent onnavigationevent;
        String str;
        String str2;
        DefaultToastImplExtension.asBinder asbinder;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = 1;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute.IAuthTabCallback();
            int i5 = 12 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                DefaultToastImplExtension.asBinder asbinder2 = (DefaultToastImplExtension.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
                DefaultToastImplExtension.onWarmupCompleted onwarmupcompleted2 = (DefaultToastImplExtension.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
                DefaultToastImplExtension.onNavigationEvent onnavigationevent2 = (DefaultToastImplExtension.onNavigationEvent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), (Object) null);
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                int i6 = IAuthTabCallback + 101;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                onwarmupcompleted = onwarmupcompleted2;
                SerialDescriptor serialDescriptor3 = serialDescriptor;
                i = 31;
                serialDescriptor2 = serialDescriptor3;
                onnavigationevent = onnavigationevent2;
                str = strAsInterface;
                str2 = strAsInterface2;
                asbinder = asbinder2;
            } else {
                boolean z = true;
                DefaultToastImplExtension.onNavigationEvent onnavigationevent3 = null;
                String strAsInterface3 = null;
                DefaultToastImplExtension.onWarmupCompleted onwarmupcompleted3 = null;
                DefaultToastImplExtension.asBinder asbinder3 = null;
                String strAsInterface4 = null;
                int i8 = 0;
                while (z) {
                    int i9 = IAuthTabCallback + 55;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                        i4 = i4;
                    } else if (iOnNavigationEvent == 0) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i8 |= 1;
                        i4 = i4;
                    } else if (iOnNavigationEvent != i4) {
                        if (iOnNavigationEvent != 2) {
                            int i11 = IAuthTabCallback;
                            int i12 = i11 + 63;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                            if (iOnNavigationEvent != 3) {
                                int i14 = i11 + 53;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                                i8 |= 16;
                            } else {
                                onnavigationevent3 = (DefaultToastImplExtension.onNavigationEvent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), onnavigationevent3);
                                i8 |= 8;
                            }
                        } else {
                            onwarmupcompleted3 = (DefaultToastImplExtension.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), onwarmupcompleted3);
                            i8 |= 4;
                        }
                        i4 = 1;
                    } else {
                        int i16 = i4;
                        asbinder3 = (DefaultToastImplExtension.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i16, (jp) lazyArrIAuthTabCallback[i16].getValue(), asbinder3);
                        i8 |= 2;
                        i4 = i16;
                    }
                }
                serialDescriptor2 = serialDescriptor;
                i = i8;
                onnavigationevent = onnavigationevent3;
                str2 = strAsInterface3;
                onwarmupcompleted = onwarmupcompleted3;
                asbinder = asbinder3;
                str = strAsInterface4;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor2);
        return new HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute(i, str, asbinder, onwarmupcompleted, onnavigationevent, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m592deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute buttonAttribute) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(buttonAttribute, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute.onNavigationEvent(buttonAttribute, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buttonAttribute, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute.onNavigationEvent(buttonAttribute, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 89;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeConsumptionTransactionResponse.EmptyState.ButtonAttribute) obj);
        int i4 = IAuthTabCallback + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 5;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getTapTimeout() >> 16)), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 14239 - View.getDefaultSize(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = $11 + 69;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10936), 65 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), MotionEvent.axisFromString("") + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49468 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 70, 12486 - KeyEvent.keyCodeFromString(""), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $10 + 49;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i17 = $11 + 109;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i19 = $11 + 39;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i21 = $10 + 21;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{27254, 27194, 27186, 27188, 27188, 27154, 27382, 27381, 27385, 27363};
    }
}
