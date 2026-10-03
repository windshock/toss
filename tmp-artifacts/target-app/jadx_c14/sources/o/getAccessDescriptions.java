package o;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.base.BaseActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.ImageFormatCheckerExternalSyntheticLambda0;
import o.SetDetectableSize;
import o.getAccessDescriptions;
import o.ycxExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.OpenBankingTransitionBottomSheet;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAccessDescriptions {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy;
    private static long asInterface;
    public static final int onNavigationEvent;
    private static char[] onTransact;
    private Boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private final BaseActivity onExtraCallbackWithResult;
    private Boolean onWarmupCompleted;
    private static final byte[] $$a = {46, -35, 45, 111};
    private static final int $$b = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, byte r8, int r9) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 4
            int r7 = 97 - r7
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = o.getAccessDescriptions.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAccessDescriptions.$$c(short, byte, int):java.lang.String");
    }

    static {
        IAuthTabCallbackStubProxy = 1;
        onExtraCallback();
        Companion = new onExtraCallbackWithResult(null);
        onNavigationEvent = 8;
        int i = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, getAccessDescriptions getaccessdescriptions, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, getaccessdescriptions, th);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = asBinder + 57;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i2));
        int i10 = ~(i4 | i2);
        int i11 = ~i2;
        int i12 = (~(i | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i4 + i2 + i3 + ((-1570926368) * i6) + ((-1409401439) * i5);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i4) - 657981440) + (821186744 * i2) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i3) + (1124073472 * i6) + ((-332922880) * i5) + ((-1182662656) * i15);
        int i17 = (i4 * 1410161459) + 847508490 + (i2 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i3 * 1410159841) + (i6 * 1126552800) + (i5 * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getAccessDescriptions getaccessdescriptions = (getAccessDescriptions) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        ImageFormatCheckerExternalSyntheticLambda0 imageFormatCheckerExternalSyntheticLambda0 = (ImageFormatCheckerExternalSyntheticLambda0) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getaccessdescriptions, function1, imageFormatCheckerExternalSyntheticLambda0);
        int i4 = IAuthTabCallbackStub + 21;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = IAuthTabCallbackStub + 55;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, Ref.BooleanRef booleanRef) {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, booleanRef);
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        int i5 = IAuthTabCallbackStub + 37;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = asBinder + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getAccessDescriptions getaccessdescriptions = (getAccessDescriptions) objArr[0];
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = (ycxExternalSyntheticLambda1) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(getaccessdescriptions, ycxexternalsyntheticlambda1);
        }
        onNavigationEvent(getaccessdescriptions, ycxexternalsyntheticlambda1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getAccessDescriptions getaccessdescriptions, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getaccessdescriptions, setDetectableSize);
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        int i5 = asBinder + 51;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Ref.BooleanRef booleanRef, Function1 function1, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(booleanRef, function1, dialogInterface);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 123;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(getAccessDescriptions getaccessdescriptions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getaccessdescriptions);
        int i4 = asBinder + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 26846;
        private static int IAuthTabCallbackStub = 1;
        private static char onExtraCallback = 18607;
        private static int onExtraCallbackWithResult = 0;
        private static char onNavigationEvent = 5738;
        private static char onWarmupCompleted = 63191;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final String onExtraCallbackWithResult(@NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{40341, 30943, 9289, 56451, 34598, 5604, 49468, 47654, 53106, 64071, 42923, 23931, 24201, 26629, 18633, 48060, 38576, 3925, 60513, 52318, 53312, 43970, 14714, 46061, 36962, 6007, 30734, 49213, 13705, 60137, 33219, 18691, 64989, 6492, 64196, 19376, 65221, 1208, 3586, 43632, 13705, 60137, 33219, 18691, 64989, 6492, 64196, 19376, 65221, 1208, 3586, 43632, 5124, 57735, 36962, 6007, 30734, 49213, 11503, 7350, 64196, 19376, 16391, 2981}, ExpandableListView.getPackedPositionChild(0L) + 65, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            sb.append(".pdf");
            String string = sb.toString();
            int i2 = IAuthTabCallbackStub + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 121;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 43;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallback);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i3, i3);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                            int scrollBarSize = 12434 - (ViewConfiguration.getScrollBarSize() >> 8);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, tapTimeout, scrollBarSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), Gravity.getAbsoluteGravity(0, 0) + 10, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 16014), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    public getAccessDescriptions(@NotNull BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        this.onExtraCallbackWithResult = baseActivity;
    }

    private static final Unit onNavigationEvent(getAccessDescriptions getaccessdescriptions, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        BaseActivity.IAuthTabCallback(getaccessdescriptions.onExtraCallbackWithResult, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 111;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 51;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallback(getAccessDescriptions getaccessdescriptions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getaccessdescriptions.onExtraCallbackWithResult.bo_();
        int i4 = asBinder + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 33;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        final getAccessDescriptions getaccessdescriptions = (getAccessDescriptions) objArr[0];
        final Function1<? super IAuthTabCallback, Unit> function1 = (Function1) objArr[1];
        final Function1 function12 = (Function1) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        setTestMode settestmode = setTestMode.onExtraCallback;
        getaccessdescriptions.onWarmupCompleted = settestmode.IAuthTabCallbackStubProxy();
        getaccessdescriptions.IAuthTabCallback = settestmode.IAuthTabCallback_Parcel();
        Object obj = null;
        if (getaccessdescriptions.onWarmupCompleted != null) {
            int i4 = IAuthTabCallbackStub + 69;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                getaccessdescriptions.onWarmupCompleted(function1);
                return null;
            }
            getaccessdescriptions.onWarmupCompleted(function1);
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 29426), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, 24734 - Color.green(0), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(80736769);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 29426), Color.blue(0) + 22, 24734 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 898567313, false, "IAuthTabCallback_Parcel", new Class[0]);
            }
            JsonReaderUnknownNumberParsing<initHybridDefaultConfig> jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = ((onFullscreenBackground) ((Method) objOnExtraCallback2).invoke(obj2, null)).onExtraCallbackWithResult();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda3
                public final Object invoke(Object obj3) {
                    Object[] objArr2 = {this.f$0, (ycxExternalSyntheticLambda1) obj3};
                    return (Unit) getAccessDescriptions.onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), -2118888585, OverseasRrnInputTextField.IAuthTabCallback(), 2118888587, OverseasRrnInputTextField.IAuthTabCallback(), objArr2, OverseasRrnInputTextField.IAuthTabCallback());
                }
            };
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda4
                public final void accept(Object obj3) {
                    getAccessDescriptions.onExtraCallbackWithResult(function13, obj3);
                }
            }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda5
                public final void run() {
                    getAccessDescriptions.onWarmupCompleted(this.f$0);
                }
            });
            final Function1 function14 = new Function1() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda6
                public final Object invoke(Object obj3) {
                    Object[] objArr2 = {this.f$0, function1, (ImageFormatCheckerExternalSyntheticLambda0) obj3};
                    return (Unit) getAccessDescriptions.onExtraCallback(OverseasRrnInputTextField.IAuthTabCallback(), -1782490109, OverseasRrnInputTextField.IAuthTabCallback(), 1782490109, OverseasRrnInputTextField.IAuthTabCallback(), objArr2, OverseasRrnInputTextField.IAuthTabCallback());
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda7
                public final void accept(Object obj3) {
                    getAccessDescriptions.onWarmupCompleted(function14, obj3);
                }
            };
            final Function1 function15 = new Function1() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda8
                public final Object invoke(Object obj3) {
                    return getAccessDescriptions.IAuthTabCallback(function12, getaccessdescriptions, (Throwable) obj3);
                }
            };
            jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda9
                public final void accept(Object obj3) {
                    getAccessDescriptions.onExtraCallback(function15, obj3);
                }
            });
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Unit onExtraCallbackWithResult(getAccessDescriptions getaccessdescriptions, Function1 function1, ImageFormatCheckerExternalSyntheticLambda0 imageFormatCheckerExternalSyntheticLambda0) {
        Boolean boolValueOf;
        int i = 2 % 2;
        if (imageFormatCheckerExternalSyntheticLambda0.onExtraCallbackWithResult() != null) {
            convertToCase converttocaseOnExtraCallbackWithResult = imageFormatCheckerExternalSyntheticLambda0.onExtraCallbackWithResult();
            Boolean bool = null;
            getaccessdescriptions.onWarmupCompleted = converttocaseOnExtraCallbackWithResult != null ? Boolean.valueOf(converttocaseOnExtraCallbackWithResult.onExtraCallbackWithResult()) : null;
            convertToCase converttocaseOnExtraCallbackWithResult2 = imageFormatCheckerExternalSyntheticLambda0.onExtraCallbackWithResult();
            if (converttocaseOnExtraCallbackWithResult2 != null) {
                int i2 = asBinder + 85;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 == 0) {
                    boolValueOf = Boolean.valueOf(converttocaseOnExtraCallbackWithResult2.onWarmupCompleted());
                    int i3 = 56 / 0;
                } else {
                    boolValueOf = Boolean.valueOf(converttocaseOnExtraCallbackWithResult2.onWarmupCompleted());
                }
                bool = boolValueOf;
            }
            getaccessdescriptions.IAuthTabCallback = bool;
            getaccessdescriptions.onWarmupCompleted((Function1<? super IAuthTabCallback, Unit>) function1);
            int i4 = IAuthTabCallbackStub + 117;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        Intrinsics.checkNotNull(imageFormatCheckerExternalSyntheticLambda0);
        setTestMode.onExtraCallback(imageFormatCheckerExternalSyntheticLambda0);
        return Unit.INSTANCE;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 81;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(kotlin.jvm.functions.Function1 r4, o.getAccessDescriptions r5, java.lang.Throwable r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getAccessDescriptions.IAuthTabCallbackStub
            int r1 = r1 + 53
            int r2 = r1 % 128
            o.getAccessDescriptions.asBinder = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "OpenBankingTransitionHelper::checkTarget"
            if (r1 == 0) goto L1c
            o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            r1.IAuthTabCallback(r3, r6)
            r1 = 14
            int r1 = r1 / r2
            if (r4 == 0) goto L29
            goto L23
        L1c:
            o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            r1.IAuthTabCallback(r3, r6)
            if (r4 == 0) goto L29
        L23:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r4.invoke(r6)
        L29:
            im.toss.base.BaseActivity r4 = r5.onExtraCallbackWithResult
            int r5 = viva.republica.toss.R.string.network_error
            r6 = 0
            o.onJsBridgeReady.IAuthTabCallback(r4, r5, r2, r0, r6)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r5 = o.getAccessDescriptions.IAuthTabCallbackStub
            int r5 = r5 + 71
            int r1 = r5 % 128
            o.getAccessDescriptions.asBinder = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L3f
            return r4
        L3f:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAccessDescriptions.onWarmupCompleted(kotlin.jvm.functions.Function1, o.getAccessDescriptions, java.lang.Throwable):kotlin.Unit");
    }

    private static final Unit onNavigationEvent(getAccessDescriptions getaccessdescriptions, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Boolean bool = getaccessdescriptions.onWarmupCompleted;
        Boolean bool2 = getaccessdescriptions.IAuthTabCallback;
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0), 6 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), "needTransitionAgreement: " + bool + ", agreementRequired: " + bool2);
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void onWarmupCompleted(Function1<? super IAuthTabCallback, Unit> function1) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("open_banking", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return getAccessDescriptions.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 30, (Object) null);
        if (!Intrinsics.areEqual(this.onWarmupCompleted, Boolean.TRUE)) {
            function1.invoke(new IAuthTabCallback(false, false, false, 6, null));
            return;
        }
        if (this.onExtraCallback) {
            int i2 = asBinder + 95;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(this.IAuthTabCallback, Boolean.FALSE)) {
                function1.invoke(new IAuthTabCallback(true, false, false, 6, null));
                return;
            }
        }
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, 545647222, iIAuthTabCallback2, -545647219, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, function1}, iIAuthTabCallback3);
        int i4 = asBinder + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Function1 function1, Ref.BooleanRef booleanRef) {
        int i = 2 % 2;
        function1.invoke(new IAuthTabCallback(true, true, true));
        booleanRef.element = true;
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(Ref.BooleanRef booleanRef, Function1 function1, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            if (booleanRef.element) {
                return;
            }
            function1.invoke(new IAuthTabCallback(true, true, false));
            int i3 = asBinder + 7;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        boolean z = booleanRef.element;
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 91;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onTransact[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 46134), 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 20268 - AndroidCharacter.getMirror('0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, KeyEvent.normalizeMetaState(0) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        int i7 = $10 + 71;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $10 + 91;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1494 - View.MeasureSpec.makeMeasureSpec(0, 0), -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getAccessDescriptions getaccessdescriptions = (getAccessDescriptions) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        getaccessdescriptions.onExtraCallback = true;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI openBankingTransitionBottomSheet = new OpenBankingTransitionBottomSheet(getaccessdescriptions.onExtraCallbackWithResult, new Function0() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda0
            public final Object invoke() {
                return getAccessDescriptions.onExtraCallbackWithResult(function1, booleanRef);
            }
        });
        openBankingTransitionBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.common.OpenBankingTransitionHelper$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                getAccessDescriptions.onWarmupCompleted(booleanRef, function1, dialogInterface);
            }
        });
        openBankingTransitionBottomSheet.show();
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public static final class IAuthTabCallback {
        private final boolean IAuthTabCallback;
        private final boolean onNavigationEvent;
        private final boolean onWarmupCompleted;

        public IAuthTabCallback() {
            this(false, false, false, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return this.onNavigationEvent == iAuthTabCallback.onNavigationEvent && this.onWarmupCompleted == iAuthTabCallback.onWarmupCompleted && this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.onNavigationEvent) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.IAuthTabCallback);
        }

        public String toString() {
            return "Result(isTarget=" + this.onNavigationEvent + ", isShownDialog=" + this.onWarmupCompleted + ", agreedDialog=" + this.IAuthTabCallback + ")";
        }

        public IAuthTabCallback(boolean z, boolean z2, boolean z3) {
            this.onNavigationEvent = z;
            this.onWarmupCompleted = z2;
            this.IAuthTabCallback = z3;
        }

        public /* synthetic */ IAuthTabCallback(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(getAccessDescriptions getaccessdescriptions, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, -2118888585, iIAuthTabCallback2, 2118888587, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{getaccessdescriptions, ycxexternalsyntheticlambda1}, iIAuthTabCallback3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getAccessDescriptions getaccessdescriptions, Function1 function1, ImageFormatCheckerExternalSyntheticLambda0 imageFormatCheckerExternalSyntheticLambda0) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, -1782490109, iIAuthTabCallback2, 1782490109, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{getaccessdescriptions, function1, imageFormatCheckerExternalSyntheticLambda0}, iIAuthTabCallback3);
    }

    private final void onExtraCallbackWithResult(Function1<? super IAuthTabCallback, Unit> function1) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, 545647222, iIAuthTabCallback2, -545647219, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, function1}, iIAuthTabCallback3);
    }

    public final void onWarmupCompleted(@NotNull Function1<? super IAuthTabCallback, Unit> function1, @Nullable Function1<? super Throwable, Unit> function12) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, -1137129507, iIAuthTabCallback2, 1137129508, OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{this, function1, function12}, iIAuthTabCallback3);
    }

    static void onExtraCallback() {
        onTransact = new char[]{60857, 11840, 27205, 42612, 57969, 15878, 31255};
        asInterface = -8773447265360138715L;
    }
}
