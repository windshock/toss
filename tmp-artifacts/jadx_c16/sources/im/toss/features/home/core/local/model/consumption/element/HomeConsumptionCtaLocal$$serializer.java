package im.toss.features.home.core.local.model.consumption.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionCtaLocal$$serializer implements aeu2<HomeConsumptionCtaLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final HomeConsumptionCtaLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        HomeConsumptionCtaLocal$$serializer homeConsumptionCtaLocal$$serializer = new HomeConsumptionCtaLocal$$serializer();
        INSTANCE = homeConsumptionCtaLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.consumption.element.HomeConsumptionCtaLocal", homeConsumptionCtaLocal$$serializer, 5);
        Object[] objArr = new Object[1];
        a(new int[]{-1649360029, 1963636796}, TextUtils.lastIndexOf("", '0', 0) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("trackEvent", false);
        setanimationsloop.onWarmupCompleted("id", false);
        Object[] objArr2 = new Object[1];
        a(new int[]{1536634311, 1427325882, 1021355520, 2105372607}, View.MeasureSpec.getSize(0) + 5, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("links", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private HomeConsumptionCtaLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = HomeConsumptionCtaLocal.onExtraCallbackWithResult();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getBgColor.IAuthTabCallback, getwrigglelayout, getwrigglelayout, lazyArrOnExtraCallbackWithResult[4].getValue()};
        int i4 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeConsumptionCtaLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        String str;
        int i;
        String str2;
        String str3;
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = HomeConsumptionCtaLocal.onExtraCallbackWithResult();
        String strAsInterface = null;
        int i3 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str2 = strAsInterface3;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), (Object) null);
            str3 = strAsInterface2;
            str = strAsInterface4;
            i = 31;
            z = zOnExtraCallbackWithResult;
        } else {
            int i6 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            List list2 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            int i8 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z2 = false;
                    i3 = i3;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i8 |= 1;
                    i3 = i3;
                } else if (iOnNavigationEvent != i3) {
                    if (iOnNavigationEvent != 2) {
                        int i9 = onExtraCallbackWithResult + 35;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent == 3) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i8 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArrOnExtraCallbackWithResult[4].getValue(), list2);
                            i8 |= 16;
                            int i11 = onExtraCallbackWithResult + 57;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                        }
                    } else {
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i8 |= 4;
                    }
                    i3 = 1;
                } else {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3);
                    i8 |= 2;
                }
            }
            list = list2;
            str = strAsInterface;
            i = i8;
            str2 = strAsInterface5;
            str3 = strAsInterface6;
            z = zOnExtraCallbackWithResult2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeConsumptionCtaLocal(i, str3, z, str2, str, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m259deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeConsumptionCtaLocal homeConsumptionCtaLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeConsumptionCtaLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeConsumptionCtaLocal.onExtraCallbackWithResult(homeConsumptionCtaLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeConsumptionCtaLocal) obj);
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i4 = -1469660336;
        char c = '0';
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                int i7 = $11 + 107;
                $10 = i7 % 128;
                if (i7 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c, 0, 0)), View.combineMeasuredStates(0, 0) + 72, 8848 - TextUtils.getCapsMode("", 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 72, 8848 - ExpandableListView.getPackedPositionType(0L), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                }
                i6++;
                i2 = 2;
                c = '0';
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onNavigationEvent;
        if (iArr6 != null) {
            int i8 = $11 + 61;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 73;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr6[i9]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(i5), 'x' - AndroidCharacter.getMirror('0'), 8849 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i9++;
                int i12 = $11 + 9;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                i4 = -1469660336;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i14 = i5;
        System.arraycopy(iArr6, i14, iArr5, i14, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i14] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            for (int i15 = 0; i15 < 16; i15++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                try {
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22252), 39 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 4033), 78 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new int[]{1438985002, -402999221, 353775085, -1536485445, 1067175442, -2135310728, -151801039, 297799728, 1983604961, 1401048613, -458188782, -935483374, -1958914703, -951686759, -1306990239, 2003027418, -2068492505, -961131191};
    }
}
