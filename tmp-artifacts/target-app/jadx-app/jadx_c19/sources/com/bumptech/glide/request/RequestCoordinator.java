package com.bumptech.glide.request;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RequestCoordinator {
    RequestCoordinator IAuthTabCallback();

    boolean IAuthTabCallback(Request request);

    void IAuthTabCallbackDefault(Request request);

    boolean onExtraCallback(Request request);

    void onNavigationEvent(Request request);

    boolean onWarmupCompleted();

    boolean onWarmupCompleted(Request request);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SUCCESS' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class RequestState {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ RequestState[] $VALUES;
        public static final RequestState CLEARED;
        public static final RequestState FAILED;
        private static char[] IAuthTabCallback = null;
        public static final RequestState PAUSED;
        public static final RequestState RUNNING;
        public static final RequestState SUCCESS;
        private static int asBinder = 1;
        private static char onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final boolean isComplete;

        public static RequestState valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 39;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            RequestState requestState = (RequestState) Enum.valueOf(RequestState.class, str);
            if (i4 == 0) {
                int i5 = 45 / 0;
            }
            int i6 = asBinder + 113;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return requestState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static RequestState[] values() {
            int i2 = 2 % 2;
            int i3 = asBinder + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            RequestState[] requestStateArr = (RequestState[]) $VALUES.clone();
            int i5 = onWarmupCompleted + 111;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return requestStateArr;
        }

        static {
            onExtraCallback();
            RequestState requestState = new RequestState("RUNNING", 0, false);
            RUNNING = requestState;
            RequestState requestState2 = new RequestState("PAUSED", 1, false);
            PAUSED = requestState2;
            RequestState requestState3 = new RequestState("CLEARED", 2, false);
            CLEARED = requestState3;
            Object[] objArr = new Object[1];
            a(new char[]{3, 1, 13882, 13882, 1, 0, 13866}, (byte) (97 - Color.argb(0, 0, 0, 0)), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            RequestState requestState4 = new RequestState(((String) objArr[0]).intern(), 3, true);
            SUCCESS = requestState4;
            RequestState requestState5 = new RequestState("FAILED", 4, true);
            FAILED = requestState5;
            $VALUES = new RequestState[]{requestState, requestState2, requestState3, requestState4, requestState5};
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        private RequestState(String str, int i2, boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            boolean z;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 27;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                z = this.isComplete;
                int i5 = 78 / 0;
            } else {
                z = this.isComplete;
            }
            int i6 = i3 + 1;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                return z;
            }
            throw null;
        }

        private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
            int i3;
            Object obj;
            int i4;
            int i5 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Color.red(0) + 26, 23139 - (Process.myPid() >> 22), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, View.combineMeasuredStates(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i2];
                if (i2 % 2 != 0) {
                    i3 = i2 - 1;
                    cArr4[i3] = (char) (cArr[i3] - b);
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.green(0)), (-16777142) - Color.rgb(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i7 = $10 + 117;
                                $11 = i7 % 128;
                                int i8 = i7 % 2;
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), View.resolveSizeAndState(0, 0, 0) + 30, 19488 - (ViewConfiguration.getEdgeSlop() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                                i4 = $11 + 107;
                                $10 = i4 % 128;
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                                } else {
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                    i4 = $10 + 93;
                                    $11 = i4 % 128;
                                }
                            }
                            int i14 = i4 % 2;
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i15 = 0; i15 < i2; i15++) {
                    cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        static void onExtraCallback() {
            IAuthTabCallback = new char[]{65014, 64992, 65008, 64998};
            onExtraCallback = (char) 51243;
        }
    }
}
