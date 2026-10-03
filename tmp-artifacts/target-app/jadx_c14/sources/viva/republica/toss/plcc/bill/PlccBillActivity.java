package viva.republica.toss.plcc.bill;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.base.BaseActivity;
import im.toss.core.cache.RxSharedApiCall;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_Issue_MakePOPOTbsMsg;
import o.CommonModule_closeView;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.IdGeneratorExternalSyntheticLambda1;
import o.InterstitialAdInterstitialAdShowConfigBuilder;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1;
import o.KeyBoardVisiblePoint;
import o.MapConverter;
import o.NativeJpegTranscoderFactory;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.clearTid;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.getNavigationBar;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.requestTimeStamp;
import o.setApTextSize;
import o.setLogBuffers;
import o.setMessageBytes;
import o.toCircleFast;
import o.writeRaw;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.credit.commons.views.TitleContentBottomSheetDialog;
import viva.republica.toss.dialogs.RichSelectBottomSheetDialog;
import viva.republica.toss.plcc.bill.PlccBillActivity$;
import viva.republica.toss.plcc.bill.PlccBillActivity$showSelectMonthDialog$1$;
import viva.republica.toss.plcc.billlist.PlccBillListActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccBillActivity extends Hilt_PlccBillActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100;
    private static long getInterfaceDescriptor;
    private final RxSharedApiCall<List<NativeJpegTranscoderFactory>> IAuthTabCallbackDefault;
    private final Lazy asInterface;

    @Inject
    public zzag tossClock;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy asBinder = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.class), new IAuthTabCallbackStubProxy(this), new access000(this), new readTypedObject(null, this));
    private final JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1 onTransact = new JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1();

    static {
        setEngagementSignalsCallback();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackStub = 8;
        int i = access000 + 119;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        boolean z;
        initMiniApp initminiapp;
        Function0 function0;
        Function1 function1;
        int i7;
        int i8 = (~((~i) | i4)) | (~(i | i6));
        int i9 = ~i4;
        int i10 = (~(i9 | i6)) | i;
        int i11 = (~(i6 | i4)) | (~(i9 | (~i6))) | i;
        int i12 = i4 + i + i5 + ((-737137436) * i3) + ((-1840598144) * i2);
        int i13 = i12 * i12;
        int i14 = (((-699670985) * i4) - 818937856) + (24099949 * i) + (723770934 * i8) + ((-1447541868) * i10) + ((-723770934) * i11) + ((-1423441920) * i5) + (1335885824 * i3) + ((-1946157056) * i2) + ((-1593638912) * i13);
        int i15 = (i4 * 1252406331) + 1981669868 + (i * 1252405337) + (i8 * (-994)) + (i10 * 1988) + (i11 * 994) + (i5 * 1252407325) + (i3 * (-1820396076)) + (i2 * 1320834432) + (i13 * (-447283200));
        int i16 = i14 + (i15 * i15 * 1511325696);
        if (i16 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 2) {
            PlccBillActivity plccBillActivity = (PlccBillActivity) objArr[0];
            int i17 = 2 % 2;
            int i18 = access100 + 93;
            int i19 = i18 % 128;
            IAuthTabCallbackStubProxy = i19;
            int i20 = i18 % 2;
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1 = plccBillActivity.onTransact;
            int i21 = i19 + 73;
            access100 = i21 % 128;
            int i22 = i21 % 2;
            return javaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1;
        }
        if (i16 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 5) {
            PlccBillActivity plccBillActivity2 = (PlccBillActivity) objArr[0];
            int i23 = 2 % 2;
            int i24 = IAuthTabCallbackStubProxy + 7;
            access100 = i24 % 128;
            int i25 = i24 % 2;
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            TextView textView = (TextView) IAuthTabCallback(-277257225, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{plccBillActivity2}, 277257229, iOnNavigationEvent2, iOnNavigationEvent);
            int i26 = access100 + 69;
            IAuthTabCallbackStubProxy = i26 % 128;
            int i27 = i26 % 2;
            return textView;
        }
        BaseActivity baseActivity = (PlccBillActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i28 = 2 % 2;
        int i29 = IAuthTabCallbackStubProxy + 117;
        access100 = i29 % 128;
        if (i29 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, "");
            z = false;
            initminiapp = null;
            function0 = null;
            function1 = null;
            i7 = 112;
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            z = false;
            initminiapp = null;
            function0 = null;
            function1 = null;
            i7 = 30;
        }
        getParamImp.onWarmupCompleted(th, baseActivity, z, initminiapp, function0, function1, i7, (Object) null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PlccBillActivity plccBillActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(plccBillActivity, setDetectableSize);
        }
        onNavigationEvent(plccBillActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(PlccBillActivity plccBillActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(plccBillActivity, view);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(PlccBillActivity plccBillActivity, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(plccBillActivity, list);
        }
        onExtraCallbackWithResult(plccBillActivity, list);
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(TitleContentBottomSheetDialog titleContentBottomSheetDialog, PlccBillActivity plccBillActivity, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(titleContentBottomSheetDialog, plccBillActivity, iAuthTabCallbackDefault, view);
        int i4 = IAuthTabCallbackStubProxy + 65;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(PlccBillActivity plccBillActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(367695553, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{plccBillActivity, th}, -367695553, iOnNavigationEvent2, iOnNavigationEvent);
        int i4 = access100 + 121;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PlccBillActivity plccBillActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(plccBillActivity, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(TitleContentBottomSheetDialog titleContentBottomSheetDialog, PlccBillActivity plccBillActivity, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(titleContentBottomSheetDialog, plccBillActivity, iAuthTabCallbackDefault, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 107;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 47;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 13;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return 1000490L;
    }

    public static final class access100 implements Function0<CMP_Issue_MakePOPOTbsMsg> {
        final /* synthetic */ Activity IAuthTabCallback;

        public access100(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final CMP_Issue_MakePOPOTbsMsg invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Issue_MakePOPOTbsMsg.IAuthTabCallback(layoutInflater);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlccBillActivity() throws Throwable {
        RxSharedApiCall.Companion companion = RxSharedApiCall.Companion;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        Object obj = ((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, 24734 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null) : objOnExtraCallback)).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            writeRaw writerawIAuthTabCallback = InterstitialAdInterstitialAdShowConfigBuilder.IAuthTabCallback((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) (objOnExtraCallback2 == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 22 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24734, -1144844641, false, "access100", new Class[0]) : objOnExtraCallback2)).invoke(obj, null), false, 1, null);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new IAuthTabCallback_Parcel(mapConverterOnExtraCallback, null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            this.IAuthTabCallbackDefault = RxSharedApiCall.Companion.onWarmupCompleted(companion, "plccBill", writerawIAuthTabCallback2, (Object) null, (setLogBuffers) null, 12, (Object) null);
            this.asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new access100(this));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PlccBillActivity plccBillActivity = (PlccBillActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            plccBillActivity.IEngagementSignalsCallback();
            obj.hashCode();
            throw null;
        }
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback = plccBillActivity.IEngagementSignalsCallback();
        int i3 = access100 + 119;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback;
        }
        throw null;
    }

    public static final /* synthetic */ View onExtraCallbackWithResult(PlccBillActivity plccBillActivity) {
        int i = 2 % 2;
        int i2 = access100 + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View viewICustomTabsServiceStub = plccBillActivity.ICustomTabsServiceStub();
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return viewICustomTabsServiceStub;
    }

    public static final /* synthetic */ void onNavigationEvent(PlccBillActivity plccBillActivity, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        plccBillActivity.IAuthTabCallback(iAuthTabCallbackDefault);
        int i4 = IAuthTabCallbackStubProxy + 81;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(PlccBillActivity plccBillActivity, List list) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        plccBillActivity.onExtraCallbackWithResult((List<NativeJpegTranscoderFactory>) list);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(PlccBillActivity plccBillActivity, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        plccBillActivity.onExtraCallbackWithResult(iAuthTabCallbackDefault);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 51;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback_Parcel<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallback_Parcel(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<List<? extends NativeJpegTranscoderFactory>> apply(writeRaw<BaseApiResponse<List<? extends NativeJpegTranscoderFactory>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass4 anonymousClass4 = new Function1<BaseApiResponse<List<? extends NativeJpegTranscoderFactory>>, deserializeIp<? extends List<? extends NativeJpegTranscoderFactory>>>() { // from class: viva.republica.toss.plcc.bill.PlccBillActivity.IAuthTabCallback_Parcel.4
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends NativeJpegTranscoderFactory>> invoke(BaseApiResponse<List<? extends NativeJpegTranscoderFactory>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass4) { // from class: o.UtilsKtExternalSyntheticLambda17$FullyDrawnReporterExternalSyntheticLambda0
                private final /* synthetic */ Function1 onWarmupCompleted;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass4, "");
                    this.onWarmupCompleted = anonymousClass4;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onWarmupCompleted.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onNavigationEvent;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PlccBillActivity plccBillActivity = (PlccBillActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 107;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = plccBillActivity.tossRouter;
        Object obj = null;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 117;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    public final zzag onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 13;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        zzag zzagVar = this.tossClock;
        if (zzagVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 53;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zzagVar;
    }

    private final JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 = (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1) this.asBinder.getValue();
        int i4 = IAuthTabCallbackStubProxy + 105;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access100 + 59;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return "tosscreditcard__bill";
    }

    public Map<String, Object> getScreenParams() {
        Map<String, Object> mapIAuthTabCallback;
        int i = 2 % 2;
        int i2 = access100 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Pair[] pairArr = new Pair[0];
            pairArr[0] = getWrite.IAuthTabCallback("service", "tosscreditcard");
            mapIAuthTabCallback = access8100.IAuthTabCallback(pairArr);
        } else {
            mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("service", "tosscreditcard")});
        }
        int i3 = access100 + 27;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(getInterfaceDescriptor ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 83;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(getInterfaceDescriptor)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 45812), TextUtils.indexOf("", "") + 84, 21233 - Color.green(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 14186), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, 8808 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 21;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i8 = $10 + 79;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 86 / 0;
            objArr[0] = str;
        }
    }

    private final CMP_Issue_MakePOPOTbsMsg updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CMP_Issue_MakePOPOTbsMsg cMP_Issue_MakePOPOTbsMsg = (CMP_Issue_MakePOPOTbsMsg) value;
        int i4 = access100 + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return cMP_Issue_MakePOPOTbsMsg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final RecyclerView ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerView = updateVisuals().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        int i4 = IAuthTabCallbackStubProxy + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return recyclerView;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PlccBillActivity plccBillActivity = (PlccBillActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = plccBillActivity.updateVisuals().onWarmupCompleted;
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(textView, "");
            int i4 = 55 / 0;
        } else {
            Intrinsics.checkNotNullExpressionValue(textView, "");
        }
        int i5 = access100 + 87;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    private final View ICustomTabsServiceStub() {
        View view;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            view = updateVisuals().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            int i3 = 97 / 0;
        } else {
            view = updateVisuals().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
        }
        int i4 = IAuthTabCallbackStubProxy + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public static final class access000 implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallback;

        public access000(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallback.getDefaultViewModelProviderFactory();
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackStubProxy(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onWarmupCompleted.getViewModelStore();
        }
    }

    public static final class readTypedObject implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onWarmupCompleted;

        public readTypedObject(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onWarmupCompleted;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.IAuthTabCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.plcc.bill.Hilt_PlccBillActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().getRoot());
        extraCommand().onNavigationEvent(true);
        extraCommand().onWarmupCompleted(true);
        ICustomTabsServiceDefault().setAdapter(this.onTransact);
        ICustomTabsService_Parcel();
        IEngagementSignalsCallback().IAuthTabCallback((Context) this, getIntent().getStringExtra("month"), false);
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        ((TextView) IAuthTabCallback(-277257225, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{this}, 277257229, iOnNavigationEvent2, iOnNavigationEvent)).setOnClickListener(new PlccBillActivity$.ExternalSyntheticLambda6(this));
        int i2 = IAuthTabCallbackStubProxy + 9;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(PlccBillActivity plccBillActivity, View view) {
        int i = 2 % 2;
        Object[] objArr = {plccBillActivity.IAuthTabCallbackDefault, null, null, false, 7, null};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        setMessageBytes.onExtraCallbackWithResult((writeRaw) RxSharedApiCall.onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -939077752, 939077756, objArr, setApTextSize.onNavigationEvent.4.onNavigationEvent()), new PlccBillActivity$.ExternalSyntheticLambda0(plccBillActivity), new PlccBillActivity$.ExternalSyntheticLambda1(plccBillActivity));
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(PlccBillActivity plccBillActivity, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        plccBillActivity.onExtraCallbackWithResult((List<NativeJpegTranscoderFactory>) list);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 87;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onWarmupCompleted implements Function1<DialogInterface, Unit> {
        onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((DialogInterface) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(DialogInterface dialogInterface) {
            PlccBillActivity.this.finish();
        }
    }

    private static final Unit onNavigationEvent(PlccBillActivity plccBillActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        Object[] objArr = new Object[1];
        a(new char[]{12385, 12309, 18518, 37349, 3249, 15874, 48981, 45881}, 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "account");
        setDetectableSize.onExtraCallback("screen_name", plccBillActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 37;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallbackWithResult(TitleContentBottomSheetDialog titleContentBottomSheetDialog, PlccBillActivity plccBillActivity, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault, View view) throws Throwable {
        int i = 2 % 2;
        titleContentBottomSheetDialog.dismiss();
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        SessionTrackerb sessionTrackerb = (SessionTrackerb) IAuthTabCallback(1075515478, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{plccBillActivity}, -1075515477, iOnNavigationEvent2, iOnNavigationEvent);
        String strOnExtraCallback = iAuthTabCallbackDefault.onExtraCallback();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{52089, 51978, 39804, 17091, 51240, 32216, 31692, 61667, 44067, 56314, 54011, 35117, 1370, 13148, 18915, 9817, 65123, 37983, 8522, 48997, 22518, 60772, 39033, 21569, 51416, 18077, 32512, 60571, 41467, 57337, 54986, 34276, 6414, 12531, 19897, 8958, 62069, 34869, 9407, 47968, 27507, 57647, 39866, 20597, 52394, 31305, 29544, 59731, 42492}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallback);
        sb.append("&isEnableOnlyAccountNo=false");
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, plccBillActivity, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Throwable {
        String str;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__estimated_payment_amount_click", false, (String) null, (List) null, (Map) null, new PlccBillActivity$.ExternalSyntheticLambda4(this), 30, (Object) null);
        if (iAuthTabCallbackDefault.IAuthTabCallback() == null) {
            String string = getString(R.string.app_plcc_bill___d10e5bb5b5);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getString(R.string.app_plcc_bill___7a47745cfe);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            TitleContentBottomSheetDialog titleContentBottomSheetDialog = new TitleContentBottomSheetDialog(this, string, string2);
            String string3 = getString(R.string.app_plcc_bill___b23ea21190);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            TitleContentBottomSheetDialog.onWarmupCompleted(titleContentBottomSheetDialog, string3, new PlccBillActivity$.ExternalSyntheticLambda5(titleContentBottomSheetDialog, this, iAuthTabCallbackDefault), (String) null, (View.OnClickListener) null, 12, (Object) null);
            titleContentBottomSheetDialog.show();
            return;
        }
        int i2 = IAuthTabCallbackStubProxy + 79;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            iAuthTabCallbackDefault.IAuthTabCallback().writeTypedObject();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (iAuthTabCallbackDefault.IAuthTabCallback().writeTypedObject()) {
            int i3 = access100 + 115;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            str = "toss";
        } else {
            str = "bank";
        }
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        SessionTrackerb sessionTrackerb = (SessionTrackerb) IAuthTabCallback(1075515478, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{this}, -1075515477, iOnNavigationEvent2, iOnNavigationEvent);
        String strOnExtraCallbackWithResult = iAuthTabCallbackDefault.IAuthTabCallback().onExtraCallbackWithResult();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{14769, 14786, 34789, 24154, 38245, 3001, 9857, 34434, 24299, 51043, 36790, 65356, 63378, 12229, 5294, 20536, 3240, 35012, 31754, 51456, 42340, 61921, 50469, 8808}, Process.myPid() >> 22, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        sb.append("?accountId=");
        sb.append(strOnExtraCallbackWithResult);
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    private static final Unit onExtraCallback(PlccBillActivity plccBillActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        Object[] objArr = new Object[1];
        a(new char[]{12385, 12309, 18518, 37349, 3249, 15874, 48981, 45881}, TextUtils.indexOf("", "", 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "register_account");
        setDetectableSize.onExtraCallback("screen_name", plccBillActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onNavigationEvent(TitleContentBottomSheetDialog titleContentBottomSheetDialog, PlccBillActivity plccBillActivity, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault, View view) throws Throwable {
        int i = 2 % 2;
        titleContentBottomSheetDialog.dismiss();
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        SessionTrackerb sessionTrackerb = (SessionTrackerb) IAuthTabCallback(1075515478, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{plccBillActivity}, -1075515477, iOnNavigationEvent2, iOnNavigationEvent);
        String strOnExtraCallback = iAuthTabCallbackDefault.onExtraCallback();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{52089, 51978, 39804, 17091, 51240, 32216, 31692, 61667, 44067, 56314, 54011, 35117, 1370, 13148, 18915, 9817, 65123, 37983, 8522, 48997, 22518, 60772, 39033, 21569, 51416, 18077, 32512, 60571, 41467, 57337, 54986, 34276, 6414, 12531, 19897, 8958, 62069, 34869, 9407, 47968, 27507, 57647, 39866, 20597, 52394, 31305, 29544, 59731, 42492}, View.getDefaultSize(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallback);
        sb.append("&isEnableOnlyAccountNo=false");
        SessionTrackerb.IAuthTabCallback(sessionTrackerb, plccBillActivity, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Throwable {
        String str;
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__estimated_payment_amount_click", false, (String) null, (List) null, (Map) null, new PlccBillActivity$.ExternalSyntheticLambda2(this), 30, (Object) null);
        if (!iAuthTabCallbackDefault.asInterface()) {
            KeyBoardVisiblePoint keyBoardVisiblePointIAuthTabCallback = iAuthTabCallbackDefault.IAuthTabCallback();
            if ((keyBoardVisiblePointIAuthTabCallback != null ? keyBoardVisiblePointIAuthTabCallback.onTransact() : null) == null) {
                String string = getString(R.string.app_plcc_bill___d10e5bb5b5);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = getString(R.string.app_plcc_bill___7a47745cfe);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                TitleContentBottomSheetDialog titleContentBottomSheetDialog = new TitleContentBottomSheetDialog(this, string, string2);
                String string3 = getString(R.string.app_plcc_bill___b23ea21190);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                TitleContentBottomSheetDialog.onWarmupCompleted(titleContentBottomSheetDialog, string3, new PlccBillActivity$.ExternalSyntheticLambda3(titleContentBottomSheetDialog, this, iAuthTabCallbackDefault), (String) null, (View.OnClickListener) null, 12, (Object) null);
                titleContentBottomSheetDialog.show();
                int i2 = access100 + 39;
                IAuthTabCallbackStubProxy = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        if (iAuthTabCallbackDefault.IAuthTabCallback() != null) {
            int i3 = IAuthTabCallbackStubProxy + 69;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = onNavigationEvent.onWarmupCompleted[iAuthTabCallbackDefault.IAuthTabCallback().onWarmupCompleted().ordinal()];
            if (i5 != 1) {
                int i6 = IAuthTabCallbackStubProxy + 31;
                access100 = i6 % 128;
                str = (i6 % 2 == 0 ? i5 == 2 : i5 == 3) ? "toss" : "";
            } else {
                str = "bank";
            }
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            SessionTrackerb sessionTrackerb = (SessionTrackerb) IAuthTabCallback(1075515478, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this}, -1075515477, iOnNavigationEvent2, iOnNavigationEvent);
            Object[] objArr = new Object[1];
            a(new char[]{2570, 2681, 64481, 8798, 15151, 51133, 35019, 19078, 27984, 47975, 8700, 13128, 50217, 21441, 47844, 39996, 16147, 62656, 53824, 1284, 38623, 36325, 27503, 61036, 2465, 9755, 35858, 22249, 24733, 48958}, TextUtils.indexOf("", "", 0, 0), objArr);
            SessionTrackerb.IAuthTabCallback(sessionTrackerb, this, Uri.parse(((String) objArr[0]).intern()).buildUpon().appendQueryParameter("accountId", iAuthTabCallbackDefault.IAuthTabCallback().onExtraCallbackWithResult()).appendQueryParameter("accountType", str).appendQueryParameter("amount", String.valueOf(iAuthTabCallbackDefault.onNavigationEvent())).appendQueryParameter("origin", "toss_credit_card").build().toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
    }

    public static final class getInterfaceDescriptor implements RichSelectBottomSheetDialog.Callback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private static char[] IAuthTabCallback = {64970, 64967, 64963, 64982};
        private static char onNavigationEvent = 51243;

        public static /* synthetic */ Unit onWarmupCompleted(PlccBillActivity plccBillActivity, Object obj, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(plccBillActivity, obj, setDetectableSize);
            int i4 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        getInterfaceDescriptor() {
        }

        @Override // viva.republica.toss.dialogs.RichSelectBottomSheetDialog.Callback
        public void onExtraCallback(RichSelectBottomSheetDialog richSelectBottomSheetDialog) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(richSelectBottomSheetDialog, "");
            richSelectBottomSheetDialog.dismiss();
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // viva.republica.toss.dialogs.RichSelectBottomSheetDialog.Callback
        public void IAuthTabCallback(RichSelectBottomSheetDialog richSelectBottomSheetDialog, int i, Object obj) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(richSelectBottomSheetDialog, "");
            richSelectBottomSheetDialog.dismiss();
            NativeJpegTranscoderFactory nativeJpegTranscoderFactory = (NativeJpegTranscoderFactory) obj;
            if (nativeJpegTranscoderFactory != null) {
                int i3 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                BaseActivity baseActivity = PlccBillActivity.this;
                int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                ((JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1) PlccBillActivity.IAuthTabCallback(-849746891, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{baseActivity}, 849746894, iOnNavigationEvent2, iOnNavigationEvent)).IAuthTabCallback((Context) baseActivity, nativeJpegTranscoderFactory.onExtraCallback(), nativeJpegTranscoderFactory.IAuthTabCallback() == toCircleFast.DUE);
                int i5 = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            ConvertByteArrayToFloatArray.onWarmupCompleted("tosscreditcard__bill_select_month", false, (String) null, (List) null, (Map) null, new PlccBillActivity$showSelectMonthDialog$1$.ExternalSyntheticLambda0(PlccBillActivity.this, obj), 30, (Object) null);
        }

        private static final Unit IAuthTabCallback(PlccBillActivity plccBillActivity, Object obj, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("action_type", "click");
            setDetectableSize.onExtraCallback("screen_name", plccBillActivity.getScreenName());
            Object[] objArr = new Object[1];
            a(new char[]{0, 1, 3, 2}, (byte) (TextUtils.indexOf("", "", 0, 0) + 16), 3 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int i4 = $10 + 105;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), AndroidCharacter.getMirror('0') - 22, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            try {
                Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 27, 23138 - MotionEvent.axisFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i7 = $11 + 57;
                            $10 = i7 % 128;
                            if (i7 % 2 != 0) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback % b);
                            } else {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            }
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.resolveSizeAndState(0, 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 74, 8088 - (ViewConfiguration.getTapTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i8 = $10 + 91;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 30, 19488 - TextUtils.indexOf("", ""), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i11 = $10 + 77;
                                    $11 = i11 % 128;
                                    int i12 = i11 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                                } else {
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                                }
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                        obj2 = obj;
                    }
                }
                for (int i17 = 0; i17 < i; i17++) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(List<NativeJpegTranscoderFactory> list) {
        int i = 2 % 2;
        List<NativeJpegTranscoderFactory> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (NativeJpegTranscoderFactory nativeJpegTranscoderFactory : list2) {
            String string = getString(R.string.app_plcc_bill___ce0034412a);
            Intrinsics.checkNotNullExpressionValue(string, "");
            requestTimeStamp requesttimestamp = new requestTimeStamp(new IdGeneratorExternalSyntheticLambda1(string).format(CommonModule_closeView.onNavigationEvent.parse(nativeJpegTranscoderFactory.onNavigationEvent())).toString(), 0, null, false, Boolean.valueOf(Intrinsics.areEqual(nativeJpegTranscoderFactory.onNavigationEvent(), IEngagementSignalsCallback().onNavigationEvent())), null, 46, null);
            requesttimestamp.onWarmupCompleted(nativeJpegTranscoderFactory);
            arrayList.add(requesttimestamp);
        }
        RichSelectBottomSheetDialog.Companion companion = RichSelectBottomSheetDialog.Companion;
        String string2 = getString(R.string.app_plcc_select_date);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RichSelectBottomSheetDialog richSelectBottomSheetDialogOnExtraCallbackWithResult = companion.onExtraCallbackWithResult(string2, arrayList, new getInterfaceDescriptor());
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        richSelectBottomSheetDialogOnExtraCallbackWithResult.show(supportFragmentManager, "selectMonthDialog");
        int i2 = IAuthTabCallbackStubProxy + 49;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return iAuthTabCallback.IAuthTabCallback(context, str);
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) PlccBillActivity.class).putExtra("month", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback = IEngagementSignalsCallback();
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback.IAuthTabCallback().observe(this, new BaseActivity.ICustomTabsService_Parcel(new onExtraCallback()));
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback.asBinder().observe(this, new BaseActivity.ICustomTabsService_Parcel(new onExtraCallbackWithResult()));
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback.onExtraCallbackWithResult().observe(this, new BaseActivity.ICustomTabsService_Parcel(new onTransact()));
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback.IAuthTabCallbackDefault().observe(this, new BaseActivity.ICustomTabsService_Parcel(new IAuthTabCallbackStub()));
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback.onWarmupCompleted().observe(this, new BaseActivity.ICustomTabsService_Parcel(new asInterface()));
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback.IAuthTabCallbackStub().observe(this, new BaseActivity.ICustomTabsService_Parcel(new IAuthTabCallbackDefault()));
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1IEngagementSignalsCallback.onExtraCallback().observe(this, new BaseActivity.ICustomTabsService_Parcel(new asBinder()));
        int i2 = access100 + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class IAuthTabCallbackDefault implements Function1<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault, Unit> {
        public IAuthTabCallbackDefault() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            onNavigationEvent(obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Throwable {
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
            PlccBillActivity plccBillActivity = PlccBillActivity.this;
            Intrinsics.checkNotNull(iAuthTabCallbackDefault2);
            PlccBillActivity.onNavigationEvent(plccBillActivity, iAuthTabCallbackDefault2);
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<List<? extends NativeJpegTranscoderFactory>, Unit> {
        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(List<? extends NativeJpegTranscoderFactory> list) {
            List<? extends NativeJpegTranscoderFactory> list2 = list;
            PlccBillActivity plccBillActivity = PlccBillActivity.this;
            Intrinsics.checkNotNull(list2);
            PlccBillActivity.onWarmupCompleted(plccBillActivity, list2);
        }
    }

    public static final class asBinder implements Function1<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault, Unit> {
        public asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) throws Throwable {
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
            PlccBillActivity plccBillActivity = PlccBillActivity.this;
            Intrinsics.checkNotNull(iAuthTabCallbackDefault2);
            PlccBillActivity.onWarmupCompleted(plccBillActivity, iAuthTabCallbackDefault2);
        }
    }

    public static final class asInterface implements Function1<Throwable, Unit> {
        public asInterface() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, viva.republica.toss.plcc.bill.PlccBillActivity] */
        public final void IAuthTabCallback(Throwable th) {
            Throwable th2 = th;
            Intrinsics.checkNotNull(th2);
            ?? r1 = PlccBillActivity.this;
            getParamImp.onWarmupCompleted(th2, (Context) r1, false, (initMiniApp) null, (Function0) null, new onWarmupCompleted(), 14, (Object) null);
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallback implements Function1<List<? extends JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1>, Unit> {
        public onExtraCallback() {
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void IAuthTabCallback(java.util.List<? extends o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1> r19) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                java.util.List r1 = (java.util.List) r1
                o.IdGeneratorExternalSyntheticLambda1 r2 = o.CommonModule_closeView.onNavigationEvent
                viva.republica.toss.plcc.bill.PlccBillActivity r3 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                java.lang.Object[] r7 = new java.lang.Object[]{r3}
                int r10 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r9 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r6 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r5 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                r15 = 849746894(0x32a61bce, float:1.9337588E-8)
                r11 = -849746891(0xffffffffcd59e435, float:-2.2847573E8)
                r4 = r11
                r8 = r15
                java.lang.Object r3 = viva.republica.toss.plcc.bill.PlccBillActivity.IAuthTabCallback(r4, r5, r6, r7, r8, r9, r10)
                o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 r3 = (o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1) r3
                java.lang.String r3 = r3.onNavigationEvent()
                java.util.Date r2 = r2.parse(r3)
                if (r2 == 0) goto L4e
                viva.republica.toss.plcc.bill.PlccBillActivity r3 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                int r4 = viva.republica.toss.R.string.app_plcc_activity___bb2196ef1a
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                o.IdGeneratorExternalSyntheticLambda1 r4 = new o.IdGeneratorExternalSyntheticLambda1
                r4.<init>(r3)
                java.lang.String r3 = r4.format(r2)
                if (r3 != 0) goto L6e
            L4e:
                viva.republica.toss.plcc.bill.PlccBillActivity r3 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                java.lang.Object[] r14 = new java.lang.Object[]{r3}
                int r17 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r16 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r13 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r12 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                java.lang.Object r3 = viva.republica.toss.plcc.bill.PlccBillActivity.IAuthTabCallback(r11, r12, r13, r14, r15, r16, r17)
                o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 r3 = (o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1) r3
                java.lang.String r3 = r3.onNavigationEvent()
            L6e:
                o.commonTestFlag r4 = o.commonTestFlag.onExtraCallback
                viva.republica.toss.plcc.bill.PlccBillActivity r5 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                o.zzag r5 = r5.onNavigationEvent()
                java.util.Date r5 = r5.asBinder()
                long r4 = r4.onWarmupCompleted(r2, r5)
                r6 = 0
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 <= 0) goto Lb6
                viva.republica.toss.plcc.bill.PlccBillActivity r2 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                java.lang.Object[] r7 = new java.lang.Object[]{r2}
                int r10 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r9 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r6 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r5 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                r8 = 1578982825(0x5e1d5da9, float:2.8348513E18)
                r4 = -1578982820(0xffffffffa1e2a25c, float:-1.5357332E-18)
                java.lang.Object r2 = viva.republica.toss.plcc.bill.PlccBillActivity.IAuthTabCallback(r4, r5, r6, r7, r8, r9, r10)
                android.widget.TextView r2 = (android.widget.TextView) r2
                viva.republica.toss.plcc.bill.PlccBillActivity r4 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                int r5 = viva.republica.toss.R.string.app_plcc_bill___e9695822e2
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                java.lang.String r3 = r4.getString(r5, r3)
                r2.setText(r3)
                goto Le7
            Lb6:
                viva.republica.toss.plcc.bill.PlccBillActivity r2 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                java.lang.Object[] r7 = new java.lang.Object[]{r2}
                int r10 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r9 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r6 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r5 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                r8 = 1578982825(0x5e1d5da9, float:2.8348513E18)
                r4 = -1578982820(0xffffffffa1e2a25c, float:-1.5357332E-18)
                java.lang.Object r2 = viva.republica.toss.plcc.bill.PlccBillActivity.IAuthTabCallback(r4, r5, r6, r7, r8, r9, r10)
                android.widget.TextView r2 = (android.widget.TextView) r2
                viva.republica.toss.plcc.bill.PlccBillActivity r4 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                int r5 = viva.republica.toss.R.string.app_plcc_bill___959152e55e
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                java.lang.String r3 = r4.getString(r5, r3)
                r2.setText(r3)
            Le7:
                viva.republica.toss.plcc.bill.PlccBillActivity r2 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                java.lang.Object[] r6 = new java.lang.Object[]{r2}
                int r9 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r8 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r5 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                int r4 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent()
                r7 = -943147387(0xffffffffc7c8b685, float:-102765.04)
                r3 = 943147389(0x3837497d, float:4.369904E-5)
                java.lang.Object r2 = viva.republica.toss.plcc.bill.PlccBillActivity.IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
                o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1 r2 = (o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1) r2
                r3 = 1
                r2.onExtraCallbackWithResult(r1, r3)
                viva.republica.toss.plcc.bill.PlccBillActivity r1 = viva.republica.toss.plcc.bill.PlccBillActivity.this
                android.view.View r1 = viva.republica.toss.plcc.bill.PlccBillActivity.onExtraCallbackWithResult(r1)
                r2 = 0
                r1.setVisibility(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.plcc.bill.PlccBillActivity.onExtraCallback.IAuthTabCallback(java.lang.Object):void");
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback, Unit> {
        public onExtraCallbackWithResult() {
        }

        public final void IAuthTabCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback iAuthTabCallback) {
            JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
            getNavigationBar.IAuthTabCallback(PlccBillListActivity.Companion.onNavigationEvent(PlccBillActivity.this, iAuthTabCallback2.IAuthTabCallback(), new ArrayList(iAuthTabCallback2.onExtraCallback())), PlccBillActivity.this);
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onTransact implements Function1<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact, Unit> {
        public onTransact() {
        }

        public final void IAuthTabCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact ontransact) {
            PlccBillListActivity.onWarmupCompleted onwarmupcompleted = PlccBillListActivity.Companion;
            BaseActivity baseActivity = PlccBillActivity.this;
            String string = baseActivity.getString(R.string.app_plcc_bill___d973be4de1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getNavigationBar.IAuthTabCallback(onwarmupcompleted.onNavigationEvent(baseActivity, string, new ArrayList(ontransact.onWarmupCompleted())), PlccBillActivity.this);
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1 IAuthTabCallback(PlccBillActivity plccBillActivity) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_BOOLEAN1) IAuthTabCallback(943147389, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{plccBillActivity}, -943147387, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public static final /* synthetic */ TextView onExtraCallback(PlccBillActivity plccBillActivity) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (TextView) IAuthTabCallback(-1578982820, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{plccBillActivity}, 1578982825, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public static final /* synthetic */ JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 onNavigationEvent(PlccBillActivity plccBillActivity) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1) IAuthTabCallback(-849746891, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{plccBillActivity}, 849746894, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private final TextView validateRelationship() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (TextView) IAuthTabCallback(-277257225, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{this}, 277257229, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(PlccBillActivity plccBillActivity, Throwable th) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Unit) IAuthTabCallback(367695553, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{plccBillActivity, th}, -367695553, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public final SessionTrackerb IAuthTabCallback() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (SessionTrackerb) IAuthTabCallback(1075515478, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, new Object[]{this}, -1075515477, iOnNavigationEvent2, iOnNavigationEvent);
    }

    @Override // viva.republica.toss.plcc.bill.Hilt_PlccBillActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 25;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.plcc.bill.Hilt_PlccBillActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.plcc.bill.Hilt_PlccBillActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
    }

    @Override // viva.republica.toss.plcc.bill.Hilt_PlccBillActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 83;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void setEngagementSignalsCallback() {
        getInterfaceDescriptor = -6904595610701094202L;
    }
}
