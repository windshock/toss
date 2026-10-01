package im.toss.uikit.widget.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFk1oSDK;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsListHeaderV1T01View extends TdsListHeaderV1View {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private AFk1oSDK onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1T01View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1T01View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV1T01View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListHeaderV1T01View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 77;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onWarmupCompleted + 61;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    protected int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.tds_list_header_v1_01;
        int i5 = IAuthTabCallback + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View, im.toss.uikit.widget.list.ListCell
    protected void asInterface() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.asInterface();
        AFk1oSDK aFk1oSDKOnExtraCallbackWithResult = AFk1oSDK.onExtraCallbackWithResult(getRootView());
        Intrinsics.checkNotNullExpressionValue(aFk1oSDKOnExtraCallbackWithResult, "");
        this.onExtraCallbackWithResult = aFk1oSDKOnExtraCallbackWithResult;
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setIcon(@Nullable String str) {
        AFk1oSDK aFk1oSDK;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        AFk1oSDK aFk1oSDK2 = null;
        if (i2 % 2 != 0) {
            aFk1oSDK = this.onExtraCallbackWithResult;
            int i4 = 48 / 0;
            if (aFk1oSDK == null) {
                int i5 = i3 + 91;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    aFk1oSDK2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFk1oSDK = null;
            }
        } else {
            aFk1oSDK = this.onExtraCallbackWithResult;
            if (aFk1oSDK == null) {
            }
        }
        TdsImageView tdsImageView = aFk1oSDK.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
        AFk1oSDK aFk1oSDK3 = this.onExtraCallbackWithResult;
        if (aFk1oSDK3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFk1oSDK2 = aFk1oSDK3;
        }
        aFk1oSDK2.onExtraCallback.setVisibility(0);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setIcon(int i) {
        int i2 = 2 % 2;
        AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
        AFk1oSDK aFk1oSDK2 = null;
        if (aFk1oSDK == null) {
            int i3 = IAuthTabCallback + 61;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFk1oSDK2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFk1oSDK = null;
        }
        aFk1oSDK.onExtraCallback.setImageResource(i);
        if (i != 0) {
            AFk1oSDK aFk1oSDK3 = this.onExtraCallbackWithResult;
            if (aFk1oSDK3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = IAuthTabCallback + 41;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                aFk1oSDK2 = aFk1oSDK3;
            }
            aFk1oSDK2.onExtraCallback.setVisibility(0);
            return;
        }
        AFk1oSDK aFk1oSDK4 = this.onExtraCallbackWithResult;
        if (aFk1oSDK4 == null) {
            int i6 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i8 = IAuthTabCallback + 73;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        } else {
            aFk1oSDK2 = aFk1oSDK4;
        }
        aFk1oSDK2.onExtraCallback.setVisibility(8);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        IAuthTabCallback = i3 % 128;
        AFk1oSDK aFk1oSDK = null;
        if (i3 % 2 != 0) {
            AFk1oSDK aFk1oSDK2 = this.onExtraCallbackWithResult;
            if (aFk1oSDK2 == null) {
                int i4 = i2 + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFk1oSDK2 = null;
            }
            aFk1oSDK2.onExtraCallback.setImageDrawable(drawable);
            if (drawable != null) {
                AFk1oSDK aFk1oSDK3 = this.onExtraCallbackWithResult;
                if (aFk1oSDK3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                } else {
                    aFk1oSDK = aFk1oSDK3;
                }
                aFk1oSDK.onExtraCallback.setVisibility(0);
                return;
            }
            AFk1oSDK aFk1oSDK4 = this.onExtraCallbackWithResult;
            if (aFk1oSDK4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFk1oSDK = aFk1oSDK4;
            }
            aFk1oSDK.onExtraCallback.setVisibility(8);
            int i6 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setIconColor(int i) {
        int i2 = 2 % 2;
        AFk1oSDK aFk1oSDK = null;
        if (i != -1) {
            AFk1oSDK aFk1oSDK2 = this.onExtraCallbackWithResult;
            if (aFk1oSDK2 == null) {
                int i3 = IAuthTabCallback + 101;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFk1oSDK = aFk1oSDK2;
            }
            aFk1oSDK.onExtraCallback.setColorFilter(i);
            return;
        }
        int i5 = onWarmupCompleted + 107;
        int i6 = i5 % 128;
        IAuthTabCallback = i6;
        int i7 = i5 % 2;
        AFk1oSDK aFk1oSDK3 = this.onExtraCallbackWithResult;
        if (aFk1oSDK3 == null) {
            int i8 = i6 + 95;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFk1oSDK = aFk1oSDK3;
        }
        aFk1oSDK.onExtraCallback.clearColorFilter();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTitle(@Nullable CharSequence charSequence) {
        AFk1oSDK aFk1oSDK;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            aFk1oSDK = this.onExtraCallbackWithResult;
            int i3 = 21 / 0;
            if (aFk1oSDK == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFk1oSDK = null;
            }
        } else {
            aFk1oSDK = this.onExtraCallbackWithResult;
            if (aFk1oSDK == null) {
            }
        }
        aFk1oSDK.onWarmupCompleted.setText(charSequence);
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onWarmupCompleted = i3 % 128;
        AFk1oSDK aFk1oSDK = null;
        if (i3 % 2 != 0) {
            aFk1oSDK.hashCode();
            throw null;
        }
        AFk1oSDK aFk1oSDK2 = this.onExtraCallbackWithResult;
        if (aFk1oSDK2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = onWarmupCompleted + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            aFk1oSDK = aFk1oSDK2;
        }
        aFk1oSDK.onWarmupCompleted.setTextColor(i);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (colorStateList != null) {
            AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
            if (aFk1oSDK == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                aFk1oSDK = null;
            }
            aFk1oSDK.onWarmupCompleted.setTextColor(colorStateList);
        }
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setDescription(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
        AFk1oSDK aFk1oSDK2 = null;
        if (aFk1oSDK == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFk1oSDK = null;
        }
        aFk1oSDK.IAuthTabCallback.setText(charSequence);
        AFk1oSDK aFk1oSDK3 = this.onExtraCallbackWithResult;
        if (aFk1oSDK3 == null) {
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = onWarmupCompleted + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            aFk1oSDK3 = null;
        }
        if (aFk1oSDK3.IAuthTabCallback.length() != 0) {
            AFk1oSDK aFk1oSDK4 = this.onExtraCallbackWithResult;
            if (aFk1oSDK4 == null) {
                int i6 = onWarmupCompleted + 31;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFk1oSDK2 = aFk1oSDK4;
            }
            aFk1oSDK2.IAuthTabCallback.setVisibility(0);
            return;
        }
        AFk1oSDK aFk1oSDK5 = this.onExtraCallbackWithResult;
        if (aFk1oSDK5 == null) {
            int i8 = IAuthTabCallback + 37;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i9 = 73 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
        } else {
            aFk1oSDK2 = aFk1oSDK5;
        }
        aFk1oSDK2.IAuthTabCallback.setVisibility(8);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setDescriptionColor(int i) {
        int i2 = 2 % 2;
        AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
        if (aFk1oSDK == null) {
            int i3 = onWarmupCompleted + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = IAuthTabCallback + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            aFk1oSDK = null;
        }
        aFk1oSDK.IAuthTabCallback.setTextColor(i);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setDescriptionColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (colorStateList != null) {
            AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
            if (aFk1oSDK == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = onWarmupCompleted + 43;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                aFk1oSDK = null;
            }
            aFk1oSDK.IAuthTabCallback.setTextColor(colorStateList);
        }
        int i6 = onWarmupCompleted + 53;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setImageButton(int i) {
        int i2 = 2 % 2;
        AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
        AFk1oSDK aFk1oSDK2 = null;
        if (aFk1oSDK == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFk1oSDK = null;
        }
        aFk1oSDK.onNavigationEvent.setImageResource(i);
        if (i == 0) {
            AFk1oSDK aFk1oSDK3 = this.onExtraCallbackWithResult;
            if (aFk1oSDK3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i3 = IAuthTabCallback + 19;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 5;
                }
            } else {
                aFk1oSDK2 = aFk1oSDK3;
            }
            aFk1oSDK2.onNavigationEvent.setVisibility(8);
            return;
        }
        AFk1oSDK aFk1oSDK4 = this.onExtraCallbackWithResult;
        if (aFk1oSDK4 == null) {
            int i5 = onWarmupCompleted + 33;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFk1oSDK2 = aFk1oSDK4;
        }
        aFk1oSDK2.onNavigationEvent.setVisibility(0);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setImageButton(@Nullable Drawable drawable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        AFk1oSDK aFk1oSDK = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        AFk1oSDK aFk1oSDK2 = this.onExtraCallbackWithResult;
        if (aFk1oSDK2 == null) {
            int i4 = i2 + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFk1oSDK2 = null;
        }
        aFk1oSDK2.onNavigationEvent.setImageDrawable(drawable);
        if (drawable != null) {
            AFk1oSDK aFk1oSDK3 = this.onExtraCallbackWithResult;
            if (aFk1oSDK3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFk1oSDK = aFk1oSDK3;
            }
            aFk1oSDK.onNavigationEvent.setVisibility(0);
            return;
        }
        AFk1oSDK aFk1oSDK4 = this.onExtraCallbackWithResult;
        if (aFk1oSDK4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i6 = onWarmupCompleted + 9;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            aFk1oSDK = aFk1oSDK4;
        }
        aFk1oSDK.onNavigationEvent.setVisibility(8);
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setImageButtonColor(int i) {
        int i2 = 2 % 2;
        if (i != -1) {
            int i3 = onWarmupCompleted + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
            if (aFk1oSDK == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFk1oSDK = null;
            }
            aFk1oSDK.onNavigationEvent.setColorFilter(i);
        }
        int i5 = onWarmupCompleted + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.uikit.widget.list.TdsListHeaderV1View
    public void setOnImageButtonClickListener(@NotNull View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        AFk1oSDK aFk1oSDK = this.onExtraCallbackWithResult;
        if (aFk1oSDK == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = onWarmupCompleted + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            aFk1oSDK = null;
        }
        aFk1oSDK.onNavigationEvent.setOnClickListener(onClickListener);
    }
}
