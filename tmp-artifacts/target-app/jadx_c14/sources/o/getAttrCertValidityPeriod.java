package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseActivity;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.getAttrCertValidityPeriod;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAttrCertValidityPeriod {
    private static LocationListener onNavigationEvent;
    public static final getAttrCertValidityPeriod onWarmupCompleted = new getAttrCertValidityPeriod();
    public static final int IAuthTabCallback = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getAttrCertValidityPeriod.this.onNavigationEvent((LocationManager) null, (access13800<? super Location>) this);
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
            return getAttrCertValidityPeriod.this.onExtraCallbackWithResult((access13800<? super Boolean>) this);
        }
    }

    private getAttrCertValidityPeriod() {
    }

    public final void onNavigationEvent(@NotNull Context context, boolean z, @NotNull Function2<? super Double, ? super Double, Unit> function2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!getLastTrimMemoryLevel.Companion.onNavigationEvent().onWarmupCompleted()) {
            function0.invoke();
            return;
        }
        onExtraCallbackWithResult(context);
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "");
        LocationManager locationManager = (LocationManager) systemService;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        String bestProvider = locationManager.getBestProvider(criteria, true);
        if (bestProvider != null) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(function2, function0, context);
            onNavigationEvent = onwarmupcompleted;
            if (z) {
                Intrinsics.checkNotNull(onwarmupcompleted);
                locationManager.requestSingleUpdate(bestProvider, onwarmupcompleted, Looper.getMainLooper());
                return;
            } else {
                Intrinsics.checkNotNull(onwarmupcompleted);
                locationManager.requestLocationUpdates(bestProvider, 200L, 5.0f, onwarmupcompleted, Looper.getMainLooper());
                return;
            }
        }
        function0.invoke();
    }

    public static final class onWarmupCompleted implements LocationListener {
        final /* synthetic */ Context IAuthTabCallback;
        final /* synthetic */ Function2<Double, Double, Unit> onExtraCallback;
        final /* synthetic */ Function0<Unit> onWarmupCompleted;

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Function2<? super Double, ? super Double, Unit> function2, Function0<Unit> function0, Context context) {
            this.onExtraCallback = function2;
            this.onWarmupCompleted = function0;
            this.IAuthTabCallback = context;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "");
            this.onExtraCallback.invoke(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted.invoke();
            getAttrCertValidityPeriod.onWarmupCompleted.onExtraCallbackWithResult(this.IAuthTabCallback);
        }
    }

    static final class onExtraCallbackWithResult implements Function0<Unit> {
        final /* synthetic */ access13800<Pair<Double, Double>> IAuthTabCallback;

        onExtraCallbackWithResult(access13800<? super Pair<Double, Double>> access13800Var) {
            this.IAuthTabCallback = access13800Var;
        }

        public /* synthetic */ Object invoke() {
            onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult() {
            access13800<Pair<Double, Double>> access13800Var = this.IAuthTabCallback;
            Result.Companion companion = Result.Companion;
            access13800Var.resumeWith(Result.constructor-impl((Object) null));
        }
    }

    static final class onNavigationEvent implements Function2<Double, Double, Unit> {
        final /* synthetic */ access13800<Pair<Double, Double>> onExtraCallbackWithResult;

        onNavigationEvent(access13800<? super Pair<Double, Double>> access13800Var) {
            this.onExtraCallbackWithResult = access13800Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            onWarmupCompleted(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(double d, double d2) {
            access13800<Pair<Double, Double>> access13800Var = this.onExtraCallbackWithResult;
            Result.Companion companion = Result.Companion;
            access13800Var.resumeWith(Result.constructor-impl(new Pair(Double.valueOf(d), Double.valueOf(d2))));
        }
    }

    public final Object onExtraCallback(@NotNull Context context, @NotNull access13800<? super Pair<Double, Double>> access13800Var) {
        TombstoneProtosThread tombstoneProtosThread = new TombstoneProtosThread(access14300.onWarmupCompleted(access13800Var));
        onWarmupCompleted.onNavigationEvent(context, true, (Function2<? super Double, ? super Double, Unit>) new onNavigationEvent(tombstoneProtosThread), (Function0<Unit>) new onExtraCallbackWithResult(tombstoneProtosThread));
        Object objOnNavigationEvent = tombstoneProtosThread.onNavigationEvent();
        if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnNavigationEvent;
    }

    public final void onExtraCallbackWithResult(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "");
        LocationManager locationManager = (LocationManager) systemService;
        LocationListener locationListener = onNavigationEvent;
        if (locationListener != null) {
            locationManager.removeUpdates(locationListener);
        }
        onNavigationEvent = null;
    }

    private final Location onExtraCallback(LocationManager locationManager) {
        if (!getLastTrimMemoryLevel.Companion.onNavigationEvent().onWarmupCompleted()) {
            return null;
        }
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        String bestProvider = locationManager.getBestProvider(criteria, true);
        if (bestProvider == null) {
            return null;
        }
        try {
            return locationManager.getLastKnownLocation(bestProvider);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.getAttrCertValidityPeriod.onExtraCallback
            if (r0 == 0) goto L13
            r0 = r8
            o.getAttrCertValidityPeriod$onExtraCallback r0 = (o.getAttrCertValidityPeriod.onExtraCallback) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.getAttrCertValidityPeriod$onExtraCallback r0 = new o.getAttrCertValidityPeriod$onExtraCallback
            r0.<init>(r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.result
            java.lang.Object r0 = o.access14300.onWarmupCompleted()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            kotlin.ResultKt.onNavigationEvent(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.onNavigationEvent()
            goto L4f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            kotlin.ResultKt.onNavigationEvent(r8)
            o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE$IAuthTabCallback r8 = o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.Companion
            o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r1 = r8.onWarmupCompleted()
            r4.label = r2
            java.lang.String r2 = "STD_15_TRANSFER_LOCATION"
            r3 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4f
            return r0
        L4f:
            boolean r0 = kotlin.Result.onExtraCallback(r8)
            if (r0 == 0) goto L56
            r8 = 0
        L56:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L5f
            boolean r8 = r8.booleanValue()
            goto L60
        L5f:
            r8 = 0
        L60:
            java.lang.Boolean r8 = o.access14000.onNavigationEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAttrCertValidityPeriod.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.Nullable android.location.LocationManager r5, @org.jetbrains.annotations.NotNull o.access13800<? super android.location.Location> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.getAttrCertValidityPeriod.IAuthTabCallback
            if (r0 == 0) goto L13
            r0 = r6
            o.getAttrCertValidityPeriod$IAuthTabCallback r0 = (o.getAttrCertValidityPeriod.IAuthTabCallback) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.getAttrCertValidityPeriod$IAuthTabCallback r0 = new o.getAttrCertValidityPeriod$IAuthTabCallback
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            android.location.LocationManager r5 = (android.location.LocationManager) r5
            kotlin.ResultKt.onNavigationEvent(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.onNavigationEvent(r6)
            if (r5 == 0) goto L52
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.onExtraCallbackWithResult(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L52
            android.location.Location r5 = r4.onExtraCallback(r5)
            return r5
        L52:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAttrCertValidityPeriod.onNavigationEvent(android.location.LocationManager, o.access13800):java.lang.Object");
    }

    public final void IAuthTabCallback(@NotNull BaseActivity baseActivity, boolean z, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (onWarmupCompleted(baseActivity)) {
            function1.invoke(Boolean.TRUE);
        } else {
            onNavigationEvent(baseActivity, z, function1);
        }
    }

    private final boolean onWarmupCompleted(BaseActivity baseActivity) {
        return new RxPermissions(baseActivity).onExtraCallbackWithResult("android.permission.ACCESS_FINE_LOCATION");
    }

    private final void onNavigationEvent(final BaseActivity baseActivity, final boolean z, final Function1<? super Boolean, Unit> function1) {
        getByteBuffer getbytebufferOnExtraCallback = new RxPermissions(baseActivity).onExtraCallbackWithResult(new String[]{"android.permission.ACCESS_FINE_LOCATION"}).onExtraCallback(1L);
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.common.LocationProvider$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return getAttrCertValidityPeriod.onWarmupCompleted(function1, baseActivity, z, (shouldBeKeptAsChild) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.common.LocationProvider$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                getAttrCertValidityPeriod.IAuthTabCallback(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.common.LocationProvider$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return getAttrCertValidityPeriod.onNavigationEvent(function1, (Throwable) obj);
            }
        };
        getbytebufferOnExtraCallback.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.common.LocationProvider$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                getAttrCertValidityPeriod.onWarmupCompleted(function13, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final Function1 function1, final BaseActivity baseActivity, boolean z, final shouldBeKeptAsChild shouldbekeptaschild) {
        ConvertByteArrayToFloatArray.onExtraCallback(1006378L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.common.LocationProvider$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return getAttrCertValidityPeriod.onExtraCallback(shouldbekeptaschild, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        if (shouldbekeptaschild.onNavigationEvent) {
            function1.invoke(Boolean.TRUE);
        } else if (shouldbekeptaschild.onExtraCallbackWithResult) {
            onJsBridgeReady.onNavigationEvent(baseActivity, baseActivity.getString(R.string.location_permission_rationale_toast), 0, 2, (Object) null);
            function1.invoke(Boolean.FALSE);
        } else if (z) {
            Object[] objArr = {(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(baseActivity).onNavigationEvent(false), Integer.valueOf(R.string.location_permission_force_dialog_mssage)};
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -868633265, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 868633269, objArr, iOnExtraCallback), R.string.permission_action_go_to_setting, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.common.LocationProvider$$ExternalSyntheticLambda5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    getAttrCertValidityPeriod.IAuthTabCallback(baseActivity, function1, dialogInterface, i);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null), im.toss.uikit.R.string.uikit_cancel, new DialogInterface.OnClickListener() { // from class: viva.republica.toss.common.LocationProvider$$ExternalSyntheticLambda6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    getAttrCertValidityPeriod.IAuthTabCallback(function1, dialogInterface, i);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).readTypedObject();
        } else {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(shouldBeKeptAsChild shouldbekeptaschild, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("agree_option", shouldbekeptaschild.onNavigationEvent ? "always" : "never");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(BaseActivity baseActivity, Function1 function1, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + UserChoiceBillingListener.onExtraCallback.onExtraCallback().getPackageName()));
        baseActivity.startActivity(intent);
        dialogInterface.dismiss();
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Function1 function1, Throwable th) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
