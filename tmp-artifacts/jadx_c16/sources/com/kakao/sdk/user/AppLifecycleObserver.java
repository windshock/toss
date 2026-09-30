package com.kakao.sdk.user;

import androidx.lifecycle.LifecycleEventObserver;
import com.kakao.sdk.user.model.AccessTokenInfo;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.computeVerticalScrollExtent;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppLifecycleObserver implements LifecycleEventObserver {
    private static final int INTERVAL_HOUR = 6;
    private long prevTimeMillis;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<AppLifecycleObserver> instance$delegate = LazyKt.onExtraCallbackWithResult(onExtraCallbackWithResult.onExtraCallback);

    public static final AppLifecycleObserver getInstance() {
        return Companion.getInstance();
    }

    public void onStateChanged(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis - this.prevTimeMillis) < 6) {
                return;
            }
            this.prevTimeMillis = jCurrentTimeMillis;
            computeVerticalScrollExtent.Companion.onExtraCallback().IAuthTabCallback(onWarmupCompleted.onWarmupCompleted);
        }
    }

    static final class onWarmupCompleted extends Lambda implements Function2<AccessTokenInfo, Throwable, Unit> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(2);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function0<AppLifecycleObserver> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AppLifecycleObserver invoke() {
            return new AppLifecycleObserver();
        }
    }
}
