package im.toss.uikit.widget.list;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import im.toss.tds.view.component.atom.badge.TdsBadgeV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk;
import o.response;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ServiceRow extends TdsListRowV0View {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceRow(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceRow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceRow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ServiceRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            if (i3 % 2 != 0) {
                int i5 = 72 / 0;
            }
            int i6 = i4 + 91;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = IAuthTabCallback + 49;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    protected int writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.service_row;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.TdsListRowV0View, im.toss.uikit.widget.list.ListCell
    public void asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.asInterface();
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84skOnExtraCallbackWithResult = r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk.onExtraCallbackWithResult(getRootView());
            Intrinsics.checkNotNullExpressionValue(r8lambdagh5skm7ohth6qqwz9hjaut84skOnExtraCallbackWithResult, "");
            this.onExtraCallbackWithResult = r8lambdagh5skm7ohth6qqwz9hjaut84skOnExtraCallbackWithResult;
            int i3 = IAuthTabCallback + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.asInterface();
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84skOnExtraCallbackWithResult2 = r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk.onExtraCallbackWithResult(getRootView());
        Intrinsics.checkNotNullExpressionValue(r8lambdagh5skm7ohth6qqwz9hjaut84skOnExtraCallbackWithResult2, "");
        this.onExtraCallbackWithResult = r8lambdagh5skm7ohth6qqwz9hjaut84skOnExtraCallbackWithResult2;
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setIcon(@Nullable String str) {
        int i = 2 % 2;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        Object obj = null;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.onExtraCallbackWithResult.setVisibility(0);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk2 == null) {
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk2.onWarmupCompleted.setVisibility(0);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3 == null) {
            int i4 = onExtraCallback + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk3.onNavigationEvent.setVisibility(4);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = null;
        }
        TdsImageView tdsImageView = r8lambdagh5skm7ohth6qqwz9hjaut84sk4.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, str, (Function1) null, (Function1) null, 6, (Object) null);
        int i5 = onExtraCallback + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setIcon(int i) {
        int i2 = 2 % 2;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = null;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.onWarmupCompleted.setImageResource(i);
        if (i == 0) {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3 == null) {
                int i3 = IAuthTabCallback + 107;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    r8lambdagh5skm7ohth6qqwz9hjaut84sk2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk3.onExtraCallbackWithResult.setVisibility(8);
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk4.onWarmupCompleted.setVisibility(8);
        } else {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk5 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk5 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk5.onExtraCallbackWithResult.setVisibility(0);
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk6 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk6 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk6.onWarmupCompleted.setVisibility(0);
        }
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk7 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallback + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = r8lambdagh5skm7ohth6qqwz9hjaut84sk7;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk2.onNavigationEvent.setVisibility(4);
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setIcon(@Nullable Drawable drawable) {
        int i = 2 % 2;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = null;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.onWarmupCompleted.setImageDrawable(drawable);
        if (drawable == null) {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk3.onExtraCallbackWithResult.setVisibility(8);
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk4 == null) {
                int i4 = IAuthTabCallback + 97;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    r8lambdagh5skm7ohth6qqwz9hjaut84sk2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk4.onWarmupCompleted.setVisibility(8);
        } else {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk5 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i5 = IAuthTabCallback + 43;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 3;
                }
                r8lambdagh5skm7ohth6qqwz9hjaut84sk5 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk5.onExtraCallbackWithResult.setVisibility(0);
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk6 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk6 = null;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk6.onWarmupCompleted.setVisibility(0);
        }
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk7 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk7 == null) {
            int i7 = IAuthTabCallback + 75;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i9 = onExtraCallback + 75;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = r8lambdagh5skm7ohth6qqwz9hjaut84sk7;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk2.onNavigationEvent.setVisibility(4);
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setIconColor(int i) {
        int i2 = 2 % 2;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        if (i != -1) {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i3 = IAuthTabCallback + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                r8lambdagh5skm7ohth6qqwz9hjaut84sk = r8lambdagh5skm7ohth6qqwz9hjaut84sk2;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk.onWarmupCompleted.setColorFilter(i);
            return;
        }
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = r8lambdagh5skm7ohth6qqwz9hjaut84sk3;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.onWarmupCompleted.clearColorFilter();
        int i5 = IAuthTabCallback + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
    }

    public final void setLottie(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = null;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.onExtraCallbackWithResult.setVisibility(0);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallback + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk3.onNavigationEvent.setVisibility(0);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk4.onWarmupCompleted.setVisibility(4);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk5 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk5 == null) {
            int i6 = onExtraCallback + 97;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i7 == 0) {
                int i8 = 30 / 0;
            }
        } else {
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = r8lambdagh5skm7ohth6qqwz9hjaut84sk5;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk2.onNavigationEvent.setAnimationFromUrl(str);
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = null;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.IAuthTabCallback.setText(charSequence);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = null;
        }
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3.IAuthTabCallback.length() != 0) {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = r8lambdagh5skm7ohth6qqwz9hjaut84sk4;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2.IAuthTabCallback.setVisibility(0);
            return;
        }
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk5 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = r8lambdagh5skm7ohth6qqwz9hjaut84sk5;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk2.IAuthTabCallback.setVisibility(8);
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallback + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = r8lambdagh5skm7ohth6qqwz9hjaut84sk2;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.IAuthTabCallback.setTextColor(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            int i4 = 80 / 0;
            if (colorStateList != null) {
                r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
                if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
                    int i5 = i3 + 87;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    if (i6 == 0) {
                        int i7 = 15 / 0;
                    }
                    r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
                }
                r8lambdagh5skm7ohth6qqwz9hjaut84sk.IAuthTabCallback.setTextColor(colorStateList);
            }
        } else if (colorStateList != null) {
        }
        int i8 = onExtraCallback + 15;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final void setTitleFont(@NotNull response responseVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            int i2 = onExtraCallback + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i3 == 0) {
                int i4 = 91 / 0;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.IAuthTabCallback.onNavigationEvent(responseVar);
        int i5 = onExtraCallback + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setBadge(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = null;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.onExtraCallback.setText(charSequence);
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            r8lambdagh5skm7ohth6qqwz9hjaut84sk3 = null;
        }
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk3.onExtraCallback.length() != 0) {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk4 = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk4 == null) {
                int i4 = onExtraCallback + 103;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                if (i5 == 0) {
                    throw null;
                }
            } else {
                r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = r8lambdagh5skm7ohth6qqwz9hjaut84sk4;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2.onExtraCallback.setVisibility(0);
            return;
        }
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk5 = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk5 == null) {
            int i6 = onExtraCallback + 45;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            r8lambdagh5skm7ohth6qqwz9hjaut84sk2 = r8lambdagh5skm7ohth6qqwz9hjaut84sk5;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk2.onExtraCallback.setVisibility(8);
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setBadgeType(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i != -1) {
            setBadgeTheme(new TdsBadgeV1View.onExtraCallbackWithResult(TdsBadgeV1View.onWarmupCompleted.values()[i], (TdsBadgeV1View.onExtraCallback) null, (TdsBadgeV1View.IAuthTabCallback) null, 6, (DefaultConstructorMarker) null));
            int i4 = IAuthTabCallback + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setBadgeStyle(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
            if (i == -1) {
                return;
            }
        } else if (i == -1) {
            return;
        }
        setBadgeTheme(new TdsBadgeV1View.onExtraCallbackWithResult((TdsBadgeV1View.onWarmupCompleted) null, TdsBadgeV1View.onExtraCallback.values()[i], (TdsBadgeV1View.IAuthTabCallback) null, 5, (DefaultConstructorMarker) null));
        int i5 = IAuthTabCallback + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setBadgeSize(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (i != -1) {
            setBadgeTheme(new TdsBadgeV1View.onExtraCallbackWithResult((TdsBadgeV1View.onWarmupCompleted) null, (TdsBadgeV1View.onExtraCallback) null, TdsBadgeV1View.IAuthTabCallback.values()[i], 3, (DefaultConstructorMarker) null));
            int i5 = IAuthTabCallback + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setBadgeCustomBackgroundColor(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (i != -1) {
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
            }
            TdsBadgeV1View tdsBadgeV1View = r8lambdagh5skm7ohth6qqwz9hjaut84sk.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View, "");
            TdsBadgeV1View.setCustom$default(tdsBadgeV1View, i, 0, 2, (Object) null);
        }
        int i5 = IAuthTabCallback + 113;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setBadgeCustomTextColor(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (i != -1) {
            int i3 = onExtraCallback;
            int i4 = i3 + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
            if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
                int i5 = i3 + 19;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
            }
            TdsBadgeV1View tdsBadgeV1View = r8lambdagh5skm7ohth6qqwz9hjaut84sk.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(tdsBadgeV1View, "");
            TdsBadgeV1View.setCustom$default(tdsBadgeV1View, 0, i, 1, (Object) null);
            int i7 = onExtraCallback + 29;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = onExtraCallback + 41;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setBadgeTheme(@NotNull TdsBadgeV1View.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        r8lambdagH5sKM7OhTh6QqWz9hjaut84Sk r8lambdagh5skm7ohth6qqwz9hjaut84sk = this.onExtraCallbackWithResult;
        if (r8lambdagh5skm7ohth6qqwz9hjaut84sk == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = onExtraCallback + 109;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 2;
            }
            r8lambdagh5skm7ohth6qqwz9hjaut84sk = null;
        }
        r8lambdagh5skm7ohth6qqwz9hjaut84sk.onExtraCallback.setTheme(onextracallbackwithresult);
    }
}
