package o;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactPackage;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface transGenerateCertNum {
    void IAuthTabCallback(@NotNull AppCompatActivity appCompatActivity);

    void IAuthTabCallback(@NotNull Function1<? super AppCompatActivity, ? extends View> function1);

    ReactHost onExtraCallback();

    void onExtraCallback(@NotNull AppCompatActivity appCompatActivity);

    void onExtraCallback(@NotNull Function0<? extends List<? extends ReactPackage>> function0);

    logicVerifyID onExtraCallbackWithResult();

    void onExtraCallbackWithResult(@NotNull AppCompatActivity appCompatActivity, @Nullable Bundle bundle, @NotNull Bundle bundle2);

    void onExtraCallbackWithResult(@NotNull Function2<? super AppCompatActivity, ? super Throwable, ? extends View> function2);

    void onNavigationEvent(@NotNull Function0<? extends logicVerifyID> function0);

    void onWarmupCompleted(@NotNull AppCompatActivity appCompatActivity);
}
