package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class exitAllPages<T> extends ExoPlayerImplExternalSyntheticLambda5<List<? extends T>> {
    private static int IAuthTabCallback = 1;
    public static final int onExtraCallbackWithResult = 8;
    private static int onNavigationEvent;

    public /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public final int onWarmupCompleted(@NotNull ExoPlayerImplExternalSyntheticLambda32<List<T>> exoPlayerImplExternalSyntheticLambda32) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exoPlayerImplExternalSyntheticLambda32, "");
        int iOnExtraCallbackWithResult = ((ExoPlayerImplExternalSyntheticLambda31) this).onExtraCallback.onExtraCallbackWithResult(exoPlayerImplExternalSyntheticLambda32);
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult(@NotNull ExoPlayerImplExternalSyntheticLambda32<List<T>> exoPlayerImplExternalSyntheticLambda32) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exoPlayerImplExternalSyntheticLambda32, "");
        ((ExoPlayerImplExternalSyntheticLambda31) this).onExtraCallback.onNavigationEvent(exoPlayerImplExternalSyntheticLambda32);
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull List<? extends T> list, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        super/*o.ExoPlayerImplExternalSyntheticLambda31*/.onNavigationEvent(list);
        if (z) {
            int i2 = IAuthTabCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            notifyDataSetChanged();
            int i4 = onNavigationEvent + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback + 25;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<T> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<T> list = (List) super/*o.ExoPlayerImplExternalSyntheticLambda31*/.onExtraCallback();
        if (list != null) {
            return list;
        }
        List<T> listEmptyList = CollectionsKt.emptyList();
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return listEmptyList;
    }
}
