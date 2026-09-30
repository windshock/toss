package im.toss.base.transition.icon;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.base.transition.icon.ScaleTransitionTargetIconFactory;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.ListenableWorker;
import o.RecomposerKt;
import o.deprecated_mustRevalidate;
import o.deprecated_noStore;
import o.getAdService;
import o.getBacktraceNoteBytes;
import o.getFuturework_runtime_ktx_release;
import o.getJobwork_runtime_ktx_release;
import o.getRunAttemptCount;
import o.getSpecialFeatureOptInStatus;
import o.getTriggeredContentAuthorities;
import o.handleNativeAdClick;
import o.nSetPosition;
import o.readIntokhttp;
import o.startWork;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScaleTransitionTargetIconFactory {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final ScaleTransitionTargetIconFactory onWarmupCompleted = new ScaleTransitionTargetIconFactory();

    static {
        int i = onExtraCallbackWithResult + 37;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~(i2 | i);
        int i8 = i5 | i7;
        int i9 = (~(i | (~i5))) | i2;
        int i10 = i2 + i5 + i4 + ((-1932811043) * i3) + (1521317780 * i6);
        int i11 = i10 * i10;
        int i12 = ((i2 * (-919556932)) - 154402816) + ((-919556932) * i5) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i4) + ((-2098724864) * i3) + ((-1398800384) * i6) + ((-1444151296) * i11);
        int i13 = (i2 * 1794637580) + 2133191799 + (i5 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i4 * 1794637741) + (i3 * (-1844343719)) + (i6 * (-1188939004)) + (i11 * (-394526720));
        return i12 + ((i13 * i13) * 821297152) != 1 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    private ScaleTransitionTargetIconFactory() {
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final ScaleTransitionTargetIconContainer IAuthTabCallback;
        private final View onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent);
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Views(container=" + this.IAuthTabCallback + ", icon=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(@NotNull ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer, @NotNull View view) {
            Intrinsics.checkNotNullParameter(scaleTransitionTargetIconContainer, "");
            Intrinsics.checkNotNullParameter(view, "");
            this.IAuthTabCallback = scaleTransitionTargetIconContainer;
            this.onNavigationEvent = view;
        }

        public final ScaleTransitionTargetIconContainer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer = this.IAuthTabCallback;
            int i5 = i3 + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return scaleTransitionTargetIconContainer;
        }

        public final View onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            View view = this.onNavigationEvent;
            int i4 = i2 + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return view;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r10.readTypedObject() != (-1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        r0 = r10.onMessageChannelReady();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        r0 = r1.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0 = r0.getConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r0 = new o.getDEFAULT_CONNECTION_SPECSokhttp(new im.toss.base.transition.icon.ScaleTransitionTargetIconFactory.onWarmupCompleted(r0)).onWarmupCompleted();
        r20 = new java.lang.Object[]{r10, java.lang.Integer.valueOf(r0)};
        o.startWork.onExtraCallback(o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -845680777, r20, o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 845680786);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        r8 = new im.toss.base.transition.icon.ScaleTransitionTargetIconContainer(r1, null, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        r8.setBackgroundColor(r0);
        r0 = r8;
        r1 = r2.onWarmupCompleted(r1, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        r0 = im.toss.base.transition.icon.ScaleTransitionTargetIconFactory.onNavigationEvent + 77;
        im.toss.base.transition.icon.ScaleTransitionTargetIconFactory.IAuthTabCallback = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        r2 = new im.toss.base.transition.icon.ScaleTransitionTargetIconFactory.onExtraCallback(r0, r1);
        r0 = im.toss.base.transition.icon.ScaleTransitionTargetIconFactory.IAuthTabCallback + 115;
        im.toss.base.transition.icon.ScaleTransitionTargetIconFactory.onNavigationEvent = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        if (r10.readTypedObject() != (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = (ScaleTransitionTargetIconFactory) objArr[0];
        Activity activity = (Activity) objArr[1];
        startWork startwork = (startWork) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer = (ScaleTransitionTargetIconContainer) objArr[5];
        View view = (View) objArr[6];
        View view2 = (View) objArr[7];
        int i = 2 % 2;
        if (startwork.ICustomTabsCallbackStub() != -1) {
            int i2 = onNavigationEvent + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 76 / 0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final View onWarmupCompleted(Activity activity, startWork startwork, int i, int i2, View view, View view2) {
        int i3 = 2 % 2;
        if (startwork.ICustomTabsCallbackStub() != -1) {
            int i4 = onNavigationEvent + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (startwork.readTypedObject() != -1) {
                View viewOnWarmupCompleted = onWarmupCompleted(activity, startwork, i, i2, view);
                if (viewOnWarmupCompleted == null) {
                    int i6 = onNavigationEvent + 67;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Bitmap bitmapExtraCallbackWithResult = startwork.extraCallbackWithResult();
                    if (bitmapExtraCallbackWithResult != null) {
                        ImageView imageView = (view2 instanceof ImageView) ^ true ? null : (ImageView) view2;
                        if (imageView == null) {
                            imageView = new ImageView(activity);
                        }
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
                        imageView.setImageBitmap(bitmapExtraCallbackWithResult);
                        imageView.setAlpha(1.0f);
                        viewOnWarmupCompleted = imageView;
                    } else {
                        viewOnWarmupCompleted = null;
                    }
                    if (viewOnWarmupCompleted == null) {
                        int i8 = IAuthTabCallback + 41;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            startwork.onActivityLayout();
                            throw null;
                        }
                        getJobwork_runtime_ktx_release getjobwork_runtime_ktx_releaseOnActivityLayout = startwork.onActivityLayout();
                        if (getjobwork_runtime_ktx_releaseOnActivityLayout != null) {
                            int i9 = onNavigationEvent + 9;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            viewOnWarmupCompleted = getjobwork_runtime_ktx_releaseOnActivityLayout.create(activity, i, i2);
                            if (viewOnWarmupCompleted != null) {
                                viewOnWarmupCompleted.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
                                viewOnWarmupCompleted.setAlpha(1.0f);
                            } else {
                                viewOnWarmupCompleted = null;
                            }
                        }
                    }
                }
                if (viewOnWarmupCompleted != null) {
                    int i11 = IAuthTabCallback + 1;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory = onWarmupCompleted;
                    scaleTransitionTargetIconFactory.onWarmupCompleted(viewOnWarmupCompleted, 1.0f, Float.valueOf(scaleTransitionTargetIconFactory.onNavigationEvent(startwork, i, i2)));
                    return viewOnWarmupCompleted;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v4, types: [im.toss.base.transition.icon.ScaleTransitionTargetIconFactory$ScaleTransitionUrlImageView] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    private final View onWarmupCompleted(Activity activity, startWork startwork, int i, int i2, View view) {
        String str;
        ScaleTransitionUrlImageView scaleTransitionUrlImageView;
        Float f;
        Float fValueOf;
        int i3 = 2 % 2;
        getFuturework_runtime_ktx_release getfuturework_runtime_ktx_releaseOnPostMessage = startwork.onPostMessage();
        Object obj = null;
        if (getfuturework_runtime_ktx_releaseOnPostMessage == null) {
            return null;
        }
        String string = StringsKt.trim(getfuturework_runtime_ktx_releaseOnPostMessage.onNavigationEvent()).toString();
        if (string.length() <= 0) {
            int i4 = IAuthTabCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = null;
        } else {
            str = string;
        }
        if (str == null) {
            int i5 = onNavigationEvent + 109;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        if (!(view instanceof ScaleTransitionUrlImageView)) {
            scaleTransitionUrlImageView = 0;
        } else {
            int i7 = IAuthTabCallback + 95;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            scaleTransitionUrlImageView = (ScaleTransitionUrlImageView) view;
        }
        if (scaleTransitionUrlImageView == 0) {
            scaleTransitionUrlImageView = new ScaleTransitionUrlImageView(activity);
        }
        handleNativeAdClick.onExtraCallback.asInterface asinterfaceExtraCallback = startwork.extraCallback();
        if (asinterfaceExtraCallback != null) {
            int i9 = IAuthTabCallback + 37;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                fValueOf = Float.valueOf(asinterfaceExtraCallback.IAuthTabCallbackDefault());
                int i10 = 95 / 0;
            } else {
                fValueOf = Float.valueOf(asinterfaceExtraCallback.IAuthTabCallbackDefault());
            }
            f = fValueOf;
        } else {
            f = null;
        }
        scaleTransitionUrlImageView.IAuthTabCallback(getfuturework_runtime_ktx_releaseOnPostMessage, str, f, i, i2);
        return scaleTransitionUrlImageView;
    }

    public final View onWarmupCompleted(@NotNull Activity activity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        TdsImageView scaleTransitionUrlImageView = new ScaleTransitionUrlImageView(activity);
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return scaleTransitionUrlImageView;
    }

    public final View onNavigationEvent(@NotNull Activity activity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        ImageView imageView = new ImageView(activity);
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return imageView;
    }

    public static /* synthetic */ void IAuthTabCallback(ScaleTransitionTargetIconFactory scaleTransitionTargetIconFactory, View view, float f, Float f2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 3) != 0) {
            int i5 = i3 + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            f2 = null;
        }
        scaleTransitionTargetIconFactory.onWarmupCompleted(view, f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted(@NotNull View view, float f, @Nullable Float f2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof ScaleTransitionUrlImageView)) {
            if (view instanceof getRunAttemptCount) {
                ((getRunAttemptCount) view).onWarmupCompleted(f, f2);
            }
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            ((ScaleTransitionUrlImageView) view).onExtraCallback(f, f2);
            return;
        }
        ((ScaleTransitionUrlImageView) view).onExtraCallback(f, f2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Object obj = (View) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            boolean z = obj instanceof ScaleTransitionUrlImageView;
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof ScaleTransitionUrlImageView) {
            ((ScaleTransitionUrlImageView) obj).onExtraCallback();
            return null;
        }
        if (obj instanceof getRunAttemptCount) {
            int i3 = IAuthTabCallback + 39;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                ((getRunAttemptCount) obj).IAuthTabCallback();
                obj2.hashCode();
                throw null;
            }
            ((getRunAttemptCount) obj).IAuthTabCallback();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean IAuthTabCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            boolean z = view instanceof ScaleTransitionUrlImageView;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (!(view instanceof ScaleTransitionUrlImageView)) {
            return true;
        }
        int i3 = IAuthTabCallback + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return ((ScaleTransitionUrlImageView) view).onExtraCallbackWithResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@NotNull View view, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!(view instanceof ScaleTransitionUrlImageView)) {
            function0.invoke();
            return;
        }
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((ScaleTransitionUrlImageView) view).onExtraCallback(function0);
            throw null;
        }
        ((ScaleTransitionUrlImageView) view).onExtraCallback(function0);
        int i3 = onNavigationEvent + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final View onExtraCallbackWithResult(@NotNull Activity activity, @NotNull startWork startwork, @Nullable View view, @Nullable View view2) {
        View viewOnWarmupCompleted;
        float f;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(startwork, "");
            viewOnWarmupCompleted = onWarmupCompleted(activity, startwork, startwork.ICustomTabsCallbackStub(), startwork.readTypedObject(), view, view2);
            int i3 = 2 / 0;
            if (viewOnWarmupCompleted == null) {
                return null;
            }
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(startwork, "");
            viewOnWarmupCompleted = onWarmupCompleted(activity, startwork, startwork.ICustomTabsCallbackStub(), startwork.readTypedObject(), view, view2);
            if (viewOnWarmupCompleted == null) {
                return null;
            }
        }
        int i4 = IAuthTabCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            viewOnWarmupCompleted.setX(startwork.ICustomTabsCallbackStubProxy());
            viewOnWarmupCompleted.setY(startwork.onRelationshipValidationResult());
            f = 0.0f;
        } else {
            viewOnWarmupCompleted.setX(startwork.ICustomTabsCallbackStubProxy());
            viewOnWarmupCompleted.setY(startwork.onRelationshipValidationResult());
            f = 1.0f;
        }
        viewOnWarmupCompleted.setAlpha(f);
        return viewOnWarmupCompleted;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, im.toss.base.transition.icon.ScaleTransitionTargetIconContainer, im.toss.tds.view.component.widget.TdsRoundLayout, java.lang.Object] */
    public final onExtraCallback onExtraCallbackWithResult(@NotNull Activity activity, @NotNull startWork startwork, @NotNull ListenableWorker listenableWorker, @Nullable ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer, @Nullable View view, @Nullable View view2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(startwork, "");
        Intrinsics.checkNotNullParameter(listenableWorker, "");
        onExtraCallback onextracallback = (onExtraCallback) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 777286136, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, activity, startwork, Integer.valueOf(startwork.ICustomTabsCallbackStub()), Integer.valueOf(startwork.readTypedObject()), scaleTransitionTargetIconContainer, view, view2}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -777286135, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        if (onextracallback == null) {
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int iICustomTabsCallbackStub = startwork.ICustomTabsCallbackStub();
        int typedObject = startwork.readTypedObject();
        int iOnNavigationEvent = (listenableWorker.onNavigationEvent() * iICustomTabsCallbackStub) / listenableWorker.onWarmupCompleted();
        float fOnNavigationEvent = onNavigationEvent(startwork, iICustomTabsCallbackStub, typedObject);
        ?? OnExtraCallback = onextracallback.onExtraCallback();
        OnExtraCallback.setLayoutParams(new FrameLayout.LayoutParams(iICustomTabsCallbackStub, iOnNavigationEvent));
        OnExtraCallback.setX(startwork.ICustomTabsCallbackStubProxy());
        OnExtraCallback.setY(startwork.onRelationshipValidationResult());
        OnExtraCallback.setPivotX(iICustomTabsCallbackStub / 2.0f);
        float f = typedObject;
        OnExtraCallback.setPivotY(f / 2.0f);
        OnExtraCallback.setRadius(getTriggeredContentAuthorities.onWarmupCompleted(fOnNavigationEvent, activity));
        handleNativeAdClick.onExtraCallback.asInterface asinterfaceExtraCallback = startwork.extraCallback();
        if (asinterfaceExtraCallback != null) {
            int i3 = IAuthTabCallback + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            OnExtraCallback.IAuthTabCallback(deprecated_mustRevalidate.onNavigationEvent(), asinterfaceExtraCallback.IAuthTabCallbackDefault());
        } else {
            ScaleTransitionTargetIconContainer.IAuthTabCallback(1481091810, nSetPosition.onExtraCallbackWithResult(), -1481091809, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), new Object[]{OnExtraCallback}, nSetPosition.onExtraCallbackWithResult());
        }
        OnExtraCallback.setTransitionVisibleHeight(f);
        OnExtraCallback.setAlpha(0.0f);
        return onextracallback;
    }

    private final float onNavigationEvent(startWork startwork, int i, int i2) {
        int i3 = 2 % 2;
        if (startwork.ICustomTabsCallbackDefault() != null) {
            Float fValueOf = Float.valueOf(r1.intValue());
            if (fValueOf.floatValue() <= 0.0f) {
                int i4 = onNavigationEvent + 79;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                fValueOf = null;
            }
            if (fValueOf != null) {
                int i6 = onNavigationEvent + 3;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return fValueOf.floatValue();
                }
                fValueOf.floatValue();
                throw null;
            }
        }
        handleNativeAdClick.onExtraCallback.asInterface asinterfaceExtraCallback = startwork.extraCallback();
        if (asinterfaceExtraCallback != null) {
            return asinterfaceExtraCallback.IAuthTabCallbackDefault() * Math.min(i, i2);
        }
        return 0.0f;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            Object obj = null;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallback + 33;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i3 = onExtraCallback + 117;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1
      0x0032: PHI (r1v5 android.view.ViewParent) = (r1v4 android.view.ViewParent), (r1v11 android.view.ViewParent) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull TdsRoundLayout tdsRoundLayout, @NotNull View view, int i, int i2) {
        ViewParent parent;
        ViewGroup viewGroup;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tdsRoundLayout, "");
            Intrinsics.checkNotNullParameter(view, "");
            parent = view.getParent();
            int i5 = 74 / 0;
            if (parent instanceof ViewGroup) {
                int i6 = IAuthTabCallback + 21;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    viewGroup = (ViewGroup) parent;
                    int i7 = 62 / 0;
                } else {
                    viewGroup = (ViewGroup) parent;
                }
            } else {
                viewGroup = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(tdsRoundLayout, "");
            Intrinsics.checkNotNullParameter(view, "");
            parent = view.getParent();
            if (parent instanceof ViewGroup) {
            }
        }
        if (viewGroup != null) {
            int i8 = IAuthTabCallback + 91;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                viewGroup.removeView(view);
                throw null;
            }
            viewGroup.removeView(view);
        }
        view.setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(i, i2));
        view.setAlpha(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setX(0.0f);
        view.setY(0.0f);
        tdsRoundLayout.addView(view);
        IAuthTabCallback(this, view, tdsRoundLayout.getScaleX(), null, 4, null);
    }

    static final class ScaleTransitionUrlImageView extends TdsImageView {
        private static int extraCallback = 0;
        private static int readTypedObject = 1;
        private Float IAuthTabCallback;
        private int IAuthTabCallbackDefault;
        private float IAuthTabCallbackStub;
        private float IAuthTabCallbackStubProxy;
        private final float IAuthTabCallback_Parcel;
        private Float access000;
        private float access100;
        private final ArrayList<Function0<Unit>> asBinder;
        private int asInterface;
        private boolean getInterfaceDescriptor;
        private final RectF onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private final Path onNavigationEvent;
        private int onTransact;
        private String onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i5;
            int i8 = ~i;
            int i9 = ~(i7 | i8);
            int i10 = i2 | i9;
            int i11 = (~(i7 | i2)) | i9 | (~(i8 | i2));
            int i12 = ~((~i2) | i5 | i);
            int i13 = i5 + i + i6 + ((-2027816600) * i4) + ((-1234684791) * i3);
            int i14 = i13 * i13;
            int i15 = (i5 * (-132237830)) + 1711013888 + ((-132237830) * i) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i6) + (811597824 * i4) + (1100742656 * i3) + (1751056384 * i14);
            int i16 = ((i5 * 572746074) - 905264446) + (i * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i6 * 572745585) + (i4 * 982511336) + (i3 * (-774025351)) + (i14 * 1257177088);
            int i17 = i15 + (i16 * i16 * 1874919424);
            return i17 != 1 ? i17 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            List list = (List) objArr[0];
            int i = 2 % 2;
            int i2 = readTypedObject + 53;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(list);
            int i4 = readTypedObject + 103;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(ScaleTransitionUrlImageView scaleTransitionUrlImageView, int i, Throwable th) {
            int i2 = 2 % 2;
            int i3 = extraCallback + 35;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(scaleTransitionUrlImageView, i, th);
            int i5 = readTypedObject + 43;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnNavigationEvent;
        }

        public static /* synthetic */ Unit onWarmupCompleted(ScaleTransitionUrlImageView scaleTransitionUrlImageView, int i, RecomposerKt recomposerKt) {
            int i2 = 2 % 2;
            int i3 = readTypedObject + 5;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnExtraCallback = onExtraCallback(scaleTransitionUrlImageView, i, recomposerKt);
            if (i4 != 0) {
                int i5 = 3 / 0;
            }
            return unitOnExtraCallback;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ScaleTransitionUrlImageView(@NotNull Context context) {
            super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(context, "");
            this.access100 = 1.0f;
            float fIAuthTabCallback = varyMatches.IAuthTabCallback(16, context);
            this.IAuthTabCallback_Parcel = fIAuthTabCallback;
            this.onNavigationEvent = new Path();
            this.onExtraCallback = new RectF();
            this.IAuthTabCallbackStubProxy = fIAuthTabCallback;
            this.onTransact = -1;
            this.asInterface = -1;
            this.IAuthTabCallbackStub = -1.0f;
            this.asBinder = new ArrayList<>();
            setOutlineProvider(new ViewOutlineProvider() { // from class: im.toss.base.transition.icon.ScaleTransitionTargetIconFactory.ScaleTransitionUrlImageView.4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 31;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(view, "");
                    Intrinsics.checkNotNullParameter(outline, "");
                    float width = view.getWidth();
                    Object[] objArr = {ScaleTransitionUrlImageView.this};
                    int iOnExtraCallback = getBacktraceNoteBytes.onExtraCallback((width * (1.0f - ((Float) ScaleTransitionUrlImageView.onExtraCallbackWithResult(-732161392, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 732161393, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted())).floatValue())) / 2.0f);
                    float height = view.getHeight();
                    Object[] objArr2 = {ScaleTransitionUrlImageView.this};
                    int iOnExtraCallback2 = getBacktraceNoteBytes.onExtraCallback((height * (1.0f - ((Float) ScaleTransitionUrlImageView.onExtraCallbackWithResult(-732161392, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr2, 732161393, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted())).floatValue())) / 2.0f);
                    outline.setRoundRect(iOnExtraCallback, iOnExtraCallback2, view.getWidth() - iOnExtraCallback, view.getHeight() - iOnExtraCallback2, ScaleTransitionUrlImageView.onWarmupCompleted(ScaleTransitionUrlImageView.this));
                    int i4 = onExtraCallback + 19;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                }
            });
        }

        public static final /* synthetic */ float onWarmupCompleted(ScaleTransitionUrlImageView scaleTransitionUrlImageView) {
            int i = 2 % 2;
            int i2 = extraCallback;
            int i3 = i2 + 55;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            float f = scaleTransitionUrlImageView.IAuthTabCallbackStubProxy;
            int i5 = i2 + 115;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            ScaleTransitionUrlImageView scaleTransitionUrlImageView = (ScaleTransitionUrlImageView) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallback + 39;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            float f = scaleTransitionUrlImageView.access100;
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            return Float.valueOf(f);
        }

        private static final Unit onExtraCallback(ScaleTransitionUrlImageView scaleTransitionUrlImageView, int i, RecomposerKt recomposerKt) {
            int i2 = 2 % 2;
            int i3 = readTypedObject + 7;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(recomposerKt, "");
            Object[] objArr = {scaleTransitionUrlImageView, Integer.valueOf(i)};
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            onExtraCallbackWithResult(-1226479492, iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 1226479494, iOnWarmupCompleted2);
            Unit unit = Unit.INSTANCE;
            int i5 = readTypedObject + 5;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private static final Unit onNavigationEvent(ScaleTransitionUrlImageView scaleTransitionUrlImageView, int i, Throwable th) {
            int i2 = 2 % 2;
            int i3 = readTypedObject + 89;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Object[] objArr = {scaleTransitionUrlImageView, Integer.valueOf(i)};
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            onExtraCallbackWithResult(-1226479492, iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 1226479494, iOnWarmupCompleted2);
            Unit unit = Unit.INSTANCE;
            int i5 = readTypedObject + 121;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 87 / 0;
            }
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(@NotNull getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, @NotNull String str, @Nullable Float f, int i, int i2) {
            boolean z;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(getfuturework_runtime_ktx_release, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.access100 = RangesKt.coerceIn(getfuturework_runtime_ktx_release.IAuthTabCallback(), 0.01f, 1.0f);
            this.access000 = f;
            this.getInterfaceDescriptor = false;
            Object obj = null;
            this.IAuthTabCallback = null;
            this.IAuthTabCallbackStubProxy = this.IAuthTabCallback_Parcel;
            IAuthTabCallback();
            setScaleType(getfuturework_runtime_ktx_release.onExtraCallbackWithResult());
            setLayoutParams(new FrameLayout.LayoutParams(i, i2));
            if (f == null) {
                int i4 = extraCallback + 51;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            setClipToOutline(z);
            setAlpha(1.0f);
            if (Intrinsics.areEqual(this.onWarmupCompleted, str)) {
                int i6 = readTypedObject + 57;
                extraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    getDrawable();
                    obj.hashCode();
                    throw null;
                }
                if (getDrawable() != null) {
                    this.onExtraCallbackWithResult = true;
                } else {
                    final int i7 = this.IAuthTabCallbackDefault + 1;
                    this.IAuthTabCallbackDefault = i7;
                    this.onExtraCallbackWithResult = false;
                    this.asBinder.clear();
                    if (!Intrinsics.areEqual(this.onWarmupCompleted, str)) {
                        setImageDrawable((Drawable) null);
                    }
                    setImage(str, new Function1() { // from class: im.toss.base.transition.icon.ScaleTransitionTargetIconFactory$ScaleTransitionUrlImageView$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 91;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            ScaleTransitionTargetIconFactory.ScaleTransitionUrlImageView scaleTransitionUrlImageView = this.f$0;
                            if (i10 == 0) {
                                return ScaleTransitionTargetIconFactory.ScaleTransitionUrlImageView.onWarmupCompleted(scaleTransitionUrlImageView, i7, (RecomposerKt) obj2);
                            }
                            ScaleTransitionTargetIconFactory.ScaleTransitionUrlImageView.onWarmupCompleted(scaleTransitionUrlImageView, i7, (RecomposerKt) obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }, new Function1() { // from class: im.toss.base.transition.icon.ScaleTransitionTargetIconFactory$ScaleTransitionUrlImageView$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 53;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnExtraCallbackWithResult = ScaleTransitionTargetIconFactory.ScaleTransitionUrlImageView.onExtraCallbackWithResult(this.f$0, i7, (Throwable) obj2);
                            int i11 = onExtraCallbackWithResult + 125;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    });
                    this.onWarmupCompleted = str;
                    int i8 = readTypedObject + 71;
                    extraCallback = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            invalidateOutline();
            invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = readTypedObject + 97;
            int i3 = i2 % 128;
            extraCallback = i3;
            int i4 = i2 % 2;
            if (!this.onExtraCallbackWithResult) {
                int i5 = i3 + 73;
                readTypedObject = i5 % 128;
                int i6 = i5 % 2;
                if (getDrawable() == null) {
                    return false;
                }
            }
            int i7 = readTypedObject + 115;
            extraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public final void onExtraCallback(@NotNull Function0<Unit> function0) {
            int i = 2 % 2;
            int i2 = readTypedObject + 25;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(function0, "");
            if (!onExtraCallbackWithResult()) {
                this.asBinder.add(function0);
                return;
            }
            int i4 = readTypedObject + 89;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                function0.invoke();
            } else {
                function0.invoke();
                throw null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, im.toss.base.transition.icon.ScaleTransitionTargetIconFactory$ScaleTransitionUrlImageView] */
        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            final List list;
            ?? r0 = (ScaleTransitionUrlImageView) objArr[0];
            int i = 2 % 2;
            if (((Number) objArr[1]).intValue() != ((ScaleTransitionUrlImageView) r0).IAuthTabCallbackDefault) {
                return null;
            }
            int i2 = readTypedObject;
            int i3 = i2 + 35;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (((ScaleTransitionUrlImageView) r0).onExtraCallbackWithResult) {
                return null;
            }
            int i5 = i2 + 117;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                ((ScaleTransitionUrlImageView) r0).onExtraCallbackWithResult = true;
                list = CollectionsKt.toList(((ScaleTransitionUrlImageView) r0).asBinder);
                ((ScaleTransitionUrlImageView) r0).asBinder.clear();
                if (list.isEmpty()) {
                    return null;
                }
            } else {
                ((ScaleTransitionUrlImageView) r0).onExtraCallbackWithResult = true;
                list = CollectionsKt.toList(((ScaleTransitionUrlImageView) r0).asBinder);
                ((ScaleTransitionUrlImageView) r0).asBinder.clear();
                if (list.isEmpty()) {
                    return null;
                }
            }
            r0.post(new Runnable() { // from class: im.toss.base.transition.icon.ScaleTransitionTargetIconFactory$ScaleTransitionUrlImageView$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 15;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr2 = {list};
                    int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                    ScaleTransitionTargetIconFactory.ScaleTransitionUrlImageView.onExtraCallbackWithResult(489941658, iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr2, -489941658, iOnWarmupCompleted2);
                    int i9 = onExtraCallback + 25;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            int i6 = readTypedObject + 61;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            int i7 = 4 / 3;
            return null;
        }

        private static final void onExtraCallbackWithResult(List list) {
            int i = 2 % 2;
            int i2 = extraCallback + 5;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i4 = extraCallback + 77;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                ((Function0) it.next()).invoke();
            }
            int i6 = extraCallback + 85;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onExtraCallback(float f, @Nullable Float f2) {
            boolean z;
            float fFloatValue;
            int i = 2 % 2;
            int i2 = extraCallback + 57;
            int i3 = i2 % 128;
            readTypedObject = i3;
            int i4 = i2 % 2;
            boolean z2 = this.getInterfaceDescriptor;
            boolean z3 = true;
            if (z2 || f2 != null) {
                z = true;
            } else {
                int i5 = i3 + 55;
                extraCallback = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
            if (z2 == z) {
                int i7 = extraCallback + 39;
                readTypedObject = i7 % 128;
                int i8 = i7 % 2;
                z3 = false;
            }
            this.getInterfaceDescriptor = z;
            if (f2 != null) {
                this.IAuthTabCallback = Float.valueOf(f2.floatValue());
            }
            if (this.access000 != null) {
                int i9 = extraCallback + 61;
                readTypedObject = i9 % 128;
                int i10 = i9 % 2;
                if (!this.getInterfaceDescriptor) {
                    return;
                }
            }
            Float f3 = this.IAuthTabCallback;
            if (f3 != null) {
                int i11 = extraCallback + 67;
                readTypedObject = i11 % 128;
                int i12 = i11 % 2;
                fFloatValue = f3.floatValue();
            } else {
                fFloatValue = this.IAuthTabCallback_Parcel;
            }
            float fCoerceAtLeast = fFloatValue / (RangesKt.coerceAtLeast(f, 0.01f) * RangesKt.coerceAtLeast(getScaleX(), 0.01f));
            if (z3 || this.IAuthTabCallbackStubProxy != fCoerceAtLeast) {
                this.IAuthTabCallbackStubProxy = fCoerceAtLeast;
                invalidateOutline();
                invalidate();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = extraCallback + 57;
            readTypedObject = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (this.access000 == null || !this.getInterfaceDescriptor) {
                    return;
                }
                this.getInterfaceDescriptor = false;
                this.IAuthTabCallback = null;
                this.IAuthTabCallbackStubProxy = this.IAuthTabCallback_Parcel;
                IAuthTabCallback();
                invalidateOutline();
                invalidate();
                int i3 = extraCallback + 69;
                readTypedObject = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r1 r2
          0x003f: PHI (r1v5 int) = (r1v4 int), (r1v8 int) binds: [B:8:0x003d, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x003f: PHI (r2v4 float) = (r2v3 float), (r2v6 float) binds: [B:8:0x003d, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void onDraw(@NotNull Canvas canvas) {
            int iSave;
            float f;
            int i = 2 % 2;
            int i2 = readTypedObject + 59;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(canvas, "");
                iSave = canvas.save();
                onNavigationEvent();
                canvas.clipPath(this.onNavigationEvent);
                f = this.access100;
                if (f < 2.0f) {
                    int i3 = extraCallback + 103;
                    readTypedObject = i3 % 128;
                    if (i3 % 2 == 0) {
                        canvas.scale(f, f, getWidth() + 2.0f, getHeight() * 0.0f);
                    } else {
                        canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(canvas, "");
                iSave = canvas.save();
                onNavigationEvent();
                canvas.clipPath(this.onNavigationEvent);
                f = this.access100;
                if (f < 1.0f) {
                }
            }
            super/*android.view.View*/.onDraw(canvas);
            canvas.restoreToCount(iSave);
            int i4 = extraCallback + 57;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void onNavigationEvent() {
            float f;
            int i = 2 % 2;
            Float f2 = this.access000;
            if (f2 == null || this.getInterfaceDescriptor) {
                f = this.IAuthTabCallbackStubProxy;
            } else {
                int i2 = readTypedObject + 93;
                extraCallback = i2 % 128;
                int i3 = i2 % 2;
                f = -1.0f;
            }
            if (this.onTransact == getWidth() && this.asInterface == getHeight()) {
                int i4 = readTypedObject + 109;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (this.IAuthTabCallbackStub == f) {
                    return;
                }
            }
            float width = (getWidth() * (1.0f - this.access100)) / 2.0f;
            float height = (getHeight() * (1.0f - this.access100)) / 2.0f;
            this.onExtraCallback.set(width, height, getWidth() - width, getHeight() - height);
            this.onNavigationEvent.reset();
            if (f2 != null && !this.getInterfaceDescriptor) {
                int i6 = extraCallback + 51;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                this.onNavigationEvent.set(deprecated_noStore.onExtraCallback.IAuthTabCallback(this.onExtraCallback.width(), this.onExtraCallback.height(), deprecated_mustRevalidate.onNavigationEvent(), f2.floatValue()));
                Path path = this.onNavigationEvent;
                RectF rectF = this.onExtraCallback;
                path.offset(rectF.left, rectF.top);
            } else if (this.getInterfaceDescriptor) {
                this.onNavigationEvent.set(deprecated_noStore.onExtraCallbackWithResult(deprecated_noStore.onExtraCallback, this.onExtraCallback.width(), this.onExtraCallback.height(), this.IAuthTabCallbackStubProxy, 0, false, 24, (Object) null));
                Path path2 = this.onNavigationEvent;
                RectF rectF2 = this.onExtraCallback;
                path2.offset(rectF2.left, rectF2.top);
            } else {
                Path path3 = this.onNavigationEvent;
                RectF rectF3 = this.onExtraCallback;
                float f3 = this.IAuthTabCallbackStubProxy;
                path3.addRoundRect(rectF3, f3, f3, Path.Direction.CW);
            }
            this.onTransact = getWidth();
            this.asInterface = getHeight();
            this.IAuthTabCallbackStub = f;
        }

        private final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = extraCallback + 11;
            readTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                this.onTransact = -1;
                this.asInterface = -1;
                this.IAuthTabCallbackStub = -1.0f;
                this.onNavigationEvent.reset();
                int i3 = readTypedObject + 35;
                extraCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.onTransact = -1;
            this.asInterface = -1;
            this.IAuthTabCallbackStub = -1.0f;
            this.onNavigationEvent.reset();
            throw null;
        }

        public static /* synthetic */ void onExtraCallback(List list) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            onExtraCallbackWithResult(489941658, iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{list}, -489941658, iOnWarmupCompleted2);
        }

        public static final /* synthetic */ float onNavigationEvent(ScaleTransitionUrlImageView scaleTransitionUrlImageView) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return ((Float) onExtraCallbackWithResult(-732161392, iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{scaleTransitionUrlImageView}, 732161393, iOnWarmupCompleted2)).floatValue();
        }

        private final void onExtraCallbackWithResult(int i) {
            Object[] objArr = {this, Integer.valueOf(i)};
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            onExtraCallbackWithResult(-1226479492, iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 1226479494, iOnWarmupCompleted2);
        }
    }

    private final onExtraCallback onWarmupCompleted(Activity activity, startWork startwork, int i, int i2, ScaleTransitionTargetIconContainer scaleTransitionTargetIconContainer, View view, View view2) {
        Object[] objArr = {this, activity, startwork, Integer.valueOf(i), Integer.valueOf(i2), scaleTransitionTargetIconContainer, view, view2};
        return (onExtraCallback) IAuthTabCallback(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 777286136, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -777286135, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public final void onExtraCallback(@NotNull View view) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, 2043403873, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, view}, iOnExtraCallback2, -2043403873, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
    }
}
