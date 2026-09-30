package im.toss.features.home.core.remote.model;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.home.core.remote.model.AssetOverviewResponse;
import im.toss.features.home.core.remote.model.AssetOverviewResponse$AssetOverviewHeaderSerializer$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access8100;
import o.getWrite;
import o.j1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetOverviewResponse$onExtraCallback extends j1<AssetOverviewResponse.Header> {
    private static char IAuthTabCallback;
    private static int asInterface;
    public static final AssetOverviewResponse$onExtraCallback onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onNavigationEvent = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3;
        int i4 = 1 - (s * 2);
        byte[] bArr = $$a;
        int i5 = 4 - (i * 4);
        int i6 = b + 109;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i6 = i4;
            i3 = 0;
            i6 += i7;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i6 += i7;
            i5++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    static {
        asInterface = 1;
        onExtraCallbackWithResult();
        onExtraCallback = new AssetOverviewResponse$onExtraCallback();
        int i = IAuthTabCallbackDefault + 19;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str);
        int i4 = asBinder + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private AssetOverviewResponse$onExtraCallback() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetOverviewResponse.Header.class);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("ATTENTION_AMOUNT_TOP", AssetOverviewResponse.Header.AttentionAmountTop.Companion.serializer());
        AssetOverviewResponse.Header.Default.Companion companion = AssetOverviewResponse.Header.Default.Companion;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("DEFAULT", companion.serializer())});
        KSerializer kSerializerSerializer = companion.serializer();
        AssetOverviewResponse$AssetOverviewHeaderSerializer$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new AssetOverviewResponse$AssetOverviewHeaderSerializer$.ExternalSyntheticLambda0();
        Object[] objArr = new Object[1];
        a((char) (19197 - (ViewConfiguration.getTouchSlop() >> 8)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{18081, 4237, 62426, 61922}, new char[]{0, 0, 0, 0}, new char[]{9049, 2058, 64940, 42314}, objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), mapOnWarmupCompleted, kSerializerSerializer, externalSyntheticLambda0);
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $11 + 117;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 43 - View.resolveSize(0, 0), (-16775765) - Color.rgb(0, 0, 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myTid() >> 22)), Process.getGidForName("") + 45, 1493 - ExpandableListView.getPackedPositionChild(0L), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.getOffsetBefore("", 0)), 50 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSizeAndState(0, 0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 45848), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), 12577 - (ViewConfiguration.getLongPressTimeout() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 25;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit onWarmupCompleted(String str) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AssetOverviewResponse", "Unknown Header type: " + str, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 35;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 7798559133331975163L;
        onWarmupCompleted = -846151781;
        IAuthTabCallback = (char) 27643;
    }
}
