package viva.republica.toss.send.overpossession;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textField.TextValueLine;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.KeyBoardVisiblePoint;
import o.MapConverter;
import o.NativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0;
import o.NetConverter3;
import o.ParamImpl;
import o.SessionTrackerb;
import o.SimpleDraweeView;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UtilsKtExternalSyntheticLambda17;
import o.access13800;
import o.clearTid;
import o.disableImageViewPreallocationAndroid;
import o.getLongName;
import o.isVideoAutoplay;
import o.issueCertV3;
import o.listValue;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.onPaused;
import o.readableArrayValue;
import o.setRandomHost;
import o.setTid;
import o.showShareActionSheetWithOptions;
import o.verifyHASH;
import o.zzag;
import viva.republica.toss.R;
import viva.republica.toss.home.SchemeHomeActivity;
import viva.republica.toss.network.model.transfer.ReceiveFromPhoneParam;
import viva.republica.toss.send.overpossession.TransferOverPossessionReceiveActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferOverPossessionReceiveActivity extends Hilt_TransferOverPossessionReceiveActivity {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int IAuthTabCallbackStub = 8;
    private Runnable IAuthTabCallback_Parcel;
    private onNavigationEvent access000;
    private KeyBoardVisiblePoint getInterfaceDescriptor;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private final listValue onTransact = new listValue();
    private final readableArrayValue asBinder = new readableArrayValue();
    private long access100 = -1;
    private final Handler IAuthTabCallbackDefault = new Handler(Looper.getMainLooper());
    private final IEngagementSignalsCallback_Parcel<Intent> asInterface = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.send.overpossession.TransferOverPossessionReceiveActivity$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return TransferOverPossessionReceiveActivity.onWarmupCompleted(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    public long getScreenId() {
        return -1L;
    }

    public final zzag onNavigationEvent() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final SessionTrackerb IAuthTabCallback() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        KeyBoardVisiblePoint keyBoardVisiblePoint;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1 && intentOnExtraCallbackWithResult != null && (keyBoardVisiblePoint = (KeyBoardVisiblePoint) intentOnExtraCallbackWithResult.getParcelableExtra("account")) != null) {
            transferOverPossessionReceiveActivity.onWarmupCompleted(keyBoardVisiblePoint);
        }
        return Unit.INSTANCE;
    }

    public String getScreenName() {
        return "TransferOverPossessionReceiveActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04fc  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.send.overpossession.TransferOverPossessionReceiveActivity] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // viva.republica.toss.send.overpossession.Hilt_TransferOverPossessionReceiveActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.overpossession.TransferOverPossessionReceiveActivity.onCreate(android.os.Bundle):void");
    }

    private final void updateVisuals() {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ICustomTabsServiceDefault() {
        onNavigationEvent onnavigationevent = this.access000;
        if (onnavigationevent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onnavigationevent = null;
        }
        onnavigationevent.IAuthTabCallback().IAuthTabCallback(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda2(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, KeyBoardVisiblePoint keyBoardVisiblePoint) {
        transferOverPossessionReceiveActivity.findViewById(R.id.confirm_cta).setEnabledCta(keyBoardVisiblePoint != null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted(NativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0 nativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0, showShareActionSheetWithOptions showshareactionsheetwithoptions) {
        setContentView(R.layout.activity_transfer_over_possession_receive);
        View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(childAt, findViewById(R.id.appbarLayout), (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
        }
        AppCompatTextView appCompatTextViewFindViewById = findViewById(R.id.title);
        AppCompatTextView appCompatTextViewFindViewById2 = findViewById(R.id.subtitle);
        TextValueLine textValueLineFindViewById = findViewById(R.id.input_account);
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = findViewById(R.id.confirm_cta);
        String strOnExtraCallback = nativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0.onExtraCallback();
        long jOnWarmupCompleted = nativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0.onWarmupCompleted();
        long jOnNavigationEvent = showshareactionsheetwithoptions.onNavigationEvent();
        appCompatTextViewFindViewById.setText(getString(R.string.app_send_overpossession___1ab210112d, strOnExtraCallback, getLongName.onNavigationEvent(jOnWarmupCompleted, (ParamImpl) null, 1, (Object) null)));
        appCompatTextViewFindViewById2.setText(getString(R.string.app_send_overpossession___038bb8a981, getLongName.onNavigationEvent(jOnNavigationEvent, (ParamImpl) null, 1, (Object) null), getLongName.onNavigationEvent(jOnNavigationEvent, (ParamImpl) null, 1, (Object) null)));
        textValueLineFindViewById.setOnClickListener(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda5(this));
        long time = nativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0.IAuthTabCallback().getTime();
        long time2 = nativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0.onExtraCallbackWithResult().getTime();
        Intrinsics.checkNotNull(tdsBottomCtaV1ViewFindViewById);
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewFindViewById, string, new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda6(this, time, time2), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null), false, 8, (Object) null);
        tdsBottomCtaV1ViewFindViewById.setEnabledCta(false);
        onExtraCallbackWithResult(time, time2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallback(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, View view) {
        transferOverPossessionReceiveActivity.asInterface.onNavigationEvent(TransferSelectReceiveAccountActivity.Companion.onNavigationEvent(transferOverPossessionReceiveActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, long j, long j2, View view) throws Throwable {
        if (transferOverPossessionReceiveActivity.onWarmupCompleted(j, j2) > 0) {
            transferOverPossessionReceiveActivity.validateRelationship();
        } else {
            transferOverPossessionReceiveActivity.finish();
        }
    }

    private final void validateRelationship() throws Throwable {
        onNavigationEvent onnavigationevent = this.access000;
        if (onnavigationevent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onnavigationevent = null;
        }
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) onnavigationevent.IAuthTabCallback().onWarmupCompleted();
        if (keyBoardVisiblePoint == null) {
            return;
        }
        ReceiveFromPhoneParam receiveFromPhoneParam = new ReceiveFromPhoneParam(keyBoardVisiblePoint.onExtraCallbackWithResult(), keyBoardVisiblePoint.bP_(), keyBoardVisiblePoint.asInterface(), String.valueOf(this.access100), keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener ? "BANK_ACCOUNT" : "TOSS_ACCOUNT");
        BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29425), ((Process.getThreadPriority(0) + 20) >> 6) + 22, TextUtils.getTrimmedLength("") + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1550062933);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.MeasureSpec.getSize(0)), TextUtils.indexOf("", "", 0) + 22, 24734 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1831136197, false, "readTypedObject", new Class[0]);
            }
            JsonReaderUnknownNumberParsing<SimpleDraweeView> jsonReaderUnknownNumberParsingOnExtraCallback = ((onPaused) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(receiveFromPhoneParam);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda7(this)).onNavigationEvent(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda9(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda8(keyBoardVisiblePoint))).onWarmupCompleted(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda11(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda10(this)), new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda13(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda12(this)));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity) {
        transferOverPossessionReceiveActivity.bo_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(KeyBoardVisiblePoint keyBoardVisiblePoint, Boolean bool) throws Throwable {
        if (keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener) {
            verifyHASH.onExtraCallback.onWarmupCompleted((TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint);
        } else {
            verifyHASH.onWarmupCompleted(verifyHASH.onExtraCallback, false, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access100(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, Boolean bool) {
        if (bool.booleanValue()) {
            transferOverPossessionReceiveActivity.setEngagementSignalsCallback();
        } else {
            String string = transferOverPossessionReceiveActivity.getString(R.string.app_send_overpossession___9651768256);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = transferOverPossessionReceiveActivity.getString(R.string.app_send_overpossession___7481710ef7);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            transferOverPossessionReceiveActivity.onExtraCallbackWithResult(string, string2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, Throwable th) {
        if (th instanceof TossApiCallException.ApiError) {
            String string = transferOverPossessionReceiveActivity.getString(R.string.app_send_overpossession___9651768256);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String message = ((TossApiCallException.ApiError) th).getMessage();
            if (message == null) {
                message = transferOverPossessionReceiveActivity.getString(R.string.app_send_overpossession___7481710ef7);
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            transferOverPossessionReceiveActivity.onExtraCallbackWithResult(string, message);
        } else {
            transferOverPossessionReceiveActivity.newAuthTabSession();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEngagementSignalsCallback() {
        SessionTrackerb.IAuthTabCallback(IAuthTabCallback(), this, SchemeHomeActivity.Companion.onWarmupCompleted(Boolean.TRUE), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, String str2) {
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda3(str, str2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(String str, String str2, TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda14(transferOverPossessionReceiveActivity))};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        transferOverPossessionReceiveActivity.finish();
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(long j, long j2) {
        this.IAuthTabCallback_Parcel = new TransferOverPossessionReceiveActivity$.ExternalSyntheticLambda4(this, j, j2);
        Handler handler = this.IAuthTabCallbackDefault;
        handler.removeCallbacksAndMessages(null);
        Runnable runnable = this.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNull(runnable);
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallbackWithResult(TransferOverPossessionReceiveActivity transferOverPossessionReceiveActivity, long j, long j2) {
        String string;
        long jOnWarmupCompleted = transferOverPossessionReceiveActivity.onWarmupCompleted(j, j2);
        AppCompatTextView appCompatTextViewFindViewById = transferOverPossessionReceiveActivity.findViewById(R.id.remain_time);
        if (jOnWarmupCompleted > 0) {
            Handler handler = transferOverPossessionReceiveActivity.IAuthTabCallbackDefault;
            Runnable runnable = transferOverPossessionReceiveActivity.IAuthTabCallback_Parcel;
            Intrinsics.checkNotNull(runnable);
            handler.postDelayed(runnable, 1000L);
            StringBuilder sb = new StringBuilder(transferOverPossessionReceiveActivity.getString(R.string.app_send_overpossession___277b72f681));
            long j3 = (jOnWarmupCompleted / 60) / 60;
            long j4 = jOnWarmupCompleted - (3600 * j3);
            long j5 = j4 / 60;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string2 = transferOverPossessionReceiveActivity.getString(R.string.app_send_overpossession___e0a6012041);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str = String.format(string2, Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j4 - (j5 * 60))}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "");
            sb.append(str);
            string = sb;
        } else {
            string = transferOverPossessionReceiveActivity.getString(R.string.app_send_overpossession___b8fbeb372c);
        }
        appCompatTextViewFindViewById.setText(string);
    }

    private final long onWarmupCompleted(long j, long j2) {
        return RangesKt.coerceAtLeast(((j2 - j) / 1000) - ((onNavigationEvent().asBinder().getTime() - j) / 1000), 0L);
    }

    private final void onWarmupCompleted(KeyBoardVisiblePoint keyBoardVisiblePoint) {
        this.getInterfaceDescriptor = keyBoardVisiblePoint;
        if (keyBoardVisiblePoint != null) {
            findViewById(R.id.input_account).setText(issueCertV3.onNavigationEvent(keyBoardVisiblePoint));
        }
        onNavigationEvent onnavigationevent = this.access000;
        if (onnavigationevent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onnavigationevent = null;
        }
        onnavigationevent.IAuthTabCallback().onExtraCallback(keyBoardVisiblePoint);
    }

    public void onDestroy() {
        onNavigationEvent onnavigationevent = null;
        this.IAuthTabCallbackDefault.removeCallbacksAndMessages(null);
        onNavigationEvent onnavigationevent2 = this.access000;
        if (onnavigationevent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            onnavigationevent = onnavigationevent2;
        }
        onnavigationevent.IAuthTabCallbackStubProxy();
        super.onDestroy();
    }

    static final class onNavigationEvent extends isVideoAutoplay {
        private final setTid<KeyBoardVisiblePoint> IAuthTabCallback = access000();

        public final setTid<KeyBoardVisiblePoint> IAuthTabCallback() {
            return this.IAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    @Override // viva.republica.toss.send.overpossession.Hilt_TransferOverPossessionReceiveActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.send.overpossession.Hilt_TransferOverPossessionReceiveActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.send.overpossession.Hilt_TransferOverPossessionReceiveActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.send.overpossession.Hilt_TransferOverPossessionReceiveActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
