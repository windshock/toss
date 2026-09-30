package im.toss.features.home.core.remote.model.dst.widget;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.home.core.remote.model.dst.widget.HomeListRowAttributeResponse$HomeListRowTopSerializer$;
import im.toss.features.home.core.remote.model.dst.widget.HomeListRowAttributeResponse$Top;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.access8100;
import o.getWrite;
import o.j1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HomeListRowAttributeResponse$asBinder extends j1<HomeListRowAttributeResponse$Top> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    public static final HomeListRowAttributeResponse$asBinder onExtraCallback;
    private static boolean onExtraCallbackWithResult = false;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        onExtraCallback = new HomeListRowAttributeResponse$asBinder();
        int i = onTransact + 13;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(str);
        }
        onExtraCallbackWithResult(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = onWarmupCompleted;
        if (cArr4 != null) {
            int i3 = $11 + 41;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 76 - TextUtils.lastIndexOf("", '0'), 20952 - Color.alpha(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 75, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i5 = 1052772399;
            if (onExtraCallbackWithResult) {
                int i6 = $10 + 15;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63, 12214 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 1052772399;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                String str = new String(cArr5);
                int i7 = $11 + 73;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                objArr[0] = str;
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (KeyEvent.getMaxKeyCode() >> 16) + 63, 12214 - (ViewConfiguration.getFadingEdgeLength() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i9 = $11 + 45;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private HomeListRowAttributeResponse$asBinder() throws Throwable {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HomeListRowAttributeResponse$Top.class);
        HomeListRowAttributeResponse$Top.Image.Companion companion = HomeListRowAttributeResponse$Top.Image.Companion;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("IMAGE", companion.serializer()), getWrite.IAuthTabCallback("ROUND_BUTTON", HomeListRowAttributeResponse$Top.RoundButton.Companion.serializer())});
        KSerializer kSerializerSerializer = companion.serializer();
        HomeListRowAttributeResponse$HomeListRowTopSerializer$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new HomeListRowAttributeResponse$HomeListRowTopSerializer$.ExternalSyntheticLambda0();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -126, -127}, Color.rgb(0, 0, 0) + 16777343, objArr);
        super(orCreateKotlinClass, ((String) objArr[0]).intern(), mapOnWarmupCompleted, kSerializerSerializer, externalSyntheticLambda0);
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "HomeListRowAttributeResponse", "Unknown Top type: " + str, null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{32496, 32491, 32508, 32455};
        onNavigationEvent = -1184333972;
        IAuthTabCallback = true;
        onExtraCallbackWithResult = true;
    }
}
