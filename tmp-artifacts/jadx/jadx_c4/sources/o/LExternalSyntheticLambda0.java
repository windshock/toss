package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverPageConfiguration;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LExternalSyntheticLambda0 {
    public static final onExtraCallback Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static int asBinder;
    private static final String asInterface;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static final String onWarmupCompleted;
    private final GriverPageConfiguration onTransact;
    private static final byte[] $$a = {8, -40, 43, -43};
    private static final int $$b = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access100 = 1;
    private static int IAuthTabCallbackStub = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = b2 * 3;
        int i5 = 105 - (b * 3);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            int i8 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i8];
            i3 = i5;
            i5 = b3;
            i7 = i2 + 1;
            i6 = i8;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            int i82 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    static {
        asBinder = 1;
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0') + 3, -TextUtils.lastIndexOf("", '0', 0), new char[]{'\"', 65502}, true, 248 - View.resolveSize(0, 0), objArr);
        asInterface = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(26 - TextUtils.indexOf("", ""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, new char[]{16, 22, 15, 5, 21, 22, 3, 2, 65486, 23, 2, 19, '\n', 2, 3, '\r', 6, 65486, 23, 65491, 65486, 15, 16, 21, 65486, 7}, false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 259, objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(1 - (ViewConfiguration.getEdgeSlop() >> 16), 1 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{0}, true, (KeyEvent.getMaxKeyCode() >> 16) + 213, objArr3);
        onExtraCallbackWithResult = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0, 0) + 19, TextUtils.indexOf("", "") + 15, new char[]{65527, 65525, 1, 65531, 15, 65525, 4, 5, '\n', 65525, 65532, 5, 11, 4, 65530, '\n', 11, 65528}, false, (ViewConfiguration.getEdgeSlop() >> 16) + 270, objArr4);
        onExtraCallback = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, 5 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{65527, 65535, '\b', 65527, '\f', 65531, 6, 15, '\n', 65525, 65531, 2, 65528}, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 270, objArr5);
        IAuthTabCallback = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 3, View.combineMeasuredStates(0, 0) + 3, new char[]{'\f', 65528, 65534}, true, ((byte) KeyEvent.getModifierMetaStateMask()) + 274, objArr6);
        onWarmupCompleted = ((String) objArr6[0]).intern();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallbackStub + 113;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public LExternalSyntheticLambda0() throws Throwable {
        GriverPageConfiguration.IAuthTabCallback iAuthTabCallback = GriverPageConfiguration.Companion;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25, 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{16, 22, 15, 5, 21, 22, 3, 2, 65486, 23, 2, 19, '\n', 2, 3, '\r', 6, 65486, 23, 65491, 65486, 15, 16, 21, 65486, 7}, false, 259 - View.resolveSize(0, 0), objArr);
        this.onTransact = iAuthTabCallback.IAuthTabCallback(((String) objArr[0]).intern());
    }

    public final boolean onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.onTransact.onNavigationEvent(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact.onNavigationEvent(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.onTransact.onNavigationEvent(str)) {
            int i4 = access100 + 79;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        GriverPageConfiguration griverPageConfiguration = this.onTransact;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{0}, true, 213 - Color.red(0), objArr);
        griverPageConfiguration.onExtraCallback(str, ((String) objArr[0]).intern());
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        a(13 - Color.red(0), Color.red(0) + 5, new char[]{65527, 65535, '\b', 65527, '\f', 65531, 6, 15, '\n', 65525, 65531, 2, 65528}, true, 270 - Color.alpha(0), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(2 - (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{'\"', 65502}, true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 247, objArr3);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, 2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{'\f', 65528, 65534}, true, (ViewConfiguration.getPressedStateDuration() >> 16) + 273, objArr4);
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), str)});
        Object[] objArr5 = new Object[1];
        a(MotionEvent.axisFromString("") + 19, 15 - Drawable.resolveOpacity(0, 0), new char[]{65527, 65525, 1, 65531, 15, 65525, 4, 5, '\n', 65525, 65532, 5, 11, 4, 65530, '\n', 11, 65528}, false, 271 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr5[0]).intern(), (String) null, mapOnWarmupCompleted, (String) null, false, (String) null, 58, (Object) null);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (Process.myTid() >> 22)), 22 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.red(0)), View.combineMeasuredStates(0, 0) + 55, (-16775049) - Color.rgb(0, 0, 0), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i7 = $11 + 53;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 55 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2166, 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            int i9 = $10 + 61;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = 478309005;
    }
}
