package o;

import android.content.Context;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.auth.model.Prompt;
import com.kakao.sdk.user.UserApi;
import com.kakao.sdk.user.model.AccessTokenInfo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GridLayoutManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class computeVerticalScrollExtent {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final Lazy<computeVerticalScrollExtent> IAuthTabCallback = LazyKt.onExtraCallbackWithResult(IAuthTabCallback.onWarmupCompleted);
    private final UserApi onExtraCallback;
    private final findFirstPartiallyOrCompletelyInvisibleChild onExtraCallbackWithResult;
    private final UserApi onNavigationEvent;

    public computeVerticalScrollExtent() {
        this(null, null, null, 7, null);
    }

    public computeVerticalScrollExtent(@NotNull UserApi userApi, @NotNull UserApi userApi2, @NotNull findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild) {
        Intrinsics.checkNotNullParameter(userApi, "");
        Intrinsics.checkNotNullParameter(userApi2, "");
        Intrinsics.checkNotNullParameter(findfirstpartiallyorcompletelyinvisiblechild, "");
        this.onExtraCallback = userApi;
        this.onNavigationEvent = userApi2;
        this.onExtraCallbackWithResult = findfirstpartiallyorcompletelyinvisiblechild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ computeVerticalScrollExtent(UserApi userApi, UserApi userApi2, findFirstPartiallyOrCompletelyInvisibleChild findfirstpartiallyorcompletelyinvisiblechild, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            Object objOnNavigationEvent = getChildClosestToEnd.onExtraCallbackWithResult(canScrollHorizontally.onExtraCallback).onNavigationEvent(UserApi.class);
            Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent, "");
            userApi = (UserApi) objOnNavigationEvent;
        }
        if ((i & 2) != 0) {
            Object objOnNavigationEvent2 = getChildClosestToEnd.IAuthTabCallback(canScrollHorizontally.onExtraCallback).onNavigationEvent(UserApi.class);
            Intrinsics.checkNotNullExpressionValue(objOnNavigationEvent2, "");
            userApi2 = (UserApi) objOnNavigationEvent2;
        }
        this(userApi, userApi2, (i & 4) != 0 ? findFirstPartiallyOrCompletelyInvisibleChild.Companion.onExtraCallbackWithResult() : findfirstpartiallyorcompletelyinvisiblechild);
    }

    public final boolean onExtraCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return GridLayoutManager.Companion.onNavigationEvent().onExtraCallbackWithResult(context);
    }

    public static /* synthetic */ void onExtraCallback(computeVerticalScrollExtent computeverticalscrollextent, Context context, int i, String str, List list, List list2, Function2 function2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10012;
        }
        computeverticalscrollextent.onExtraCallback(context, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, function2);
    }

    public final void onExtraCallback(@NotNull Context context, int i, @Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @NotNull Function2<? super OAuthToken, ? super Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        GridLayoutManager.onNavigationEvent onnavigationevent = GridLayoutManager.Companion;
        String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
        GridLayoutManager.IAuthTabCallback(onnavigationevent.onNavigationEvent(), context, (List) null, i, str, list, list2, strOnExtraCallbackWithResult, (String) null, new onExtraCallback(function2, strOnExtraCallbackWithResult), 128, (Object) null);
    }

    public final void onExtraCallback(@NotNull Context context, @Nullable List<? extends Prompt> list, @Nullable String str, @Nullable String str2, @Nullable List<String> list2, @Nullable List<String> list3, @NotNull Function2<? super OAuthToken, ? super Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        GridLayoutManager.onNavigationEvent onnavigationevent = GridLayoutManager.Companion;
        String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
        GridLayoutManager.onNavigationEvent(onnavigationevent.onNavigationEvent(), context, list, (List) null, str2, (String) null, list2, list3, str, strOnExtraCallbackWithResult, (String) null, new onNavigationEvent(function2, strOnExtraCallbackWithResult), 532, (Object) null);
    }

    public static final class onExtraCallbackWithResult extends canScrollVertically<AccessTokenInfo> {
        final /* synthetic */ Function2<AccessTokenInfo, Throwable, Unit> onExtraCallbackWithResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function2<? super AccessTokenInfo, ? super Throwable, Unit> function2) {
            super(false);
            this.onExtraCallbackWithResult = function2;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@Nullable AccessTokenInfo accessTokenInfo, @Nullable Throwable th) {
            this.onExtraCallbackWithResult.invoke(accessTokenInfo, th);
        }
    }

    public final void IAuthTabCallback(@NotNull Function2<? super AccessTokenInfo, ? super Throwable, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.onNavigationEvent.checkAccessToken().enqueue(new onExtraCallbackWithResult(function2));
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final computeVerticalScrollExtent onExtraCallback() {
            return (computeVerticalScrollExtent) computeVerticalScrollExtent.IAuthTabCallback.getValue();
        }
    }

    static final class IAuthTabCallback extends Lambda implements Function0<computeVerticalScrollExtent> {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        IAuthTabCallback() {
            super(0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final computeVerticalScrollExtent invoke() {
            return new computeVerticalScrollExtent(null, null, null, 7, null);
        }
    }
}
