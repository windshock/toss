package viva.republica.toss.network.model.account;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
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
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class OpenBankingRestrictionMockRequest$$serializer implements aeu2<OpenBankingRestrictionMockRequest> {
    private static int IAuthTabCallback;
    public static final OpenBankingRestrictionMockRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static byte[] onExtraCallback;
    private static short[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {62, 54, 60, ISO7816.INS_UNBLOCK_CHV};
    private static final int $$b = 194;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3 = i + 4;
        byte[] bArr = $$a;
        int i4 = 115 - (b2 * 2);
        int i5 = b * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i5;
            i4 += i6;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i3++;
            i6 = bArr[i3];
            i4 += i6;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onTransact = 1;
        IAuthTabCallback();
        OpenBankingRestrictionMockRequest$$serializer openBankingRestrictionMockRequest$$serializer = new OpenBankingRestrictionMockRequest$$serializer();
        INSTANCE = openBankingRestrictionMockRequest$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.account.OpenBankingRestrictionMockRequest", openBankingRestrictionMockRequest$$serializer, 4);
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) - 387378859, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 814526590, (ViewConfiguration.getTapTimeout() >> 16) - 86, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("restrictionReleasedAt", false);
        setanimationsloop.onWarmupCompleted("withdrawalAgreedAt", false);
        setanimationsloop.onWarmupCompleted("inquiryAgreedAt", false);
        descriptor = setanimationsloop;
        int i = asInterface + 99;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }

    private OpenBankingRestrictionMockRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{OpenBankingRestrictionMockRequest.onExtraCallback()[0].getValue(), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = OpenBankingRestrictionMockRequest.onExtraCallback()[1].getValue();
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = sp.IAuthTabCallback(getwrigglelayout2);
        kSerializerArr[2] = sp.IAuthTabCallback(getwrigglelayout2);
        kSerializerArr[3] = sp.IAuthTabCallback(getwrigglelayout2);
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        OpenBankingRestrictionMockRequest openBankingRestrictionMockRequestM21deserialize = m21deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return openBankingRestrictionMockRequestM21deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final OpenBankingRestrictionMockRequest m21deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        OpenBankingRestrictionMockType openBankingRestrictionMockType;
        String str3;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 3;
        asBinder = i3 % 128;
        String str4 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            OpenBankingRestrictionMockRequest.onExtraCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = OpenBankingRestrictionMockRequest.onExtraCallback();
        int i4 = 0;
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            OpenBankingRestrictionMockType openBankingRestrictionMockType2 = (OpenBankingRestrictionMockType) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str5 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str6 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str3 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            openBankingRestrictionMockType = openBankingRestrictionMockType2;
            i = 15;
            str2 = str5;
            str = str6;
        } else {
            String str7 = null;
            OpenBankingRestrictionMockType openBankingRestrictionMockType3 = null;
            String str8 = null;
            int i5 = 1;
            int i6 = 0;
            while (i5 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i5 = i4;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = asBinder;
                    int i8 = i7 + 7;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i10 = i7 + 105;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        if (iOnNavigationEvent == 2) {
                            str4 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                            i6 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str8 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str8);
                            i6 |= 8;
                        }
                    } else {
                        str7 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str7);
                        i6 |= 2;
                    }
                    i4 = 0;
                } else {
                    openBankingRestrictionMockType3 = (OpenBankingRestrictionMockType) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, i4, (jp) lazyArrOnExtraCallback[i4].getValue(), openBankingRestrictionMockType3);
                    i6 |= 1;
                }
            }
            int i12 = IAuthTabCallbackStub + 21;
            asBinder = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 / 4;
            }
            str = str4;
            str2 = str7;
            openBankingRestrictionMockType = openBankingRestrictionMockType3;
            str3 = str8;
            i = i6;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        OpenBankingRestrictionMockRequest openBankingRestrictionMockRequest = new OpenBankingRestrictionMockRequest(i, openBankingRestrictionMockType, str2, str, str3, (okycx) null);
        int i14 = IAuthTabCallbackStub + 13;
        asBinder = i14 % 128;
        int i15 = i14 % 2;
        return openBankingRestrictionMockRequest;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OpenBankingRestrictionMockRequest) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OpenBankingRestrictionMockRequest openBankingRestrictionMockRequest) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(openBankingRestrictionMockRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OpenBankingRestrictionMockRequest.onWarmupCompleted(openBankingRestrictionMockRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43424), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 22439 - Color.alpha(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $10 + 93;
                        $11 = i7 % 128;
                        if (i7 % i4 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getMode(0)), 55 - Color.alpha(0), 2166 - ((byte) KeyEvent.getModifierMetaStateMask()), -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i6 >>= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 55 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 2167, -299036574, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i6++;
                        }
                        i4 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallback;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.combineMeasuredStates(0, 0)), 43 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i8 = $10 + 13;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                int i11 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L)));
                if (z2) {
                    int i12 = i9 + 15;
                    $10 = i12 % 128;
                    int i13 = i12 % 2 != 0 ? 0 : 1;
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i11 + i13;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), 86 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 9567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int i14 = $11 + 27;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i17 = $11 + 95;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i19 = $11 + 1;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            int i20 = 12 / 0;
                            if (z) {
                                byte[] bArr6 = onExtraCallback;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                        } else if (z) {
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
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

    static void IAuthTabCallback() {
        onNavigationEvent = -1286523228;
        onWarmupCompleted = -1538795427;
        IAuthTabCallback = -1798608647;
        onExtraCallback = new byte[]{-89, -3, -1, 13};
    }
}
