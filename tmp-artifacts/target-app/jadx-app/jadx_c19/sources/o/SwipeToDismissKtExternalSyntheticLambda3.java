package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.SwipeToDismissKtExternalSyntheticLambda0;
import o.SwipeableKtExternalSyntheticLambda5;
import o.TabRowDefaultsExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SwipeToDismissKtExternalSyntheticLambda3 extends SwipeableKtExternalSyntheticLambda1 implements SwipeToDismissKtExternalSyntheticLambda0.onExtraCallback {
    private final HashMap<String, List<onExtraCallbackWithResult>> IAuthTabCallback;
    private final HashMap<SwipeableKtExternalSyntheticLambda5.onExtraCallbackWithResult, TabRowDefaultsExternalSyntheticLambda2> onExtraCallback;
    private ImmutableMap<String, SnackbarKtOneRowSnackbar21ExternalSyntheticLambda0> onExtraCallbackWithResult;
    private final SwipeToDismissKtExternalSyntheticLambda0 onNavigationEvent;

    SwipeToDismissKtExternalSyntheticLambda3(Context context, SwipeToDismissKtExternalSyntheticLambda0 swipeToDismissKtExternalSyntheticLambda0, TabKtExternalSyntheticLambda3 tabKtExternalSyntheticLambda3, Bundle bundle, Looper looper, LegacyTextInputMethodRequestExternalSyntheticLambda2 legacyTextInputMethodRequestExternalSyntheticLambda2, long j) {
        super(context, swipeToDismissKtExternalSyntheticLambda0, tabKtExternalSyntheticLambda3, bundle, looper, legacyTextInputMethodRequestExternalSyntheticLambda2, j);
        this.onExtraCallback = new HashMap<>();
        this.IAuthTabCallback = new HashMap<>();
        this.onNavigationEvent = swipeToDismissKtExternalSyntheticLambda0;
        this.onExtraCallbackWithResult = ImmutableMap.of();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public SwipeToDismissKtExternalSyntheticLambda0 IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public void ad_() {
        Iterator<TabRowDefaultsExternalSyntheticLambda2> it = this.onExtraCallback.values().iterator();
        while (it.hasNext()) {
            it.next().onExtraCallback();
        }
        this.onExtraCallback.clear();
        super.ad_();
    }

    public SwitchKtExternalSyntheticLambda3 onExtraCallbackWithResult() {
        if (IEngagementSignalsCallback_Parcel() != null) {
            return super.onExtraCallbackWithResult().onExtraCallbackWithResult().onWarmupCompleted().onExtraCallbackWithResult();
        }
        return super.onExtraCallbackWithResult();
    }

    /* renamed from: o.SwipeToDismissKtExternalSyntheticLambda3$2, reason: invalid class name */
    public class AnonymousClass2 extends TabRowDefaultsExternalSyntheticLambda2.getInterfaceDescriptor {
        final /* synthetic */ SwipeToDismissKtExternalSyntheticLambda3 onWarmupCompleted;

        public static /* synthetic */ void onNavigationEvent(AnonymousClass2 anonymousClass2, String str, List list, SwipeToDismissKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent) {
            anonymousClass2.onWarmupCompleted.IAuthTabCallback();
            list.size();
        }
    }

    public ListenableFuture<SwitchKtSwitch11ExternalSyntheticLambda0> onWarmupCompleted(SwitchKtExternalSyntheticLambda7 switchKtExternalSyntheticLambda7, Bundle bundle) {
        TabRowDefaultsExternalSyntheticLambda2 tabRowDefaultsExternalSyntheticLambda2IEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel();
        if (tabRowDefaultsExternalSyntheticLambda2IEngagementSignalsCallback_Parcel != null) {
            final SettableFuture settableFutureCreate = SettableFuture.create();
            tabRowDefaultsExternalSyntheticLambda2IEngagementSignalsCallback_Parcel.onNavigationEvent(switchKtExternalSyntheticLambda7.onWarmupCompleted, bundle, new TabRowDefaultsExternalSyntheticLambda2.onExtraCallback() { // from class: o.SwipeToDismissKtExternalSyntheticLambda3.1
                public void IAuthTabCallback(String str, @Nullable Bundle bundle2, @Nullable Bundle bundle3) {
                    Bundle bundle4 = new Bundle(bundle2);
                    bundle4.putAll(bundle3);
                    settableFutureCreate.set(new SwitchKtSwitch11ExternalSyntheticLambda0(0, bundle4));
                }

                public void onWarmupCompleted(String str, @Nullable Bundle bundle2, @Nullable Bundle bundle3) {
                    Bundle bundle4 = new Bundle(bundle2);
                    bundle4.putAll(bundle3);
                    settableFutureCreate.set(new SwitchKtSwitch11ExternalSyntheticLambda0(-1, bundle4));
                }
            });
            return settableFutureCreate;
        }
        return Futures.immediateFuture(new SwitchKtSwitch11ExternalSyntheticLambda0(-4));
    }
}
