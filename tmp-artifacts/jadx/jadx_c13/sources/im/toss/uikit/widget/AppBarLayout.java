package im.toss.uikit.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.generateLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class AppBarLayout extends com.google.android.material.appbar.AppBarLayout {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int IAuthTabCallback = 8;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static {
        int i = onExtraCallback + 63;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(onNavigationEvent.onExtraCallbackWithResult(Companion, context), attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ViewCompat.onExtraCallbackWithResult(this, 0.0f);
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static final /* synthetic */ Context onExtraCallbackWithResult(onNavigationEvent onnavigationevent, Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Context contextOnWarmupCompleted = onnavigationevent.onWarmupCompleted(context);
            int i4 = IAuthTabCallback + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return contextOnWarmupCompleted;
        }

        private final Context onWarmupCompleted(Context context) {
            Context baseContext;
            ContextWrapper contextWrapper;
            int i = 2 % 2;
            Object obj = null;
            if (context instanceof Activity) {
                int i2 = IAuthTabCallback + 19;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                baseContext = (Activity) context;
            } else {
                baseContext = null;
            }
            if (baseContext == null) {
                if (context instanceof ContextWrapper) {
                    int i3 = onNavigationEvent + 69;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    contextWrapper = (ContextWrapper) context;
                } else {
                    contextWrapper = null;
                }
                baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            }
            if (baseContext != null) {
                int i5 = IAuthTabCallback + 57;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    boolean z = baseContext instanceof Activity;
                    obj.hashCode();
                    throw null;
                }
                if (baseContext instanceof Activity) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.appBarOverlay, typedValue, true);
                    return new ContextThemeWrapper(context, typedValue.resourceId);
                }
            }
            return ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() ? new ContextThemeWrapper(context, R.style.Night_White_AppBarOverlay) : new ContextThemeWrapper(context, R.style.Day_White_AppBarOverlay);
        }
    }
}
