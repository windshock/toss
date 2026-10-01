package im.toss.uikit.widget.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1mSDK;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsListHeaderV1T02View extends TdsListHeaderV1View {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private AFk1mSDK IAuthTabCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1T02View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1T02View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1T02View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListHeaderV1T02View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i5 % 128;
            i = i5 % 2 != 0 ? 1 : 0;
            int i6 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    protected int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.tds_list_header_v1_02;
            int i4 = 38 / 0;
        } else {
            i = R.layout.tds_list_header_v1_02;
        }
        int i5 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return i;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View, im.toss.uikit.widget.list.ListCell
    protected void asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.asInterface();
        AFk1mSDK aFk1mSDKIAuthTabCallback = AFk1mSDK.IAuthTabCallback(getRootView());
        Intrinsics.checkNotNullExpressionValue(aFk1mSDKIAuthTabCallback, "");
        this.IAuthTabCallback = aFk1mSDKIAuthTabCallback;
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        AFk1mSDK aFk1mSDK = this.IAuthTabCallback;
        if (aFk1mSDK == null) {
            int i5 = i3 + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i6 != 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            aFk1mSDK = null;
        }
        aFk1mSDK.onWarmupCompleted.setText(charSequence);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setTitleColor(int i) {
        int i2 = 2 % 2;
        AFk1mSDK aFk1mSDK = this.IAuthTabCallback;
        Object obj = null;
        if (aFk1mSDK == null) {
            int i3 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i4 != 0) {
                int i5 = 5 / 0;
            }
            aFk1mSDK = null;
        }
        aFk1mSDK.onWarmupCompleted.setTextColor(i);
        int i6 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        if (colorStateList != null) {
            int i2 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i2 % 128;
            AFk1mSDK aFk1mSDK = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            AFk1mSDK aFk1mSDK2 = this.IAuthTabCallback;
            if (aFk1mSDK2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i3 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            } else {
                aFk1mSDK = aFk1mSDK2;
            }
            aFk1mSDK.onWarmupCompleted.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDescription(@Nullable CharSequence charSequence) {
        AFk1mSDK aFk1mSDK;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            aFk1mSDK = this.IAuthTabCallback;
            int i3 = 39 / 0;
            if (aFk1mSDK == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFk1mSDK = null;
            }
        } else {
            aFk1mSDK = this.IAuthTabCallback;
            if (aFk1mSDK == null) {
            }
        }
        aFk1mSDK.onExtraCallbackWithResult.setText(charSequence);
        int i4 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setDescriptionColor(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        AFk1mSDK aFk1mSDK = this.IAuthTabCallback;
        if (aFk1mSDK == null) {
            int i6 = i3 + 7;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFk1mSDK = null;
        }
        aFk1mSDK.onExtraCallbackWithResult.setTextColor(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDescriptionColor(@Nullable ColorStateList colorStateList) {
        AFk1mSDK aFk1mSDK;
        int i = 2 % 2;
        if (colorStateList != null) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 11;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                aFk1mSDK = this.IAuthTabCallback;
                int i4 = 51 / 0;
                if (aFk1mSDK == null) {
                    int i5 = i2 + 51;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFk1mSDK = null;
                }
            } else {
                aFk1mSDK = this.IAuthTabCallback;
                if (aFk1mSDK == null) {
                }
            }
            aFk1mSDK.onExtraCallbackWithResult.setTextColor(colorStateList);
        }
    }
}
