package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.IdGeneratorExternalSyntheticLambda1;
import o.JSBundleLoaderCompanioncreateAssetLoader1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JSBundleLoaderCompanioncreateAssetLoader1 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy IAuthTabCallback;
    private static boolean IAuthTabCallbackDefault = false;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static boolean asBinder;
    private static int asInterface;
    private static int onExtraCallback;
    public static final JSBundleLoaderCompanioncreateAssetLoader1 onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    public static final int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact();
        int i4 = onTransact + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        Object obj;
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = ~i6;
        int i10 = ~i2;
        int i11 = i8 | (~(i9 | i10 | i));
        int i12 = (~(i2 | i9 | i)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i6 + i + i5 + (563899752 * i4) + (667302295 * i3);
        int i15 = i14 * i14;
        int i16 = ((i6 * 1426164010) - 416808960) + (1426164010 * i) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i5) + ((-1270874112) * i4) + (1914175488 * i3) + ((-1995833344) * i15);
        int i17 = (i6 * (-901935710)) + 144807674 + (i * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i5 * (-901935539)) + (i4 * 42244168) + (i3 * (-913566613)) + (i15 * (-1006501888));
        if (i16 + (i17 * i17 * (-1006239744)) == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        int i18 = 2 % 2;
        int i19 = IAuthTabCallbackStub + 83;
        onTransact = i19 % 128;
        int i20 = i19 % 2;
        if (!zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            return zzaj.IAuthTabCallback().onWarmupCompleted();
        }
        int i21 = onTransact + 19;
        IAuthTabCallbackStub = i21 % 128;
        byte[] bArr = {-118, -119, -120, -121, -122, -123, -124, -125, -126, -127};
        if (i21 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            a(null, null, bArr, 72 / View.MeasureSpec.getMode(1), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            a(null, null, bArr, 127 - View.MeasureSpec.getMode(0), objArr3);
            obj = objArr3[0];
        }
        return ((String) obj).intern();
    }

    public static /* synthetic */ IdGeneratorExternalSyntheticLambda1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return access000();
        }
        access000();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[0], -1547706250, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1547706251);
        int i4 = onTransact + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private JSBundleLoaderCompanioncreateAssetLoader1() {
    }

    static {
        asBinder();
        onExtraCallbackWithResult = new JSBundleLoaderCompanioncreateAssetLoader1();
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerTimezoneManager$$ExternalSyntheticLambda2
            public final Object invoke() {
                return JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult();
            }
        });
        onWarmupCompleted = 8;
        int i = IAuthTabCallbackStubProxy + 39;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = IAuthTabCallback.getValue();
        if (i3 == 0) {
            return (IdGeneratorExternalSyntheticLambda1) value;
        }
        int i4 = 5 / 0;
        return (IdGeneratorExternalSyntheticLambda1) value;
    }

    private static final IdGeneratorExternalSyntheticLambda1 access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1.onExtraCallback onextracallback = IdGeneratorExternalSyntheticLambda1.Companion;
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnNavigationEvent = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ss", locale);
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        idGeneratorExternalSyntheticLambda1OnNavigationEvent.setTimeZone(timeZone);
        int i4 = IAuthTabCallbackStub + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return idGeneratorExternalSyntheticLambda1OnNavigationEvent;
    }

    public final Calendar IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer();
            throw null;
        }
        if (!zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
            return zzaj.IAuthTabCallback().onExtraCallbackWithResult();
        }
        Calendar calendarOnNavigationEvent = onNavigationEvent();
        int i3 = onTransact + 19;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return calendarOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public final Calendar onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone(((String) objArr[0]).intern()));
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        int i4 = onTransact + 15;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return calendar;
    }

    public final Calendar IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        int i4 = IAuthTabCallbackStub + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return calendar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(JSBundleLoaderCompanioncreateAssetLoader1 jSBundleLoaderCompanioncreateAssetLoader1, Function0 function0, Function0 function02, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 33;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            function0 = new Function0() { // from class: viva.republica.toss.pedometer.PedometerTimezoneManager$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return JSBundleLoaderCompanioncreateAssetLoader1.IAuthTabCallback();
                }
            };
            int i4 = onTransact + 63;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i & 2) != 0) {
            function02 = new Function0() { // from class: viva.republica.toss.pedometer.PedometerTimezoneManager$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return JSBundleLoaderCompanioncreateAssetLoader1.onWarmupCompleted();
                }
            };
        }
        jSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult(function0, function02);
    }

    private static final Unit onTransact() {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 46 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStub + 45;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $isTimezoneChanged;
        final /* synthetic */ Function0<Unit> $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Function0<Unit> function0, Function0<Unit> function02, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$isTimezoneChanged = function0;
            this.$onComplete = function02;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$isTimezoneChanged, this.$onComplete, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                zzai zzaiVarIAuthTabCallback = zzaj.IAuthTabCallback();
                this.label = 1;
                obj = zzaiVarIAuthTabCallback.onWarmupCompleted(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (((UserChoiceDetailsProduct) obj).onNavigationEvent()) {
                this.$isTimezoneChanged.invoke();
            }
            this.$onComplete.invoke();
            return Unit.INSTANCE;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(function0, function02, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        float f = 0.0f;
        if (cArr3 != null) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 76, TextUtils.getOffsetAfter("", 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.getDeadChar(0, 0) + 75, 16036 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i8 = 1052772399;
        if (!(!asBinder)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 71;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 63, Process.getGidForName("") + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i8 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!IAuthTabCallbackDefault) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i11 = $10 + 45;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $10 + 117;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] >>> iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 63, Color.argb(0, 0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final Unit getInterfaceDescriptor() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(new Object[0], -1547706250, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1547706251);
    }

    public final String onExtraCallback() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (String) onExtraCallbackWithResult(new Object[]{this}, -1423194653, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1423194653);
    }

    static void asBinder() {
        onNavigationEvent = new char[]{32419, 32497, 32507, 32451, 32445, 32465, 32455, 32509, 32503, 32504};
        onExtraCallback = -1184333972;
        IAuthTabCallbackDefault = true;
        asBinder = true;
    }
}
