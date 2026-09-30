package com.facebook.react.views.textinput;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReactTextInputKeyPressEvent extends Event<ReactTextInputKeyPressEvent> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private final String onExtraCallbackWithResult;

    static {
        onExtraCallback();
        Companion = new Companion(null);
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean canCoalesce() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 99;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 43;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 12 / 0;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactTextInputKeyPressEvent(int i2, int i3, @NotNull String str) {
        super(i2, i3);
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }

    public String getEventName() {
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 75;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return "topKeyPress";
    }

    public WritableMap getEventData() throws Throwable {
        WritableMap writableMapCreateMap;
        Object obj;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 93;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            writableMapCreateMap = Arguments.createMap();
            Object[] objArr = new Object[1];
            a(new char[]{47617, 17022, 19336, 41094}, (ViewConfiguration.getTouchSlop() << 93) + 5, objArr);
            obj = objArr[0];
        } else {
            writableMapCreateMap = Arguments.createMap();
            Object[] objArr2 = new Object[1];
            a(new char[]{47617, 17022, 19336, 41094}, (ViewConfiguration.getTouchSlop() >> 8) + 3, objArr2);
            obj = objArr2[0];
        }
        writableMapCreateMap.putString(((String) obj).intern(), this.onExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStub + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return writableMapCreateMap;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 97;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 1;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                int i10 = $10 + 111;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 10 - View.getDefaultSize(0, 0), 12434 - (Process.myPid() >> 22), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777226, Color.alpha(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i12 = $11 + 55;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - MotionEvent.axisFromString("")), View.resolveSizeAndState(0, 0, 0) + 14, 19901 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void onExtraCallback() {
        onExtraCallback = (char) 43307;
        onWarmupCompleted = (char) 43413;
        IAuthTabCallback = (char) 55928;
        onNavigationEvent = (char) 24179;
    }
}
