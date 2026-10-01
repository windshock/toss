package o;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class CacheControlCompanion {
    public static final CacheControlCompanion IAuthTabCallback = new CacheControlCompanion();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 9;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 97 / 0;
        }
    }

    public static final class onExtraCallback<T> implements Comparator {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ SpannableStringBuilder onExtraCallbackWithResult;

        public onExtraCallback(SpannableStringBuilder spannableStringBuilder) {
            this.onExtraCallbackWithResult = spannableStringBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(this.onExtraCallbackWithResult.getSpanStart((CertificatePinnerPin) t)), Integer.valueOf(this.onExtraCallbackWithResult.getSpanStart((CertificatePinnerPin) t2)));
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iIAuthTabCallback;
            }
            throw null;
        }
    }

    private CacheControlCompanion() {
    }

    public final Spannable onExtraCallbackWithResult(@NotNull Spanned spanned) {
        SpannableStringBuilder spannableStringBuilder;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(spanned, "");
        if (spanned instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) spanned;
            int i2 = onWarmupCompleted + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spanned);
            int i4 = onWarmupCompleted + 45;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            spannableStringBuilder = spannableStringBuilder2;
        }
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CertificatePinnerPin.class);
        Intrinsics.checkNotNullExpressionValue(spans, "");
        List<CertificatePinnerPin> listSortedWith = ArraysKt.sortedWith(spans, new onExtraCallback(spannableStringBuilder));
        if (listSortedWith.size() >= 2) {
            int i6 = onWarmupCompleted + 15;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                onWarmupCompleted(spannableStringBuilder, listSortedWith).iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Iterator<T> it = onWarmupCompleted(spannableStringBuilder, listSortedWith).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                IAuthTabCallback.onExtraCallbackWithResult(spannableStringBuilder, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            }
        }
        return spannableStringBuilder;
    }

    private final List<Pair<Integer, Integer>> onWarmupCompleted(Spannable spannable, List<CertificatePinnerPin> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < size) {
            CertificatePinnerPin certificatePinnerPin = list.get(i2);
            int spanStart = spannable.getSpanStart(certificatePinnerPin);
            int spanEnd = spannable.getSpanEnd(certificatePinnerPin);
            if (i3 != -1) {
                CertificatePinnerPin certificatePinnerPin2 = list.get(i2 - 1);
                if (!onExtraCallback(spannable.getSpanEnd(certificatePinnerPin2), spanStart, certificatePinnerPin2, certificatePinnerPin)) {
                    if (onNavigationEvent(spannable, i3, i4)) {
                        int i5 = onWarmupCompleted + 5;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 == 0) {
                            arrayList.add(getWrite.IAuthTabCallback(Integer.valueOf(i3), Integer.valueOf(i4)));
                            int i6 = 96 / 0;
                        } else {
                            arrayList.add(getWrite.IAuthTabCallback(Integer.valueOf(i3), Integer.valueOf(i4)));
                        }
                    }
                    i3 = spanStart;
                }
            } else {
                i3 = spanStart;
            }
            i2++;
            i4 = spanEnd;
        }
        if (i3 != -1 && onNavigationEvent(spannable, i3, i4)) {
            int i7 = onNavigationEvent + 73;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                arrayList.add(getWrite.IAuthTabCallback(Integer.valueOf(i3), Integer.valueOf(i4)));
                int i8 = 99 / 0;
            } else {
                arrayList.add(getWrite.IAuthTabCallback(Integer.valueOf(i3), Integer.valueOf(i4)));
            }
        }
        int i9 = onNavigationEvent + 121;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return arrayList;
    }

    private final boolean onNavigationEvent(Spannable spannable, int i, int i2) {
        int i3 = 2 % 2;
        int length = ((CertificatePinnerPin[]) spannable.getSpans(i, i2, CertificatePinnerPin.class)).length;
        Object obj = null;
        if (length > 1) {
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i5 = onNavigationEvent + 117;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(Spannable spannable, int i, int i2) {
        int i3 = 2 % 2;
        CertificatePinnercheck1[] certificatePinnercheck1Arr = (CertificatePinnercheck1[]) spannable.getSpans(0, spannable.length(), CertificatePinnercheck1.class);
        Intrinsics.checkNotNull(certificatePinnercheck1Arr);
        int length = certificatePinnercheck1Arr.length;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i4 >= length) {
                int i5 = onWarmupCompleted + 13;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i6 = onWarmupCompleted + 63;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            CertificatePinnercheck1 certificatePinnercheck1 = certificatePinnercheck1Arr[i4];
            int spanStart = spannable.getSpanStart(certificatePinnercheck1);
            int spanEnd = spannable.getSpanEnd(certificatePinnercheck1);
            if (spanStart >= i) {
                int i8 = onNavigationEvent + 79;
                int i9 = i8 % 128;
                onWarmupCompleted = i9;
                if (i8 % 2 != 0) {
                    int i10 = 2 / 0;
                    if (spanEnd < i2) {
                        int i11 = i9 + 17;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        spannable.removeSpan(certificatePinnercheck1);
                        if (i12 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                    } else {
                        continue;
                    }
                } else if (spanEnd >= i2) {
                    continue;
                }
            }
            i4++;
        }
    }

    private final boolean onExtraCallback(int i, int i2, CertificatePinnerPin certificatePinnerPin, CertificatePinnerPin certificatePinnerPin2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        boolean z = i2 <= i + 2;
        boolean z2 = certificatePinnerPin.IAuthTabCallback() == certificatePinnerPin2.IAuthTabCallback();
        if (!z || !z2) {
            return false;
        }
        int i6 = onNavigationEvent + 33;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
