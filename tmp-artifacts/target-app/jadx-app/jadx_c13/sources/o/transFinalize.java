package o;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactContext;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.transFinalize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import run.granite.DefaultErrorView;
import run.granite.DefaultLoadingView;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface transFinalize {
    default void IAuthTabCallback(@NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "");
    }

    logicVerifyID IAuthTabCallbackStub();

    transGenerateCertNum onPostMessage();

    List<ReactPackage> requestPostMessageChannelWithExtras();

    /* JADX INFO: Access modifiers changed from: private */
    static List onNavigationEvent(transFinalize transfinalize) {
        return transfinalize.requestPostMessageChannelWithExtras();
    }

    default void onWarmupCompleted(@NotNull AppCompatActivity appCompatActivity, @Nullable Bundle bundle, @NotNull Bundle bundle2) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(bundle2, "");
        onPostMessage().onExtraCallback(new Function0() { // from class: run.granite.GraniteReactHost$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return transFinalize.onNavigationEvent(this.f$0);
            }
        });
        onPostMessage().onNavigationEvent(new Function0() { // from class: run.granite.GraniteReactHost$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return transFinalize.onExtraCallback(this.f$0);
            }
        });
        onPostMessage().IAuthTabCallback(new Function1() { // from class: run.granite.GraniteReactHost$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return transFinalize.onExtraCallbackWithResult(this.f$0, (AppCompatActivity) obj);
            }
        });
        onPostMessage().onExtraCallbackWithResult(new Function2() { // from class: run.granite.GraniteReactHost$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return transFinalize.IAuthTabCallback(this.f$0, (AppCompatActivity) obj, (Throwable) obj2);
            }
        });
        onPostMessage().onExtraCallbackWithResult(appCompatActivity, bundle, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static logicVerifyID onExtraCallback(transFinalize transfinalize) {
        return transfinalize.IAuthTabCallbackStub();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static View onExtraCallbackWithResult(transFinalize transfinalize, AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        return transfinalize.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static View IAuthTabCallback(transFinalize transfinalize, AppCompatActivity appCompatActivity, Throwable th) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(th, "");
        return transfinalize.onExtraCallback(th);
    }

    default void onExtraCallbackWithResult(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        onPostMessage().onExtraCallback(appCompatActivity);
    }

    default void onExtraCallback(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        onPostMessage().onWarmupCompleted(appCompatActivity);
    }

    default void onNavigationEvent(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        onPostMessage().IAuthTabCallback(appCompatActivity);
    }

    default View asBinder() {
        Intrinsics.checkNotNull(this, "");
        return new DefaultLoadingView((AppCompatActivity) this);
    }

    default View onExtraCallback(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNull(this, "");
        return new DefaultErrorView((AppCompatActivity) this, th);
    }

    default logicVerifyID readTypedObject() {
        return onPostMessage().onExtraCallbackWithResult();
    }

    default ReactHost prefetch() {
        return onPostMessage().onExtraCallback();
    }
}
