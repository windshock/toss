package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CatalystInstanceImplInstanceCallback implements isJacksonCreator {
    private int IAuthTabCallback;
    private String onExtraCallback;

    public CatalystInstanceImplInstanceCallback() {
        DERSet dERSet = DERSet.onExtraCallback;
        int iOnExtraCallback = getKekid.onExtraCallback();
        this.onExtraCallback = (String) DERSet.onExtraCallback(2077675052, new Object[]{dERSet}, -2077675048, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback);
        this.IAuthTabCallback = dERSet.ICustomTabsCallbackStub();
    }

    public String onNavigationEvent() {
        return this.onExtraCallback;
    }

    public int onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public void IAuthTabCallback() {
        DERSet dERSet = DERSet.onExtraCallback;
        int iOnExtraCallback = getKekid.onExtraCallback();
        this.onExtraCallback = (String) DERSet.onExtraCallback(2077675052, new Object[]{dERSet}, -2077675048, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback);
        this.IAuthTabCallback = dERSet.ICustomTabsCallbackStub();
    }

    public boolean IAuthTabCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(context);
        return (Build.VERSION.SDK_INT < 28 || activityIAuthTabCallback == null || StringsKt.isBlank(onNavigationEvent()) || varyFields.onWarmupCompleted(context) || !onNavigationEvent(context) || zzbc.onWarmupCompleted(activityIAuthTabCallback, 0.0f, 1, (Object) null)) ? false : true;
    }

    public boolean onNavigationEvent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return generateLink.onExtraCallbackWithResult(context) >= onExtraCallback();
    }
}
