package im.toss.uikit.widget.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.snackbar.ContentViewCallback;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.common.collect.Synchronized;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.widget.snackbar.BaseTransientBar;
import im.toss.uikit.widget.snackbar.BaseTransientBar$6$;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import o.AppLovinSdkSettings;
import o.CameraControllerExternalSyntheticLambda9;
import o.attachAppLovinSdk;
import o.deprecated_certificatePinner;
import o.deprecated_dns;
import o.getExtraParameters;
import o.isMuted;
import o.safeSizeOf;
import o.setVersionCode;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BaseTransientBar<B extends BaseTransientBar<B>> {
    private static final boolean IAuthTabCallbackDefault = false;
    private static int ICustomTabsCallback_Parcel = 1;
    private static int isEngagementSignalsApiAvailable = 0;
    private static int mayLaunchUrl = 1;
    private static int onRelationshipValidationResult;
    protected Rect IAuthTabCallback;
    private View IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final deprecated_dns IAuthTabCallback_Parcel;
    private final Context ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private final ViewGroup ICustomTabsCallbackStubProxy;
    private final deprecated_dns access000;
    private boolean access100;
    private final ViewTreeObserver.OnGlobalLayoutListener asBinder;
    private final Runnable extraCallback;
    private List<onExtraCallbackWithResult<B>> extraCallbackWithResult;
    private final int getInterfaceDescriptor;
    private int onActivityLayout;
    private int onActivityResized;
    protected final SnackbarBaseLayout onExtraCallback;
    private int onMessageChannelReady;
    private int onMinimized;
    private int onPostMessage;
    private final AccessibilityManager onTransact;
    private safeSizeOf onUnminimized;
    setVersionCode.IAuthTabCallback onWarmupCompleted;
    private final ContentViewCallback readTypedObject;
    private int writeTypedObject;
    private static final int[] onExtraCallbackWithResult = {R.attr.snackbarStyle};
    private static final String asInterface = BaseTransientBar.class.getSimpleName();
    static final Handler onNavigationEvent = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = BaseTransientBar.onExtraCallback(message);
            int i4 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return zOnExtraCallback;
        }
    });

    protected interface IAuthTabCallback {
        void IAuthTabCallback(View view);

        void onNavigationEvent(View view);
    }

    public static abstract class onExtraCallbackWithResult<B> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public void onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 103;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    protected interface onWarmupCompleted {
        void onLayoutChange(View view, int i, int i2, int i3, int i4);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BaseTransientBar baseTransientBar = (BaseTransientBar) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        safeSizeOf safesizeof = baseTransientBar.onUnminimized;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 13;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return safesizeof;
    }

    public static /* synthetic */ void IAuthTabCallback(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 103;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {baseTransientBar};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent4 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        if (i3 == 0) {
            onWarmupCompleted(-507955446, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent4, 507955450, objArr, iOnNavigationEvent);
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted(-507955446, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent4, 507955450, objArr, iOnNavigationEvent);
        int i4 = onRelationshipValidationResult + 27;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        BaseTransientBar baseTransientBar = (BaseTransientBar) objArr[0];
        View view = (View) objArr[1];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[2];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 115;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            baseTransientBar.onExtraCallbackWithResult(view, windowInsetsCompat);
            throw null;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = baseTransientBar.onExtraCallbackWithResult(view, windowInsetsCompat);
        int i3 = ICustomTabsCallback_Parcel + 41;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    static /* synthetic */ void IAuthTabCallbackDefault(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 61;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        baseTransientBar.onPostMessage();
        if (i3 != 0) {
            throw null;
        }
    }

    static /* synthetic */ int IAuthTabCallbackStub(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 75;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iAccess100 = baseTransientBar.access100();
        int i4 = ICustomTabsCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return iAccess100;
    }

    static /* synthetic */ int asInterface(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            return ((Integer) onWarmupCompleted(1330466260, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1330466255, new Object[]{baseTransientBar}, iOnNavigationEvent)).intValue();
        }
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int i3 = 1 / 0;
        return ((Integer) onWarmupCompleted(1330466260, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1330466255, new Object[]{baseTransientBar}, iOnNavigationEvent2)).intValue();
    }

    static /* synthetic */ ContentViewCallback onExtraCallback(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 65;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        ContentViewCallback contentViewCallback = baseTransientBar.readTypedObject;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 23;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return contentViewCallback;
    }

    static /* synthetic */ void onExtraCallback(BaseTransientBar baseTransientBar, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel;
        int i4 = i3 + 79;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        baseTransientBar.onActivityLayout = i;
        int i6 = i3 + 37;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int onExtraCallbackWithResult(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        int i5 = baseTransientBar.onActivityLayout;
        if (i4 != 0) {
            throw null;
        }
        int i6 = i3 + 101;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ void onExtraCallbackWithResult(BaseTransientBar baseTransientBar, int i) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult;
        int i4 = i3 + 115;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        baseTransientBar.onMessageChannelReady = i;
        int i6 = i3 + 51;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    static /* synthetic */ Context onNavigationEvent(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 101;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        Context context = baseTransientBar.ICustomTabsCallback;
        int i5 = i3 + 85;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    static /* synthetic */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 5;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return z;
    }

    static /* synthetic */ int onTransact(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 59;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iExtraCallbackWithResult = baseTransientBar.extraCallbackWithResult();
        int i4 = onRelationshipValidationResult + 91;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~i6;
        int i10 = ~(i9 | i);
        int i11 = i8 | i10;
        int i12 = ~i;
        int i13 = ~(i12 | i5);
        int i14 = (~(i6 | i7)) | i13 | i10;
        int i15 = (~(i9 | i5)) | (~(i12 | i9)) | i13;
        int i16 = i + i5 + i2 + ((-954185507) * i3) + (2055044340 * i4);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i) - 760807424) + ((-878567756) * i5) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i2) + (1313472512 * i3) + (606601216 * i4) + ((-1232666624) * i17);
        int i19 = (i * 1290134917) + 267690129 + (i5 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i2 * 1290136159) + (i3 * 826674179) + (i4 * 1594648204) + (i17 * 572063744);
        switch (i18 + (i19 * i19 * 607715328)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                BaseTransientBar baseTransientBar = (BaseTransientBar) objArr[0];
                int i20 = 2 % 2;
                ValueAnimator valueAnimatorOnNavigationEvent = baseTransientBar.onNavigationEvent(0.0f, 1.0f);
                ValueAnimator valueAnimatorOnExtraCallback = baseTransientBar.onExtraCallback(0.8f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimatorOnNavigationEvent, valueAnimatorOnExtraCallback);
                animatorSet.setDuration(150L);
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.13
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        int i21 = 2 % 2;
                        int i22 = onWarmupCompleted + 99;
                        onNavigationEvent = i22 % 128;
                        int i23 = i22 % 2;
                        BaseTransientBar.this.getInterfaceDescriptor();
                        int i24 = onNavigationEvent + 15;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                    }
                });
                animatorSet.start();
                int i21 = ICustomTabsCallback_Parcel + 91;
                onRelationshipValidationResult = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(BaseTransientBar baseTransientBar, View view, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = ICustomTabsCallback_Parcel + 27;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(668498335, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -668498333, new Object[]{baseTransientBar, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        int i8 = ICustomTabsCallback_Parcel + 125;
        onRelationshipValidationResult = i8 % 128;
        int i9 = i8 % 2;
    }

    static /* synthetic */ boolean onWarmupCompleted(BaseTransientBar baseTransientBar) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 23;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = baseTransientBar.access100;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return z;
    }

    abstract int onTransact();

    static {
        int i = mayLaunchUrl + 105;
        isEngagementSignalsApiAvailable = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ boolean onExtraCallback(Message message) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 13;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = message.what;
            if (i3 == 0) {
                onWarmupCompleted(1137131574, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1137131574, new Object[]{(BaseTransientBar) message.obj}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
                return true;
            }
            if (i3 != 1) {
                int i4 = onRelationshipValidationResult + 65;
                ICustomTabsCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            ((BaseTransientBar) message.obj).onNavigationEvent(message.arg1);
            int i6 = ICustomTabsCallback_Parcel + 15;
            onRelationshipValidationResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 55 / 0;
            }
            return true;
        }
        int i8 = message.what;
        throw null;
    }

    protected BaseTransientBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
        this(viewGroup.getContext(), viewGroup, view, contentViewCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r8 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r4.ICustomTabsCallbackStubProxy = r6;
        r6.setClipChildren(false);
        r6.setClipToPadding(false);
        r4.readTypedObject = r8;
        r4.ICustomTabsCallback = r5;
        com.google.android.material.internal.ThemeEnforcement.checkAppCompatTheme(r5);
        r6 = (im.toss.uikit.widget.snackbar.BaseTransientBar.SnackbarBaseLayout) android.view.LayoutInflater.from(r5).inflate(IAuthTabCallbackDefault(), r6, false);
        r4.onExtraCallback = r6;
        r6.addView(r7);
        r7 = r6.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        if ((r7 instanceof android.view.ViewGroup.MarginLayoutParams) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        r7 = (android.view.ViewGroup.MarginLayoutParams) r7;
        r4.IAuthTabCallback = new android.graphics.Rect(r7.leftMargin, r7.topMargin, r7.rightMargin, r7.bottomMargin);
        r7 = im.toss.uikit.widget.snackbar.BaseTransientBar.onRelationshipValidationResult + 83;
        im.toss.uikit.widget.snackbar.BaseTransientBar.ICustomTabsCallback_Parcel = r7 % 128;
        r7 = r7 % 2;
        r7 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        androidx.core.view.ViewCompat.asBinder(r6, 1);
        androidx.core.view.ViewCompat.IAuthTabCallbackStub(r6, 1);
        androidx.core.view.ViewCompat.onWarmupCompleted(r6, true);
        androidx.core.view.ViewCompat.onWarmupCompleted(r6, new im.toss.uikit.widget.snackbar.BaseTransientBar$$ExternalSyntheticLambda0(r4));
        androidx.core.view.ViewCompat.IAuthTabCallback(r6, new im.toss.uikit.widget.snackbar.BaseTransientBar.AnonymousClass10(r4));
        r4.onTransact = (android.view.accessibility.AccessibilityManager) r5.getSystemService("accessibility");
        r5 = im.toss.uikit.widget.snackbar.BaseTransientBar.onRelationshipValidationResult + 93;
        im.toss.uikit.widget.snackbar.BaseTransientBar.ICustomTabsCallback_Parcel = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
    
        throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null callback");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r8 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected BaseTransientBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
        this.access100 = false;
        this.asBinder = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.3
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 115;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (BaseTransientBar.onWarmupCompleted(BaseTransientBar.this)) {
                    BaseTransientBar baseTransientBar = BaseTransientBar.this;
                    BaseTransientBar.onExtraCallbackWithResult(baseTransientBar, BaseTransientBar.IAuthTabCallbackStub(baseTransientBar));
                    BaseTransientBar.IAuthTabCallbackDefault(BaseTransientBar.this);
                    int i4 = onExtraCallbackWithResult + 29;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 55 / 0;
                    }
                }
            }
        };
        this.extraCallback = new Runnable() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.7
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public void run() {
                int iAsInterface;
                int i = 2 % 2;
                if (BaseTransientBar.onNavigationEvent(BaseTransientBar.this) != null) {
                    int i2 = onNavigationEvent + 27;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0 ? (iAsInterface = (BaseTransientBar.asInterface(BaseTransientBar.this) - BaseTransientBar.onTransact(BaseTransientBar.this)) + ((int) BaseTransientBar.this.onExtraCallback.getTranslationY())) < BaseTransientBar.onExtraCallbackWithResult(BaseTransientBar.this) : (iAsInterface = (BaseTransientBar.asInterface(BaseTransientBar.this) * BaseTransientBar.onTransact(BaseTransientBar.this)) >> ((int) BaseTransientBar.this.onExtraCallback.getTranslationY())) < BaseTransientBar.onExtraCallbackWithResult(BaseTransientBar.this)) {
                        ViewGroup.LayoutParams layoutParams = BaseTransientBar.this.onExtraCallback.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBar.onExtraCallbackWithResult(BaseTransientBar.this) - iAsInterface;
                            BaseTransientBar.this.onExtraCallback.requestLayout();
                            return;
                        }
                    }
                }
                int i3 = onNavigationEvent + 73;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }
        };
        this.onWarmupCompleted = new setVersionCode.IAuthTabCallback() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.6
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // o.setVersionCode.IAuthTabCallback
            public void onNavigationEvent() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Handler handler = BaseTransientBar.onNavigationEvent;
                handler.sendMessage(handler.obtainMessage(0, BaseTransientBar.this));
                int i4 = IAuthTabCallback + 35;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 15 / 0;
                }
            }

            @Override // o.setVersionCode.IAuthTabCallback
            public void onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Handler handler = BaseTransientBar.onNavigationEvent;
                handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBar.this));
                int i5 = IAuthTabCallback + 9;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        deprecated_dns deprecated_dnsVarOnNavigationEvent = deprecated_certificatepinner.onNavigationEvent();
        this.IAuthTabCallback_Parcel = deprecated_dnsVarOnNavigationEvent;
        deprecated_dns deprecated_dnsVarAsInterface = deprecated_certificatepinner.asInterface();
        this.access000 = deprecated_dnsVarAsInterface;
        this.IAuthTabCallbackStubProxy = deprecated_dnsVarOnNavigationEvent.IAuthTabCallback();
        this.getInterfaceDescriptor = deprecated_dnsVarAsInterface.IAuthTabCallback();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        int i = onRelationshipValidationResult + 7;
        ICustomTabsCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
    }

    private /* synthetic */ WindowInsetsCompat onExtraCallbackWithResult(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 123;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iAsBinder = WindowInsetsCompat.onTransact.asBinder();
        this.ICustomTabsCallbackStub = windowInsetsCompat.onWarmupCompleted(iAsBinder).onWarmupCompleted;
        this.onMinimized = windowInsetsCompat.onWarmupCompleted(iAsBinder).onExtraCallback;
        this.onPostMessage = windowInsetsCompat.onWarmupCompleted(iAsBinder).IAuthTabCallback;
        this.onActivityResized = windowInsetsCompat.onWarmupCompleted(iAsBinder).onExtraCallbackWithResult;
        onPostMessage();
        int i4 = onRelationshipValidationResult + 35;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onPostMessage() {
        int i;
        int i2 = 2 % 2;
        ViewGroup.LayoutParams layoutParams = this.onExtraCallback.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int i3 = ICustomTabsCallback_Parcel + 61;
            int i4 = i3 % 128;
            onRelationshipValidationResult = i4;
            int i5 = i3 % 2;
            Rect rect = this.IAuthTabCallback;
            if (rect != null) {
                int i6 = i4 + 65;
                ICustomTabsCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                if (this.IAuthTabCallbackStub != null) {
                    int i8 = i4 + 109;
                    ICustomTabsCallback_Parcel = i8 % 128;
                    if (i8 % 2 == 0) {
                        i = this.onMessageChannelReady;
                        int i9 = 11 / 0;
                    } else {
                        i = this.onMessageChannelReady;
                    }
                } else {
                    i = this.onMinimized;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i10 = rect.bottom;
                marginLayoutParams.topMargin = this.ICustomTabsCallbackStub + i10;
                marginLayoutParams.bottomMargin = i10 + i;
                marginLayoutParams.leftMargin = rect.left + this.onPostMessage;
                marginLayoutParams.rightMargin = rect.right + this.onActivityResized;
                this.onExtraCallback.requestLayout();
                if (Build.VERSION.SDK_INT >= 29) {
                    int i11 = onRelationshipValidationResult + 97;
                    ICustomTabsCallback_Parcel = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 75 / 0;
                        if (onActivityLayout()) {
                            this.onExtraCallback.removeCallbacks(this.extraCallback);
                            this.onExtraCallback.post(this.extraCallback);
                        }
                    } else if (onActivityLayout()) {
                    }
                }
            }
        }
        int i13 = onRelationshipValidationResult + 83;
        ICustomTabsCallback_Parcel = i13 % 128;
        int i14 = i13 % 2;
    }

    private boolean onActivityLayout() {
        int i = 2 % 2;
        if (this.onActivityLayout <= 0) {
            return false;
        }
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 83;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.ICustomTabsCallbackDefault)) {
            return false;
        }
        int i5 = i2 + 75;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        if (!asBinder()) {
            return im.toss.uikit.R.layout.design_layout_tds_toast;
        }
        int i2 = ICustomTabsCallback_Parcel + 91;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = im.toss.uikit.R.layout.mtr_layout_tds_toast;
        int i5 = ICustomTabsCallback_Parcel + 81;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r5 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r5 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r1 = im.toss.uikit.widget.snackbar.BaseTransientBar.onRelationshipValidationResult + 101;
        im.toss.uikit.widget.snackbar.BaseTransientBar.ICustomTabsCallback_Parcel = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 115;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = this.ICustomTabsCallback.obtainStyledAttributes(onExtraCallbackWithResult);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = this.ICustomTabsCallback.obtainStyledAttributes(onExtraCallbackWithResult);
            int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    public B onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 29;
        int i4 = i3 % 128;
        onRelationshipValidationResult = i4;
        int i5 = i3 % 2;
        this.writeTypedObject = i;
        int i6 = i4 + 57;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 39;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.writeTypedObject;
        int i6 = i2 + 7;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public B IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 63;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback.onExtraCallbackWithResult(i);
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        return this;
    }

    public Context onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 81;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.ICustomTabsCallback;
        int i5 = i2 + 55;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    public void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 33;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setVersionCode setversioncodeOnExtraCallback = setVersionCode.onExtraCallback();
        if (i3 != 0) {
            setversioncodeOnExtraCallback.onExtraCallback(IAuthTabCallback(), this.onWarmupCompleted);
        } else {
            setversioncodeOnExtraCallback.onExtraCallback(IAuthTabCallback(), this.onWarmupCompleted);
            int i4 = 79 / 0;
        }
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 35;
        onRelationshipValidationResult = i2 % 128;
        onWarmupCompleted(i2 % 2 != 0 ? 4 : 3);
    }

    protected void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 109;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        setVersionCode.onExtraCallback().onWarmupCompleted(this.onWarmupCompleted, i);
        int i5 = ICustomTabsCallback_Parcel + 29;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public B IAuthTabCallback(@Nullable onExtraCallbackWithResult<B> onextracallbackwithresult) {
        int i = 2 % 2;
        if (onextracallbackwithresult == null) {
            int i2 = onRelationshipValidationResult + 17;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return this;
        }
        if (this.extraCallbackWithResult == null) {
            this.extraCallbackWithResult = new ArrayList();
            int i4 = onRelationshipValidationResult + 55;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        this.extraCallbackWithResult.add(onextracallbackwithresult);
        return this;
    }

    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = setVersionCode.onExtraCallback().onExtraCallback(this.onWarmupCompleted);
        int i4 = ICustomTabsCallback_Parcel + 73;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        throw null;
    }

    public boolean asInterface() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = setVersionCode.onExtraCallback().onNavigationEvent(this.onWarmupCompleted);
        int i4 = ICustomTabsCallback_Parcel + 11;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final BaseTransientBar baseTransientBar = (BaseTransientBar) objArr[0];
        int i = 2 % 2;
        baseTransientBar.onExtraCallback.onNavigationEvent((IAuthTabCallback) new 9(baseTransientBar));
        if (baseTransientBar.onExtraCallback.getParent() == null) {
            baseTransientBar.extraCallback();
            baseTransientBar.onMessageChannelReady = baseTransientBar.access100();
            baseTransientBar.onPostMessage();
            baseTransientBar.onExtraCallback.setVisibility(4);
            baseTransientBar.ICustomTabsCallbackStubProxy.addView(baseTransientBar.onExtraCallback);
        }
        if (ViewCompat.ICustomTabsService(baseTransientBar.onExtraCallback)) {
            int i2 = ICustomTabsCallback_Parcel + 113;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            baseTransientBar.onMessageChannelReady();
            return null;
        }
        baseTransientBar.onExtraCallback.onNavigationEvent(new onWarmupCompleted() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // im.toss.uikit.widget.snackbar.BaseTransientBar.onWarmupCompleted
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 109;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                BaseTransientBar.onWarmupCompleted(this.f$0, view, i4, i5, i6, i7);
                int i11 = onExtraCallback + 57;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i4 = onRelationshipValidationResult + 105;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BaseTransientBar baseTransientBar = (BaseTransientBar) objArr[0];
        ((Number) objArr[2]).intValue();
        ((Number) objArr[3]).intValue();
        ((Number) objArr[4]).intValue();
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 15;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        baseTransientBar.onExtraCallback.onNavigationEvent((onWarmupCompleted) null);
        baseTransientBar.onMessageChannelReady();
        int i4 = onRelationshipValidationResult + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 105;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        if (access000()) {
            onExtraCallbackWithResult();
            return;
        }
        if (this.onExtraCallback.getParent() != null) {
            int i4 = ICustomTabsCallback_Parcel + 21;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallback.setVisibility(0);
            int i6 = ICustomTabsCallback_Parcel + 17;
            onRelationshipValidationResult = i6 % 128;
            int i7 = i6 % 2;
        }
        getInterfaceDescriptor();
    }

    private int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 59;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            int[] iArr = new int[5];
            this.onExtraCallback.getLocationOnScreen(iArr);
            return iArr[1] << this.onExtraCallback.getHeight();
        }
        int[] iArr2 = new int[2];
        this.onExtraCallback.getLocationOnScreen(iArr2);
        return iArr2[1] + this.onExtraCallback.getHeight();
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        WindowManager windowManager = (WindowManager) ((BaseTransientBar) objArr[0]).ICustomTabsCallback.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        int i3 = ICustomTabsCallback_Parcel + 101;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return Integer.valueOf(i2);
    }

    class onNavigationEvent extends GestureDetector.SimpleOnGestureListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        onNavigationEvent() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            int i = 2 % 2;
            if (BaseTransientBar.this.onTransact() == 0) {
                z = f2 > 0.0f && motionEvent2.getY() >= BaseTransientBar.this.onExtraCallback.IAuthTabCallback;
            } else {
                if (f2 < 0.0f) {
                    int i2 = onExtraCallback + 67;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (motionEvent2.getY() <= BaseTransientBar.this.onExtraCallback.IAuthTabCallback) {
                    }
                }
            }
            if (z) {
                int i4 = onExtraCallback + 15;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                BaseTransientBar.this.onWarmupCompleted(0);
                int i6 = onExtraCallback + 57;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return z;
        }
    }

    private void extraCallback() {
        int i = 2 % 2;
        this.onUnminimized = new safeSizeOf(this.onExtraCallback.getContext(), new onNavigationEvent());
        this.onExtraCallback.getChildAt(0).setOnTouchListener(new View.OnTouchListener() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.15
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            float onExtraCallbackWithResult = 0.0f;
            float onWarmupCompleted = 0.0f;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = 2 % 2;
                if (((safeSizeOf) BaseTransientBar.onWarmupCompleted(-2914068, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 2914069, new Object[]{BaseTransientBar.this}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent())).onExtraCallbackWithResult(motionEvent)) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.onExtraCallbackWithResult = motionEvent.getRawX();
                    this.onWarmupCompleted = motionEvent.getRawY();
                    SnackbarBaseLayout snackbarBaseLayout = BaseTransientBar.this.onExtraCallback;
                    if (snackbarBaseLayout.onExtraCallback == -1.0f && snackbarBaseLayout.IAuthTabCallback == -1.0f) {
                        int i3 = onNavigationEvent + 33;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        snackbarBaseLayout.onExtraCallback = snackbarBaseLayout.getTranslationX();
                        SnackbarBaseLayout snackbarBaseLayout2 = BaseTransientBar.this.onExtraCallback;
                        snackbarBaseLayout2.IAuthTabCallback = snackbarBaseLayout2.getTranslationY();
                    }
                    int i5 = onNavigationEvent + 41;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (action != 1) {
                    int i7 = onNavigationEvent + 87;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0 ? action != 2 : action != 2) {
                        return false;
                    }
                    setVersionCode.onExtraCallback().IAuthTabCallback(BaseTransientBar.this.onWarmupCompleted);
                    BaseTransientBar.this.onExtraCallback.setTranslationX((motionEvent.getRawX() - this.onExtraCallbackWithResult) / 10.0f);
                    BaseTransientBar.this.onExtraCallback.setTranslationY((motionEvent.getRawY() - this.onWarmupCompleted) / 10.0f);
                    return false;
                }
                setVersionCode.onExtraCallback().IAuthTabCallbackStub(BaseTransientBar.this.onWarmupCompleted);
                RallysKt.onWarmupCompleted(BaseTransientBar.this.onExtraCallback, isMuted.getInterfaceDescriptor(isMuted.IAuthTabCallback_Parcel((AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368), (Float) null, Float.valueOf(BaseTransientBar.this.onExtraCallback.onExtraCallback), new BaseTransientBar$6$.ExternalSyntheticLambda0()), (Float) null, Float.valueOf(BaseTransientBar.this.onExtraCallback.IAuthTabCallback), new BaseTransientBar$6$.ExternalSyntheticLambda1()), 1, getExtraParameters.Alternate, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, -1L, false).onWarmupCompleted(false);
                int scaledTouchSlop = ViewConfiguration.get(BaseTransientBar.this.onExtraCallback.getContext()).getScaledTouchSlop();
                float rawX = motionEvent.getRawX();
                float f = this.onExtraCallbackWithResult;
                float rawY = motionEvent.getRawY();
                float f2 = this.onWarmupCompleted;
                float f3 = scaledTouchSlop;
                if (Math.abs(rawX - f) <= f3) {
                    int i8 = onNavigationEvent + 35;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    if (Math.abs(rawY - f2) <= f3) {
                        return false;
                    }
                }
                return true;
            }

            public static /* synthetic */ Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 87;
                int i4 = i3 % 128;
                IAuthTabCallback = i4;
                if (i3 % 2 == 0) {
                    int i5 = 59 / 0;
                }
                int i6 = i4 + 95;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return null;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(attachAppLovinSdk attachapplovinsdk) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 31;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return null;
                }
                int i4 = 56 / 0;
                return null;
            }
        });
        int i2 = ICustomTabsCallback_Parcel + 93;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private int access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 37;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            View view = this.IAuthTabCallbackStub;
            if (view == null) {
                return 0;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i3 = iArr[1];
            int[] iArr2 = new int[2];
            this.ICustomTabsCallbackStubProxy.getLocationOnScreen(iArr2);
            int height = (iArr2[1] + this.ICustomTabsCallbackStubProxy.getHeight()) - i3;
            int i4 = ICustomTabsCallback_Parcel + 87;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            return height;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void onExtraCallbackWithResult() {
        int i = 2 % 2;
        this.onExtraCallback.post(new Runnable() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 47;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                BaseTransientBar.IAuthTabCallback(this.f$0);
                int i5 = IAuthTabCallback + 81;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ICustomTabsCallback_Parcel + 41;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BaseTransientBar baseTransientBar = (BaseTransientBar) objArr[0];
        int i = 2 % 2;
        if (baseTransientBar.onExtraCallback.getParent() != null) {
            int i2 = onRelationshipValidationResult + 109;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            baseTransientBar.onExtraCallback.setVisibility(0);
            int i4 = onRelationshipValidationResult + 29;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseTransientBar.onExtraCallback.onExtraCallback() != 1) {
            baseTransientBar.onActivityResized();
            return null;
        }
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onWarmupCompleted(-665101271, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 665101274, new Object[]{baseTransientBar}, iOnNavigationEvent);
        return null;
    }

    private void onTransact(int i) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 57;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0 ? this.onExtraCallback.onExtraCallback() != 1 : this.onExtraCallback.onExtraCallback() != 1) {
            asInterface(i);
            return;
        }
        int i4 = ICustomTabsCallback_Parcel + 109;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallbackStub(i);
        } else {
            IAuthTabCallbackStub(i);
            throw null;
        }
    }

    private void IAuthTabCallbackStub(final int i) {
        int i2 = 2 % 2;
        ValueAnimator valueAnimatorOnNavigationEvent = onNavigationEvent(1.0f, 0.0f);
        valueAnimatorOnNavigationEvent.setDuration(75L);
        valueAnimatorOnNavigationEvent.addListener(new AnimatorListenerAdapter() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.14
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                BaseTransientBar.this.onExtraCallbackWithResult(i);
                int i6 = onNavigationEvent + 19;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        valueAnimatorOnNavigationEvent.start();
        int i3 = ICustomTabsCallback_Parcel + 83;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
    }

    private ValueAnimator onNavigationEvent(float... fArr) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.12
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                BaseTransientBar.this.onExtraCallback.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                int i5 = onWarmupCompleted + 69;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 60 / 0;
                }
            }
        });
        int i2 = ICustomTabsCallback_Parcel + 111;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return valueAnimatorOfFloat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ValueAnimator onExtraCallback(float... fArr) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 75;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseTransientBar.this.onExtraCallback.setScaleX(fFloatValue);
                BaseTransientBar.this.onExtraCallback.setScaleY(fFloatValue);
                int i5 = onExtraCallback + 41;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 44 / 0;
                }
            }
        });
        int i2 = ICustomTabsCallback_Parcel + 79;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return valueAnimatorOfFloat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void onActivityResized() {
        int iWriteTypedObject;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 47;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            if (onTransact() == 0) {
                iWriteTypedObject = writeTypedObject();
            } else {
                iWriteTypedObject = -this.onExtraCallback.getMeasuredHeight();
            }
            if (IAuthTabCallbackDefault) {
                int i3 = onRelationshipValidationResult + 57;
                ICustomTabsCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    ViewCompat.IAuthTabCallback(this.onExtraCallback, iWriteTypedObject);
                    int i4 = 67 / 0;
                } else {
                    ViewCompat.IAuthTabCallback(this.onExtraCallback, iWriteTypedObject);
                }
            } else {
                this.onExtraCallback.setTranslationY(iWriteTypedObject);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(iWriteTypedObject, 0);
            valueAnimator.setInterpolator(this.IAuthTabCallback_Parcel);
            valueAnimator.setDuration(this.IAuthTabCallbackStubProxy);
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 1;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    BaseTransientBar.onExtraCallback(BaseTransientBar.this).animateContentIn(70, 180);
                    int i8 = onExtraCallback + 23;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 17;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        BaseTransientBar.this.getInterfaceDescriptor();
                        int i7 = 29 / 0;
                    } else {
                        BaseTransientBar.this.getInterfaceDescriptor();
                    }
                    int i8 = onExtraCallback + 21;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            });
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(iWriteTypedObject) { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.5
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ int IAuthTabCallback;
                private int onExtraCallback;

                {
                    this.IAuthTabCallback = iWriteTypedObject;
                    this.onExtraCallback = iWriteTypedObject;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    int i5 = 2 % 2;
                    int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    if (!(!BaseTransientBar.onNavigationEvent())) {
                        int i6 = onWarmupCompleted + 71;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        ViewCompat.IAuthTabCallback(BaseTransientBar.this.onExtraCallback, iIntValue - this.onExtraCallback);
                    } else {
                        BaseTransientBar.this.onExtraCallback.setTranslationY(iIntValue);
                        int i8 = onExtraCallbackWithResult + 125;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    this.onExtraCallback = iIntValue;
                    int i10 = onExtraCallbackWithResult + 23;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }
            });
            valueAnimator.start();
            return;
        }
        onTransact();
        throw null;
    }

    private void asInterface(final int i) {
        float y;
        int iWriteTypedObject;
        int i2 = 2 % 2;
        ValueAnimator valueAnimator = new ValueAnimator();
        if (onTransact() == 0) {
            int i3 = onRelationshipValidationResult + 81;
            ICustomTabsCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            y = this.onExtraCallback.getTranslationY();
        } else {
            y = this.onExtraCallback.getY();
        }
        int i5 = (int) y;
        int i6 = ICustomTabsCallback_Parcel + 35;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 != 0) {
            onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onTransact() == 0) {
            int i7 = ICustomTabsCallback_Parcel + 27;
            onRelationshipValidationResult = i7 % 128;
            int i8 = i7 % 2;
            iWriteTypedObject = writeTypedObject();
        } else {
            iWriteTypedObject = -writeTypedObject();
        }
        valueAnimator.setIntValues(i5, iWriteTypedObject);
        valueAnimator.setInterpolator(this.access000);
        valueAnimator.setDuration(this.getInterfaceDescriptor);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                BaseTransientBar.onExtraCallback(BaseTransientBar.this).animateContentOut(0, 180);
                int i12 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                BaseTransientBar.this.onExtraCallbackWithResult(i);
                int i12 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar.8
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            private int onExtraCallbackWithResult = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                SnackbarBaseLayout snackbarBaseLayout;
                int i9;
                int i10 = 2 % 2;
                int i11 = IAuthTabCallback + 57;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    if (!BaseTransientBar.onNavigationEvent()) {
                        BaseTransientBar.this.onExtraCallback.setTranslationY(iIntValue);
                    } else {
                        int i12 = IAuthTabCallback + 25;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 == 0) {
                            snackbarBaseLayout = BaseTransientBar.this.onExtraCallback;
                            i9 = iIntValue >>> this.onExtraCallbackWithResult;
                        } else {
                            snackbarBaseLayout = BaseTransientBar.this.onExtraCallback;
                            i9 = iIntValue - this.onExtraCallbackWithResult;
                        }
                        ViewCompat.IAuthTabCallback(snackbarBaseLayout, i9);
                    }
                    this.onExtraCallbackWithResult = iIntValue;
                    return;
                }
                ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                BaseTransientBar.onNavigationEvent();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        valueAnimator.start();
    }

    private int writeTypedObject() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 15;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int height = this.onExtraCallback.getHeight();
        ViewGroup.LayoutParams layoutParams = this.onExtraCallback.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        int i4 = ICustomTabsCallback_Parcel + 39;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return height;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r3.onExtraCallback.getVisibility() == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r1 = im.toss.uikit.widget.snackbar.BaseTransientBar.ICustomTabsCallback_Parcel + 113;
        im.toss.uikit.widget.snackbar.BaseTransientBar.onRelationshipValidationResult = r1 % 128;
        r1 = r1 % 2;
        onTransact(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r3.onExtraCallback.getVisibility() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        if (access000()) {
            int i3 = onRelationshipValidationResult + 53;
            ICustomTabsCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 31 / 0;
            }
        }
        onExtraCallbackWithResult(i);
        int i5 = onRelationshipValidationResult + 51;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
    }

    void getInterfaceDescriptor() {
        int i = 2 % 2;
        setVersionCode.onExtraCallback().onExtraCallbackWithResult(this.onWarmupCompleted);
        List<onExtraCallbackWithResult<B>> list = this.extraCallbackWithResult;
        if (list != null) {
            int i2 = onRelationshipValidationResult + 73;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            int i4 = onRelationshipValidationResult + 11;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            for (int size = list.size() - 1; size >= 0; size--) {
                this.extraCallbackWithResult.get(size).IAuthTabCallback();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v6 java.util.List<im.toss.uikit.widget.snackbar.BaseTransientBar$onExtraCallbackWithResult<B extends im.toss.uikit.widget.snackbar.BaseTransientBar<B>>>) = 
      (r1v5 java.util.List<im.toss.uikit.widget.snackbar.BaseTransientBar$onExtraCallbackWithResult<B extends im.toss.uikit.widget.snackbar.BaseTransientBar<B>>>)
      (r1v11 java.util.List<im.toss.uikit.widget.snackbar.BaseTransientBar$onExtraCallbackWithResult<B extends im.toss.uikit.widget.snackbar.BaseTransientBar<B>>>)
     binds: [B:8:0x002b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onExtraCallbackWithResult(int i) {
        List<onExtraCallbackWithResult<B>> list;
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 115;
        ICustomTabsCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            setVersionCode.onExtraCallback().onWarmupCompleted(this.onWarmupCompleted);
            list = this.extraCallbackWithResult;
            int i4 = 79 / 0;
            if (list != null) {
                int i5 = onRelationshipValidationResult + 33;
                ICustomTabsCallback_Parcel = i5 % 128;
                for (int size = i5 % 2 == 0 ? list.size() + 1 : list.size() - 1; size >= 0; size--) {
                    this.extraCallbackWithResult.get(size).onWarmupCompleted(i);
                }
            }
        } else {
            setVersionCode.onExtraCallback().onWarmupCompleted(this.onWarmupCompleted);
            list = this.extraCallbackWithResult;
            if (list != null) {
            }
        }
        ViewParent parent = this.onExtraCallback.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.onExtraCallback);
        }
    }

    boolean access000() {
        int i = 2 % 2;
        AccessibilityManager accessibilityManager = this.onTransact;
        if (accessibilityManager != null) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList == null) {
                return false;
            }
            int i2 = onRelationshipValidationResult + 7;
            ICustomTabsCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return enabledAccessibilityServiceList.isEmpty();
        }
        int i4 = ICustomTabsCallback_Parcel + 27;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static class SnackbarBaseLayout extends FrameLayout {
        private static int IAuthTabCallback_Parcel = 1;
        private static int access000 = 0;
        private static int access100 = 1;
        private static int getInterfaceDescriptor;
        private static final View.OnTouchListener onNavigationEvent = new View.OnTouchListener() { // from class: im.toss.uikit.widget.snackbar.BaseTransientBar$SnackbarBaseLayout$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 47;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnExtraCallback = BaseTransientBar.SnackbarBaseLayout.onExtraCallback(view, motionEvent);
                int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return zOnExtraCallback;
            }
        };
        float IAuthTabCallback;
        private final float IAuthTabCallbackDefault;
        private onWarmupCompleted IAuthTabCallbackStub;
        private IAuthTabCallback asBinder;
        private ColorStateList asInterface;
        float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private PorterDuff.Mode onTransact;
        private int onWarmupCompleted;

        static {
            int i = getInterfaceDescriptor + 55;
            IAuthTabCallback_Parcel = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ boolean onExtraCallback(View view, MotionEvent motionEvent) {
            int i = 2 % 2;
            int i2 = access000;
            int i3 = i2 + 51;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        protected SnackbarBaseLayout(@NonNull Context context) {
            this(context, null);
        }

        protected SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            super(MaterialThemeOverlay.wrap(context, attributeSet, 0, 0), attributeSet);
            this.onExtraCallback = -1.0f;
            this.IAuthTabCallback = -1.0f;
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.SnackbarLayout_elevation)) {
                ViewCompat.onExtraCallbackWithResult(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r1, 0));
                int i = 2 % 2;
            }
            this.onWarmupCompleted = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.SnackbarLayout_animationMode, 0);
            this.IAuthTabCallbackDefault = typedArrayObtainStyledAttributes.getFloat(com.google.android.material.R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setForegroundGravity(49);
            setBackgroundTintList(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.onExtraCallbackWithResult = typedArrayObtainStyledAttributes.getFloat(com.google.android.material.R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            if (getBackground() == null) {
                int i2 = access100 + 37;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                ViewCompat.onExtraCallbackWithResult(this, onExtraCallbackWithResult());
                int i4 = access000 + 3;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 2;
                } else {
                    int i6 = 2 % 2;
                }
            }
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            int i = 2 % 2;
            int i2 = access000 + 25;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            setBackgroundDrawable(drawable);
            int i4 = access100 + Imgproc.COLOR_YUV2RGBA_YVYU;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            int i = 2 % 2;
            int i2 = access100 + 103;
            int i3 = i2 % 128;
            access000 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (drawable != null && this.asInterface != null) {
                int i4 = i3 + 85;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    drawable = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable.mutate());
                    CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawable, this.asInterface);
                    CameraControllerExternalSyntheticLambda9.onExtraCallback(drawable, this.onTransact);
                    int i5 = 15 / 0;
                } else {
                    drawable = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable.mutate());
                    CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawable, this.asInterface);
                    CameraControllerExternalSyntheticLambda9.onExtraCallback(drawable, this.onTransact);
                }
            }
            super.setBackgroundDrawable(drawable);
            int i6 = access000 + 31;
            access100 = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            int i = 2 % 2;
            this.asInterface = colorStateList;
            if (getBackground() != null) {
                int i2 = access000 + 7;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                Drawable drawableIAuthTabCallbackStub = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(getBackground().mutate());
                CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawableIAuthTabCallbackStub, colorStateList);
                CameraControllerExternalSyntheticLambda9.onExtraCallback(drawableIAuthTabCallbackStub, this.onTransact);
                if (drawableIAuthTabCallbackStub != getBackground()) {
                    int i4 = access000 + 77;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    super.setBackgroundDrawable(drawableIAuthTabCallbackStub);
                    int i6 = access100 + 123;
                    access000 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            int i8 = access100 + 103;
            access000 = i8 % 128;
            int i9 = i8 % 2;
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            int i = 2 % 2;
            this.onTransact = mode;
            if (getBackground() != null) {
                int i2 = access100 + 13;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                Drawable drawableIAuthTabCallbackStub = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(getBackground().mutate());
                CameraControllerExternalSyntheticLambda9.onExtraCallback(drawableIAuthTabCallbackStub, mode);
                if (drawableIAuthTabCallbackStub != getBackground()) {
                    int i4 = access000 + 49;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    super.setBackgroundDrawable(drawableIAuthTabCallbackStub);
                    if (i5 == 0) {
                        throw null;
                    }
                    int i6 = access000 + 101;
                    access100 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = access000 + 47;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                onTouchListener.hashCode();
                throw null;
            }
            setOnTouchListener(onClickListener == null ? onNavigationEvent : null);
            super.setOnClickListener(onClickListener);
            int i3 = access000 + 51;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            super.onLayout(z, i, i2, i3, i4);
            onWarmupCompleted onwarmupcompleted = this.IAuthTabCallbackStub;
            if (onwarmupcompleted != null) {
                int i6 = access000 + 49;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                onwarmupcompleted.onLayoutChange(this, i, i2, i3, i4);
                if (i7 == 0) {
                    throw null;
                }
                int i8 = access000 + 47;
                access100 = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            int i = 2 % 2;
            int i2 = access100 + 65;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            super.onAttachedToWindow();
            IAuthTabCallback iAuthTabCallback = this.asBinder;
            if (iAuthTabCallback != null) {
                iAuthTabCallback.onNavigationEvent(this);
                int i4 = access100 + 97;
                access000 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 3;
                }
            }
            ViewCompat.extraCommand(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            int i = 2 % 2;
            super.onDetachedFromWindow();
            IAuthTabCallback iAuthTabCallback = this.asBinder;
            if (iAuthTabCallback != null) {
                int i2 = access000 + 111;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                iAuthTabCallback.IAuthTabCallback(this);
            }
            int i4 = access000 + 97;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }

        void onNavigationEvent(onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = access100 + 23;
            int i3 = i2 % 128;
            access000 = i3;
            int i4 = i2 % 2;
            this.IAuthTabCallbackStub = onwarmupcompleted;
            if (i4 != 0) {
                int i5 = 96 / 0;
            }
            int i6 = i3 + 55;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        void onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
            int i = 2 % 2;
            int i2 = access000 + 69;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            this.asBinder = iAuthTabCallback;
            if (i3 == 0) {
                throw null;
            }
        }

        int onExtraCallback() {
            int i = 2 % 2;
            int i2 = access100 + 57;
            int i3 = i2 % 128;
            access000 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = this.onWarmupCompleted;
            int i5 = i3 + 83;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            throw null;
        }

        void onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = access000;
            int i4 = i3 + 91;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            this.onWarmupCompleted = i;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i3 + 9;
            access100 = i6 % 128;
            int i7 = i6 % 2;
        }

        float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = access000 + 13;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            float f = this.IAuthTabCallbackDefault;
            int i4 = i3 + 109;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return f;
        }

        private Drawable onExtraCallbackWithResult() throws Resources.NotFoundException {
            int i = 2 % 2;
            float dimension = getResources().getDimension(com.google.android.material.R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(MaterialColors.layer(this, com.google.android.material.R.attr.colorSurface, com.google.android.material.R.attr.colorOnSurface, onNavigationEvent()));
            if (this.asInterface == null) {
                return CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(gradientDrawable);
            }
            int i2 = access000 + 87;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                CameraControllerExternalSyntheticLambda9.onWarmupCompleted(CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(gradientDrawable), this.asInterface);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Drawable drawableIAuthTabCallbackStub = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(gradientDrawable);
            CameraControllerExternalSyntheticLambda9.onWarmupCompleted(drawableIAuthTabCallbackStub, this.asInterface);
            int i3 = access100 + 53;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return drawableIAuthTabCallbackStub;
        }
    }

    public static /* synthetic */ WindowInsetsCompat onWarmupCompleted(BaseTransientBar baseTransientBar, View view, WindowInsetsCompat windowInsetsCompat) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (WindowInsetsCompat) onWarmupCompleted(-322501862, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 322501868, new Object[]{baseTransientBar, view, windowInsetsCompat}, iOnNavigationEvent);
    }

    static /* synthetic */ safeSizeOf asBinder(BaseTransientBar baseTransientBar) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (safeSizeOf) onWarmupCompleted(-2914068, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 2914069, new Object[]{baseTransientBar}, iOnNavigationEvent);
    }

    private int readTypedObject() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return ((Integer) onWarmupCompleted(1330466260, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1330466255, new Object[]{this}, iOnNavigationEvent)).intValue();
    }

    private /* synthetic */ void ICustomTabsCallback() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onWarmupCompleted(-507955446, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 507955450, new Object[]{this}, iOnNavigationEvent);
    }

    private /* synthetic */ void onExtraCallback(View view, int i, int i2, int i3, int i4) {
        onWarmupCompleted(668498335, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -668498333, new Object[]{this, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
    }

    private void onMinimized() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onWarmupCompleted(-665101271, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 665101274, new Object[]{this}, iOnNavigationEvent);
    }

    final void IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onWarmupCompleted(1137131574, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1137131574, new Object[]{this}, iOnNavigationEvent);
    }
}
