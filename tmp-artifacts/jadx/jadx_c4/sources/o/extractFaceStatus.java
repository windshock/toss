package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import im.toss.core.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class extractFaceStatus {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private onExtraCallback onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private onExtraCallback onNavigationEvent;
    private final Context onWarmupCompleted;

    public void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(menuItem, "");
        int i4 = asInterface + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public extractFaceStatus(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = context;
        this.onExtraCallbackWithResult = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ extractFaceStatus(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = asInterface + 67;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 105;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        this(context, z);
    }

    public static final /* synthetic */ Context onExtraCallback(extractFaceStatus extractfacestatus) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Context context = extractfacestatus.onWarmupCompleted;
        int i5 = i3 + 45;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    public final class onExtraCallback {
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface;
        final /* synthetic */ extractFaceStatus IAuthTabCallback;
        private MenuItem.OnMenuItemClickListener onExtraCallback;
        private String onExtraCallbackWithResult;
        private String onNavigationEvent;
        private String onTransact;
        private String onWarmupCompleted;

        public onExtraCallback(@NotNull extractFaceStatus extractfacestatus, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.IAuthTabCallback = extractfacestatus;
            this.onExtraCallbackWithResult = str;
            this.onNavigationEvent = str2;
            this.onTransact = str3;
            this.onWarmupCompleted = str4;
            this.onExtraCallback = onMenuItemClickListener;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 31;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i3 + 109;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 21;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 119;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 97;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onTransact;
            int i5 = i2 + 39;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 95;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public final MenuItem.OnMenuItemClickListener onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 23;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 31 / 0;
            }
            return onMenuItemClickListener;
        }

        public final boolean IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = asInterface + 43;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (this.onExtraCallbackWithResult.length() > 0 || this.onTransact.length() > 0) {
                return true;
            }
            int i4 = IAuthTabCallbackStub + 41;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallback(@NotNull MenuInflater menuInflater, @NotNull Menu menu) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuInflater, "");
        Intrinsics.checkNotNullParameter(menu, "");
        menuInflater.inflate(R.menu.menu_lab, menu);
        onExtraCallback onextracallback = this.onNavigationEvent;
        int i2 = R.id.accessory_button;
        boolean z2 = false;
        if (this.onExtraCallbackWithResult && onextracallback != null) {
            int i3 = asInterface + 99;
            IAuthTabCallback = i3 % 128;
            z = i3 % 2 == 0 ? onextracallback.IAuthTabCallbackDefault() : !onextracallback.IAuthTabCallbackDefault();
        }
        onNavigationEvent(menu, onextracallback, i2, z);
        onExtraCallback onextracallback2 = this.onExtraCallback;
        int i4 = R.id.secondary_button;
        if (this.onExtraCallbackWithResult && onextracallback2 != null && onextracallback2.IAuthTabCallbackDefault()) {
            int i5 = IAuthTabCallback + 95;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                z2 = true;
            }
        }
        onNavigationEvent(menu, onextracallback2, i4, z2);
        return true;
    }

    public static final class onWarmupCompleted implements ReusableRememberObserverHolder {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ MenuItem onExtraCallbackWithResult;
        final /* synthetic */ onExtraCallback onNavigationEvent;
        final /* synthetic */ extractFaceStatus onWarmupCompleted;

        onWarmupCompleted(MenuItem menuItem, onExtraCallback onextracallback, extractFaceStatus extractfacestatus) {
            this.onExtraCallbackWithResult = menuItem;
            this.onNavigationEvent = onextracallback;
            this.onWarmupCompleted = extractfacestatus;
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.setIcon((Drawable) null);
            } else {
                this.onExtraCallbackWithResult.setIcon((Drawable) null);
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            onExtraCallback onextracallback = this.onNavigationEvent;
            String strOnNavigationEvent = null;
            if (onextracallback != null) {
                int i2 = onExtraCallback + 119;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    onextracallback.onNavigationEvent();
                    strOnNavigationEvent.hashCode();
                    throw null;
                }
                strOnNavigationEvent = onextracallback.onNavigationEvent();
            }
            Resources resources = extractFaceStatus.onExtraCallback(this.onWarmupCompleted).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Drawable drawableOnWarmupCompleted = CarouselPagerStateExternalSyntheticLambda1.onWarmupCompleted(carouselKtExternalSyntheticLambda7, resources);
            if (strOnNavigationEvent != null) {
                int i3 = onExtraCallback + 59;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (strOnNavigationEvent.length() > 0) {
                    Resources resources2 = extractFaceStatus.onExtraCallback(this.onWarmupCompleted).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "");
                    drawableOnWarmupCompleted.setColorFilter(new PorterDuffColorFilter(setBodyokhttp.IAuthTabCallback(resources2, strOnNavigationEvent, 0), PorterDuff.Mode.SRC_IN));
                } else {
                    Drawable icon = this.onExtraCallbackWithResult.getIcon();
                    if (icon != null) {
                        icon.clearColorFilter();
                    }
                }
            }
            this.onExtraCallbackWithResult.setIcon(drawableOnWarmupCompleted);
        }
    }

    private final void onNavigationEvent(Menu menu, onExtraCallback onextracallback, int i, boolean z) {
        String strOnExtraCallback;
        String strOnWarmupCompleted;
        MenuItem.OnMenuItemClickListener onMenuItemClickListenerOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        Float fValueOf = Float.valueOf(24.0f);
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem != null) {
            if (onextracallback != null) {
                int i3 = asInterface + 79;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                strOnExtraCallback = onextracallback.onExtraCallback();
            } else {
                strOnExtraCallback = null;
            }
            if (strOnExtraCallback == null || strOnExtraCallback.length() == 0) {
                menuItemFindItem.setIcon((Drawable) null);
            } else {
                int i5 = IAuthTabCallback + 69;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                String strOnExtraCallback2 = onextracallback != null ? onextracallback.onExtraCallback() : null;
                CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(this.onWarmupCompleted);
                RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(this.onWarmupCompleted).onExtraCallback(strOnExtraCallback2);
                DisplayMetrics displayMetrics = this.onWarmupCompleted.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
                DisplayMetrics displayMetrics2 = this.onWarmupCompleted.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(onnavigationeventOnExtraCallback.onExtraCallback(iOnNavigationEvent, varyMatches.onNavigationEvent(fValueOf, displayMetrics2)).IAuthTabCallback(new onWarmupCompleted(menuItemFindItem, onextracallback, this)).onExtraCallbackWithResult());
            }
            if (onextracallback != null) {
                int i6 = asInterface + 107;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                strOnWarmupCompleted = onextracallback.onWarmupCompleted();
            } else {
                strOnWarmupCompleted = null;
            }
            put.onNavigationEvent(menuItemFindItem, strOnWarmupCompleted);
            menuItemFindItem.setShowAsAction(2);
            if (onextracallback != null) {
                int i8 = IAuthTabCallback + 115;
                asInterface = i8 % 128;
                if (i8 % 2 == 0) {
                    onMenuItemClickListenerOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
                    int i9 = 72 / 0;
                } else {
                    onMenuItemClickListenerOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
                }
            } else {
                onMenuItemClickListenerOnExtraCallbackWithResult = null;
            }
            menuItemFindItem.setOnMenuItemClickListener(onMenuItemClickListenerOnExtraCallbackWithResult);
            menuItemFindItem.setTitle(onextracallback != null ? onextracallback.IAuthTabCallback() : null);
        }
        menu.findItem(i).setVisible(z);
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = true;
        this.onNavigationEvent = new onExtraCallback(this, str, str2, str3 == null ? "" : str3, str4, onMenuItemClickListener);
        AppCompatActivity appCompatActivity = null;
        this.onExtraCallback = null;
        AppCompatActivity appCompatActivity2 = this.onWarmupCompleted;
        if (appCompatActivity2 instanceof AppCompatActivity) {
            int i2 = IAuthTabCallback + 37;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                appCompatActivity.hashCode();
                throw null;
            }
            appCompatActivity = appCompatActivity2;
        }
        if (appCompatActivity != null) {
            int i3 = IAuthTabCallback + 1;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            appCompatActivity.invalidateOptionsMenu();
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener2) {
        AppCompatActivity appCompatActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallbackWithResult = true;
        this.onNavigationEvent = new onExtraCallback(this, str, str3, "", str5, onMenuItemClickListener);
        this.onExtraCallback = new onExtraCallback(this, str2, str4, "", str5, onMenuItemClickListener2);
        AppCompatActivity appCompatActivity2 = this.onWarmupCompleted;
        Object obj = null;
        if (!(!(appCompatActivity2 instanceof AppCompatActivity))) {
            int i2 = IAuthTabCallback + 91;
            asInterface = i2 % 128;
            appCompatActivity = appCompatActivity2;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null) {
            int i3 = IAuthTabCallback + 87;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            appCompatActivity.invalidateOptionsMenu();
            if (i4 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 android.content.Context) = (r1v5 android.content.Context), (r1v13 android.content.Context) binds: [B:10:0x0023, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback() {
        Context context;
        AppCompatActivity appCompatActivity;
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult) {
            int i2 = asInterface + 87;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult = false;
                context = this.onWarmupCompleted;
                appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            } else {
                this.onExtraCallbackWithResult = false;
                context = this.onWarmupCompleted;
                if (!(context instanceof AppCompatActivity)) {
                }
            }
            if (appCompatActivity != null) {
                appCompatActivity.invalidateOptionsMenu();
                int i3 = asInterface + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }
}
