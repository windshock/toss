package o;

import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getSecondaryProgressColor<T> {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final drawPadding<T> IAuthTabCallback;
    private final String onNavigationEvent;
    private final TextRoundCornerProgressBarSavedState1 onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 53;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSecondaryProgressColor)) {
            int i2 = IAuthTabCallbackDefault + 41;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getSecondaryProgressColor getsecondaryprogresscolor = (getSecondaryProgressColor) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, getsecondaryprogresscolor.onWarmupCompleted)) {
            int i4 = IAuthTabCallbackDefault + 73;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, getsecondaryprogresscolor.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, getsecondaryprogresscolor.IAuthTabCallback)) {
            return true;
        }
        int i6 = asBinder + 37;
        IAuthTabCallbackDefault = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asBinder = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.onWarmupCompleted.hashCode() / 91) * this.onNavigationEvent.hashCode()) >> 82) >>> this.IAuthTabCallback.hashCode() : (((this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i3 = asBinder + 103;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public getSecondaryProgressColor(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull String str, @NotNull drawPadding<T> drawpadding) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(drawpadding, "");
        this.onWarmupCompleted = textRoundCornerProgressBarSavedState1;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = drawpadding;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = o.getSecondaryProgressColor.IAuthTabCallbackDefault + 15;
        o.getSecondaryProgressColor.asBinder = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T onNavigationEvent(T t) {
        T t2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            t2 = (T) this.onWarmupCompleted.onWarmupCompleted(this.onNavigationEvent, (drawPadding<drawPadding<T>>) this.IAuthTabCallback, (drawPadding<T>) t);
            int i3 = 95 / 0;
        } else {
            t2 = (T) this.onWarmupCompleted.onWarmupCompleted(this.onNavigationEvent, (drawPadding<drawPadding<T>>) this.IAuthTabCallback, (drawPadding<T>) t);
        }
    }

    public final T onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) this.onWarmupCompleted.onWarmupCompleted(this.onNavigationEvent, (drawPadding<drawPadding<T>>) this.IAuthTabCallback, (drawPadding<T>) null);
        int i4 = asBinder + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Preference(" + this.onNavigationEvent + ", " + this.IAuthTabCallback + ", " + this.onWarmupCompleted.onExtraCallback() + ")";
        int i2 = asBinder + 107;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 23 / 0;
        }
        return str;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
