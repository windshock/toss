package im.toss.tosssecurities.widget.watchlist.setting.product;

import androidx.lifecycle.ViewModel;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.securities.widget.data.model.overview.OverviewAccounts;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import im.toss.securities.widget.data.model.watchlists.WidgetWatchlists;
import im.toss.tosssecurities.core.account.domain.model.Account;
import im.toss.tosssecurities.core.account.domain.model.AccountList;
import im.toss.tosssecurities.widget.watchlist.setting.watchlist.WidgetWatchlistSelectViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import o.DiskLruCacheEditornewSink11;
import o.DiskLruCacheEntry;
import o.GeckoHubImp;
import o.IAnimation;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.RealImageLoaderKtCoroutineScopeinlinedCoroutineExceptionHandler1;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.clearNumber;
import o.decodeIpv6;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getPackageType;
import o.getShine;
import o.getTileModeX;
import o.getTileModeY;
import o.intersect;
import o.maybeUpdateAnimatable;
import o.onLoadStarted;
import o.putChannelInfo;
import o.q8ExternalSyntheticLambda1;
import o.q8a;
import o.r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU;
import o.r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo;
import o.setRipple;
import o.setRubIn;
import o.setShine;
import o.sp;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WidgetProductSelectViewModel extends ViewModel {
    private static int onActivityResized = 1;
    private static int onMessageChannelReady = 0;
    private static int onMinimized = 0;
    private static int onPostMessage = 1;
    private final getBorderRadius<Throwable> IAuthTabCallback;
    private final getTileModeX<Throwable> IAuthTabCallbackDefault;
    private final setRubIn<Boolean> IAuthTabCallbackStub;
    private final setRubIn<List<WidgetWatchlists.WatchList.Item>> IAuthTabCallbackStubProxy;
    private final setRubIn<Boolean> IAuthTabCallback_Parcel;
    private final r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU ICustomTabsCallback;
    private final String access000;
    private final setRubIn<Set<String>> access100;
    private final decodeIpv6 asBinder;
    private final Lazy asInterface;
    private final long extraCallback;
    private final getBorderRadius<String> extraCallbackWithResult;
    private final int getInterfaceDescriptor;
    private final getCornerRadius<List<WidgetWatchlists.WatchList.Item>> onExtraCallback;
    private final r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo onExtraCallbackWithResult;
    private final int onTransact;
    private final getCornerRadius<Set<String>> onWarmupCompleted;
    private getPackageType readTypedObject;
    private final getBorderRadius<String> writeTypedObject;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onNavigationEvent = 8;

    static final class asBinder extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = WidgetProductSelectViewModel.IAuthTabCallback(WidgetProductSelectViewModel.this, null, this);
            int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = WidgetProductSelectViewModel.this.onNavigationEvent(this);
            int i4 = onExtraCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static {
        int i = onMessageChannelReady + 75;
        onPostMessage = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~(i3 | i6)) | i4;
        int i8 = (~((~i6) | i3)) | i4;
        int i9 = (~i4) | i3;
        int i10 = i4 + i3 + i2 + (440753341 * i5) + ((-634449194) * i);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i4) + 1075183616 + ((-1421434046) * i3) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i2) + (780402688 * i5) + ((-180879360) * i) + (353763328 * i11);
        int i13 = (i4 * 892202253) + 1676176333 + (i3 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i2 * 892200819) + (i5 * (-770690073)) + (i * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ DiskLruCacheEditornewSink11.IAuthTabCallback onNavigationEvent(DiskLruCacheEntry diskLruCacheEntry) {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1134506946, -1134506943, iOnExtraCallbackWithResult3, new Object[]{diskLruCacheEntry}, iOnExtraCallbackWithResult);
        int i4 = onActivityResized + 57;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public WidgetProductSelectViewModel(@NotNull r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau, @NotNull r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso, @NotNull decodeIpv6 decodeipv6, @NotNull final DiskLruCacheEntry diskLruCacheEntry, @NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7) {
        long jLongValue;
        String str;
        Intrinsics.checkNotNullParameter(r8lambdakeemxoi4two_xjjc4c2vgm4dau, "");
        Intrinsics.checkNotNullParameter(r8lambdaws9z36z_nyqlya8ut2rf642vcso, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        this.ICustomTabsCallback = r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        this.onExtraCallbackWithResult = r8lambdaws9z36z_nyqlya8ut2rf642vcso;
        this.asBinder = decodeipv6;
        Integer num = (Integer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("appWidgetId");
        this.onTransact = num != null ? num.intValue() : 0;
        Long l = (Long) textLinkScopeExternalSyntheticLambda7.onExtraCallback("watchlist_id_");
        if (l != null) {
            int i = onActivityResized + 47;
            onMinimized = i % 128;
            int i2 = i % 2;
            jLongValue = l.longValue();
            int i3 = 2 % 2;
        } else {
            int i4 = 2 % 2;
            jLongValue = -1;
        }
        this.extraCallback = jLongValue;
        Integer num2 = (Integer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("max_product_size");
        this.getInterfaceDescriptor = num2 != null ? num2.intValue() : 20;
        if (jLongValue == -1) {
            int i5 = onMinimized + 107;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "지수";
        } else {
            str = "종목";
        }
        this.access000 = str;
        this.asInterface = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = WidgetProductSelectViewModel.onNavigationEvent(diskLruCacheEntry);
                if (i10 == 0) {
                    int i11 = 82 / 0;
                }
                return iAuthTabCallbackOnNavigationEvent;
            }
        });
        this.extraCallbackWithResult = RealImageLoaderKtCoroutineScopeinlinedCoroutineExceptionHandler1.onWarmupCompleted();
        this.writeTypedObject = RealImageLoaderKtCoroutineScopeinlinedCoroutineExceptionHandler1.onWarmupCompleted();
        Object obj = null;
        getCornerRadius<List<WidgetWatchlists.WatchList.Item>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(null);
        this.onExtraCallback = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackStubProxy = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent);
        getCornerRadius<Set<String>> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(clearNumber.onNavigationEvent());
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent2;
        this.access100 = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent2);
        onNavigationEvent onnavigationevent = new onNavigationEvent(getcornerradiusOnNavigationEvent2, this);
        findResAndMsg findresandmsgIAuthTabCallback = ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this);
        getTileModeY.onWarmupCompleted onwarmupcompleted = getTileModeY.Companion;
        this.IAuthTabCallbackStub = ycxycx.IAuthTabCallback(onnavigationevent, findresandmsgIAuthTabCallback, getTileModeY.onWarmupCompleted.onExtraCallback(onwarmupcompleted, 0L, 0L, 3, null), Boolean.FALSE);
        this.IAuthTabCallback_Parcel = ycxycx.IAuthTabCallback(new onExtraCallbackWithResult(getcornerradiusOnNavigationEvent2), ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), getTileModeY.onWarmupCompleted.onExtraCallback(onwarmupcompleted, 0L, 0L, 3, null), Boolean.TRUE);
        getBorderRadius<Throwable> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, null, 7, null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted;
        this.IAuthTabCallbackDefault = getborderradiusOnWarmupCompleted;
        onLoadStarted.onExtraCallback(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), putChannelInfo.IAuthTabCallback(), null, new AnonymousClass2(null), 2, null);
        int i8 = onActivityResized + 57;
        onMinimized = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object IAuthTabCallback(WidgetProductSelectViewModel widgetProductSelectViewModel, Throwable th, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onMinimized + 55;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = widgetProductSelectViewModel.onExtraCallbackWithResult(th, access13800Var);
        int i4 = onMinimized + 23;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Object IAuthTabCallback(WidgetProductSelectViewModel widgetProductSelectViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onMinimized + 75;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = widgetProductSelectViewModel.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
        int i4 = onActivityResized + 11;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU IAuthTabCallback(WidgetProductSelectViewModel widgetProductSelectViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 61;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dau = widgetProductSelectViewModel.ICustomTabsCallback;
        int i5 = i2 + 105;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return r8lambdakeemxoi4two_xjjc4c2vgm4dau;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallbackStub(WidgetProductSelectViewModel widgetProductSelectViewModel) {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<Set<String>> getcornerradius = widgetProductSelectViewModel.onWarmupCompleted;
        if (i3 == 0) {
            return getcornerradius;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius asInterface(WidgetProductSelectViewModel widgetProductSelectViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 71;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        getCornerRadius<List<WidgetWatchlists.WatchList.Item>> getcornerradius = widgetProductSelectViewModel.onExtraCallback;
        int i5 = i3 + 25;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ int onExtraCallback(WidgetProductSelectViewModel widgetProductSelectViewModel) {
        int i = 2 % 2;
        int i2 = onMinimized + 39;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        int i5 = widgetProductSelectViewModel.getInterfaceDescriptor;
        if (i4 == 0) {
            throw null;
        }
        int i6 = i3 + 13;
        onMinimized = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        WidgetProductSelectViewModel widgetProductSelectViewModel = (WidgetProductSelectViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 83;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        decodeIpv6 decodeipv6 = widgetProductSelectViewModel.asBinder;
        int i5 = i3 + 125;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return decodeipv6;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        WidgetProductSelectViewModel widgetProductSelectViewModel = (WidgetProductSelectViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 61;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = widgetProductSelectViewModel.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return r8lambdaws9z36z_nyqlya8ut2rf642vcso;
    }

    public static final /* synthetic */ long onWarmupCompleted(WidgetProductSelectViewModel widgetProductSelectViewModel) {
        long j;
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 123;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            j = widgetProductSelectViewModel.extraCallback;
            int i4 = 34 / 0;
        } else {
            j = widgetProductSelectViewModel.extraCallback;
        }
        int i5 = i2 + 97;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public static final /* synthetic */ Object onWarmupCompleted(WidgetProductSelectViewModel widgetProductSelectViewModel, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onMinimized + 3;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = widgetProductSelectViewModel.onWarmupCompleted((access13800<? super Unit>) access13800Var);
        int i4 = onMinimized + 53;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return objOnWarmupCompleted;
    }

    public static final class onExtraCallbackWithResult implements IAnimation<Boolean> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ IAnimation IAuthTabCallback;

        /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel$onExtraCallbackWithResult$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements setRipple {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ setRipple IAuthTabCallback;

            /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel$onExtraCallbackWithResult$5$2, reason: invalid class name */
            public static final class AnonymousClass2 extends ContinuationImpl {
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass2(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 77;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass5.this.emit(null, this);
                    int i4 = onExtraCallback + 75;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 21 / 0;
                    }
                    return objEmit;
                }
            }

            public AnonymousClass5(setRipple setripple) {
                this.IAuthTabCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass2 anonymousClass2;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    boolean z = access13800Var instanceof AnonymousClass2;
                    obj2.hashCode();
                    throw null;
                }
                if (access13800Var instanceof AnonymousClass2) {
                    anonymousClass2 = (AnonymousClass2) access13800Var;
                    int i3 = anonymousClass2.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        anonymousClass2.label = i3 - 2147483648;
                        int i4 = onExtraCallback + 17;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        anonymousClass2 = new AnonymousClass2(access13800Var);
                    }
                }
                Object obj3 = anonymousClass2.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i6 = anonymousClass2.label;
                if (i6 == 0) {
                    ResultKt.onNavigationEvent(obj3);
                    setRipple setripple = this.IAuthTabCallback;
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(((Set) obj).isEmpty());
                    anonymousClass2.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass2.L$1 = access15400.onNavigationEvent(anonymousClass2);
                    anonymousClass2.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass2.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass2.I$0 = 0;
                    anonymousClass2.label = 1;
                    if (setripple.emit(boolOnNavigationEvent, anonymousClass2) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onExtraCallbackWithResult + 43;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj3);
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj3);
                }
                Unit unit = Unit.INSTANCE;
                int i8 = onExtraCallback + 19;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }

        public onExtraCallbackWithResult(IAnimation iAnimation) {
            this.IAuthTabCallback = iAnimation;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super Boolean> setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.IAuthTabCallback.collect(new AnonymousClass5(setripple), access13800Var);
            if (objCollect == access14100.onExtraCallback()) {
                int i2 = onNavigationEvent + 123;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return objCollect;
                }
                throw null;
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 89;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public static final class onNavigationEvent implements IAnimation<Boolean> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ WidgetProductSelectViewModel IAuthTabCallback;
        final /* synthetic */ IAnimation onNavigationEvent;

        /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel$onNavigationEvent$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements setRipple {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ WidgetProductSelectViewModel onExtraCallback;
            final /* synthetic */ setRipple onNavigationEvent;

            /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel$onNavigationEvent$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl {
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass3(access13800 access13800Var) {
                    super(access13800Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 61;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj2 = null;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (i3 != 0) {
                        return anonymousClass1.emit(null, this);
                    }
                    anonymousClass1.emit(null, this);
                    obj2.hashCode();
                    throw null;
                }
            }

            public AnonymousClass1(setRipple setripple, WidgetProductSelectViewModel widgetProductSelectViewModel) {
                this.onNavigationEvent = setripple;
                this.onExtraCallback = widgetProductSelectViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
            @Override // o.setRipple
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass3 anonymousClass3;
                boolean z;
                int i = 2 % 2;
                if (!(!(access13800Var instanceof AnonymousClass3))) {
                    int i2 = onWarmupCompleted + 77;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    anonymousClass3 = (AnonymousClass3) access13800Var;
                    int i4 = anonymousClass3.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        anonymousClass3.label = i4 - 2147483648;
                    } else {
                        anonymousClass3 = new AnonymousClass3(access13800Var);
                    }
                }
                Object obj2 = anonymousClass3.result;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i5 = anonymousClass3.label;
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.onNavigationEvent;
                    int size = ((Set) obj).size();
                    int iOnExtraCallback = WidgetProductSelectViewModel.onExtraCallback(this.onExtraCallback);
                    List list = (List) WidgetProductSelectViewModel.asInterface(this.onExtraCallback).IAuthTabCallback();
                    if (size == Math.min(iOnExtraCallback, list != null ? list.size() : WidgetProductSelectViewModel.onExtraCallback(this.onExtraCallback))) {
                        int i6 = onWarmupCompleted + 107;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
                    anonymousClass3.L$0 = access15400.onNavigationEvent(obj);
                    anonymousClass3.L$1 = access15400.onNavigationEvent(anonymousClass3);
                    anonymousClass3.L$2 = access15400.onNavigationEvent(obj);
                    anonymousClass3.L$3 = access15400.onNavigationEvent(setripple);
                    anonymousClass3.I$0 = 0;
                    anonymousClass3.label = 1;
                    if (setripple.emit(boolOnNavigationEvent, anonymousClass3) == objOnExtraCallback) {
                        int i8 = onExtraCallbackWithResult + 57;
                        int i9 = i8 % 128;
                        onWarmupCompleted = i9;
                        int i10 = i8 % 2;
                        int i11 = i9 + 65;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        return objOnExtraCallback;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public onNavigationEvent(IAnimation iAnimation, WidgetProductSelectViewModel widgetProductSelectViewModel) {
            this.onNavigationEvent = iAnimation;
            this.IAuthTabCallback = widgetProductSelectViewModel;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super Boolean> setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onNavigationEvent.collect(new AnonymousClass1(setripple, this.IAuthTabCallback), access13800Var);
            if (objCollect != access14100.onExtraCallback()) {
                return Unit.INSTANCE;
            }
            int i2 = onExtraCallback + 13;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objCollect;
        }
    }

    private final DiskLruCacheEditornewSink11.IAuthTabCallback asBinder() {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = (DiskLruCacheEditornewSink11.IAuthTabCallback) this.asInterface.getValue();
        int i4 = onMinimized + 57;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return iAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DiskLruCacheEntry diskLruCacheEntry = (DiskLruCacheEntry) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 21;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            diskLruCacheEntry.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallback2 = diskLruCacheEntry.IAuthTabCallback();
        int i3 = onMinimized + 45;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return IAuthTabCallback2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WidgetProductSelectViewModel widgetProductSelectViewModel = (WidgetProductSelectViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<String> getborderradius = widgetProductSelectViewModel.extraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return getborderradius;
    }

    public final getBorderRadius<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityResized + 37;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return this.writeTypedObject;
        }
        throw null;
    }

    public final setRubIn<List<WidgetWatchlists.WatchList.Item>> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 1;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<List<WidgetWatchlists.WatchList.Item>> setrubin = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 43;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        throw null;
    }

    public final setRubIn<Set<String>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        setRubIn<Set<String>> setrubin = this.access100;
        int i5 = i3 + 27;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WidgetProductSelectViewModel widgetProductSelectViewModel = (WidgetProductSelectViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 27;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Boolean> setrubin = widgetProductSelectViewModel.IAuthTabCallbackStub;
        int i5 = i2 + 31;
        onMinimized = i5 % 128;
        if (i5 % 2 == 0) {
            return setrubin;
        }
        throw null;
    }

    public final setRubIn<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityResized + 69;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubin = this.IAuthTabCallback_Parcel;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return setrubin;
    }

    public final getTileModeX<Throwable> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 9;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<Throwable> gettilemodex = this.IAuthTabCallbackDefault;
        int i5 = i2 + 65;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    /* renamed from: im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass2(access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = WidgetProductSelectViewModel.this.new AnonymousClass2(access13800Var);
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return anonymousClass2;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onExtraCallback + 19;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((AnonymousClass2) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
        
            if (r4 != r3) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x01bc, code lost:
        
            if (r4 == r3) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0215, code lost:
        
            if (r4 != r3) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x030b, code lost:
        
            if (im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel.IAuthTabCallback(r4, r5, r28) == r3) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0322, code lost:
        
            if (im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel.IAuthTabCallback(r4, r5, r28) == r3) goto L99;
         */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0196 A[Catch: Exception -> 0x02cb, CancellationException -> 0x02d7, WebResourceResponseModel -> 0x02d9, LOOP:3: B:46:0x0190->B:48:0x0196, LOOP_END, TryCatch #2 {WebResourceResponseModel -> 0x02d9, CancellationException -> 0x02d7, Exception -> 0x02cb, blocks: (B:21:0x006c, B:51:0x01be, B:52:0x01d6, B:54:0x01dc, B:73:0x027b, B:75:0x0293, B:78:0x02a2, B:80:0x02b3, B:82:0x02c1, B:18:0x0053, B:57:0x0217, B:59:0x0222, B:63:0x0235, B:68:0x026d, B:70:0x0271, B:66:0x0269, B:72:0x0277, B:24:0x0085, B:45:0x0174, B:46:0x0190, B:48:0x0196, B:49:0x01a4, B:27:0x009d, B:34:0x00e8, B:35:0x0103, B:37:0x0109, B:30:0x00a8, B:32:0x00b4, B:42:0x013d, B:55:0x01ff), top: B:102:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02ec  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM31constructorimpl;
            Throwable thM32exceptionOrNullimpl;
            WidgetProductSelectViewModel widgetProductSelectViewModel;
            Object objOnExtraCallback;
            Object objOnExtraCallback2;
            access13800 access13800Var;
            int i;
            int i2;
            Object objAsBinder;
            List arrayList;
            Iterator it;
            Object objOnExtraCallbackWithResult;
            Object obj2;
            int i3 = 2 % 2;
            Object objOnExtraCallback3 = access14100.onExtraCallback();
            int i4 = this.label;
            try {
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                widgetProductSelectViewModel = WidgetProductSelectViewModel.this;
                Result.Companion companion3 = Result.Companion;
                long jOnWarmupCompleted = WidgetProductSelectViewModel.onWarmupCompleted(widgetProductSelectViewModel);
                if (jOnWarmupCompleted == -1) {
                    decodeIpv6 decodeipv6 = (decodeIpv6) WidgetProductSelectViewModel.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1266285513, -1266285511, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{widgetProductSelectViewModel}, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                    this.L$0 = widgetProductSelectViewModel;
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objAsBinder = decodeipv6.asBinder(this);
                } else if (jOnWarmupCompleted == 0) {
                    int i5 = onWarmupCompleted + 91;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = (r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo) WidgetProductSelectViewModel.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -2095742100, 2095742104, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{widgetProductSelectViewModel}, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                    this.L$0 = widgetProductSelectViewModel;
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 2;
                    objOnExtraCallback2 = r8lambdaws9z36z_nyqlya8ut2rf642vcso.onExtraCallback(this);
                    if (objOnExtraCallback2 != objOnExtraCallback3) {
                        access13800Var = this;
                        i = 0;
                        i2 = 0;
                        ResultKt.onNavigationEvent(objOnExtraCallback2);
                        AccountList accountList = (AccountList) objOnExtraCallback2;
                        r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauIAuthTabCallback = WidgetProductSelectViewModel.IAuthTabCallback(widgetProductSelectViewModel);
                        List listIAuthTabCallback = accountList.IAuthTabCallback();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
                        it = listIAuthTabCallback.iterator();
                        while (it.hasNext()) {
                        }
                        this.L$0 = widgetProductSelectViewModel;
                        this.L$1 = access15400.onNavigationEvent(access13800Var);
                        this.L$2 = access15400.onNavigationEvent(accountList);
                        this.I$0 = i2;
                        this.I$1 = i;
                        this.label = 3;
                        objOnExtraCallbackWithResult = r8lambdakeemxoi4two_xjjc4c2vgm4dauIAuthTabCallback.onExtraCallbackWithResult(arrayList2, this);
                    }
                } else {
                    r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauIAuthTabCallback2 = WidgetProductSelectViewModel.IAuthTabCallback(widgetProductSelectViewModel);
                    this.L$0 = widgetProductSelectViewModel;
                    this.L$1 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 4;
                    objOnExtraCallback = r8lambdakeemxoi4two_xjjc4c2vgm4dauIAuthTabCallback2.onExtraCallback(this);
                }
                return objOnExtraCallback3;
            }
            if (i4 == 1) {
                widgetProductSelectViewModel = (WidgetProductSelectViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objAsBinder = obj;
                List<q8ExternalSyntheticLambda1> listOnWarmupCompleted = q8ExternalSyntheticLambda1.Companion.onWarmupCompleted(((Boolean) objAsBinder).booleanValue());
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
                for (q8ExternalSyntheticLambda1 q8externalsyntheticlambda1 : listOnWarmupCompleted) {
                    arrayList.add(new WidgetWatchlists.WatchList.Item((String) null, (String) null, (Long) null, q8externalsyntheticlambda1.getCode(), q8externalsyntheticlambda1.getDisplayName(), 7, (DefaultConstructorMarker) null));
                }
                getCornerRadius getcornerradiusAsInterface = WidgetProductSelectViewModel.asInterface(widgetProductSelectViewModel);
                ArrayList arrayList3 = new ArrayList();
                int i7 = onWarmupCompleted + 81;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                while (r5.hasNext()) {
                }
                getcornerradiusAsInterface.onWarmupCompleted(arrayList3);
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                WidgetProductSelectViewModel widgetProductSelectViewModel2 = WidgetProductSelectViewModel.this;
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            if (i4 != 2) {
                int i9 = onExtraCallback + 51;
                int i10 = i9 % 128;
                onWarmupCompleted = i10;
                if (i9 % 2 == 0 ? i4 == 3 : i4 == 5) {
                    widgetProductSelectViewModel = (WidgetProductSelectViewModel) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
                    ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                    List<OverviewItemInfo> listIAuthTabCallback2 = ((OverviewAccounts) objOnExtraCallbackWithResult).IAuthTabCallback();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listIAuthTabCallback2, 10));
                    for (OverviewItemInfo overviewItemInfo : listIAuthTabCallback2) {
                        arrayList.add(new WidgetWatchlists.WatchList.Item((String) null, (String) null, (Long) null, overviewItemInfo.access100(), overviewItemInfo.IAuthTabCallbackStubProxy(), 7, (DefaultConstructorMarker) null));
                    }
                    getCornerRadius getcornerradiusAsInterface2 = WidgetProductSelectViewModel.asInterface(widgetProductSelectViewModel);
                    ArrayList arrayList32 = new ArrayList();
                    int i72 = onWarmupCompleted + 81;
                    onExtraCallback = i72 % 128;
                    int i82 = i72 % 2;
                    for (Object obj3 : arrayList) {
                        int i11 = onWarmupCompleted + 49;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        if (!intersect.IAuthTabCallback(((WidgetWatchlists.WatchList.Item) obj3).IAuthTabCallback())) {
                            arrayList32.add(obj3);
                            int i13 = onExtraCallback + 73;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                        }
                    }
                    getcornerradiusAsInterface2.onWarmupCompleted(arrayList32);
                    objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                    WidgetProductSelectViewModel widgetProductSelectViewModel22 = WidgetProductSelectViewModel.this;
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                        int i15 = onWarmupCompleted + 71;
                        onExtraCallback = i15 % 128;
                        if (i15 % 2 == 0) {
                            this.L$0 = objM31constructorimpl;
                            this.L$1 = access15400.onNavigationEvent(thM32exceptionOrNullimpl);
                            this.L$2 = null;
                            this.I$0 = 1;
                            this.label = 5;
                        } else {
                            this.L$0 = objM31constructorimpl;
                            this.L$1 = access15400.onNavigationEvent(thM32exceptionOrNullimpl);
                            this.L$2 = null;
                            this.I$0 = 0;
                            this.label = 5;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i4 != 4) {
                    int i16 = i10 + 115;
                    int i17 = i16 % 128;
                    onExtraCallback = i17;
                    int i18 = i16 % 2;
                    if (i4 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i19 = i17 + 111;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                widgetProductSelectViewModel = (WidgetProductSelectViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
                ResultKt.onNavigationEvent(objOnExtraCallback);
                List listOnExtraCallback = ((WidgetWatchlists) objOnExtraCallback).onExtraCallback();
                if (listOnExtraCallback != null) {
                    int size = listOnExtraCallback.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size) {
                            obj2 = null;
                            break;
                        }
                        int i22 = onExtraCallback + 47;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        obj2 = listOnExtraCallback.get(i21);
                        if (((Long) WidgetWatchlists.WatchList.onNavigationEvent(C40Encoder.onExtraCallback(), new Object[]{(WidgetWatchlists.WatchList) obj2}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 437005217, -437005217)).longValue() == WidgetProductSelectViewModel.onWarmupCompleted(widgetProductSelectViewModel)) {
                            break;
                        }
                        i21++;
                    }
                    WidgetWatchlists.WatchList watchList = (WidgetWatchlists.WatchList) obj2;
                    if (watchList == null || (arrayList = watchList.onExtraCallbackWithResult()) == null) {
                    }
                    getCornerRadius getcornerradiusAsInterface22 = WidgetProductSelectViewModel.asInterface(widgetProductSelectViewModel);
                    ArrayList arrayList322 = new ArrayList();
                    int i722 = onWarmupCompleted + 81;
                    onExtraCallback = i722 % 128;
                    int i822 = i722 % 2;
                    while (r5.hasNext()) {
                    }
                    getcornerradiusAsInterface22.onWarmupCompleted(arrayList322);
                    objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                    WidgetProductSelectViewModel widgetProductSelectViewModel222 = WidgetProductSelectViewModel.this;
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                arrayList = CollectionsKt__CollectionsKt.emptyList();
                getCornerRadius getcornerradiusAsInterface222 = WidgetProductSelectViewModel.asInterface(widgetProductSelectViewModel);
                ArrayList arrayList3222 = new ArrayList();
                int i7222 = onWarmupCompleted + 81;
                onExtraCallback = i7222 % 128;
                int i8222 = i7222 % 2;
                while (r5.hasNext()) {
                }
                getcornerradiusAsInterface222.onWarmupCompleted(arrayList3222);
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                WidgetProductSelectViewModel widgetProductSelectViewModel2222 = WidgetProductSelectViewModel.this;
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            int i24 = this.I$1;
            int i25 = this.I$0;
            access13800Var = (access13800) this.L$1;
            WidgetProductSelectViewModel widgetProductSelectViewModel3 = (WidgetProductSelectViewModel) this.L$0;
            ResultKt.onNavigationEvent(obj);
            objOnExtraCallback2 = ((Result) obj).onNavigationEvent();
            i2 = i25;
            i = i24;
            widgetProductSelectViewModel = widgetProductSelectViewModel3;
            ResultKt.onNavigationEvent(objOnExtraCallback2);
            AccountList accountList2 = (AccountList) objOnExtraCallback2;
            r8lambdaKeemXoI4Two_XjJC4c2Vgm4DAU r8lambdakeemxoi4two_xjjc4c2vgm4dauIAuthTabCallback3 = WidgetProductSelectViewModel.IAuthTabCallback(widgetProductSelectViewModel);
            List listIAuthTabCallback3 = accountList2.IAuthTabCallback();
            ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listIAuthTabCallback3, 10));
            it = listIAuthTabCallback3.iterator();
            while (it.hasNext()) {
                arrayList22.add(((Account) it.next()).IAuthTabCallbackStub());
            }
            this.L$0 = widgetProductSelectViewModel;
            this.L$1 = access15400.onNavigationEvent(access13800Var);
            this.L$2 = access15400.onNavigationEvent(accountList2);
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 3;
            objOnExtraCallbackWithResult = r8lambdakeemxoi4two_xjjc4c2vgm4dauIAuthTabCallback3.onExtraCallbackWithResult(arrayList22, this);
        }
    }

    public final void onExtraCallback(@NotNull WidgetWatchlists.WatchList.Item item) {
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(item, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(item, "");
        getPackageType getpackagetype = this.readTypedObject;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, null, 1, null);
        }
        this.readTypedObject = onLoadStarted.onExtraCallback(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), putChannelInfo.IAuthTabCallback(), null, new asInterface(item, null), 2, null);
        int i3 = onMinimized + 113;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ WidgetWatchlists.WatchList.Item $item;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(WidgetWatchlists.WatchList.Item item, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$item = item;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = WidgetProductSelectViewModel.this.new asInterface(this.$item, access13800Var);
            int i2 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return asinterface;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg2, access13800Var2);
            int i3 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterface = (asInterface) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return asinterface.invokeSuspend(unit);
            }
            asinterface.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Set mutableSet = CollectionsKt___CollectionsKt.toMutableSet((Iterable) WidgetProductSelectViewModel.IAuthTabCallbackStub(WidgetProductSelectViewModel.this).IAuthTabCallback());
                if (!mutableSet.remove(this.$item.IAuthTabCallback())) {
                    if (mutableSet.size() >= WidgetProductSelectViewModel.onExtraCallback(WidgetProductSelectViewModel.this)) {
                        getBorderRadius getborderradius = (getBorderRadius) WidgetProductSelectViewModel.onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), -846555863, 846555863, TTVideoLandingPageActivity.onExtraCallbackWithResult(), new Object[]{WidgetProductSelectViewModel.this}, TTVideoLandingPageActivity.onExtraCallbackWithResult());
                        String str = "최대 " + WidgetProductSelectViewModel.onExtraCallback(WidgetProductSelectViewModel.this) + "개까지 선택할 수 있어요.";
                        this.L$0 = access15400.onNavigationEvent(mutableSet);
                        this.label = 1;
                        if (getborderradius.emit(str, this) == objOnExtraCallback) {
                            int i3 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                            onNavigationEvent = i3 % 128;
                            int i4 = i3 % 2;
                            return objOnExtraCallback;
                        }
                    } else {
                        mutableSet.add(this.$item.IAuthTabCallback());
                    }
                }
                WidgetProductSelectViewModel.IAuthTabCallbackStub(WidgetProductSelectViewModel.this).onWarmupCompleted(mutableSet);
                return Unit.INSTANCE;
            }
            int i5 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            int i6 = i5 % 128;
            onNavigationEvent = i6;
            int i7 = i5 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i6 + 77;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                int i9 = 39 / 0;
            } else {
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i10 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = WidgetProductSelectViewModel.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onExtraCallback + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompleted.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(unit);
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (im.toss.tosssecurities.widget.watchlist.setting.product.WidgetProductSelectViewModel.onWarmupCompleted(r7, r6) == r1) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                WidgetProductSelectViewModel widgetProductSelectViewModel = WidgetProductSelectViewModel.this;
                this.label = 1;
                if (WidgetProductSelectViewModel.IAuthTabCallback(widgetProductSelectViewModel, this) != objOnExtraCallback) {
                }
                int i3 = onNavigationEvent + 67;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }
            int i5 = onNavigationEvent + 7;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            WidgetProductSelectViewModel widgetProductSelectViewModel2 = WidgetProductSelectViewModel.this;
            this.label = 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        if (onExtraCallbackWithResult(r4, r1) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r0.emit(r2, r1) == r3) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull access13800<? super Boolean> access13800Var) {
        onExtraCallback onextracallback;
        int i;
        Exception e;
        WebResourceResponseModel e2;
        Object objM31constructorimpl;
        Throwable thM32exceptionOrNullimpl;
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i3 = onActivityResized + 53;
            onMinimized = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = ((onExtraCallback) access13800Var).label;
                throw null;
            }
            onextracallback = (onExtraCallback) access13800Var;
            int i5 = onextracallback.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i5 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i6 = onextracallback.label;
        boolean z = false;
        try {
            if (i6 == 0) {
                ResultKt.onNavigationEvent(obj);
                int size = this.onWarmupCompleted.IAuthTabCallback().size();
                if (size != 0) {
                    int i7 = this.getInterfaceDescriptor;
                    if (size <= i7) {
                        try {
                            Result.Companion companion = Result.Companion;
                            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(null);
                            onextracallback.L$0 = access15400.onNavigationEvent(onextracallback);
                            onextracallback.I$0 = size;
                            onextracallback.I$1 = 0;
                            onextracallback.I$2 = 0;
                            onextracallback.label = 1;
                            if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onwarmupcompleted, onextracallback) == objOnExtraCallback) {
                                int i8 = onActivityResized + 111;
                                onMinimized = i8 % 128;
                                int i9 = i8 % 2;
                            } else {
                                i = size;
                                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
                            }
                        } catch (WebResourceResponseModel e3) {
                            i = size;
                            e2 = e3;
                            Result.Companion companion2 = Result.Companion;
                            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e2));
                            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                            if (thM32exceptionOrNullimpl != null) {
                            }
                            z = true;
                            return access14000.onNavigationEvent(z);
                        } catch (Exception e4) {
                            i = size;
                            e = e4;
                            Result.Companion companion3 = Result.Companion;
                            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                            if (thM32exceptionOrNullimpl != null) {
                            }
                            z = true;
                            return access14000.onNavigationEvent(z);
                        }
                    } else {
                        getBorderRadius<String> getborderradius = this.extraCallbackWithResult;
                        String str = "최대 " + i7 + "개까지 선택할 수 있어요.";
                        onextracallback.I$0 = size;
                        onextracallback.label = 3;
                    }
                    return objOnExtraCallback;
                }
                return access14000.onNavigationEvent(z);
            }
            if (i6 != 1) {
                int i10 = onActivityResized + 81;
                onMinimized = i10 % 128;
                int i11 = i10 % 2;
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return access14000.onNavigationEvent(z);
                }
                ResultKt.onNavigationEvent(obj);
                z = true;
                return access14000.onNavigationEvent(z);
            }
            i = onextracallback.I$0;
            try {
                ResultKt.onNavigationEvent(obj);
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            } catch (WebResourceResponseModel e5) {
                e2 = e5;
                Result.Companion companion22 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e2));
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                }
                z = true;
                return access14000.onNavigationEvent(z);
            } catch (Exception e6) {
                e = e6;
                Result.Companion companion32 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                }
                z = true;
                return access14000.onNavigationEvent(z);
            }
            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
                onextracallback.L$0 = objM31constructorimpl;
                onextracallback.L$1 = access15400.onNavigationEvent(thM32exceptionOrNullimpl);
                onextracallback.I$0 = i;
                onextracallback.I$1 = 0;
                onextracallback.label = 2;
            }
            z = true;
            return access14000.onNavigationEvent(z);
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    public final void onTransact() {
        int i = 2 % 2;
        List<WidgetWatchlists.WatchList.Item> listIAuthTabCallback = this.IAuthTabCallbackStubProxy.IAuthTabCallback();
        Object obj = null;
        if (listIAuthTabCallback == null) {
            int i2 = onMinimized + 97;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionsKt__CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            listIAuthTabCallback = CollectionsKt__CollectionsKt.emptyList();
        }
        int iMin = Math.min(this.getInterfaceDescriptor, listIAuthTabCallback.size());
        Set<String> setIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
        List<WidgetWatchlists.WatchList.Item> listSubList = listIAuthTabCallback.subList(0, iMin);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((WidgetWatchlists.WatchList.Item) it.next()).IAuthTabCallback());
        }
        Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = setIAuthTabCallback.iterator();
        while (it2.hasNext()) {
            int i3 = onMinimized + 21;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                set.contains((String) it2.next());
                throw null;
            }
            Object next = it2.next();
            if (!set.contains((String) next)) {
                arrayList2.add(next);
                int i4 = onActivityResized + 69;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        List listTake = CollectionsKt___CollectionsKt.take(set, iMin - arrayList2.size());
        this.writeTypedObject.onNavigationEvent("상위 " + this.access000 + " " + iMin + "개를 선택했어요.");
        this.onWarmupCompleted.onWarmupCompleted(CollectionsKt___CollectionsKt.toSet(CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) listTake)));
        int i6 = onMinimized + 89;
        onActivityResized = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void asInterface() {
        int i = 2 % 2;
        this.writeTypedObject.onNavigationEvent("모든 " + this.access000 + " 선택을 해제했어요.");
        this.onWarmupCompleted.onWarmupCompleted(clearNumber.onNavigationEvent());
        int i2 = onActivityResized + 15;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onActivityResized + 67;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = asBinder().onNavigationEvent(WidgetWatchlistSelectViewModel.Companion.onExtraCallbackWithResult(this.onTransact), access14000.onExtraCallback(this.extraCallback), sp.onNavigationEvent(LongCompanionObject.INSTANCE), access13800Var);
        if (objOnNavigationEvent != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i4 = onMinimized + 21;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onActivityResized + 9;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = asBinder().onNavigationEvent(Companion.onWarmupCompleted(this.onTransact), this.onWarmupCompleted.IAuthTabCallback(), sp.onWarmupCompleted(sp.onExtraCallbackWithResult(StringCompanionObject.INSTANCE)), access13800Var);
        if (objOnNavigationEvent != access14100.onExtraCallback()) {
            Unit unit = Unit.INSTANCE;
            int i4 = onActivityResized + Imgproc.COLOR_YUV2RGBA_YVYU;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
        int i6 = onActivityResized + 73;
        onMinimized = i6 % 128;
        if (i6 % 2 == 0) {
            return objOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(Throwable th, access13800<? super Unit> access13800Var) {
        asBinder asbinder;
        int i = 2 % 2;
        Object obj = null;
        if (access13800Var instanceof asBinder) {
            int i2 = onActivityResized + 31;
            onMinimized = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((asBinder) access13800Var).label;
                obj.hashCode();
                throw null;
            }
            asbinder = (asBinder) access13800Var;
            int i4 = asbinder.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onActivityResized + 83;
                onMinimized = i5 % 128;
                int i6 = i5 % 2;
                asbinder.label = i4 - 2147483648;
            } else {
                asbinder = new asBinder(access13800Var);
            }
        }
        Object obj2 = asbinder.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = asbinder.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(obj2);
            getBorderRadius<Throwable> getborderradius = this.IAuthTabCallback;
            asbinder.L$0 = th;
            asbinder.label = 1;
            if (getborderradius.emit(th, asbinder) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = onActivityResized + 79;
            onMinimized = i8 % 128;
            int i9 = i8 % 2;
            th = (Throwable) asbinder.L$0;
            ResultKt.onNavigationEvent(obj2);
        }
        q8a.IAuthTabCallback(q8a.onNavigationEvent, th, (Map) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final String onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            String str = "watchlist_id_product_" + i;
            int i3 = IAuthTabCallback + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
    }

    public static final /* synthetic */ r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo onNavigationEvent(WidgetProductSelectViewModel widgetProductSelectViewModel) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -2095742100, 2095742104, iOnExtraCallbackWithResult3, new Object[]{widgetProductSelectViewModel}, iOnExtraCallbackWithResult);
    }

    public static final /* synthetic */ decodeIpv6 onExtraCallbackWithResult(WidgetProductSelectViewModel widgetProductSelectViewModel) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (decodeIpv6) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1266285513, -1266285511, iOnExtraCallbackWithResult3, new Object[]{widgetProductSelectViewModel}, iOnExtraCallbackWithResult);
    }

    private static final DiskLruCacheEditornewSink11.IAuthTabCallback onExtraCallback(DiskLruCacheEntry diskLruCacheEntry) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (DiskLruCacheEditornewSink11.IAuthTabCallback) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1134506946, -1134506943, iOnExtraCallbackWithResult3, new Object[]{diskLruCacheEntry}, iOnExtraCallbackWithResult);
    }

    public final setRubIn<Boolean> onExtraCallback() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (setRubIn) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 1694380375, -1694380374, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    public final getBorderRadius<String> IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (getBorderRadius) onNavigationEvent(TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -846555863, 846555863, iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult);
    }
}
