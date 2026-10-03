package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.accessMapSafely;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.password.TossPinBiometricAuth$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accessMapSafely {
    private static final String IAuthTabCallback;
    private static char IAuthTabCallbackDefault;
    private static char asBinder;
    private static char asInterface;
    private static int getInterfaceDescriptor;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    public static final accessMapSafely onNavigationEvent;
    private static char onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {57, 126, 65, 8};
    private static final int $$b = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return accessMapSafely.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{accessMapSafely.this, null, null, false, 0L, this}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1556985347, -1556985345);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, int r8) {
        /*
            int r7 = 110 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = o.accessMapSafely.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessMapSafely.$$c(short, short, int):java.lang.String");
    }

    static {
        getInterfaceDescriptor = 1;
        onExtraCallback();
        Object[] objArr = new Object[1];
        a((char) (TextUtils.getOffsetAfter("", 0) + 2026), 769412924 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{43775, 58915, 35896, 51228, 59882, 28009, 7799, 59094, 27969, 17270, 21994, 22061, 5824, 61723, 18690, 64838, 43643}, new char[]{0, 0, 0, 0}, new char[]{15703, 56399, 59949, 45575}, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        onNavigationEvent = new accessMapSafely();
        int i = IAuthTabCallbackStubProxy + 5;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(drawIconBackgroundColor drawiconbackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(drawiconbackgroundcolor);
        int i4 = IAuthTabCallbackStub + 71;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        int i4 = IAuthTabCallbackStub + 87;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RectangleShape rectangleShape = (RectangleShape) objArr[0];
        Context context = (Context) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[3];
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rectangleShape, context, function1, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, dialogInterface);
        int i4 = IAuthTabCallbackStub + 19;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i4)) | i8;
        int i10 = ~i6;
        int i11 = ~i4;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i4 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i5 + i6 + i2 + ((-327997910) * i3) + ((-604038433) * i);
        int i18 = i17 * i17;
        int i19 = ((i5 * 234895570) - 128974848) + (234895570 * i6) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i2) + (36700160 * i3) + ((-297271296) * i) + (1302134784 * i18);
        int i20 = (i5 * (-238133666)) + 182491156 + (i6 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i2 * (-238134313)) + (i3 * (-1022231738)) + (i * 4118089) + (i18 * (-35979264));
        int i21 = i19 + (i20 * i20 * 1404239872);
        if (i21 != 1) {
            return i21 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }
        final Context context = (Context) objArr[1];
        final RectangleShape rectangleShape = (RectangleShape) objArr[2];
        final Function1 function1 = (Function1) objArr[3];
        int i22 = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.password.TossPinBiometricAuth$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                Object[] objArr2 = {rectangleShape, context, function1, (CommonModule_setLeftEdgeTouchEnabled) obj};
                int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                return (Unit) accessMapSafely.onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, 1964701638, -1964701638);
            }
        });
        int i23 = access100 + 123;
        IAuthTabCallbackStub = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    private accessMapSafely() {
    }

    public final boolean onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageServiceDefault = addPolicy.IPostMessageServiceDefault();
        Object[] objArr = new Object[1];
        a((char) (2026 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 769412924 + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{43775, 58915, 35896, 51228, 59882, 28009, 7799, 59094, 27969, 17270, 21994, 22061, 5824, 61723, 18690, 64838, 43643}, new char[]{0, 0, 0, 0}, new char[]{15703, 56399, 59949, 45575}, objArr);
        if (textRoundCornerProgressBarSavedState1IPostMessageServiceDefault.onExtraCallbackWithResult(((String) objArr[0]).intern(), "").length() > 0) {
            int i2 = IAuthTabCallbackStub + 7;
            access100 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = IAuthTabCallbackStub + 45;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 31 / 0;
        }
        return false;
    }

    public final boolean IAuthTabCallback(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (IAuthTabCallback()) {
            if (enableFabricRenderer.onExtraCallback.onExtraCallbackWithResult(context).onExtraCallback()) {
                return true;
            }
            int i2 = IAuthTabCallbackStub + 5;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            return false;
        }
        int i4 = access100 + 103;
        int i5 = i4 % 128;
        IAuthTabCallbackStub = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 75;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final boolean IAuthTabCallback() throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub;
        Object obj;
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a((char) (56418 % TextUtils.getOffsetBefore("", 1)), 2121223486 >> (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{48168, 62251, 48272, 49510, 9828, 42025, 16315, 928, 4933, 875, 13256, 14435, 26133, 24269, 47564, 11708, 59520, 59541, 12468}, new char[]{0, 0, 0, 0}, new char[]{16242, 28493, 25214, 24540}, objArr);
            obj = objArr[0];
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr2 = new Object[1];
            a((char) (56418 - TextUtils.getOffsetBefore("", 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2121223486, new char[]{48168, 62251, 48272, 49510, 9828, 42025, 16315, 928, 4933, 875, 13256, 14435, 26133, 24269, 47564, 11708, 59520, 59541, 12468}, new char[]{0, 0, 0, 0}, new char[]{16242, 28493, 25214, 24540}, objArr2);
            obj = objArr2[0];
        }
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) obj).intern(), false);
        int i3 = access100 + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final void onNavigationEvent(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr = new Object[1];
        a((char) (56417 - TextUtils.lastIndexOf("", '0', 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2121223486, new char[]{48168, 62251, 48272, 49510, 9828, 42025, 16315, 928, 4933, 875, 13256, 14435, 26133, 24269, 47564, 11708, 59520, 59541, 12468}, new char[]{0, 0, 0, 0}, new char[]{16242, 28493, 25214, 24540}, objArr);
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), z, true);
        int i4 = IAuthTabCallbackStub + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final getByteBuffer<drawIconBackgroundColor<IconRoundCornerProgressBar>> IAuthTabCallback(@NotNull Context context, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        enableFabricRenderer enablefabricrenderer = enableFabricRenderer.onExtraCallback;
        Object[] objArr = new Object[1];
        a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2025), View.MeasureSpec.makeMeasureSpec(0, 0) + 769412925, new char[]{43775, 58915, 35896, 51228, 59882, 28009, 7799, 59094, 27969, 17270, 21994, 22061, 5824, 61723, 18690, 64838, 43643}, new char[]{0, 0, 0, 0}, new char[]{15703, 56399, 59949, 45575}, objArr);
        getByteBuffer getbytebufferOnWarmupCompleted = enablefabricrenderer.onWarmupCompleted(context, ((String) objArr[0]).intern(), str);
        Object obj = null;
        getByteBuffer getbytebufferOnExtraCallback = getbytebufferOnWarmupCompleted.onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        getByteBuffer<drawIconBackgroundColor<IconRoundCornerProgressBar>> getbytebufferOnExtraCallback2 = getbytebufferOnExtraCallback.onExtraCallback(new TossPinBiometricAuth$.ExternalSyntheticLambda3(new TossPinBiometricAuth$.ExternalSyntheticLambda2()));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback2, "");
        int i2 = access100 + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return getbytebufferOnExtraCallback2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(drawIconBackgroundColor drawiconbackgroundcolor) throws Throwable {
        int i = 2 % 2;
        if (drawiconbackgroundcolor.onWarmupCompleted()) {
            int i2 = IAuthTabCallbackStub + 49;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1049608869);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (Process.myTid() >> 22), 24887 - (ViewConfiguration.getFadingEdgeLength() >> 16), -265239605, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1519653344);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, 24888 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1809117008, false, "onExtraCallback", new Class[0]);
                }
                ((Method) objOnExtraCallback2).invoke(obj, null);
                onNavigationEvent.onNavigationEvent(true);
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageServiceDefault = addPolicy.IPostMessageServiceDefault();
                Object objIAuthTabCallback = drawiconbackgroundcolor.IAuthTabCallback();
                Intrinsics.checkNotNull(objIAuthTabCallback);
                Object[] objArr = new Object[1];
                a((char) (Color.red(0) + 2026), TextUtils.getOffsetBefore("", 0) + 769412925, new char[]{43775, 58915, 35896, 51228, 59882, 28009, 7799, 59094, 27969, 17270, 21994, 22061, 5824, 61723, 18690, 64838, 43643}, new char[]{0, 0, 0, 0}, new char[]{15703, 56399, 59949, 45575}, objArr);
                textRoundCornerProgressBarSavedState1IPostMessageServiceDefault.onNavigationEvent(((String) objArr[0]).intern(), ((IconRoundCornerProgressBar) objIAuthTabCallback).onExtraCallback());
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 43;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return unit;
    }

    public final void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(false);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageServiceDefault = addPolicy.IPostMessageServiceDefault();
        Object[] objArr = new Object[1];
        a((char) (ExpandableListView.getPackedPositionGroup(0L) + 2026), 769412925 + (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{43775, 58915, 35896, 51228, 59882, 28009, 7799, 59094, 27969, 17270, 21994, 22061, 5824, 61723, 18690, 64838, 43643}, new char[]{0, 0, 0, 0}, new char[]{15703, 56399, 59949, 45575}, objArr);
        textRoundCornerProgressBarSavedState1IPostMessageServiceDefault.onTransact(((String) objArr[0]).intern());
        enableFabricRenderer.onExtraCallback.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 23;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(gidForName, doubleTapTimeout, tapTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 10 - ExpandableListView.getPackedPositionType(0L), 12434 - View.combineMeasuredStates(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - Color.blue(0)), 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 19902 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $11 + 11;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i14 = $10 + 43;
        $11 = i14 % 128;
        if (i14 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessMapSafely.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    static /* synthetic */ void onExtraCallbackWithResult(accessMapSafely accessmapsafely, Context context, RectangleShape rectangleShape, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 59;
        access100 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 2) != 0) {
            int i5 = i3 + 41;
            access100 = i5 % 128;
            function1 = null;
            if (i5 % 2 == 0) {
                function1.hashCode();
                throw null;
            }
        }
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{accessmapsafely, context, rectangleShape, function1}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback, 1894649722, -1894649721);
        int i6 = IAuthTabCallbackStub + 105;
        access100 = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 49;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char size = (char) View.MeasureSpec.getSize(i4);
                    int iIndexOf = 42 - TextUtils.indexOf((CharSequence) "", '0', i4);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1452;
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, iIndexOf, iLastIndexOf, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTapTimeout() >> 16)), 44 - (ViewConfiguration.getTapTimeout() >> 16), 1494 - View.resolveSize(i4, i4), 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 23972), TextUtils.getCapsMode("", 0, 0) + 50, 22939 - (KeyEvent.getMaxKeyCode() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 45848), 29 - TextUtils.indexOf("", ""), Color.rgb(0, 0, 0) + 16789793, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
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
        String str = new String(cArr6);
        int i7 = $10 + 25;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final Unit onExtraCallback(Context context, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        b(new char[]{54491, 24891, 4484, 16083, 6762, 15782, 24576, 29797, 64670, 5165, 62180, 201, 23096, 40969, 23464, 53287, 50928, 54022, 61975, 52377, 17810, 16429, 5388, 40571, 10589, 32555, 15553, 50359, 18846, 33799, 58799, 42169, 30670, 37038}, View.MeasureSpec.getSize(0) + 34, objArr);
        context.startActivity(new Intent(((String) objArr[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(RectangleShape rectangleShape, final Context context, Function1 function1, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        Pair pairIAuthTabCallback = rectangleShape.IAuthTabCallback(context);
        String str = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
        String str2 = (String) pairIAuthTabCallback.IAuthTabCallback();
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        String string = context.getString(R.string.security_setting_os_setting);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.password.TossPinBiometricAuth$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return accessMapSafely.onExtraCallbackWithResult(context, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(function1);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    public final getByteBuffer<drawIconBackgroundColor<BuildConfig>> onExtraCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @Nullable String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageServiceDefault = addPolicy.IPostMessageServiceDefault();
        Object[] objArr = new Object[1];
        a((char) (2025 - TextUtils.lastIndexOf("", '0', 0, 0)), 769412925 + (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{43775, 58915, 35896, 51228, 59882, 28009, 7799, 59094, 27969, 17270, 21994, 22061, 5824, 61723, 18690, 64838, 43643}, new char[]{0, 0, 0, 0}, new char[]{15703, 56399, 59949, 45575}, objArr);
        String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1IPostMessageServiceDefault.onExtraCallbackWithResult(((String) objArr[0]).intern(), "");
        enableFabricRenderer enablefabricrenderer = enableFabricRenderer.onExtraCallback;
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 2026), 769412926 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{43775, 58915, 35896, 51228, 59882, 28009, 7799, 59094, 27969, 17270, 21994, 22061, 5824, 61723, 18690, 64838, 43643}, new char[]{0, 0, 0, 0}, new char[]{15703, 56399, 59949, 45575}, objArr2);
        getByteBuffer<drawIconBackgroundColor<BuildConfig>> getbytebufferOnExtraCallback = enablefabricrenderer.onExtraCallbackWithResult(rememberLottieCompositionKtlottieComposition1, ((String) objArr2[0]).intern(), strOnExtraCallbackWithResult, str).onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        int i4 = IAuthTabCallbackStub + 39;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return getbytebufferOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(RectangleShape rectangleShape, Context context, Function1 function1, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{rectangleShape, context, function1, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback, 1964701638, -1964701638);
    }

    private final void onExtraCallback(Context context, RectangleShape rectangleShape, Function1<? super DialogInterface, Unit> function1) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, context, rectangleShape, function1}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback, 1894649722, -1894649721);
    }

    public final Object onExtraCallbackWithResult(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @NotNull Context context, boolean z, long j, @NotNull access13800<? super Boolean> access13800Var) {
        Object[] objArr = {this, rememberLottieCompositionKtlottieComposition1, context, Boolean.valueOf(z), Long.valueOf(j), access13800Var};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return onWarmupCompleted(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, 1556985347, -1556985345);
    }

    static void onExtraCallback() {
        onWarmupCompleted = 7798559133331975163L;
        onExtraCallbackWithResult = -1776194565;
        onExtraCallback = (char) 45761;
        asInterface = (char) 8546;
        asBinder = (char) 42202;
        onTransact = (char) 7728;
        IAuthTabCallbackDefault = (char) 32166;
    }
}
