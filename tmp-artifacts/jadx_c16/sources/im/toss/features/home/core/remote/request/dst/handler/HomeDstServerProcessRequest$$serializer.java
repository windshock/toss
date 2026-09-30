package im.toss.features.home.core.remote.request.dst.handler;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
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
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstServerProcessRequest$$serializer implements aeu2<HomeDstServerProcessRequest> {
    private static int IAuthTabCallback;
    public static final HomeDstServerProcessRequest$$serializer INSTANCE;
    private static int asBinder;
    private static final SerialDescriptor descriptor;
    private static short[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2 = 4 - (s2 * 2);
        byte[] bArr = $$a;
        int i3 = (b * 3) + 115;
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = i4;
            i = i2;
            i2 += -i6;
            i++;
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i];
            i2 += -i6;
            i++;
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
            }
        } else {
            i = i2;
            i2 = i3;
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 69;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return serialDescriptor;
    }

    static {
        asBinder = 0;
        onNavigationEvent();
        HomeDstServerProcessRequest$$serializer homeDstServerProcessRequest$$serializer = new HomeDstServerProcessRequest$$serializer();
        INSTANCE = homeDstServerProcessRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.dst.handler.HomeDstServerProcessRequest", homeDstServerProcessRequest$$serializer, 2);
        Object[] objArr = new Object[1];
        a((short) TextUtils.indexOf("", ""), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 91), Color.red(0) + 2001806741, 603199787 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) - 18, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a((short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (byte) (79 - Color.argb(0, 0, 0, 0)), 2001806743 - (ViewConfiguration.getTapTimeout() >> 16), 603199778 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-19) - ExpandableListView.getPackedPositionChild(0L), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = asInterface + 95;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private HomeDstServerProcessRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback((KSerializer) HomeDstServerProcessRequest.IAuthTabCallback()[1].getValue())};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) HomeDstServerProcessRequest.IAuthTabCallback()[0].getValue());
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeDstServerProcessRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 77;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            HomeDstServerProcessRequest.IAuthTabCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = HomeDstServerProcessRequest.IAuthTabCallback();
        if (!ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            strAsInterface = null;
            map = null;
            i = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    map = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), map);
                    i |= 2;
                }
            }
        } else {
            strAsInterface = ywVarOnWarmupCompleted2.asInterface(serialDescriptor, 0);
            map = (Map) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            int i4 = onTransact + 69;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            i = 3;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new HomeDstServerProcessRequest(i, strAsInterface, map, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m618deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        HomeDstServerProcessRequest homeDstServerProcessRequestDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 125;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return homeDstServerProcessRequestDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeDstServerProcessRequest homeDstServerProcessRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeDstServerProcessRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeDstServerProcessRequest.onWarmupCompleted(homeDstServerProcessRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeDstServerProcessRequest) obj);
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[PHI: r4
      0x0088: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v23 byte[]) binds: [B:19:0x0086, B:16:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        byte[] bArr;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16820640), TextUtils.indexOf("", "", 0, 0) + 42, Drawable.resolveOpacity(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 65;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i8 = $10 + 71;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    bArr = onNavigationEvent;
                    int i9 = 12 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i10 = 0;
                        while (i10 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12891 - AndroidCharacter.getMirror('0')), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55, 2167 - Color.red(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i10++;
                                int i11 = $11 + 101;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        int i13 = $10 + 37;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr3 = onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getLongPressTimeout() >> 16)), MotionEvent.axisFromString("") + 43, 22439 - (ViewConfiguration.getScrollBarSize() >> 8), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = onNavigationEvent;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 86, 9568 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i15 = 0;
                    while (i15 < length2) {
                        bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                        i15++;
                        int i16 = $11 + 71;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i18 = $10 + 13;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!(!z)) {
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback = 753468003;
        onExtraCallbackWithResult = -1538795490;
        onWarmupCompleted = 2018262857;
        onNavigationEvent = new byte[]{-71, 87, -86, 84, -70, 8, 8};
    }
}
