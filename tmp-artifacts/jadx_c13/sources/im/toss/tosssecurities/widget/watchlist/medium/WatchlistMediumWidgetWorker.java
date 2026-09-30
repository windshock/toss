package im.toss.tosssecurities.widget.watchlist.medium;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.work.WorkerParameters;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.securities.widget.watchlist.R;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.data.WatchlistWidgetWorker;
import im.toss.tosssecurities.widget.watchlist.medium.SecuritiesWatchlistMediumAppWidgetReceiver;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFi1uSDK;
import o.AFj1aSDK;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DiskLruCacheEntry;
import o.ResourceCallback;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.ToggleableAppBarItemExternalSyntheticLambda2;
import o.TooltipKtExternalSyntheticLambda10;
import o.TooltipKtExternalSyntheticLambda3;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.access13800;
import o.access14100;
import o.access15400;
import o.access8000;
import o.findRes;
import o.findResAndMsg;
import o.getWrite;
import o.onLoadStarted;
import o.onLost;
import o.putChannelInfo;
import o.q8ExternalSyntheticLambda4;
import o.q8a;
import o.r0e;
import o.r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg;
import o.registerClient;
import o.x_;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class WatchlistMediumWidgetWorker extends WatchlistWidgetWorker {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final q8ExternalSyntheticLambda4 onExtraCallbackWithResult;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onWarmupCompleted = 8;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = WatchlistMediumWidgetWorker.this.onExtraCallback(null, 0, null, this);
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objIAuthTabCallback = WatchlistMediumWidgetWorker.IAuthTabCallback(WatchlistMediumWidgetWorker.this, null, null, null, this);
            int i4 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 11;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistMediumWidgetWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull x_ x_Var, @NotNull registerClient registerclient) {
        super(context, workerParameters, diskLruCacheEntry, x_Var, registerclient);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(x_Var, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.onExtraCallbackWithResult = q8ExternalSyntheticLambda4.medium;
    }

    public static final /* synthetic */ Object IAuthTabCallback(WatchlistMediumWidgetWorker watchlistMediumWidgetWorker, Context context, List list, DisplaySetting displaySetting, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = watchlistMediumWidgetWorker.onExtraCallbackWithResult(context, list, displaySetting, access13800Var);
        int i4 = IAuthTabCallbackStub + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.data.WatchlistWidgetWorker
    public q8ExternalSyntheticLambda4 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        q8ExternalSyntheticLambda4 q8externalsyntheticlambda4 = this.onExtraCallbackWithResult;
        int i4 = i2 + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return q8externalsyntheticlambda4;
        }
        throw null;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.data.WatchlistWidgetWorker
    public void onExtraCallback(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState) throws Throwable {
        SecuritiesWatchlistMediumAppWidgetReceiver.IAuthTabCallback iAuthTabCallback;
        onLost.onWarmupCompleted onwarmupcompleted;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
            iAuthTabCallback = SecuritiesWatchlistMediumAppWidgetReceiver.Companion;
            onwarmupcompleted = null;
            z = false;
            i2 = 62;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(watchlistWidgetState, "");
            iAuthTabCallback = SecuritiesWatchlistMediumAppWidgetReceiver.Companion;
            onwarmupcompleted = null;
            z = false;
            i2 = 24;
        }
        SecuritiesWatchlistMediumAppWidgetReceiver.IAuthTabCallback.IAuthTabCallback(iAuthTabCallback, context, i, watchlistWidgetState, onwarmupcompleted, z, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    @Override // im.toss.tosssecurities.widget.watchlist.data.WatchlistWidgetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull Context context, int i, @NotNull WatchlistWidgetState watchlistWidgetState, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        List<WatchlistWidgetState.RowItem> listEmptyList;
        WatchlistWidgetState watchlistWidgetState2;
        Context context2;
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 3;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            boolean z = access13800Var instanceof onExtraCallbackWithResult;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i5 = onextracallbackwithresult.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = IAuthTabCallback + 105;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    onextracallbackwithresult.label = i5 / Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i5 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = onextracallbackwithresult.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            boolean z2 = watchlistWidgetState instanceof WatchlistWidgetState.ProductSuccess;
            if (z2) {
                if (z2) {
                    listEmptyList = (List) WatchlistWidgetState.ProductSuccess.onExtraCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 1766261298, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(WatchlistWidgetState.ProductSuccess) watchlistWidgetState}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -1766261296);
                } else {
                    listEmptyList = !(watchlistWidgetState instanceof WatchlistWidgetState.IndexSuccess) ? CollectionsKt__CollectionsKt.emptyList() : ((WatchlistWidgetState.IndexSuccess) watchlistWidgetState).asInterface();
                }
                r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000 = z2 ? ((WatchlistWidgetState.ProductSuccess) watchlistWidgetState).access000() : watchlistWidgetState instanceof WatchlistWidgetState.IndexSuccess ? r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.INDEX : r8lambdabriZZqZHAIZmDvStl2yYmmz7zSg.MY_ASSET;
                if (Build.VERSION.SDK_INT >= 31) {
                    int i8 = IAuthTabCallbackStub + 87;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    DisplaySetting displaySettingOnNavigationEvent = watchlistWidgetState.onNavigationEvent();
                    onextracallbackwithresult.L$0 = context;
                    onextracallbackwithresult.L$1 = watchlistWidgetState;
                    onextracallbackwithresult.L$2 = access15400.onNavigationEvent(listEmptyList);
                    onextracallbackwithresult.L$3 = access15400.onNavigationEvent(r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000);
                    onextracallbackwithresult.I$0 = i;
                    onextracallbackwithresult.label = 1;
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(context, listEmptyList, displaySettingOnNavigationEvent, onextracallbackwithresult);
                    if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                        int i10 = IAuthTabCallback + 5;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        return objOnExtraCallback;
                    }
                    watchlistWidgetState2 = watchlistWidgetState;
                    context2 = context;
                    i2 = i;
                } else {
                    AFi1uSDK.Companion.onWarmupCompleted(context, i, listEmptyList, r8lambdabrizzqzhaizmdvstl2yymmz7zsgAccess000, watchlistWidgetState.onNavigationEvent());
                    SecuritiesWatchlistMediumAppWidgetReceiver.IAuthTabCallback.IAuthTabCallback(SecuritiesWatchlistMediumAppWidgetReceiver.Companion, context, i, watchlistWidgetState, null, true, 8, null);
                    AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, R.id.item_container);
                }
            } else {
                int i12 = IAuthTabCallbackStub + 35;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 4 / 0;
                    if (!(watchlistWidgetState instanceof WatchlistWidgetState.IndexSuccess)) {
                        SecuritiesWatchlistMediumAppWidgetReceiver.IAuthTabCallback.IAuthTabCallback(SecuritiesWatchlistMediumAppWidgetReceiver.Companion, context, i, watchlistWidgetState, null, false, 24, null);
                    }
                } else if (!(watchlistWidgetState instanceof WatchlistWidgetState.IndexSuccess)) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i14 = IAuthTabCallbackStub + 25;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
        int i16 = onextracallbackwithresult.I$0;
        WatchlistWidgetState watchlistWidgetState3 = (WatchlistWidgetState) onextracallbackwithresult.L$1;
        Context context3 = (Context) onextracallbackwithresult.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        i2 = i16;
        context2 = context3;
        watchlistWidgetState2 = watchlistWidgetState3;
        SecuritiesWatchlistMediumAppWidgetReceiver.IAuthTabCallback.IAuthTabCallback(SecuritiesWatchlistMediumAppWidgetReceiver.Companion, context2, i2, watchlistWidgetState2, (onLost.onWarmupCompleted) objOnExtraCallbackWithResult, false, 16, null);
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Map<String, Bitmap> $chartBitmaps;
        final /* synthetic */ Context $context;
        final /* synthetic */ DisplaySetting $displaySetting;
        final /* synthetic */ List<WatchlistWidgetState.RowItem> $items;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(List<WatchlistWidgetState.RowItem> list, Context context, DisplaySetting displaySetting, Map<String, Bitmap> map, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$items = list;
            this.$context = context;
            this.$displaySetting = displaySetting;
            this.$chartBitmaps = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$items, this.$context, this.$displaySetting, this.$chartBitmaps, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends Bitmap>>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ DisplaySetting $displaySetting;
            final /* synthetic */ WatchlistWidgetState.RowItem $item;
            int label;
            private static final byte[] $$a = {66, 42, 112, 97};
            private static final int $$b = 228;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onNavigationEvent = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int IAuthTabCallback = 478308875;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(short s, byte b, byte b2) {
                int i;
                int i2 = 105 - (b2 * 4);
                byte[] bArr = $$a;
                int i3 = 3 - (b * 3);
                int i4 = s * 2;
                byte[] bArr2 = new byte[i4 + 1];
                if (bArr == null) {
                    int i5 = i4;
                    int i6 = i3;
                    int i7 = 0;
                    int i8 = (-i3) + i5;
                    i = i7;
                    int i9 = i6;
                    i2 = i8;
                    i3 = i9;
                    int i10 = i3 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i4) {
                        return new String(bArr2, 0);
                    }
                    int i11 = i2;
                    i6 = i10;
                    i3 = bArr[i10];
                    i7 = i + 1;
                    i5 = i11;
                    int i82 = (-i3) + i5;
                    i = i7;
                    int i92 = i6;
                    i2 = i82;
                    i3 = i92;
                    int i102 = i3 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i4) {
                    }
                } else {
                    i = 0;
                    int i1022 = i3 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i4) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(WatchlistWidgetState.RowItem rowItem, Context context, DisplaySetting displaySetting, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.$item = rowItem;
                this.$context = context;
                this.$displaySetting = displaySetting;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$item, this.$context, this.$displaySetting, access13800Var);
                int i2 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Pair<? extends String, ? extends Bitmap>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i4 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Pair<String, Bitmap>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i3 + 85;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Object obj2 = null;
                ResultKt.onNavigationEvent(obj);
                try {
                    if (i6 == 0) {
                        return getWrite.IAuthTabCallback(this.$item.IAuthTabCallbackStub(), AFj1aSDK.onNavigationEvent(this.$context, this.$item, this.$displaySetting));
                    }
                    getWrite.IAuthTabCallback(this.$item.IAuthTabCallbackStub(), AFj1aSDK.onNavigationEvent(this.$context, this.$item, this.$displaySetting));
                    obj2.hashCode();
                    throw null;
                } catch (Exception e) {
                    q8a q8aVar = q8a.onNavigationEvent;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("function", "preloadChartBitmaps");
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("productCode", this.$item.IAuthTabCallbackStub());
                    String message = e.getMessage();
                    if (message == null) {
                        Object[] objArr = new Object[1];
                        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, 4 - View.MeasureSpec.getMode(0), new char[]{65534, 65535, 7, 65534, 5, 65534, 65531}, false, 146 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                        message = ((String) objArr[0]).intern();
                    }
                    q8aVar.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("error", message)));
                    int i7 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x015d  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
                int i4;
                Throwable cause;
                int i5 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (true) {
                    i4 = 2083011369;
                    if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                        break;
                    }
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                    int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35125), 23 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 12844), (ViewConfiguration.getScrollBarSize() >> 8) + 55, 2167 - (ViewConfiguration.getTouchSlop() >> 8), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i2 > 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                }
                if (z) {
                    int i7 = $11 + 67;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    char[] cArr4 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                        int i9 = $11 + 93;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) >> 1];
                            Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                            if (objOnExtraCallback3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 55 - View.MeasureSpec.getMode(0), Color.green(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } else {
                            cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                            try {
                                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                                if (objOnExtraCallback4 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (KeyEvent.getMaxKeyCode() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
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
                        i4 = 2083011369;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                List<WatchlistWidgetState.RowItem> list = this.$items;
                Context context = this.$context;
                DisplaySetting displaySetting = this.$displaySetting;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(onLoadStarted.onWarmupCompleted(findresandmsg, putChannelInfo.onWarmupCompleted(), null, new IAuthTabCallback((WatchlistWidgetState.RowItem) it.next(), context, displaySetting, null), 2, null));
                }
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                obj = ResourceCallback.IAuthTabCallback(arrayList, this);
                if (obj == objOnExtraCallback) {
                    int i5 = onWarmupCompleted + 89;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull((Iterable) obj);
            Map<String, Bitmap> map = this.$chartBitmaps;
            Iterator it2 = listFilterNotNull.iterator();
            while (it2.hasNext()) {
                int i7 = onWarmupCompleted + 103;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    Pair pair = (Pair) it2.next();
                    map.put((String) pair.onExtraCallbackWithResult(), (Bitmap) pair.IAuthTabCallback());
                    obj2.hashCode();
                    throw null;
                }
                Pair pair2 = (Pair) it2.next();
                map.put((String) pair2.onExtraCallbackWithResult(), (Bitmap) pair2.IAuthTabCallback());
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onWarmupCompleted + 27;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 90 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(Context context, List<WatchlistWidgetState.RowItem> list, DisplaySetting displaySetting, access13800<? super onLost.onWarmupCompleted> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Map map;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = onwarmupcompleted.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) onwarmupcompleted.L$3;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            onNavigationEvent onnavigationevent = new onNavigationEvent(list, context, displaySetting, linkedHashMap, null);
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(context);
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(list);
            onwarmupcompleted.L$2 = access15400.onNavigationEvent(displaySetting);
            onwarmupcompleted.L$3 = linkedHashMap;
            onwarmupcompleted.label = 1;
            if (findRes.onExtraCallbackWithResult(onnavigationevent, onwarmupcompleted) == objOnExtraCallback) {
                int i5 = IAuthTabCallbackStub + 81;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 14 / 0;
                }
                return objOnExtraCallback;
            }
            map = linkedHashMap;
        }
        return new onLost.onWarmupCompleted(map);
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ boolean IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Context context, int i, boolean z, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 4) != 0) {
                int i4 = onWarmupCompleted + 89;
                onExtraCallback = i4 % 128;
                z = i4 % 2 != 0;
            }
            boolean zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(context, i, z);
            int i5 = onWarmupCompleted + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return zOnExtraCallbackWithResult;
        }

        public final void onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "WATCHLIST_MEDIUM_");
            int i4 = onWarmupCompleted + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallbackWithResult(@NotNull Context context, int i, boolean z) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 15;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e r0eVar = r0e.onExtraCallbackWithResult;
            if (!z) {
                int i5 = onExtraCallback + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (r0eVar.IAuthTabCallback(context, "WATCHLIST_MEDIUM_", i)) {
                    int i7 = onExtraCallback + 5;
                    onWarmupCompleted = i7 % 128;
                    return i7 % 2 == 0;
                }
            }
            String str = "WATCHLIST_MEDIUM_" + i;
            TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3 = z ? TooltipKtExternalSyntheticLambda3.REPLACE : TooltipKtExternalSyntheticLambda3.KEEP;
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback2 = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(WatchlistMediumWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
            Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i)), getWrite.IAuthTabCallback("tag", "WATCHLIST_MEDIUM_")};
            TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
            int i8 = onWarmupCompleted + 87;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            for (int i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
            }
            TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback2.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("WATCHLIST_MEDIUM_").asBinder());
            return true;
        }

        public final void onWarmupCompleted(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            r0e.onExtraCallbackWithResult.onExtraCallbackWithResult(context, "WATCHLIST_MEDIUM_");
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SecuritiesWatchlistMediumAppWidgetReceiver.class));
            Intrinsics.checkNotNull(appWidgetIds);
            for (int i2 : appWidgetIds) {
                r0e r0eVar = r0e.onExtraCallbackWithResult;
                String str = "WATCHLIST_MEDIUM_" + i2;
                TooltipKtExternalSyntheticLambda3 tooltipKtExternalSyntheticLambda3 = TooltipKtExternalSyntheticLambda3.REPLACE;
                Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onExtraCallback2 = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(WatchlistMediumWidgetWorker.class).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 10L, TimeUnit.SECONDS);
                Pair[] pairArr = {getWrite.IAuthTabCallback("appWidgetId", Integer.valueOf(i2)), getWrite.IAuthTabCallback("tag", "WATCHLIST_MEDIUM_")};
                TooltipKtExternalSyntheticLambda10.onExtraCallback onextracallback = new TooltipKtExternalSyntheticLambda10.onExtraCallback();
                int i3 = 0;
                while (i3 < 2) {
                    int i4 = onWarmupCompleted + 107;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        Pair pair = pairArr[i3];
                        onextracallback.onExtraCallbackWithResult((String) pair.getFirst(), pair.getSecond());
                        i3 += 22;
                    } else {
                        Pair pair2 = pairArr[i3];
                        onextracallback.onExtraCallbackWithResult((String) pair2.getFirst(), pair2.getSecond());
                        i3++;
                    }
                }
                TooltipKtExternalSyntheticLambda10 tooltipKtExternalSyntheticLambda10IAuthTabCallback = onextracallback.IAuthTabCallback();
                Intrinsics.checkNotNullExpressionValue(tooltipKtExternalSyntheticLambda10IAuthTabCallback, "");
                TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback(str, tooltipKtExternalSyntheticLambda3, onExtraCallback2.IAuthTabCallback(tooltipKtExternalSyntheticLambda10IAuthTabCallback).onExtraCallback("WATCHLIST_MEDIUM_").asBinder());
            }
            int i5 = onExtraCallback + 73;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
