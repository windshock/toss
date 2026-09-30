package o;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Rect;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addData {
    private static int asInterface = 1;
    private static int onTransact;
    private final findResAndMsg IAuthTabCallback;
    private volatile getPackageType IAuthTabCallbackDefault;
    private final Context onExtraCallback;
    private final Rect onExtraCallbackWithResult;
    private final IMtopProxy onNavigationEvent;
    private final requestInnerSync onWarmupCompleted;

    public addData(@NotNull Context context, @NotNull IMtopProxy iMtopProxy, @NotNull requestInnerSync requestinnersync, @NotNull findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iMtopProxy, "");
        Intrinsics.checkNotNullParameter(requestinnersync, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onExtraCallback = context;
        this.onNavigationEvent = iMtopProxy;
        this.onWarmupCompleted = requestinnersync;
        this.IAuthTabCallback = findresandmsg;
        this.onExtraCallbackWithResult = new Rect(416, 576, 128, 128);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addData(Context context, IMtopProxy iMtopProxy, requestInnerSync requestinnersync, findResAndMsg findresandmsg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        GeckoHubImp geckoHubImpIAuthTabCallback;
        waitForLayout waitforlayoutOnExtraCallbackWithResult;
        if ((i & 8) != 0) {
            int i2 = asInterface + 71;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                waitforlayoutOnExtraCallbackWithResult = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 0, (Object) null);
            } else {
                geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                waitforlayoutOnExtraCallbackWithResult = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null);
            }
            findresandmsg = findRes.onWarmupCompleted(geckoHubImpIAuthTabCallback.plus(waitforlayoutOnExtraCallbackWithResult));
            int i3 = 2 % 2;
        }
        this(context, iMtopProxy, requestinnersync, findresandmsg);
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallbackDefault;
        if (getpackagetype == null || !getpackagetype.onExtraCallback()) {
            return false;
        }
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        return i4 % 2 != 0;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getPackageType getpackagetype = this.IAuthTabCallbackDefault;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                int i3 = asInterface + 33;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 % 3;
                }
            }
            this.IAuthTabCallbackDefault = null;
            return;
        }
        obj.hashCode();
        throw null;
    }
}
