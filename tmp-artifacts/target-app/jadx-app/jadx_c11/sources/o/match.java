package o;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class match {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private final List<Integer> IAuthTabCallback;
    private final Object onExtraCallback;
    private final getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final JsonUtils onWarmupCompleted;

    public static /* synthetic */ match onExtraCallback(match matchVar, Object obj, getMemoryMappingsOrBuilder getmemorymappingsorbuilder, List list, JsonUtils jsonUtils, boolean z, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallbackDefault + 55;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            obj = matchVar.onExtraCallback;
        }
        Object obj3 = obj;
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallbackDefault + 89;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            getmemorymappingsorbuilder = matchVar.onExtraCallbackWithResult;
        }
        getMemoryMappingsOrBuilder getmemorymappingsorbuilder2 = getmemorymappingsorbuilder;
        if ((i & 4) != 0) {
            int i7 = asInterface + 89;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            list = matchVar.IAuthTabCallback;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            jsonUtils = matchVar.onWarmupCompleted;
        }
        JsonUtils jsonUtils2 = jsonUtils;
        if ((i & 16) != 0) {
            z = matchVar.onNavigationEvent;
        }
        return matchVar.IAuthTabCallback(obj3, getmemorymappingsorbuilder2, list2, jsonUtils2, z);
    }

    public final match IAuthTabCallback(@Nullable Object obj, @NotNull getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder, @NotNull List<Integer> list, @Nullable JsonUtils jsonUtils, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        Intrinsics.checkNotNullParameter(list, "");
        match matchVar = new match(obj, getmemorymappingsorbuilder, list, jsonUtils, z);
        int i2 = asInterface + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return matchVar;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof match)) {
            return false;
        }
        match matchVar = (match) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, matchVar.onExtraCallback)) {
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 51;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, matchVar.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, matchVar.IAuthTabCallback)) {
            int i6 = IAuthTabCallbackDefault + 27;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.onWarmupCompleted, matchVar.onWarmupCompleted)) || this.onNavigationEvent != matchVar.onNavigationEvent) {
            return false;
        }
        int i8 = IAuthTabCallbackDefault + 119;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        Object obj;
        int iHashCode;
        int i = 2 % 2;
        int i2 = asInterface + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0 ? (obj = this.onExtraCallback) != null : (obj = this.onExtraCallback) != null) {
            iHashCode = obj.hashCode();
        } else {
            int i4 = i3 + 85;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        JsonUtils jsonUtils = this.onWarmupCompleted;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jsonUtils != null ? jsonUtils.hashCode() : 0)) * 31) + Boolean.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsAgreementV4TopTitlesState(id=" + this.onExtraCallback + ", titlePresets=" + this.onExtraCallbackWithResult + ", delayArray=" + this.IAuthTabCallback + ", slideMotion=" + this.onWarmupCompleted + ", showSlideAnimation=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public match(@Nullable Object obj, @NotNull getMemoryMappingsOrBuilder<? extends getBacktraceNote<? super isNumeric, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> getmemorymappingsorbuilder, @NotNull List<Integer> list, @Nullable JsonUtils jsonUtils, boolean z) {
        Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = obj;
        this.onExtraCallbackWithResult = getmemorymappingsorbuilder;
        this.IAuthTabCallback = list;
        this.onWarmupCompleted = jsonUtils;
        this.onNavigationEvent = z;
    }

    public final Object IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 23;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getMemoryMappingsOrBuilder<getBacktraceNote<isNumeric, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>> getmemorymappingsorbuilder = this.onExtraCallbackWithResult;
        int i4 = i2 + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return getmemorymappingsorbuilder;
    }

    public final List<Integer> onExtraCallback() {
        List<Integer> list;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.IAuthTabCallback;
            int i4 = 13 / 0;
        } else {
            list = this.IAuthTabCallback;
        }
        int i5 = i2 + 15;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final JsonUtils onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        JsonUtils jsonUtils = this.onWarmupCompleted;
        int i5 = i3 + 85;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return jsonUtils;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 71;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return z;
    }
}
