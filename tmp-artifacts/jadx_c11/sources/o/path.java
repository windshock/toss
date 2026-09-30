package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class path {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final persistent IAuthTabCallback;
    private final parseMaxAge asInterface;
    private final parseExpires onExtraCallback;
    private final CookieCompanion onExtraCallbackWithResult;
    private final accesspathMatch onNavigationEvent;
    private final accessdomainMatch onWarmupCompleted;

    public final parseMaxAge IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 95;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        parseMaxAge parsemaxage = this.asInterface;
        int i4 = i2 + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return parsemaxage;
        }
        throw null;
    }

    public final persistent IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 113;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof path)) {
            return false;
        }
        path pathVar = (path) obj;
        if (!Intrinsics.areEqual(this.asInterface, pathVar.asInterface)) {
            int i4 = onTransact + 105;
            IAuthTabCallbackStub = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, pathVar.onNavigationEvent)) {
            int i5 = onTransact + 53;
            IAuthTabCallbackStub = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, pathVar.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onExtraCallback, pathVar.onExtraCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, pathVar.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, pathVar.IAuthTabCallback)) {
            return true;
        }
        int i6 = onTransact + 105;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.asInterface.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = IAuthTabCallbackStub + 97;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final parseExpires onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 91;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        parseExpires parseexpires = this.onExtraCallback;
        int i5 = i2 + 99;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return parseexpires;
        }
        throw null;
    }

    public final accesspathMatch onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        accesspathMatch accesspathmatch = this.onNavigationEvent;
        int i5 = i3 + 57;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return accesspathmatch;
    }

    public final CookieCompanion onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final accessdomainMatch onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EffectsHolder(preProcess=" + this.asInterface + ", blurEffect=" + this.onNavigationEvent + ", customShaderEffect=" + this.onExtraCallbackWithResult + ", noiseEffect=" + this.onExtraCallback + ", maskEffect=" + this.onWarmupCompleted + ", blendEffect=" + this.IAuthTabCallback + ")";
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public path(@NotNull parseMaxAge parsemaxage, @NotNull accesspathMatch accesspathmatch, @NotNull CookieCompanion cookieCompanion, @NotNull parseExpires parseexpires, @NotNull accessdomainMatch accessdomainmatch, @NotNull persistent persistentVar) {
        Intrinsics.checkNotNullParameter(parsemaxage, "");
        Intrinsics.checkNotNullParameter(accesspathmatch, "");
        Intrinsics.checkNotNullParameter(cookieCompanion, "");
        Intrinsics.checkNotNullParameter(parseexpires, "");
        Intrinsics.checkNotNullParameter(accessdomainmatch, "");
        Intrinsics.checkNotNullParameter(persistentVar, "");
        this.asInterface = parsemaxage;
        this.onNavigationEvent = accesspathmatch;
        this.onExtraCallbackWithResult = cookieCompanion;
        this.onExtraCallback = parseexpires;
        this.onWarmupCompleted = accessdomainmatch;
        this.IAuthTabCallback = persistentVar;
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.onNavigationEvent();
        this.onExtraCallbackWithResult.IAuthTabCallback();
        this.onExtraCallback.onNavigationEvent();
        this.onWarmupCompleted.onNavigationEvent();
        int i4 = onTransact + 29;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
