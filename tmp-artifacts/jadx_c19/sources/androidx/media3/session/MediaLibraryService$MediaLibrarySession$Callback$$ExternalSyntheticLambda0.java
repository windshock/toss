package androidx.media3.session;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;
import o.SwipeToDismissKtExternalSyntheticLambda1;
import o.SwipeableKtExternalSyntheticLambda5;
import o.SwipeableStateExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class MediaLibraryService$MediaLibrarySession$Callback$$ExternalSyntheticLambda0 implements AsyncFunction {
    public final /* synthetic */ SwipeableStateExternalSyntheticLambda0.asInterface f$0;
    public final /* synthetic */ SwipeableKtExternalSyntheticLambda5.onExtraCallback f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ SwipeableKtExternalSyntheticLambda5.onExtraCallbackWithResult f$3;

    public /* synthetic */ MediaLibraryService$MediaLibrarySession$Callback$$ExternalSyntheticLambda0(SwipeableStateExternalSyntheticLambda0.asInterface asinterface, SwipeableKtExternalSyntheticLambda5.onExtraCallback onextracallback, String str, SwipeableKtExternalSyntheticLambda5.onExtraCallbackWithResult onextracallbackwithresult) {
        this.f$0 = asinterface;
        this.f$1 = onextracallback;
        this.f$2 = str;
        this.f$3 = onextracallbackwithresult;
    }

    public final ListenableFuture apply(Object obj) {
        return SwipeableKtExternalSyntheticLambda5.onExtraCallback.onExtraCallbackWithResult.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (SwipeToDismissKtExternalSyntheticLambda1) obj);
    }
}
