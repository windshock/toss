package o;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C0081cookieJar;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.areAllItemsEnabled;
import o.getTimebase;
import o.hasProvider;
import o.wa;

/* renamed from: o.cookieJar, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class C0081cookieJar {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    public static final C0081cookieJar onNavigationEvent = new C0081cookieJar();
    private static getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-535660309, false, new getBacktraceNote() { // from class: im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt$$ExternalSyntheticLambda5
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit unitOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i2 % 128;
            areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                unitOnWarmupCompleted = C0081cookieJar.onWarmupCompleted(areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = 35 / 0;
            } else {
                unitOnWarmupCompleted = C0081cookieJar.onWarmupCompleted(areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            int i4 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(385353220, false, new Function2() { // from class: im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt$$ExternalSyntheticLambda6
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 != 0) {
                C0081cookieJar.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = C0081cookieJar.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            int i3 = onWarmupCompleted + 101;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return getbacktracenote;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        getTimebase gettimebase = (getTimebase) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(gettimebase, context);
        }
        onWarmupCompleted(gettimebase, context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | (~i3) | i5)) | (~(i5 | i2 | i3));
        int i10 = ~i5;
        int i11 = (~(i3 | i2)) | (~(i10 | i3)) | (~(i10 | i2));
        int i12 = i5 + i2 + i4 + (1698977638 * i) + (1466394737 * i6);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i5) - 490274816) + ((-1116082190) * i2) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i4) + (1553727488 * i) + (1859780608 * i6) + (925827072 * i13);
        int i15 = ((i5 * (-1787956080)) - 1478154965) + (i2 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i4 * (-1787955639)) + (i * 552005654) + (i6 * (-2013897159)) + (i13 * (-429457408));
        int i16 = i14 + (i15 * i15 * (-402587648));
        return i16 != 1 ? i16 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(context);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(context);
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(view);
        int i4 = IAuthTabCallback + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(context, gettimebase);
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallback(areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getTimebase gettimebase, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(gettimebase, tdsListHeaderV3View);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(gettimebase, tdsListHeaderV3View);
        int i3 = IAuthTabCallback + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallbackDefault + 87;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallback + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-535660309, i, -1, "im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt.lambda$-535660309.<anonymous> (TdsListHeaderV3View.kt:176)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 47;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 73;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 95 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(Context context, getTimebase gettimebase) {
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Toast.makeText(context, "TextButton Title", 1).show();
            iOnNavigationEvent = onNavigationEvent(gettimebase) >>> 1;
        } else {
            Toast.makeText(context, "TextButton Title", 0).show();
            iOnNavigationEvent = onNavigationEvent(gettimebase) + 1;
        }
        onExtraCallback(gettimebase, iOnNavigationEvent);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(context, "Right", 0).show();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(view.getContext(), "ListHeaderV3", 0).show();
        int i4 = IAuthTabCallback + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(getTimebase gettimebase, TdsListHeaderV3View tdsListHeaderV3View) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
            tdsListHeaderV3View.IAuthTabCallbackStubProxy();
            throw null;
        }
        Intrinsics.checkNotNullParameter(tdsListHeaderV3View, "");
        getFollowRedirectsokhttp getfollowredirectsokhttpIAuthTabCallbackStubProxy = tdsListHeaderV3View.IAuthTabCallbackStubProxy();
        if (getfollowredirectsokhttpIAuthTabCallbackStubProxy != null) {
            getfollowredirectsokhttpIAuthTabCallbackStubProxy.onNavigationEvent("TextButton Title " + onNavigationEvent(gettimebase));
            int i3 = IAuthTabCallback + 13;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 65;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallback + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(385353220, i, -1, "im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt.lambda$385353220.<anonymous> (TdsListHeaderV3View.kt:381)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i7 = onExtraCallback + 11;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                objOnMinimized = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            final getTimebase gettimebase = (getTimebase) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 61;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        getTimebase gettimebase2 = gettimebase;
                        Context context = (Context) obj2;
                        if (i11 == 0) {
                            int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
                            int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
                            return (TdsListHeaderV3View) C0081cookieJar.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), 1375952851, iIAuthTabCallback, new Object[]{gettimebase2, context}, iIAuthTabCallback2, -1375952849, OverseasRrnInputTextField.IAuthTabCallback());
                        }
                        int iIAuthTabCallback3 = OverseasRrnInputTextField.IAuthTabCallback();
                        int iIAuthTabCallback4 = OverseasRrnInputTextField.IAuthTabCallback();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            Function1 function1 = (Function1) objOnMinimized2;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = IAuthTabCallback + 37;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnWarmupCompleted = C0081cookieJar.onWarmupCompleted(gettimebase, (TdsListHeaderV3View) obj2);
                        int i12 = IAuthTabCallback + 73;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function1, (QuirksExternalSyntheticBackport0) null, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 390, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 57;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = IAuthTabCallback + 27;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final TdsListHeaderV3View onWarmupCompleted(final getTimebase gettimebase, final Context context) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        TdsListHeaderV3View tdsListHeaderV3View = new TdsListHeaderV3View(context, null, 0, 6, null);
        TdsListHeaderV3View.setTitleType$default(tdsListHeaderV3View, TdsListHeaderV3View.onNavigationEvent.TEXT_BUTTON, (String) null, (Function0) null, 6, (Object) null);
        getFollowRedirectsokhttp getfollowredirectsokhttpIAuthTabCallbackStubProxy = tdsListHeaderV3View.IAuthTabCallbackStubProxy();
        if (getfollowredirectsokhttpIAuthTabCallbackStubProxy != null) {
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getfollowredirectsokhttpIAuthTabCallbackStubProxy.onNavigationEvent("TextButton Title");
            int i4 = onExtraCallback + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 2;
            }
        }
        getFollowRedirectsokhttp getfollowredirectsokhttpIAuthTabCallbackStubProxy2 = tdsListHeaderV3View.IAuthTabCallbackStubProxy();
        if (getfollowredirectsokhttpIAuthTabCallbackStubProxy2 != null) {
            getfollowredirectsokhttpIAuthTabCallbackStubProxy2.onNavigationEvent(new Function0() { // from class: im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitOnWarmupCompleted = C0081cookieJar.onWarmupCompleted(context, gettimebase);
                    int i9 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            });
        }
        tdsListHeaderV3View.setRightType(TdsListHeaderV3View.onExtraCallback.TEXT);
        tdsListHeaderV3View.setArrowVisible(true);
        hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
        int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().IEngagementSignalsCallbackStub(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null));
        try {
            iAuthTabCallback.IAuthTabCallback("오른");
            Unit unit = Unit.INSTANCE;
            iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
            iAuthTabCallback.IAuthTabCallback("쪽");
            tdsListHeaderV3View.setRightText(iAuthTabCallback.onExtraCallbackWithResult());
            getMinWebSocketMessageToCompressokhttp getminwebsocketmessagetocompressokhttpIAuthTabCallback = tdsListHeaderV3View.IAuthTabCallback();
            if (getminwebsocketmessagetocompressokhttpIAuthTabCallback != null) {
                getminwebsocketmessagetocompressokhttpIAuthTabCallback.IAuthTabCallback(new Function0() { // from class: im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = onNavigationEvent + 89;
                        onExtraCallbackWithResult = i7 % 128;
                        if (i7 % 2 == 0) {
                            Object[] objArr = {context};
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Object[] objArr2 = {context};
                        Unit unit2 = (Unit) C0081cookieJar.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), -1390228322, OverseasRrnInputTextField.IAuthTabCallback(), objArr2, OverseasRrnInputTextField.IAuthTabCallback(), 1390228323, OverseasRrnInputTextField.IAuthTabCallback());
                        int i8 = onNavigationEvent + 15;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        return unit2;
                    }
                });
            }
            tdsListHeaderV3View.setOnClickListener(new View.OnClickListener() { // from class: im.toss.tds.view.compat.component.compound.listheader.ComposableSingletons$TdsListHeaderV3ViewKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 103;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    C0081cookieJar.onExtraCallbackWithResult(view);
                    int i9 = onExtraCallback + 93;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
            });
            tdsListHeaderV3View.setVerticalPadding(wa.IAuthTabCallbackStub.Companion.onExtraCallbackWithResult());
            tdsListHeaderV3View.setHorizontalPadding(wa.onExtraCallback.Companion.onExtraCallbackWithResult());
            return tdsListHeaderV3View;
        } catch (Throwable th) {
            iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
            throw th;
        }
    }

    private static final int onNavigationEvent(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            gettimebase.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        int i3 = onExtraCallback + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        throw null;
    }

    private static final void onExtraCallback(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        if (i4 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ TdsListHeaderV3View IAuthTabCallback(getTimebase gettimebase, Context context) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (TdsListHeaderV3View) onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), 1375952851, iIAuthTabCallback, new Object[]{gettimebase, context}, iIAuthTabCallback2, -1375952849, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context) {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), -1390228322, iIAuthTabCallback, new Object[]{context}, iIAuthTabCallback2, 1390228323, OverseasRrnInputTextField.IAuthTabCallback());
    }

    public final getBacktraceNote<areAllItemsEnabled, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        int iIAuthTabCallback2 = OverseasRrnInputTextField.IAuthTabCallback();
        return (getBacktraceNote) onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), 377973122, iIAuthTabCallback, new Object[]{this}, iIAuthTabCallback2, -377973122, OverseasRrnInputTextField.IAuthTabCallback());
    }
}
