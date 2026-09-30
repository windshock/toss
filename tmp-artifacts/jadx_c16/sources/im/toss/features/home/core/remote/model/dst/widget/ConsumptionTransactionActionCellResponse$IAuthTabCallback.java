package im.toss.features.home.core.remote.model.dst.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse;
import im.toss.features.home.core.remote.model.dst.widget.ConsumptionTransactionActionCellResponse$OrderResponseSerializer$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.TrackGroupExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import o.j1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ConsumptionTransactionActionCellResponse$IAuthTabCallback extends j1<ConsumptionTransactionActionCellResponse.OrderResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int asInterface = 1;
    public static final ConsumptionTransactionActionCellResponse$IAuthTabCallback onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        onExtraCallback();
        onExtraCallback = new ConsumptionTransactionActionCellResponse$IAuthTabCallback();
        int i = onWarmupCompleted + 1;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return unitOnExtraCallback;
    }

    private ConsumptionTransactionActionCellResponse$IAuthTabCallback() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConsumptionTransactionActionCellResponse.OrderResponse.class);
        ConsumptionTransactionActionCellResponse$OrderResponse$Front consumptionTransactionActionCellResponse$OrderResponse$Front = ConsumptionTransactionActionCellResponse$OrderResponse$Front.INSTANCE;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("FRONT", consumptionTransactionActionCellResponse$OrderResponse$Front.serializer()), getWrite.IAuthTabCallback("LAST", ConsumptionTransactionActionCellResponse$OrderResponse$Last.INSTANCE.serializer())});
        KSerializer<ConsumptionTransactionActionCellResponse$OrderResponse$Front> kSerializerSerializer = consumptionTransactionActionCellResponse$OrderResponse$Front.serializer();
        ConsumptionTransactionActionCellResponse$OrderResponseSerializer$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new ConsumptionTransactionActionCellResponse$OrderResponseSerializer$.ExternalSyntheticLambda0();
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 0, 4}, false, new byte[]{0, 1, 1, 1}, objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), mapOnWarmupCompleted, kSerializerSerializer, externalSyntheticLambda0);
    }

    private static final Unit onExtraCallback(String str) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ConsumptionTransactionActionCellResponse.OrderResponse", "Unknown order type: " + str, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onNavigationEvent;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 35 - Drawable.resolveOpacity(0, 0), 14238 - TextUtils.lastIndexOf("", '0', 0), -884206168, false, "t", new Class[]{Integer.TYPE});
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
                int i7 = $10 + 87;
                $11 = i7 % 128;
                if (i7 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), 17657 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Gravity.getAbsoluteGravity(0, 0)), Drawable.resolveOpacity(0, 0) + 65, 16718 - (ViewConfiguration.getLongPressTimeout() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.blue(0)), 69 - Process.getGidForName(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i10 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i10, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i11 = $11 + 57;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i13 = $11 + 37;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $10 + 43;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 5 / 4;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{27252, 27192, 27194, 27172};
    }
}
