package run.granite;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DefaultLoadingView extends FrameLayout {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLoadingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setBackgroundColor(-1);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(progressBar, layoutParams);
        TextView textView = new TextView(context);
        textView.setText("Loading...");
        textView.setTextSize(16.0f);
        textView.setTextColor(-7829368);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = 120;
        addView(textView, layoutParams2);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
