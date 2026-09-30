package im.toss.core.webkit;

import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.drawFocusCircle;
import o.setTopGuideFontStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class GenericWebView extends TossCoreWebView {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final List<String> onNavigationEvent;

    protected Void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // im.toss.core.webkit.TossBridgeWebView
    public /* synthetic */ drawFocusCircle onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        drawFocusCircle drawfocuscircle = (drawFocusCircle) onWarmupCompleted();
        int i3 = onExtraCallbackWithResult + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return drawfocuscircle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = CollectionsKt.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = CollectionsKt.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = CollectionsKt.emptyList();
    }

    @Override // im.toss.core.webkit.TossBridgeWebView
    public List<String> onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.onNavigationEvent;
        int i4 = i2 + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.toss.core.webkit.TossBridgeWebView
    public List<setTopGuideFontStyle> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return CollectionsKt.emptyList();
        }
        CollectionsKt.emptyList();
        throw null;
    }

    @Override // im.toss.core.webkit.TossBridgeWebView
    protected String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return "light";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
