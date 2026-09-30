package o;

import android.app.Activity;
import android.os.Build;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getLastTrimMemoryLevel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackVideoEnd implements getLastTrimMemoryLevel {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<setCardBackgroundColor<String, Runnable>> onExtraCallbackWithResult = new ArrayList();

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = IAuthTabCallback + 13;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Inject
    public trackVideoEnd() {
    }

    @Override // o.getLastTrimMemoryLevel
    public void IAuthTabCallback(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        if (i == 1) {
            int i5 = onNavigationEvent + 17;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            onExtraCallback();
        }
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        for (setCardBackgroundColor<String, Runnable> setcardbackgroundcolor : this.onExtraCallbackWithResult) {
            Object obj = setcardbackgroundcolor.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(obj, "");
            if (onNavigationEvent((String) obj)) {
                Runnable runnable = (Runnable) setcardbackgroundcolor.onExtraCallbackWithResult;
                if (runnable != null) {
                    int i4 = onWarmupCompleted + 103;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        runnable.run();
                        throw null;
                    }
                    runnable.run();
                } else {
                    continue;
                }
            } else {
                getIconPaddingLeft geticonpaddingleft = getIconPaddingLeft.IAuthTabCallback;
                Object obj2 = setcardbackgroundcolor.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                geticonpaddingleft.onExtraCallbackWithResult(new getLastTrimMemoryLevel.onExtraCallback((String) obj2));
            }
        }
        this.onExtraCallbackWithResult.clear();
        IAuthTabCallbackDefault();
        int i5 = onNavigationEvent + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.getLastTrimMemoryLevel
    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 33) {
            return onNavigationEvent("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        int i4 = onNavigationEvent;
        int i5 = i4 + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 35;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent("android.permission.READ_PHONE_STATE");
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.getLastTrimMemoryLevel
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent("android.permission.READ_CONTACTS");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent("android.permission.READ_CONTACTS");
        int i3 = onNavigationEvent + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.getLastTrimMemoryLevel
    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent("android.permission.ACCESS_FINE_LOCATION");
        int i4 = onNavigationEvent + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.getLastTrimMemoryLevel
    public void onExtraCallback(@NotNull Activity activity, @NotNull String str, @NotNull Runnable runnable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(runnable, "");
            onNavigationEvent(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        if (onNavigationEvent(str)) {
            runnable.run();
            return;
        }
        onExtraCallback(activity, new String[]{str}, runnable);
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(Object obj, String[] strArr, Runnable runnable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = onWarmupCompleted + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                String str = strArr[i4];
                this.onExtraCallbackWithResult.iterator();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            String str2 = strArr[i4];
            Iterator<setCardBackgroundColor<String, Runnable>> it = this.onExtraCallbackWithResult.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.onExtraCallbackWithResult.add(new setCardBackgroundColor<>(str2, runnable));
                    break;
                }
                int i6 = onNavigationEvent + 117;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (Intrinsics.areEqual(it.next().onWarmupCompleted, str2)) {
                    int i8 = onNavigationEvent + 97;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 2 / 5;
                    }
                }
            }
        }
        if (obj instanceof Activity) {
            onWarmupCompleted((Activity) obj, strArr);
        } else if (obj instanceof Fragment) {
            int i10 = onNavigationEvent + 35;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            onExtraCallback((Fragment) obj, strArr);
        }
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(new getLastTrimMemoryLevel.IAuthTabCallback(onNavigationEvent()));
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(str);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
            if (ContextCompat.checkSelfPermission(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), str) == 0) {
                return true;
            }
        } else if (ContextCompat.checkSelfPermission(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), str) == 0) {
            return true;
        }
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final void onWarmupCompleted(Activity activity, String[] strArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (activity != null) {
            MediaCodecInfoReportIncorrectInfoQuirk.onExtraCallbackWithResult(activity, strArr, 1);
        }
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onExtraCallback(Fragment fragment, String[] strArr) {
        int i = 2 % 2;
        if (fragment != null) {
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            fragment.requestPermissions(strArr, 1);
            int i4 = onWarmupCompleted + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
