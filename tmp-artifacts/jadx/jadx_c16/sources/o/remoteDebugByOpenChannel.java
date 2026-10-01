package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.ConnectionLog;
import o.doInitialize;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class remoteDebugByOpenChannel extends ConnectionLog {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final int onNavigationEvent = ConnectionLog.onExtraCallback;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public remoteDebugByOpenChannel(@NotNull ConnectionLog.IAuthTabCallback iAuthTabCallback) {
        super(iAuthTabCallback);
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(viewGroup, i);
        }
        onWarmupCompleted(viewGroup, i);
        throw null;
    }

    public IIpcChannelStubProxy<SearchBarKtExternalSyntheticLambda5, IIpcChannelStub> onWarmupCompleted(@NotNull ViewGroup viewGroup, int i) {
        getDownloadUrl getdownloadurlOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 31;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (onExtraCallback.onExtraCallbackWithResult[((doInitialize.onNavigationEvent) doInitialize.onNavigationEvent.getEntries().get(i)).ordinal()] == 1) {
            getdownloadurlOnWarmupCompleted = new getDownloadUrl(viewGroup);
            int i5 = IAuthTabCallbackDefault + 37;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        } else {
            getdownloadurlOnWarmupCompleted = super.onWarmupCompleted(viewGroup, i);
        }
        Intrinsics.checkNotNull(getdownloadurlOnWarmupCompleted, "");
        return getdownloadurlOnWarmupCompleted;
    }
}
