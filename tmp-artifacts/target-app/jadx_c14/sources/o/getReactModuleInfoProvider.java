package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getReactModuleInfoProvider {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final getNativeModuleIteratorReactAndroid_release cardDesign;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return !((obj instanceof getReactModuleInfoProvider) ^ true) && this.cardDesign == ((getReactModuleInfoProvider) obj).cardDesign;
        }
        int i5 = i3 + 113;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 93;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 78 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.cardDesign.hashCode();
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardStyleRequest(cardDesign=" + this.cardDesign + ")";
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getReactModuleInfoProvider(@NotNull getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release) {
        Intrinsics.checkNotNullParameter(getnativemoduleiteratorreactandroid_release, "");
        this.cardDesign = getnativemoduleiteratorreactandroid_release;
    }
}
