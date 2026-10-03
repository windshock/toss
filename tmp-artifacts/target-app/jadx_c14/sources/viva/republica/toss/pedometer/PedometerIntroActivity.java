package viva.republica.toss.pedometer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_Issue_GenmGenp;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp1;
import o.GuardedAsyncTask;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.JSInstance;
import o.PlayerErrorCode;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.createFileLoader;
import o.doInBackgroundGuarded;
import o.findResAndMsg;
import o.getPackageType;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onPageExit;
import o.setAdUnitIds;
import o.setRandomHost;
import viva.republica.toss.R;
import viva.republica.toss.network.model.pedometer.PedometerInfo;
import viva.republica.toss.pedometer.PedometerIntroActivity;
import viva.republica.toss.pedometer.PedometerIntroActivity$;
import viva.republica.toss.pedometer.PedometerService;
import viva.republica.toss.pedometer.main.PedometerNotificationSettingActivity;
import viva.republica.toss.pedometer.main.PedometerPermissionGuideActivity;
import viva.republica.toss.pedometer.main.PedometerRestartGuideActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PedometerIntroActivity extends Hilt_PedometerIntroActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 1;
    private static long access000 = 0;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onTransact;
    private PedometerInfo asInterface;

    @Inject
    public setAdUnitIds loginStatus;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.pedometer.PedometerIntroActivity$$ExternalSyntheticLambda5
        public final Object invoke() {
            return PedometerIntroActivity.onWarmupCompleted(this.f$0);
        }
    });
    private final boolean asBinder = GuardedAsyncTask.IAuthTabCallback.onTransact();
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.pedometer.PedometerIntroActivity$$ExternalSyntheticLambda6
        public final Object invoke(Object obj) {
            return PedometerIntroActivity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static {
        setEngagementSignalsCallback();
        Companion = new onExtraCallbackWithResult(null);
        onTransact = 8;
        int i = access100 + 123;
        ICustomTabsCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PedometerIntroActivity pedometerIntroActivity = (PedometerIntroActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pedometerIntroActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PedometerIntroActivity pedometerIntroActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(pedometerIntroActivity);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(pedometerIntroActivity);
        int i3 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PedometerIntroActivity pedometerIntroActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(pedometerIntroActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        int i5 = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i | i3)) | (~(i5 | i3));
        int i10 = ~i5;
        int i11 = (~(i10 | i3)) | i;
        int i12 = (~(i3 | i | i5)) | (~(i8 | i10));
        int i13 = i + i5 + i6 + ((-373584967) * i2) + ((-1711780345) * i4);
        int i14 = i13 * i13;
        int i15 = (i * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i6) + ((-375259136) * i2) + ((-1109524480) * i4) + (585564160 * i14);
        int i16 = ((i * 235012993) - 778813113) + (i5 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i6 * 235013625) + (i2 * 915899377) + (i4 * (-1709701169)) + (i14 * 1974403072);
        int i17 = i15 + (i16 * i16 * (-848756736));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? IAuthTabCallback(objArr) : IAuthTabCallbackDefault(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(PedometerIntroActivity pedometerIntroActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            return (Unit) onExtraCallback(293527118, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -293527116, iOnExtraCallback2, new Object[]{pedometerIntroActivity, commonModule_setLeftEdgeTouchEnabled});
        }
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            return (Unit) onExtraCallback(1491909630, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1491909625, iOnExtraCallback2, new Object[]{setDetectableSize});
        }
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int i3 = 85 / 0;
        return (Unit) onExtraCallback(1491909630, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1491909625, iOnExtraCallback4, new Object[]{setDetectableSize});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PedometerIntroActivity pedometerIntroActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pedometerIntroActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ String onWarmupCompleted(PedometerIntroActivity pedometerIntroActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return asBinder(pedometerIntroActivity);
        }
        asBinder(pedometerIntroActivity);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PedometerIntroActivity pedometerIntroActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(pedometerIntroActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements Function0<CMP_Issue_GenmGenp> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onWarmupCompleted(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CMP_Issue_GenmGenp invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Issue_GenmGenp.onExtraCallback(layoutInflater);
        }
    }

    public static final /* synthetic */ void onExtraCallback(PedometerIntroActivity pedometerIntroActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {pedometerIntroActivity};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        if (i3 != 0) {
            onExtraCallback(-1669580201, iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback4, 1669580205, iOnExtraCallback2, objArr);
            obj.hashCode();
            throw null;
        }
        onExtraCallback(-1669580201, iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback4, 1669580205, iOnExtraCallback2, objArr);
        int i4 = IAuthTabCallbackStubProxy + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(PedometerIntroActivity pedometerIntroActivity, PedometerInfo pedometerInfo) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        pedometerIntroActivity.asInterface = pedometerInfo;
        int i5 = i3 + 115;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ ProgressBar onExtraCallbackWithResult(PedometerIntroActivity pedometerIntroActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBarUpdateVisuals = pedometerIntroActivity.updateVisuals();
        int i4 = getInterfaceDescriptor + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return progressBarUpdateVisuals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onNavigationEvent(PedometerIntroActivity pedometerIntroActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStub = pedometerIntroActivity.ICustomTabsServiceStub();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return strICustomTabsServiceStub;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 11;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    public final setAdUnitIds IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 47;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        setAdUnitIds setadunitids = this.loginStatus;
        Object obj = null;
        if (setadunitids == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 25;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return setadunitids;
        }
        obj.hashCode();
        throw null;
    }

    private final CMP_Issue_GenmGenp validateRelationship() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.IAuthTabCallbackDefault.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (CMP_Issue_GenmGenp) value;
        }
        Object value2 = this.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        int i3 = 47 / 0;
        return (CMP_Issue_GenmGenp) value2;
    }

    private final String ICustomTabsServiceStub() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            str = (String) this.IAuthTabCallback_Parcel.getValue();
            int i3 = 70 / 0;
        } else {
            str = (String) this.IAuthTabCallback_Parcel.getValue();
        }
        int i4 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final ProgressBar updateVisuals() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBar = validateRelationship().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(progressBar, "");
        int i4 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return progressBar;
    }

    private static final Unit onWarmupCompleted(PedometerIntroActivity pedometerIntroActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        boolean z;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = getInterfaceDescriptor + 71;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            int i6 = IAuthTabCallbackStubProxy + 35;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        pedometerIntroActivity.onWarmupCompleted(z);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access000 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 57;
        $11 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                return;
            }
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(access000)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.getMode(0)), 85 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 14185), 19 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $11 + 125;
                $10 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    private static final Unit onWarmupCompleted(PedometerIntroActivity pedometerIntroActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            pedometerIntroActivity.finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        pedometerIntroActivity.finish();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.pedometer.PedometerIntroActivity] */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final ?? r1 = (PedometerIntroActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(r1.getString(R.string.teens_age_block_service_info_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(r1.getString(R.string.teens_age_block_service_info_message, PlayerErrorCode.onPostMessage()));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.pedometer.PedometerIntroActivity$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                Object[] objArr3 = {this.f$0, (DialogInterface) obj};
                return (Unit) PedometerIntroActivity.onExtraCallback(-341162097, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 341162097, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr3);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r10
      0x003b: PHI (r10v4 o.IPostMessageServiceStubProxy) = (r10v3 o.IPostMessageServiceStubProxy), (r10v26 o.IPostMessageServiceStubProxy) binds: [B:8:0x0039, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // viva.republica.toss.pedometer.Hilt_PedometerIntroActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy
            int r1 = r1 + 39
            int r2 = r1 % 128
            viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L27
            super.onCreate(r10)
            o.CMP_Issue_GenmGenp r10 = r9.validateRelationship()
            androidx.constraintlayout.widget.ConstraintLayout r10 = r10.getRoot()
            r9.setContentView(r10)
            o.IPostMessageServiceStubProxy r10 = r9.getSupportActionBar()
            r1 = 19
            int r1 = r1 / 0
            if (r10 == 0) goto L3f
            goto L3b
        L27:
            super.onCreate(r10)
            o.CMP_Issue_GenmGenp r10 = r9.validateRelationship()
            androidx.constraintlayout.widget.ConstraintLayout r10 = r10.getRoot()
            r9.setContentView(r10)
            o.IPostMessageServiceStubProxy r10 = r9.getSupportActionBar()
            if (r10 == 0) goto L3f
        L3b:
            r1 = 1
            r10.onNavigationEvent(r1)
        L3f:
            o.setAdUnitIds r10 = r9.IAuthTabCallback()
            boolean r10 = r10.IAuthTabCallback()
            if (r10 != 0) goto L54
            viva.republica.toss.pedometer.PedometerService$onExtraCallbackWithResult r10 = viva.republica.toss.pedometer.PedometerService.Companion
            java.lang.String r0 = "PedometerIntroActivity::notLoggedIn"
            r10.IAuthTabCallback(r9, r0)
            r9.finish()
            return
        L54:
            o.GuardedAsyncTask r10 = o.GuardedAsyncTask.IAuthTabCallback
            java.lang.Object[] r6 = new java.lang.Object[]{r10, r9}
            int r1 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r4 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r5 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            int r3 = com.google.android.gms.internal.ads.zzgsa.onWarmupCompleted()
            r2 = -1941814049(0xffffffff8c4244df, float:-1.4965942E-31)
            r7 = 1941814058(0x73bdbb2a, float:3.0064094E31)
            java.lang.Object r10 = o.GuardedAsyncTask.onExtraCallback(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r1 = 22
            if (r10 != 0) goto L93
            int r10 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy
            int r10 = r10 + 75
            int r2 = r10 % 128
            viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r2
            int r10 = r10 % r0
            if (r10 != 0) goto L8f
            r9.IEngagementSignalsCallback()
            int r1 = r1 / 0
            return
        L8f:
            r9.IEngagementSignalsCallback()
            return
        L93:
            o.PlayerErrorCode r10 = o.PlayerErrorCode.onWarmupCompleted
            boolean r10 = o.addExtra.writeTypedObject(r10)
            r2 = 0
            if (r10 == 0) goto Lb1
            viva.republica.toss.pedometer.PedometerIntroActivity$$ExternalSyntheticLambda2 r10 = new viva.republica.toss.pedometer.PedometerIntroActivity$$ExternalSyntheticLambda2
            r10.<init>(r9)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r9, r10)
            int r10 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy
            int r10 = r10 + 23
            int r1 = r10 % 128
            viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r1
            int r10 = r10 % r0
            if (r10 == 0) goto Lb0
            return
        Lb0:
            throw r2
        Lb1:
            o.TextFieldPressGestureFilterKtExternalSyntheticLambda0 r3 = o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r9)
            r4 = 0
            r5 = 0
            viva.republica.toss.pedometer.PedometerIntroActivity$onNavigationEvent r6 = new viva.republica.toss.pedometer.PedometerIntroActivity$onNavigationEvent
            r6.<init>(r9, r2)
            r7 = 3
            r8 = 0
            o.maybeUpdateAnimatable.onNavigationEvent(r3, r4, r5, r6, r7, r8)
            int r10 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy
            int r10 = r10 + 77
            int r2 = r10 % 128
            viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r2
            int r10 = r10 % r0
            if (r10 != 0) goto Lce
            int r1 = r1 / 0
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerIntroActivity.onCreate(android.os.Bundle):void");
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;
        private static final byte[] $$a = {34, -66, 77, 18};
        private static final int $$b = 29;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private static long onExtraCallbackWithResult = 7798559133331975163L;
        private static int onExtraCallback = -430914964;
        private static char IAuthTabCallback = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, byte r8, int r9) {
            /*
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r0 = viva.republica.toss.pedometer.PedometerIntroActivity.onExtraCallback.$$a
                int r8 = r8 + 109
                int r9 = r9 * 4
                int r9 = r9 + 1
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerIntroActivity.onExtraCallback.$$c(int, byte, int):java.lang.String");
        }

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit IAuthTabCallback(String str, int i, Throwable th) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(str, i, th);
            int i5 = onNavigationEvent + 27;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = PedometerIntroActivity.this.new onExtraCallback(access13800Var);
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i6 = $11 + 117;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), TextUtils.lastIndexOf("", '0', 0) + 44, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, 1494 - KeyEvent.normalizeMetaState(0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.indexOf((CharSequence) "", '0', 0)), 51 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, 12577 - ((Process.getThreadPriority(0) + 20) >> 6), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
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

        private static final Unit onNavigationEvent(String str, int i, Throwable th) throws Throwable {
            int i2 = 2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("stepCount", Integer.valueOf(((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{GuardedAsyncTask.IAuthTabCallback, null, 1, null}, -339510300)).intValue()));
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("syncReq", str + ":" + i);
            Object[] objArr = new Object[1];
            a((char) (View.resolveSizeAndState(0, 0, 0) + 59423), KeyEvent.getMaxKeyCode() >> 16, new char[]{8504, 13414, 30312, 32820, 15964, 44773}, new char[]{0, 0, 0, 0}, new char[]{58591, 16742, 8144, 34280}, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "pedometer_debug", "failed_sync_intro", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), th.getLocalizedMessage())}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            final int iIntValue;
            final String str;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                int i4 = onNavigationEvent + 71;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iIntValue = this.I$0;
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
                if (!guardedAsyncTask.IAuthTabCallbackDefault((Context) PedometerIntroActivity.this)) {
                    Unit unit = Unit.INSTANCE;
                    int i6 = onNavigationEvent + 57;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 75 / 0;
                    }
                    return unit;
                }
                int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
                int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
                int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
                iIntValue = ((Integer) GuardedAsyncTask.onExtraCallback(iOnWarmupCompleted, 339510305, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted3, new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue();
                String strOnExtraCallback = GuardedAsyncTask.onExtraCallback(guardedAsyncTask, null, 1, null);
                GeckoHubImp1 geckoHubImp1OnExtraCallbackWithResult = createFileLoader.onExtraCallbackWithResult(createFileLoader.onExtraCallbackWithResult, (Context) PedometerIntroActivity.this, iIntValue, strOnExtraCallback, (JSInstance) null, 8, (Object) null);
                this.L$0 = strOnExtraCallback;
                this.I$0 = iIntValue;
                this.label = 1;
                Object objIAuthTabCallback = geckoHubImp1OnExtraCallbackWithResult.IAuthTabCallback(this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                str = strOnExtraCallback;
                obj = objIAuthTabCallback;
            }
            final Throwable th = Result.exceptionOrNull-impl(((Result) obj).onNavigationEvent());
            if (th != null) {
                doInBackgroundGuarded.onWarmupCompleted.onNavigationEvent("failed_sync_intro", new Function0() { // from class: viva.republica.toss.pedometer.PedometerIntroActivity$syncStepCountAsync$1$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return PedometerIntroActivity.onExtraCallback.IAuthTabCallback(str, iIntValue, th);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackStub(PedometerIntroActivity pedometerIntroActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i2 % 128;
        onJsBridgeReady.onNavigationEvent(pedometerIntroActivity, i2 % 2 == 0 ? pedometerIntroActivity.getString(R.string.app_pedometer___50a52a1401) : pedometerIntroActivity.getString(R.string.app_pedometer___50a52a1401), 0, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [android.content.Context, java.lang.Object, viva.republica.toss.pedometer.PedometerIntroActivity] */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Exception {
        final ?? r15 = (PedometerIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        if (((Boolean) onExtraCallback(374540489, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -374540486, iOnExtraCallback2, new Object[]{r15})).booleanValue()) {
            int i4 = getInterfaceDescriptor + 75;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (((PedometerIntroActivity) r15).asBinder) {
            int i5 = getInterfaceDescriptor + 1;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
            guardedAsyncTask.IAuthTabCallback_Parcel();
            if (!guardedAsyncTask.IAuthTabCallbackDefault()) {
                GuardedAsyncTask.IAuthTabCallback(guardedAsyncTask, r15, null, new Function0() { // from class: viva.republica.toss.pedometer.PedometerIntroActivity$$ExternalSyntheticLambda4
                    public final Object invoke() {
                        return PedometerIntroActivity.IAuthTabCallback(this.f$0);
                    }
                }, 2, null);
            }
        }
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(1391192808, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1391192807, iOnExtraCallback4, new Object[]{r15});
        int i7 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.pedometer.PedometerIntroActivity] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Exception {
        ?? r1 = (PedometerIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        if (!(!guardedAsyncTask.IAuthTabCallbackDefault((Context) r1))) {
            PedometerService.onExtraCallbackWithResult.onWarmupCompleted(PedometerService.Companion, r1, "PedometerIntroActivity", null, false, 12, null);
            r1.access200();
            return null;
        }
        r1.access200();
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "PedometerIntroActivity: pedometer is not available", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("isPedometerActivationRequested", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback("isPedometerNotificationEnabled", Boolean.valueOf(guardedAsyncTask.asInterface((Context) r1))), getWrite.IAuthTabCallback("wasMandatoryTermsAgreed", Boolean.valueOf(((Boolean) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), -2096237238, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask}, 2096237241)).booleanValue())), getWrite.IAuthTabCallback("isPermissionGranted", Boolean.valueOf(guardedAsyncTask.IAuthTabCallbackStub((Context) r1)))}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        int i4 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05a3  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.app.Activity, im.toss.base.BaseActivity, viva.republica.toss.pedometer.PedometerIntroActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void access200() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerIntroActivity.access200():void");
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 79;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            onExtraCallback(-1669580201, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1669580205, iOnExtraCallback2, new Object[]{this});
            return;
        }
        finish();
        int i3 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new PedometerIntroActivity$.ExternalSyntheticLambda1(this));
        int i2 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2005903668);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11423 - KeyEvent.normalizeMetaState(0)), 30 - Gravity.getAbsoluteGravity(0, 0), 24858 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1187993508, false, "onExtraCallbackWithResult", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1884379750);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (11422 - ImageFormat.getBitsPerPixel(0)), TextUtils.lastIndexOf("", '0', 0) + 31, View.combineMeasuredStates(0, 0) + 24857, -1091675382, false, "onWarmupCompleted", new Class[0]);
                }
                mapOnExtraCallback.put("device", ((Method) objOnExtraCallback2).invoke(obj2, null));
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2005903668);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 11423), 30 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0) + 24858, -1187993508, false, "onExtraCallbackWithResult", (Class[]) null);
            }
            Object obj3 = ((Field) objOnExtraCallback3).get(null);
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1884379750);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11423), 30 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionChild(0L) + 24858, -1091675382, false, "onWarmupCompleted", new Class[0]);
            }
            mapOnExtraCallback2.put("device", ((Method) objOnExtraCallback4).invoke(obj3, null));
            Unit unit2 = Unit.INSTANCE;
            int i3 = getInterfaceDescriptor + 31;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
            }
            return unit2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final Unit onExtraCallbackWithResult(PedometerIntroActivity pedometerIntroActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted("no_step_counter", false, (String) null, (List) null, (Map) null, new PedometerIntroActivity$.ExternalSyntheticLambda0(), 30, (Object) null);
        pedometerIntroActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PedometerIntroActivity pedometerIntroActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(pedometerIntroActivity.getString(R.string.app_pedometer___21ca198a54));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new PedometerIntroActivity$.ExternalSyntheticLambda3(pedometerIntroActivity))};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final getPackageType ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return getpackagetypeOnNavigationEvent;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.app.Activity, android.content.Context, viva.republica.toss.pedometer.PedometerIntroActivity] */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        ?? r9 = (PedometerIntroActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
        if (!guardedAsyncTask.asInterface((Context) r9)) {
            ((PedometerIntroActivity) r9).IAuthTabCallbackStub.onNavigationEvent(new Intent((Context) r9, (Class<?>) PedometerNotificationSettingActivity.class));
            r9.overridePendingTransition(0, 0);
            return true;
        }
        boolean zIAuthTabCallbackStub = guardedAsyncTask.IAuthTabCallbackStub((Context) r9);
        boolean zIAuthTabCallbackDefault = guardedAsyncTask.IAuthTabCallbackDefault();
        boolean z = ((PedometerIntroActivity) r9).asBinder;
        if (z) {
            int i4 = IAuthTabCallbackStubProxy + 119;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (zIAuthTabCallbackStub) {
                return false;
            }
        }
        if (!z) {
            int i6 = getInterfaceDescriptor + 27;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (!zIAuthTabCallbackDefault) {
                ((PedometerIntroActivity) r9).IAuthTabCallbackStub.onNavigationEvent(new Intent((Context) r9, (Class<?>) PedometerRestartGuideActivity.class));
                r9.overridePendingTransition(0, 0);
                return true;
            }
        }
        if (zIAuthTabCallbackStub) {
            return false;
        }
        ((PedometerIntroActivity) r9).IAuthTabCallbackStub.onNavigationEvent(new Intent((Context) r9, (Class<?>) PedometerPermissionGuideActivity.class));
        r9.overridePendingTransition(0, 0);
        int i8 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ef, code lost:
    
        r6 = viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor + 9;
        viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02f8, code lost:
    
        if ((r6 % 2) != 0) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fa, code lost:
    
        r3.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fe, code lost:
    
        r3.add(r5);
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0304, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0305, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, 10));
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0316, code lost:
    
        if (r2.hasNext() == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0318, code lost:
    
        r3 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy + 99;
        viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r3 % 128;
        r3 = r3 % 2;
        r13.add(java.lang.Double.valueOf(java.lang.Double.parseDouble(kotlin.text.StringsKt.trim((java.lang.String) r2.next()).toString())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x033b, code lost:
    
        r7 = r13.toArray(new java.lang.Double[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x034b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Short[].class) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x034d, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r0 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0368, code lost:
    
        if (r13.hasNext() == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x036a, code lost:
    
        r3 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0375, code lost:
    
        if (((java.lang.String) r3).length() <= 0) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0377, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x037b, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x038d, code lost:
    
        if ((!r0.hasNext()) == true) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x038f, code lost:
    
        r13.add(java.lang.Short.valueOf(java.lang.Short.parseShort(kotlin.text.StringsKt.trim((java.lang.String) r0.next()).toString())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03a9, code lost:
    
        r7 = r13.toArray(new java.lang.Short[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Byte[].class) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03bb, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r0 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03d6, code lost:
    
        if (r13.hasNext() == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d8, code lost:
    
        r3 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03e3, code lost:
    
        if (((java.lang.String) r3).length() <= 0) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03e5, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e9, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03fa, code lost:
    
        if (r0.hasNext() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03fc, code lost:
    
        r13.add(java.lang.Byte.valueOf(java.lang.Byte.parseByte(kotlin.text.StringsKt.trim((java.lang.String) r0.next()).toString())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0416, code lost:
    
        r7 = r13.toArray(new java.lang.Byte[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0426, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Boolean[].class) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0428, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r0 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0443, code lost:
    
        if (r13.hasNext() == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0445, code lost:
    
        r3 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0450, code lost:
    
        if (((java.lang.String) r3).length() <= 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0452, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0456, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0467, code lost:
    
        if (r0.hasNext() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0469, code lost:
    
        r13.add(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(kotlin.text.StringsKt.trim((java.lang.String) r0.next()).toString())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0483, code lost:
    
        r7 = r13.toArray(new java.lang.Boolean[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0493, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Character[].class) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0495, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r0 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04b0, code lost:
    
        if (r13.hasNext() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04b2, code lost:
    
        r3 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04bd, code lost:
    
        if (((java.lang.String) r3).length() <= 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04bf, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04c3, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, 10));
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04d4, code lost:
    
        if (r0.hasNext() == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (r13 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04d6, code lost:
    
        r13.add(java.lang.Character.valueOf(kotlin.text.StringsKt.trim((java.lang.String) r0.next()).toString().charAt(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04f0, code lost:
    
        r7 = r13.toArray(new java.lang.Character[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0500, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.String[].class) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0502, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r0 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x051d, code lost:
    
        if (r13.hasNext() == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x051f, code lost:
    
        r2 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x052a, code lost:
    
        if (((java.lang.String) r2).length() <= 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x052c, code lost:
    
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0530, code lost:
    
        r7 = r0.toArray(new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0538, code lost:
    
        r13 = java.lang.String.class.getEnumConstants();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x053e, code lost:
    
        if (r13 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0540, code lost:
    
        r2 = new java.util.ArrayList(r13.length);
        r3 = r13.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0547, code lost:
    
        if (r4 >= r3) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0549, code lost:
    
        r5 = r13[r4];
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5, "");
        r2.add((java.lang.Enum) r5);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0558, code lost:
    
        r13 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0560, code lost:
    
        if (r13.hasNext() == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0562, code lost:
    
        r2 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0571, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.Enum) r2).name(), (java.lang.Object) r7) == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0573, code lost:
    
        r13 = viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor + 81;
        viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x057d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x057e, code lost:
    
        r7 = (java.lang.Enum) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0582, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0583, code lost:
    
        if (r7 != 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x058d, code lost:
    
        if (o.zzaj.onNavigationEvent().onActivityLayout() != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x058f, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05ad, code lost:
    
        throw new java.lang.IllegalArgumentException(java.lang.String.class.getSimpleName() + " is not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x05ae, code lost:
    
        r7 = kotlin.text.StringsKt.toLongOrNull((java.lang.String) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05b4, code lost:
    
        if ((r7 instanceof java.lang.String) != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05b7, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05ba, code lost:
    
        return (java.lang.String) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r13 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Integer.class) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        r7 = kotlin.text.StringsKt.toIntOrNull((java.lang.String) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Long.class)) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Float.class) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        r7 = kotlin.text.StringsKt.toFloatOrNull((java.lang.String) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Double.class) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        r7 = kotlin.text.StringsKt.toDoubleOrNull((java.lang.String) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Short.class) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        r7 = kotlin.text.StringsKt.toShortOrNull((java.lang.String) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Byte.class) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        r13 = viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor + 43;
        viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy = r13 % 128;
        r13 = r13 % 2;
        r7 = kotlin.text.StringsKt.toByteOrNull((java.lang.String) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Boolean.class) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        r7 = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Character.class) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        r7 = java.lang.Character.valueOf(r7.charAt(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.String.class) != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Integer[].class) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r3 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014a, code lost:
    
        if (r13.hasNext() == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014c, code lost:
    
        r5 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0157, code lost:
    
        if (((java.lang.String) r5).length() <= 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0159, code lost:
    
        r3.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, 10));
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016e, code lost:
    
        if (r2.hasNext() == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0170, code lost:
    
        r3 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy + 3;
        viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0179, code lost:
    
        if ((r3 % 2) == 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017b, code lost:
    
        r13.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(kotlin.text.StringsKt.trim((java.lang.String) r2.next()).toString())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0195, code lost:
    
        r13.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(kotlin.text.StringsKt.trim((java.lang.String) r2.next()).toString())));
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b2, code lost:
    
        r7 = r13.toArray(new java.lang.Integer[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Long[].class) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c4, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r3 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01df, code lost:
    
        if (r13.hasNext() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e1, code lost:
    
        r5 = viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor + 29;
        viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ea, code lost:
    
        if ((r5 % 2) != 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ec, code lost:
    
        r5 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f7, code lost:
    
        if (((java.lang.String) r5).length() <= 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f9, code lost:
    
        r3.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fd, code lost:
    
        ((java.lang.String) r13.next()).length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0206, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0207, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, 10));
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0218, code lost:
    
        if (r2.hasNext() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021a, code lost:
    
        r3 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy + 75;
        viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r3 % 128;
        r3 = r3 % 2;
        r13.add(java.lang.Long.valueOf(java.lang.Long.parseLong(kotlin.text.StringsKt.trim((java.lang.String) r2.next()).toString())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x023d, code lost:
    
        r7 = r13.toArray(new java.lang.Long[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Float[].class) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x024f, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r3 = new java.util.ArrayList();
        r13 = r13.iterator();
        r5 = viva.republica.toss.pedometer.PedometerIntroActivity.IAuthTabCallbackStubProxy + 105;
        viva.republica.toss.pedometer.PedometerIntroActivity.getInterfaceDescriptor = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0273, code lost:
    
        if (r13.hasNext() == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0275, code lost:
    
        r0 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0280, code lost:
    
        if (((java.lang.String) r0).length() <= 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0282, code lost:
    
        r3.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0286, code lost:
    
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, 10));
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0297, code lost:
    
        if (r0.hasNext() == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0299, code lost:
    
        r13.add(java.lang.Float.valueOf(java.lang.Float.parseFloat(kotlin.text.StringsKt.trim((java.lang.String) r0.next()).toString())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b3, code lost:
    
        r7 = r13.toArray(new java.lang.Float[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02c3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.class, java.lang.Double[].class) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02c5, code lost:
    
        r13 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r7, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        r3 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e0, code lost:
    
        if (r13.hasNext() == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02e2, code lost:
    
        r5 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ed, code lost:
    
        if (((java.lang.String) r5).length() <= 0) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, viva.republica.toss.pedometer.PedometerIntroActivity] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String asBinder(viva.republica.toss.pedometer.PedometerIntroActivity r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.PedometerIntroActivity.asBinder(viva.republica.toss.pedometer.PedometerIntroActivity):java.lang.String");
    }

    public static /* synthetic */ Unit onNavigationEvent(PedometerIntroActivity pedometerIntroActivity, DialogInterface dialogInterface) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(-341162097, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 341162097, iOnExtraCallback2, new Object[]{pedometerIntroActivity, dialogInterface});
    }

    private static final Unit onExtraCallbackWithResult(PedometerIntroActivity pedometerIntroActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(293527118, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -293527116, iOnExtraCallback2, new Object[]{pedometerIntroActivity, commonModule_setLeftEdgeTouchEnabled});
    }

    private final void ICustomTabsServiceDefault() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(-1669580201, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1669580205, iOnExtraCallback2, new Object[]{this});
    }

    private final void writeTypedList() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(1391192808, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1391192807, iOnExtraCallback2, new Object[]{this});
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(1491909630, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1491909625, iOnExtraCallback2, new Object[]{setDetectableSize});
    }

    private final boolean ICustomTabsService_Parcel() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) onExtraCallback(374540489, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -374540486, iOnExtraCallback2, new Object[]{this})).booleanValue();
    }

    @Override // viva.republica.toss.pedometer.Hilt_PedometerIntroActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.pedometer.Hilt_PedometerIntroActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.pedometer.Hilt_PedometerIntroActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 37;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.pedometer.Hilt_PedometerIntroActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
    }

    static void setEngagementSignalsCallback() {
        access000 = -6867276810185717004L;
    }
}
