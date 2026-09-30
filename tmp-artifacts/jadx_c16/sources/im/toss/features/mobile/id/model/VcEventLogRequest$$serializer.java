package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VcEventLogRequest$$serializer implements aeu2<VcEventLogRequest> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final VcEventLogRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        VcEventLogRequest$$serializer vcEventLogRequest$$serializer = new VcEventLogRequest$$serializer();
        INSTANCE = vcEventLogRequest$$serializer;
        Object[] objArr = new Object[1];
        a(new int[]{956688923, -1517256341, -1407694142, 539690568, -1477178350, 973446054, -1665362510, -2079468927, 645353987, 1016445844, 783552, 1895700786, -1588594809, 51218901, -298299794, 1614745220, 247647693, 221804674, -1143301654, -2043557310, 85105154, -1623232043, 3130713, 1176689795, 1215376884, -873568821}, 51 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), vcEventLogRequest$$serializer, 3);
        Object[] objArr2 = new Object[1];
        a(new int[]{56852421, -1900443409, -1736214975, -1698015265, -295126571, -1064035723}, 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new int[]{-1392205442, -1940790618, 1284974965, 1829710150, -1018538499, 1965498699}, View.MeasureSpec.getSize(0) + 11, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(new int[]{2146554218, -955210917, 688744367, -512630882, 305862392, 895453966}, 9 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private VcEventLogRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = VcEventLogRequest.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, lazyArrOnWarmupCompleted[1].getValue(), getwrigglelayout};
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VcEventLogRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = VcEventLogRequest.onWarmupCompleted();
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            int i5 = onNavigationEvent + 61;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 3;
            }
            list = list2;
            str = strAsInterface;
            str2 = strAsInterface2;
            i = 7;
        } else {
            int i7 = 0;
            List list3 = null;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            boolean z = true;
            while (z) {
                int i8 = onNavigationEvent + 43;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i9 = onNavigationEvent + 81;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        if (iOnNavigationEvent == 1) {
                            list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list3);
                            i7 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                            i7 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list3);
                        i7 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 |= 1;
                }
            }
            list = list3;
            str = strAsInterface3;
            str2 = strAsInterface4;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        VcEventLogRequest vcEventLogRequest = new VcEventLogRequest(i, str, list, str2, (okycx) null);
        int i10 = IAuthTabCallback + 61;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 != 0) {
            return vcEventLogRequest;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m671deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull VcEventLogRequest vcEventLogRequest) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(vcEventLogRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        VcEventLogRequest.IAuthTabCallback(vcEventLogRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (VcEventLogRequest) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onWarmupCompleted;
        char c = '0';
        int i4 = -1469660336;
        long j = 0;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 72, TextUtils.lastIndexOf("", c, 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    c = '0';
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onWarmupCompleted;
        if (iArr6 != null) {
            int i8 = $10 + 21;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr6[i9]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(i6, i6), (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 72, TextUtils.lastIndexOf("", '0', i6) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i9++;
                i4 = -1469660336;
                i5 = 1;
                i6 = 0;
            }
            int i10 = $11 + 123;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            iArr6 = iArr2;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $10 + 125;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i14 = 0;
            while (i14 < 16) {
                int i15 = $11 + 39;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i14];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - TextUtils.getOffsetAfter("", 0)), 39 - TextUtils.getTrimmedLength(""), 10300 - ((byte) KeyEvent.getModifierMetaStateMask()), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14 += 91;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i14];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40, (-16766915) - Color.rgb(0, 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i14++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 78 - View.resolveSize(0, 0), 7398 - Color.alpha(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new int[]{-1741155813, -1959697834, -397377310, 237134647, -555656078, -1014667848, 1317728447, 2042905731, -1877045786, -1389921333, -1189215621, 1925421935, 1155899719, -41611181, 175565014, -337570233, 483726842, -87302123};
    }
}
