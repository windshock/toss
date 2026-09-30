package im.toss.tosssecurities.widget.watchlist.setting.watchlist;

import androidx.lifecycle.ViewModel;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.overview.Product;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import im.toss.tosssecurities.core.account.domain.model.Account;
import im.toss.tosssecurities.core.account.domain.model.AccountList;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.KSerializer;
import o.CloseableUtils;
import o.DiskLruCacheEditornewSink11;
import o.DiskLruCacheEntry;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.RealImageLoaderKtCoroutineScopeinlinedCoroutineExceptionHandler1;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.decodeIpv6;
import o.findRes;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getCurrentEditorokhttp;
import o.getShine;
import o.getTileModeX;
import o.getTileModeY;
import o.getWrite;
import o.onLoadStarted;
import o.q8a;
import o.r0b;
import o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU;
import o.r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo;
import o.r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg;
import o.registerClient;
import o.setAdUnitIds;
import o.setCustomerUserId;
import o.setRipple;
import o.setRubIn;
import o.setShine;
import o.sp;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WidgetWatchlistSelectViewModel extends ViewModel {
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int onRelationshipValidationResult = 1;
    private static int onUnminimized;
    private final getBorderRadius<String> IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final getCornerRadius<Long> IAuthTabCallbackStub;
    private final setRubIn<Boolean> IAuthTabCallbackStubProxy;
    private final setRubIn<Boolean> IAuthTabCallback_Parcel;
    private final setRubIn<Boolean> ICustomTabsCallback;
    private final r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU ICustomTabsCallbackStub;
    private final registerClient access000;
    private final setRubIn<DisplaySetting> access100;
    private final r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo asBinder;
    private final getCornerRadius<List<WidgetWatchlists.WatchList>> asInterface;
    private final setRubIn<Long> extraCallback;
    private final getTileModeX<String> extraCallbackWithResult;
    private final Lazy getInterfaceDescriptor;
    private final getBorderRadius<Pair<Integer, String>> onActivityLayout;
    private final findResAndMsg onActivityResized;
    private final getCornerRadius<Boolean> onExtraCallback;
    private final getCornerRadius<Float> onExtraCallbackWithResult;
    private final DiskLruCacheEntry onMessageChannelReady;
    private final setRubIn<List<WidgetWatchlists.WatchList>> onMinimized;
    private final setRubIn<Boolean> onPostMessage;
    private final setRubIn<Float> onTransact;
    private final getCornerRadius<DisplaySetting> onWarmupCompleted;
    private final decodeIpv6 readTypedObject;
    private List<? extends OverviewItemInfo> writeTypedObject;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onNavigationEvent = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = WidgetWatchlistSelectViewModel.this;
            if (i3 != 0) {
                return widgetWatchlistSelectViewModel.onExtraCallback(this);
            }
            widgetWatchlistSelectViewModel.onExtraCallback(this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = WidgetWatchlistSelectViewModel.onExtraCallback(WidgetWatchlistSelectViewModel.this, this);
            int i4 = onExtraCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static {
        int i = onRelationshipValidationResult + 115;
        onUnminimized = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~i2;
        int i11 = i9 | (~(i7 | i10 | i5));
        int i12 = (~(i2 | i8)) | i7 | (~(i10 | i5));
        int i13 = i4 + i5 + i + (1112421973 * i6) + ((-1897213938) * i3);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i4) - 781189120) + ((-1395624931) * i5) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i) + ((-1446510592) * i6) + (892338176 * i3) + ((-1657864192) * i14);
        int i16 = (i4 * 2010092721) + 1217064380 + (i5 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i * 2010091741) + (i6 * (-1378896031)) + (i3 * 856652822) + (i14 * 563281920);
        switch (i15 + (i16 * i16 * (-1077346304))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) objArr[0];
                int i17 = 2 % 2;
                int i18 = ICustomTabsCallbackDefault;
                int i19 = i18 + 25;
                ICustomTabsCallbackStubProxy = i19 % 128;
                int i20 = i19 % 2;
                setRubIn<List<WidgetWatchlists.WatchList>> setrubin = widgetWatchlistSelectViewModel.onMinimized;
                int i21 = i18 + 29;
                ICustomTabsCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                return setrubin;
            case 6:
                return asInterface(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 5;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject();
        int i4 = ICustomTabsCallbackStubProxy + 123;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ DiskLruCacheEditornewSink11.IAuthTabCallback onExtraCallbackWithResult(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 11;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {widgetWatchlistSelectViewModel};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 != 0) {
            iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, 1254269661, objArr, -1254269657, iOnWarmupCompleted3);
            int i4 = 79 / 0;
        } else {
            iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, 1254269661, objArr, -1254269657, iOnWarmupCompleted3);
        }
        int i5 = ICustomTabsCallbackStubProxy + 93;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2010692965, new Object[0], -2010692959, iOnWarmupCompleted3);
        int i4 = ICustomTabsCallbackDefault + 63;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return unit;
    }

    public static final class IAuthTabCallbackStub extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ WidgetWatchlistSelectViewModel onNavigationEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
            super(onwarmupcompleted);
            this.onNavigationEvent = widgetWatchlistSelectViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                WidgetWatchlistSelectViewModel.onExtraCallback(this.onNavigationEvent, th);
                obj.hashCode();
                throw null;
            }
            WidgetWatchlistSelectViewModel.onExtraCallback(this.onNavigationEvent, th);
            int i3 = onWarmupCompleted + 65;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class asBinder implements IAnimation<Boolean> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ WidgetWatchlistSelectViewModel IAuthTabCallback;
        final /* synthetic */ IAnimation onExtraCallback;

        /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$asBinder$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements setRipple {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ setRipple IAuthTabCallback;
            final /* synthetic */ WidgetWatchlistSelectViewModel onNavigationEvent;

            /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$asBinder$4$5, reason: invalid class name */
            public static final class AnonymousClass5 extends ContinuationImpl {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass5(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 25;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass4.this.emit(null, this);
                    int i4 = onExtraCallback + 65;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 37 / 0;
                    }
                    return objEmit;
                }
            }

            public AnonymousClass4(setRipple setripple, WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
                this.IAuthTabCallback = setripple;
                this.onNavigationEvent = widgetWatchlistSelectViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass5 anonymousClass5;
                T next;
                boolean z;
                boolean z2;
                boolean z3;
                Boolean boolOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallback + 39;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 18 / 0;
                    if (access13800Var instanceof AnonymousClass5) {
                        anonymousClass5 = (AnonymousClass5) access13800Var;
                        int i4 = anonymousClass5.label;
                        if ((i4 & Integer.MIN_VALUE) != 0) {
                            anonymousClass5.label = i4 - 2147483648;
                            int i5 = onWarmupCompleted + 53;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                        } else {
                            anonymousClass5 = new AnonymousClass5(access13800Var);
                        }
                    }
                } else if (access13800Var instanceof AnonymousClass5) {
                }
                Object obj2 = anonymousClass5.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i7 = anonymousClass5.label;
                if (i7 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.IAuthTabCallback;
                    Long l = (Long) obj;
                    Object[] objArr = {this.onNavigationEvent};
                    Iterator<T> it = ((List) ((setRubIn) WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2046877714, objArr, 2046877719, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).IAuthTabCallback()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        long jLongValue = ((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{(WidgetWatchlists.WatchList) next}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue();
                        if (l != null && jLongValue == l.longValue()) {
                            break;
                        }
                    }
                    WidgetWatchlists.WatchList watchList = (WidgetWatchlists.WatchList) next;
                    if (watchList == null) {
                        boolOnNavigationEvent = access14000.onNavigationEvent(false);
                    } else {
                        List listOnExtraCallbackWithResult = watchList.onExtraCallbackWithResult();
                        if (listOnExtraCallbackWithResult == null || !listOnExtraCallbackWithResult.isEmpty()) {
                            z = false;
                        } else {
                            int i8 = onExtraCallback + 17;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            z = true;
                        }
                        if (watchList.asInterface() == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH) {
                            z2 = true;
                        } else {
                            int i10 = onWarmupCompleted + 25;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            z2 = false;
                        }
                        if (!z || z2) {
                            z3 = false;
                        } else {
                            int i12 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            z3 = true;
                        }
                        boolOnNavigationEvent = access14000.onNavigationEvent(z3);
                    }
                    anonymousClass5.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass5.L$1 = access15400.onNavigationEvent(anonymousClass5);
                    anonymousClass5.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass5.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass5.I$0 = 0;
                    anonymousClass5.label = 1;
                    if (setripple.emit(boolOnNavigationEvent, anonymousClass5) == objOnExtraCallback) {
                        int i14 = onExtraCallback + 9;
                        onWarmupCompleted = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 14 / 0;
                        }
                        return objOnExtraCallback;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = onExtraCallback + 33;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    ResultKt.onNavigationEvent(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public asBinder(IAnimation iAnimation, WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
            this.onExtraCallback = iAnimation;
            this.IAuthTabCallback = widgetWatchlistSelectViewModel;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super Boolean> setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onExtraCallback.collect(new AnonymousClass4(setripple, this.IAuthTabCallback), access13800Var);
            if (objCollect != access14100.onExtraCallback()) {
                return Unit.INSTANCE;
            }
            int i2 = onNavigationEvent + 41;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objCollect;
        }
    }

    public static final class onTransact implements IAnimation<Boolean> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ IAnimation IAuthTabCallback;

        /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$onTransact$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements setRipple {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ setRipple IAuthTabCallback;

            /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$onTransact$4$4, reason: invalid class name and collision with other inner class name */
            public static final class C00034 extends ContinuationImpl {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public C00034(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 21;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj2 = null;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    if (i3 == 0) {
                        return anonymousClass4.emit(null, this);
                    }
                    anonymousClass4.emit(null, this);
                    obj2.hashCode();
                    throw null;
                }
            }

            public AnonymousClass4(setRipple setripple) {
                this.IAuthTabCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                C00034 c00034;
                boolean z;
                int i = 2 % 2;
                if (access13800Var instanceof C00034) {
                    int i2 = onNavigationEvent + 55;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    c00034 = (C00034) access13800Var;
                    int i4 = c00034.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c00034.label = i4 - 2147483648;
                    } else {
                        c00034 = new C00034(access13800Var);
                        int i5 = onExtraCallback + 31;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                Object obj2 = c00034.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i7 = c00034.label;
                if (i7 != 0) {
                    int i8 = onExtraCallback + 47;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                } else {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.IAuthTabCallback;
                    if (((Long) obj) != null) {
                        z = true;
                    } else {
                        int i9 = onNavigationEvent + 17;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        z = false;
                    }
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
                    c00034.L$0 = access15400.onNavigationEvent(obj);
                    c00034.L$1 = access15400.onNavigationEvent(c00034);
                    c00034.L$2 = access15400.onNavigationEvent(obj);
                    c00034.L$3 = access15400.onNavigationEvent(setripple);
                    c00034.I$0 = 0;
                    c00034.label = 1;
                    if (setripple.emit(boolOnNavigationEvent, c00034) == objOnExtraCallback) {
                        int i11 = onExtraCallback + 35;
                        onNavigationEvent = i11 % 128;
                        if (i11 % 2 == 0) {
                            return objOnExtraCallback;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public onTransact(IAnimation iAnimation) {
            this.IAuthTabCallback = iAnimation;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super Boolean> setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.IAuthTabCallback.collect(new AnonymousClass4(setripple), access13800Var);
            if (objCollect == access14100.onExtraCallback()) {
                int i2 = onNavigationEvent + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return objCollect;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    @Inject
    public WidgetWatchlistSelectViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull setAdUnitIds setadunitids, @NotNull r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, @NotNull decodeIpv6 decodeipv6, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso, @NotNull registerClient registerclient) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(r8lambdakeemxoi4two_xjjc4c2vgm4dau, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(r8lambdaws9z36z_nyqlya8ut2rf642vcso, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.ICustomTabsCallbackStub = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        this.readTypedObject = decodeipv6;
        this.onMessageChannelReady = diskLruCacheEntry;
        this.asBinder = r8lambdaws9z36z_nyqlya8ut2rf642vcso;
        this.access000 = registerclient;
        Integer num = (Integer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("appWidgetId");
        if (num != null) {
            iIntValue = num.intValue();
            int i = ICustomTabsCallbackStubProxy + 89;
            ICustomTabsCallbackDefault = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            int i4 = ICustomTabsCallbackDefault + 9;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            iIntValue = 0;
        }
        this.IAuthTabCallbackDefault = iIntValue;
        this.getInterfaceDescriptor = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult;
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    iAuthTabCallbackOnExtraCallbackWithResult = WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(this.f$0);
                    int i8 = 82 / 0;
                } else {
                    iAuthTabCallbackOnExtraCallbackWithResult = WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(this.f$0);
                }
                int i9 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    return iAuthTabCallbackOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onActivityLayout = RealImageLoaderKtCoroutineScopeinlinedCoroutineExceptionHandler1.onWarmupCompleted();
        findResAndMsg findresandmsgIAuthTabCallback = findRes.IAuthTabCallback(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), new IAuthTabCallbackStub(CoroutineExceptionHandler.extraCallbackWithResult, this));
        this.onActivityResized = findresandmsgIAuthTabCallback;
        getCornerRadius<DisplaySetting> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(registerclient.onNavigationEvent());
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent;
        this.access100 = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent);
        getCornerRadius<Float> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(Float.valueOf(1.0f));
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent2;
        this.onTransact = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent2);
        getCornerRadius<List<WidgetWatchlists.WatchList>> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent(CollectionsKt__CollectionsKt.emptyList());
        this.asInterface = getcornerradiusOnNavigationEvent3;
        setRubIn<List<WidgetWatchlists.WatchList>> setrubinOnExtraCallback = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent3);
        this.onMinimized = setrubinOnExtraCallback;
        getCornerRadius<Long> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent(null);
        this.IAuthTabCallbackStub = getcornerradiusOnNavigationEvent4;
        setRubIn<Long> setrubinOnExtraCallback2 = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent4);
        this.extraCallback = setrubinOnExtraCallback2;
        onTransact ontransact = new onTransact(setrubinOnExtraCallback2);
        getTileModeY.onWarmupCompleted onwarmupcompleted = getTileModeY.Companion;
        getTileModeY gettilemodeyIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
        Boolean bool = Boolean.FALSE;
        this.IAuthTabCallback_Parcel = ycxycx.IAuthTabCallback(ontransact, findresandmsgIAuthTabCallback, gettilemodeyIAuthTabCallback, bool);
        this.ICustomTabsCallback = ycxycx.IAuthTabCallback(new asBinder(setrubinOnExtraCallback2, this), findresandmsgIAuthTabCallback, onwarmupcompleted.IAuthTabCallback(), bool);
        this.IAuthTabCallbackStubProxy = ycxycx.IAuthTabCallback((IAnimation<? extends Boolean>) ycxycx.onWarmupCompleted(setrubinOnExtraCallback, setrubinOnExtraCallback2, new onExtraCallbackWithResult(null)), findresandmsgIAuthTabCallback, onwarmupcompleted.IAuthTabCallback(), bool);
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent5 = setShine.onNavigationEvent(bool);
        this.onExtraCallback = getcornerradiusOnNavigationEvent5;
        this.onPostMessage = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent5);
        this.writeTypedObject = CollectionsKt__CollectionsKt.emptyList();
        getBorderRadius<String> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(1, 0, CloseableUtils.DROP_OLDEST, 2, null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted;
        this.extraCallbackWithResult = ycxycx.onExtraCallbackWithResult((getBorderRadius) getborderradiusOnWarmupCompleted);
        if (!setadunitids.IAuthTabCallback()) {
            getborderradiusOnWarmupCompleted.onNavigationEvent("관심 종목을 확인하려면 로그인이 필요해요");
            return;
        }
        int i6 = ICustomTabsCallbackStubProxy + 39;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        readTypedObject();
        int i8 = ICustomTabsCallbackDefault + 33;
        ICustomTabsCallbackStubProxy = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 3 / 0;
        }
    }

    public static final /* synthetic */ Object IAuthTabCallback(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = widgetWatchlistSelectViewModel.onNavigationEvent((access13800<? super Unit>) access13800Var);
        int i4 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackIAuthTabCallback_Parcel = widgetWatchlistSelectViewModel.IAuthTabCallback_Parcel();
        int i4 = ICustomTabsCallbackDefault + 51;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return iAuthTabCallbackIAuthTabCallback_Parcel;
    }

    public static final /* synthetic */ List IAuthTabCallbackDefault(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        List<WidgetWatchlists.WatchList> listAccess100 = widgetWatchlistSelectViewModel.access100();
        int i4 = ICustomTabsCallbackDefault + 39;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return listAccess100;
    }

    public static final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU asInterface(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 17;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau = widgetWatchlistSelectViewModel.ICustomTabsCallbackStub;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 119;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return r8lambdakeemxoi4two_xjjc4c2vgm4dau;
    }

    public static final /* synthetic */ int onExtraCallback(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 101;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = widgetWatchlistSelectViewModel.IAuthTabCallbackDefault;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i3 + 77;
        ICustomTabsCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
        return i5;
    }

    public static final /* synthetic */ Object onExtraCallback(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 59;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = widgetWatchlistSelectViewModel.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 107;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onExtraCallback(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 103;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1046645862, new Object[]{widgetWatchlistSelectViewModel, th}, 1046645865, iOnWarmupCompleted3);
            return;
        }
        int iOnWarmupCompleted4 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted5 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted6 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(iOnWarmupCompleted5, iOnWarmupCompleted4, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1046645862, new Object[]{widgetWatchlistSelectViewModel, th}, 1046645865, iOnWarmupCompleted6);
        int i3 = 39 / 0;
    }

    public static final /* synthetic */ registerClient onNavigationEvent(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 101;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        registerClient registerclient = widgetWatchlistSelectViewModel.access000;
        if (i4 != 0) {
            int i5 = 40 / 0;
        }
        int i6 = i2 + 37;
        ICustomTabsCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return registerclient;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onTransact(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<List<WidgetWatchlists.WatchList>> getcornerradius = widgetWatchlistSelectViewModel.asInterface;
        if (i3 != 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ decodeIpv6 onWarmupCompleted(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 73;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        decodeIpv6 decodeipv6 = widgetWatchlistSelectViewModel.readTypedObject;
        int i5 = i2 + 41;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return decodeipv6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback_Parcel() {
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) this.getInterfaceDescriptor.getValue();
            int i3 = 6 / 0;
        } else {
            iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) this.getInterfaceDescriptor.getValue();
        }
        int i4 = ICustomTabsCallbackDefault + 23;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        DiskLruCacheEntry diskLruCacheEntry = widgetWatchlistSelectViewModel.onMessageChannelReady;
        if (i3 == 0) {
            diskLruCacheEntry.IAuthTabCallback();
            throw null;
        }
        DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback2 = diskLruCacheEntry.IAuthTabCallback();
        int i4 = ICustomTabsCallbackStubProxy + 63;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return IAuthTabCallback2;
    }

    public final getBorderRadius<Pair<Integer, String>> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 71;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getBorderRadius<Pair<Integer, String>> getborderradius = this.onActivityLayout;
        int i4 = i2 + 113;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return getborderradius;
        }
        throw null;
    }

    public final setRubIn<DisplaySetting> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 11;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<DisplaySetting> setrubin = this.access100;
        int i4 = i3 + 115;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    public final setRubIn<Float> onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 93;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        setRubIn<Float> setrubin = this.onTransact;
        int i4 = i3 + 15;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return setrubin;
        }
        throw null;
    }

    private final List<WidgetWatchlists.WatchList> access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 105;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        List<WidgetWatchlists.WatchList> listIAuthTabCallback = this.onMinimized.IAuthTabCallback();
        int i4 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return listIAuthTabCallback;
    }

    public final setRubIn<Long> onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 77;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<Long> setrubin = this.extraCallback;
        int i4 = i2 + 97;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    public final setRubIn<Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<Boolean> asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 69;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        setRubIn<Boolean> setrubin = this.ICustomTabsCallback;
        int i5 = i3 + 17;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final setRubIn<Boolean> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 5;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Boolean> setrubin = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 19;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements getBacktraceNote<List<? extends WidgetWatchlists.WatchList>, Long, access13800<? super Boolean>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(3, access13800Var);
        }

        @Override // o.getBacktraceNote
        public /* synthetic */ Object invoke(List<? extends WidgetWatchlists.WatchList> list, Long l, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            List<? extends WidgetWatchlists.WatchList> list2 = list;
            Long l2 = l;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(list2, l2, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(list2, l2, access13800Var);
            int i3 = 89 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(List<WidgetWatchlists.WatchList> list, Long l, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            onextracallbackwithresult.L$0 = list;
            onextracallbackwithresult.L$1 = l;
            Object objInvokeSuspend = onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            int i = 2 % 2;
            List list = (List) this.L$0;
            Long l = (Long) this.L$1;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            boolean z = false;
            if (l != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int i4 = IAuthTabCallback + 95;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        next = null;
                        break;
                    }
                    int i6 = IAuthTabCallback + 19;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    next = it.next();
                    if (((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{(WidgetWatchlists.WatchList) next}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue() == l.longValue()) {
                        int i8 = IAuthTabCallback + 75;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        break;
                    }
                }
                WidgetWatchlists.WatchList watchList = (WidgetWatchlists.WatchList) next;
                if ((watchList != null ? watchList.asInterface() : null) == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH) {
                    z = true;
                }
            }
            return access14000.onNavigationEvent(z);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 61;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Boolean> setrubin = widgetWatchlistSelectViewModel.onPostMessage;
        int i5 = i2 + 7;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getTileModeX<String> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 105;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<String> gettilemodex = this.extraCallbackWithResult;
        int i5 = i2 + 39;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = WidgetWatchlistSelectViewModel.this.new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg2, access13800Var2);
            }
            onExtraCallback(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
        
            if (r7 != r3) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
        
            if (r2 == r3) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[PHI: r4 r7
          0x00b9: PHI (r4v23 o.getCornerRadius) = (r4v25 o.getCornerRadius), (r4v28 o.getCornerRadius) binds: [B:32:0x00b7, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x00b9: PHI (r7v11 java.lang.Object) = (r7v17 java.lang.Object), (r7v18 java.lang.Object) binds: [B:32:0x00b7, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            getCornerRadius getcornerradiusOnTransact;
            List listEmptyList;
            Object objOnExtraCallback2;
            long jLongValue;
            Object objOnExtraCallback3;
            Object objOnNavigationEvent;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback4 = access14100.onExtraCallback();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                decodeIpv6 decodeipv6OnWarmupCompleted = WidgetWatchlistSelectViewModel.onWarmupCompleted(WidgetWatchlistSelectViewModel.this);
                this.L$0 = findresandmsg;
                this.label = 1;
                objOnExtraCallback = decodeipv6OnWarmupCompleted.onExtraCallback(this);
                if (objOnExtraCallback != objOnExtraCallback4) {
                }
                return objOnExtraCallback4;
            }
            if (i2 != 1) {
                int i3 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0 ? i2 == 2 : i2 == 2) {
                    ResultKt.onNavigationEvent(obj);
                    getcornerradiusOnTransact = WidgetWatchlistSelectViewModel.onTransact(WidgetWatchlistSelectViewModel.this);
                    decodeIpv6 decodeipv6OnWarmupCompleted2 = WidgetWatchlistSelectViewModel.onWarmupCompleted(WidgetWatchlistSelectViewModel.this);
                    this.L$0 = findresandmsg;
                    this.L$1 = getcornerradiusOnTransact;
                    this.label = 3;
                    objOnNavigationEvent = decodeipv6OnWarmupCompleted2.onNavigationEvent(this);
                    if (objOnNavigationEvent != objOnExtraCallback4) {
                        if (((Boolean) objOnNavigationEvent).booleanValue()) {
                            r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauAsInterface = WidgetWatchlistSelectViewModel.asInterface(WidgetWatchlistSelectViewModel.this);
                            this.L$0 = findresandmsg;
                            this.L$1 = getcornerradiusOnTransact;
                            this.label = 4;
                            objOnExtraCallback3 = r8lambdakeemxoi4two_xjjc4c2vgm4dauAsInterface.onExtraCallback(this);
                        }
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        getcornerradiusOnTransact.onWarmupCompleted(CollectionsKt___CollectionsKt.plus((Collection) listEmptyList, (Iterable) CollectionsKt__CollectionsJVMKt.listOf(new WidgetWatchlists.WatchList(-1L, (List) null, "지수", r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX, 2, (DefaultConstructorMarker) null))));
                        DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback = WidgetWatchlistSelectViewModel.IAuthTabCallback(WidgetWatchlistSelectViewModel.this);
                        String strOnExtraCallbackWithResult = WidgetWatchlistSelectViewModel.Companion.onExtraCallbackWithResult(WidgetWatchlistSelectViewModel.onExtraCallback(WidgetWatchlistSelectViewModel.this));
                        KSerializer<Long> kSerializerOnNavigationEvent = sp.onNavigationEvent(LongCompanionObject.INSTANCE);
                        this.L$0 = findresandmsg;
                        this.L$1 = null;
                        this.label = 5;
                        objOnExtraCallback2 = IAuthTabCallback.onExtraCallback(strOnExtraCallbackWithResult, kSerializerOnNavigationEvent, this);
                    }
                    return objOnExtraCallback4;
                }
                if (i2 == 3) {
                    getcornerradiusOnTransact = (getCornerRadius) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = obj;
                    if (((Boolean) objOnNavigationEvent).booleanValue()) {
                    }
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    getcornerradiusOnTransact.onWarmupCompleted(CollectionsKt___CollectionsKt.plus((Collection) listEmptyList, (Iterable) CollectionsKt__CollectionsJVMKt.listOf(new WidgetWatchlists.WatchList(-1L, (List) null, "지수", r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX, 2, (DefaultConstructorMarker) null))));
                    DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback2 = WidgetWatchlistSelectViewModel.IAuthTabCallback(WidgetWatchlistSelectViewModel.this);
                    String strOnExtraCallbackWithResult2 = WidgetWatchlistSelectViewModel.Companion.onExtraCallbackWithResult(WidgetWatchlistSelectViewModel.onExtraCallback(WidgetWatchlistSelectViewModel.this));
                    KSerializer<Long> kSerializerOnNavigationEvent2 = sp.onNavigationEvent(LongCompanionObject.INSTANCE);
                    this.L$0 = findresandmsg;
                    this.L$1 = null;
                    this.label = 5;
                    objOnExtraCallback2 = IAuthTabCallback2.onExtraCallback(strOnExtraCallbackWithResult2, kSerializerOnNavigationEvent2, this);
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        objOnExtraCallback2 = obj;
                        Long l = (Long) objOnExtraCallback2;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            Iterator it = WidgetWatchlistSelectViewModel.IAuthTabCallbackDefault(WidgetWatchlistSelectViewModel.this).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (((WidgetWatchlists.WatchList) next).asInterface() == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH) {
                                    obj2 = next;
                                    break;
                                }
                            }
                            WidgetWatchlists.WatchList watchList = (WidgetWatchlists.WatchList) obj2;
                            if (watchList != null) {
                                jLongValue = ((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{watchList}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue();
                            } else {
                                int i4 = onWarmupCompleted + 97;
                                onExtraCallbackWithResult = i4 % 128;
                                int i5 = i4 % 2;
                                jLongValue = -1;
                            }
                        }
                        Object[] objArr = {WidgetWatchlistSelectViewModel.this, Long.valueOf(jLongValue), false, null, 4, null};
                        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                        WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 744568176, objArr, -744568175, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                        return Unit.INSTANCE;
                    }
                    getcornerradiusOnTransact = (getCornerRadius) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback3 = ((Result) obj).onNavigationEvent();
                    ResultKt.onNavigationEvent(objOnExtraCallback3);
                    listEmptyList = ((WidgetWatchlists) objOnExtraCallback3).onExtraCallback();
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    getcornerradiusOnTransact.onWarmupCompleted(CollectionsKt___CollectionsKt.plus((Collection) listEmptyList, (Iterable) CollectionsKt__CollectionsJVMKt.listOf(new WidgetWatchlists.WatchList(-1L, (List) null, "지수", r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX, 2, (DefaultConstructorMarker) null))));
                    DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback22 = WidgetWatchlistSelectViewModel.IAuthTabCallback(WidgetWatchlistSelectViewModel.this);
                    String strOnExtraCallbackWithResult22 = WidgetWatchlistSelectViewModel.Companion.onExtraCallbackWithResult(WidgetWatchlistSelectViewModel.onExtraCallback(WidgetWatchlistSelectViewModel.this));
                    KSerializer<Long> kSerializerOnNavigationEvent22 = sp.onNavigationEvent(LongCompanionObject.INSTANCE);
                    this.L$0 = findresandmsg;
                    this.L$1 = null;
                    this.label = 5;
                    objOnExtraCallback2 = IAuthTabCallback22.onExtraCallback(strOnExtraCallbackWithResult22, kSerializerOnNavigationEvent22, this);
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            if (((Boolean) objOnExtraCallback).booleanValue()) {
                int i6 = onWarmupCompleted + 21;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = WidgetWatchlistSelectViewModel.this;
                    this.L$0 = findresandmsg;
                    this.label = 2;
                    if (WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel, this) != objOnExtraCallback4) {
                    }
                    return objOnExtraCallback4;
                }
                WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel2 = WidgetWatchlistSelectViewModel.this;
                this.L$0 = findresandmsg;
                this.label = 2;
                if (WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel2, this) != objOnExtraCallback4) {
                }
                return objOnExtraCallback4;
            }
            getcornerradiusOnTransact = WidgetWatchlistSelectViewModel.onTransact(WidgetWatchlistSelectViewModel.this);
            decodeIpv6 decodeipv6OnWarmupCompleted22 = WidgetWatchlistSelectViewModel.onWarmupCompleted(WidgetWatchlistSelectViewModel.this);
            this.L$0 = findresandmsg;
            this.L$1 = getcornerradiusOnTransact;
            this.label = 3;
            objOnNavigationEvent = decodeipv6OnWarmupCompleted22.onNavigationEvent(this);
            if (objOnNavigationEvent != objOnExtraCallback4) {
            }
            return objOnExtraCallback4;
        }
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        onLoadStarted.onExtraCallback(this.onActivityResized, null, null, new onWarmupCompleted(null), 3, null);
        onLoadStarted.onExtraCallback(this.onActivityResized, null, null, new onNavigationEvent(null), 3, null);
        int i2 = ICustomTabsCallbackDefault + 97;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = WidgetWatchlistSelectViewModel.this.new onNavigationEvent(access13800Var);
            int i2 = IAuthTabCallback + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel;
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                access14100.onExtraCallback();
                throw null;
            }
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                widgetWatchlistSelectViewModel = WidgetWatchlistSelectViewModel.this;
                DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback2 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel);
                String strOnWarmupCompleted = r0b.onWarmupCompleted(WidgetWatchlistSelectViewModel.onExtraCallback(WidgetWatchlistSelectViewModel.this));
                KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
                DisplaySetting displaySettingOnNavigationEvent = WidgetWatchlistSelectViewModel.onNavigationEvent(WidgetWatchlistSelectViewModel.this).onNavigationEvent();
                this.L$0 = widgetWatchlistSelectViewModel;
                this.label = 1;
                obj = getCurrentEditorokhttp.onExtraCallback(IAuthTabCallback2, strOnWarmupCompleted, kSerializerSerializer, displaySettingOnNavigationEvent, this);
                if (obj != objOnExtraCallback) {
                }
                int i4 = IAuthTabCallback + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }
            int i6 = onNavigationEvent + 41;
            int i7 = i6 % 128;
            IAuthTabCallback = i7;
            int i8 = i6 % 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = i7 + 59;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                widgetWatchlistSelectViewModel2 = (WidgetWatchlistSelectViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
                int i11 = onNavigationEvent + 57;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                widgetWatchlistSelectViewModel2.onExtraCallbackWithResult(((Number) obj).floatValue());
                return Unit.INSTANCE;
            }
            widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) this.L$0;
            ResultKt.onNavigationEvent(obj);
            widgetWatchlistSelectViewModel.onWarmupCompleted((DisplaySetting) obj);
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel3 = WidgetWatchlistSelectViewModel.this;
            DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback3 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel3);
            String strOnNavigationEvent = r0b.onNavigationEvent(WidgetWatchlistSelectViewModel.onExtraCallback(WidgetWatchlistSelectViewModel.this));
            KSerializer<Float> kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
            Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
            this.L$0 = widgetWatchlistSelectViewModel3;
            this.label = 2;
            Object objOnExtraCallback2 = getCurrentEditorokhttp.onExtraCallback(IAuthTabCallback3, strOnNavigationEvent, kSerializerOnWarmupCompleted, fOnExtraCallbackWithResult, this);
            if (objOnExtraCallback2 != objOnExtraCallback) {
                widgetWatchlistSelectViewModel2 = widgetWatchlistSelectViewModel3;
                obj = objOnExtraCallback2;
                widgetWatchlistSelectViewModel2.onExtraCallbackWithResult(((Number) obj).floatValue());
                return Unit.INSTANCE;
            }
            int i42 = IAuthTabCallback + 105;
            onNavigationEvent = i42 % 128;
            int i52 = i42 % 2;
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r4 == o.access14100.onExtraCallback()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r4 == o.access14100.onExtraCallback()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r1 = im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel.ICustomTabsCallbackDefault + 19;
        im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel.ICustomTabsCallbackStubProxy = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 115;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallback.onWarmupCompleted(access14000.onNavigationEvent(true));
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var);
        } else {
            this.onExtraCallback.onWarmupCompleted(access14000.onNavigationEvent(true));
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r3
      0x002b: PHI (r1v21 im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$IAuthTabCallbackDefault) = 
      (r1v20 im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$IAuthTabCallbackDefault)
      (r1v23 im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$IAuthTabCallbackDefault)
     binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r3v21 int) = (r3v20 int), (r3v23 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        Object objOnExtraCallback;
        Object objOnExtraCallbackWithResult;
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel;
        OverviewAccounts overviewAccounts;
        List<? extends OverviewItemInfo> listEmptyList;
        List listOnWarmupCompleted;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            int i3 = ICustomTabsCallbackDefault + 123;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
                i = iAuthTabCallbackDefault.label;
                int i4 = 23 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallbackDefault.label = i - 2147483648;
                } else {
                    iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
                }
            } else {
                iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
                i = iAuthTabCallbackDefault.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj = iAuthTabCallbackDefault.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i5 = iAuthTabCallbackDefault.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = this.asBinder;
            iAuthTabCallbackDefault.label = 1;
            objOnExtraCallback = r8lambdaws9z36z_nyqlya8ut2rf642vcso.onExtraCallback(iAuthTabCallbackDefault);
            if (objOnExtraCallback != objOnExtraCallback2) {
            }
            return objOnExtraCallback2;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = ICustomTabsCallbackDefault + 37;
            ICustomTabsCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) iAuthTabCallbackDefault.L$1;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
                int i7 = 72 / 0;
            } else {
                widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) iAuthTabCallbackDefault.L$1;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
            }
            if (Result.onExtraCallback(objOnExtraCallbackWithResult)) {
                objOnExtraCallbackWithResult = null;
            }
            overviewAccounts = (OverviewAccounts) objOnExtraCallbackWithResult;
            if (overviewAccounts != null || (listOnWarmupCompleted = overviewAccounts.onWarmupCompleted()) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            } else {
                int i8 = ICustomTabsCallbackDefault + 21;
                ICustomTabsCallbackStubProxy = i8 % 128;
                if (i8 % 2 == 0) {
                    CollectionsKt___CollectionsKt.filterNotNull(listOnWarmupCompleted);
                    throw null;
                }
                List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(listOnWarmupCompleted);
                if (listFilterNotNull != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listFilterNotNull.iterator();
                    while (!(!it.hasNext())) {
                        List listIAuthTabCallbackDefault = ((OverviewAccounts.Overview) it.next()).IAuthTabCallbackDefault();
                        if (listIAuthTabCallbackDefault == null) {
                            listIAuthTabCallbackDefault = CollectionsKt__CollectionsKt.emptyList();
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList, listIAuthTabCallbackDefault);
                    }
                    listEmptyList = new ArrayList<>();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        int i9 = ICustomTabsCallbackDefault + 25;
                        ICustomTabsCallbackStubProxy = i9 % 128;
                        if (i9 % 2 == 0) {
                            CollectionsKt__MutableCollectionsKt.addAll(listEmptyList, ((Product) it2.next()).onExtraCallbackWithResult());
                            throw null;
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(listEmptyList, ((Product) it2.next()).onExtraCallbackWithResult());
                    }
                }
            }
            widgetWatchlistSelectViewModel.writeTypedObject = listEmptyList;
            return Unit.INSTANCE;
        }
        ResultKt.onNavigationEvent(obj);
        objOnExtraCallback = ((Result) obj).onNavigationEvent();
        ResultKt.onNavigationEvent(objOnExtraCallback);
        AccountList accountList = (AccountList) objOnExtraCallback;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau = this.ICustomTabsCallbackStub;
        List listIAuthTabCallback = accountList.IAuthTabCallback();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
        Iterator it3 = listIAuthTabCallback.iterator();
        while (it3.hasNext()) {
            int i10 = ICustomTabsCallbackStubProxy + 73;
            ICustomTabsCallbackDefault = i10 % 128;
            if (i10 % 2 != 0) {
                arrayList2.add(((Account) it3.next()).IAuthTabCallbackStub());
                throw null;
            }
            arrayList2.add(((Account) it3.next()).IAuthTabCallbackStub());
        }
        iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(accountList);
        iAuthTabCallbackDefault.L$1 = this;
        iAuthTabCallbackDefault.label = 2;
        objOnExtraCallbackWithResult = r8lambdakeemxoi4two_xjjc4c2vgm4dau.onExtraCallbackWithResult(arrayList2, iAuthTabCallbackDefault);
        if (objOnExtraCallbackWithResult != objOnExtraCallback2) {
            widgetWatchlistSelectViewModel = this;
            if (Result.onExtraCallback(objOnExtraCallbackWithResult)) {
            }
            overviewAccounts = (OverviewAccounts) objOnExtraCallbackWithResult;
            if (overviewAccounts != null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            widgetWatchlistSelectViewModel.writeTypedObject = listEmptyList;
            return Unit.INSTANCE;
        }
        return objOnExtraCallback2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) objArr[0];
        boolean z = true;
        long jLongValue = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Function0<Unit> function0 = (Function0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj = objArr[5];
        int i = 2 % 2;
        if ((iIntValue & 2) != 0) {
            int i2 = ICustomTabsCallbackStubProxy + 31;
            ICustomTabsCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 5;
            }
        } else {
            z = zBooleanValue;
        }
        if ((iIntValue & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 61;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return WidgetWatchlistSelectViewModel.onExtraCallbackWithResult();
                    }
                    WidgetWatchlistSelectViewModel.onExtraCallbackWithResult();
                    throw null;
                }
            };
        }
        widgetWatchlistSelectViewModel.onNavigationEvent(jLongValue, z, function0);
        int i4 = ICustomTabsCallbackStubProxy + 105;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return null;
    }

    private static final Unit writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec A[PHI: r3
      0x00ec: PHI (r3v13 java.util.List) = (r3v12 java.util.List), (r3v19 java.util.List) binds: [B:37:0x00ea, B:34:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(long j, boolean z, @NotNull Function0<Unit> function0) {
        Object next;
        List listOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Object obj = null;
        if (j == -1) {
            int i2 = ICustomTabsCallbackDefault + 63;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallbackStub.onWarmupCompleted(Long.valueOf(j));
                function0.invoke();
                return;
            } else {
                this.IAuthTabCallbackStub.onWarmupCompleted(Long.valueOf(j));
                function0.invoke();
                throw null;
            }
        }
        if (j == 0) {
            if (!this.writeTypedObject.isEmpty()) {
                this.IAuthTabCallbackStub.onWarmupCompleted(Long.valueOf(j));
                function0.invoke();
                return;
            } else {
                if (!z) {
                    return;
                }
                int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -784260812, new Object[]{this}, 784260812, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                return;
            }
        }
        Iterator<T> it = this.onMinimized.IAuthTabCallback().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i3 = ICustomTabsCallbackStubProxy + 123;
            ICustomTabsCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            next = it.next();
            if (((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{(WidgetWatchlists.WatchList) next}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue() == j) {
                break;
            }
        }
        WidgetWatchlists.WatchList watchList = (WidgetWatchlists.WatchList) next;
        if (watchList != null) {
            if (watchList.asInterface() == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH) {
                this.IAuthTabCallbackStub.onWarmupCompleted(Long.valueOf(j));
                return;
            }
            int i5 = ICustomTabsCallbackStubProxy + 125;
            ICustomTabsCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                listOnExtraCallbackWithResult = watchList.onExtraCallbackWithResult();
                int i6 = 62 / 0;
                if (listOnExtraCallbackWithResult != null) {
                    if (!listOnExtraCallbackWithResult.isEmpty()) {
                        int i7 = ICustomTabsCallbackDefault + 65;
                        ICustomTabsCallbackStubProxy = i7 % 128;
                        if (i7 % 2 != 0) {
                            this.IAuthTabCallbackStub.onWarmupCompleted(Long.valueOf(j));
                            function0.invoke();
                            return;
                        } else {
                            this.IAuthTabCallbackStub.onWarmupCompleted(Long.valueOf(j));
                            function0.invoke();
                            int i8 = 25 / 0;
                            return;
                        }
                    }
                }
            } else {
                listOnExtraCallbackWithResult = watchList.onExtraCallbackWithResult();
                if (listOnExtraCallbackWithResult != null) {
                }
            }
            if (z) {
                int i9 = ICustomTabsCallbackStubProxy + 111;
                ICustomTabsCallbackDefault = i9 % 128;
                if (i9 % 2 == 0) {
                    int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                    onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -784260812, new Object[]{this}, 784260812, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                    return;
                }
                int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
                onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted3, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -784260812, new Object[]{this}, 784260812, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                obj.hashCode();
                throw null;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 115;
        ICustomTabsCallbackDefault = i2 % 128;
        widgetWatchlistSelectViewModel.onActivityLayout.onNavigationEvent(getWrite.IAuthTabCallback(i2 % 2 != 0 ? 0 : 1, "그룹이 비어있어요."));
        int i3 = ICustomTabsCallbackStubProxy + 109;
        ICustomTabsCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull access13800<? super Long> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = ICustomTabsCallbackDefault + 49;
                ICustomTabsCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = iAuthTabCallback.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return null;
        }
        ResultKt.onNavigationEvent(obj);
        Long lIAuthTabCallback = this.extraCallback.IAuthTabCallback();
        if (lIAuthTabCallback != null) {
            int i6 = ICustomTabsCallbackDefault + 41;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            return access14000.onExtraCallback(lIAuthTabCallback.longValue());
        }
        getBorderRadius<Pair<Integer, String>> getborderradius = this.onActivityLayout;
        Pair<Integer, String> pairIAuthTabCallback = getWrite.IAuthTabCallback(access14000.onNavigationEvent(1), "그룹을 선택해주세요.");
        iAuthTabCallback.L$0 = access15400.onNavigationEvent(this);
        iAuthTabCallback.I$0 = 0;
        iAuthTabCallback.label = 1;
        if (getborderradius.emit(pairIAuthTabCallback, iAuthTabCallback) != objOnExtraCallback) {
            return null;
        }
        int i8 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel = (WidgetWatchlistSelectViewModel) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 113;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = setCustomerUserId.onWarmupCompleted(th);
        if (strOnWarmupCompleted == null) {
            int i4 = ICustomTabsCallbackDefault + 63;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            strOnWarmupCompleted = "일시적인 문제가 생겼어요. 잠시 후 다시 시도해주세요.";
        }
        widgetWatchlistSelectViewModel.IAuthTabCallback.onNavigationEvent(strOnWarmupCompleted);
        q8a.IAuthTabCallback(q8a.onNavigationEvent, th, (Map) null, 2, (Object) null);
        return null;
    }

    public final void onWarmupCompleted(@NotNull DisplaySetting displaySetting) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 51;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(displaySetting, "");
        this.onWarmupCompleted.onWarmupCompleted(displaySetting);
        int i4 = ICustomTabsCallbackStubProxy + 45;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onWarmupCompleted(Float.valueOf(f));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 109;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 119;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        onLoadStarted.onExtraCallback(this.onActivityResized, null, null, new asInterface(function0, this.extraCallback.IAuthTabCallback(), this, this.onTransact.IAuthTabCallback().floatValue(), this.access100.IAuthTabCallback(), null), 3, null);
        int i2 = ICustomTabsCallbackDefault + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ float $alpha;
        final /* synthetic */ DisplaySetting $displaySetting;
        final /* synthetic */ Function0<Unit> $onEnd;
        final /* synthetic */ Long $watchlistId;
        float F$0;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ WidgetWatchlistSelectViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(Function0<Unit> function0, Long l, WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel, float f, DisplaySetting displaySetting, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$onEnd = function0;
            this.$watchlistId = l;
            this.this$0 = widgetWatchlistSelectViewModel;
            this.$alpha = f;
            this.$displaySetting = displaySetting;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$onEnd, this.$watchlistId, this.this$0, this.$alpha, this.$displaySetting, access13800Var);
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return asinterface;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            if (i3 != 0) {
                int i4 = 81 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            asInterface asinterface = (asInterface) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                asinterface.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = asinterface.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x021f, code lost:
        
            if (r4.onNavigationEvent(r8, r9, r10, r24) != r2) goto L85;
         */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01f2  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Long l;
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel;
            float f;
            DisplaySetting displaySetting;
            access13800 access13800Var;
            int i;
            int i2;
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel2;
            int i3;
            DisplaySetting displaySetting2;
            access13800 access13800Var2;
            WidgetWatchlists.WatchList watchList;
            r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsgAsInterface;
            int i4;
            float f2;
            access13800 access13800Var3;
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel3;
            Object next;
            WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel4;
            int i5;
            DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback2;
            String strOnNavigationEvent;
            Float fOnExtraCallbackWithResult;
            KSerializer<Float> kSerializerOnWarmupCompleted;
            int i6 = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i7 = this.label;
            Object obj2 = null;
            try {
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            if (i7 == 0) {
                ResultKt.onNavigationEvent(obj);
                l = this.$watchlistId;
                widgetWatchlistSelectViewModel = this.this$0;
                f = this.$alpha;
                displaySetting = this.$displaySetting;
                Result.Companion companion3 = Result.Companion;
                if (l != null) {
                    DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback3 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel);
                    String strOnExtraCallbackWithResult = WidgetWatchlistSelectViewModel.Companion.onExtraCallbackWithResult(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel));
                    KSerializer<Long> kSerializerOnNavigationEvent = sp.onNavigationEvent(LongCompanionObject.INSTANCE);
                    this.L$0 = l;
                    this.L$1 = widgetWatchlistSelectViewModel;
                    this.L$2 = displaySetting;
                    this.L$3 = access15400.onNavigationEvent(this);
                    this.F$0 = f;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (IAuthTabCallback3.onNavigationEvent(strOnExtraCallbackWithResult, l, kSerializerOnNavigationEvent, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                    widgetWatchlistSelectViewModel2 = widgetWatchlistSelectViewModel;
                    i3 = 0;
                    i2 = 0;
                    displaySetting2 = displaySetting;
                    access13800Var2 = this;
                } else {
                    access13800Var = this;
                    i = 0;
                    i2 = 0;
                    IAuthTabCallback2 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel);
                    strOnNavigationEvent = r0b.onNavigationEvent(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel));
                    fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(f);
                    kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
                    this.L$0 = widgetWatchlistSelectViewModel;
                    this.L$1 = displaySetting;
                    this.L$2 = access15400.onNavigationEvent(access13800Var);
                    this.L$3 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 3;
                    if (IAuthTabCallback2.onNavigationEvent(strOnNavigationEvent, fOnExtraCallbackWithResult, kSerializerOnWarmupCompleted, this) != objOnExtraCallback) {
                    }
                }
            } else if (i7 != 1) {
                int i8 = onWarmupCompleted + 35;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0 ? i7 == 2 : i7 == 2) {
                    i = this.I$1;
                    i4 = this.I$0;
                    f2 = this.F$0;
                    access13800Var3 = (access13800) this.L$2;
                    displaySetting = (DisplaySetting) this.L$1;
                    widgetWatchlistSelectViewModel3 = (WidgetWatchlistSelectViewModel) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    access13800Var = access13800Var3;
                    f = f2;
                    i2 = i4;
                    widgetWatchlistSelectViewModel = widgetWatchlistSelectViewModel3;
                    IAuthTabCallback2 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel);
                    strOnNavigationEvent = r0b.onNavigationEvent(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel));
                    fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(f);
                    kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
                    this.L$0 = widgetWatchlistSelectViewModel;
                    this.L$1 = displaySetting;
                    this.L$2 = access15400.onNavigationEvent(access13800Var);
                    this.L$3 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 3;
                    if (IAuthTabCallback2.onNavigationEvent(strOnNavigationEvent, fOnExtraCallbackWithResult, kSerializerOnWarmupCompleted, this) != objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                    WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel5 = widgetWatchlistSelectViewModel;
                    i5 = i;
                    widgetWatchlistSelectViewModel4 = widgetWatchlistSelectViewModel5;
                    DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback4 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel4);
                    String strOnWarmupCompleted = r0b.onWarmupCompleted(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel4));
                    KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
                    this.L$0 = widgetWatchlistSelectViewModel4;
                    this.L$1 = access15400.onNavigationEvent(access13800Var);
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.I$1 = i5;
                    this.label = 4;
                } else {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        widgetWatchlistSelectViewModel4 = (WidgetWatchlistSelectViewModel) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel4).IAuthTabCallback();
                        Result.m31constructorimpl(Unit.INSTANCE);
                        this.$onEnd.invoke();
                        return Unit.INSTANCE;
                    }
                    int i9 = this.I$1;
                    int i10 = this.I$0;
                    access13800Var = (access13800) this.L$2;
                    DisplaySetting displaySetting3 = (DisplaySetting) this.L$1;
                    WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel6 = (WidgetWatchlistSelectViewModel) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    displaySetting = displaySetting3;
                    i2 = i10;
                    i5 = i9;
                    widgetWatchlistSelectViewModel4 = widgetWatchlistSelectViewModel6;
                    DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback42 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel4);
                    String strOnWarmupCompleted2 = r0b.onWarmupCompleted(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel4));
                    KSerializer kSerializerSerializer2 = DisplaySetting.Companion.serializer();
                    this.L$0 = widgetWatchlistSelectViewModel4;
                    this.L$1 = access15400.onNavigationEvent(access13800Var);
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.I$1 = i5;
                    this.label = 4;
                }
            } else {
                i3 = this.I$1;
                i2 = this.I$0;
                f = this.F$0;
                access13800Var2 = (access13800) this.L$3;
                displaySetting2 = (DisplaySetting) this.L$2;
                widgetWatchlistSelectViewModel2 = (WidgetWatchlistSelectViewModel) this.L$1;
                l = (Long) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            List list = (List) ((setRubIn) WidgetWatchlistSelectViewModel.onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2046877714, new Object[]{widgetWatchlistSelectViewModel2}, 2046877719, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).IAuthTabCallback();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    long jLongValue = ((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{(WidgetWatchlists.WatchList) next}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue();
                    if (l != null) {
                        int i11 = onWarmupCompleted + 91;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            l.longValue();
                            obj2.hashCode();
                            throw null;
                        }
                        if (jLongValue == l.longValue()) {
                            int i12 = IAuthTabCallback + 115;
                            onWarmupCompleted = i12 % 128;
                            if (i12 % 2 != 0) {
                                obj2.hashCode();
                                throw null;
                            }
                        }
                    }
                }
                watchList = (WidgetWatchlists.WatchList) next;
            } else {
                watchList = null;
            }
            if (watchList != null) {
                r8lambdabrizzqzhaizmdvstl2yymmz7zsgAsInterface = watchList.asInterface();
                int i13 = onWarmupCompleted + 95;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
            } else {
                r8lambdabrizzqzhaizmdvstl2yymmz7zsgAsInterface = null;
            }
            if (r8lambdabrizzqzhaizmdvstl2yymmz7zsgAsInterface == r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.RECENT_WATCH) {
                DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback5 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel2);
                String strOnWarmupCompleted3 = WidgetProductSelectViewModel.Companion.onWarmupCompleted(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel2));
                this.L$0 = widgetWatchlistSelectViewModel2;
                this.L$1 = displaySetting2;
                this.L$2 = access15400.onNavigationEvent(access13800Var2);
                this.L$3 = access15400.onNavigationEvent(watchList);
                this.F$0 = f;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 2;
                if (IAuthTabCallback5.onNavigationEvent(strOnWarmupCompleted3, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                i = i3;
                i4 = i2;
                f2 = f;
                access13800Var3 = access13800Var2;
                displaySetting = displaySetting2;
                widgetWatchlistSelectViewModel3 = widgetWatchlistSelectViewModel2;
                access13800Var = access13800Var3;
                f = f2;
                i2 = i4;
                widgetWatchlistSelectViewModel = widgetWatchlistSelectViewModel3;
                IAuthTabCallback2 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel);
                strOnNavigationEvent = r0b.onNavigationEvent(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel));
                fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(f);
                kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
                this.L$0 = widgetWatchlistSelectViewModel;
                this.L$1 = displaySetting;
                this.L$2 = access15400.onNavigationEvent(access13800Var);
                this.L$3 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 3;
                if (IAuthTabCallback2.onNavigationEvent(strOnNavigationEvent, fOnExtraCallbackWithResult, kSerializerOnWarmupCompleted, this) != objOnExtraCallback) {
                }
            } else {
                i = i3;
                access13800Var = access13800Var2;
                displaySetting = displaySetting2;
                widgetWatchlistSelectViewModel = widgetWatchlistSelectViewModel2;
                IAuthTabCallback2 = WidgetWatchlistSelectViewModel.IAuthTabCallback(widgetWatchlistSelectViewModel);
                strOnNavigationEvent = r0b.onNavigationEvent(WidgetWatchlistSelectViewModel.onExtraCallback(widgetWatchlistSelectViewModel));
                fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(f);
                kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
                this.L$0 = widgetWatchlistSelectViewModel;
                this.L$1 = displaySetting;
                this.L$2 = access15400.onNavigationEvent(access13800Var);
                this.L$3 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 3;
                if (IAuthTabCallback2.onNavigationEvent(strOnNavigationEvent, fOnExtraCallbackWithResult, kSerializerOnWarmupCompleted, this) != objOnExtraCallback) {
                }
            }
        }
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final String onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            String str = "watchlist_id_" + i;
            int i3 = onWarmupCompleted + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
    }

    private static final DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallbackStub(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (DiskLruCacheEditornewSink11.IAuthTabCallback) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1254269661, new Object[]{widgetWatchlistSelectViewModel}, -1254269657, iOnWarmupCompleted3);
    }

    private static final Unit extraCallbackWithResult() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 2010692965, new Object[0], -2010692959, iOnWarmupCompleted3);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(WidgetWatchlistSelectViewModel widgetWatchlistSelectViewModel, long j, boolean z, Function0 function0, int i, Object obj) {
        Object[] objArr = {widgetWatchlistSelectViewModel, Long.valueOf(j), Boolean.valueOf(z), function0, Integer.valueOf(i), obj};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 744568176, objArr, -744568175, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onExtraCallback(Throwable th) {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1046645862, new Object[]{this, th}, 1046645865, iOnWarmupCompleted3);
    }

    public final setRubIn<Boolean> asBinder() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (setRubIn) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1234262217, new Object[]{this}, 1234262219, iOnWarmupCompleted3);
    }

    public final setRubIn<List<WidgetWatchlists.WatchList>> access000() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (setRubIn) onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -2046877714, new Object[]{this}, 2046877719, iOnWarmupCompleted3);
    }

    public final void getInterfaceDescriptor() {
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(iOnWarmupCompleted2, iOnWarmupCompleted, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -784260812, new Object[]{this}, 784260812, iOnWarmupCompleted3);
    }
}
