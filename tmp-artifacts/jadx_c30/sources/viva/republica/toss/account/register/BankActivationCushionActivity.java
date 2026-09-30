package viva.republica.toss.account.register;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BankActivationCushionActivity extends BaseActivity {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);

    public long getScreenId() {
        return -1L;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bank_activation_cushion);
        findViewById(R.id.lottie_animation_view).addAnimatorListener(new IAuthTabCallback());
    }

    public static final class IAuthTabCallback extends AnimatorListenerAdapter {
        IAuthTabCallback() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, BuildConfig.FLAVOR);
            super.onAnimationEnd(animator);
            BankActivationCushionActivity.this.finish();
        }
    }

    public String getScreenName() {
        return "account_register__bank_activation_cushion";
    }

    public void onStart() {
        super.onStart();
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
