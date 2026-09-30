package com.horcrux.svg.events;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.isList;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SvgLoadEvent extends Event<SvgLoadEvent> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String EVENT_NAME = "topLoad";
    private static int[] onExtraCallback = {829837088, 1083756245, -1551341690, -207731762, -1021486008, 993842696, -763039739, 244707656, 1903417138, 1047007928, 170297524, 181818940, 400950873, 287489635, -714898825, 1793374716, 1843742666, 1452164680};
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final float height;
    private final String uri;
    private final float width;

    public short getCoalescingKey() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 25;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return (short) 0;
    }

    public SvgLoadEvent(int i2, int i3, ReactContext reactContext, String str, float f, float f2) {
        super(i2, i3);
        this.uri = new isList(reactContext, str).onExtraCallback();
        this.width = f;
        this.height = f2;
    }

    public String getEventName() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return EVENT_NAME;
        }
        throw null;
    }

    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int viewTag = getViewTag();
        if (i4 != 0) {
            rCTEventEmitter.receiveEvent(viewTag, getEventName(), getEventData());
        } else {
            rCTEventEmitter.receiveEvent(viewTag, getEventName(), getEventData());
            int i5 = 38 / 0;
        }
    }

    public WritableMap getEventData() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", this.width);
        writableMapCreateMap.putDouble("height", this.height);
        Object[] objArr = new Object[1];
        a(new int[]{-1291662257, 1921356729}, View.getDefaultSize(0, 0) + 3, objArr);
        writableMapCreateMap.putString(((String) objArr[0]).intern(), this.uri);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("source", writableMapCreateMap);
        int i5 = onWarmupCompleted + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return writableMapCreateMap2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        int i4 = -1469660336;
        int i5 = 16;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $10 + 29;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 35;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> i5), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 71, 8848 - Gravity.getAbsoluteGravity(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i12]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", i6, i6), 72 - TextUtils.getOffsetBefore("", i6), 8848 - Color.green(i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i12++;
                i4 = -1469660336;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i6;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        int i14 = $11 + 89;
        $10 = i14 % 128;
        int i15 = 3;
        if (i14 % 2 != 0) {
            int i16 = 3 % 3;
        }
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[i15] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[i15];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = $10 + 1;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    int iOnExtraCallback = SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent);
                    try {
                        Object[] objArr4 = new Object[4];
                        objArr4[i15] = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
                        objArr4[2] = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
                        objArr4[1] = Integer.valueOf(iOnExtraCallback);
                        objArr4[0] = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            char offsetBefore = (char) (22252 - TextUtils.getOffsetBefore("", 0));
                            int iIndexOf = 39 - TextUtils.indexOf("", "", 0);
                            int offsetAfter = 10301 - TextUtils.getOffsetAfter("", 0);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Object.class;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Object.class;
                            clsArr[i15] = Object.class;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, iIndexOf, offsetAfter, -1406952323, false, "j", clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                        i17 += 20;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                    int iOnExtraCallback2 = SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent);
                    Object[] objArr5 = new Object[4];
                    objArr5[i15] = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
                    objArr5[2] = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
                    objArr5[1] = Integer.valueOf(iOnExtraCallback2);
                    objArr5[0] = simpleBasePlayerPositionSupplierExternalSyntheticLambda0;
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        char mode = (char) (22252 - View.MeasureSpec.getMode(0));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 39;
                        int iResolveOpacity = 10301 - Drawable.resolveOpacity(0, 0);
                        Class[] clsArr2 = new Class[4];
                        clsArr2[0] = Object.class;
                        clsArr2[1] = Integer.TYPE;
                        clsArr2[2] = Object.class;
                        clsArr2[i15] = Object.class;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, packedPositionGroup, iResolveOpacity, -1406952323, false, "j", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i17++;
                }
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[i15] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + i15] = cArr[i15];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - ExpandableListView.getPackedPositionType(0L)), 78 - (ViewConfiguration.getJumpTapTimeout() >> 16), 7398 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i15 = 3;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
