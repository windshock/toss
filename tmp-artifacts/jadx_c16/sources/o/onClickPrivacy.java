package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getRemoteDebugWebSocketUrlForDebug;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onClickPrivacy extends RVStartParams<getRemoteDebugWebSocketUrlForDebug, IIpcChannelStubProxy<SearchBarKtExternalSyntheticLambda5, getRemoteDebugWebSocketUrlForDebug>> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final IAuthTabCallback onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onClickPrivacy(@NotNull IAuthTabCallback iAuthTabCallback) {
        super((DiffUtil.ItemCallback) null, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onNavigationEvent = iAuthTabCallback;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        IIpcChannelStubProxy<SearchBarKtExternalSyntheticLambda5, getRemoteDebugWebSocketUrlForDebug> iIpcChannelStubProxyIAuthTabCallback = IAuthTabCallback(viewGroup, i);
        int i5 = onExtraCallbackWithResult + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return iIpcChannelStubProxyIAuthTabCallback;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public IIpcChannelStubProxy<SearchBarKtExternalSyntheticLambda5, getRemoteDebugWebSocketUrlForDebug> IAuthTabCallback(@NotNull ViewGroup viewGroup, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        int i3 = onExtraCallback.onExtraCallback[((getRemoteDebugWebSocketUrlForDebug.onExtraCallbackWithResult) getRemoteDebugWebSocketUrlForDebug.onExtraCallbackWithResult.getEntries().get(i)).ordinal()];
        if (i3 == 1) {
            RemoteDebugController remoteDebugController = new RemoteDebugController(viewGroup);
            int i4 = onExtraCallbackWithResult + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return remoteDebugController;
            }
            throw null;
        }
        int i5 = onExtraCallback + 61;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0 ? i3 != 2 : i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new exitRemoteDebug(viewGroup, this.onNavigationEvent);
    }

    public int getItemViewType(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOrdinal = ((getRemoteDebugWebSocketUrlForDebug) getItem(i)).onExtraCallback().ordinal();
        int i5 = onExtraCallbackWithResult + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iOrdinal;
    }
}
