package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.internal.url._UrlKt;
import ua.naiksoftware.stomp.dto.StompHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transV2GetOtherDeviceID {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted;
    private static char[] IAuthTabCallback = {32518, 32523, 32519, 32527};
    private static int onNavigationEvent = -1184333900;
    private static boolean onExtraCallback = true;
    private static boolean onExtraCallbackWithResult = true;

    public static final /* synthetic */ WritableMap onWarmupCompleted(String str, WritableMap writableMap) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        WritableMap writableMapIAuthTabCallback = IAuthTabCallback(str, writableMap);
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return writableMapIAuthTabCallback;
    }

    private static final WritableMap IAuthTabCallback(String str, WritableMap writableMap) throws Throwable {
        WritableMap writableMapCreateMap;
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            writableMapCreateMap = Arguments.createMap();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, 8029 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            obj = objArr[0];
        } else {
            writableMapCreateMap = Arguments.createMap();
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, ((byte) KeyEvent.getModifierMetaStateMask()) + ByteCompanionObject.MIN_VALUE, objArr2);
            obj = objArr2[0];
        }
        writableMapCreateMap.putString(((String) obj).intern(), str);
        writableMapCreateMap.putMap(StompHeader.PARAMS, writableMap);
        int i3 = onWarmupCompleted + 57;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return writableMapCreateMap;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 101;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 77 - View.getDefaultSize(0, 0), View.combineMeasuredStates(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 74 - ExpandableListView.getPackedPositionChild(0L), KeyEvent.normalizeMetaState(0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i7 = 1052772399;
        if (!(!onExtraCallbackWithResult)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i8 = $11 + 111;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i7);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 64, 12213 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i7 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onExtraCallback) {
            int i10 = $10 + 19;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 63, ((Process.getThreadPriority(0) + 20) >> 6) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr5);
            int i12 = $10 + 99;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str;
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        while (true) {
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i14 = $10 + 99;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    break;
                }
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] % iIntValue);
            int i15 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
        }
    }
}
