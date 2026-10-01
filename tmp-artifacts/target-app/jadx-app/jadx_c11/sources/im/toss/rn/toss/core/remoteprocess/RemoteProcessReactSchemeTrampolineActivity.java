package im.toss.rn.toss.core.remoteprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zziea;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.rn.toss.core.R;
import im.toss.rn.toss.core.ReactSchemeActivity;
import im.toss.rn.toss.core.TranslucentReactSchemeActivity;
import im.toss.rn.toss.core.remoteprocess.RemoteProcessReactSchemeTrampolineActivity$;
import im.toss.rn.toss.core.remoteprocess.RnRemoteProcessBundlePreparer;
import im.toss.rn.toss.core.remoteprocess.RnRemoteProcessPrepareResult;
import im.toss.rn.toss.core.remoteprocess.RnRemoteProcessRouting;
import im.toss.rn.toss.core.webview.ReactWebViewCdpIntentExtras;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.RedBoxContentViewOpenStackFrameTask;
import o.Response;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.access15400;
import o.doGet;
import o.getPackageType;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RemoteProcessReactSchemeTrampolineActivity extends BaseActivity {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private static int onTransact;
    private final Lazy asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.remoteprocess.RemoteProcessReactSchemeTrampolineActivity$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity = this.f$0;
            if (i3 == 0) {
                return RemoteProcessReactSchemeTrampolineActivity.onNavigationEvent(remoteProcessReactSchemeTrampolineActivity);
            }
            RemoteProcessReactSchemeTrampolineActivity.onNavigationEvent(remoteProcessReactSchemeTrampolineActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });

    static {
        int i = asInterface + 47;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity = (RemoteProcessReactSchemeTrampolineActivity) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(remoteProcessReactSchemeTrampolineActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onTransact + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback2, zziea.IAuthTabCallback(), 1343526355, -1343526354, iIAuthTabCallback, new Object[]{dialogInterface}, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackStub + 27;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(remoteProcessReactSchemeTrampolineActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i4)) | (~(i8 | i4));
        int i10 = ~i4;
        int i11 = (~(i10 | i3)) | (~(i8 | i3));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i4 + i3 + i + ((-2109949842) * i6) + (2078889904 * i2);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i4) + 932184064 + (61854959 * i3) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i) + (610271232 * i6) + (922746880 * i2) + (671350784 * i14);
        int i16 = (i4 * (-573803825)) + 196542130 + (i3 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i * (-573803307)) + (i6 * (-843101306)) + (i2 * (-1524517520)) + (i14 * 458489856);
        int i17 = i15 + (i16 * i16 * 64749568);
        if (i17 != 1) {
            return i17 != 2 ? i17 != 3 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i18 = 2 % 2;
        int i19 = onTransact + 5;
        IAuthTabCallbackStub = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i21 = onTransact + 41;
        IAuthTabCallbackStub = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ RnRemoteProcessBundlePreparer onNavigationEvent(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparerOnWarmupCompleted = onWarmupCompleted(remoteProcessReactSchemeTrampolineActivity);
        int i4 = onTransact + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return rnRemoteProcessBundlePreparerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return -1L;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity = (RemoteProcessReactSchemeTrampolineActivity) objArr[0];
        RnRemoteProcessPrepareResult.Reason reason = (RnRemoteProcessPrepareResult.Reason) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        remoteProcessReactSchemeTrampolineActivity.onExtraCallback(reason);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        remoteProcessReactSchemeTrampolineActivity.onNavigationEvent();
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ RnRemoteProcessBundlePreparer onExtraCallbackWithResult(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparerIAuthTabCallback = remoteProcessReactSchemeTrampolineActivity.IAuthTabCallback();
        int i4 = IAuthTabCallbackStub + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return rnRemoteProcessBundlePreparerIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity = (RemoteProcessReactSchemeTrampolineActivity) objArr[0];
        access13800<? super Unit> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            remoteProcessReactSchemeTrampolineActivity.IAuthTabCallback(access13800Var);
            throw null;
        }
        Object objIAuthTabCallback = remoteProcessReactSchemeTrampolineActivity.IAuthTabCallback(access13800Var);
        int i3 = IAuthTabCallbackStub + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, PreparedRnBundleSnapshot preparedRnBundleSnapshot) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        remoteProcessReactSchemeTrampolineActivity.onExtraCallbackWithResult(preparedRnBundleSnapshot);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ RnRemoteProcessPrepareResult.Reason onWarmupCompleted(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, RnRemoteProcessRouting.Reason reason) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            remoteProcessReactSchemeTrampolineActivity.onExtraCallbackWithResult(reason);
            obj.hashCode();
            throw null;
        }
        RnRemoteProcessPrepareResult.Reason reasonOnExtraCallbackWithResult = remoteProcessReactSchemeTrampolineActivity.onExtraCallbackWithResult(reason);
        int i3 = onTransact + 113;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return reasonOnExtraCallbackWithResult;
        }
        throw null;
    }

    private final RnRemoteProcessBundlePreparer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparer = (RnRemoteProcessBundlePreparer) this.asBinder.getValue();
        int i3 = IAuthTabCallbackStub + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return rnRemoteProcessBundlePreparer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final RnRemoteProcessBundlePreparer onWarmupCompleted(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Context applicationContext = remoteProcessReactSchemeTrampolineActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            RnRemoteProcessBundlePreparer rnRemoteProcessBundlePreparerComponentActivityExternalSyntheticLambda11 = ((RnRemoteProcessBundlePreparer.HiltEntryPoint) Response.onExtraCallback(applicationContext, RnRemoteProcessBundlePreparer.HiltEntryPoint.class)).ComponentActivityExternalSyntheticLambda11();
            int i3 = onTransact + 83;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            return rnRemoteProcessBundlePreparerComponentActivityExternalSyntheticLambda11;
        }
        Context applicationContext2 = remoteProcessReactSchemeTrampolineActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        ((RnRemoteProcessBundlePreparer.HiltEntryPoint) Response.onExtraCallback(applicationContext2, RnRemoteProcessBundlePreparer.HiltEntryPoint.class)).ComponentActivityExternalSyntheticLambda11();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onCreate.1(this, (access13800) null), 3, (Object) null);
        int i2 = onTransact + 27;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Unit> access13800Var) {
        RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1 remoteProcessReactSchemeTrampolineActivity$warmUpDword$1;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 117;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (access13800Var instanceof RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1) {
            int i5 = i2 + 75;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = ((RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1) access13800Var).label;
                throw null;
            }
            remoteProcessReactSchemeTrampolineActivity$warmUpDword$1 = (RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1) access13800Var;
            int i7 = remoteProcessReactSchemeTrampolineActivity$warmUpDword$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                remoteProcessReactSchemeTrampolineActivity$warmUpDword$1.label = i7 - 2147483648;
            } else {
                remoteProcessReactSchemeTrampolineActivity$warmUpDword$1 = new RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1(this, access13800Var);
            }
        }
        Object objOnWarmupCompleted = remoteProcessReactSchemeTrampolineActivity$warmUpDword$1.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i8 = remoteProcessReactSchemeTrampolineActivity$warmUpDword$1.label;
        if (i8 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new RemoteProcessReactSchemeTrampolineActivity$warmUpDword$warmUpJob$1(this, null), 2, (Object) null);
            RemoteProcessReactSchemeTrampolineActivity$warmUpDword$2 remoteProcessReactSchemeTrampolineActivity$warmUpDword$2 = new RemoteProcessReactSchemeTrampolineActivity$warmUpDword$2(getpackagetypeOnNavigationEvent, null);
            remoteProcessReactSchemeTrampolineActivity$warmUpDword$1.L$0 = access15400.onNavigationEvent(getpackagetypeOnNavigationEvent);
            remoteProcessReactSchemeTrampolineActivity$warmUpDword$1.label = 1;
            objOnWarmupCompleted = doGet.onWarmupCompleted(500L, remoteProcessReactSchemeTrampolineActivity$warmUpDword$2, remoteProcessReactSchemeTrampolineActivity$warmUpDword$1);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                return objOnWarmupCompleted2;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = onTransact + 23;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                obj.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
        }
        if (objOnWarmupCompleted == null) {
            RedBoxContentViewOpenStackFrameTask.onExtraCallbackWithResult onextracallbackwithresult = RedBoxContentViewOpenStackFrameTask.Companion;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            onextracallbackwithresult.IAuthTabCallback(applicationContext);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(PreparedRnBundleSnapshot preparedRnBundleSnapshot) {
        int i = 2 % 2;
        Intent intent = new Intent(getIntent());
        IAuthTabCallback(intent);
        intent.setClass(this, RemoteProcessReactSchemeActivity.class);
        intent.putExtra("rnRemoteProcessPreparedSnapshotId", preparedRnBundleSnapshot.onExtraCallback());
        intent.removeExtra("rnRemoteProcessRequested");
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(RnRemoteProcessPrepareResult.Reason reason) {
        Class cls;
        int i = 2 % 2;
        Intent intent = new Intent(getIntent());
        IAuthTabCallback(intent);
        Object obj = null;
        if (reason != RnRemoteProcessPrepareResult.Reason.TRANSLUCENT) {
            cls = ReactSchemeActivity.class;
        } else {
            int i2 = onTransact + 77;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            cls = TranslucentReactSchemeActivity.class;
        }
        intent.setClass(this, cls);
        intent.removeExtra("rnRemoteProcessPreparedSnapshotId");
        intent.removeExtra("rnRemoteProcessRequested");
        ReactWebViewCdpIntentExtras.onExtraCallbackWithResult.onWarmupCompleted(intent);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
        int i3 = IAuthTabCallbackStub + 31;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent() {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new RemoteProcessReactSchemeTrampolineActivity$.ExternalSyntheticLambda3(this));
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onNavigationEvent(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        remoteProcessReactSchemeTrampolineActivity.finish();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(remoteProcessReactSchemeTrampolineActivity.getString(R.string.rn___473c448391));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(remoteProcessReactSchemeTrampolineActivity.getString(R.string.rn___9aeaa96689));
        String string = remoteProcessReactSchemeTrampolineActivity.getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new RemoteProcessReactSchemeTrampolineActivity$.ExternalSyntheticLambda1(), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new RemoteProcessReactSchemeTrampolineActivity$.ExternalSyntheticLambda2(remoteProcessReactSchemeTrampolineActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void IAuthTabCallback(Intent intent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Uri data = intent.getData();
        intent.setData(data != null ? RnSchemeAndroidOnlyQueryParamsKt.onExtraCallback(data) : null);
        String stringExtra = intent.getStringExtra("__originScheme");
        if (stringExtra != null) {
            if (StringsKt.isBlank(stringExtra)) {
                stringExtra = null;
            } else {
                int i4 = onTransact + 91;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }
            if (stringExtra != null) {
                int i5 = IAuthTabCallbackStub + 83;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    Uri uri = Uri.parse(stringExtra);
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    intent.putExtra("__originScheme", RnSchemeAndroidOnlyQueryParamsKt.onExtraCallback(uri).toString());
                } else {
                    Uri uri2 = Uri.parse(stringExtra);
                    Intrinsics.checkNotNullExpressionValue(uri2, "");
                    intent.putExtra("__originScheme", RnSchemeAndroidOnlyQueryParamsKt.onExtraCallback(uri2).toString());
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final RnRemoteProcessPrepareResult.Reason onExtraCallbackWithResult(RnRemoteProcessRouting.Reason reason) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = WhenMappings.onWarmupCompleted[reason.ordinal()];
        if (i2 == 1) {
            return RnRemoteProcessPrepareResult.Reason.TRANSLUCENT;
        }
        if (i2 == 2) {
            return RnRemoteProcessPrepareResult.Reason.FEATURE_DISABLED;
        }
        int i3 = IAuthTabCallbackStub + 63;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 == 0 ? i2 == 3 : i2 == 5) {
            return RnRemoteProcessPrepareResult.Reason.NOT_ALLOWLISTED;
        }
        int i5 = i4 + 117;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        RnRemoteProcessPrepareResult.Reason reason2 = RnRemoteProcessPrepareResult.Reason.NOT_REQUESTED;
        int i7 = onTransact + 5;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return reason2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull Uri uri) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(uri, "");
            Intent intent = new Intent(context, (Class<?>) RemoteProcessReactSchemeTrampolineActivity.class);
            intent.setData(uri);
            RemoteProcessReactSchemeTrampolineActivity.Companion.onNavigationEvent(intent);
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return intent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(@NotNull Context context, @NotNull Intent intent) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            intent.setComponent(new ComponentName(context, (Class<?>) RemoteProcessReactSchemeTrampolineActivity.class));
            onNavigationEvent(intent);
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        private final void onNavigationEvent(Intent intent) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            intent.putExtra("rnRemoteProcessRequested", true);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback2, zziea.IAuthTabCallback(), 1183761941, -1183761939, iIAuthTabCallback, new Object[]{remoteProcessReactSchemeTrampolineActivity, commonModule_setLeftEdgeTouchEnabled}, iIAuthTabCallback3);
    }

    public static final /* synthetic */ void onNavigationEvent(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, RnRemoteProcessPrepareResult.Reason reason) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, zziea.IAuthTabCallback(), 1897992434, -1897992431, iIAuthTabCallback, new Object[]{remoteProcessReactSchemeTrampolineActivity, reason}, iIAuthTabCallback3);
    }

    public static final /* synthetic */ Object onNavigationEvent(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, access13800 access13800Var) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return onExtraCallbackWithResult(iIAuthTabCallback2, zziea.IAuthTabCallback(), 155826548, -155826548, iIAuthTabCallback, new Object[]{remoteProcessReactSchemeTrampolineActivity, access13800Var}, iIAuthTabCallback3);
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback2, zziea.IAuthTabCallback(), 1343526355, -1343526354, iIAuthTabCallback, new Object[]{dialogInterface}, iIAuthTabCallback3);
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
