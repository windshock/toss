package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class bba implements sya5, uh1<bba> {
    private Integer IAuthTabCallback;
    private Integer onExtraCallback;
    private Integer onExtraCallbackWithResult;
    private Boolean onWarmupCompleted;

    public bba() {
        this(null, null, null, null, 15, null);
    }

    public bba(@Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.onWarmupCompleted = bool;
        this.IAuthTabCallback = num;
        this.onExtraCallbackWithResult = num2;
        this.onExtraCallback = num3;
    }

    public /* synthetic */ bba(Boolean bool, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }

    @Override // o.sya5
    public Boolean ICustomTabsCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.sya5
    public void onExtraCallbackWithResult(@Nullable Boolean bool) {
        this.onWarmupCompleted = bool;
    }

    @Override // o.sya5
    public Integer access000() {
        return this.IAuthTabCallback;
    }

    @Override // o.sya5
    public void asBinder(@Nullable Integer num) {
        this.IAuthTabCallback = num;
    }

    @Override // o.sya5
    public void IAuthTabCallbackDefault(@Nullable Integer num) {
        this.onExtraCallbackWithResult = num;
    }

    @Override // o.sya5
    public Integer writeTypedObject() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.sya5
    public void IAuthTabCallbackStubProxy(@Nullable Integer num) {
        this.onExtraCallback = num;
    }

    @Override // o.sya5
    public Integer readTypedObject() {
        return this.onExtraCallback;
    }

    public final jni_YGNodeStyleSetMarginAutoJNI IAuthTabCallback() {
        int i = Intrinsics.areEqual(ICustomTabsCallback(), Boolean.TRUE) ? -1 : 1;
        Integer numAccess000 = access000();
        Integer numValueOf = numAccess000 != null ? Integer.valueOf(numAccess000.intValue() * i) : null;
        Integer numWriteTypedObject = writeTypedObject();
        Integer numValueOf2 = numWriteTypedObject != null ? Integer.valueOf(numWriteTypedObject.intValue() * i) : null;
        Integer typedObject = readTypedObject();
        return jni_YGNodeStyleSetMarginJNI.onExtraCallbackWithResult(numValueOf, numValueOf2, typedObject != null ? Integer.valueOf(typedObject.intValue() * i) : null);
    }

    public final void onExtraCallbackWithResult(@NotNull jni_YGNodeStyleSetMarginAutoJNI jni_ygnodestylesetmarginautojni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetmarginautojni, "");
        onExtraCallbackWithResult(Boolean.valueOf(jni_ygnodestylesetmarginautojni.onWarmupCompleted() < 0));
        int iAbs = Math.abs(jni_ygnodestylesetmarginautojni.onWarmupCompleted());
        asBinder(Integer.valueOf(iAbs / 3600));
        IAuthTabCallbackDefault(Integer.valueOf((iAbs / 60) % 60));
        IAuthTabCallbackStubProxy(Integer.valueOf(iAbs % 60));
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof bba)) {
            return false;
        }
        bba bbaVar = (bba) obj;
        return Intrinsics.areEqual(ICustomTabsCallback(), bbaVar.ICustomTabsCallback()) && Intrinsics.areEqual(access000(), bbaVar.access000()) && Intrinsics.areEqual(writeTypedObject(), bbaVar.writeTypedObject()) && Intrinsics.areEqual(readTypedObject(), bbaVar.readTypedObject());
    }

    public int hashCode() {
        Boolean boolICustomTabsCallback = ICustomTabsCallback();
        int iHashCode = boolICustomTabsCallback != null ? boolICustomTabsCallback.hashCode() : 0;
        Integer numAccess000 = access000();
        int iHashCode2 = numAccess000 != null ? numAccess000.hashCode() : 0;
        Integer numWriteTypedObject = writeTypedObject();
        int iHashCode3 = numWriteTypedObject != null ? numWriteTypedObject.hashCode() : 0;
        Integer typedObject = readTypedObject();
        return iHashCode + iHashCode2 + iHashCode3 + (typedObject != null ? typedObject.hashCode() : 0);
    }

    @Override // o.uh1
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public bba onExtraCallback() {
        return new bba(ICustomTabsCallback(), access000(), writeTypedObject(), readTypedObject());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean boolICustomTabsCallback = ICustomTabsCallback();
        sb.append(boolICustomTabsCallback != null ? boolICustomTabsCallback.booleanValue() ? "-" : "+" : " ");
        Object objAccess000 = access000();
        if (objAccess000 == null) {
            objAccess000 = "??";
        }
        sb.append(objAccess000);
        sb.append(':');
        Object objWriteTypedObject = writeTypedObject();
        if (objWriteTypedObject == null) {
            objWriteTypedObject = "??";
        }
        sb.append(objWriteTypedObject);
        sb.append(':');
        Integer typedObject = readTypedObject();
        sb.append(typedObject != null ? typedObject : "??");
        return sb.toString();
    }
}
