package o;

import android.app.Application;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class initView {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private final AtomicBoolean IAuthTabCallback;
    private final findResAndMsg onExtraCallbackWithResult;
    private final Set<getIconPaddingBottom> onNavigationEvent;
    private final initLayout onWarmupCompleted;

    static {
        int i = onExtraCallback + 109;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public initView(@NotNull initLayout initlayout, @NotNull Set<getIconPaddingBottom> set) {
        Intrinsics.checkNotNullParameter(initlayout, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.onWarmupCompleted = initlayout;
        this.onNavigationEvent = set;
        this.IAuthTabCallback = new AtomicBoolean(false);
        this.onExtraCallbackWithResult = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
    }

    public static final /* synthetic */ initLayout onExtraCallback(initView initview) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        initLayout initlayout = initview.onWarmupCompleted;
        if (i3 != 0) {
            return initlayout;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(initView initview, Application application, onViewDraw onviewdraw) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        initview.onExtraCallbackWithResult(application, onviewdraw);
        int i4 = onTransact + 59;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted(@NotNull Application application) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(application, "");
            if (!this.IAuthTabCallback.compareAndSet(false, true)) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(application, "");
            if (!this.IAuthTabCallback.compareAndSet(false, true)) {
                return;
            }
        }
        maybeUpdateAnimatable.onNavigationEvent(this.onExtraCallbackWithResult, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, application, (access13800) null), 3, (Object) null);
        Iterator it = onViewDraw.getEntries().iterator();
        while (it.hasNext()) {
            onExtraCallbackWithResult(application, (onViewDraw) it.next());
            int i3 = IAuthTabCallbackDefault + 99;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private final void onExtraCallbackWithResult(Application application, onViewDraw onviewdraw) throws Throwable {
        Object obj;
        Throwable th;
        int i = 2 % 2;
        getIconPaddingTop geticonpaddingtopIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback(onviewdraw);
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            for (getIconPaddingBottom geticonpaddingbottom : this.onNavigationEvent) {
                int i4 = onTransact + 117;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                if (geticonpaddingbottom.onExtraCallback() == onviewdraw) {
                    try {
                        Result.Companion companion = kotlin.Result.Companion;
                        geticonpaddingbottom.onExtraCallbackWithResult(application, geticonpaddingtopIAuthTabCallback);
                        obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
                    }
                    th = kotlin.Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                        break;
                    }
                }
            }
            return;
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SdkConsentGatekeeper", "consent adapter apply failed: " + geticonpaddingbottom.getClass().getSimpleName(), th, (Map) null, 8, (Object) null);
            i2 = onTransact + 19;
            IAuthTabCallbackDefault = i2 % 128;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
