package im.toss.tds.view.component.anim.logo;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda7;
import o.CarouselPagerStateExternalSyntheticLambda1;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.ReusableRememberObserverHolder;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.getProxySelectorokhttp;
import o.getProxyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class AnimateLogoView extends View implements getProxySelectorokhttp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final Map<String, Bitmap> onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateLogoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateLogoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public abstract void setEachDuration(long j);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLogoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = new HashMap();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnimateLogoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        if ((i2 & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 13;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 49;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 5;
            } else {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // o.getProxySelectorokhttp
    public /* bridge */ void IAuthTabCallback(@NotNull List<String> list, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(list, singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getProxySelectorokhttp
    public /* bridge */ void onWarmupCompleted(@NotNull List<Integer> list, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(list, singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setEachDuration(j);
        int i4 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements ReusableRememberObserverHolder {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getProxyokhttp onExtraCallbackWithResult;

        onExtraCallbackWithResult(getProxyokhttp getproxyokhttp) {
            this.onExtraCallbackWithResult = getproxyokhttp;
        }

        public /* bridge */ void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(carouselKtExternalSyntheticLambda7);
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
            }
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
            if (i3 != 0) {
                int i4 = 62 / 0;
            }
            int i5 = onWarmupCompleted + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            super.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7);
            AnimateLogoView.this.onExtraCallback(this.onExtraCallbackWithResult, CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7, 0, 0, 3, (Object) null));
            int i4 = onWarmupCompleted + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 36 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onWarmupCompleted(@NotNull getProxyokhttp getproxyokhttp) {
        int iIntValue;
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getproxyokhttp, "");
            this.onWarmupCompleted.get(getproxyokhttp.onExtraCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(getproxyokhttp, "");
        if (this.onWarmupCompleted.get(getproxyokhttp.onExtraCallback()) != null) {
            int i3 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmap = this.onWarmupCompleted.get(getproxyokhttp.onExtraCallback());
            if (bitmap != null && !bitmap.isRecycled()) {
                return;
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(getproxyokhttp);
        String strOnWarmupCompleted = getproxyokhttp.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            int i5 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (strOnWarmupCompleted.length() == 0) {
                Integer numOnNavigationEvent = getproxyokhttp.onNavigationEvent();
                if (numOnNavigationEvent != null) {
                    int i7 = IAuthTabCallback + 39;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    if (numOnNavigationEvent.intValue() > 0) {
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        RecomposerawaitIdle2.onNavigationEvent onnavigationevent = new RecomposerawaitIdle2.onNavigationEvent(context);
                        Integer numOnNavigationEvent2 = getproxyokhttp.onNavigationEvent();
                        if (numOnNavigationEvent2 != null) {
                            int i9 = onExtraCallbackWithResult + 13;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            iIntValue = numOnNavigationEvent2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = onnavigationevent.onExtraCallback(Integer.valueOf(iIntValue));
                        SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1IAuthTabCallback = getproxyokhttp.IAuthTabCallback();
                        if (singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1IAuthTabCallback != null) {
                            int i11 = onExtraCallbackWithResult + 19;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 == 0) {
                                SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[] singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1Arr = new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[0];
                                singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1Arr[0] = singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1IAuthTabCallback;
                                RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1Arr);
                            } else {
                                RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1IAuthTabCallback});
                            }
                        }
                        onnavigationeventIAuthTabCallback = onnavigationeventOnExtraCallback.IAuthTabCallback(onextracallbackwithresult);
                    }
                } else {
                    int i12 = IAuthTabCallback + 13;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                }
                throw new IllegalArgumentException();
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(getproxyokhttp.onWarmupCompleted());
            SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1IAuthTabCallback2 = getproxyokhttp.IAuthTabCallback();
            if (singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1IAuthTabCallback2 != null) {
                int i14 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback2, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1IAuthTabCallback2});
            }
            onnavigationeventIAuthTabCallback = onnavigationeventOnExtraCallback2.IAuthTabCallback(onextracallbackwithresult);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context3).onWarmupCompleted(onnavigationeventIAuthTabCallback.onExtraCallbackWithResult());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDetachedFromWindow();
            this.onWarmupCompleted.clear();
            int i3 = 39 / 0;
        } else {
            super.onDetachedFromWindow();
            this.onWarmupCompleted.clear();
        }
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final Bitmap onNavigationEvent(@NotNull getProxyokhttp getproxyokhttp) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getproxyokhttp, "");
            return this.onWarmupCompleted.get(getproxyokhttp.onExtraCallback());
        }
        Intrinsics.checkNotNullParameter(getproxyokhttp, "");
        this.onWarmupCompleted.get(getproxyokhttp.onExtraCallback());
        throw null;
    }

    protected final void onExtraCallback(@NotNull getProxyokhttp getproxyokhttp, @NotNull Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getproxyokhttp, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        this.onWarmupCompleted.put(getproxyokhttp.onExtraCallback(), bitmap);
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
