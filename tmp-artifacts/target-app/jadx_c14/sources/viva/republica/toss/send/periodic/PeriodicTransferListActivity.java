package viva.republica.toss.send.periodic;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.tooltip.TdsHighlightV3View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DERConstructedSequence;
import o.DERConstructedSet;
import o.EncryptedContentInfoParser;
import o.ForwardingCameraControl;
import o.GeckoHubImp;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.KeyBoardVisiblePoint;
import o.ModuleSpecCompanion;
import o.PageShowPoint;
import o.ReactContextExceptionHandlerWrapper;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.findResAndMsg;
import o.generateAppWithState;
import o.getPackageType;
import o.getTileModeX;
import o.getWrite;
import o.markInitializableReactAndroid_release;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.onCollectWhenDestroy;
import o.onPageExit;
import o.putChannelInfo;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.setTagsokhttp;
import o.y1hExternalSyntheticLambda0;
import o.ycxycx;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;
import viva.republica.toss.send.periodic.PeriodicTransferListActivity;
import viva.republica.toss.send.periodic.PeriodicTransferListActivity$;
import viva.republica.toss.send.periodic.PeriodicTransferPostActivity;
import viva.republica.toss.send.periodic.view.FilteringAccountBottomSheet;
import viva.republica.toss.send.v4.entity.ReceiverTab;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferListActivity extends Hilt_PeriodicTransferListActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static char[] IAuthTabCallbackStubProxy = null;
    private static int ICustomTabsCallback = 0;
    private static int access000 = 1;
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor;
    private Rect IAuthTabCallback_Parcel;
    private boolean asBinder;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy access100 = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(markInitializableReactAndroid_release.class), new getInterfaceDescriptor(this), new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda20
        public final Object invoke() {
            return PeriodicTransferListActivity.onTransact(this.f$0);
        }
    }, new IAuthTabCallback_Parcel(null, this));
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda21
        public final Object invoke() {
            return PeriodicTransferListActivity.onNavigationEvent(this.f$0);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda22
        public final Object invoke(Object obj) {
            return PeriodicTransferListActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackStub = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda23
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            return (Unit) PeriodicTransferListActivity.onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1527991927, -1527991913, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
        }
    });

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicTransferListActivity.onWarmupCompleted(PeriodicTransferListActivity.this, (markInitializableReactAndroid_release.IAuthTabCallback) null, (access13800) this);
        }
    }

    static {
        onNavigationEvent();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = ICustomTabsCallback + 71;
        extraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1669714278, -1669714265, new Object[]{commonModule_setLeftEdgeTouchEnabled, setDetectableSize}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i4 = access000 + 9;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 33;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(iAuthTabCallbackStub, periodicTransferListActivity, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallbackStub, periodicTransferListActivity, setDetectableSize);
        int i3 = access000 + 9;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(markInitializableReactAndroid_release.asInterface asinterface, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(asinterface, periodicTransferListActivity, setDetectableSize);
        }
        onWarmupCompleted(asinterface, periodicTransferListActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1826858330, 1826858346, new Object[]{periodicTransferListActivity}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i4 = access000 + 33;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Rect rect) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1838404138, 1838404153, new Object[]{periodicTransferListActivity, cameraPresenceProviderExternalSyntheticLambda6, rect}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(periodicTransferListActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        int i5 = access000 + 57;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(periodicTransferListActivity, iAuthTabCallbackStub);
        int i4 = getInterfaceDescriptor + 59;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(periodicTransferListActivity, iAuthTabCallbackStub, setDetectableSize);
        }
        onExtraCallbackWithResult(periodicTransferListActivity, iAuthTabCallbackStub, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, PeriodicTransferBannerResponse.Banner banner) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(periodicTransferListActivity, banner);
        }
        onExtraCallback(periodicTransferListActivity, banner);
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(periodicTransferListActivity, iEngagementSignalsCallbackDefault);
        int i4 = access000 + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit asBinder(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(periodicTransferListActivity);
        int i4 = access000 + 69;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(periodicTransferListActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(periodicTransferListActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = getInterfaceDescriptor + 13;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1499692250, 1499692252, new Object[]{commonModule_setLeftEdgeTouchEnabled, dialogInterface}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i4 = access000 + 51;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.content.Context, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~((~i2) | i7);
        int i9 = (~i4) | (~(i7 | i2));
        int i10 = i2 | i4 | i7;
        int i11 = i4 + i3 + i5 + (1635157569 * i6) + ((-1141649966) * i);
        int i12 = i11 * i11;
        int i13 = (i4 * 1521345644) + 2088555610 + (i3 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (1521345871 * i5) + ((-1382509809) * i6) + (37969358 * i) + (i12 * (-671350784));
        boolean z = false;
        switch ((((-1186836012) * i4) - 711983104) + (488484398 * i3) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i5) + (1462763520 * i6) + (1566572544 * i) + (1631846400 * i12) + (i13 * i13 * (-1069809664))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub = (markInitializableReactAndroid_release.IAuthTabCallbackStub) objArr[0];
                PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[1];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
                int i14 = 2 % 2;
                int i15 = access000 + 69;
                getInterfaceDescriptor = i15 % 128;
                int i16 = i15 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallbackStub, periodicTransferListActivity, setDetectableSize);
                int i17 = getInterfaceDescriptor + 121;
                access000 = i17 % 128;
                int i18 = i17 % 2;
                return unitOnExtraCallbackWithResult;
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                final PeriodicTransferListActivity periodicTransferListActivity2 = (PeriodicTransferListActivity) objArr[0];
                final markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub2 = (markInitializableReactAndroid_release.IAuthTabCallbackStub) objArr[1];
                int i19 = 2 % 2;
                ConvertByteArrayToFloatArray.onExtraCallback(1293929L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj) {
                        return PeriodicTransferListActivity.IAuthTabCallback(this.f$0, iAuthTabCallbackStub2, (SetDetectableSize) obj);
                    }
                }, 14, (Object) null);
                onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 1829435404, -1829435385, new Object[]{periodicTransferListActivity2, iAuthTabCallbackStub2}, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
                int i20 = getInterfaceDescriptor + 9;
                access000 = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 10:
                return asBinder(objArr);
            case 11:
                ?? r1 = (PeriodicTransferListActivity) objArr[0];
                markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub3 = (markInitializableReactAndroid_release.IAuthTabCallbackStub) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i22 = 2 % 2;
                int i23 = access000 + 39;
                getInterfaceDescriptor = i23 % 128;
                int i24 = i23 % 2;
                r1.updateVisuals().onExtraCallback(r1, iAuthTabCallbackStub3, zBooleanValue);
                int i25 = access000 + 41;
                getInterfaceDescriptor = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 12:
                return onTransact(objArr);
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return access100(objArr);
            case 15:
                return access000(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                final PeriodicTransferListActivity periodicTransferListActivity3 = (PeriodicTransferListActivity) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i27 = 2 % 2;
                int i28 = getInterfaceDescriptor + 93;
                int i29 = i28 % 128;
                access000 = i29;
                if (i28 % 2 != 0 ? (iIntValue & 3) == 2 : (iIntValue & 2) == 3) {
                    int i30 = i29 + 59;
                    getInterfaceDescriptor = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-480079695, iIntValue, -1, "viva.republica.toss.send.periodic.PeriodicTransferListActivity.onCreate.<anonymous> (PeriodicTransferListActivity.kt:118)");
                    }
                    y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-439453607, true, new Function2() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda15
                        public final Object invoke(Object obj, Object obj2) {
                            Object[] objArr2 = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                            return (Unit) PeriodicTransferListActivity.onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1086882860, 1086882867, objArr2, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i32 = getInterfaceDescriptor + 119;
                        access000 = i32 % 128;
                        int i33 = i32 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 18:
                return getInterfaceDescriptor(objArr);
            case 19:
                return extraCallbackWithResult(objArr);
            case 20:
                return ICustomTabsCallback(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(commonModule_setLeftEdgeTouchEnabled, setDetectableSize);
        }
        onNavigationEvent(commonModule_setLeftEdgeTouchEnabled, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1897607487, -1897607477, new Object[]{periodicTransferListActivity}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i4 = getInterfaceDescriptor + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(periodicTransferListActivity, iAuthTabCallbackStub, z);
        int i4 = access000 + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, PeriodicTransferModel periodicTransferModel, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 17;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, periodicTransferModel, periodicTransferListActivity, setDetectableSize);
        int i5 = access000 + 25;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(markInitializableReactAndroid_release.IAuthTabCallback iAuthTabCallback, PeriodicTransferListActivity periodicTransferListActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, periodicTransferListActivity, dialogInterface);
        int i4 = getInterfaceDescriptor + 121;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = access000 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1597873281, 1597873281, new Object[]{periodicTransferListActivity}, iOnNavigationEvent2, iOnNavigationEvent3);
        int i4 = access000 + 31;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(periodicTransferListActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(periodicTransferListActivity, iAuthTabCallbackStub);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(periodicTransferListActivity, iAuthTabCallbackStub);
        int i3 = getInterfaceDescriptor + 23;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 101;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(periodicTransferListActivity, iAuthTabCallbackStub, z, setDetectableSize);
        int i4 = getInterfaceDescriptor + 77;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        markInitializableReactAndroid_release.access100 access100Var = (markInitializableReactAndroid_release.access100) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(periodicTransferListActivity, access100Var);
        }
        onWarmupCompleted(periodicTransferListActivity, access100Var);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(periodicTransferListActivity);
        int i4 = getInterfaceDescriptor + 113;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(list, periodicTransferListActivity, setDetectableSize);
        }
        onExtraCallbackWithResult(list, periodicTransferListActivity, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(markInitializableReactAndroid_release.asInterface asinterface, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(asinterface, periodicTransferListActivity, setDetectableSize);
        int i4 = getInterfaceDescriptor + 89;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 81;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {periodicTransferListActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        if (i4 == 0) {
            return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 681102181, -681102164, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
        }
        int i5 = 36 / 0;
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 681102181, -681102164, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
    }

    public static /* synthetic */ Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(periodicTransferListActivity, iEngagementSignalsCallbackDefault);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(periodicTransferListActivity, iEngagementSignalsCallbackDefault);
        int i3 = getInterfaceDescriptor + 71;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ ViewModelProvider.onWarmupCompleted onTransact(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.onWarmupCompleted onwarmupcompletedAccess000 = access000(periodicTransferListActivity);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
        return onwarmupcompletedAccess000;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        markInitializableReactAndroid_release.asInterface asinterface = (markInitializableReactAndroid_release.asInterface) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 91;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(periodicTransferListActivity, asinterface);
        }
        IAuthTabCallback(periodicTransferListActivity, asinterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(commonModule_setLeftEdgeTouchEnabled, setDetectableSize);
        int i4 = getInterfaceDescriptor + 109;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, PeriodicTransferListActivity periodicTransferListActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallbackStub, periodicTransferListActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = access000 + 109;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor(periodicTransferListActivity);
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(periodicTransferListActivity);
        int i3 = access000 + 63;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return interfaceDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 3;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(periodicTransferListActivity, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(periodicTransferListActivity, setDetectableSize);
        int i3 = getInterfaceDescriptor + 69;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(periodicTransferListActivity, iAuthTabCallbackStub, commonModule_setLeftEdgeTouchEnabled, dialogInterface);
        int i4 = getInterfaceDescriptor + 47;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return 1293919L;
        }
        throw null;
    }

    public static final /* synthetic */ Object IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = periodicTransferListActivity.onExtraCallbackWithResult((access13800<? super KeyBoardVisiblePoint>) access13800Var);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        int i5 = access000 + 69;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ markInitializableReactAndroid_release.access000 IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        markInitializableReactAndroid_release.access000 access000VarOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000>) cameraPresenceProviderExternalSyntheticLambda6);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return access000VarOnExtraCallback;
    }

    public static final /* synthetic */ void IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, boolean z) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferListActivity.onNavigationEvent(z);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ markInitializableReactAndroid_release IAuthTabCallbackStub(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = access000 + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        markInitializableReactAndroid_release markinitializablereactandroid_releaseUpdateVisuals = periodicTransferListActivity.updateVisuals();
        int i4 = access000 + 63;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return markinitializablereactandroid_releaseUpdateVisuals;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity, List list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferListActivity.onExtraCallback((List<? extends markInitializableReactAndroid_release.IAuthTabCallback_Parcel>) list);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, List list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferListActivity.IAuthTabCallback((List<PeriodicTransferModel>) list);
        int i4 = access000 + 59;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Object onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallback iAuthTabCallback, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = periodicTransferListActivity.IAuthTabCallback(iAuthTabCallback, (access13800<? super Unit>) access13800Var);
        int i4 = getInterfaceDescriptor + 47;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, List list) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 59;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
            onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1686258353, 1686258359, new Object[]{periodicTransferListActivity, list}, iOnNavigationEvent2, iOnNavigationEvent3);
            return;
        }
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent5 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent6 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent4, -1686258353, 1686258359, new Object[]{periodicTransferListActivity, list}, iOnNavigationEvent5, iOnNavigationEvent6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r4 = r2 + 49;
        viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r4 % 128;
        r4 = r4 % 2;
        r2 = r2 + 13;
        viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SessionTrackerb IAuthTabCallback() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000
            int r1 = r1 + 63
            int r2 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L18
            o.SessionTrackerb r1 = r6.tossRouter
            r4 = 75
            int r4 = r4 / 0
            if (r1 == 0) goto L31
            goto L1c
        L18:
            o.SessionTrackerb r1 = r6.tossRouter
            if (r1 == 0) goto L31
        L1c:
            int r4 = r2 + 49
            int r5 = r4 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r5
            int r4 = r4 % r0
            int r2 = r2 + 13
            int r4 = r2 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L2d
            return r1
        L2d:
            r3.hashCode()
            throw r3
        L31:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferListActivity.IAuthTabCallback():o.SessionTrackerb");
    }

    private final markInitializableReactAndroid_release updateVisuals() {
        markInitializableReactAndroid_release markinitializablereactandroid_release;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            markinitializablereactandroid_release = (markInitializableReactAndroid_release) this.access100.getValue();
            int i3 = 80 / 0;
        } else {
            markinitializablereactandroid_release = (markInitializableReactAndroid_release) this.access100.getValue();
        }
        int i4 = getInterfaceDescriptor + 121;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return markinitializablereactandroid_release;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.lifecycle.ViewModelProvider.onWarmupCompleted access000(viva.republica.toss.send.periodic.PeriodicTransferListActivity r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            android.content.Context r1 = r7.getApplicationContext()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.H5TinyPopMenu r2 = new o.H5TinyPopMenu
            r2.<init>(r1)
            java.util.Set r1 = r7.ICustomTabsServiceDefault()
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r4 = "isTossBankHighlight"
            r5 = 0
            boolean r3 = r3.getBooleanExtra(r4, r5)
            if (r3 != 0) goto L39
            int r3 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000
            int r3 = r3 + 21
            int r6 = r3 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor = r6
            int r3 = r3 % r0
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r7 = r7.getStringExtra(r4)
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            if (r7 == 0) goto L3a
        L39:
            r5 = 1
        L3a:
            o.markInitializableReactAndroid_release$IAuthTabCallbackDefault r7 = new o.markInitializableReactAndroid_release$IAuthTabCallbackDefault
            r7.<init>(r2, r1, r5)
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000
            int r1 = r1 + 31
            int r2 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4b
            return r7
        L4b:
            r7 = 0
            r7.hashCode()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000(viva.republica.toss.send.periodic.PeriodicTransferListActivity):androidx.lifecycle.ViewModelProvider$onWarmupCompleted");
    }

    private final String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        if (i3 != 0) {
            return (String) value;
        }
        int i4 = 18 / 0;
        return (String) value;
    }

    public static final class getInterfaceDescriptor implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public getInterfaceDescriptor(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.IAuthTabCallback.getViewModelStore();
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallback_Parcel(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onExtraCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onWarmupCompleted.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    private static final Unit onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        markInitializableReactAndroid_release markinitializablereactandroid_releaseUpdateVisuals;
        int i = 2 % 2;
        int i2 = access000 + 79;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            markinitializablereactandroid_releaseUpdateVisuals = periodicTransferListActivity.updateVisuals();
        } else {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            markinitializablereactandroid_releaseUpdateVisuals = periodicTransferListActivity.updateVisuals();
        }
        markInitializableReactAndroid_release.onNavigationEvent(markinitializablereactandroid_releaseUpdateVisuals, false, null, 3, null);
        Unit unit = Unit.INSTANCE;
        int i3 = access000 + 1;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.send.periodic.PeriodicTransferListActivity r7, o.IEngagementSignalsCallbackDefault r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            int r1 = r8.onNavigationEvent()
            r2 = -1
            if (r1 != r2) goto L92
            android.content.Intent r1 = r8.onExtraCallbackWithResult()
            r2 = 0
            if (r1 == 0) goto L40
            int r3 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000
            int r3 = r3 + 41
            int r4 = r3 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor = r4
            int r3 = r3 % r0
            java.lang.String r3 = "result.is_toss_bank_highlight"
            boolean r1 = r1.getBooleanExtra(r3, r2)
            int r3 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor
            int r3 = r3 + 69
            int r4 = r3 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r4
            int r3 = r3 % r0
            if (r1 == 0) goto L40
            int r4 = r4 + 45
            int r1 = r4 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor = r1
            int r4 = r4 % r0
            r7.asBinder = r2
            o.markInitializableReactAndroid_release r1 = r7.updateVisuals()
            r1.onExtraCallbackWithResult()
        L40:
            android.content.Intent r1 = r8.onExtraCallbackWithResult()
            r3 = 0
            if (r1 == 0) goto L57
            int r4 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000
            int r4 = r4 + 105
            int r5 = r4 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor = r5
            int r4 = r4 % r0
            java.lang.String r4 = "result.periodic_transfer_unique_id"
            java.lang.String r1 = r1.getStringExtra(r4)
            goto L58
        L57:
            r1 = r3
        L58:
            android.content.Intent r8 = r8.onExtraCallbackWithResult()
            if (r8 == 0) goto L80
            java.lang.String r4 = "result.deleted"
            boolean r8 = r8.getBooleanExtra(r4, r2)
            int r4 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor
            int r5 = r4 + 3
            int r6 = r5 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r6
            int r5 = r5 % r0
            if (r8 == 0) goto L80
            int r4 = r4 + 101
            int r8 = r4 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r8
            int r4 = r4 % r0
            if (r1 == 0) goto L80
            o.markInitializableReactAndroid_release r7 = r7.updateVisuals()
            r7.IAuthTabCallback(r1)
            goto L92
        L80:
            if (r1 == 0) goto L87
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r1)
            goto L88
        L87:
            r8 = r3
        L88:
            o.markInitializableReactAndroid_release r7 = r7.updateVisuals()
            java.util.Collection r8 = (java.util.Collection) r8
            r0 = 1
            o.markInitializableReactAndroid_release.onNavigationEvent(r7, r2, r8, r0, r3)
        L92:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferListActivity.onExtraCallback(viva.republica.toss.send.periodic.PeriodicTransferListActivity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 99;
        getInterfaceDescriptor = i2 % 128;
        int[] iArr = {40, 8, 109, 7};
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(iArr, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0}, objArr);
            return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), setEngagementSignalsCallback())});
        }
        Object[] objArr2 = new Object[1];
        a(iArr, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0}, objArr2);
        Pair[] pairArr = new Pair[0];
        pairArr[1] = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), setEngagementSignalsCallback());
        return access8100.IAuthTabCallback(pairArr);
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        onExtraCallback(Object obj) {
            super(0, obj, markInitializableReactAndroid_release.class, "consumeHighlightUniqueIds", "consumeHighlightUniqueIds()V", 0);
        }

        public /* synthetic */ Object invoke() {
            onNavigationEvent();
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent() {
            ((markInitializableReactAndroid_release) ((CallableReference) this).receiver).onNavigationEvent();
        }
    }

    private static final Unit IAuthTabCallbackDefault(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = access000 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        periodicTransferListActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 21;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws Throwable {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            periodicTransferListActivity.validateRelationship();
            return Unit.INSTANCE;
        }
        periodicTransferListActivity.validateRelationship();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit getInterfaceDescriptor(PeriodicTransferListActivity periodicTransferListActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        markInitializableReactAndroid_release.onNavigationEvent(periodicTransferListActivity.updateVisuals(), false, null, 3, null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 65;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = access000 + 99;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), periodicTransferListActivity.getString(R.string.app_activity_periodic_transfer_list___3e6cec868a));
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        final PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1293925L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        periodicTransferListActivity.ICustomTabsServiceStub();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 111;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(PeriodicTransferListActivity periodicTransferListActivity, PeriodicTransferBannerResponse.Banner banner) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(banner, "");
            periodicTransferListActivity.onWarmupCompleted(banner);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(banner, "");
        periodicTransferListActivity.onWarmupCompleted(banner);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
            onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 846241727, -846241715, new Object[]{periodicTransferListActivity}, iOnNavigationEvent2, iOnNavigationEvent3);
            return Unit.INSTANCE;
        }
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent5 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent6 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent4, 846241727, -846241715, new Object[]{periodicTransferListActivity}, iOnNavigationEvent5, iOnNavigationEvent6);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 97;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            periodicTransferListActivity.onExtraCallback(iAuthTabCallbackStub, z);
            unit = Unit.INSTANCE;
            int i3 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            periodicTransferListActivity.onExtraCallback(iAuthTabCallbackStub, z);
            unit = Unit.INSTANCE;
        }
        int i4 = access000 + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
            onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1608483971, 1608483980, new Object[]{periodicTransferListActivity, iAuthTabCallbackStub}, iOnNavigationEvent2, iOnNavigationEvent3);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent5 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent6 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent4, -1608483971, 1608483980, new Object[]{periodicTransferListActivity, iAuthTabCallbackStub}, iOnNavigationEvent5, iOnNavigationEvent6);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        periodicTransferListActivity.onExtraCallback(iAuthTabCallbackStub);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 45;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.asInterface asinterface) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 69;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(asinterface, "");
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
            onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 772617237, -772617217, new Object[]{periodicTransferListActivity, asinterface}, iOnNavigationEvent2, iOnNavigationEvent3);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(asinterface, "");
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent5 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent6 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent4, 772617237, -772617217, new Object[]{periodicTransferListActivity, asinterface}, iOnNavigationEvent5, iOnNavigationEvent6);
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 49;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.access100 access100Var) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(access100Var, "");
            int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
            onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -378177770, 378177773, new Object[]{periodicTransferListActivity, access100Var}, iOnNavigationEvent2, iOnNavigationEvent3);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(access100Var, "");
        int iOnNavigationEvent4 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent5 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent6 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent4, -378177770, 378177773, new Object[]{periodicTransferListActivity, access100Var}, iOnNavigationEvent5, iOnNavigationEvent6);
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 123;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        Rect rect = (Rect) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 125;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rect, "");
            periodicTransferListActivity.IAuthTabCallback_Parcel = rect;
            periodicTransferListActivity.onNavigationEvent(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(rect, "");
        periodicTransferListActivity.IAuthTabCallback_Parcel = rect;
        periodicTransferListActivity.onNavigationEvent(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 69;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> $uiState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$uiState$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferListActivity.this.new onExtraCallbackWithResult(this.$uiState$delegate, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            PeriodicTransferListActivity.onExtraCallbackWithResult(PeriodicTransferListActivity.this, PeriodicTransferListActivity.IAuthTabCallback(this.$uiState$delegate).onWarmupCompleted());
            return Unit.INSTANCE;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> $uiState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$uiState$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferListActivity.this.new onWarmupCompleted(this.$uiState$delegate, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            PeriodicTransferListActivity.onWarmupCompleted(PeriodicTransferListActivity.this, PeriodicTransferListActivity.IAuthTabCallback(this.$uiState$delegate).IAuthTabCallback());
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> $uiState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$uiState$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferListActivity.this.new IAuthTabCallbackStub(this.$uiState$delegate, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            PeriodicTransferListActivity.onNavigationEvent(PeriodicTransferListActivity.this, PeriodicTransferListActivity.IAuthTabCallback(this.$uiState$delegate).IAuthTabCallback());
            return Unit.INSTANCE;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> $uiState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$uiState$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferListActivity.this.new asBinder(this.$uiState$delegate, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            PeriodicTransferListActivity.IAuthTabCallback(PeriodicTransferListActivity.this, PeriodicTransferListActivity.IAuthTabCallback(this.$uiState$delegate).onNavigationEvent());
            return Unit.INSTANCE;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferListActivity.this.new onTransact(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: viva.republica.toss.send.periodic.PeriodicTransferListActivity$onTransact$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<markInitializableReactAndroid_release.IAuthTabCallback, access13800<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PeriodicTransferListActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PeriodicTransferListActivity periodicTransferListActivity, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = periodicTransferListActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(markInitializableReactAndroid_release.IAuthTabCallback iAuthTabCallback, access13800<? super Unit> access13800Var) {
                return create(iAuthTabCallback, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                markInitializableReactAndroid_release.IAuthTabCallback iAuthTabCallback = (markInitializableReactAndroid_release.IAuthTabCallback) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    PeriodicTransferListActivity periodicTransferListActivity = this.this$0;
                    this.L$0 = access15400.onNavigationEvent(iAuthTabCallback);
                    this.label = 1;
                    if (PeriodicTransferListActivity.onWarmupCompleted(periodicTransferListActivity, iAuthTabCallback, (access13800) this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getTileModeX<markInitializableReactAndroid_release.IAuthTabCallback> gettilemodexOnExtraCallback = PeriodicTransferListActivity.IAuthTabCallbackStub(PeriodicTransferListActivity.this).onExtraCallback();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PeriodicTransferListActivity.this, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(gettilemodexOnExtraCallback, anonymousClass1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(final viva.republica.toss.send.periodic.PeriodicTransferListActivity r27, o.CameraCaptureResultEmptyCameraCaptureResult r28, int r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferListActivity.onExtraCallback(viva.republica.toss.send.periodic.PeriodicTransferListActivity, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    @Override // viva.republica.toss.send.periodic.Hilt_PeriodicTransferListActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-480079695, true, new PeriodicTransferListActivity$.ExternalSyntheticLambda1(this))), 1, (Object) null);
        IEngagementSignalsCallback();
        ConvertByteArrayToFloatArray.onExtraCallback(1294753L, false, (String) null, (Map) null, new PeriodicTransferListActivity$.ExternalSyntheticLambda2(this), 14, (Object) null);
        int i2 = access000 + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), "history");
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        return Unit.INSTANCE;
    }

    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = access000 + 17;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            this.asBinder = true;
        } else {
            Intrinsics.checkNotNullParameter(intent, "");
            super.onNewIntent(intent);
            this.asBinder = false;
        }
        this.IAuthTabCallback_Parcel = null;
        IEngagementSignalsCallback();
        updateVisuals().onExtraCallbackWithResult(true, (Collection<String>) ICustomTabsServiceDefault());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    private final Set<String> ICustomTabsServiceDefault() {
        Bundle extras;
        ?? string;
        Object next;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("uniqueIds")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("uniqueIds")) != 0) {
                    if (Intrinsics.areEqual(String.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Long.class)) {
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Short.class)) {
                        string = StringsKt.toShortOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        string = StringsKt.toByteOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else if (Intrinsics.areEqual(String.class, Character.class)) {
                        string = Character.valueOf(string.charAt(0));
                    } else if (!Intrinsics.areEqual(String.class, String.class)) {
                        if (Intrinsics.areEqual(String.class, Integer[].class)) {
                            List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : listSplit$default) {
                                if (((String) obj).length() > 0) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                            }
                            string = arrayList2.toArray(new Integer[0]);
                        } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                            List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : listSplit$default2) {
                                int i4 = getInterfaceDescriptor + 61;
                                access000 = i4 % 128;
                                int i5 = i4 % 2;
                                if (((String) obj2).length() > 0) {
                                    int i6 = getInterfaceDescriptor + 113;
                                    access000 = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        arrayList3.add(obj2);
                                        throw null;
                                    }
                                    arrayList3.add(obj2);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                            }
                            string = arrayList4.toArray(new Long[0]);
                        } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                            List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj3 : listSplit$default3) {
                                if (((String) obj3).length() > 0) {
                                    arrayList5.add(obj3);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                            }
                            string = arrayList6.toArray(new Float[0]);
                        } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                            List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj4 : listSplit$default4) {
                                if (((String) obj4).length() > 0) {
                                    arrayList7.add(obj4);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                            }
                            string = arrayList8.toArray(new Double[0]);
                        } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                            List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList9 = new ArrayList();
                            for (Object obj5 : listSplit$default5) {
                                if (((String) obj5).length() > 0) {
                                    int i7 = access000 + 83;
                                    getInterfaceDescriptor = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        arrayList9.add(obj5);
                                        obj.hashCode();
                                        throw null;
                                    }
                                    arrayList9.add(obj5);
                                }
                            }
                            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                            Iterator it5 = arrayList9.iterator();
                            while (it5.hasNext()) {
                                arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                            }
                            string = arrayList10.toArray(new Short[0]);
                        } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                            List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj6 : listSplit$default6) {
                                if (((String) obj6).length() > 0) {
                                    int i8 = access000 + 59;
                                    getInterfaceDescriptor = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        arrayList11.add(obj6);
                                        int i9 = 31 / 0;
                                    } else {
                                        arrayList11.add(obj6);
                                    }
                                }
                            }
                            ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                            Iterator it6 = arrayList11.iterator();
                            while (it6.hasNext()) {
                                arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                            }
                            string = arrayList12.toArray(new Byte[0]);
                        } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                            List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList13 = new ArrayList();
                            for (Object obj7 : listSplit$default7) {
                                if (((String) obj7).length() > 0) {
                                    arrayList13.add(obj7);
                                }
                            }
                            ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                            Iterator it7 = arrayList13.iterator();
                            while (it7.hasNext()) {
                                arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                            }
                            string = arrayList14.toArray(new Boolean[0]);
                        } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                            List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList15 = new ArrayList();
                            Iterator it8 = listSplit$default8.iterator();
                            while (it8.hasNext()) {
                                int i10 = access000 + 71;
                                getInterfaceDescriptor = i10 % 128;
                                if (i10 % 2 != 0) {
                                    ((String) it8.next()).length();
                                    throw null;
                                }
                                Object next2 = it8.next();
                                if (((String) next2).length() > 0) {
                                    int i11 = getInterfaceDescriptor + 45;
                                    access000 = i11 % 128;
                                    int i12 = i11 % 2;
                                    arrayList15.add(next2);
                                }
                            }
                            ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                            Iterator it9 = arrayList15.iterator();
                            while (it9.hasNext()) {
                                arrayList16.add(Character.valueOf(StringsKt.trim((String) it9.next()).toString().charAt(0)));
                            }
                            string = arrayList16.toArray(new Character[0]);
                        } else if (Intrinsics.areEqual(String.class, String[].class)) {
                            List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList17 = new ArrayList();
                            for (Object obj8 : listSplit$default9) {
                                if (((String) obj8).length() > 0) {
                                    arrayList17.add(obj8);
                                }
                            }
                            string = arrayList17.toArray(new String[0]);
                        } else {
                            Object[] enumConstants = String.class.getEnumConstants();
                            if (enumConstants != null) {
                                ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                for (Object obj9 : enumConstants) {
                                    Intrinsics.checkNotNull(obj9, "");
                                    arrayList18.add((Enum) obj9);
                                }
                                Iterator it10 = arrayList18.iterator();
                                while (true) {
                                    if (!it10.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it10.next();
                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                        break;
                                    }
                                }
                                string = (Enum) next;
                            } else {
                                string = 0;
                            }
                            if (string == 0) {
                                int i13 = access000 + 75;
                                getInterfaceDescriptor = i13 % 128;
                                int i14 = i13 % 2;
                                if (!(!zzaj.onNavigationEvent().onActivityLayout())) {
                                    throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                }
                                int i15 = getInterfaceDescriptor + 47;
                                access000 = i15 % 128;
                                int i16 = i15 % 2;
                                string = 0;
                            }
                        }
                    }
                    if (string instanceof String) {
                        obj = string;
                    } else {
                        int i17 = getInterfaceDescriptor + 109;
                        access000 = i17 % 128;
                        if (i17 % 2 == 0) {
                            throw null;
                        }
                    }
                    obj = (String) obj;
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj10 = extras3 != null ? extras3.get("uniqueIds") : null;
                obj = (String) (obj10 instanceof String ? obj10 : null);
            }
        }
        List listSplit$default10 = StringsKt.split$default((CharSequence) (obj == null ? "" : obj), new char[]{','}, false, 0, 6, (Object) null);
        ArrayList arrayList19 = new ArrayList();
        Iterator it11 = listSplit$default10.iterator();
        while (!(!it11.hasNext())) {
            Object next3 = it11.next();
            if (!StringsKt.isBlank((String) next3)) {
                arrayList19.add(next3);
            }
        }
        Set<String> set = CollectionsKt.toSet(arrayList19);
        getIntent().removeExtra("uniqueIds");
        return set;
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferListActivity.this.new IAuthTabCallbackDefault(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                PeriodicTransferListActivity periodicTransferListActivity = PeriodicTransferListActivity.this;
                this.label = 1;
                obj = PeriodicTransferListActivity.IAuthTabCallback(periodicTransferListActivity, (access13800) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            PeriodicTransferListActivity.IAuthTabCallbackStub(PeriodicTransferListActivity.this).IAuthTabCallback((KeyBoardVisiblePoint) obj);
            return Unit.INSTANCE;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallbackStubProxy;
        long j = 0;
        if (cArr != null) {
            int i6 = $10 + 81;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 35283), 35 - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 1;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = $11 + 101;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 10935), 64 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 28, 17657 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                try {
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16727749) - Color.rgb(0, 0, 0)), View.getDefaultSize(0, 0) + 70, Color.rgb(0, 0, 0) + 16789702, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i15 = $10 + 21;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 1, cArr5, 1, i3);
                System.arraycopy(cArr5, 0, cArr3, i3 * i5, i5);
                System.arraycopy(cArr5, i5, cArr3, 1, i3 % i5);
            } else {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i16 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr3, i16, i5);
                System.arraycopy(cArr6, i5, cArr3, 0, i16);
            }
        }
        if (z) {
            int i17 = $10 + 115;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr7 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i19 = $11 + 113;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final getPackageType IEngagementSignalsCallback() {
        int i = 2 % 2;
        getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
        int i2 = access000 + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return getpackagetypeOnNavigationEvent;
        }
        throw null;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super KeyBoardVisiblePoint>, Object> {
        final /* synthetic */ String $accountId;
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $accountType;
        final /* synthetic */ String $bankCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(String str, String str2, String str3, String str4, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$bankCode = str;
            this.$accountNumber = str2;
            this.$accountType = str3;
            this.$accountId = str4;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super KeyBoardVisiblePoint> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asInterface(this.$bankCode, this.$accountNumber, this.$accountType, this.$accountId, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            KeyBoardVisiblePoint keyBoardVisiblePointOnWarmupCompleted;
            String str2;
            KeyBoardVisiblePoint keyBoardVisiblePointIAuthTabCallback;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            String str3 = this.$bankCode;
            if (str3 != null && (str2 = this.$accountNumber) != null && (keyBoardVisiblePointIAuthTabCallback = PageShowPoint.Companion.IAuthTabCallback(str3, str2)) != null) {
                return keyBoardVisiblePointIAuthTabCallback;
            }
            onCollectWhenDestroy oncollectwhendestroyOnExtraCallbackWithResult = onCollectWhenDestroy.Companion.onExtraCallbackWithResult(this.$accountType);
            if (oncollectwhendestroyOnExtraCallbackWithResult == onCollectWhenDestroy.UNDEFINED || (str = this.$accountId) == null || (keyBoardVisiblePointOnWarmupCompleted = DERConstructedSet.onWarmupCompleted(str, oncollectwhendestroyOnExtraCallbackWithResult)) == null) {
                return null;
            }
            return keyBoardVisiblePointOnWarmupCompleted;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1006  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x1597  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x15b3  */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.app.Activity, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v180 */
    /* JADX WARN: Type inference failed for: r7v181 */
    /* JADX WARN: Type inference failed for: r7v182 */
    /* JADX WARN: Type inference failed for: r7v183 */
    /* JADX WARN: Type inference failed for: r7v184 */
    /* JADX WARN: Type inference failed for: r7v185 */
    /* JADX WARN: Type inference failed for: r7v186 */
    /* JADX WARN: Type inference failed for: r7v187 */
    /* JADX WARN: Type inference failed for: r7v188 */
    /* JADX WARN: Type inference failed for: r7v189 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(o.access13800<? super o.KeyBoardVisiblePoint> r32) {
        /*
            Method dump skipped, instructions count: 5609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferListActivity.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(final o.markInitializableReactAndroid_release.IAuthTabCallback r12, o.access13800<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferListActivity.IAuthTabCallback(o.markInitializableReactAndroid_release$IAuthTabCallback, o.access13800):java.lang.Object");
    }

    private static final Unit IAuthTabCallback(markInitializableReactAndroid_release.IAuthTabCallback iAuthTabCallback, PeriodicTransferListActivity periodicTransferListActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            ((markInitializableReactAndroid_release.IAuthTabCallback.onExtraCallback) iAuthTabCallback).onNavigationEvent();
            throw null;
        }
        if (((markInitializableReactAndroid_release.IAuthTabCallback.onExtraCallback) iAuthTabCallback).onNavigationEvent()) {
            periodicTransferListActivity.finish();
            int i3 = getInterfaceDescriptor + 11;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = getInterfaceDescriptor + 77;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "delete");
        setDetectableSize.onExtraCallback("periodic_transfer_id", iAuthTabCallbackStub.asInterface());
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 53;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallback(List<? extends markInitializableReactAndroid_release.IAuthTabCallback_Parcel> list) {
        int i = 2 % 2;
        int i2 = access000 + 49;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            list.isEmpty();
            obj.hashCode();
            throw null;
        }
        if (list.isEmpty()) {
            return;
        }
        List<? extends markInitializableReactAndroid_release.IAuthTabCallback_Parcel> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (next instanceof markInitializableReactAndroid_release.IAuthTabCallbackStub) {
                arrayList.add(next);
            }
        }
        ArrayList<markInitializableReactAndroid_release.IAuthTabCallbackStub> arrayList2 = new ArrayList();
        int i3 = getInterfaceDescriptor + 105;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 5;
        }
        for (Object obj2 : arrayList) {
            if (!((markInitializableReactAndroid_release.IAuthTabCallbackStub) obj2).onWarmupCompleted()) {
                arrayList2.add(obj2);
            }
        }
        for (final markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub : arrayList2) {
            ConvertByteArrayToFloatArray.onExtraCallback(1294753L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda9
                public final Object invoke(Object obj3) {
                    return PeriodicTransferListActivity.IAuthTabCallback(iAuthTabCallbackStub, this, (SetDetectableSize) obj3);
                }
            }, 14, (Object) null);
        }
        ArrayList<markInitializableReactAndroid_release.asInterface> arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof markInitializableReactAndroid_release.asInterface) {
                int i5 = getInterfaceDescriptor + 69;
                access000 = i5 % 128;
                if (i5 % 2 == 0) {
                    arrayList3.add(obj3);
                    obj.hashCode();
                    throw null;
                }
                arrayList3.add(obj3);
            }
        }
        int i6 = getInterfaceDescriptor + 97;
        access000 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 4 % 5;
        }
        for (final markInitializableReactAndroid_release.asInterface asinterface : arrayList3) {
            ConvertByteArrayToFloatArray.onExtraCallback(1296237L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda10
                public final Object invoke(Object obj4) {
                    return PeriodicTransferListActivity.IAuthTabCallback(asinterface, this, (SetDetectableSize) obj4);
                }
            }, 14, (Object) null);
            int i8 = access000 + 61;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static final Unit onWarmupCompleted(markInitializableReactAndroid_release.asInterface asinterface, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 53;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "banner");
        Object[] objArr2 = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), asinterface.IAuthTabCallback().onExtraCallback());
        Object[] objArr3 = new Object[1];
        a(new int[]{29, 11, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), asinterface.IAuthTabCallback().onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 33;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Iterator it;
        final int i = 0;
        final PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        List<PeriodicTransferModel> list = (List) objArr[1];
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 93;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        if (list != null) {
            int i6 = i3 + 69;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 != 0) {
                periodicTransferListActivity.IAuthTabCallback(list);
                it = list.iterator();
                i = 1;
            } else {
                periodicTransferListActivity.IAuthTabCallback(list);
                it = list.iterator();
            }
            while (it.hasNext()) {
                int i7 = getInterfaceDescriptor + 99;
                access000 = i7 % 128;
                if (i7 % 2 != 0) {
                    Object next = it.next();
                    if (i < 0) {
                        int i8 = access000 + 105;
                        getInterfaceDescriptor = i8 % 128;
                        int i9 = i8 % 2;
                        CollectionsKt.throwIndexOverflow();
                    }
                    final PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) next;
                    ConvertByteArrayToFloatArray.onExtraCallback(1293927L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda17
                        public final Object invoke(Object obj) {
                            return PeriodicTransferListActivity.onExtraCallbackWithResult(i, periodicTransferModel, periodicTransferListActivity, (SetDetectableSize) obj);
                        }
                    }, 14, (Object) null);
                    i++;
                } else {
                    it.next();
                    throw null;
                }
            }
        }
        return null;
    }

    private static final Unit onNavigationEvent(int i, PeriodicTransferModel periodicTransferModel, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        int i2 = 2 % 2;
        int i3 = access000 + 23;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("order", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("periodic_transfer_id", periodicTransferModel.onMessageChannelReady());
        if (!(!periodicTransferModel.ICustomTabsCallbackStub())) {
            int i5 = access000 + 9;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            str = "on";
        } else {
            str = "off";
        }
        setDetectableSize.onExtraCallback("status", str);
        setDetectableSize.onExtraCallback("amount", Long.valueOf(periodicTransferModel.onExtraCallback()));
        setDetectableSize.onExtraCallback("period", periodicTransferModel.IAuthTabCallback_Parcel());
        Object[] objArr = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), periodicTransferModel.writeTypedObject());
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        o.ConvertByteArrayToFloatArray.onExtraCallback(1293923, false, (java.lang.String) null, (java.util.Map) null, new viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda16(r11, r10), 14, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r11 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r11 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 73;
        viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(final java.util.List<viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel> r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.periodic.PeriodicTransferListActivity.getInterfaceDescriptor
            int r2 = r1 + 51
            int r3 = r2 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L15
            r2 = 66
            int r2 = r2 / 0
            if (r11 != 0) goto L1f
            goto L17
        L15:
            if (r11 != 0) goto L1f
        L17:
            int r1 = r1 + 73
            int r11 = r1 % 128
            viva.republica.toss.send.periodic.PeriodicTransferListActivity.access000 = r11
            int r1 = r1 % r0
            return
        L1f:
            r2 = 1293923(0x13be63, double:6.39283E-318)
            r4 = 0
            r5 = 0
            r6 = 0
            viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda16 r7 = new viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda16
            r7.<init>()
            r8 = 14
            r9 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r2, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.periodic.PeriodicTransferListActivity.IAuthTabCallback(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(List list, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        List<PeriodicTransferModel> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (PeriodicTransferModel periodicTransferModel : list2) {
                if (periodicTransferModel.ICustomTabsCallbackStub() && !periodicTransferModel.onUnminimized()) {
                    int i3 = access000 + 123;
                    getInterfaceDescriptor = i3 % 128;
                    int i4 = i3 % 2;
                    i++;
                    if (i < 0) {
                        CollectionsKt.throwCountOverflow();
                        int i5 = getInterfaceDescriptor + 95;
                        access000 = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            }
        }
        int size = list.size();
        setDetectableSize.onExtraCallback("on_cnt", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("off_cnt", Integer.valueOf(size - i));
        Object[] objArr = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), periodicTransferListActivity.updateVisuals().onExtraCallbackWithResult((Context) periodicTransferListActivity));
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i7 = access000 + 91;
        getInterfaceDescriptor = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        if (!z || this.asBinder) {
            return;
        }
        int i2 = getInterfaceDescriptor + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Rect rect = this.IAuthTabCallback_Parcel;
        if (rect != null) {
            this.asBinder = true;
            updateVisuals().IAuthTabCallback();
            TdsHighlightV3View.onExtraCallbackWithResult onextracallbackwithresult = TdsHighlightV3View.Companion;
            int iOnExtraCallback = setTagsokhttp.onExtraCallback(this, 20);
            String string = getString(R.string.app_transfer_periodic_transfer_list_highlight_toss_bank);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsHighlightV3View.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, this, rect, string, generateAppWithState.onWarmupCompleted.BOTTOM, generateAppWithState.onExtraCallback.CENTER, generateAppWithState.onNavigationEvent.WEAK, false, 1, Integer.valueOf(iOnExtraCallback), (generateAppWithState.onExtraCallbackWithResult) null, 256, (Object) null);
            int i4 = getInterfaceDescriptor + 95;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit asBinder(PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "history");
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 121;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1293931L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        SessionTrackerb sessionTrackerbIAuthTabCallback = IAuthTabCallback();
        Object[] objArr = new Object[1];
        Object obj = null;
        a(new int[]{48, 37, 93, 26}, true, null, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, this, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = access000 + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(PeriodicTransferBannerResponse.Banner banner) throws Throwable {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 81;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            strOnExtraCallback = banner.onExtraCallback();
            int i3 = 48 / 0;
            if (strOnExtraCallback == null) {
                return;
            }
        } else {
            strOnExtraCallback = banner.onExtraCallback();
            if (strOnExtraCallback == null) {
                return;
            }
        }
        if (URLUtil.isNetworkUrl(strOnExtraCallback)) {
            String strIAuthTabCallback = mergeParams.IAuthTabCallback(strOnExtraCallback, (String) null, 1, (Object) null);
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{0, 20, 0, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strIAuthTabCallback);
            strOnExtraCallback = sb.toString();
            int i4 = access000 + 109;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        SessionTrackerb.onNavigationEvent(IAuthTabCallback(), this, strOnExtraCallback, this.onTransact, (Bundle) null, 8, (Object) null);
    }

    private static final Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        List<markInitializableReactAndroid_release.IAuthTabCallback_Parcel> listOnWarmupCompleted = ((markInitializableReactAndroid_release.access000) periodicTransferListActivity.updateVisuals().onWarmupCompleted().IAuthTabCallback()).onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnWarmupCompleted) {
            int i2 = getInterfaceDescriptor + 7;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            if (obj instanceof markInitializableReactAndroid_release.IAuthTabCallbackStub) {
                arrayList.add(obj);
            }
        }
        setDetectableSize.onExtraCallback("order", Integer.valueOf(arrayList.indexOf(iAuthTabCallbackStub)));
        setDetectableSize.onExtraCallback("periodic_transfer_id", iAuthTabCallbackStub.asInterface());
        if (z) {
            int i4 = access000 + 23;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str = "on";
        } else {
            str = "off";
        }
        setDetectableSize.onExtraCallback("status", str);
        setDetectableSize.onExtraCallback("amount", Long.valueOf(iAuthTabCallbackStub.onNavigationEvent()));
        setDetectableSize.onExtraCallback("period", iAuthTabCallbackStub.onExtraCallbackWithResult());
        Object[] objArr = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), iAuthTabCallbackStub.onExtraCallback());
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(final markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, final boolean z) throws Throwable {
        int i = 2 % 2;
        IAuthTabCallback(((markInitializableReactAndroid_release.access000) updateVisuals().onWarmupCompleted().IAuthTabCallback()).IAuthTabCallback());
        ConvertByteArrayToFloatArray.onExtraCallback(1293929L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.onExtraCallbackWithResult(this.f$0, iAuthTabCallbackStub, z, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Object[] objArr = {this, iAuthTabCallbackStub, Boolean.valueOf(z)};
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -5276492, 5276503, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
        int i2 = getInterfaceDescriptor + 67;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        List<markInitializableReactAndroid_release.IAuthTabCallback_Parcel> listOnWarmupCompleted = ((markInitializableReactAndroid_release.access000) periodicTransferListActivity.updateVisuals().onWarmupCompleted().IAuthTabCallback()).onWarmupCompleted();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            int i2 = access000 + 69;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                next = it.next();
                int i3 = 0 / 0;
                if (next instanceof markInitializableReactAndroid_release.IAuthTabCallbackStub) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                if (next instanceof markInitializableReactAndroid_release.IAuthTabCallbackStub) {
                    arrayList.add(next);
                }
            }
        }
        setDetectableSize.onExtraCallback("order", Integer.valueOf(arrayList.indexOf(iAuthTabCallbackStub)));
        setDetectableSize.onExtraCallback("periodic_transfer_id", iAuthTabCallbackStub.asInterface());
        if (iAuthTabCallbackStub.onWarmupCompleted()) {
            int i4 = access000 + 105;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                iAuthTabCallbackStub.asBinder();
                throw null;
            }
            if (iAuthTabCallbackStub.asBinder() || !iAuthTabCallbackStub.IAuthTabCallbackStub()) {
                str = "off";
            } else {
                int i5 = access000 + 61;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                str = "on";
            }
            setDetectableSize.onExtraCallback("status", str);
        }
        setDetectableSize.onExtraCallback("amount", Long.valueOf(iAuthTabCallbackStub.onNavigationEvent()));
        setDetectableSize.onExtraCallback("period", iAuthTabCallbackStub.onExtraCallbackWithResult());
        Object[] objArr = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), iAuthTabCallbackStub.onExtraCallback());
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "delete");
        setDetectableSize.onExtraCallback("periodic_transfer_id", iAuthTabCallbackStub.asInterface());
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 5;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(final markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1293931L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                Object[] objArr = {iAuthTabCallbackStub, this, (SetDetectableSize) obj};
                return (Unit) PeriodicTransferListActivity.onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -2080113093, 2080113097, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
            }
        }, 14, (Object) null);
        onNavigationEvent(iAuthTabCallbackStub);
        int i2 = access000 + 125;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(markInitializableReactAndroid_release.asInterface asinterface, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "banner");
        Object[] objArr2 = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), asinterface.IAuthTabCallback().onExtraCallback());
        Object[] objArr3 = new Object[1];
        a(new int[]{29, 11, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), asinterface.IAuthTabCallback().onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback(periodicTransferListActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 45;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        String strOnNavigationEvent;
        String strOnNavigationEvent2;
        final ?? r2 = (PeriodicTransferListActivity) objArr[0];
        final markInitializableReactAndroid_release.asInterface asinterface = (markInitializableReactAndroid_release.asInterface) objArr[1];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1296239L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.onNavigationEvent(asinterface, r2, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        PeriodicTransferBannerResponse.Button buttonIAuthTabCallback = asinterface.IAuthTabCallback().IAuthTabCallback();
        if (buttonIAuthTabCallback != null) {
            int i2 = access000 + 95;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                buttonIAuthTabCallback.onNavigationEvent();
                throw null;
            }
            strOnNavigationEvent = buttonIAuthTabCallback.onNavigationEvent();
        } else {
            strOnNavigationEvent = null;
        }
        if (strOnNavigationEvent != null && strOnNavigationEvent.length() != 0) {
            SessionTrackerb sessionTrackerbIAuthTabCallback = r2.IAuthTabCallback();
            PeriodicTransferBannerResponse.Button buttonIAuthTabCallback2 = asinterface.IAuthTabCallback().IAuthTabCallback();
            if (buttonIAuthTabCallback2 != null) {
                int i3 = getInterfaceDescriptor + 31;
                access000 = i3 % 128;
                if (i3 % 2 == 0) {
                    buttonIAuthTabCallback2.onNavigationEvent();
                    throw null;
                }
                strOnNavigationEvent2 = buttonIAuthTabCallback2.onNavigationEvent();
            } else {
                strOnNavigationEvent2 = null;
            }
            SessionTrackerb.onNavigationEvent(sessionTrackerbIAuthTabCallback, (Context) r2, strOnNavigationEvent2, ((PeriodicTransferListActivity) r2).onTransact, (Bundle) null, 8, (Object) null);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ?? r2 = (PeriodicTransferListActivity) objArr[0];
        markInitializableReactAndroid_release.access100 access100Var = (markInitializableReactAndroid_release.access100) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (access100Var.IAuthTabCallback().length() > 0) {
            SessionTrackerb.IAuthTabCallback(r2.IAuthTabCallback(), (Activity) r2, access100Var.IAuthTabCallback(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        int i4 = access000 + 47;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ List<PeriodicTransferModel> $periodicTransferItems;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(List<PeriodicTransferModel> list, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$periodicTransferItems = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PeriodicTransferListActivity.this.new access100(this.$periodicTransferItems, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List list;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                BaseActivity.IAuthTabCallback(PeriodicTransferListActivity.this, (String) null, false, 3, (Object) null);
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null);
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) this.L$0;
                ResultKt.onNavigationEvent(obj);
                list = list2;
                PeriodicTransferListActivity.this.bo_();
                final PeriodicTransferListActivity periodicTransferListActivity = PeriodicTransferListActivity.this;
                new FilteringAccountBottomSheet(periodicTransferListActivity, list, (Map) obj, this.$periodicTransferItems, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$showFilteringAccountBottomSheet$1$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2) {
                        return PeriodicTransferListActivity.access100.onNavigationEvent(periodicTransferListActivity, (KeyBoardVisiblePoint) obj2);
                    }
                }).show();
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            List list3 = (List) obj;
            GeckoHubImp geckoHubImpIAuthTabCallback2 = putChannelInfo.IAuthTabCallback();
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(list3, this.$periodicTransferItems, null);
            this.L$0 = list3;
            this.label = 2;
            Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback2, onextracallbackwithresult, this);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                list = list3;
                obj = objOnExtraCallback;
                PeriodicTransferListActivity.this.bo_();
                final PeriodicTransferListActivity periodicTransferListActivity2 = PeriodicTransferListActivity.this;
                new FilteringAccountBottomSheet(periodicTransferListActivity2, list, (Map) obj, this.$periodicTransferItems, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$showFilteringAccountBottomSheet$1$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj2) {
                        return PeriodicTransferListActivity.access100.onNavigationEvent(periodicTransferListActivity2, (KeyBoardVisiblePoint) obj2);
                    }
                }).show();
                return Unit.INSTANCE;
            }
            return objOnWarmupCompleted;
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends KeyBoardVisiblePoint>>, Object> {
            int label;

            onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onWarmupCompleted(access13800Var);
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<? extends KeyBoardVisiblePoint>> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                DERConstructedSequence dERConstructedSequence = DERConstructedSequence.onNavigationEvent;
                PageShowPoint.onWarmupCompleted onwarmupcompleted = PageShowPoint.Companion;
                return dERConstructedSequence.IAuthTabCallback(CollectionsKt.plus(onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.asInterface()));
            }
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<KeyBoardVisiblePoint, ? extends Integer>>, Object> {
            final /* synthetic */ List<KeyBoardVisiblePoint> $allAccounts;
            final /* synthetic */ List<PeriodicTransferModel> $periodicTransferItems;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(List<? extends KeyBoardVisiblePoint> list, List<PeriodicTransferModel> list2, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$allAccounts = list;
                this.$periodicTransferItems = list2;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallbackWithResult(this.$allAccounts, this.$periodicTransferItems, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Map<KeyBoardVisiblePoint, Integer>> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                List<KeyBoardVisiblePoint> list = this.$allAccounts;
                List<PeriodicTransferModel> list2 = this.$periodicTransferItems;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj2 : list) {
                    KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) obj2;
                    List<PeriodicTransferModel> list3 = list2;
                    int i = 0;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            if (((PeriodicTransferModel) it.next()).onWarmupCompleted(keyBoardVisiblePoint) && (i = i + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    linkedHashMap.put(obj2, access14000.onNavigationEvent(i));
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, KeyBoardVisiblePoint keyBoardVisiblePoint) {
            PeriodicTransferListActivity.IAuthTabCallbackStub(periodicTransferListActivity).IAuthTabCallback(keyBoardVisiblePoint);
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        PeriodicTransferListActivity periodicTransferListActivity = (PeriodicTransferListActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 95;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((markInitializableReactAndroid_release.access000) periodicTransferListActivity.updateVisuals().onWarmupCompleted().IAuthTabCallback()).IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        List<PeriodicTransferModel> listIAuthTabCallback = ((markInitializableReactAndroid_release.access000) periodicTransferListActivity.updateVisuals().onWarmupCompleted().IAuthTabCallback()).IAuthTabCallback();
        if (listIAuthTabCallback == null) {
            return null;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(periodicTransferListActivity), (CoroutineContext) null, (setRandomHost) null, periodicTransferListActivity.new access100(listIAuthTabCallback, null), 3, (Object) null);
        int i3 = access000 + 85;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        ?? r1 = (PeriodicTransferListActivity) objArr[0];
        markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub = (markInitializableReactAndroid_release.IAuthTabCallbackStub) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        r1.updateVisuals().onNavigationEvent(r1, iAuthTabCallbackStub);
        int i4 = access000 + 3;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePointOnExtraCallback = ((markInitializableReactAndroid_release.access000) updateVisuals().onWarmupCompleted().IAuthTabCallback()).onExtraCallback();
        ReactContextExceptionHandlerWrapper reactContextExceptionHandlerWrapperOnExtraCallback = ReactContextExceptionHandlerWrapper.Companion.onExtraCallback(keyBoardVisiblePointOnExtraCallback);
        if (keyBoardVisiblePointOnExtraCallback == null || (strOnExtraCallbackWithResult = keyBoardVisiblePointOnExtraCallback.onExtraCallbackWithResult()) == null) {
            int i4 = getInterfaceDescriptor + 69;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 3;
            }
            strOnExtraCallbackWithResult = "";
        }
        this.IAuthTabCallbackStub.onNavigationEvent(PeriodicTransferPostActivity.onWarmupCompleted.onNavigationEvent(PeriodicTransferPostActivity.Companion, this, new ModuleSpecCompanion(0L, (String) null, (String) null, reactContextExceptionHandlerWrapperOnExtraCallback, strOnExtraCallbackWithResult, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ReceiverTab) null, 524263, (DefaultConstructorMarker) null), false, false, setEngagementSignalsCallback(), 12, (Object) null));
        int i6 = access000 + 125;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        ?? r0 = (PeriodicTransferListActivity) objArr[0];
        PeriodicTransferModel periodicTransferModel = (PeriodicTransferModel) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            ((PeriodicTransferListActivity) r0).IAuthTabCallbackStub.onNavigationEvent(PeriodicTransferPostActivity.Companion.onNavigationEvent((Context) r0, periodicTransferModel, r0.setEngagementSignalsCallback()));
            return null;
        }
        ((PeriodicTransferListActivity) r0).IAuthTabCallbackStub.onNavigationEvent(PeriodicTransferPostActivity.Companion.onNavigationEvent((Context) r0, periodicTransferModel, r0.setEngagementSignalsCallback()));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        updateVisuals().onExtraCallback((Context) this, iAuthTabCallbackStub);
        int i4 = getInterfaceDescriptor + 89;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(final markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.onWarmupCompleted(iAuthTabCallbackStub, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = getInterfaceDescriptor + 55;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
        Object[] objArr3 = new Object[1];
        a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), "cancel");
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 49;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1293933L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
        Object[] objArr2 = new Object[1];
        a(new int[]{25, 4, 166, 0}, false, new byte[]{0, 1, 1, 1}, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), "delete");
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1293933L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda14
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.onExtraCallback(commonModule_setLeftEdgeTouchEnabled, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        periodicTransferListActivity.IAuthTabCallback(iAuthTabCallbackStub);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 81;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onTransact(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new int[]{20, 5, 0, 5}, false, new byte[]{0, 1, 1, 0, 1}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), commonModule_setLeftEdgeTouchEnabled.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 87;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(final markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, final PeriodicTransferListActivity periodicTransferListActivity, final CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access000 + 117;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(iAuthTabCallbackStub.IAuthTabCallbackDefault() ? periodicTransferListActivity.getString(R.string.auto_transfer_delayed) : periodicTransferListActivity.getString(R.string.auto_transfer_delete_alert));
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.close, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (DialogInterface) obj};
                return (Unit) PeriodicTransferListActivity.onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -81814310, 81814328, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
            }
        }, 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, R.string.delete, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.onWarmupCompleted(this.f$0, iAuthTabCallbackStub, commonModule_setLeftEdgeTouchEnabled, (DialogInterface) obj);
            }
        }, 6, (Object) null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        ConvertByteArrayToFloatArray.onExtraCallback(1293921L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.periodic.PeriodicTransferListActivity$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return PeriodicTransferListActivity.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 33;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return unit;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intent onWarmupCompleted(IAuthTabCallback iAuthTabCallback, Context context, KeyBoardVisiblePoint keyBoardVisiblePoint, Collection collection, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                keyBoardVisiblePoint = null;
            }
            if ((i & 4) != 0) {
                collection = CollectionsKt.emptyList();
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return iAuthTabCallback.onExtraCallback(context, keyBoardVisiblePoint, collection, z);
        }

        public final Intent onExtraCallback(@NotNull Context context, @Nullable KeyBoardVisiblePoint keyBoardVisiblePoint, @NotNull Collection<String> collection, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(collection, "");
            Intent intent = new Intent(context, (Class<?>) PeriodicTransferListActivity.class);
            if (keyBoardVisiblePoint != null) {
                intent.putExtra("accountType", keyBoardVisiblePoint.onWarmupCompleted().getName());
                intent.putExtra("accountId", keyBoardVisiblePoint.onExtraCallbackWithResult());
            }
            if (!collection.isEmpty()) {
                intent.putExtra("uniqueIds", CollectionsKt.joinToString$default(collection, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
            }
            if (z) {
                intent.putExtra("isTossBankHighlight", true);
            }
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, viva.republica.toss.send.periodic.PeriodicTransferListActivity] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static final String IAuthTabCallbackStubProxy(PeriodicTransferListActivity periodicTransferListActivity) throws Throwable {
        Bundle extras;
        Object obj;
        Object next;
        int i;
        int i2 = 2 % 2;
        Intent intent = periodicTransferListActivity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        Object[] objArr = new Object[1];
        a(new int[]{40, 8, 109, 7}, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0}, objArr);
        if (!extras.containsKey(((String) objArr[0]).intern())) {
            return null;
        }
        if (!zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                Object[] objArr2 = new Object[1];
                a(new int[]{40, 8, 109, 7}, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0}, objArr2);
                obj = extras2.get(((String) objArr2[0]).intern());
            } else {
                obj = null;
            }
            return (String) (obj instanceof String ? obj : null);
        }
        int i3 = access000 + 117;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            intent.getExtras();
            throw null;
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null) {
            return null;
        }
        Object[] objArr3 = new Object[1];
        a(new int[]{40, 8, 109, 7}, true, new byte[]{0, 1, 0, 1, 1, 1, 1, 0}, objArr3);
        ?? string = extras3.getString(((String) objArr3[0]).intern());
        if (string == 0) {
            return null;
        }
        if (Intrinsics.areEqual(String.class, Integer.class)) {
            int i4 = getInterfaceDescriptor + 101;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            string = StringsKt.toIntOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Long.class)) {
            string = StringsKt.toLongOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Float.class)) {
            string = StringsKt.toFloatOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Double.class)) {
            string = StringsKt.toDoubleOrNull((String) string);
        } else if (Intrinsics.areEqual(String.class, Short.class)) {
            string = StringsKt.toShortOrNull((String) string);
        } else {
            if (Intrinsics.areEqual(String.class, Byte.class)) {
                Byte byteOrNull = StringsKt.toByteOrNull((String) string);
                i = access000 + 65;
                string = byteOrNull;
            } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                i = access000 + 121;
                string = boolValueOf;
            } else if (Intrinsics.areEqual(String.class, Character.class)) {
                string = Character.valueOf(string.charAt(0));
            } else if (!Intrinsics.areEqual(String.class, String.class)) {
                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listSplit$default) {
                        if (((String) obj2).length() > 0) {
                            int i6 = access000 + 123;
                            getInterfaceDescriptor = i6 % 128;
                            int i7 = i6 % 2;
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i8 = getInterfaceDescriptor + 71;
                        access000 = i8 % 128;
                        int i9 = i8 % 2;
                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                    }
                    string = arrayList2.toArray(new Integer[0]);
                } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                    List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listSplit$default2) {
                        if (((String) obj3).length() > 0) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                    }
                    string = arrayList4.toArray(new Long[0]);
                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                    List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : listSplit$default3) {
                        if (((String) obj4).length() > 0) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                    }
                    string = arrayList6.toArray(new Float[0]);
                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                    List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj5 : listSplit$default4) {
                        if (((String) obj5).length() > 0) {
                            arrayList7.add(obj5);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                    }
                    string = arrayList8.toArray(new Double[0]);
                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                    List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj6 : listSplit$default5) {
                        if (((String) obj6).length() > 0) {
                            arrayList9.add(obj6);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                    }
                    string = arrayList10.toArray(new Short[0]);
                } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                    List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it6 = listSplit$default6.iterator();
                    while (it6.hasNext()) {
                        int i10 = getInterfaceDescriptor + 75;
                        access000 = i10 % 128;
                        if (i10 % 2 == 0) {
                            ((String) it6.next()).length();
                            throw null;
                        }
                        Object next2 = it6.next();
                        if (((String) next2).length() > 0) {
                            arrayList11.add(next2);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                    Iterator it7 = arrayList11.iterator();
                    while (it7.hasNext()) {
                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it7.next()).toString())));
                    }
                    string = arrayList12.toArray(new Byte[0]);
                } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                    List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj7 : listSplit$default7) {
                        if (((String) obj7).length() > 0) {
                            arrayList13.add(obj7);
                        }
                    }
                    ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                    Iterator it8 = arrayList13.iterator();
                    while (it8.hasNext()) {
                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it8.next()).toString())));
                    }
                    string = arrayList14.toArray(new Boolean[0]);
                } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                    List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList15 = new ArrayList();
                    for (Object obj8 : listSplit$default8) {
                        if (((String) obj8).length() > 0) {
                            arrayList15.add(obj8);
                        }
                    }
                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                    Iterator it9 = arrayList15.iterator();
                    while (it9.hasNext()) {
                        arrayList16.add(Character.valueOf(StringsKt.trim((String) it9.next()).toString().charAt(0)));
                    }
                    string = arrayList16.toArray(new Character[0]);
                } else if (Intrinsics.areEqual(String.class, String[].class)) {
                    List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList17 = new ArrayList();
                    for (Object obj9 : listSplit$default9) {
                        if (((String) obj9).length() > 0) {
                            int i11 = getInterfaceDescriptor + 7;
                            access000 = i11 % 128;
                            if (i11 % 2 == 0) {
                                arrayList17.add(obj9);
                                throw null;
                            }
                            arrayList17.add(obj9);
                        }
                    }
                    string = arrayList17.toArray(new String[0]);
                } else {
                    Object[] enumConstants = String.class.getEnumConstants();
                    if (enumConstants != null) {
                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                        for (Object obj10 : enumConstants) {
                            int i12 = getInterfaceDescriptor + 39;
                            access000 = i12 % 128;
                            int i13 = i12 % 2;
                            Intrinsics.checkNotNull(obj10, "");
                            arrayList18.add((Enum) obj10);
                        }
                        Iterator it10 = arrayList18.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it10.next();
                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                break;
                            }
                        }
                        string = (Enum) next;
                    } else {
                        string = 0;
                    }
                    if (string == 0) {
                        int i14 = access000 + 69;
                        getInterfaceDescriptor = i14 % 128;
                        int i15 = i14 % 2;
                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                            throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                        }
                        string = 0;
                    }
                }
            }
            getInterfaceDescriptor = i % 128;
            int i16 = i % 2;
        }
        return (String) (string instanceof String ? string : null);
    }

    private static final markInitializableReactAndroid_release.access000 onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<markInitializableReactAndroid_release.access000> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        markInitializableReactAndroid_release.access000 access000Var = (markInitializableReactAndroid_release.access000) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return access000Var;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, PeriodicTransferListActivity periodicTransferListActivity, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -2080113093, 2080113097, new Object[]{iAuthTabCallbackStub, periodicTransferListActivity, setDetectableSize}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.access100 access100Var) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1804212438, 1804212443, new Object[]{periodicTransferListActivity, access100Var}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(PeriodicTransferListActivity periodicTransferListActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1527991927, -1527991913, new Object[]{periodicTransferListActivity, iEngagementSignalsCallbackDefault}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -81814310, 81814328, new Object[]{commonModule_setLeftEdgeTouchEnabled, dialogInterface}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity, markInitializableReactAndroid_release.asInterface asinterface) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 675665725, -675665724, new Object[]{periodicTransferListActivity, asinterface}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(PeriodicTransferListActivity periodicTransferListActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {periodicTransferListActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -1086882860, 1086882867, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(PeriodicTransferListActivity periodicTransferListActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {periodicTransferListActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 681102181, -681102164, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
    }

    private static final Unit onNavigationEvent(PeriodicTransferListActivity periodicTransferListActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Rect rect) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1838404138, 1838404153, new Object[]{periodicTransferListActivity, cameraPresenceProviderExternalSyntheticLambda6, rect}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit asInterface(PeriodicTransferListActivity periodicTransferListActivity) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1826858330, 1826858346, new Object[]{periodicTransferListActivity}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit access100(PeriodicTransferListActivity periodicTransferListActivity) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1897607487, -1897607477, new Object[]{periodicTransferListActivity}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit IAuthTabCallback_Parcel(PeriodicTransferListActivity periodicTransferListActivity) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1597873281, 1597873281, new Object[]{periodicTransferListActivity}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void onExtraCallbackWithResult(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) throws Throwable {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1608483971, 1608483980, new Object[]{this, iAuthTabCallbackStub}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void onNavigationEvent(markInitializableReactAndroid_release.asInterface asinterface) throws Throwable {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 772617237, -772617217, new Object[]{this, asinterface}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void onNavigationEvent(markInitializableReactAndroid_release.access100 access100Var) throws Throwable {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -378177770, 378177773, new Object[]{this, access100Var}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void onNavigationEvent(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub, boolean z) throws Throwable {
        Object[] objArr = {this, iAuthTabCallbackStub, Boolean.valueOf(z)};
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -5276492, 5276503, objArr, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent());
    }

    private final void onExtraCallback(PeriodicTransferModel periodicTransferModel) throws Throwable {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1707391343, 1707391351, new Object[]{this, periodicTransferModel}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1499692250, 1499692252, new Object[]{commonModule_setLeftEdgeTouchEnabled, dialogInterface}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private static final Unit onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1669714278, -1669714265, new Object[]{commonModule_setLeftEdgeTouchEnabled, setDetectableSize}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void access200() throws Throwable {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 846241727, -846241715, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void onNavigationEvent(List<PeriodicTransferModel> list) throws Throwable {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, -1686258353, 1686258359, new Object[]{this, list}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    private final void onWarmupCompleted(markInitializableReactAndroid_release.IAuthTabCallbackStub iAuthTabCallbackStub) throws Throwable {
        int iOnNavigationEvent = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = TransactionFilterLocal.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = TransactionFilterLocal.Companion.onNavigationEvent();
        onExtraCallback(TransactionFilterLocal.Companion.onNavigationEvent(), iOnNavigationEvent, 1829435404, -1829435385, new Object[]{this, iAuthTabCallbackStub}, iOnNavigationEvent2, iOnNavigationEvent3);
    }

    @Override // viva.republica.toss.send.periodic.Hilt_PeriodicTransferListActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
    }

    @Override // viva.republica.toss.send.periodic.Hilt_PeriodicTransferListActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
    }

    @Override // viva.republica.toss.send.periodic.Hilt_PeriodicTransferListActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 37;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.send.periodic.Hilt_PeriodicTransferListActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 9;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStubProxy = new char[]{27255, 27194, 27196, 27172, 27173, 27197, 27199, 27199, 27197, 27160, 27258, 27233, 27165, 27168, 27181, 27166, 27156, 27197, 27169, 27162, 27252, 27168, 27168, 27198, 27174, 27331, 27474, 27476, 27486, 27257, 27168, 27170, 27168, 27196, 27170, 27171, 27172, 27173, 27170, 27178, 27175, 27286, 27281, 27286, 27292, 27292, 27286, 27281, 27266, 27272, 27265, 27276, 27267, 27330, 27265, 27276, 27277, 27294, 27269, 27376, 27265, 27295, 27330, 27330, 27353, 27294, 27294, 27266, 27295, 27265, 27276, 27267, 27292, 27294, 27288, 27265, 27266, 27295, 27294, 27272, 27275, 27330, 27278, 27272, 27279};
    }
}
