package run.granite;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DefaultErrorView extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultErrorView(@NotNull Context context, @NotNull Throwable th) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(th, "");
        setBackgroundColor(-1);
        ScrollView scrollView = new ScrollView(context);
        TextView textView = new TextView(context);
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to load React Native bundle");
        sb.append('\n');
        sb.append('\n');
        String message = th.getMessage();
        sb.append("Error: " + (message == null ? th.getClass().getSimpleName() : message));
        sb.append('\n');
        textView.setText(sb.toString());
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.rgb(220, 38, 38));
        textView.setPadding(32, 32, 32, 32);
        scrollView.addView(textView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.setMargins(16, 16, 16, 16);
        addView(scrollView, layoutParams);
    }
}
