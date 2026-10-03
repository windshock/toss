package viva.republica.toss.common;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ScrollView;
import im.toss.base.BaseActivity;
import im.toss.network.model.BaseApiResponse;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CRYPT_VerifyHASH;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.IconRoundCornerProgressBarSavedState;
import o.ImageFormatCheckerExternalSyntheticLambda0;
import o.MapConverter;
import o.NetConverter3;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkNavigationBarBySystemProperties;
import o.clearTid;
import o.deserializeIp;
import o.deserializeUriNullableCollection;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.getBidderToken;
import o.getInternalAttributes;
import o.getParamImp;
import o.getTitleTextSize;
import o.initMiniApp;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.send;
import o.setMessageBytes;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.OpenBankingBankListActivity;
import viva.republica.toss.common.OpenBankingDetailActivity;
import viva.republica.toss.common.OpenBankingTransitionBottomSheet$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OpenBankingTransitionBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onExtraCallbackWithResult = 8;
    private final Function0<Unit> IAuthTabCallback;
    private final Lazy onExtraCallback;
    private final BaseActivity onNavigationEvent;

    public long getScreenId() {
        return 1006374L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OpenBankingTransitionBottomSheet(@NotNull BaseActivity baseActivity, @NotNull Function0<Unit> function0) {
        super(baseActivity, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = baseActivity;
        this.IAuthTabCallback = function0;
        this.onExtraCallback = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));
    }

    public static final class onExtraCallbackWithResult implements Function0<CRYPT_VerifyHASH> {
        final /* synthetic */ Dialog onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Dialog dialog) {
            this.onExtraCallbackWithResult = dialog;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CRYPT_VerifyHASH invoke() {
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CRYPT_VerifyHASH.onExtraCallbackWithResult(layoutInflater);
        }
    }

    private final CRYPT_VerifyHASH onWarmupCompleted() {
        return (CRYPT_VerifyHASH) this.onExtraCallback.getValue();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        ScrollView root = onWarmupCompleted().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        setContentView(root);
        TdsBottomCtaV1View tdsBottomCtaV1View = onWarmupCompleted().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.uikit_confirm, new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda7(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        onWarmupCompleted().onExtraCallbackWithResult.setOnClickListener(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda8(this));
        onWarmupCompleted().onExtraCallback.setOnClickListener(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda9(this));
        setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, View view) throws Throwable {
        ConvertByteArrayToFloatArray.onExtraCallback(1006376L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        openBankingTransitionBottomSheet.onExtraCallbackWithResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWarmupCompleted(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, View view) {
        Context context = openBankingTransitionBottomSheet.getContext();
        OpenBankingDetailActivity.onExtraCallback onextracallback = OpenBankingDetailActivity.Companion;
        Context context2 = openBankingTransitionBottomSheet.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        context.startActivity(onextracallback.onWarmupCompleted(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final checkNavigationBarBySystemProperties onExtraCallbackWithResult(getInternalAttributes getinternalattributes) {
        Intrinsics.checkNotNullParameter(getinternalattributes, "");
        return send.Companion.onWarmupCompleted().onExtraCallback(String.valueOf(getinternalattributes.onWarmupCompleted()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, View view) throws Throwable {
        OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda0();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 29426), 21 - TextUtils.indexOf((CharSequence) "", '0', 0), 24735 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-32901893);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 29426), 22 - (ViewConfiguration.getTouchSlop() >> 8), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24734, -817296789, false, "onExtraCallbackWithResult", new Class[0]);
            }
            writeRaw<getTitleTextSize> writerawOnNavigationEvent = ((getBidderToken) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onWarmupCompleted(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda2(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda1(externalSyntheticLambda0))).onNavigationEvent(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda4(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda3(openBankingTransitionBottomSheet)), new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda6(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda5(openBankingTransitionBottomSheet)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, openBankingTransitionBottomSheet.onNavigationEvent);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onTransact(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onWarmupCompleted(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objInvoke = function1.invoke(it.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return CollectionsKt.distinct(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit IAuthTabCallback(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, List list) {
        OpenBankingBankListActivity.IAuthTabCallback iAuthTabCallback = OpenBankingBankListActivity.Companion;
        Context context = openBankingTransitionBottomSheet.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        String string = openBankingTransitionBottomSheet.getContext().getString(viva.republica.toss.R.string.app_autodebit_agreement_bank);
        Intrinsics.checkNotNullExpressionValue(string, "");
        openBankingTransitionBottomSheet.getContext().startActivity(iAuthTabCallback.IAuthTabCallback(context, string, new ArrayList(list)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OpenBankingTransitionBottomSheet", "error in openBankingTransitionAccounts", th, (Map) null, 8, (Object) null);
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, openBankingTransitionBottomSheet.onNavigationEvent, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult() throws Throwable {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29426), 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-32901893);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.resolveSize(0, 0)), 22 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24733, -817296789, false, "onExtraCallbackWithResult", new Class[0]);
            }
            writeRaw<BaseApiResponse<Boolean>> writerawIAuthTabCallback = ((getBidderToken) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            writeRaw writerawOnExtraCallbackWithResult = writerawIAuthTabCallback2.onExtraCallback(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda11(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda10(this))).onWarmupCompleted(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda12(this)).onExtraCallbackWithResult(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda14(new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda13()));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            writeRaw writerawIAuthTabCallback3 = writerawOnExtraCallbackWithResult.IAuthTabCallback(NetConverter3.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback3, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback3, new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda15(this), new OpenBankingTransitionBottomSheet$.ExternalSyntheticLambda16(this)), this.onNavigationEvent);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, deserializeUriNullableCollection deserializeurinullablecollection) {
        openBankingTransitionBottomSheet.onWarmupCompleted().onWarmupCompleted.asInterface().setLoading(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet) {
        openBankingTransitionBottomSheet.onWarmupCompleted().onWarmupCompleted.asInterface().setLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp IAuthTabCallbackDefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (deserializeIp) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp onNavigationEvent(Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.onExtraCallback().writeTypedObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, ImageFormatCheckerExternalSyntheticLambda0 imageFormatCheckerExternalSyntheticLambda0) {
        openBankingTransitionBottomSheet.dismiss();
        openBankingTransitionBottomSheet.IAuthTabCallback.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(OpenBankingTransitionBottomSheet openBankingTransitionBottomSheet, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "OpenBankingTransitionBottomSheet", "error in requestTransit", th, (Map) null, 8, (Object) null);
        getParamImp.onWarmupCompleted(th, openBankingTransitionBottomSheet.onNavigationEvent, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
