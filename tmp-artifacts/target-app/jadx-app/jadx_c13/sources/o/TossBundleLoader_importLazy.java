package o;

import android.text.Layout;
import android.text.StaticLayout;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossBundleLoader_importLazy {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final TossBundleLoader_importLazy onWarmupCompleted = new TossBundleLoader_importLazy();

    static {
        int i = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private TossBundleLoader_importLazy() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return onExtraCallbackWithResult(r5, r7, r6).getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (kotlin.text.StringsKt__StringsKt.isBlank(r5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((!kotlin.text.StringsKt__StringsKt.isBlank(r5)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r5 = o.TossBundleLoader_importLazy.onExtraCallback + 67;
        o.TossBundleLoader_importLazy.onNavigationEvent = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onNavigationEvent(@NotNull CharSequence charSequence, int i, @NotNull BaseTextView baseTextView) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(baseTextView, "");
            int i4 = 10 / 0;
        } else {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(baseTextView, "");
        }
    }

    public final int onExtraCallbackWithResult(@NotNull CharSequence charSequence, int i, @NotNull BaseTextView baseTextView) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(baseTextView, "");
        if (!StringsKt__StringsKt.isBlank(charSequence)) {
            return onExtraCallbackWithResult(charSequence, baseTextView, i).getLineCount();
        }
        int i3 = onExtraCallback + 91;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2 == 0 ? 1 : 0;
        int i6 = i4 + 77;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
        return i5;
    }

    private final StaticLayout onExtraCallbackWithResult(CharSequence charSequence, BaseTextView baseTextView, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i < 0) {
            int i5 = i4 + 61;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), baseTextView.getPaint(), i).setIncludePad(baseTextView.getIncludeFontPadding()).setLineSpacing(baseTextView.getLineSpacingExtra(), baseTextView.getLineSpacingMultiplier()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setBreakStrategy(baseTextView.getBreakStrategy()).setHyphenationFrequency(baseTextView.getHyphenationFrequency()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        int i7 = onExtraCallback + 57;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return staticLayoutBuild;
    }
}
