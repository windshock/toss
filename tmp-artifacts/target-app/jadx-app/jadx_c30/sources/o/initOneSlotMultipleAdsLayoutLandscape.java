package o;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class initOneSlotMultipleAdsLayoutLandscape extends jc2 {
    private final byte IAuthTabCallback;
    private final byte[] onNavigationEvent;

    public initOneSlotMultipleAdsLayoutLandscape(byte b, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data may not be null");
        }
        this.IAuthTabCallback = b;
        this.onNavigationEvent = bArr;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.BINARY;
    }

    public byte onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public byte[] onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        initOneSlotMultipleAdsLayoutLandscape initoneslotmultipleadslayoutlandscape = (initOneSlotMultipleAdsLayoutLandscape) obj;
        return Arrays.equals(this.onNavigationEvent, initoneslotmultipleadslayoutlandscape.onNavigationEvent) && this.IAuthTabCallback == initoneslotmultipleadslayoutlandscape.IAuthTabCallback;
    }

    public int hashCode() {
        return (this.IAuthTabCallback * 31) + Arrays.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "BsonBinary{type=" + ((int) this.IAuthTabCallback) + ", data=" + Arrays.toString(this.onNavigationEvent) + '}';
    }

    static initOneSlotMultipleAdsLayoutLandscape onExtraCallbackWithResult(initOneSlotMultipleAdsLayoutLandscape initoneslotmultipleadslayoutlandscape) {
        return new initOneSlotMultipleAdsLayoutLandscape(initoneslotmultipleadslayoutlandscape.IAuthTabCallback, (byte[]) initoneslotmultipleadslayoutlandscape.onNavigationEvent.clone());
    }
}
