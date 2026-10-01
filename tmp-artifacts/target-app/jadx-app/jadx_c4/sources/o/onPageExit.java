package o;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IEngagementSignalsCallbackDefault;
import o.IPostMessageService_Parcel;
import o.onPageExit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageExit {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ void onExtraCallback(Function1 function1, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, iEngagementSignalsCallbackDefault);
        int i4 = onWarmupCompleted + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final IEngagementSignalsCallback_Parcel<Intent> onNavigationEvent(@NotNull IEngagementSignalsCallbackStub iEngagementSignalsCallbackStub, @NotNull final Function1<? super IEngagementSignalsCallbackDefault, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackStub, "");
        Intrinsics.checkNotNullParameter(function1, "");
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_ParcelRegisterForActivityResult = iEngagementSignalsCallbackStub.registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new onSessionEnded() { // from class: im.toss.extensions.ActivityResultCallersKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final void onActivityResult(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    onPageExit.onExtraCallback(function1, (IEngagementSignalsCallbackDefault) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onPageExit.onExtraCallback(function1, (IEngagementSignalsCallbackDefault) obj);
                int i4 = onExtraCallback + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return iEngagementSignalsCallback_ParcelRegisterForActivityResult;
    }

    private static final void onNavigationEvent(Function1 function1, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            function1.invoke(iEngagementSignalsCallbackDefault);
            throw null;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        function1.invoke(iEngagementSignalsCallbackDefault);
        int i3 = IAuthTabCallback + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
    }
}
