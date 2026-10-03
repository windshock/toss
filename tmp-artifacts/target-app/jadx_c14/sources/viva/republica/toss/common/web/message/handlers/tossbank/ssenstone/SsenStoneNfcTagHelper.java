package viva.republica.toss.common.web.message.handlers.tossbank.ssenstone;

import android.graphics.Color;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.UST_CERT_EncPrivateKeyInfo;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SsenStoneNfcTagHelper {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char asBinder;
    private static char asInterface;
    private static final String onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private final Tag onWarmupCompleted;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{46606, 24174, 32989, 27588, 14336, 62706, 51861, 25072, 58405, 30543, 19115, 22210, 16713, 47413, 60079, 26735, 2247, 9674}, Gravity.getAbsoluteGravity(0, 0) + 18, objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallback = 8;
        int i = onTransact + 21;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(IsoDep isoDep) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(isoDep);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return strOnNavigationEvent;
    }

    public static /* synthetic */ onNavigationEvent onNavigationEvent(String str, IsoDep isoDep) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(str, isoDep);
        int i4 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SsenStoneNfcTagHelper(@NotNull Tag tag) {
        Intrinsics.checkNotNullParameter(tag, "");
        this.onWarmupCompleted = tag;
    }

    public final Object onExtraCallback() {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Object obj = Result.constructor-impl((String) onExtraCallbackWithResult((Function1) new SsenStoneNfcTagHelper$.ExternalSyntheticLambda1()));
            int i2 = IAuthTabCallbackDefault + 111;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return obj;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static final String onNavigationEvent(IsoDep isoDep) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isoDep, "");
        UST_CERT_EncPrivateKeyInfo uST_CERT_EncPrivateKeyInfo = new UST_CERT_EncPrivateKeyInfo(isoDep);
        uST_CERT_EncPrivateKeyInfo.onExtraCallbackWithResult();
        String strIAuthTabCallback = uST_CERT_EncPrivateKeyInfo.IAuthTabCallback();
        int i2 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return strIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.Companion;
            Object obj = Result.constructor-impl((onNavigationEvent) onExtraCallbackWithResult((Function1) new SsenStoneNfcTagHelper$.ExternalSyntheticLambda0(str)));
            int i2 = IAuthTabCallbackDefault + 105;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return obj;
            }
            throw null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(th));
        }
    }

    private static final onNavigationEvent onExtraCallbackWithResult(String str, IsoDep isoDep) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isoDep, "");
        UST_CERT_EncPrivateKeyInfo uST_CERT_EncPrivateKeyInfo = new UST_CERT_EncPrivateKeyInfo(isoDep);
        uST_CERT_EncPrivateKeyInfo.onExtraCallbackWithResult();
        onNavigationEvent onnavigationeventIAuthTabCallback = uST_CERT_EncPrivateKeyInfo.IAuthTabCallback(str);
        int i2 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationeventIAuthTabCallback;
    }

    private final <R> R onExtraCallbackWithResult(Function1<? super IsoDep, ? extends R> function1) throws Throwable {
        int i = 2 % 2;
        IsoDep isoDep = IsoDep.get(this.onWarmupCompleted);
        if (isoDep == null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{46606, 24174, 32989, 27588, 14336, 62706, 51861, 25072, 58405, 30543, 19115, 22210, 16713, 47413, 60079, 26735, 2247, 9674}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{49545, 26657, 15722, 53385, 420, 49090, 52344, 20505, 13466, 34285, 36461, 48853, 60647, 29174}, 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr2[0]).intern(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            Object[] objArr3 = new Object[1];
            a(new char[]{49545, 26657, 15722, 53385, 420, 49090, 52344, 20505, 13466, 34285, 36461, 48853, 60647, 29174}, 14 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            throw new IllegalStateException(((String) objArr3[0]).intern());
        }
        if (!isoDep.isConnected()) {
            int i2 = IAuthTabCallbackStub + 35;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            isoDep.connect();
            int i4 = IAuthTabCallbackDefault + 19;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
        R r = (R) function1.invoke(isoDep);
        try {
            Result.Companion companion = Result.Companion;
            isoDep.close();
            Result.constructor-impl(Unit.INSTANCE);
            return r;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
            return r;
        }
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static long onNavigationEvent = -4036776099719296689L;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 79;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-16777132) - Color.rgb(0, 0, 0), 21233 - (ViewConfiguration.getFadingEdgeLength() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, KeyEvent.keyCodeFromString("") + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                        int i6 = $10 + 37;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onWarmupCompleted(@org.jetbrains.annotations.NotNull com.google.gson.JsonObject r8) throws java.lang.Throwable {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.IAuthTabCallback
                int r1 = r1 + 15
                int r2 = r1 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
                r2 = 5
                java.lang.String r3 = ""
                r4 = 0
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L3a
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
                char[] r1 = new char[r2]
                r1 = {x009a: FILL_ARRAY_DATA , data: [-1224, 28216, -1165, -1617, -26614} // fill-array
                r2 = 1065353216(0x3f800000, float:1.0)
                float r2 = android.graphics.PointF.length(r2, r4)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                int r2 = r5 % r2
                java.lang.Object[] r3 = new java.lang.Object[r6]
                a(r1, r2, r3)
                r1 = r3[r5]
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r1.intern()
                boolean r1 = r8.has(r1)
                if (r1 == 0) goto L99
                goto L5d
            L3a:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
                char[] r1 = new char[r2]
                r1 = {x00a4: FILL_ARRAY_DATA , data: [-1224, 28216, -1165, -1617, -26614} // fill-array
                float r2 = android.graphics.PointF.length(r4, r4)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                int r2 = r2 + r6
                java.lang.Object[] r3 = new java.lang.Object[r6]
                a(r1, r2, r3)
                r1 = r3[r5]
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r1.intern()
                boolean r1 = r8.has(r1)
                if (r1 == r6) goto L5d
                goto L99
            L5d:
                int r1 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.IAuthTabCallback
                int r1 = r1 + 11
                int r2 = r1 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
                r1 = 6
                char[] r1 = new char[r1]
                r1 = {x00ae: FILL_ARRAY_DATA , data: [-30049, -11950, -30004, 25429, -22364, -8613} // fill-array
                int r2 = android.view.View.MeasureSpec.getSize(r5)
                int r2 = r2 + r6
                java.lang.Object[] r3 = new java.lang.Object[r6]
                a(r1, r2, r3)
                r1 = r3[r5]
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r1.intern()
                boolean r8 = r8.has(r1)
                if (r8 == 0) goto L99
                int r8 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.IAuthTabCallback
                int r1 = r8 + 9
                int r2 = r1 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.onExtraCallback = r2
                int r1 = r1 % r0
                int r8 = r8 + 15
                int r1 = r8 % 128
                viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.onExtraCallback = r1
                int r8 = r8 % r0
                if (r8 != 0) goto L97
                return r6
            L97:
                r8 = 0
                throw r8
            L99:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.SsenStoneNfcTagHelper.onWarmupCompleted.onWarmupCompleted(com.google.gson.JsonObject):boolean");
        }

        public final boolean onWarmupCompleted(@NotNull String str) {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Result.Companion companion2 = Result.Companion;
                JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                Intrinsics.checkNotNull(asJsonObject);
                Result.constructor-impl(Boolean.valueOf(onWarmupCompleted(asJsonObject)));
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Result.Companion companion3 = Result.Companion;
            JsonObject asJsonObject2 = JsonParser.parseString(str).getAsJsonObject();
            Intrinsics.checkNotNull(asJsonObject2);
            obj = Result.constructor-impl(Boolean.valueOf(onWarmupCompleted(asJsonObject2)));
            Boolean bool = Boolean.FALSE;
            if (Result.onExtraCallback(obj)) {
                int i3 = IAuthTabCallback + 85;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                obj = bool;
            }
            return ((Boolean) obj).booleanValue();
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 47;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % i2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent - 1];
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i7 = i4;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[i2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, jumpTapTimeout, iKeyCodeFromString, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 10 - View.MeasureSpec.getSize(0), (ViewConfiguration.getTapTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16014), 13 - MotionEvent.axisFromString(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            cArr3 = cArr5;
            i2 = 2;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $11 + 31;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i11 = 16 / 0;
            objArr[0] = str;
        }
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = (char) 9549;
        onNavigationEvent = (char) 29021;
        asInterface = (char) 48933;
        asBinder = (char) 57925;
    }
}
