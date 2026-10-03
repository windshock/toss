package o;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.GuardedAsyncTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.pedometer.PedometerInfo;
import viva.republica.toss.pedometer.PedometerService;
import viva.republica.toss.splash.BaseSchemeActivity;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuardedAsyncTask {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final GuardedAsyncTask IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asBinder;
    private static int asInterface;
    private static final Lazy onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onTransact;
    public static final int onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = GuardedAsyncTask.onNavigationEvent(GuardedAsyncTask.this, (access13800) this);
            return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Result.IAuthTabCallback(objOnNavigationEvent);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = GuardedAsyncTask.this.onNavigationEvent((access13800<? super Result<Boolean>>) this);
            return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Result.IAuthTabCallback(objOnNavigationEvent);
        }
    }

    public static /* synthetic */ IdGeneratorExternalSyntheticLambda1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 interfaceDescriptor = getInterfaceDescriptor();
        int i4 = asBinder + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i2 | i)) | (~(i6 | i));
        int i10 = ~i6;
        int i11 = (~(i10 | i)) | i2;
        int i12 = (~(i | i2 | i6)) | (~(i8 | i10));
        int i13 = i2 + i6 + i4 + ((-373584967) * i5) + ((-1711780345) * i3);
        int i14 = i13 * i13;
        int i15 = (i2 * 1075882953) + 1902575616 + (1075882953 * i6) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i4) + ((-375259136) * i5) + ((-1109524480) * i3) + (585564160 * i14);
        int i16 = ((i2 * 235012993) - 778813113) + (i6 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i4 * 235013625) + (i5 * 915899377) + (i3 * (-1709701169)) + (i14 * 1974403072);
        switch (i15 + (i16 * i16 * (-848756736))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                GuardedAsyncTask guardedAsyncTask = (GuardedAsyncTask) objArr[0];
                Date date = (Date) objArr[1];
                int i17 = 2 % 2;
                int i18 = IAuthTabCallbackStub + 29;
                asBinder = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(date, "");
                String str = guardedAsyncTask.IAuthTabCallbackStubProxy().format(date);
                Intrinsics.checkNotNullExpressionValue(str, "");
                int i20 = IAuthTabCallbackStub + 13;
                asBinder = i20 % 128;
                int i21 = i20 % 2;
                return str;
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = asBinder + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(BaseActivity baseActivity, Function0 function0, Function1 function1, shouldBeKeptAsChild shouldbekeptaschild) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(baseActivity, function0, function1, shouldbekeptaschild);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(baseActivity, function0, function1, shouldbekeptaschild);
        int i3 = IAuthTabCallbackStub + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private GuardedAsyncTask() {
    }

    public static final /* synthetic */ Object onNavigationEvent(GuardedAsyncTask guardedAsyncTask, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = guardedAsyncTask.IAuthTabCallback((access13800<? super Result<Boolean>>) access13800Var);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        GuardedAsyncTask guardedAsyncTask = (GuardedAsyncTask) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        guardedAsyncTask.onExtraCallback(zBooleanValue);
        int i4 = asBinder + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return null;
    }

    static {
        access000();
        IAuthTabCallback = new GuardedAsyncTask();
        onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerConf$$ExternalSyntheticLambda0
            public final Object invoke() {
                return GuardedAsyncTask.IAuthTabCallback();
            }
        });
        Object obj = null;
        ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(onFirstFrameRendered.Companion.onWarmupCompleted().onExtraCallback(), new AnonymousClass2(null)), ComponentModelb.onExtraCallback);
        onWarmupCompleted = 8;
        int i = IAuthTabCallbackStubProxy + 101;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final IdGeneratorExternalSyntheticLambda1 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = (IdGeneratorExternalSyntheticLambda1) onExtraCallback.getValue();
        int i3 = asBinder + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return idGeneratorExternalSyntheticLambda1;
    }

    private static final IdGeneratorExternalSyntheticLambda1 getInterfaceDescriptor() {
        int i = 2 % 2;
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = new IdGeneratorExternalSyntheticLambda1("yyyyMMdd", locale);
        Object[] objArr = {JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        TimeZone timeZone = DesugarTimeZone.getTimeZone((String) JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult(objArr, -1423194653, iOnExtraCallback, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1423194653));
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        idGeneratorExternalSyntheticLambda1.setTimeZone(timeZone);
        int i2 = IAuthTabCallbackStub + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return idGeneratorExternalSyntheticLambda1;
        }
        throw null;
    }

    /* renamed from: o.GuardedAsyncTask$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, access13800<? super Unit>, Object> {
        int label;

        AnonymousClass2(access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, access13800<? super Unit> access13800Var) {
            return create(unit, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new AnonymousClass2(access13800Var);
        }

        public final Object invokeSuspend(Object obj) throws Exception {
            Object objOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                this.label = 1;
                Object objOnNavigationEvent2 = GuardedAsyncTask.onNavigationEvent(guardedAsyncTask, (access13800) this);
                if (objOnNavigationEvent2 == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                objOnNavigationEvent = objOnNavigationEvent2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            }
            if (Result.onExtraCallback(objOnNavigationEvent)) {
                objOnNavigationEvent = null;
            }
            Boolean bool = (Boolean) objOnNavigationEvent;
            if (bool == null || !bool.booleanValue()) {
                GuardedAsyncTask guardedAsyncTask2 = GuardedAsyncTask.IAuthTabCallback;
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
                GuardedAsyncTask.onExtraCallback(iOnWarmupCompleted, 440058142, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{guardedAsyncTask2, false}, -440058138);
                guardedAsyncTask2.onWarmupCompleted(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "onTermsDisagreed", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Sensor defaultSensor;
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SensorManager sensorManager = (SensorManager) ContextCompat.getSystemService(context, SensorManager.class);
        if (sensorManager != null) {
            defaultSensor = sensorManager.getDefaultSensor(19);
        } else {
            int i2 = IAuthTabCallbackStub + 41;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            defaultSensor = null;
        }
        if (defaultSensor != null) {
            int i4 = asBinder + 71;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallbackStub + 83;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = addPolicy.ITrustedWebActivityServiceDefault().onExtraCallback("isFirstTimeInPedometer", true);
        int i4 = IAuthTabCallbackStub + 103;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public final void IAuthTabCallback_Parcel() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault = addPolicy.ITrustedWebActivityServiceDefault();
            z = true;
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault = addPolicy.ITrustedWebActivityServiceDefault();
            z = false;
        }
        textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault.onNavigationEvent("isFirstTimeInPedometer", z);
    }

    public final boolean IAuthTabCallbackDefault() throws Throwable {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault;
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault = addPolicy.ITrustedWebActivityServiceDefault();
            Object[] objArr = new Object[1];
            a(new char[]{47911, 30641, 48396, 11400, 62936, 32182, 51601, 52490, 8557, 34680, 9687, 38902, 53816, 17989, 18633, 12699, 13407, 24620}, 69 >>> ExpandableListView.getPackedPositionGroup(1L), objArr);
            obj = objArr[0];
        } else {
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault = addPolicy.ITrustedWebActivityServiceDefault();
            Object[] objArr2 = new Object[1];
            a(new char[]{47911, 30641, 48396, 11400, 62936, 32182, 51601, 52490, 8557, 34680, 9687, 38902, 53816, 17989, 18633, 12699, 13407, 24620}, 18 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
            obj = objArr2[0];
        }
        return textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault.onExtraCallback(((String) obj).intern(), false);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 81;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent << 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i7 = (c2 + i6) ^ ((c2 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i8 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[1] = Integer.valueOf(i7);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i4) + 10;
                        int iArgb = Color.argb(i4, i4, i4, i4) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, iNormalizeMetaState, iArgb, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 10 - TextUtils.getTrimmedLength(""), View.getDefaultSize(0, 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    int i9 = $10 + 125;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19901 - TextUtils.getOffsetAfter("", 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final void onNavigationEvent(Context context, boolean z) throws Exception {
        int i = 2 % 2;
        if (z != IAuthTabCallbackDefault()) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault = addPolicy.ITrustedWebActivityServiceDefault();
            Object[] objArr = new Object[1];
            a(new char[]{47911, 30641, 48396, 11400, 62936, 32182, 51601, 52490, 8557, 34680, 9687, 38902, 53816, 17989, 18633, 12699, 13407, 24620}, 18 - View.MeasureSpec.getSize(0), objArr);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault.onNavigationEvent(((String) objArr[0]).intern(), z);
            createFileLoader.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            if (IAuthTabCallbackDefault(context)) {
                PedometerService.onExtraCallbackWithResult.onWarmupCompleted(PedometerService.Companion, context, "PedometerConf#setPedometerEnabled", null, false, 12, null);
            } else {
                PedometerService.Companion.IAuthTabCallback(context, "PedometerConf#setPedometerEnabled");
            }
            if (!z) {
                int i2 = asBinder + 29;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                JSApplicationCausedNativeException.onExtraCallbackWithResult.onExtraCallback(context);
            }
        }
        int i4 = asBinder + 35;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(GuardedAsyncTask guardedAsyncTask, Context context, Function0 function0, Function0 function02, int i, Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 91;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 25;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            function02 = null;
        }
        guardedAsyncTask.onNavigationEvent(context, function0, function02);
    }

    public final void onNavigationEvent(@NotNull Context context, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) throws Exception {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (!IAuthTabCallbackStub(context)) {
            if (function02 != null) {
                int i2 = IAuthTabCallbackStub + 57;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    function02.invoke();
                    return;
                } else {
                    function02.invoke();
                    throw null;
                }
            }
            return;
        }
        int i3 = asBinder + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(context, true);
            if (function0 == null) {
                return;
            }
        } else {
            onNavigationEvent(context, true);
            if (function0 == null) {
                return;
            }
        }
        function0.invoke();
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(BaseActivity baseActivity, Function0 function0, Function1 function1, shouldBeKeptAsChild shouldbekeptaschild) throws Exception {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            boolean z = shouldbekeptaschild.onNavigationEvent;
            throw null;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        if (!shouldbekeptaschild.onNavigationEvent) {
            str = "denied";
        } else {
            int i3 = asBinder + 23;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            str = "authorized";
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, "permission_info", "fitness access request result", access8100.onNavigationEvent(getWrite.IAuthTabCallback("fitness_access_request", str)), (String) null, false, (String) null, 56, (Object) null);
        if (!shouldbekeptaschild.onNavigationEvent) {
            IAuthTabCallback.onNavigationEvent((Context) baseActivity, false);
            PedometerService.Companion.IAuthTabCallback((Context) baseActivity, "PedometerConf: permission denied");
            if (function1 != null) {
                Intrinsics.checkNotNull(shouldbekeptaschild);
                function1.invoke(shouldbekeptaschild);
            }
            return Unit.INSTANCE;
        }
        IAuthTabCallback.onNavigationEvent((Context) baseActivity, true);
        if (function0 != null) {
            int i5 = asBinder + 75;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            function0.invoke();
            int i7 = IAuthTabCallbackStub + 69;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r8 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r7 = o.GuardedAsyncTask.asBinder + 15;
        o.GuardedAsyncTask.IAuthTabCallbackStub = r7 % 128;
        r7 = r7 % 2;
        r8.invoke();
        r7 = o.GuardedAsyncTask.asBinder + 55;
        o.GuardedAsyncTask.IAuthTabCallbackStub = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r0 = new com.tbruyelle.rxpermissions2.RxPermissions(r7);
        r4 = new java.lang.Object[1];
        a(new char[]{34927, 64027, 48452, 49943, 48559, 19123, 10375, 31662, 15387, 17010, 35424, 52561, 47911, 30641, 13908, 11504, 23770, 57478, 38095, 43029, 7725, 64318, 50438, 23040, 9089, 17361, 22502, 61548, 53008, 32503, 50692, 26946, 44635, 13986, 9089, 17361, 9906, 39543, 47924, 21563}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 39, r4);
        r8 = r0.onExtraCallbackWithResult(new java.lang.String[]{((java.lang.String) r4[0]).intern()}).IAuthTabCallback(new viva.republica.toss.pedometer.PedometerConf$.ExternalSyntheticLambda2(new viva.republica.toss.pedometer.PedometerConf$.ExternalSyntheticLambda1(r7, r8, r9)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
        o.IconRoundCornerProgressBarSavedState.IAuthTabCallback(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (IAuthTabCallbackStub((android.content.Context) r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((!IAuthTabCallbackStub((android.content.Context) r7)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        onNavigationEvent((android.content.Context) r7, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IAuthTabCallback(@org.jetbrains.annotations.NotNull im.toss.base.BaseActivity r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r8, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super o.shouldBeKeptAsChild, kotlin.Unit> r9) throws java.lang.Exception {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.GuardedAsyncTask.asBinder
            int r1 = r1 + 115
            int r2 = r1 % 128
            o.GuardedAsyncTask.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            r4 = 1
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            boolean r1 = r6.IAuthTabCallbackStub(r7)
            r5 = 82
            int r5 = r5 / r2
            if (r1 == 0) goto L44
            goto L29
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            boolean r1 = r6.IAuthTabCallbackStub(r7)
            r1 = r1 ^ r4
            if (r1 == r4) goto L44
        L29:
            r6.onNavigationEvent(r7, r4)
            if (r8 == 0) goto L43
            int r7 = o.GuardedAsyncTask.asBinder
            int r7 = r7 + 15
            int r9 = r7 % 128
            o.GuardedAsyncTask.IAuthTabCallbackStub = r9
            int r7 = r7 % r0
            r8.invoke()
            int r7 = o.GuardedAsyncTask.asBinder
            int r7 = r7 + 55
            int r8 = r7 % 128
            o.GuardedAsyncTask.IAuthTabCallbackStub = r8
            int r7 = r7 % r0
        L43:
            return
        L44:
            com.tbruyelle.rxpermissions2.RxPermissions r0 = new com.tbruyelle.rxpermissions2.RxPermissions
            r0.<init>(r7)
            r1 = 40
            char[] r1 = new char[r1]
            r1 = {x0082: FILL_ARRAY_DATA , data: [-30609, -1509, -17084, -15593, -16977, 19123, 10375, 31662, 15387, 17010, -30112, -12975, -17625, 30641, 13908, 11504, 23770, -8058, -27441, -22507, 7725, -1218, -15098, 23040, 9089, 17361, 22502, -3988, -12528, 32503, -14844, 26946, -20901, 13986, 9089, 17361, 9906, -25993, -17612, 21563} // fill-array
            int r5 = android.view.ViewConfiguration.getPressedStateDuration()
            int r5 = r5 >> 16
            int r5 = r5 + 39
            java.lang.Object[] r4 = new java.lang.Object[r4]
            a(r1, r5, r4)
            r1 = r4[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            o.getByteBuffer r0 = r0.onExtraCallbackWithResult(r1)
            viva.republica.toss.pedometer.PedometerConf$$ExternalSyntheticLambda2 r1 = new viva.republica.toss.pedometer.PedometerConf$$ExternalSyntheticLambda2
            viva.republica.toss.pedometer.PedometerConf$$ExternalSyntheticLambda1 r2 = new viva.republica.toss.pedometer.PedometerConf$$ExternalSyntheticLambda1
            r2.<init>(r7, r8, r9)
            r1.<init>(r2)
            o.deserializeUriNullableCollection r8 = r0.IAuthTabCallback(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            o.IconRoundCornerProgressBarSavedState.IAuthTabCallback(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GuardedAsyncTask.IAuthTabCallback(im.toss.base.BaseActivity, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    public final void onWarmupCompleted(@NotNull Context context) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        onNavigationEvent(context, false);
    }

    public final Boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = addPolicy.ITrustedWebActivityServiceDefault().onExtraCallback("lastSyncedEnablement");
        int i4 = IAuthTabCallbackStub + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return boolOnExtraCallback;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityServiceDefault().onNavigationEvent("lastSyncedEnablement", z);
            return;
        }
        addPolicy.ITrustedWebActivityServiceDefault().onNavigationEvent("lastSyncedEnablement", z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityServiceDefault().IAuthTabCallback("loggingSkipDate");
            obj.hashCode();
            throw null;
        }
        String strIAuthTabCallback = addPolicy.ITrustedWebActivityServiceDefault().IAuthTabCallback("loggingSkipDate");
        int i3 = IAuthTabCallbackStub + 75;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            addPolicy.ITrustedWebActivityServiceDefault().onNavigationEvent("loggingSkipDate", str);
            return null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        addPolicy.ITrustedWebActivityServiceDefault().onNavigationEvent("loggingSkipDate", str);
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            addPolicy.ITrustedWebActivityServiceDefault().onTransact("loggingSkipDate");
            return null;
        }
        addPolicy.ITrustedWebActivityServiceDefault().onTransact("loggingSkipDate");
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackStub(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        Object[] objArr = new Object[1];
        a(new char[]{34927, 64027, 48452, 49943, 48559, 19123, 10375, 31662, 15387, 17010, 35424, 52561, 47911, 30641, 13908, 11504, 23770, 57478, 38095, 43029, 7725, 64318, 50438, 23040, 9089, 17361, 22502, 61548, 53008, 32503, 50692, 26946, 44635, 13986, 9089, 17361, 9906, 39543, 47924, 21563}, 39 - TextUtils.getCapsMode("", 0, 0), objArr);
        if (ContextCompat.checkSelfPermission(context, ((String) objArr[0]).intern()) == 0) {
            return true;
        }
        int i4 = IAuthTabCallbackStub + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        GuardedAsyncTask guardedAsyncTask = (GuardedAsyncTask) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (guardedAsyncTask.onTransact(context)) {
            int i2 = asBinder + 119;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (guardedAsyncTask.IAuthTabCallbackStub(context)) {
                int i4 = asBinder + 73;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    guardedAsyncTask.IAuthTabCallbackDefault(context);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (guardedAsyncTask.IAuthTabCallbackDefault(context)) {
                    int i5 = IAuthTabCallbackStub + 21;
                    asBinder = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 68 / 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean onTransact(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 250500000) != 0) {
            return false;
        }
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Context context, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$context, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Exception {
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1[] geckoHubImp1Arr = {maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass2(this.$context, null), 3, (Object) null), maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(null), 3, (Object) null)};
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                if (ResourceCallback.onExtraCallback(geckoHubImp1Arr, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(this.$context)) {
                PedometerService.onExtraCallbackWithResult.onWarmupCompleted(PedometerService.Companion, this.$context, "PedometerConf#fetchEnabledFromServer", null, true, 4, null);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.GuardedAsyncTask$onNavigationEvent$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends PedometerInfo>>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static char[] onNavigationEvent = {27277, 27294, 27369, 27290, 27273, 27288, 27273, 27265, 27295, 27272, 27273, 27388, 27291, 27269, 27272, 27273, 27264, 27274};
            final /* synthetic */ Context $context;
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Context context, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.$context = context;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Result<PedometerInfo>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                AnonymousClass2 anonymousClass2Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass2Create.invokeSuspend(unit);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass2Create.invokeSuspend(unit);
                int i4 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, access13800Var);
                int i2 = onExtraCallbackWithResult + 85;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 31 / 0;
                }
                return anonymousClass2;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objIAuthTabCallback;
            }

            /* renamed from: o.GuardedAsyncTask$onNavigationEvent$2$IAuthTabCallback */
            public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super PedometerInfo>, Object> {
                int I$0;
                Object L$0;
                int label;

                public IAuthTabCallback(access13800 access13800Var) {
                    super(2, access13800Var);
                }

                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super PedometerInfo> access13800Var) {
                    return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new IAuthTabCallback(access13800Var);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
                public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        InterstitialAdInterstitialAdLoadConfigBuilder typedObject = AdSettingsIntegrationErrorMode.onNavigationEvent.readTypedObject();
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = InterstitialAdInterstitialAdLoadConfigBuilder.onNavigationEvent(typedObject, null, null, this, 3, null);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    }
                    BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        try {
                            Object objOnTransact = baseApiResponse.onTransact();
                            if (objOnTransact != null) {
                                return (PedometerInfo) objOnTransact;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.pedometer.PedometerInfo");
                        } catch (NullPointerException e) {
                            if (Intrinsics.areEqual(PedometerInfo.class, Object.class) || Intrinsics.areEqual(PedometerInfo.class, Unit.class)) {
                                return Unit.INSTANCE;
                            }
                            TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                            apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                            throw apiErrorOnExtraCallbackWithResult;
                        }
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    throw apiErrorExtraCallbackWithResult;
                }
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                try {
                    if (i2 != 0) {
                        int i3 = IAuthTabCallback + 49;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        Result.Companion companion = Result.Companion;
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(null);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    obj2 = Result.constructor-impl(obj);
                    int i4 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                }
                Context context = this.$context;
                if (Result.onNavigationEvent(obj2)) {
                    int i6 = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (((PedometerInfo) obj2).onExtraCallbackWithResult()) {
                        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
                        if (((Boolean) GuardedAsyncTask.onExtraCallback(iOnWarmupCompleted, -1941814049, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{guardedAsyncTask, context}, 1941814058)).booleanValue()) {
                            guardedAsyncTask.IAuthTabCallback_Parcel();
                            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault = addPolicy.ITrustedWebActivityServiceDefault();
                            Object[] objArr = new Object[1];
                            a(new int[]{0, 18, 98, 14}, true, null, objArr);
                            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault.onNavigationEvent(((String) objArr[0]).intern(), true);
                        }
                    }
                }
                return Result.IAuthTabCallback(obj2);
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                char[] cArr;
                int i2 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                char[] cArr2 = onNavigationEvent;
                if (cArr2 != null) {
                    int i7 = $11 + 67;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 35284), View.MeasureSpec.getMode(0) + 35, 14239 - TextUtils.indexOf("", "", 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                char[] cArr4 = new char[i4];
                System.arraycopy(cArr2, i3, cArr4, 0, i4);
                if (bArr != null) {
                    int i10 = $11 + 29;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr = new char[i4];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                    } else {
                        cArr = new char[i4];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    }
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        int i11 = $11 + 123;
                        $10 = i11 % 128;
                        if (i11 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                            int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 29, TextUtils.indexOf((CharSequence) "", '0') + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.combineMeasuredStates(0, 0)), Color.alpha(0) + 65, (ViewConfiguration.getTouchSlop() >> 8) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        }
                        c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.indexOf("", "")), TextUtils.indexOf((CharSequence) "", '0', 0) + 71, 12486 - View.resolveSize(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                    cArr4 = cArr;
                }
                if (i6 > 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr4, 0, cArr5, 0, i4);
                    int i14 = i4 - i6;
                    System.arraycopy(cArr5, 0, cArr4, i14, i6);
                    System.arraycopy(cArr5, i6, cArr4, 0, i14);
                }
                if (z) {
                    char[] cArr6 = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    cArr4 = cArr6;
                }
                if (i5 > 0) {
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        int i15 = $10 + 19;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[5]);
                            i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        } else {
                            cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                            i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                        }
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                    }
                }
                objArr[0] = new String(cArr4);
            }
        }

        /* renamed from: o.GuardedAsyncTask$onNavigationEvent$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Boolean>>, Object> {
            int label;

            AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass1(access13800Var);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Result<Boolean>> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnNavigationEvent;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                    this.label = 1;
                    objOnNavigationEvent = GuardedAsyncTask.onNavigationEvent(guardedAsyncTask, (access13800) this);
                    if (objOnNavigationEvent == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                }
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                    Object[] objArr = {GuardedAsyncTask.IAuthTabCallback, Boolean.valueOf(((Boolean) objOnNavigationEvent).booleanValue())};
                    GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 440058142, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, -440058138);
                }
                return Result.IAuthTabCallback(objOnNavigationEvent);
            }
        }
    }

    public final void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onNavigationEvent(context, null), 2, (Object) null);
        int i2 = IAuthTabCallbackStub + 121;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            o.GuardedAsyncTask r4 = (o.GuardedAsyncTask) r4
            r4 = 2
            int r1 = r4 % r4
            int r1 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r1 = r1 + 83
            int r2 = r1 % 128
            o.GuardedAsyncTask.asBinder = r2
            int r1 = r1 % r4
            r2 = 1
            if (r1 == 0) goto L23
            o.zzad r1 = o.zzaj.onNavigationEvent()
            boolean r1 = r1.AudioAttributesImplApi21Parcelizer()
            r3 = 30
            int r3 = r3 / r0
            r1 = r1 ^ r2
            if (r1 == r2) goto L56
            goto L2d
        L23:
            o.zzad r1 = o.zzaj.onNavigationEvent()
            boolean r1 = r1.AudioAttributesImplApi21Parcelizer()
            if (r1 == 0) goto L56
        L2d:
            int r1 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r1 = r1 + 71
            int r3 = r1 % 128
            o.GuardedAsyncTask.asBinder = r3
            int r1 = r1 % r4
            java.lang.String r3 = "wasTermsAgreedAtLeastOne"
            if (r1 == 0) goto L45
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityServiceDefault()
            boolean r1 = r1.onExtraCallback(r3, r0)
            if (r1 != 0) goto L56
            goto L51
        L45:
            o.TextRoundCornerProgressBarSavedState1 r1 = o.addPolicy.ITrustedWebActivityServiceDefault()
            boolean r1 = r1.onExtraCallback(r3, r0)
            r1 = r1 ^ r2
            if (r1 == r2) goto L51
            goto L56
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L56:
            int r0 = o.GuardedAsyncTask.asBinder
            int r0 = r0 + 25
            int r1 = r0 % 128
            o.GuardedAsyncTask.IAuthTabCallbackStub = r1
            int r0 = r0 % r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GuardedAsyncTask.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
    }

    private final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        addPolicy.ITrustedWebActivityServiceDefault().onNavigationEvent("wasTermsAgreedAtLeastOne", z);
        int i4 = asBinder + 69;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallbackStub() throws Throwable {
        Object obj;
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.M.d");
        Object[] objArr = new Object[1];
        a(new char[]{38265, 47387, 62978, 13244, 38906, 36415, 19272, 21464, 65047, 25603}, 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(((String) objArr[0]).intern()));
        Calendar calendarOnWarmupCompleted = onWarmupCompleted();
        String strOnNavigationEvent = onNavigationEvent(calendarOnWarmupCompleted);
        String strOnExtraCallback = onExtraCallback(calendarOnWarmupCompleted);
        Iterator it = addPolicy.ITrustedWebActivityServiceDefault().onWarmupCompleted().iterator();
        while (it.hasNext()) {
            int i2 = asBinder + 43;
            IAuthTabCallbackStub = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual((String) it.next(), strOnNavigationEvent);
                throw null;
            }
            String str = (String) it.next();
            if (!Intrinsics.areEqual(str, strOnNavigationEvent) && !Intrinsics.areEqual(str, strOnExtraCallback)) {
                int i3 = IAuthTabCallbackStub + 115;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    StringsKt.firstOrNull(str);
                    obj2.hashCode();
                    throw null;
                }
                Character chFirstOrNull = StringsKt.firstOrNull(str);
                if (chFirstOrNull != null && Character.isDigit(chFirstOrNull.charValue()) && str.length() >= 8) {
                    try {
                        Result.Companion companion = Result.Companion;
                        Date date = simpleDateFormat.parse(StringsKt.substringBefore$default(str, ".lastSensorStep", (String) null, 2, (Object) null));
                        Intrinsics.checkNotNull(date);
                        obj = Result.constructor-impl(date);
                        int i4 = IAuthTabCallbackStub + 11;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (Result.onNavigationEvent(obj)) {
                        int i6 = IAuthTabCallbackStub + 47;
                        asBinder = i6 % 128;
                        if (i6 % 2 != 0) {
                            addPolicy.ITrustedWebActivityServiceDefault().onTransact(str);
                            obj2.hashCode();
                            throw null;
                        }
                        addPolicy.ITrustedWebActivityServiceDefault().onTransact(str);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final JSBundleLoaderCompanion asInterface() throws Throwable {
        int i = 2 % 2;
        Calendar calendarOnWarmupCompleted = onWarmupCompleted();
        calendarOnWarmupCompleted.add(5, -1);
        int iOnWarmupCompleted = onWarmupCompleted(calendarOnWarmupCompleted);
        if (iOnWarmupCompleted != 0) {
            Date time = calendarOnWarmupCompleted.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
            int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
            JSBundleLoaderCompanion jSBundleLoaderCompanion = new JSBundleLoaderCompanion(calendarOnWarmupCompleted, (String) onExtraCallback(iOnWarmupCompleted2, -1654718401, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted4, new Object[]{this, time}, 1654718408), iOnWarmupCompleted);
            int i2 = IAuthTabCallbackStub + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return jSBundleLoaderCompanion;
        }
        int i4 = asBinder + 97;
        IAuthTabCallbackStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackDefault(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (!(!setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback()) && IAuthTabCallbackDefault()) {
            if (((Boolean) onExtraCallback(zzgsa.onWarmupCompleted(), -2096237238, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{this}, 2096237241)).booleanValue()) {
                int i4 = asBinder + 71;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                if (!(!asInterface(context))) {
                    return true;
                }
            }
        }
        int i6 = IAuthTabCallbackStub + 105;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<java.lang.Boolean>> r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7 instanceof o.GuardedAsyncTask.onExtraCallback
            r2 = 1
            if (r1 == 0) goto L31
            int r1 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r1 = r1 + 57
            int r3 = r1 % 128
            o.GuardedAsyncTask.asBinder = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L2b
            r1 = r7
            o.GuardedAsyncTask$onExtraCallback r1 = (o.GuardedAsyncTask.onExtraCallback) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L31
            int r7 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r7 = r7 + 91
            int r5 = r7 % 128
            o.GuardedAsyncTask.asBinder = r5
            int r7 = r7 % r0
            int r3 = r3 + r4
            r1.label = r3
            goto L3e
        L2b:
            o.GuardedAsyncTask$onExtraCallback r7 = (o.GuardedAsyncTask.onExtraCallback) r7
            int r7 = r7.label
            r7 = 0
            throw r7
        L31:
            o.GuardedAsyncTask$onExtraCallback r1 = new o.GuardedAsyncTask$onExtraCallback
            r1.<init>(r7)
            int r7 = o.GuardedAsyncTask.asBinder
            int r7 = r7 + r2
            int r3 = r7 % 128
            o.GuardedAsyncTask.IAuthTabCallbackStub = r3
            int r7 = r7 % r0
        L3e:
            java.lang.Object r7 = r1.result
            java.lang.Object r3 = o.access14300.onWarmupCompleted()
            int r4 = r1.label
            if (r4 == 0) goto L75
            if (r4 != r2) goto L6d
            int r1 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r1 = r1 + 113
            int r2 = r1 % 128
            o.GuardedAsyncTask.asBinder = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L63
            kotlin.ResultKt.onNavigationEvent(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.onNavigationEvent()
            r0 = 40
            int r0 = r0 / 0
            goto L81
        L63:
            kotlin.ResultKt.onNavigationEvent(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.onNavigationEvent()
            goto L81
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L75:
            kotlin.ResultKt.onNavigationEvent(r7)
            r1.label = r2
            java.lang.Object r7 = r6.IAuthTabCallback(r1)
            if (r7 != r3) goto L81
            return r3
        L81:
            boolean r0 = kotlin.Result.onNavigationEvent(r7)
            if (r0 == 0) goto L93
            r0 = r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            o.GuardedAsyncTask r1 = o.GuardedAsyncTask.IAuthTabCallback
            r1.onExtraCallback(r0)
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GuardedAsyncTask.onNavigationEvent(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.access13800<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r1 = r1 + 113
            int r2 = r1 % 128
            o.GuardedAsyncTask.asBinder = r2
            int r1 = r1 % r0
            boolean r1 = r9 instanceof o.GuardedAsyncTask.IAuthTabCallback
            if (r1 == 0) goto L31
            r1 = r9
            o.GuardedAsyncTask$IAuthTabCallback r1 = (o.GuardedAsyncTask.IAuthTabCallback) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L31
            int r9 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r9 = r9 + 57
            int r4 = r9 % 128
            o.GuardedAsyncTask.asBinder = r4
            int r9 = r9 % r0
            int r2 = r2 + r3
            r1.label = r2
            int r9 = o.GuardedAsyncTask.IAuthTabCallbackStub
            int r9 = r9 + 67
            int r2 = r9 % 128
            o.GuardedAsyncTask.asBinder = r2
            int r9 = r9 % r0
            goto L36
        L31:
            o.GuardedAsyncTask$IAuthTabCallback r1 = new o.GuardedAsyncTask$IAuthTabCallback
            r1.<init>(r9)
        L36:
            r5 = r1
            java.lang.Object r9 = r5.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r5.label
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L4e
            kotlin.ResultKt.onNavigationEvent(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.onNavigationEvent()
            return r9
        L4e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L56:
            kotlin.ResultKt.onNavigationEvent(r9)
            o.zzad r9 = o.zzaj.onNavigationEvent()
            boolean r9 = r9.AudioAttributesImplApi21Parcelizer()
            if (r9 != 0) goto L77
            int r9 = o.GuardedAsyncTask.asBinder
            int r9 = r9 + 85
            int r1 = r9 % 128
            o.GuardedAsyncTask.IAuthTabCallbackStub = r1
            int r9 = r9 % r0
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Boolean r9 = o.access14000.onNavigationEvent(r3)
            java.lang.Object r9 = kotlin.Result.constructor-impl(r9)
            return r9
        L77:
            o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE$IAuthTabCallback r9 = o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.Companion
            o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r2 = r9.onWarmupCompleted()
            r5.label = r3
            java.lang.String r3 = "STD_1595_MAIN_ONBOARDING"
            r4 = 0
            r6 = 2
            r7 = 0
            java.lang.Object r9 = o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r2, r3, r4, r5, r6, r7)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            int r1 = o.GuardedAsyncTask.asBinder
            int r1 = r1 + 61
            int r2 = r1 % 128
            o.GuardedAsyncTask.IAuthTabCallbackStub = r2
            int r1 = r1 % r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GuardedAsyncTask.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    public final boolean asInterface(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if ((!IAuthTabCallback_Parcel(context)) || !EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context).onWarmupCompleted()) {
            int i2 = IAuthTabCallbackStub + 119;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallbackStub + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final boolean IAuthTabCallback_Parcel(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelJU_ = EncodedDataImplExternalSyntheticLambda0.onNavigationEvent(context).jU_(EventServiceImplExternalSyntheticLambda0.PEDOMETER.getId());
            if (notificationChannelJU_ == null) {
                return false;
            }
            int i4 = asBinder + 19;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (notificationChannelJU_.getImportance() <= 0) {
                return false;
            }
            int i6 = IAuthTabCallbackStub + 67;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = IAuthTabCallbackStub + 101;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public final Calendar onWarmupCompleted() throws Throwable {
        Calendar calendarIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            calendarIAuthTabCallbackDefault = JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            int i3 = 30 / 0;
        } else {
            calendarIAuthTabCallbackDefault = JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult.IAuthTabCallbackDefault();
        }
        int i4 = asBinder + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return calendarIAuthTabCallbackDefault;
    }

    private final String onNavigationEvent(Calendar calendar) {
        int i = 2 % 2;
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        String str = i2 + "." + (i3 + 1) + "." + calendar.get(5);
        int i4 = asBinder + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final String onExtraCallback(Calendar calendar) {
        int i = 2 % 2;
        String str = onNavigationEvent(calendar) + ".lastSensorStep";
        int i2 = asBinder + 37;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final void onExtraCallbackWithResult(int i, @NotNull Calendar calendar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(calendar, "");
        addPolicy.ITrustedWebActivityServiceDefault().onExtraCallback(onNavigationEvent(calendar), i, true);
        int i5 = IAuthTabCallbackStub + 61;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(float f, @NotNull Calendar calendar) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(calendar, "");
        addPolicy.ITrustedWebActivityServiceDefault().onExtraCallbackWithResult(onExtraCallback(calendar), f);
        int i4 = IAuthTabCallbackStub + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        GuardedAsyncTask guardedAsyncTask = (GuardedAsyncTask) objArr[0];
        Calendar calendarOnWarmupCompleted = (Calendar) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
            int i4 = i3 + 71;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            calendarOnWarmupCompleted = guardedAsyncTask.onWarmupCompleted();
            int i6 = IAuthTabCallbackStub + 57;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        return Integer.valueOf(guardedAsyncTask.onWarmupCompleted(calendarOnWarmupCompleted));
    }

    public final int onWarmupCompleted(@NotNull Calendar calendar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(calendar, "");
        int iOnWarmupCompleted = addPolicy.ITrustedWebActivityServiceDefault().onWarmupCompleted(onNavigationEvent(calendar), 0);
        int i4 = IAuthTabCallbackStub + 75;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    public final isExpired onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        Calendar calendarOnWarmupCompleted = onWarmupCompleted();
        isExpired isexpired = new isExpired(onWarmupCompleted(calendarOnWarmupCompleted), calendarOnWarmupCompleted);
        int i2 = asBinder + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return isexpired;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        GuardedAsyncTask guardedAsyncTask = (GuardedAsyncTask) objArr[0];
        Calendar calendar = (Calendar) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0 && (iIntValue & 1) != 0) {
            int i4 = i3 + 79;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Calendar calendarOnWarmupCompleted = guardedAsyncTask.onWarmupCompleted();
            if (i5 != 0) {
                int i6 = 81 / 0;
            }
            calendar = calendarOnWarmupCompleted;
        }
        return Float.valueOf(guardedAsyncTask.IAuthTabCallback(calendar));
    }

    public final float IAuthTabCallback(@NotNull Calendar calendar) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(calendar, "");
        float fOnExtraCallback = addPolicy.ITrustedWebActivityServiceDefault().onExtraCallback(onExtraCallback(calendar), -1.0f);
        int i4 = IAuthTabCallbackStub + 79;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return fOnExtraCallback;
    }

    public static /* synthetic */ String onExtraCallback(GuardedAsyncTask guardedAsyncTask, Date date, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 21;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            date = guardedAsyncTask.onWarmupCompleted().getTime();
            Intrinsics.checkNotNullExpressionValue(date, "");
        }
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (String) onExtraCallback(iOnWarmupCompleted, -1654718401, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{guardedAsyncTask, date}, 1654718408);
    }

    public final PendingIntent onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1000, new Intent(context, (Class<?>) createCachedBundleFromNetworkLoader.class), 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i2 = IAuthTabCallbackStub + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return broadcast;
    }

    public final PendingIntent onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1001, new Intent(context, (Class<?>) DynamicNative.class), 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "");
        int i2 = asBinder + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return broadcast;
    }

    public final Uri onExtraCallbackWithResult(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a(new char[]{60898, 36484, 15387, 17010, 7030, 10464, 9116, 45681, 58751, 63869, 19265, 57304, 15387, 17010, 62936, 32182, 51601, 52490, 8557, 34680, 45130, 36982}, 20 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        Uri.Builder builderAppendQueryParameter = Uri.parse(((String) objArr[0]).intern()).buildUpon().appendQueryParameter("source", str);
        Object[] objArr2 = new Object[1];
        a(new char[]{62670, 34305, 23353, 1369, 14232, 63072, 39702, 15790}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr2);
        Uri uriBuild = builderAppendQueryParameter.appendQueryParameter(((String) objArr2[0]).intern(), str).build();
        Object[] objArr3 = new Object[1];
        a(new char[]{60898, 36484, 15387, 17010, 7030, 10464, 9116, 45681, 58751, 63869, 19265, 57304, 39904, 50938, 8539, 51907, 14275, 34157, 50237, 11802}, 19 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
        Uri.Builder builderAppendQueryParameter2 = Uri.parse(((String) objArr3[0]).intern()).buildUpon().appendQueryParameter("redirect", uriBuild.toString());
        Object[] objArr4 = new Object[1];
        a(new char[]{62670, 34305, 23353, 1369, 14232, 63072, 39702, 15790}, 8 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
        Uri uriBuild2 = builderAppendQueryParameter2.appendQueryParameter(((String) objArr4[0]).intern(), str).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild2, "");
        int i4 = IAuthTabCallbackStub + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return uriBuild2;
    }

    public final Intent onExtraCallback(@NotNull Context context, @NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intent intentAddFlags = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, context, onExtraCallbackWithResult(str), false, (getJSQueueThread) null, 12, (Object) null).putExtra(BaseSchemeActivity.Companion.IAuthTabCallback(), "pedometer").putExtra("fgs_notification_service_name", "pedometer").putExtra("appOpenTrigger", "notification").addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
        int i4 = asBinder + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return intentAddFlags;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(GuardedAsyncTask guardedAsyncTask, boolean z) throws Throwable {
        Object[] objArr = {guardedAsyncTask, Boolean.valueOf(z)};
        onExtraCallback(zzgsa.onWarmupCompleted(), 440058142, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, -440058138);
    }

    public static /* synthetic */ float onExtraCallbackWithResult(GuardedAsyncTask guardedAsyncTask, Calendar calendar, int i, Object obj) {
        Object[] objArr = {guardedAsyncTask, calendar, Integer.valueOf(i), obj};
        return ((Float) onExtraCallback(zzgsa.onWarmupCompleted(), 1673036759, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, -1673036751)).floatValue();
    }

    public static /* synthetic */ int onNavigationEvent(GuardedAsyncTask guardedAsyncTask, Calendar calendar, int i, Object obj) {
        Object[] objArr = {guardedAsyncTask, calendar, Integer.valueOf(i), obj};
        return ((Integer) onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, -339510300)).intValue();
    }

    public final boolean IAuthTabCallback(@NotNull Context context) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return ((Boolean) onExtraCallback(iOnWarmupCompleted, 1333334459, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this, context}, -1333334458)).booleanValue();
    }

    public final String onNavigationEvent() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (String) onExtraCallback(iOnWarmupCompleted, -416687169, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this}, 416687169);
    }

    public final String onWarmupCompleted(@NotNull Date date) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return (String) onExtraCallback(iOnWarmupCompleted, -1654718401, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this, date}, 1654718408);
    }

    public final boolean asBinder(@NotNull Context context) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return ((Boolean) onExtraCallback(iOnWarmupCompleted, -1941814049, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this, context}, 1941814058)).booleanValue();
    }

    public final void asBinder() throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        onExtraCallback(iOnWarmupCompleted, -667909761, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this}, 667909763);
    }

    public final void onExtraCallback(@NotNull String str) throws Throwable {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        onExtraCallback(iOnWarmupCompleted, -1754168336, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this, str}, 1754168342);
    }

    public final boolean access100() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        return ((Boolean) onExtraCallback(iOnWarmupCompleted, -2096237238, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{this}, 2096237241)).booleanValue();
    }

    static void access000() {
        onExtraCallbackWithResult = (char) 40844;
        onNavigationEvent = (char) 32227;
        onTransact = (char) 6776;
        IAuthTabCallbackDefault = (char) 49089;
    }
}
