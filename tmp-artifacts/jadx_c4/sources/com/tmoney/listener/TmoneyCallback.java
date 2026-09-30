package com.tmoney.listener;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.Tmoney;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class TmoneyCallback<T> extends a<T> {
    @Override // com.tmoney.listener.a
    public abstract void onResult(Tmoney.ApiName apiName, ResultType resultType, T t);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultType {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ ResultType[] $VALUES;
        private static char[] IAuthTabCallback = null;
        private static int IAuthTabCallbackDefault = 0;
        public static final ResultType SUCCESS;
        public static final ResultType TODO;
        public static final ResultType WARNING;
        private static int asBinder = 1;
        private static int onExtraCallback = 0;
        private static boolean onExtraCallbackWithResult = false;
        private static boolean onNavigationEvent = false;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        Object[] data;
        String detailCode;
        ResultError error;
        Exception exception;
        String log;
        String message;

        private static /* synthetic */ ResultType[] $values() {
            ResultType[] resultTypeArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                ResultType resultType = SUCCESS;
                ResultType resultType2 = WARNING;
                ResultType resultType3 = TODO;
                resultTypeArr = new ResultType[3];
                resultTypeArr[0] = resultType;
                resultTypeArr[0] = resultType2;
                resultTypeArr[4] = resultType3;
            } else {
                resultTypeArr = new ResultType[]{SUCCESS, WARNING, TODO};
            }
            int i4 = i3 + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return resultTypeArr;
        }

        static {
            onWarmupCompleted();
            ResultError resultError = ResultError.SUCCESS;
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-127, -127, -124, -125, -125, -126, -127}, KeyEvent.keyCodeFromString("") + 127, objArr);
            SUCCESS = new ResultType(((String) objArr[0]).intern(), 0, resultError, "", null);
            WARNING = new ResultType("WARNING", 1, resultError, "", null);
            TODO = new ResultType("TODO", 2, resultError, "", null);
            $VALUES = $values();
            int i = asBinder + 105;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private ResultType(String str, int i, ResultError resultError, String str2, Exception exc) {
            ResultError resultError2 = ResultError.SUCCESS;
            this.error = resultError;
            this.message = str2;
            this.exception = exc;
            this.log = "";
            this.detailCode = "";
            this.data = new Object[0];
        }

        public static ResultType valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            ResultType resultType = (ResultType) Enum.valueOf(ResultType.class, str);
            if (i3 != 0) {
                return resultType;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static ResultType[] values() {
            int i = 2 % 2;
            int i2 = onTransact + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResultType[] resultTypeArr = (ResultType[]) $VALUES.clone();
            int i4 = onTransact + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return resultTypeArr;
        }

        public final Object[] getData() {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = onTransact + 121;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                objArr = this.data;
                int i4 = 81 / 0;
            } else {
                objArr = this.data;
            }
            int i5 = i3 + 33;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return objArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getDetailCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.detailCode;
            int i5 = i3 + 101;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ResultError getError() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 15;
            onTransact = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            ResultError resultError = this.error;
            if (resultError != null) {
                int i4 = i2 + 23;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return resultError;
            }
            ResultError resultError2 = ResultError.EXCEPTION;
            int i6 = onWarmupCompleted + 79;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                return resultError2;
            }
            obj.hashCode();
            throw null;
        }

        public final Exception getException() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Exception exc = this.exception;
            int i5 = i2 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return exc;
        }

        public final String getLog() {
            int i = 2 % 2;
            int i2 = onTransact + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String str = this.log;
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            return str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = onTransact + 105;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.message;
            if (str != null) {
                return str;
            }
            int i5 = i3 + 37;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return "";
        }

        public final ResultType setData(Object... objArr) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.data = objArr;
            int i5 = i2 + 19;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final ResultType setDetailCode(String str) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.detailCode = str;
            if (i4 != 0) {
                int i5 = 18 / 0;
            }
            int i6 = i2 + 17;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final ResultType setError(ResultError resultError) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.error = resultError;
            int i5 = i2 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final ResultType setException(Exception exc) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.exception = exc;
            int i5 = i2 + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final ResultType setLog(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.log = str;
            if (i3 != 0) {
                return this;
            }
            throw null;
        }

        public final ResultType setMessage(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.message = str;
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            return this;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb;
            String message;
            StringBuilder sb2;
            int i = 2 % 2;
            if (getError() != null) {
                sb2 = new StringBuilder("/");
                sb2.append(getError());
            } else {
                if ((getDetailCode()) != null) {
                    sb = new StringBuilder("/");
                    message = getDetailCode();
                    int i2 = onTransact + 121;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                } else {
                    if ((getMessage()) != null) {
                        sb = new StringBuilder("/");
                        message = getMessage();
                    } else {
                        if ((getLog()) != null) {
                            sb = new StringBuilder("/");
                            message = getLog();
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(getException());
                            if (sb3.toString() == null) {
                                return "";
                            }
                            sb = new StringBuilder("/");
                            message = getException().getMessage();
                        }
                    }
                }
                sb.append(message);
                int i4 = onWarmupCompleted + 119;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                sb2 = sb;
            }
            return sb2.toString();
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            if (cArr2 != null) {
                int i3 = $11 + 1;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j) + 1), 77 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        j = 0;
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 75, 16036 - TextUtils.indexOf((CharSequence) "", '0'), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onExtraCallbackWithResult) {
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), KeyEvent.normalizeMetaState(0) + 63, KeyEvent.keyCodeFromString("") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $10 + 121;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << 1) * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] / iIntValue);
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 121;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] + iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 63 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12215 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 63, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr6);
        }

        static void onWarmupCompleted() {
            IAuthTabCallback = new char[]{32708, 32762, 32724, 32714};
            onExtraCallback = -1184333929;
            onNavigationEvent = true;
            onExtraCallbackWithResult = true;
        }
    }
}
