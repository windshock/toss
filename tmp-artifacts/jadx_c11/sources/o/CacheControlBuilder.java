package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CacheControlBuilder {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public static final CacheControlBuilder onExtraCallbackWithResult = new CacheControlBuilder();
    private static final LruCache<onlyIfCached, Bitmap> onWarmupCompleted = new LruCache<>(3);

    private CacheControlBuilder() {
    }

    static {
        int i = onNavigationEvent + 105;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LruCache<onlyIfCached, Bitmap> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 55;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        LruCache<onlyIfCached, Bitmap> lruCache = onWarmupCompleted;
        int i5 = i2 + 77;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return lruCache;
    }

    public final Object onExtraCallback(@NotNull Context context, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallbackWithResult(context, null), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            Unit unit = Unit.INSTANCE;
            int i2 = IAuthTabCallback + 25;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 87;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return objOnExtraCallback;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Context $context;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Context context, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$context, access13800Var);
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00a1 -> B:20:0x00b3). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterable iterable;
            Context context;
            int i;
            Iterator it;
            LruCache<onlyIfCached, Bitmap> lruCacheOnNavigationEvent;
            Bitmap bitmapOnExtraCallbackWithResult;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Iterable entries = onlyIfCached.getEntries();
                iterable = entries;
                context = this.$context;
                i = 0;
                it = entries.iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                onlyIfCached onlyifcached = (onlyIfCached) this.L$4;
                it = (Iterator) this.L$2;
                context = (Context) this.L$1;
                iterable = (Iterable) this.L$0;
                ResultKt.onNavigationEvent(obj);
                RecomposerKt recomposerKt = (RecomposerErrorInformation) obj;
                if (recomposerKt instanceof RecomposerKt) {
                    int i5 = onNavigationEvent + 101;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        lruCacheOnNavigationEvent = CacheControlBuilder.onExtraCallbackWithResult.onNavigationEvent();
                        bitmapOnExtraCallbackWithResult = CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(recomposerKt.onExtraCallbackWithResult(), 1, 0, 5, (Object) null);
                    } else {
                        lruCacheOnNavigationEvent = CacheControlBuilder.onExtraCallbackWithResult.onNavigationEvent();
                        bitmapOnExtraCallbackWithResult = CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(recomposerKt.onExtraCallbackWithResult(), 0, 0, 3, (Object) null);
                    }
                    lruCacheOnNavigationEvent.put(onlyifcached, bitmapOnExtraCallbackWithResult);
                }
                if (it.hasNext()) {
                    Object next = it.next();
                    onlyifcached = (onlyIfCached) next;
                    RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(onlyifcached.getUrl());
                    RecomposerHotReloadable recomposerHotReloadable = RecomposerHotReloadable.ENABLED;
                    RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = Recomposerjoin2.IAuthTabCallback(onnavigationeventOnExtraCallback.onNavigationEvent(recomposerHotReloadable).onWarmupCompleted(recomposerHotReloadable), false).onExtraCallbackWithResult();
                    CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
                    this.L$0 = access15400.onNavigationEvent(iterable);
                    this.L$1 = context;
                    this.L$2 = it;
                    this.L$3 = access15400.onNavigationEvent(next);
                    this.L$4 = onlyifcached;
                    this.L$5 = access15400.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult);
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onNavigationEvent(recomposerawaitIdle2OnExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        int i6 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    RecomposerKt recomposerKt2 = (RecomposerErrorInformation) obj;
                    if (recomposerKt2 instanceof RecomposerKt) {
                    }
                    if (it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }
}
