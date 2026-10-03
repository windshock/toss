package viva.republica.toss.pedometer;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.RemoteViewsCompat;
import androidx.lifecycle.LifecycleService;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.gms.internal.ads.zziea;
import com.google.common.base.Converter;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.core.R;
import im.toss.features.ble.service.AdvertisingBLEGattService;
import im.toss.state.spec.SessionState;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.ConvertFloatArrayToByteArray;
import o.DeviceInfoFieldGroup;
import o.DynamicFromObject;
import o.EncoderImplExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.EventServiceImplExternalSyntheticLambda0;
import o.GeckoHubImp1;
import o.GuardedAsyncTask;
import o.GuardedRunnable;
import o.IdGeneratorExternalSyntheticLambda1;
import o.JSApplicationCausedNativeException;
import o.JSApplicationIllegalArgumentException;
import o.JSBundleLoaderCompanion;
import o.JSBundleLoaderCompanioncreateAssetLoader1;
import o.JSInstance;
import o.JavaMethodWrapper;
import o.JsonReaderUnknownNumberParsing;
import o.StatisticModel;
import o.TextContextMenuHelperApi28ExternalSyntheticLambda8;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.WorkerParameters;
import o._string;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access27600;
import o.access8100;
import o.auth;
import o.b11;
import o.createFileLoader;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.doInBackgroundGuarded;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getJSQueueThread;
import o.getPackageType;
import o.getStartTimeMillis;
import o.getStringValueByKey;
import o.getTimestampBytes;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onAccuracyChanged;
import o.onTextViewSizeChanged;
import o.putChannelInfo;
import o.r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk;
import o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc;
import o.removeTabBarModel;
import o.setRandomHost;
import o.zzad;
import o.zzag;
import o.zzaj;
import o.zzaz;
import o.zzbb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.pedometer.PedometerService;
import viva.republica.toss.pedometer.PedometerService$;
import viva.republica.toss.pedometer.PedometerService$Companion$;
import viva.republica.toss.send.service.CopyTextJobService;
import viva.republica.toss.splash.BaseSchemeActivity;
import viva.republica.toss.splash.SplashSchemeActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PedometerService extends DynamicFromObject implements SensorEventListener {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static final boolean IAuthTabCallback;
    private static long ICustomTabsCallbackStub = 0;
    private static int extraCommand = 1;
    private static int isEngagementSignalsApiAvailable = 1;
    private static int mayLaunchUrl;
    public static final int onExtraCallback;
    private static int onRelationshipValidationResult;
    private final Lazy IAuthTabCallbackDefault;
    private onNavigationEvent IAuthTabCallbackStub;
    private getStringValueByKey IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private getPackageType ICustomTabsCallback;
    private final access100 ICustomTabsCallbackDefault;
    private final getTimestampBytes<Unit> ICustomTabsCallbackStubProxy;
    private final Lazy access000;
    private int access100;

    @Inject
    public r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc agreedToAnyTermsUseCase;

    @Inject
    public DeviceInfoFieldGroup airdropRepository;

    @Inject
    public removeTabBarModel airdropTermsManager;
    private final Lazy asBinder;
    private float asInterface;

    @Inject
    public onAccuracyChanged badNotificationCrashRecorder;

    @Inject
    public zzad environments;
    private final Lazy extraCallback;
    private final Lazy extraCallbackWithResult;
    private final Lazy getInterfaceDescriptor;

    @Inject
    public getStartTimeMillis localeManager;
    private AtomicBoolean onActivityLayout;
    private final HandlerThread onActivityResized;
    private boolean onExtraCallbackWithResult;
    private final Lazy onMessageChannelReady;
    private final Handler onMinimized;
    private final ClipboardManager.OnPrimaryClipChangedListener onNavigationEvent;
    private final StatisticModel onPostMessage;
    private final deserializeUriCollection onTransact;
    private boolean onUnminimized;
    private final Lazy onWarmupCompleted;
    private final Lazy readTypedObject;

    @Inject
    public SessionState sessionState;

    @Inject
    public zzag tossClock;
    private onExtraCallback writeTypedObject;

    static final class asBinder extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PedometerService.onWarmupCompleted(PedometerService.this, (access13800) this);
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[getStringValueByKey.values().length];
            try {
                iArr[getStringValueByKey.STREAK_COUNT_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getStringValueByKey.CONTROL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getStringValueByKey.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static /* synthetic */ NotificationManager IAuthTabCallback(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallbackDefault(pedometerService);
        }
        ICustomTabsCallbackDefault(pedometerService);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onRelationshipValidationResult + 45;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ ClipboardManager IAuthTabCallbackDefault(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 11;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        ClipboardManager clipboardManagerOnActivityResized = onActivityResized(pedometerService);
        int i4 = onRelationshipValidationResult + 71;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return clipboardManagerOnActivityResized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 1993630397, new Object[]{function1, obj}, iIAuthTabCallback2, -1993630395);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
        int iIAuthTabCallback5 = zziea.IAuthTabCallback();
        int iIAuthTabCallback6 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback4, zziea.IAuthTabCallback(), iIAuthTabCallback6, 1993630397, new Object[]{function1, obj}, iIAuthTabCallback5, -1993630395);
        int i3 = isEngagementSignalsApiAvailable + 45;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
    }

    public static /* synthetic */ PendingIntent IAuthTabCallbackStub(PedometerService pedometerService) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(pedometerService);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return pendingIntentICustomTabsCallbackStubProxy;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 87;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 66 / 0;
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 101;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentICustomTabsService = ICustomTabsService(pedometerService);
        int i4 = onRelationshipValidationResult + 37;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return pendingIntentICustomTabsService;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(asInterface(function1, obj));
        }
        asInterface(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 109;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        NumberFormat numberFormatICustomTabsCallbackDefault = ICustomTabsCallbackDefault();
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return numberFormatICustomTabsCallbackDefault;
    }

    public static /* synthetic */ PendingIntent access100(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(pedometerService);
        int i4 = isEngagementSignalsApiAvailable + 77;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return pendingIntentIsEngagementSignalsApiAvailable;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ClipboardManager clipboardManager = (ClipboardManager) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(clipboardManager);
        }
        onWarmupCompleted(clipboardManager);
        throw null;
    }

    public static /* synthetic */ void asInterface(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(pedometerService);
        int i4 = onRelationshipValidationResult + 121;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SensorManager sensorManagerExtraCommand = extraCommand(pedometerService);
        int i4 = onRelationshipValidationResult + 15;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return sensorManagerExtraCommand;
    }

    public static /* synthetic */ PendingIntent onExtraCallbackWithResult(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 67;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentOnUnminimized = onUnminimized(pedometerService);
        int i4 = isEngagementSignalsApiAvailable + 37;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return pendingIntentOnUnminimized;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 33;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pedometerService, str);
        int i4 = onRelationshipValidationResult + 125;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PedometerService pedometerService, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 89;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(pedometerService, pair);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        int i5 = onRelationshipValidationResult + 39;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(ClipData clipData) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 91;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(clipData);
        int i4 = onRelationshipValidationResult + 117;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ PendingIntent onNavigationEvent(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentOnRelationshipValidationResult = onRelationshipValidationResult(pedometerService);
        int i4 = onRelationshipValidationResult + 39;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return pendingIntentOnRelationshipValidationResult;
        }
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(ClipData clipData) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 27;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        String str = (String) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1559023361, new Object[]{clipData}, iIAuthTabCallback2, 1559023366);
        int i4 = isEngagementSignalsApiAvailable + 39;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PedometerService pedometerService, Boolean bool) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 77;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pedometerService, bool);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = onRelationshipValidationResult + 39;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PedometerService pedometerService, Unit unit) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 73;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        Unit unit2 = (Unit) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -2036253375, new Object[]{pedometerService, unit}, iIAuthTabCallback2, 2036253379);
        int i4 = isEngagementSignalsApiAvailable + 7;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    public static /* synthetic */ boolean onNavigationEvent(Unit unit) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 49;
        isEngagementSignalsApiAvailable = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(unit);
        }
        onExtraCallbackWithResult(unit);
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000(function1, obj);
        int i4 = onRelationshipValidationResult + 25;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zAccess000;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onActivityLayout(pedometerService);
        }
        onActivityLayout(pedometerService);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i4);
        int i11 = i9 | i10 | (~(i8 | i4));
        int i12 = i10 | i;
        int i13 = ~i4;
        int i14 = (~(i | i13 | i6)) | (~(i7 | i13 | i8)) | (~(i8 | i6 | i4));
        int i15 = i6 + i4 + i5 + ((-1329026341) * i3) + ((-1277752516) * i2);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i6) - 1912602624) + ((-659060787) * i4) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i5) + (494927872 * i3) + (1577058304 * i2) + ((-1783103488) * i16);
        int i18 = (i6 * 595972471) + 129777640 + (i4 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i5 * 595972219) + (i3 * (-1341978823)) + (i2 * 731850196) + (i16 * 1869086720);
        switch (i17 + (i18 * i18 * (-846725120))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return access100(objArr);
            case 11:
                return IAuthTabCallback_Parcel(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return extraCallbackWithResult(objArr);
            case 16:
                return readTypedObject(objArr);
            case 17:
                return writeTypedObject(objArr);
            case 18:
                return extraCallback(objArr);
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                return onActivityLayout(objArr);
            case 21:
                return onPostMessage(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ String onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i4 = onRelationshipValidationResult + 69;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PedometerService pedometerService) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(pedometerService);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return unitICustomTabsCallbackStub;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1210999087, new Object[]{function1, obj}, iIAuthTabCallback2, 1210999095);
        int i4 = onRelationshipValidationResult + 99;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallbackWithResult = -948539925673805184L;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Calendar $calendar;
        final /* synthetic */ int $deviceStep;
        Object L$0;
        int label;
        final /* synthetic */ PedometerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(Calendar calendar, PedometerService pedometerService, int i, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$calendar = calendar;
            this.this$0 = pedometerService;
            this.$deviceStep = i;
        }

        public static /* synthetic */ Unit onWarmupCompleted(PedometerService pedometerService, String str, int i, Throwable th) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 61;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(pedometerService, str, i, th);
            int i5 = onWarmupCompleted + 73;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = new access000(this.$calendar, this.this$0, this.$deviceStep, access13800Var);
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return access000Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            int i3 = 2 / 0;
            return onWarmupCompleted(findresandmsg, access13800Var);
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0185  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(char[] r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 398
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.access000.a(char[], int, java.lang.Object[]):void");
        }

        private static final Unit IAuthTabCallback(PedometerService pedometerService, String str, int i, Throwable th) throws Throwable {
            int i2 = 2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{GuardedAsyncTask.IAuthTabCallback, null, 1, null}, -339510300)).intValue()));
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("nextSyncStepCount", Integer.valueOf(createFileLoader.onExtraCallbackWithResult.onTransact()));
            Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("lastSensorStep", Float.valueOf(PedometerService.IAuthTabCallback_Parcel(pedometerService)));
            Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("syncReq", str + ":" + i);
            Object[] objArr = new Object[1];
            a(new char[]{32709, 55337, 12320, 34869, 57396, 14398}, 43004 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "pedometer_debug", "failed_sync", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), th.getLocalizedMessage())}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            final String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                Date time = this.$calendar.getTime();
                Intrinsics.checkNotNullExpressionValue(time, "");
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
                String str2 = (String) GuardedAsyncTask.onExtraCallback(iOnWarmupCompleted, -1654718401, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{guardedAsyncTask, time}, 1654718408);
                GeckoHubImp1 geckoHubImp1OnExtraCallbackWithResult = createFileLoader.onExtraCallbackWithResult(createFileLoader.onExtraCallbackWithResult, (Context) this.this$0, this.$deviceStep, str2, (JSInstance) null, 8, (Object) null);
                this.L$0 = str2;
                this.label = 1;
                Object objIAuthTabCallback = geckoHubImp1OnExtraCallbackWithResult.IAuthTabCallback(this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                str = str2;
                obj = objIAuthTabCallback;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            Object objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            final PedometerService pedometerService = this.this$0;
            final int i5 = this.$deviceStep;
            final Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (th != null) {
                doInBackgroundGuarded.onWarmupCompleted.onNavigationEvent("failed_sync", new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$sync$1$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return PedometerService.access000.onWarmupCompleted(pedometerService, str, i5, th);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
            int i6 = IAuthTabCallback + 105;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(char[] r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.a(char[], int, java.lang.Object[]):void");
    }

    public PedometerService() {
        HandlerThread handlerThread = new HandlerThread("PedometerService-Sensor");
        handlerThread.start();
        this.onActivityResized = handlerThread;
        Handler handler = new Handler(handlerThread.getLooper());
        this.onMinimized = handler;
        this.onPostMessage = b11.onNavigationEvent(handler, (String) null, 1, (Object) null);
        this.onActivityLayout = new AtomicBoolean(false);
        this.asInterface = -1.0f;
        this.onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda8
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                return (SensorManager) PedometerService.onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -712183234, objArr, iIAuthTabCallback2, 712183254);
            }
        });
        this.access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda10
            public final Object invoke() {
                return PedometerService.IAuthTabCallback(this.f$0);
            }
        });
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda11
            public final Object invoke() {
                return PedometerService.access100(this.f$0);
            }
        });
        this.readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda12
            public final Object invoke() {
                return PedometerService.onExtraCallbackWithResult(this.f$0);
            }
        });
        this.extraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda13
            public final Object invoke() {
                return PedometerService.onNavigationEvent(this.f$0);
            }
        });
        this.extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda14
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                return (PendingIntent) PedometerService.onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -326703918, objArr, iIAuthTabCallback2, 326703932);
            }
        });
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda15
            public final Object invoke() {
                return PedometerService.IAuthTabCallbackStub(this.f$0);
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda16
            public final Object invoke() {
                return PedometerService.IAuthTabCallbackDefault(this.f$0);
            }
        });
        this.onNavigationEvent = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda17
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                PedometerService.asInterface(this.f$0);
            }
        };
        getTimestampBytes<Unit> gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        this.ICustomTabsCallbackStubProxy = gettimestampbytesIAuthTabCallback;
        this.onTransact = new deserializeUriCollection();
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda18
            public final Object invoke() {
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                int iIAuthTabCallback3 = zziea.IAuthTabCallback();
                return (NumberFormat) PedometerService.onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1302502391, new Object[0], iIAuthTabCallback2, 1302502403);
            }
        });
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda9
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                return (NotificationCompat.access100) PedometerService.onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 365620194, objArr, iIAuthTabCallback2, -365620173);
            }
        });
        this.ICustomTabsCallbackDefault = new access100();
        this.IAuthTabCallbackStubProxy = getStringValueByKey.CONTROL;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 79;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        pedometerService.ICustomTabsCallbackStub();
        if (i3 != 0) {
            return null;
        }
        int i4 = 77 / 0;
        return null;
    }

    public static final /* synthetic */ void IAuthTabCallback(PedometerService pedometerService, float f) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 111;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        pedometerService.asInterface = f;
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
        int i6 = i2 + 79;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ getStringValueByKey IAuthTabCallbackStubProxy(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 45;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getStringValueByKey getstringvaluebykey = pedometerService.IAuthTabCallbackStubProxy;
        int i5 = i3 + 45;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return getstringvaluebykey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float IAuthTabCallback_Parcel(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 113;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        float f = pedometerService.asInterface;
        int i5 = i2 + 93;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return f;
    }

    public static final /* synthetic */ onNavigationEvent access000(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 121;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        onNavigationEvent onnavigationevent = pedometerService.IAuthTabCallbackStub;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 123;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        getStringValueByKey getstringvaluebykey = (getStringValueByKey) objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 41;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        Object obj = null;
        pedometerService.IAuthTabCallbackStubProxy = getstringvaluebykey;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 41;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return null;
    }

    public static final /* synthetic */ getTimestampBytes extraCallback(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 99;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        getTimestampBytes<Unit> gettimestampbytes = pedometerService.ICustomTabsCallbackStubProxy;
        int i5 = i2 + 109;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return gettimestampbytes;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 55;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SensorManager sensorManagerOnPostMessage = pedometerService.onPostMessage();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        int i5 = isEngagementSignalsApiAvailable + 109;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return sensorManagerOnPostMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void extraCallbackWithResult(PedometerService pedometerService) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 25;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        pedometerService.ICustomTabsCallbackStubProxy();
        int i4 = onRelationshipValidationResult + 57;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getPackageType getInterfaceDescriptor(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 61;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        getPackageType getpackagetype = pedometerService.ICustomTabsCallback;
        int i5 = i2 + 7;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return getpackagetype;
    }

    public static final /* synthetic */ void onExtraCallback(PedometerService pedometerService, getPackageType getpackagetype) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 115;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        pedometerService.ICustomTabsCallback = getpackagetype;
        int i5 = i3 + 89;
        isEngagementSignalsApiAvailable = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(PedometerService pedometerService, int i, Calendar calendar) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 33;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        pedometerService.onNavigationEvent(i, calendar);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(PedometerService pedometerService, SensorEvent sensorEvent, onNavigationEvent onnavigationevent, int i, int i2, long j) {
        int i3 = 2 % 2;
        int i4 = onRelationshipValidationResult + 55;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        pedometerService.onExtraCallback(sensorEvent, onnavigationevent, i, i2, j);
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = onRelationshipValidationResult + 25;
        isEngagementSignalsApiAvailable = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onPostMessage(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 69;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        pedometerService.mayLaunchUrl();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(PedometerService pedometerService, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 79;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return pedometerService.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        }
        pedometerService.IAuthTabCallback((access13800<? super Unit>) access13800Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(PedometerService pedometerService, int i, Calendar calendar) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 101;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        pedometerService.onExtraCallbackWithResult(i, calendar);
        int i5 = onRelationshipValidationResult + 63;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(PedometerService pedometerService, Integer num, Calendar calendar) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 63;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -624508216, new Object[]{pedometerService, num, calendar}, iIAuthTabCallback2, 624508229);
        int i4 = isEngagementSignalsApiAvailable + 61;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(PedometerService pedometerService, onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 1;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        pedometerService.IAuthTabCallbackStub = onnavigationevent;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
    }

    public static final /* synthetic */ Handler readTypedObject(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 23;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = pedometerService.onMinimized;
        if (i4 != 0) {
            int i5 = 23 / 0;
        }
        int i6 = i2 + 109;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 == 0) {
            return handler;
        }
        throw null;
    }

    public static final /* synthetic */ AtomicBoolean writeTypedObject(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 111;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        AtomicBoolean atomicBoolean = pedometerService.onActivityLayout;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return atomicBoolean;
    }

    public final zzad asBinder() {
        int i = 2 % 2;
        zzad zzadVar = this.environments;
        Object obj = null;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = onRelationshipValidationResult + 47;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = isEngagementSignalsApiAvailable;
        int i4 = i3 + 13;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 19;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 == 0) {
            return zzadVar;
        }
        obj.hashCode();
        throw null;
    }

    public final zzag IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 55;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            int i4 = i3 + 27;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = onRelationshipValidationResult + 79;
        isEngagementSignalsApiAvailable = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final onAccuracyChanged asInterface() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable;
        int i3 = i2 + 37;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        onAccuracyChanged onaccuracychanged = this.badNotificationCrashRecorder;
        if (onaccuracychanged == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 53;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return onaccuracychanged;
    }

    public final removeTabBarModel IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 61;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        removeTabBarModel removetabbarmodel = this.airdropTermsManager;
        if (removetabbarmodel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 21;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return removetabbarmodel;
    }

    public final DeviceInfoFieldGroup onTransact() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 47;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        DeviceInfoFieldGroup deviceInfoFieldGroup = this.airdropRepository;
        if (deviceInfoFieldGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 83;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return deviceInfoFieldGroup;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable + 91;
        viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 31;
        viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc onExtraCallbackWithResult() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult
            int r2 = r1 + 89
            int r3 = r2 % 128
            viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L18
            o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r2 = r5.agreedToAnyTermsUseCase
            r4 = 70
            int r4 = r4 / 0
            if (r2 == 0) goto L27
            goto L1c
        L18:
            o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r2 = r5.agreedToAnyTermsUseCase
            if (r2 == 0) goto L27
        L1c:
            int r1 = r1 + 31
            int r4 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            return r2
        L26:
            throw r3
        L27:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L38
            return r3
        L38:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.onExtraCallbackWithResult():o.r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc");
    }

    public final getStartTimeMillis IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 85;
        int i3 = i2 % 128;
        isEngagementSignalsApiAvailable = i3;
        int i4 = i2 % 2;
        getStartTimeMillis getstarttimemillis = this.localeManager;
        Object obj = null;
        if (getstarttimemillis == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 17;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return getstarttimemillis;
        }
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ String $from;
        final /* synthetic */ int $maxAttempt;
        final /* synthetic */ long $retryDelay;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        private static final byte[] $$a = {52, -58, -85, 74};
        private static final int $$b = 237;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static long onExtraCallbackWithResult = -7605128552987034393L;
        private static int onNavigationEvent = -1776194565;
        private static char onExtraCallback = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r7, int r8, short r9) {
            /*
                byte[] r0 = viva.republica.toss.pedometer.PedometerService.IAuthTabCallback_Parcel.$$a
                int r9 = r9 * 3
                int r9 = 4 - r9
                int r8 = r8 * 3
                int r8 = r8 + 1
                int r7 = 110 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r9
                r4 = r2
                goto L2b
            L14:
                r3 = r2
            L15:
                r6 = r9
                r9 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r9 = r9 + 1
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.IAuthTabCallback_Parcel.$$c(byte, int, short):java.lang.String");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(int i, String str, long j, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$maxAttempt = i;
            this.$from = str;
            this.$retryDelay = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = PedometerService.this.new IAuthTabCallback_Parcel(this.$maxAttempt, this.$from, this.$retryDelay, access13800Var);
            int i2 = onWarmupCompleted + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
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
                int i5 = $10 + 103;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int iAxisFromString = MotionEvent.axisFromString("") + 44;
                        int i7 = 1450 - (ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1));
                        byte b = (byte) i4;
                        byte b2 = b;
                        String str$$c = $$c(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, iAxisFromString, i7, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char c2 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122);
                        int iIndexOf = TextUtils.indexOf("", "", i4) + 44;
                        int threadPriority = ((Process.getThreadPriority(i4) + 20) >> 6) + 1494;
                        byte b3 = (byte) ($$b & 3);
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, iIndexOf, threadPriority, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 23972), 50 - TextUtils.getOffsetAfter("", 0), TextUtils.lastIndexOf("", '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.getTrimmedLength("")), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i8 = $11 + 57;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
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
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0238  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x021e -> B:35:0x0233). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 718
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.IAuthTabCallback_Parcel.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final SessionState access100() {
        int i = 2 % 2;
        SessionState sessionState = this.sessionState;
        Object obj = null;
        if (sessionState != null) {
            int i2 = onRelationshipValidationResult + 13;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                return sessionState;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = isEngagementSignalsApiAvailable + 5;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final SensorManager onPostMessage() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 69;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        SensorManager sensorManager = (SensorManager) this.onMessageChannelReady.getValue();
        int i4 = onRelationshipValidationResult + 61;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return sensorManager;
    }

    private final NotificationManager readTypedObject() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 117;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        NotificationManager notificationManager = (NotificationManager) this.access000.getValue();
        int i3 = isEngagementSignalsApiAvailable + 97;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return notificationManager;
        }
        throw null;
    }

    private final PendingIntent onActivityResized() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.getInterfaceDescriptor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        PendingIntent pendingIntent = (PendingIntent) value;
        int i4 = isEngagementSignalsApiAvailable + 71;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return pendingIntent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final PendingIntent isEngagementSignalsApiAvailable(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 65;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            pedometerService.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback.onExtraCallback((Context) pedometerService, "pedometer_widget"));
            throw null;
        }
        PendingIntent pendingIntentIAuthTabCallback = pedometerService.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback.onExtraCallback((Context) pedometerService, "pedometer_widget"));
        int i3 = onRelationshipValidationResult + 15;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            return pendingIntentIAuthTabCallback;
        }
        throw null;
    }

    private final PendingIntent onActivityLayout() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.readTypedObject.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (PendingIntent) value;
        }
        Object value2 = this.readTypedObject.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final PendingIntent onUnminimized(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 11;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentIAuthTabCallback = pedometerService.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback.onExtraCallback((Context) pedometerService, "pedometer_widget_variant_reward"));
        int i4 = isEngagementSignalsApiAvailable + 19;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return pendingIntentIAuthTabCallback;
    }

    private final PendingIntent onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 61;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object value = this.extraCallbackWithResult.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            obj.hashCode();
            throw null;
        }
        Object value2 = this.extraCallbackWithResult.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        PendingIntent pendingIntent = (PendingIntent) value2;
        int i3 = isEngagementSignalsApiAvailable + 25;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return pendingIntent;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final PendingIntent onRelationshipValidationResult(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 51;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        PendingIntent pendingIntentIAuthTabCallback = pedometerService.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback.onExtraCallback((Context) pedometerService, "pedometer_widget_variant_shield"));
        int i4 = onRelationshipValidationResult + 51;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return pendingIntentIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = pedometerService.extraCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        PendingIntent pendingIntent = (PendingIntent) value;
        int i4 = onRelationshipValidationResult + 59;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return pendingIntent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final PendingIntent ICustomTabsService(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 61;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            pedometerService.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback.onExtraCallback((Context) pedometerService, "pedometer_widget_variant_streak"));
            throw null;
        }
        PendingIntent pendingIntentIAuthTabCallback = pedometerService.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback.onExtraCallback((Context) pedometerService, "pedometer_widget_variant_streak"));
        int i3 = onRelationshipValidationResult + 11;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return pendingIntentIAuthTabCallback;
    }

    private final PendingIntent extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 113;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.asBinder.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (PendingIntent) value;
        }
        Object value2 = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final PendingIntent ICustomTabsCallbackStubProxy(PedometerService pedometerService) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 99;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{2319, 29350, 65106, 31252, 59314, 25443, 61193, 26822, 54391, 20577, 56709, 22998, 50469, 20222, 51847, 13907, 46003, 16275, 47955, 9446, 41141, 11290, 43026, 5540, 37223, 7427, 34520, 614, 36409, 3037, 30618, 62315, 31983, 63644, 25655, 57827, 28035, 59730, 21179, 56997, 23105, 50719, 17317, 53108, 19213, 46283, 12395, 48175, 14835, 42356, 8507, 43717, 5783, 37410, 8162}, 31664 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        Intent intentAddFlags = SplashSchemeActivity.onNavigationEvent.onExtraCallbackWithResult(SplashSchemeActivity.Companion, pedometerService, Uri.parse(((String) objArr[0]).intern()), false, (getJSQueueThread) null, 12, (Object) null).putExtra(BaseSchemeActivity.Companion.IAuthTabCallback(), "inquiry").putExtra("fgs_notification_service_name", "pedometer_inquiry").putExtra("appOpenTrigger", "notification").addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
        PendingIntent pendingIntentIAuthTabCallback = pedometerService.IAuthTabCallback(intentAddFlags);
        int i4 = isEngagementSignalsApiAvailable + 99;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return pendingIntentIAuthTabCallback;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 85;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        ClipboardManager clipboardManager = (ClipboardManager) pedometerService.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return clipboardManager;
    }

    private static final void onMinimized(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 5;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        pedometerService.onUnminimized();
        int i4 = onRelationshipValidationResult + 75;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    private final NumberFormat writeTypedObject() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 81;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback_Parcel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        NumberFormat numberFormat = (NumberFormat) value;
        int i4 = onRelationshipValidationResult + 69;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return numberFormat;
    }

    private static final NumberFormat ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 15;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Locale locale = Locale.US;
        if (i3 == 0) {
            return NumberFormat.getInstance(locale);
        }
        NumberFormat.getInstance(locale);
        throw null;
    }

    private final NotificationCompat.access100 access000() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 105;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        NotificationCompat.access100 access100Var = (NotificationCompat.access100) this.onWarmupCompleted.getValue();
        int i4 = onRelationshipValidationResult + 13;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 != 0) {
            return access100Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final NotificationCompat.access100 onActivityLayout(PedometerService pedometerService) {
        int i = 2 % 2;
        NotificationCompat.access100 access100VarOnExtraCallback = new NotificationCompat.access100(pedometerService, EventServiceImplExternalSyntheticLambda0.PEDOMETER.getId()).onTransact(true).onTransact(1).IAuthTabCallbackDefault(false).asInterface(R.drawable.icon_toss_logo_mono).IAuthTabCallbackDefault(pedometerService.getString(viva.republica.toss.R.string.shortcut_pedometer)).onExtraCallbackWithResult(ContextCompat.getColor(pedometerService, viva.republica.toss.R.color.app_icon_color)).onNavigationEvent("pedometer").asInterface(true).IAuthTabCallback((long[]) null).onExtraCallback(1);
        int i2 = isEngagementSignalsApiAvailable + 123;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        return access100VarOnExtraCallback;
    }

    public static final class access100 extends BroadcastReceiver {
        access100() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {CommonModule_closeView.onWarmupCompleted};
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = (IdGeneratorExternalSyntheticLambda1) CommonModule_closeView.onExtraCallbackWithResult(1967451170, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -1967451168, _string.onNavigationEvent.IAuthTabCallback(), objArr, _string.onNavigationEvent.IAuthTabCallback());
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "");
            idGeneratorExternalSyntheticLambda1.setTimeZone(timeZone);
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == 502473491) {
                    if (action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "timeZoneChanged", access8100.onNavigationEvent(getWrite.IAuthTabCallback("localTime", idGeneratorExternalSyntheticLambda1.format(PedometerService.this.IAuthTabCallbackStubProxy().onWarmupCompleted()))), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    }
                } else if (iHashCode == 505380757 && action.equals("android.intent.action.TIME_SET")) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "timeChanged", access8100.onNavigationEvent(getWrite.IAuthTabCallback("localTime", idGeneratorExternalSyntheticLambda1.format(PedometerService.this.IAuthTabCallbackStubProxy().onWarmupCompleted()))), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                }
            }
        }
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 83;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(PedometerService pedometerService, Boolean bool) {
        int i = 2 % 2;
        if (bool.booleanValue() && createFileLoader.onExtraCallbackWithResult.IAuthTabCallbackStub()) {
            int i2 = onRelationshipValidationResult + 95;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            pedometerService.ICustomTabsCallbackStubProxy.onExtraCallback(Unit.INSTANCE);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 91;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final boolean asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 35;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onRelationshipValidationResult + 51;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onExtraCallbackWithResult(Unit unit) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 49;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(unit, "");
        boolean zIAuthTabCallback = onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback();
        int i4 = onRelationshipValidationResult + 11;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 39;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onRelationshipValidationResult + 115;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 45;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        Calendar calendarOnWarmupCompleted = guardedAsyncTask.onWarmupCompleted();
        Object[] objArr2 = {pedometerService, Integer.valueOf(guardedAsyncTask.onWarmupCompleted(calendarOnWarmupCompleted)), calendarOnWarmupCompleted};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 33;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 75;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        int i4 = 81 / 0;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.pedometer.PedometerService r13, kotlin.Pair r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.onExtraCallback(viva.republica.toss.pedometer.PedometerService, kotlin.Pair):kotlin.Unit");
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = PedometerService.this.new IAuthTabCallbackDefault(access13800Var);
            iAuthTabCallbackDefault.L$0 = obj;
            return iAuthTabCallbackDefault;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x047e, code lost:
        
            if (r2 == r3) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x02d6, code lost:
        
            if (r0 != r3) goto L48;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0443  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x044c  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x048e  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x049a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x035b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0365 A[Catch: CancellationException -> 0x009e, Exception -> 0x03aa, WebResourceResponseModel -> 0x03b4, TryCatch #6 {CancellationException -> 0x009e, blocks: (B:9:0x006b, B:73:0x03a1, B:12:0x0088, B:63:0x0351, B:66:0x035d, B:68:0x0365, B:71:0x039b, B:60:0x0319), top: B:127:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x039b A[Catch: CancellationException -> 0x009e, Exception -> 0x03aa, WebResourceResponseModel -> 0x03b4, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x009e, blocks: (B:9:0x006b, B:73:0x03a1, B:12:0x0088, B:63:0x0351, B:66:0x035d, B:68:0x0365, B:71:0x039b, B:60:0x0319), top: B:127:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x03e9  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0406  */
        /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, o.GuardedAsyncTask] */
        /* JADX WARN: Type inference failed for: r0v86, types: [android.content.Context] */
        /* JADX WARN: Type inference failed for: r0v96 */
        /* JADX WARN: Type inference failed for: r0v97 */
        /* JADX WARN: Type inference failed for: r11v11, types: [o.JSApplicationCausedNativeException] */
        /* JADX WARN: Type inference failed for: r11v26, types: [o.JSApplicationCausedNativeException] */
        /* JADX WARN: Type inference failed for: r8v5, types: [viva.republica.toss.pedometer.PedometerService$onExtraCallbackWithResult] */
        /* JADX WARN: Type inference failed for: r8v6, types: [o.JSApplicationIllegalArgumentException] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.IAuthTabCallbackDefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.DynamicFromObject
    public void onCreate() {
        int i = 2 % 2;
        super.onCreate();
        try {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -624508216, new Object[]{this, null, null}, iIAuthTabCallback2, 624508229);
            int i2 = onRelationshipValidationResult + 43;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
        } catch (SecurityException unused) {
        }
        Object[] objArr = {GuardedAsyncTask.IAuthTabCallback, null, 1, null};
        this.asInterface = ((Float) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 1673036759, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr, -1673036751)).floatValue();
        onExtraCallback(5, 5000L, "onCreate");
        Object[] objArr2 = {onTextViewSizeChanged.onExtraCallbackWithResult, false, 1, null};
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = ((getByteBuffer) onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 773290631, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), objArr2, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -773290631)).IAuthTabCallback(new PedometerService$.ExternalSyntheticLambda1(new PedometerService$.ExternalSyntheticLambda0(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        access27600.onExtraCallback(deserializeurinullablecollectionIAuthTabCallback, this.onTransact);
        access100 access100Var = this.ICustomTabsCallbackDefault;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        Unit unit = Unit.INSTANCE;
        zzbb.onExtraCallbackWithResult(access100Var, this, intentFilter, 2);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = this.ICustomTabsCallbackStubProxy.onWarmupCompleted(new PedometerService$.ExternalSyntheticLambda3(new PedometerService$.ExternalSyntheticLambda2())).onTransact(1L, TimeUnit.SECONDS).IAuthTabCallback(new PedometerService$.ExternalSyntheticLambda5(new PedometerService$.ExternalSyntheticLambda4(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
        access27600.onExtraCallback(deserializeurinullablecollectionIAuthTabCallback2, this.onTransact);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback3 = GuardedRunnable.onExtraCallbackWithResult.onExtraCallback().IAuthTabCallback(new PedometerService$.ExternalSyntheticLambda7(new PedometerService$.ExternalSyntheticLambda6(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback3, "");
        access27600.onExtraCallback(deserializeurinullablecollectionIAuthTabCallback3, this.onTransact);
        if (IAuthTabCallback) {
            int i4 = onRelationshipValidationResult + 59;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            int iIAuthTabCallback4 = zziea.IAuthTabCallback();
            int iOnWarmupCompleted = Converter.1.onWarmupCompleted();
            int iIAuthTabCallback5 = zziea.IAuthTabCallback();
            ClipboardManager clipboardManager = (ClipboardManager) onWarmupCompleted(iIAuthTabCallback4, Converter.1.onWarmupCompleted(), iIAuthTabCallback5, 1405606621, new Object[]{this}, iOnWarmupCompleted, -1405606603);
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(this.onNavigationEvent);
            }
        }
        this.access100 = getResources().getConfiguration().uiMode & 48;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallbackDefault(null), 2, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallbackStub(this, (access13800) null), 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Service, viva.republica.toss.pedometer.PedometerService] */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws Exception {
        ?? r0 = (PedometerService) objArr[0];
        Integer num = (Integer) objArr[1];
        Calendar calendar = (Calendar) objArr[2];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 39;
        isEngagementSignalsApiAvailable = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                EncoderImplExternalSyntheticLambda1.onExtraCallback((Service) r0, 22797, r0.onNavigationEvent(num, calendar).onWarmupCompleted(), 13255);
                return null;
            }
            EncoderImplExternalSyntheticLambda1.onExtraCallback((Service) r0, 300, r0.onNavigationEvent(num, calendar).onWarmupCompleted(), 256);
            return null;
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 31 && TextContextMenuHelperApi28ExternalSyntheticLambda8.onWarmupCompleted(e)) {
                int i3 = isEngagementSignalsApiAvailable + 99;
                onRelationshipValidationResult = i3 % 128;
                if (i3 % 2 != 0) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "startForeground not allowed (ForegroundServiceStartNotAllowedException)", null, null, true, null, 40, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                } else {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "startForeground not allowed (ForegroundServiceStartNotAllowedException)", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                }
                return null;
            }
            throw e;
        }
    }

    static /* synthetic */ getPackageType onExtraCallbackWithResult(PedometerService pedometerService, int i, long j, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = isEngagementSignalsApiAvailable;
        int i5 = i4 + 47;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 85;
            onRelationshipValidationResult = i7 % 128;
            int i8 = i7 % 2;
            i = 1;
        }
        if ((i2 & 2) != 0) {
            int i9 = i4 + 75;
            onRelationshipValidationResult = i9 % 128;
            int i10 = i9 % 2;
            j = 0;
        }
        return pedometerService.onExtraCallback(i, j, str);
    }

    private final getPackageType onExtraCallback(int i, long j, String str) {
        int i2 = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), this.onPostMessage, (setRandomHost) null, new IAuthTabCallback_Parcel(i, str, j, null), 2, (Object) null);
        int i3 = onRelationshipValidationResult + 57;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(ClipboardManager clipboardManager) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 119;
        isEngagementSignalsApiAvailable = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (clipboardManager.hasPrimaryClip()) {
                JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onExtraCallback(clipboardManager.getPrimaryClip());
                int i3 = onRelationshipValidationResult + 41;
                isEngagementSignalsApiAvailable = i3 % 128;
                if (i3 % 2 != 0) {
                    return jsonReaderUnknownNumberParsingOnExtraCallback;
                }
                throw null;
            }
            return JsonReaderUnknownNumberParsing.onNavigationEvent();
        }
        clipboardManager.hasPrimaryClip();
        obj.hashCode();
        throw null;
    }

    private static final boolean access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 11;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onRelationshipValidationResult + 61;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onExtraCallback(ClipData clipData) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 125;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(clipData, "");
        String mimeType = clipData.getDescription().getMimeType(0);
        Intrinsics.checkNotNullExpressionValue(mimeType, "");
        Object[] objArr = new Object[1];
        a(new char[]{2312, 10238, 21706, 34237}, Color.rgb(0, 0, 0) + 16789223, objArr);
        if (StringsKt.contains$default(mimeType, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
            int i4 = isEngagementSignalsApiAvailable + 33;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            if (clipData.getItemAt(0).getText() != null) {
                int i6 = onRelationshipValidationResult + 87;
                isEngagementSignalsApiAvailable = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        int i8 = isEngagementSignalsApiAvailable + 75;
        onRelationshipValidationResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 4 / 0;
        }
        return false;
    }

    private static final String IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 37;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = isEngagementSignalsApiAvailable + 105;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        ClipData clipData = (ClipData) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 43;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(clipData, "");
        String lowerCase = clipData.getItemAt(0).getText().toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int i4 = onRelationshipValidationResult + 95;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return lowerCase;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 29;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onRelationshipValidationResult + 25;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onUnminimized() {
        /*
            r16 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object[] r6 = new java.lang.Object[]{r16}
            int r2 = com.google.android.gms.internal.ads.zziea.IAuthTabCallback()
            int r7 = com.google.common.base.Converter.1.onWarmupCompleted()
            int r4 = com.google.android.gms.internal.ads.zziea.IAuthTabCallback()
            int r3 = com.google.common.base.Converter.1.onWarmupCompleted()
            r1 = -1405606603(0xffffffffac382535, float:-2.6168627E-12)
            r15 = 1405606621(0x53c7dadd, float:1.7167408E12)
            r5 = r15
            r8 = r1
            java.lang.Object r2 = onWarmupCompleted(r2, r3, r4, r5, r6, r7, r8)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            if (r2 == 0) goto Lb5
            java.lang.Object[] r12 = new java.lang.Object[]{r16}
            int r8 = com.google.android.gms.internal.ads.zziea.IAuthTabCallback()
            int r13 = com.google.common.base.Converter.1.onWarmupCompleted()
            int r10 = com.google.android.gms.internal.ads.zziea.IAuthTabCallback()
            int r9 = com.google.common.base.Converter.1.onWarmupCompleted()
            r11 = r15
            r14 = r1
            java.lang.Object r2 = onWarmupCompleted(r8, r9, r10, r11, r12, r13, r14)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            if (r2 == 0) goto L55
            int r3 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r3 = r3 + 81
            int r4 = r3 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r4
            int r3 = r3 % r0
            boolean r2 = r2.hasPrimaryClip()
            if (r2 != 0) goto L55
            return
        L55:
            java.lang.Object[] r12 = new java.lang.Object[]{r16}
            int r8 = com.google.android.gms.internal.ads.zziea.IAuthTabCallback()
            int r13 = com.google.common.base.Converter.1.onWarmupCompleted()
            int r10 = com.google.android.gms.internal.ads.zziea.IAuthTabCallback()
            int r9 = com.google.common.base.Converter.1.onWarmupCompleted()
            r11 = r15
            r14 = r1
            java.lang.Object r1 = onWarmupCompleted(r8, r9, r10, r11, r12, r13, r14)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            if (r1 == 0) goto Lb5
            viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda19 r2 = new viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda19
            r2.<init>(r1)
            o.JsonReaderUnknownNumberParsing r1 = o.JsonReaderUnknownNumberParsing.onExtraCallbackWithResult(r2)
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 2000(0x7d0, double:9.88E-321)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            o.JsonReaderUnknownNumberParsing r1 = r1.IAuthTabCallback(r2, r4)
            viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda20 r2 = new viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda20
            r2.<init>()
            viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda21 r3 = new viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda21
            r3.<init>(r2)
            o.JsonReaderUnknownNumberParsing r1 = r1.onWarmupCompleted(r3)
            viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda22 r2 = new viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda22
            r2.<init>()
            viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda23 r3 = new viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda23
            r3.<init>(r2)
            o.JsonReaderUnknownNumberParsing r1 = r1.onNavigationEvent(r3)
            viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda25 r2 = new viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda25
            viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda24 r3 = new viva.republica.toss.pedometer.PedometerService$$ExternalSyntheticLambda24
            r4 = r16
            r3.<init>(r4)
            r2.<init>(r3)
            r1.IAuthTabCallback(r2)
            goto Lb7
        Lb5:
            r4 = r16
        Lb7:
            int r1 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lc6
            r0 = 11
            int r0 = r0 / 0
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.onUnminimized():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PedometerService pedometerService, String str) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 47;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent();
                intent.putExtra("extraClipboardCopyText", str);
                CopyTextJobService.Companion.onWarmupCompleted(pedometerService, intent);
                int i4 = onRelationshipValidationResult + 3;
                isEngagementSignalsApiAvailable = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 121;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        this.onUnminimized = false;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "pedometer_debug", "onDestroy", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue())), getWrite.IAuthTabCallback("nextSyncStepCount", Integer.valueOf(createFileLoader.onExtraCallbackWithResult.onTransact())), getWrite.IAuthTabCallback("lastSensorStep", Float.valueOf(this.asInterface)), getWrite.IAuthTabCallback("isAvailable", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault((Context) this))), getWrite.IAuthTabCallback("isPedometerActivationRequested", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback("isPedometerNotificationEnabled", Boolean.valueOf(guardedAsyncTask.asInterface((Context) this))), getWrite.IAuthTabCallback("wasMandatoryTermsAgreed", Boolean.valueOf(((Boolean) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -2096237238, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask}, 2096237241)).booleanValue()))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        zzbb.onWarmupCompleted(this.ICustomTabsCallbackDefault, this);
        if (IAuthTabCallback) {
            int i4 = onRelationshipValidationResult + 73;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iOnWarmupCompleted = Converter.1.onWarmupCompleted();
            ClipboardManager clipboardManager = (ClipboardManager) onWarmupCompleted(iIAuthTabCallback, Converter.1.onWarmupCompleted(), zziea.IAuthTabCallback(), 1405606621, new Object[]{this}, iOnWarmupCompleted, -1405606603);
            if (clipboardManager != null) {
                int i6 = onRelationshipValidationResult + 87;
                isEngagementSignalsApiAvailable = i6 % 128;
                if (i6 % 2 == 0) {
                    clipboardManager.removePrimaryClipChangedListener(this.onNavigationEvent);
                    int i7 = 5 / 0;
                } else {
                    clipboardManager.removePrimaryClipChangedListener(this.onNavigationEvent);
                }
            }
        }
        this.onTransact.dispose();
        onPostMessage().unregisterListener(this);
        this.onActivityResized.quitSafely();
        EncoderImplExternalSyntheticLambda1.onExtraCallback(this, 1);
        AdvertisingBLEGattService.onExtraCallbackWithResult.IAuthTabCallback(AdvertisingBLEGattService.Companion, this, (WorkerParameters) null, 2, (Object) null);
        int i8 = onRelationshipValidationResult + 15;
        isEngagementSignalsApiAvailable = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final NotificationCompat.access100 onNavigationEvent(Integer num, Calendar calendar) throws NoWhenBranchMatchedException {
        String str;
        String str2;
        PendingIntent pendingIntentOnActivityLayout;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 79;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Context contextIAuthTabCallback = IAuthTabCallbackStub().IAuthTabCallback(this);
        if (num == null || (str = writeTypedObject().format(num)) == null) {
            str = "-";
        }
        RemoteViews remoteViews = null;
        if (calendar != null) {
            GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            str2 = (String) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -1654718401, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, time}, 1654718408);
            int i4 = isEngagementSignalsApiAvailable + 89;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str2 = null;
        }
        onExtraCallback onextracallback = this.writeTypedObject;
        if (onextracallback == null || !Intrinsics.areEqual(onextracallback.IAuthTabCallback(), str2)) {
            onextracallback = null;
        }
        boolean z = onextracallback != null && onextracallback.onExtraCallback();
        boolean z2 = onextracallback != null && onextracallback.onExtraCallbackWithResult();
        int iOnWarmupCompleted = onextracallback != null ? onextracallback.onWarmupCompleted() : 0;
        if (!asInterface().onExtraCallback()) {
            remoteViews = Build.VERSION.SDK_INT >= 31 ? new RemoteViews(getPackageName(), viva.republica.toss.R.layout.noti_pedometer_v31) : new RemoteViews(getPackageName(), viva.republica.toss.R.layout.noti_pedometer);
        } else if (!this.onExtraCallbackWithResult) {
            int i6 = isEngagementSignalsApiAvailable + 105;
            onRelationshipValidationResult = i6 % 128;
            int i7 = i6 % 2;
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "avoidRemoteViews", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            this.onExtraCallbackWithResult = true;
        }
        getStringValueByKey getstringvaluebykey = this.IAuthTabCallbackStubProxy;
        int[] iArr = onWarmupCompleted.onNavigationEvent;
        int i8 = iArr[getstringvaluebykey.ordinal()];
        if (i8 == 1 || i8 == 2) {
            if (z2) {
                pendingIntentOnActivityLayout = onMessageChannelReady();
            } else if (this.IAuthTabCallbackStubProxy != getStringValueByKey.STREAK_COUNT_BUTTON || iOnWarmupCompleted < 2) {
                pendingIntentOnActivityLayout = onActivityLayout();
            } else {
                int i9 = onRelationshipValidationResult + 109;
                isEngagementSignalsApiAvailable = i9 % 128;
                int i10 = i9 % 2;
                pendingIntentOnActivityLayout = (PendingIntent) onWarmupCompleted(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 865441486, new Object[]{this}, zziea.IAuthTabCallback(), -865441483);
            }
        } else {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pendingIntentOnActivityLayout = onActivityResized();
            int i11 = onRelationshipValidationResult + 21;
            isEngagementSignalsApiAvailable = i11 % 128;
            int i12 = i11 % 2;
        }
        if (remoteViews != null) {
            remoteViews.setOnClickPendingIntent(viva.republica.toss.R.id.noti_pedometer_home, extraCallbackWithResult());
            int i13 = viva.republica.toss.R.id.noti_pedometer_reward_button;
            remoteViews.setOnClickPendingIntent(i13, pendingIntentOnActivityLayout);
            remoteViews.setTextViewText(viva.republica.toss.R.id.noti_pedometer_step_count, str);
            remoteViews.setTextViewText(viva.republica.toss.R.id.noti_pedometer_step_count_unit, contextIAuthTabCallback.getString(viva.republica.toss.R.string.app_noti_pedometer_v31___53d190a622));
            remoteViews.setTextViewText(viva.republica.toss.R.id.noti_pedometer_home_title, contextIAuthTabCallback.getString(viva.republica.toss.R.string.app_noti_pedometer_v31___13a46f96e1));
            int i14 = iArr[this.IAuthTabCallbackStubProxy.ordinal()];
            if (i14 == 1 || i14 == 2) {
                int i15 = 0;
                remoteViews.setViewVisibility(viva.republica.toss.R.id.noti_pedometer_default_buttons, 8);
                if (calendar == null) {
                    int i16 = onRelationshipValidationResult + 39;
                    isEngagementSignalsApiAvailable = i16 % 128;
                    i15 = i16 % 2 == 0 ? 9 : 8;
                }
                remoteViews.setViewVisibility(i13, i15);
                if (z2) {
                    int i17 = viva.republica.toss.R.id.noti_pedometer_reward_button_text;
                    remoteViews.setTextViewText(i17, contextIAuthTabCallback.getString(viva.republica.toss.R.string.app_pedometer_noti_reward_title_a_shield));
                    RemoteViewsCompat.onNavigationEvent(remoteViews, i13, true);
                    RemoteViewsCompat.onNavigationEvent(remoteViews, i17, true);
                } else if (this.IAuthTabCallbackStubProxy != getStringValueByKey.STREAK_COUNT_BUTTON || iOnWarmupCompleted < 2) {
                    int i18 = viva.republica.toss.R.id.noti_pedometer_reward_button_text;
                    remoteViews.setTextViewText(i18, contextIAuthTabCallback.getString(viva.republica.toss.R.string.app_pedometer_noti_reward_title_a));
                    RemoteViewsCompat.onNavigationEvent(remoteViews, i13, z);
                    RemoteViewsCompat.onNavigationEvent(remoteViews, i18, z);
                } else {
                    int i19 = onRelationshipValidationResult + 29;
                    isEngagementSignalsApiAvailable = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = viva.republica.toss.R.id.noti_pedometer_reward_button_text;
                    remoteViews.setTextViewText(i21, contextIAuthTabCallback.getString(viva.republica.toss.R.string.app_pedometer_noti_reward_title_streak, writeTypedObject().format(Integer.valueOf(iOnWarmupCompleted))));
                    RemoteViewsCompat.onNavigationEvent(remoteViews, i13, true);
                    RemoteViewsCompat.onNavigationEvent(remoteViews, i21, true);
                    int i22 = isEngagementSignalsApiAvailable + 7;
                    onRelationshipValidationResult = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 5 % 2;
                    }
                }
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                remoteViews.setViewVisibility(viva.republica.toss.R.id.noti_pedometer_default_buttons, 0);
                remoteViews.setViewVisibility(i13, 8);
            }
        }
        NotificationCompat.access100 access100VarOnNavigationEvent = access000().onExtraCallback(pendingIntentOnActivityLayout).onWarmupCompleted(getString(viva.republica.toss.R.string.app_pedometer_step_count_format, str)).onNavigationEvent(remoteViews);
        Intrinsics.checkNotNullExpressionValue(access100VarOnNavigationEvent, "");
        return access100VarOnNavigationEvent;
    }

    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        int i3;
        long j;
        String str;
        int i4;
        int i5 = 2 % 2;
        int i6 = isEngagementSignalsApiAvailable + 65;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
        super.onStartCommand(intent, i, i2);
        if (!this.onActivityLayout.get()) {
            int i8 = isEngagementSignalsApiAvailable + 109;
            onRelationshipValidationResult = i8 % 128;
            if (i8 % 2 != 0) {
                i3 = 0;
                j = 0;
                str = "onStartCommand";
                i4 = 4;
            } else {
                i3 = 0;
                j = 0;
                str = "onStartCommand";
                i4 = 3;
            }
            onExtraCallbackWithResult(this, i3, j, str, i4, null);
            int i9 = onRelationshipValidationResult + 95;
            isEngagementSignalsApiAvailable = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 4;
            }
        }
        boolean z = this.onUnminimized;
        this.onUnminimized = true;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new asInterface(intent, this, !z, (access13800) null), 2, (Object) null);
        int i11 = isEngagementSignalsApiAvailable + 113;
        onRelationshipValidationResult = i11 % 128;
        int i12 = i11 % 2;
        return 1;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int i) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 41;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "onAccuracyChanged", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{GuardedAsyncTask.IAuthTabCallback, null, 1, null}, -339510300)).intValue())), getWrite.IAuthTabCallback("nextSyncStepCount", Integer.valueOf(createFileLoader.onExtraCallbackWithResult.onTransact())), getWrite.IAuthTabCallback("lastSensorStep", Float.valueOf(this.asInterface)), getWrite.IAuthTabCallback("accuracy", Integer.valueOf(i))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i5 = onRelationshipValidationResult + 45;
        isEngagementSignalsApiAvailable = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ SensorEvent $event;
        final /* synthetic */ float $sensorStep;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(float f, SensorEvent sensorEvent, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$sensorStep = f;
            this.$event = sensorEvent;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PedometerService.this.new onTransact(this.$sensorStep, this.$event, access13800Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x02fa  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0317  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x031a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 826
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSensorChanged(@org.jetbrains.annotations.Nullable android.hardware.SensorEvent r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r1 = r1 + 113
            int r2 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 29
            int r1 = r1 / r3
            if (r10 == 0) goto L40
            goto L18
        L16:
            if (r10 == 0) goto L40
        L18:
            float[] r1 = r10.values
            if (r1 == 0) goto L40
            int r4 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r4 = r4 + 17
            int r5 = r4 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r5
            int r4 = r4 % r0
            java.lang.Float r1 = kotlin.collections.ArraysKt.getOrNull(r1, r3)
            if (r1 == 0) goto L40
            float r1 = r1.floatValue()
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r3 = o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r9)
            o.StatisticModel r4 = r9.onPostMessage
            r5 = 0
            viva.republica.toss.pedometer.PedometerService$onTransact r6 = new viva.republica.toss.pedometer.PedometerService$onTransact
            r6.<init>(r1, r10, r2)
            r7 = 2
            r8 = 0
            o.maybeUpdateAnimatable.onNavigationEvent(r3, r4, r5, r6, r7, r8)
        L40:
            int r10 = viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult
            int r10 = r10 + 5
            int r1 = r10 % 128
            viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r1
            int r10 = r10 % r0
            if (r10 == 0) goto L4c
            return
        L4c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.onSensorChanged(android.hardware.SensorEvent):void");
    }

    private final void onExtraCallbackWithResult(int i, Calendar calendar) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 105;
        isEngagementSignalsApiAvailable = i3 % 128;
        int i4 = i3 % 2;
        readTypedObject().notify(300, onNavigationEvent(Integer.valueOf(i), calendar).onWarmupCompleted());
        int i5 = isEngagementSignalsApiAvailable + 69;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(int i, Calendar calendar) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult;
        int i4 = i3 + 87;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        if (i >= 0) {
            int i6 = i3 + 49;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            onExtraCallbackWithResult(i, calendar);
            onWarmupCompleted(i, calendar, true, true);
        }
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue()));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("nextSyncStepCount", Integer.valueOf(createFileLoader.onExtraCallbackWithResult.onTransact()));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("lastSensorStep", Float.valueOf(this.asInterface));
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "reviseStepCount(" + i + ")", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("isAvailable", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault(applicationContext)))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    private final void ICustomTabsCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        if (!asBinder().AudioAttributesImplApi21Parcelizer()) {
            Object obj = null;
            JSBundleLoaderCompanioncreateAssetLoader1.IAuthTabCallback(JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult, null, new PedometerService$.ExternalSyntheticLambda26(this), 1, null);
            int i2 = onRelationshipValidationResult + 35;
            isEngagementSignalsApiAvailable = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = onRelationshipValidationResult + 73;
        isEngagementSignalsApiAvailable = i3 % 128;
        if (i3 % 2 != 0) {
            onRelationshipValidationResult();
        } else {
            onRelationshipValidationResult();
            int i4 = 42 / 0;
        }
    }

    private static final Unit ICustomTabsCallbackStub(PedometerService pedometerService) throws Throwable {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 93;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        pedometerService.onRelationshipValidationResult();
        Unit unit = Unit.INSTANCE;
        int i4 = isEngagementSignalsApiAvailable + 89;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Integer $yesterdayStepCount;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Integer num, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$yesterdayStepCount = num;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PedometerService.this.new IAuthTabCallback(this.$yesterdayStepCount, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objIAuthTabCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                String str = (String) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -416687169, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask}, 416687169);
                Date time = guardedAsyncTask.onWarmupCompleted().getTime();
                Intrinsics.checkNotNullExpressionValue(time, "");
                String str2 = (String) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -1654718401, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, time}, 1654718408);
                if (str != null && !StringsKt.isBlank(str) && !Intrinsics.areEqual(str, str2)) {
                    JSApplicationIllegalArgumentException jSApplicationIllegalArgumentException = JSApplicationIllegalArgumentException.onExtraCallbackWithResult;
                    LifecycleService lifecycleService = PedometerService.this;
                    this.L$0 = access15400.onNavigationEvent(str);
                    this.L$1 = access15400.onNavigationEvent(str2);
                    this.label = 1;
                    objIAuthTabCallback = jSApplicationIllegalArgumentException.IAuthTabCallback((Context) lifecycleService, (access13800<? super Integer>) this);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = obj;
            int iIntValue = ((Number) objIAuthTabCallback).intValue();
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("sensor_steps", this.$yesterdayStepCount);
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("recording_client_steps", access14000.onNavigationEvent(iIntValue));
            Integer num = this.$yesterdayStepCount;
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "pedometer_debug", "yesterday step comparison", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("diff", access14000.onNavigationEvent((num != null ? num.intValue() : 0) - iIntValue))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onRelationshipValidationResult() throws Throwable {
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 33;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            GuardedAsyncTask.IAuthTabCallback.asInterface();
            obj.hashCode();
            throw null;
        }
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        JSBundleLoaderCompanion jSBundleLoaderCompanionAsInterface = guardedAsyncTask.asInterface();
        if (jSBundleLoaderCompanionAsInterface != null) {
            int i3 = isEngagementSignalsApiAvailable + 25;
            onRelationshipValidationResult = i3 % 128;
            if (i3 % 2 != 0) {
                Integer.valueOf(jSBundleLoaderCompanionAsInterface.onNavigationEvent());
                throw null;
            }
            numValueOf = Integer.valueOf(jSBundleLoaderCompanionAsInterface.onNavigationEvent());
        } else {
            int i4 = onRelationshipValidationResult + 83;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            numValueOf = null;
        }
        createFileLoader.onExtraCallbackWithResult.asBinder();
        ICustomTabsCallbackStub();
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue()));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("lastSensorStep", Float.valueOf(this.asInterface));
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "pedometer_debug", "onNewDateStarted", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("isAvailable", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault(applicationContext))), getWrite.IAuthTabCallback("yesterdayStepCount", numValueOf)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallback(numValueOf, null), 2, (Object) null);
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        PedometerService pedometerService = (PedometerService) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(pedometerService), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new access000((Calendar) objArr[2], pedometerService, iIntValue, null), 2, (Object) null);
        int i2 = isEngagementSignalsApiAvailable + 51;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 43 / 0;
        }
        return getpackagetypeOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void mayLaunchUrl() {
        int i = 2 % 2;
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        PendingIntent pendingIntentOnExtraCallbackWithResult = guardedAsyncTask.onExtraCallbackWithResult(applicationContext);
        AlarmManager interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i2 = onRelationshipValidationResult + 69;
            isEngagementSignalsApiAvailable = i2 % 128;
            int i3 = i2 % 2;
            interfaceDescriptor.cancel(pendingIntentOnExtraCallbackWithResult);
            if (Build.VERSION.SDK_INT < 31) {
                interfaceDescriptor.setInexactRepeating(3, SystemClock.elapsedRealtime() + TimeUnit.MINUTES.toMillis(1L), 900000L, pendingIntentOnExtraCallbackWithResult);
                return;
            }
        }
        int i4 = onRelationshipValidationResult + 53;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 53;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        PendingIntent pendingIntentOnNavigationEvent = guardedAsyncTask.onNavigationEvent(applicationContext);
        AlarmManager interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i4 = onRelationshipValidationResult + 81;
            isEngagementSignalsApiAvailable = i4 % 128;
            int i5 = i4 % 2;
            interfaceDescriptor.cancel(pendingIntentOnNavigationEvent);
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int iIAuthTabCallback3 = zziea.IAuthTabCallback();
            interfaceDescriptor.set(1, ((Calendar) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1234123773, new Object[]{this}, iIAuthTabCallback2, 1234123790)).getTimeInMillis(), pendingIntentOnNavigationEvent);
            int i6 = isEngagementSignalsApiAvailable + 111;
            onRelationshipValidationResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 123;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendarOnWarmupCompleted = GuardedAsyncTask.IAuthTabCallback.onWarmupCompleted();
        calendarOnWarmupCompleted.setTimeInMillis(System.currentTimeMillis());
        calendarOnWarmupCompleted.set(11, 0);
        calendarOnWarmupCompleted.set(12, 0);
        calendarOnWarmupCompleted.set(13, 0);
        calendarOnWarmupCompleted.set(14, 0);
        calendarOnWarmupCompleted.add(5, 1);
        int i4 = isEngagementSignalsApiAvailable + 19;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return calendarOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull android.content.res.Configuration r9) throws java.lang.Exception {
        /*
            r8 = this;
            r7 = 2
            int r1 = r7 % r7
            int r1 = viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult
            int r1 = r1 + 85
            int r2 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r2
            int r1 = r1 % r7
            java.lang.String r2 = ""
            if (r1 != 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            super/*android.app.Service*/.onConfigurationChanged(r9)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 != r2) goto L5a
            goto L29
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            super/*android.app.Service*/.onConfigurationChanged(r9)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 != r2) goto L5a
        L29:
            int r0 = r9.uiMode
            r0 = r0 & 48
            int r1 = r8.access100
            if (r0 == r1) goto L5a
            int r0 = viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult
            int r0 = r0 + 55
            int r1 = r0 % 128
            viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r1
            int r0 = r0 % r7
            java.lang.String r1 = "PedometerService.onConfigurationChanged"
            if (r0 != 0) goto L4a
            viva.republica.toss.pedometer.PedometerService$onExtraCallbackWithResult r0 = viva.republica.toss.pedometer.PedometerService.Companion
            r0.IAuthTabCallback(r8, r1)
            java.lang.String r2 = "PedometerService.onConfigurationChanged"
            r3 = 0
            r4 = 1
            r5 = 68
            goto L55
        L4a:
            viva.republica.toss.pedometer.PedometerService$onExtraCallbackWithResult r0 = viva.republica.toss.pedometer.PedometerService.Companion
            r0.IAuthTabCallback(r8, r1)
            java.lang.String r2 = "PedometerService.onConfigurationChanged"
            r3 = 0
            r4 = 0
            r5 = 12
        L55:
            r6 = 0
            r1 = r8
            viva.republica.toss.pedometer.PedometerService.onExtraCallbackWithResult.onWarmupCompleted(r0, r1, r2, r3, r4, r5, r6)
        L5a:
            int r0 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r0 = r0 + 45
            int r1 = r0 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r1
            int r0 = r0 % r7
            if (r0 != 0) goto L66
            return
        L66:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PendingIntent IAuthTabCallback(Intent intent) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        onRelationshipValidationResult = i2 % 128;
        PendingIntent activity = PendingIntent.getActivity(this, i2 % 2 != 0 ? 3694 : 300, intent, 201326592);
        int i3 = isEngagementSignalsApiAvailable + 55;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return activity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(int i, int i2, PedometerService pedometerService, SensorEvent sensorEvent, onNavigationEvent onnavigationevent, long j, String str) {
        String strOnWarmupCompleted;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        int i3 = 2 % 2;
        int i4 = onRelationshipValidationResult + 121;
        isEngagementSignalsApiAvailable = i4 % 128;
        int i5 = i4 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("currStepCount", Integer.valueOf(i));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("prevStepCount", Integer.valueOf(i2));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("currSensorEvent", (String) onWarmupCompleted(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1744953032, new Object[]{pedometerService, sensorEvent}, zziea.IAuthTabCallback(), -1744953022));
        if (onnavigationevent != null) {
            int i6 = onRelationshipValidationResult + 93;
            isEngagementSignalsApiAvailable = i6 % 128;
            int i7 = i6 % 2;
            strOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
        } else {
            strOnWarmupCompleted = null;
        }
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("prevSensorEvent", strOnWarmupCompleted);
        if (onnavigationevent != null) {
            int i8 = isEngagementSignalsApiAvailable + 21;
            onRelationshipValidationResult = i8 % 128;
            int i9 = i8 % 2;
            lValueOf = Long.valueOf(sensorEvent.timestamp - onnavigationevent.onExtraCallback());
        } else {
            lValueOf = null;
        }
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("sensorTimestampDiff", lValueOf);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("currSensorEventReceivedTimestamp", Long.valueOf(j));
        if (onnavigationevent != null) {
            int i10 = onRelationshipValidationResult + 91;
            isEngagementSignalsApiAvailable = i10 % 128;
            if (i10 % 2 == 0) {
                lValueOf2 = Long.valueOf(onnavigationevent.onExtraCallbackWithResult());
                int i11 = 48 / 0;
            } else {
                lValueOf2 = Long.valueOf(onnavigationevent.onExtraCallbackWithResult());
            }
        } else {
            int i12 = onRelationshipValidationResult + 123;
            isEngagementSignalsApiAvailable = i12 % 128;
            int i13 = i12 % 2;
            lValueOf2 = null;
        }
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("prevSensorEventReceivedTimestamp", lValueOf2);
        if (onnavigationevent != null) {
            lValueOf3 = Long.valueOf(j - onnavigationevent.onExtraCallbackWithResult());
            int i14 = onRelationshipValidationResult + 31;
            isEngagementSignalsApiAvailable = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 2 % 4;
            }
        } else {
            lValueOf3 = null;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "pedometer_debug", str, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, getWrite.IAuthTabCallback("sensorEventReceivedTimestampDiff", lValueOf3)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
    }

    private final void onExtraCallback(SensorEvent sensorEvent, onNavigationEvent onnavigationevent, int i, int i2, long j) {
        Integer numValueOf;
        int i3 = 2 % 2;
        int i4 = onRelationshipValidationResult + 35;
        int i5 = i4 % 128;
        isEngagementSignalsApiAvailable = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i >= 50000000 && i2 < 50000000) {
            int i6 = i5 + 5;
            onRelationshipValidationResult = i6 % 128;
            if (i6 % 2 != 0) {
                IAuthTabCallback(i, i2, this, sensorEvent, onnavigationevent, j, "abnormal sensor value (v2)");
                int i7 = 68 / 0;
            } else {
                IAuthTabCallback(i, i2, this, sensorEvent, onnavigationevent, j, "abnormal sensor value (v2)");
            }
        }
        float[] fArr = sensorEvent.values;
        Intrinsics.checkNotNullExpressionValue(fArr, "");
        Float orNull = ArraysKt.getOrNull(fArr, 0);
        if (orNull != null) {
            numValueOf = Integer.valueOf((int) orNull.floatValue());
            int i8 = isEngagementSignalsApiAvailable + 115;
            onRelationshipValidationResult = i8 % 128;
            int i9 = i8 % 2;
        } else {
            numValueOf = null;
        }
        Integer numValueOf2 = onnavigationevent != null ? Integer.valueOf((int) onnavigationevent.onNavigationEvent()) : null;
        if (numValueOf != null) {
            int i10 = isEngagementSignalsApiAvailable + 65;
            int i11 = i10 % 128;
            onRelationshipValidationResult = i11;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (numValueOf2 != null) {
                int i12 = i11 + 101;
                isEngagementSignalsApiAvailable = i12 % 128;
                if (i12 % 2 == 0) {
                    if (Math.abs(numValueOf.intValue() * numValueOf2.intValue()) < 22835) {
                        return;
                    }
                } else if (Math.abs(numValueOf.intValue() - numValueOf2.intValue()) < 5000) {
                    return;
                }
                IAuthTabCallback(i, i2, this, sensorEvent, onnavigationevent, j, "abnormal sensor diff (v2)");
            }
        }
    }

    private final void onNavigationEvent(int i, Calendar calendar) {
        int i2 = 2 % 2;
        int i3 = isEngagementSignalsApiAvailable + 65;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        GuardedRunnable.onExtraCallbackWithResult.IAuthTabCallback().onExtraCallback(getWrite.IAuthTabCallback(Integer.valueOf(i), calendar));
        int i5 = isEngagementSignalsApiAvailable + 83;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void onExtraCallback(PedometerService pedometerService, int i, Calendar calendar, boolean z, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = isEngagementSignalsApiAvailable + 123;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 2) != 0) {
            if (createFileLoader.onExtraCallbackWithResult.onTransact() <= i) {
                int i5 = isEngagementSignalsApiAvailable + 31;
                onRelationshipValidationResult = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        pedometerService.onWarmupCompleted(i, calendar, z, z2);
    }

    private final void onWarmupCompleted(int i, Calendar calendar, boolean z, boolean z2) {
        int i2 = 2 % 2;
        onNavigationEvent(i, calendar);
        GuardedAsyncTask.IAuthTabCallback.onExtraCallbackWithResult(i, calendar);
        if (!z) {
            return;
        }
        if (z2) {
            int i3 = isEngagementSignalsApiAvailable + 111;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {this, Integer.valueOf(i), calendar};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            int i5 = onRelationshipValidationResult + 21;
            isEngagementSignalsApiAvailable = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.ICustomTabsCallbackStubProxy.onExtraCallback(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.access13800<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, Context context, String str, String str2, boolean z, int i, Object obj) throws Exception {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            onextracallbackwithresult.onNavigationEvent(context, str, str2, z);
        }

        public final void onNavigationEvent(@NotNull final Context context, @NotNull final String str, @Nullable final String str2, final boolean z) throws Exception {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
                onExtraCallback(context, str, str2, z);
            } else {
                JSBundleLoaderCompanioncreateAssetLoader1.IAuthTabCallback(JSBundleLoaderCompanioncreateAssetLoader1.onExtraCallbackWithResult, null, new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$Companion$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return PedometerService.onExtraCallbackWithResult.onWarmupCompleted(context, str, str2, z);
                    }
                }, 1, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(Context context, String str, String str2, boolean z) throws Exception {
            PedometerService.Companion.onExtraCallback(context, str, str2, z);
            return Unit.INSTANCE;
        }

        private final void onExtraCallback(Context context, final String str, final String str2, boolean z) throws Exception {
            if (!GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackStub(context)) {
                JSApplicationCausedNativeException.onExtraCallbackWithResult.onExtraCallbackWithResult(context);
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "startService: service unavailable (permission denied)", null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return;
            }
            auth.onNavigationEvent.onWarmupCompleted("USER", "pedometerEnabled", Boolean.TRUE);
            Intent intentPutExtra = new Intent(context, (Class<?>) PedometerService.class).putExtra("extra_from", str).putExtra("extra_from_description", str2).putExtra("extra_skipRefreshingPedometerTerms", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            onExtraCallbackWithResult(this, context, intentPutExtra, new Function0() { // from class: viva.republica.toss.pedometer.PedometerService$Companion$$ExternalSyntheticLambda2
                public final Object invoke() {
                    return PedometerService.onExtraCallbackWithResult.IAuthTabCallback(str, str2);
                }
            }, null, 4, null);
            JavaMethodWrapper.onExtraCallbackWithResult.onExtraCallback(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(String str, String str2) {
            if (Intrinsics.areEqual(str, "ActivityTransitionReceiver")) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "startPedometerService: from ActivityTransitionReceiver, but not allowed (ForegroundServiceStartNotAllowedException)", access8100.onNavigationEvent(getWrite.IAuthTabCallback("fromDescription", str2)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            }
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(@NotNull Context context) throws Exception {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) PedometerService.class).putExtra("extra_newDateStarted", true);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            onExtraCallbackWithResult(this, context, intentPutExtra, null, new PedometerService$Companion$.ExternalSyntheticLambda1(), 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback() {
            return Unit.INSTANCE;
        }

        public final void IAuthTabCallback(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            context.stopService(new Intent(context, (Class<?>) PedometerService.class));
            auth.onNavigationEvent.onWarmupCompleted("USER", "pedometerEnabled", Boolean.FALSE);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "stopService", access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", str)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            createFileLoader.onExtraCallbackWithResult.IAuthTabCallbackDefault();
            JavaMethodWrapper.onExtraCallbackWithResult.onWarmupCompleted(context);
            JSApplicationIllegalArgumentException.onExtraCallbackWithResult.onNavigationEvent(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, Context context, Intent intent, Function0 function0, Function0 function02, int i, Object obj) throws Exception {
            if ((i & 2) != 0) {
                function0 = null;
            }
            if ((i & 4) != 0) {
                function02 = null;
            }
            onextracallbackwithresult.onWarmupCompleted(context, intent, (Function0<Unit>) function0, (Function0<Unit>) function02);
        }

        private final void onWarmupCompleted(Context context, Intent intent, Function0<Unit> function0, Function0<Unit> function02) throws Exception {
            try {
                ContextCompat.startForegroundService(context, intent);
                if (function02 != null) {
                    function02.invoke();
                }
            } catch (Exception e) {
                if (Build.VERSION.SDK_INT < 31 || !TextContextMenuHelperApi28ExternalSyntheticLambda8.onWarmupCompleted(e)) {
                    throw e;
                }
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }

        public final void onExtraCallbackWithResult(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "");
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "GooglePlayServicesVersionInfo", (String) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("versionCode", Integer.valueOf(googleApiAvailability.getApkVersion(context))), getWrite.IAuthTabCallback("isLocalRecordingClientAvailable", zzaz.onExtraCallbackWithResult(googleApiAvailability.isGooglePlayServicesAvailable(context, 241500000) == 0)), getWrite.IAuthTabCallback("model", Build.MODEL)}), (String) null, false, (String) null, 58, (Object) null);
        }
    }

    static {
        boolean z;
        IAuthTabCallback_Parcel();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallback = 8;
        if (Build.VERSION.SDK_INT <= 28) {
            int i = mayLaunchUrl + 73;
            extraCommand = i % 128;
            int i2 = i % 2;
            z = true;
        } else {
            int i3 = mayLaunchUrl + 77;
            extraCommand = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z = false;
        }
        IAuthTabCallback = z;
        int i6 = extraCommand + 77;
        mayLaunchUrl = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r2
      0x0024: PHI (r2v5 float[]) = (r2v4 float[]), (r2v7 float[]) binds: [B:8:0x0022, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object access100(java.lang.Object[] r5) {
        /*
            r0 = 0
            r1 = r5[r0]
            viva.republica.toss.pedometer.PedometerService r1 = (viva.republica.toss.pedometer.PedometerService) r1
            r1 = 1
            r5 = r5[r1]
            android.hardware.SensorEvent r5 = (android.hardware.SensorEvent) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r2 = r2 + 3
            int r3 = r2 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L20
            float[] r2 = r5.values
            r3 = 35
            int r3 = r3 / r0
            if (r2 == 0) goto L32
            goto L24
        L20:
            float[] r2 = r5.values
            if (r2 == 0) goto L32
        L24:
            int r3 = viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult
            int r3 = r3 + 81
            int r4 = r3 % 128
            viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r4
            int r3 = r3 % r1
            java.lang.Float r0 = kotlin.collections.ArraysKt.getOrNull(r2, r0)
            goto L3c
        L32:
            int r0 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r0 = r0 + 37
            int r2 = r0 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r2
            int r0 = r0 % r1
            r0 = 0
        L3c:
            long r1 = r5.timestamp
            int r5 = r5.accuracy
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SensorEvent(value="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", timestamp="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", accuracy="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.access100(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable android.content.Intent r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            super/*android.app.Service*/.onTaskRemoved(r12)
            o.ConvertFloatArrayToByteArray r2 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            if (r12 == 0) goto L30
            int r1 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r1 = r1 + 33
            int r3 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r3
            int r1 = r1 % r0
            android.content.ComponentName r12 = r12.getComponent()
            if (r12 == 0) goto L30
            int r1 = viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable
            int r1 = r1 + 99
            int r3 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult = r3
            int r1 = r1 % r0
            java.lang.String r12 = r12.flattenToShortString()
            int r1 = viva.republica.toss.pedometer.PedometerService.onRelationshipValidationResult
            int r1 = r1 + 93
            int r3 = r1 % 128
            viva.republica.toss.pedometer.PedometerService.isEngagementSignalsApiAvailable = r3
            int r1 = r1 % r0
            goto L31
        L30:
            r12 = 0
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onTaskRemoved "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r3 = "PedometerService"
            java.lang.String r4 = r0.toString()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 60
            r10 = 0
            o.ConvertFloatArrayToByteArray.onExtraCallback(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerService.onTaskRemoved(android.content.Intent):void");
    }

    static final class onExtraCallback {
        private final boolean IAuthTabCallback;
        private final boolean onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult) && this.IAuthTabCallback == onextracallback.IAuthTabCallback && this.onExtraCallback == onextracallback.onExtraCallback && this.onWarmupCompleted == onextracallback.onWarmupCompleted;
        }

        public int hashCode() {
            return (((((this.onExtraCallbackWithResult.hashCode() * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted);
        }

        public String toString() {
            return "RewardInfo(yyyyMMdd=" + this.onExtraCallbackWithResult + ", rewardAvailable=" + this.IAuthTabCallback + ", shieldAvailable=" + this.onExtraCallback + ", achievableStreakCount=" + this.onWarmupCompleted + ")";
        }

        public onExtraCallback(@NotNull String str, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = z;
            this.onExtraCallback = z2;
            this.onWarmupCompleted = i;
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final boolean onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public final boolean onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public final int onWarmupCompleted() {
            return this.onWarmupCompleted;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AlarmManager getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 65;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            AlarmManager alarmManager = (AlarmManager) ContextCompat.getSystemService(applicationContext, AlarmManager.class);
            int i3 = onRelationshipValidationResult + 31;
            isEngagementSignalsApiAvailable = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
            return alarmManager;
        }
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final SensorManager extraCommand(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object systemService = ContextCompat.getSystemService(pedometerService, SensorManager.class);
        Intrinsics.checkNotNull(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        if (i3 == 0) {
            return sensorManager;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final NotificationManager ICustomTabsCallbackDefault(PedometerService pedometerService) {
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 43;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object systemService = ContextCompat.getSystemService(pedometerService, NotificationManager.class);
        Intrinsics.checkNotNull(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (i3 == 0) {
            return notificationManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ClipboardManager onActivityResized(PedometerService pedometerService) {
        ClipboardManager clipboardManager;
        int i = 2 % 2;
        int i2 = isEngagementSignalsApiAvailable + 123;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            clipboardManager = (ClipboardManager) ContextCompat.getSystemService(pedometerService, ClipboardManager.class);
            int i3 = 87 / 0;
        } else {
            clipboardManager = (ClipboardManager) ContextCompat.getSystemService(pedometerService, ClipboardManager.class);
        }
        int i4 = onRelationshipValidationResult + 53;
        isEngagementSignalsApiAvailable = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return clipboardManager;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(ClipboardManager clipboardManager) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 1858710217, new Object[]{clipboardManager}, iIAuthTabCallback2, -1858710211);
    }

    public static /* synthetic */ NumberFormat onNavigationEvent() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (NumberFormat) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1302502391, new Object[0], iIAuthTabCallback2, 1302502403);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1222310417, new Object[]{function1, obj}, iIAuthTabCallback2, 1222310426);
    }

    public static /* synthetic */ SensorManager onExtraCallback(PedometerService pedometerService) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (SensorManager) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -712183234, new Object[]{pedometerService}, iIAuthTabCallback2, 712183254);
    }

    public static /* synthetic */ Unit IAuthTabCallback(PedometerService pedometerService, String str) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Unit) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -688561785, new Object[]{pedometerService, str}, iIAuthTabCallback2, 688561785);
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 407741322, new Object[]{function1, obj}, iIAuthTabCallback2, -407741306);
    }

    public static /* synthetic */ boolean IAuthTabCallbackStub(Function1 function1, Object obj) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return ((Boolean) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -266921177, new Object[]{function1, obj}, iIAuthTabCallback2, 266921188)).booleanValue();
    }

    public static /* synthetic */ PendingIntent asBinder(PedometerService pedometerService) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (PendingIntent) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -326703918, new Object[]{pedometerService}, iIAuthTabCallback2, 326703932);
    }

    public static /* synthetic */ NotificationCompat.access100 onTransact(PedometerService pedometerService) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (NotificationCompat.access100) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 365620194, new Object[]{pedometerService}, iIAuthTabCallback2, -365620173);
    }

    public static final /* synthetic */ SensorManager ICustomTabsCallback(PedometerService pedometerService) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (SensorManager) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 279398089, new Object[]{pedometerService}, iIAuthTabCallback2, -279398074);
    }

    public static final /* synthetic */ void onMessageChannelReady(PedometerService pedometerService) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 714132209, new Object[]{pedometerService}, iIAuthTabCallback2, -714132208);
    }

    public static final /* synthetic */ void onExtraCallback(PedometerService pedometerService, getStringValueByKey getstringvaluebykey) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1862594660, new Object[]{pedometerService, getstringvaluebykey}, iIAuthTabCallback2, 1862594667);
    }

    private final ClipboardManager ICustomTabsCallback() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iOnWarmupCompleted = Converter.1.onWarmupCompleted();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (ClipboardManager) onWarmupCompleted(iIAuthTabCallback, Converter.1.onWarmupCompleted(), iIAuthTabCallback2, 1405606621, new Object[]{this}, iOnWarmupCompleted, -1405606603);
    }

    private final Calendar extraCallback() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Calendar) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1234123773, new Object[]{this}, iIAuthTabCallback2, 1234123790);
    }

    private final PendingIntent onMinimized() {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (PendingIntent) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 865441486, new Object[]{this}, iIAuthTabCallback2, -865441483);
    }

    private static final Unit onExtraCallback(PedometerService pedometerService, Unit unit) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Unit) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -2036253375, new Object[]{pedometerService, unit}, iIAuthTabCallback2, 2036253379);
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1210999087, new Object[]{function1, obj}, iIAuthTabCallback2, 1210999095);
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 1993630397, new Object[]{function1, obj}, iIAuthTabCallback2, -1993630395);
    }

    private static final String onWarmupCompleted(ClipData clipData) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (String) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -1559023361, new Object[]{clipData}, iIAuthTabCallback2, 1559023366);
    }

    private final void onWarmupCompleted(Integer num, Calendar calendar) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, -624508216, new Object[]{this, num, calendar}, iIAuthTabCallback2, 624508229);
    }

    private final getPackageType onExtraCallback(int i, Calendar calendar) {
        Object[] objArr = {this, Integer.valueOf(i), calendar};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (getPackageType) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 1307673173, objArr, iIAuthTabCallback2, -1307673154);
    }

    private final String onNavigationEvent(SensorEvent sensorEvent) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (String) onWarmupCompleted(iIAuthTabCallback, zziea.IAuthTabCallback(), iIAuthTabCallback3, 1744953032, new Object[]{this, sensorEvent}, iIAuthTabCallback2, -1744953022);
    }

    @Override // o.DynamicFromObject
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 69;
        isEngagementSignalsApiAvailable = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = isEngagementSignalsApiAvailable + 95;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback_Parcel() {
        ICustomTabsCallbackStub = -123002697736680373L;
    }
}
