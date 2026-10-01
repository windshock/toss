package o;

import io.opentelemetry.sdk.resources.Resource;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class readNull implements comma {
    private final comma onExtraCallback;

    public readNull(comma commaVar) {
        Objects.requireNonNull(commaVar, "delegate");
        this.onExtraCallback = commaVar;
    }

    public getSeverityReasonbugsnag_android_core_release IAuthTabCallback_Parcel() {
        return this.onExtraCallback.IAuthTabCallback_Parcel();
    }

    public getSeverityReasonbugsnag_android_core_release onTransact() {
        return this.onExtraCallback.onTransact();
    }

    public Resource IAuthTabCallbackStub() {
        return this.onExtraCallback.IAuthTabCallbackStub();
    }

    @Deprecated
    public priorityType extraCallbackWithResult() {
        return this.onExtraCallback.extraCallbackWithResult();
    }

    public TombstoneParserCompanion onNavigationEvent() {
        return this.onExtraCallback.onNavigationEvent();
    }

    public String asInterface() {
        return this.onExtraCallback.asInterface();
    }

    public getUnhandledOverridden asBinder() {
        return this.onExtraCallback.asBinder();
    }

    public long access100() {
        return this.onExtraCallback.access100();
    }

    public getScreenDensityDpi onWarmupCompleted() {
        return this.onExtraCallback.onWarmupCompleted();
    }

    public List<positionDescription> onExtraCallback() {
        return this.onExtraCallback.onExtraCallback();
    }

    public List<appendString> IAuthTabCallbackDefault() {
        return this.onExtraCallback.IAuthTabCallbackDefault();
    }

    public deserializeCollectionCustom getInterfaceDescriptor() {
        return this.onExtraCallback.getInterfaceDescriptor();
    }

    public long IAuthTabCallback() {
        return this.onExtraCallback.IAuthTabCallback();
    }

    public boolean readTypedObject() {
        return this.onExtraCallback.readTypedObject();
    }

    public int access000() {
        return this.onExtraCallback.access000();
    }

    public int IAuthTabCallbackStubProxy() {
        return this.onExtraCallback.IAuthTabCallbackStubProxy();
    }

    public int onExtraCallbackWithResult() {
        return this.onExtraCallback.onExtraCallbackWithResult();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof comma)) {
            return false;
        }
        comma commaVar = (comma) obj;
        return IAuthTabCallback_Parcel().equals(commaVar.IAuthTabCallback_Parcel()) && onTransact().equals(commaVar.onTransact()) && IAuthTabCallbackStub().equals(commaVar.IAuthTabCallbackStub()) && onNavigationEvent().equals(commaVar.onNavigationEvent()) && asInterface().equals(commaVar.asInterface()) && asBinder().equals(commaVar.asBinder()) && access100() == commaVar.access100() && onWarmupCompleted().equals(commaVar.onWarmupCompleted()) && onExtraCallback().equals(commaVar.onExtraCallback()) && IAuthTabCallbackDefault().equals(commaVar.IAuthTabCallbackDefault()) && getInterfaceDescriptor().equals(commaVar.getInterfaceDescriptor()) && IAuthTabCallback() == commaVar.IAuthTabCallback() && readTypedObject() == commaVar.readTypedObject() && access000() == commaVar.access000() && IAuthTabCallbackStubProxy() == commaVar.IAuthTabCallbackStubProxy() && onExtraCallbackWithResult() == commaVar.onExtraCallbackWithResult();
    }

    public int hashCode() {
        int iHashCode = IAuthTabCallback_Parcel().hashCode();
        int iHashCode2 = onTransact().hashCode();
        int iHashCode3 = IAuthTabCallbackStub().hashCode();
        int iHashCode4 = onNavigationEvent().hashCode();
        int iHashCode5 = asInterface().hashCode();
        int iHashCode6 = asBinder().hashCode();
        int iAccess100 = (int) ((access100() >>> 32) ^ access100());
        int iHashCode7 = onWarmupCompleted().hashCode();
        int iHashCode8 = onExtraCallback().hashCode();
        int iHashCode9 = IAuthTabCallbackDefault().hashCode();
        int iHashCode10 = getInterfaceDescriptor().hashCode();
        int iIAuthTabCallback = (int) ((IAuthTabCallback() >>> 32) ^ IAuthTabCallback());
        return ((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iAccess100) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iIAuthTabCallback) * 1000003) ^ (readTypedObject() ? 1231 : verifySignatureValue_NoAlgorithmInfo.ACTIVITY_REQ_PAYMENT_CHARGE_ACCOUNT_CHOOSER)) * 1000003) ^ access000()) * 1000003) ^ IAuthTabCallbackStubProxy()) * 1000003) ^ onExtraCallbackWithResult();
    }

    public String toString() {
        return "DelegatingSpanData{spanContext=" + IAuthTabCallback_Parcel() + ", parentSpanContext=" + onTransact() + ", resource=" + IAuthTabCallbackStub() + ", instrumentationScopeInfo=" + onNavigationEvent() + ", name=" + asInterface() + ", kind=" + asBinder() + ", startEpochNanos=" + access100() + ", attributes=" + onWarmupCompleted() + ", events=" + onExtraCallback() + ", links=" + IAuthTabCallbackDefault() + ", status=" + getInterfaceDescriptor() + ", endEpochNanos=" + IAuthTabCallback() + ", hasEnded=" + readTypedObject() + ", totalRecordedEvents=" + access000() + ", totalRecordedLinks=" + IAuthTabCallbackStubProxy() + ", totalAttributeCount=" + onExtraCallbackWithResult() + "}";
    }
}
