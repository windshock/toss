package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.saveFromResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class toStringokhttp {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onTransact;
    private final List<CookieJar> onNavigationEvent;
    private final CookieBuilder onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = IAuthTabCallback + 31;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 75;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 97;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof toStringokhttp)) {
            int i7 = i2 + 125;
            onTransact = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, ((toStringokhttp) obj).onNavigationEvent)) {
            int i8 = onTransact + 125;
            IAuthTabCallbackStub = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.onWarmupCompleted, r6.onWarmupCompleted))) {
            return true;
        }
        int i9 = IAuthTabCallbackStub + 93;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        int i4 = IAuthTabCallbackStub + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BlurContext(layerSpecs=" + this.onNavigationEvent + ", shaderProgram=" + this.onWarmupCompleted + ")";
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public toStringokhttp(@NotNull List<CookieJar> list, @NotNull CookieBuilder cookieBuilder) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(cookieBuilder, "");
        this.onNavigationEvent = list;
        this.onWarmupCompleted = cookieBuilder;
    }

    public final List<CookieJar> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 21;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<CookieJar> list = this.onNavigationEvent;
        int i4 = i2 + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final CookieBuilder IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final toStringokhttp onWarmupCompleted(@NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar, long j) {
            long jOnNavigationEvent;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
            Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
            CookieJar cookieJar = new CookieJar(j, saveFromResponse.onNavigationEvent.onNavigationEvent(saveFromResponse.Companion, pathMatch.RGBA8, false, false, 6, null), 0, 4, null);
            long jOnNavigationEvent2 = httpOnly.onNavigationEvent(domainMatch.onExtraCallback(j, 0.67f));
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            long j2 = jOnNavigationEvent2;
            int i2 = 0;
            while (i2 < 101) {
                int i3 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    listCreateListBuilder.add(CookieJar.onExtraCallback(cookieJar, j2, null, 0, 17, null));
                    jOnNavigationEvent = httpOnly.onNavigationEvent(domainMatch.onExtraCallback(j2, 0.67f));
                    i2 += 94;
                } else {
                    listCreateListBuilder.add(CookieJar.onExtraCallback(cookieJar, j2, null, 0, 6, null));
                    jOnNavigationEvent = httpOnly.onNavigationEvent(domainMatch.onExtraCallback(j2, 0.67f));
                    i2++;
                }
                j2 = jOnNavigationEvent;
                int i4 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return new toStringokhttp(CollectionsKt.build(listCreateListBuilder), new CookieBuilder(deprecated_hostonly, deprecated_persistentVar));
        }
    }
}
