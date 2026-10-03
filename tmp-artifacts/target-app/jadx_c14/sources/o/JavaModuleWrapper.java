package o;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaModuleWrapper {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private final String IAuthTabCallback;
    private final List<String> onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaModuleWrapper)) {
            return false;
        }
        JavaModuleWrapper javaModuleWrapper = (JavaModuleWrapper) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, javaModuleWrapper.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, javaModuleWrapper.onExtraCallback);
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        return "PlccBenefitDescription(title=" + this.IAuthTabCallback + ", ulList=" + this.onExtraCallback + ")";
    }

    public JavaModuleWrapper(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = list;
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final List<String> onNavigationEvent() {
        return this.onExtraCallback;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final List<JavaModuleWrapper> onWarmupCompleted(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            String string = context.getString(R.string.app_plcc_benefit_cancel_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            JavaModuleWrapper javaModuleWrapper = new JavaModuleWrapper(string, CollectionsKt.listOf(context.getString(R.string.app_plcc_benefit_cancel_desc1)));
            String string2 = context.getString(R.string.app_plcc_benefit_performance_title);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            JavaModuleWrapper javaModuleWrapper2 = new JavaModuleWrapper(string2, CollectionsKt.listOf(context.getString(R.string.app_plcc_benefit_performance_desc1)));
            String string3 = context.getString(R.string.app_plcc_benefit_late_capture_title);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            JavaModuleWrapper javaModuleWrapper3 = new JavaModuleWrapper(string3, CollectionsKt.listOf(new String[]{context.getString(R.string.app_plcc_benefit_late_capture_desc1), context.getString(R.string.app_plcc_benefit_late_capture_desc2)}));
            String string4 = context.getString(R.string.app_plcc_benefit_not_immediate_title);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            JavaModuleWrapper javaModuleWrapper4 = new JavaModuleWrapper(string4, CollectionsKt.listOf(context.getString(R.string.app_plcc_benefit_not_immediate_desc1)));
            String string5 = context.getString(R.string.app_plcc_benefit_excluded_title);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            JavaModuleWrapper javaModuleWrapper5 = new JavaModuleWrapper(string5, CollectionsKt.listOf(context.getString(R.string.app_plcc_benefit_excluded_desc1)));
            String string6 = context.getString(R.string.app_plcc_benefit_interest_free_title);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            JavaModuleWrapper javaModuleWrapper6 = new JavaModuleWrapper(string6, CollectionsKt.listOf(context.getString(R.string.app_plcc_benefit_interest_free_desc1)));
            String string7 = context.getString(R.string.app_plcc_benefit_transport_title);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            return CollectionsKt.listOf(new JavaModuleWrapper[]{javaModuleWrapper, javaModuleWrapper2, javaModuleWrapper3, javaModuleWrapper4, javaModuleWrapper5, javaModuleWrapper6, new JavaModuleWrapper(string7, CollectionsKt.listOf(context.getString(R.string.app_plcc_benefit_transport_desc1)))});
        }
    }
}
