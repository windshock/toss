package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicSecureTextFieldKtExternalSyntheticLambda3 {
    public static final BasicSecureTextFieldKtExternalSyntheticLambda3 onExtraCallback = new BasicSecureTextFieldKtExternalSyntheticLambda3();
    private static final BasicSecureTextFieldKtExternalSyntheticLambda6<List<String>> onWarmupCompleted = new BasicSecureTextFieldKtExternalSyntheticLambda6<>("ContentDescription", onExtraCallback.onNavigationEvent);
    private static final BasicSecureTextFieldKtExternalSyntheticLambda6<String> onNavigationEvent = new BasicSecureTextFieldKtExternalSyntheticLambda6<>("TestTag", IAuthTabCallback.onExtraCallbackWithResult);

    static final class IAuthTabCallback extends Lambda implements Function2<String, String, String> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(2);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke(@Nullable String str, @NotNull String str2) {
            return str;
        }
    }

    private BasicSecureTextFieldKtExternalSyntheticLambda3() {
    }

    public final BasicSecureTextFieldKtExternalSyntheticLambda6<List<String>> onWarmupCompleted() {
        return onWarmupCompleted;
    }

    static final class onExtraCallback extends Lambda implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();

        onExtraCallback() {
            super(2);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(@Nullable List<String> list, @NotNull List<String> list2) {
            List<String> mutableList;
            if (list == null || (mutableList = CollectionsKt.toMutableList(list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    }
}
