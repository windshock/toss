package viva.republica.toss.pedometer.main;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.zzgc;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CMP_Issue_IrIp;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.GuardedAsyncTask;
import o.IPostMessageServiceStubProxy;
import o.SetDetectableSize;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.getWrite;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.pedometer.main.PedometerPermissionGuideActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PedometerPermissionGuideActivity extends BaseActivity {
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));

    public long getScreenId() {
        return 1006184L;
    }

    public static final class IAuthTabCallback implements Function0<CMP_Issue_IrIp> {
        final /* synthetic */ Activity onNavigationEvent;

        public IAuthTabCallback(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CMP_Issue_IrIp invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Issue_IrIp.onExtraCallbackWithResult(layoutInflater);
        }
    }

    private final CMP_Issue_IrIp IAuthTabCallback() {
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (CMP_Issue_IrIp) value;
    }

    private final TdsBottomCtaV1View onNavigationEvent() {
        TdsBottomCtaV1View tdsBottomCtaV1View = IAuthTabCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        return tdsBottomCtaV1View;
    }

    private final ConstraintLayout setEngagementSignalsCallback() {
        ConstraintLayout constraintLayout = IAuthTabCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) throws Exception {
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        GuardedAsyncTask.IAuthTabCallback.onWarmupCompleted((Context) this);
        onNavigationEvent().asInterface().setOnClickListener(new PedometerPermissionGuideActivity$.ExternalSyntheticLambda2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(PedometerPermissionGuideActivity pedometerPermissionGuideActivity, View view) throws Exception {
        ConvertByteArrayToFloatArray.onExtraCallback(1006192L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        pedometerPermissionGuideActivity.validateRelationship();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onRestart() throws Exception {
        super/*android.app.Activity*/.onRestart();
        GuardedAsyncTask.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback, this, new PedometerPermissionGuideActivity$.ExternalSyntheticLambda3(this), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(PedometerPermissionGuideActivity pedometerPermissionGuideActivity) {
        pedometerPermissionGuideActivity.ICustomTabsServiceDefault();
        return Unit.INSTANCE;
    }

    private final void validateRelationship() throws Exception {
        ConvertByteArrayToFloatArray.onExtraCallback(1006186L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        GuardedAsyncTask.IAuthTabCallback.IAuthTabCallback(this, new PedometerPermissionGuideActivity$.ExternalSyntheticLambda6(this), new PedometerPermissionGuideActivity$.ExternalSyntheticLambda7(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(PedometerPermissionGuideActivity pedometerPermissionGuideActivity) {
        ConvertByteArrayToFloatArray.onExtraCallback(1006194L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        pedometerPermissionGuideActivity.ICustomTabsServiceDefault();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNavigationEvent(PedometerPermissionGuideActivity pedometerPermissionGuideActivity, shouldBeKeptAsChild shouldbekeptaschild) {
        Intrinsics.checkNotNullParameter(shouldbekeptaschild, "");
        if (shouldbekeptaschild.onExtraCallbackWithResult) {
            ConvertByteArrayToFloatArray.onExtraCallback(1006196L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            ConstraintLayout engagementSignalsCallback = pedometerPermissionGuideActivity.setEngagementSignalsCallback();
            String string = pedometerPermissionGuideActivity.getString(R.string.app_pedometer_main___c67d5f6960);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(engagementSignalsCallback, string), im.toss.core.R.drawable.icn_attention_color, 0, 2, (Object) null).onNavigationEvent(pedometerPermissionGuideActivity.onNavigationEvent()).onNavigationEvent();
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1006198L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            ConvertByteArrayToFloatArray.onExtraCallback(1006190L, false, (String) null, (Map) null, new PedometerPermissionGuideActivity$.ExternalSyntheticLambda0(), 14, (Object) null);
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(pedometerPermissionGuideActivity, new PedometerPermissionGuideActivity$.ExternalSyntheticLambda1(pedometerPermissionGuideActivity));
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "pedometer_debug", "permission denied", access8100.onNavigationEvent(getWrite.IAuthTabCallback("from", "PedometerPermissionActivity")), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("from", "click_deny_never_ask");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(PedometerPermissionGuideActivity pedometerPermissionGuideActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(pedometerPermissionGuideActivity.getString(R.string.app_pedometer_main___b92968901c));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(pedometerPermissionGuideActivity.getString(R.string.app_pedometer_main___90ce51bcd0));
        String string = pedometerPermissionGuideActivity.getString(R.string.card_setting);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new PedometerPermissionGuideActivity$.ExternalSyntheticLambda4(pedometerPermissionGuideActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new PedometerPermissionGuideActivity$.ExternalSyntheticLambda5())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(PedometerPermissionGuideActivity pedometerPermissionGuideActivity, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1006206L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:" + pedometerPermissionGuideActivity.getPackageName()));
        Intrinsics.checkNotNullExpressionValue(data, "");
        pedometerPermissionGuideActivity.startActivity(data);
        dialogInterface.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1006204L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        dialogInterface.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() {
        setResult(-1);
        finish();
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
