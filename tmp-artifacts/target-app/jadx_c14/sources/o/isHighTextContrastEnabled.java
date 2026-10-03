package o;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import im.toss.base.BaseActivity;
import im.toss.uikit.widget.textField.TextField;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SetDetectableSize;
import o.isHighTextContrastEnabled;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.widget.dialog.InputBottomSheetDialog;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isHighTextContrastEnabled {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 1;
    public static final isHighTextContrastEnabled INSTANCE = new isHighTextContrastEnabled();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 23;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(BaseActivity baseActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(baseActivity, setDetectableSize);
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighTextContrastEnabled() {
    }

    public static /* synthetic */ getTypedExportedConstants onNavigationEvent(isHighTextContrastEnabled ishightextcontrastenabled, BaseActivity baseActivity, String str, String str2, String str3, int i, Function1 function1, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 16) != 0) {
            int i7 = i4 + 123;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            i = Integer.MAX_VALUE;
        }
        return ishightextcontrastenabled.onExtraCallbackWithResult(baseActivity, str, str2, str3, i, function1);
    }

    public static final class onExtraCallbackWithResult implements InputBottomSheetDialog.onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function1<String, Unit> $callback;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Function1<? super String, Unit> function1) {
            this.$callback = function1;
        }

        public void onExtraCallback(BottomSheetDialog bottomSheetDialog, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bottomSheetDialog, "");
                Intrinsics.checkNotNullParameter(charSequence, "");
                this.$callback.invoke(charSequence.toString());
                bottomSheetDialog.dismiss();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(bottomSheetDialog, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.$callback.invoke(charSequence.toString());
            bottomSheetDialog.dismiss();
            int i3 = onExtraCallback + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final getTypedExportedConstants onExtraCallbackWithResult(@NotNull final BaseActivity baseActivity, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Function1<? super String, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        String string = baseActivity.getString(R.string.app_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        InputBottomSheetDialog inputBottomSheetDialog = new InputBottomSheetDialog(baseActivity, str, "", str2, "", str3, string, false, new onExtraCallbackWithResult(function1), (View) null, i, false, (CharSequence) null, (TextField.onWarmupCompleted) null, false, (List) null, 64000, (DefaultConstructorMarker) null);
        inputBottomSheetDialog.show();
        ConvertByteArrayToFloatArray.onWarmupCompleted("modal_check_name", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.network.model.common.ContactUtils$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 63;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Unit unitIAuthTabCallback = isHighTextContrastEnabled.IAuthTabCallback(baseActivity, (SetDetectableSize) obj);
                int i6 = onWarmupCompleted + 31;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return unitIAuthTabCallback;
            }
        }, 30, (Object) null);
        int i3 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return inputBottomSheetDialog;
    }

    private static final Unit onWarmupCompleted(BaseActivity baseActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "impression");
        setDetectableSize.onExtraCallback().put("screen_name", baseActivity.getScreenName());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
