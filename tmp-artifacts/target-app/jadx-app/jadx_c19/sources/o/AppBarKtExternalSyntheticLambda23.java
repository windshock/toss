package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import o.cancelNotification;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppBarKtExternalSyntheticLambda23 extends AppBarKtExternalSyntheticLambda24 {
    private final AppCompatActivity onNavigationEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarKtExternalSyntheticLambda23(@NotNull AppCompatActivity appCompatActivity, @NotNull AppBarKtExternalSyntheticLambda26 appBarKtExternalSyntheticLambda26) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(appBarKtExternalSyntheticLambda26, "");
        cancelNotification.onWarmupCompleted drawerToggleDelegate = appCompatActivity.getDrawerToggleDelegate();
        if (drawerToggleDelegate == null) {
            throw new IllegalStateException(("Activity " + appCompatActivity + " does not have a DrawerToggleDelegate set").toString());
        }
        Context contextOnNavigationEvent = drawerToggleDelegate.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(contextOnNavigationEvent, "");
        super(contextOnNavigationEvent, appBarKtExternalSyntheticLambda26);
        this.onNavigationEvent = appCompatActivity;
    }

    @Override // o.AppBarKtExternalSyntheticLambda24
    protected void onExtraCallback(@Nullable CharSequence charSequence) {
        IPostMessageServiceStubProxy supportActionBar = this.onNavigationEvent.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.onNavigationEvent + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        supportActionBar.onExtraCallbackWithResult(charSequence);
    }

    @Override // o.AppBarKtExternalSyntheticLambda24
    protected void onExtraCallback(@Nullable Drawable drawable, int i2) {
        IPostMessageServiceStubProxy supportActionBar = this.onNavigationEvent.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.onNavigationEvent + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        supportActionBar.onNavigationEvent(drawable != null);
        cancelNotification.onWarmupCompleted drawerToggleDelegate = this.onNavigationEvent.getDrawerToggleDelegate();
        if (drawerToggleDelegate == null) {
            throw new IllegalStateException(("Activity " + this.onNavigationEvent + " does not have a DrawerToggleDelegate set").toString());
        }
        drawerToggleDelegate.onNavigationEvent(drawable, i2);
    }
}
