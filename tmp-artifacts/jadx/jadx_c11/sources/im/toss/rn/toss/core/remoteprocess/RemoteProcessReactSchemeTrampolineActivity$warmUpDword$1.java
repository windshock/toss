package im.toss.rn.toss.core.remoteprocess;

import com.google.android.gms.internal.ads.zziea;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1 extends ContinuationImpl {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteProcessReactSchemeTrampolineActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1(RemoteProcessReactSchemeTrampolineActivity remoteProcessReactSchemeTrampolineActivity, access13800<? super RemoteProcessReactSchemeTrampolineActivity$warmUpDword$1> access13800Var) {
        super(access13800Var);
        this.this$0 = remoteProcessReactSchemeTrampolineActivity;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object[] objArr = {this.this$0, this};
        Object objOnExtraCallbackWithResult = RemoteProcessReactSchemeTrampolineActivity.onExtraCallbackWithResult(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), 155826548, -155826548, zziea.IAuthTabCallback(), objArr, zziea.IAuthTabCallback());
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }
}
