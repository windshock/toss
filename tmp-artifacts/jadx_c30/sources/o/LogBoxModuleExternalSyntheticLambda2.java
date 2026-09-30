package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import im.toss.uikit.drawable.RoundRectCropTransformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.LogBoxModuleExternalSyntheticLambda2;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LogBoxModuleExternalSyntheticLambda2 implements RemoteViewsService.RemoteViewsFactory {
    private final Lazy IAuthTabCallback;
    private final List<RedBoxContentView> onExtraCallback;
    private final Intent onExtraCallbackWithResult;
    private final Context onWarmupCompleted;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return true;
    }

    public LogBoxModuleExternalSyntheticLambda2(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(intent, BuildConfig.FLAVOR);
        this.onWarmupCompleted = context;
        this.onExtraCallbackWithResult = intent;
        this.onExtraCallback = new ArrayList();
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.tossfeed.widget.TossFeedWidgetRemoteViewsFactory$$ExternalSyntheticLambda0
            public final Object invoke() {
                return Integer.valueOf(LogBoxModuleExternalSyntheticLambda2.IAuthTabCallback(this.f$0));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IAuthTabCallback(LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda2) {
        return logBoxModuleExternalSyntheticLambda2.onExtraCallbackWithResult.getIntExtra("appWidgetId", 0);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TOSS_FEED_WIDGET", "onCreate", (Map) null, (String) null, false, (String) null, 60, (Object) null);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TOSS_FEED_WIDGET", "onDataSetChanged", (Map) null, (String) null, false, (String) null, 60, (Object) null);
        this.onExtraCallback.clear();
        onWarmupCompleted();
    }

    private final void onWarmupCompleted() {
        this.onExtraCallback.addAll(onExtraCallback());
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends RedBoxContentView>>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<RedBoxContentView>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objEmptyList;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Result.Companion companion = Result.Companion;
                    isVideoContent isvideocontentICustomTabsCallbackStub = AdSettingsIntegrationErrorMode.onNavigationEvent.ICustomTabsCallbackStub();
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.L$1 = access15400.onNavigationEvent(findresandmsg);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = isvideocontentICustomTabsCallbackStub.onWarmupCompleted(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                objEmptyList = Result.constructor-impl((List) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objEmptyList = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(objEmptyList) != null) {
                objEmptyList = CollectionsKt.emptyList();
            }
            List<ReactRootViewExternalSyntheticApiModelOutline0> list = (List) objEmptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (ReactRootViewExternalSyntheticApiModelOutline0 reactRootViewExternalSyntheticApiModelOutline0 : list) {
                arrayList.add(new RedBoxContentView(reactRootViewExternalSyntheticApiModelOutline0.onWarmupCompleted(), reactRootViewExternalSyntheticApiModelOutline0.IAuthTabCallback(), reactRootViewExternalSyntheticApiModelOutline0.onExtraCallbackWithResult(), reactRootViewExternalSyntheticApiModelOutline0.onExtraCallback(), reactRootViewExternalSyntheticApiModelOutline0.onNavigationEvent()));
            }
            return arrayList;
        }
    }

    private final List<RedBoxContentView> onExtraCallback() {
        return (List) maybeUpdateAnimatable.onWarmupCompleted((CoroutineContext) null, new onWarmupCompleted(null), 1, (Object) null);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
        final /* synthetic */ RedBoxContentView $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(RedBoxContentView redBoxContentView, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$item = redBoxContentView;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return LogBoxModuleExternalSyntheticLambda2.this.new onExtraCallback(this.$item, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda2 = LogBoxModuleExternalSyntheticLambda2.this;
            String strOnExtraCallbackWithResult = this.$item.onExtraCallbackWithResult();
            this.label = 1;
            Object objOnExtraCallbackWithResult = logBoxModuleExternalSyntheticLambda2.onExtraCallbackWithResult(strOnExtraCallbackWithResult, this);
            return objOnExtraCallbackWithResult == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallbackWithResult;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getViewAt(int i) throws InterruptedException {
        RedBoxContentView redBoxContentView = (RedBoxContentView) CollectionsKt.getOrNull(this.onExtraCallback, i);
        if (redBoxContentView == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) maybeUpdateAnimatable.onWarmupCompleted((CoroutineContext) null, new onExtraCallback(redBoxContentView, null), 1, (Object) null);
        RemoteViews remoteViews = new RemoteViews(this.onWarmupCompleted.getPackageName(), R.layout.widget_toss_feed_item);
        remoteViews.setTextViewText(R.id.text_title, redBoxContentView.onNavigationEvent());
        remoteViews.setTextViewText(R.id.text_description, redBoxContentView.onWarmupCompleted());
        if (bitmap != null) {
            int i2 = R.id.image;
            remoteViews.setViewVisibility(i2, 0);
            remoteViews.setImageViewBitmap(i2, bitmap);
            remoteViews.setInt(i2, "setBackgroundColor", 0);
        } else {
            remoteViews.setViewVisibility(R.id.image, 8);
        }
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_APP_SCHEME", redBoxContentView.onExtraCallback());
        bundle.putString("EXTRA_CLICKED_SCHEMA_ID", redBoxContentView.IAuthTabCallback());
        RedBoxContentView redBoxContentView2 = (RedBoxContentView) CollectionsKt.getOrNull(this.onExtraCallback, 0);
        bundle.putString("EXTRA_FIRST_SCHEMA_ID", redBoxContentView2 != null ? redBoxContentView2.IAuthTabCallback() : null);
        RedBoxContentView redBoxContentView3 = (RedBoxContentView) CollectionsKt.getOrNull(this.onExtraCallback, 1);
        bundle.putString("EXTRA_SECOND_SCHEMA_ID", redBoxContentView3 != null ? redBoxContentView3.IAuthTabCallback() : null);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        remoteViews.setOnClickFillInIntent(R.id.widget_item, intent);
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        }
        return remoteViews;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
        final /* synthetic */ String $this_toBitmap;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ LogBoxModuleExternalSyntheticLambda2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$this_toBitmap = str;
            this.this$0 = logBoxModuleExternalSyntheticLambda2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$this_toBitmap, this.this$0, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x01ce, code lost:
        
            if (r0 == r2) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            RoundRectCropTransformation roundRectCropTransformation;
            Object objOnNavigationEvent;
            RoundRectCropTransformation roundRectCropTransformation2;
            Object obj2;
            Throwable th;
            Object objOnWarmupCompleted;
            Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    String str = this.$this_toBitmap;
                    if (str == null || StringsKt.isBlank(str)) {
                        return null;
                    }
                    Context context = this.this$0.onWarmupCompleted;
                    Integer numOnNavigationEvent = access14000.onNavigationEvent(14);
                    DisplayMetrics displayMetrics = this.this$0.onWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
                    RoundRectCropTransformation roundRectCropTransformation3 = new RoundRectCropTransformation(context, varyMatches.onNavigationEvent(numOnNavigationEvent, displayMetrics), 0, 0, false, (Integer) null, 60, (DefaultConstructorMarker) null);
                    LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda2 = this.this$0;
                    String str2 = this.$this_toBitmap;
                    try {
                        Result.Companion companion = Result.Companion;
                        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(logBoxModuleExternalSyntheticLambda2.onWarmupCompleted);
                        RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback = RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(logBoxModuleExternalSyntheticLambda2.onWarmupCompleted).onExtraCallback(str2), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{roundRectCropTransformation3});
                        Integer numOnNavigationEvent2 = access14000.onNavigationEvent(56);
                        DisplayMetrics displayMetrics2 = logBoxModuleExternalSyntheticLambda2.onWarmupCompleted.getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics2, BuildConfig.FLAVOR);
                        int iOnNavigationEvent = varyMatches.onNavigationEvent(numOnNavigationEvent2, displayMetrics2);
                        Integer numOnNavigationEvent3 = access14000.onNavigationEvent(56);
                        DisplayMetrics displayMetrics3 = logBoxModuleExternalSyntheticLambda2.onWarmupCompleted.getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics3, BuildConfig.FLAVOR);
                        RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = onnavigationeventIAuthTabCallback.onExtraCallback(iOnNavigationEvent, varyMatches.onNavigationEvent(numOnNavigationEvent3, displayMetrics3)).onExtraCallbackWithResult();
                        this.L$0 = roundRectCropTransformation3;
                        this.L$1 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        objOnNavigationEvent = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult, this);
                        if (objOnNavigationEvent != objOnWarmupCompleted2) {
                            roundRectCropTransformation2 = roundRectCropTransformation3;
                        }
                    } catch (Exception e) {
                        e = e;
                        roundRectCropTransformation = roundRectCropTransformation3;
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e));
                        roundRectCropTransformation2 = roundRectCropTransformation;
                        LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda22 = this.this$0;
                        th = Result.exceptionOrNull-impl(obj2);
                        if (th != null) {
                        }
                        return (Bitmap) obj2;
                    } catch (WebResourceResponseModel e2) {
                        e = e2;
                        roundRectCropTransformation = roundRectCropTransformation3;
                        Result.Companion companion3 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(e));
                        roundRectCropTransformation2 = roundRectCropTransformation;
                        LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda222 = this.this$0;
                        th = Result.exceptionOrNull-impl(obj2);
                        if (th != null) {
                        }
                        return (Bitmap) obj2;
                    }
                    return objOnWarmupCompleted2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnWarmupCompleted = obj;
                    obj2 = (Bitmap) objOnWarmupCompleted;
                    return (Bitmap) obj2;
                }
                roundRectCropTransformation2 = (RoundRectCropTransformation) this.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = obj;
                } catch (WebResourceResponseModel e3) {
                    e = e3;
                    roundRectCropTransformation = roundRectCropTransformation2;
                    Result.Companion companion32 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e));
                    roundRectCropTransformation2 = roundRectCropTransformation;
                    LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda2222 = this.this$0;
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                    }
                    return (Bitmap) obj2;
                } catch (Exception e4) {
                    e = e4;
                    roundRectCropTransformation = roundRectCropTransformation2;
                    Result.Companion companion22 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e));
                    roundRectCropTransformation2 = roundRectCropTransformation;
                    LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda22222 = this.this$0;
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                    }
                    return (Bitmap) obj2;
                }
                CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult = ((RecomposerErrorInformation) objOnNavigationEvent).onExtraCallbackWithResult();
                obj2 = Result.constructor-impl(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult != null ? CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7OnExtraCallbackWithResult, 0, 0, 3, (Object) null) : null);
                LogBoxModuleExternalSyntheticLambda2 logBoxModuleExternalSyntheticLambda222222 = this.this$0;
                th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    Integer numOnNavigationEvent4 = access14000.onNavigationEvent(56);
                    DisplayMetrics displayMetrics4 = logBoxModuleExternalSyntheticLambda222222.onWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics4, BuildConfig.FLAVOR);
                    int iOnNavigationEvent2 = varyMatches.onNavigationEvent(numOnNavigationEvent4, displayMetrics4);
                    Integer numOnNavigationEvent5 = access14000.onNavigationEvent(56);
                    DisplayMetrics displayMetrics5 = logBoxModuleExternalSyntheticLambda222222.onWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics5, BuildConfig.FLAVOR);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iOnNavigationEvent2, varyMatches.onNavigationEvent(numOnNavigationEvent5, displayMetrics5), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    int color = logBoxModuleExternalSyntheticLambda222222.onWarmupCompleted.getColor(im.toss.tds.R.color.grey_100);
                    canvas.drawColor(color);
                    Integer numOnNavigationEvent6 = access14000.onNavigationEvent(56);
                    DisplayMetrics displayMetrics6 = logBoxModuleExternalSyntheticLambda222222.onWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics6, BuildConfig.FLAVOR);
                    int iOnNavigationEvent3 = varyMatches.onNavigationEvent(numOnNavigationEvent6, displayMetrics6);
                    Integer numOnNavigationEvent7 = access14000.onNavigationEvent(56);
                    DisplayMetrics displayMetrics7 = logBoxModuleExternalSyntheticLambda222222.onWarmupCompleted.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics7, BuildConfig.FLAVOR);
                    RememberObserverHolder rememberObserverHolderOnExtraCallback = RememberedCoroutineScope.onExtraCallback(iOnNavigationEvent3, varyMatches.onNavigationEvent(numOnNavigationEvent7, displayMetrics7));
                    this.L$0 = access15400.onNavigationEvent(roundRectCropTransformation2);
                    this.L$1 = access15400.onNavigationEvent(th);
                    this.L$2 = access15400.onNavigationEvent(canvas);
                    this.L$3 = access15400.onNavigationEvent(bitmapCreateBitmap);
                    this.I$0 = 0;
                    this.I$1 = color;
                    this.label = 2;
                    objOnWarmupCompleted = roundRectCropTransformation2.onWarmupCompleted(bitmapCreateBitmap, rememberObserverHolderOnExtraCallback, this);
                }
                return (Bitmap) obj2;
            } catch (CancellationException e5) {
                throw e5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onExtraCallbackWithResult(String str, access13800<? super Bitmap> access13800Var) {
        return maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(str, this, null), access13800Var);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.onExtraCallback.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
        this.onExtraCallback.clear();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return new RemoteViews(this.onWarmupCompleted.getPackageName(), R.layout.widget_toss_feed_skeleton);
    }
}
