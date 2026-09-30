package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.credit.data.response.ScoreRaisePackageHomeResponse;
import java.lang.reflect.Method;
import java.util.List;
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
public final /* synthetic */ class ScoreRaisePackageHomeResponse$StatsSection$$serializer implements aeu2<ScoreRaisePackageHomeResponse.StatsSection> {
    private static int IAuthTabCallback;
    public static final ScoreRaisePackageHomeResponse$StatsSection$$serializer INSTANCE;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {5, 64, Byte.MAX_VALUE, 81};
    private static final int $$b = 195;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i * 3;
        int i4 = 3 - (s * 4);
        int i5 = (s2 * 4) + 115;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i5 += -i6;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            i5 += -i6;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        asInterface = 0;
        onExtraCallback();
        ScoreRaisePackageHomeResponse$StatsSection$$serializer scoreRaisePackageHomeResponse$StatsSection$$serializer = new ScoreRaisePackageHomeResponse$StatsSection$$serializer();
        INSTANCE = scoreRaisePackageHomeResponse$StatsSection$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.ScoreRaisePackageHomeResponse.StatsSection", scoreRaisePackageHomeResponse$StatsSection$$serializer, 2);
        setanimationsloop.onWarmupCompleted("stats", true);
        Object[] objArr = new Object[1];
        a((short) (Process.getGidForName("") + 121), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSize(0, 0) - 1115958365, (-75556617) - Color.rgb(0, 0, 0), (-92) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackDefault + 115;
        asInterface = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ScoreRaisePackageHomeResponse$StatsSection$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{sp.IAuthTabCallback((KSerializer) ScoreRaisePackageHomeResponse.StatsSection.onExtraCallback()[0].getValue()), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        }
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) ScoreRaisePackageHomeResponse.StatsSection.onExtraCallback()[1].getValue());
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ScoreRaisePackageHomeResponse.StatsSection deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = asBinder + 51;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            ScoreRaisePackageHomeResponse.StatsSection.onExtraCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = ScoreRaisePackageHomeResponse.StatsSection.onExtraCallback();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            int i4 = asBinder + 119;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            i = 3;
        } else {
            int i6 = 0;
            list = null;
            String str2 = null;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = asBinder + 43;
                    int i8 = i7 % 128;
                    onTransact = i8;
                    if (i7 % 2 != 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i9 = i8 + 101;
                        asBinder = i9 % 128;
                        int i10 = i9 % 2;
                        str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i6 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i92 = i8 + 101;
                        asBinder = i92 % 128;
                        int i102 = i92 % 2;
                        str2 = (String) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i6 |= 2;
                    }
                } else {
                    list = (List) ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list);
                    i6 |= 1;
                }
            }
            i = i6;
            str = str2;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new ScoreRaisePackageHomeResponse.StatsSection(i, list, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m194deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ScoreRaisePackageHomeResponse.StatsSection statsSectionDeserialize = deserialize(decoder);
        int i4 = asBinder + 99;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return statsSectionDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ScoreRaisePackageHomeResponse.StatsSection statsSection) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(statsSection, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ScoreRaisePackageHomeResponse.StatsSection.IAuthTabCallback(statsSection, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asBinder + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ScoreRaisePackageHomeResponse.StatsSection) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asBinder + 47;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int length;
        byte[] bArr;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.red(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, Gravity.getAbsoluteGravity(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            long j2 = 0;
            if (i5 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr2 = onExtraCallbackWithResult;
                if (bArr2 != null) {
                    int i6 = $10 + 97;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 12843);
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 55;
                                int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 2168;
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iIndexOf, i9, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i8++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = onExtraCallbackWithResult;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43424), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22439 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 86 - ExpandableListView.getPackedPositionGroup(0L), 9567 - (KeyEvent.getMaxKeyCode() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallbackWithResult;
                if (bArr5 != null) {
                    int i10 = $10 + 11;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        bArr[i11] = (byte) (bArr5[i11] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i12 = $10 + 71;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i14 = $10 + 45;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
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

    static void onExtraCallback() {
        IAuthTabCallback = -423365547;
        onExtraCallback = -1538795415;
        onWarmupCompleted = -1480114315;
        onExtraCallbackWithResult = new byte[]{-119, -120, -101, 117, 8};
    }
}
