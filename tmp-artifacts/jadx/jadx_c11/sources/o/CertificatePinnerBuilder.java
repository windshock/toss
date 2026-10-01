package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.style.MetricAffectingSpan;
import android.widget.EditText;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CertificatePinnerBuilder extends MetricAffectingSpan {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Typeface onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public CertificatePinnerBuilder(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        this.onWarmupCompleted = typeface;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setTypeface(this.onWarmupCompleted);
        } else {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setTypeface(this.onWarmupCompleted);
            throw null;
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textPaint, "");
        textPaint.setTypeface(this.onWarmupCompleted);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final CharSequence onNavigationEvent(@NotNull Context context, @Nullable CharSequence charSequence) {
            Typeface typefaceOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            if (charSequence == null) {
                return null;
            }
            List<IntRange> listOnWarmupCompleted = CacheCacheResponseBody1.onNavigationEvent.onWarmupCompleted(charSequence);
            if (listOnWarmupCompleted.isEmpty() || (typefaceOnNavigationEvent = CacheRealCacheRequest1.onExtraCallback.onNavigationEvent(context)) == null) {
                int i4 = onWarmupCompleted + 93;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return charSequence;
            }
            SpannableString spannableString = new SpannableString(charSequence);
            Object[] spans = spannableString.getSpans(0, spannableString.length(), CertificatePinnerBuilder.class);
            Intrinsics.checkNotNullExpressionValue(spans, "");
            for (CertificatePinnerBuilder certificatePinnerBuilder : (CertificatePinnerBuilder[]) spans) {
                spannableString.removeSpan(certificatePinnerBuilder);
            }
            for (IntRange intRange : listOnWarmupCompleted) {
                spannableString.setSpan(new CertificatePinnerBuilder(typefaceOnNavigationEvent), intRange.getFirst(), intRange.getLast() + 1, 33);
            }
            int i6 = IAuthTabCallback + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return spannableString;
        }

        public static final class onExtraCallbackWithResult implements TextWatcher {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ EditText onNavigationEvent;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }

            onExtraCallbackWithResult(EditText editText) {
                this.onNavigationEvent = editText;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int i = 2 % 2;
                if (editable != null) {
                    int i2 = IAuthTabCallback + 75;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    EditText editText = this.onNavigationEvent;
                    onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
                    Context context = editText.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    onwarmupcompleted.onExtraCallback(context, editable);
                }
                int i4 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final void onNavigationEvent(@NotNull EditText editText) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(editText, "");
                editText.getEditableText();
                throw null;
            }
            Intrinsics.checkNotNullParameter(editText, "");
            Editable editableText = editText.getEditableText();
            if (editableText != null) {
                onWarmupCompleted onwarmupcompleted = CertificatePinnerBuilder.Companion;
                Context context = editText.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                onwarmupcompleted.onExtraCallback(context, editableText);
            }
            editText.addTextChangedListener(new onExtraCallbackWithResult(editText));
            int i3 = onWarmupCompleted + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }

        public final void onExtraCallback(@NotNull Context context, @NotNull Editable editable) {
            Typeface typefaceOnNavigationEvent;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(editable, "");
            List<IntRange> listOnWarmupCompleted = CacheCacheResponseBody1.onNavigationEvent.onWarmupCompleted(editable);
            if (listOnWarmupCompleted.isEmpty()) {
                int i2 = onWarmupCompleted + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                if (!onExtraCallback(editable)) {
                    return;
                }
            }
            CertificatePinnerBuilder[] certificatePinnerBuilderArr = (CertificatePinnerBuilder[]) editable.getSpans(0, editable.length(), CertificatePinnerBuilder.class);
            Intrinsics.checkNotNull(certificatePinnerBuilderArr);
            for (CertificatePinnerBuilder certificatePinnerBuilder : certificatePinnerBuilderArr) {
                editable.removeSpan(certificatePinnerBuilder);
            }
            if (!(!listOnWarmupCompleted.isEmpty()) || (typefaceOnNavigationEvent = CacheRealCacheRequest1.onExtraCallback.onNavigationEvent(context)) == null) {
                return;
            }
            int i4 = IAuthTabCallback + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            for (IntRange intRange : listOnWarmupCompleted) {
                editable.setSpan(new CertificatePinnerBuilder(typefaceOnNavigationEvent), intRange.getFirst(), intRange.getLast() + 1, 33);
            }
        }

        private final boolean onExtraCallback(Editable editable) {
            int i = 2 % 2;
            if (editable.nextSpanTransition(-1, editable.length(), CertificatePinnerBuilder.class) < editable.length()) {
                int i2 = IAuthTabCallback + 91;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = IAuthTabCallback + 107;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
    }
}
