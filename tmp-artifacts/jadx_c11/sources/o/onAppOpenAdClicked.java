package o;

import im.toss.rn.toss.core.portal.PortalRuntimeRecycleConfig;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getPreRenderJob;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAppOpenAdClicked {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private boolean IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private long asBinder;
    private long onExtraCallback;
    private PortalRuntimeRecycleConfig onExtraCallbackWithResult = PortalRuntimeRecycleConfig.Companion.IAuthTabCallback();
    private final HashSet<String> onNavigationEvent = new HashSet<>();
    private final HashSet<Long> onWarmupCompleted = new HashSet<>();

    static {
        int i = IAuthTabCallbackStub + 63;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i4 | i5)) | i3;
        int i8 = (~((~i5) | i4)) | i3;
        int i9 = (~i3) | i4;
        int i10 = i3 + i4 + i + (440753341 * i2) + ((-634449194) * i6);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i3) + 1075183616 + ((-1421434046) * i4) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i) + (780402688 * i2) + ((-180879360) * i6) + (353763328 * i11);
        int i13 = (i3 * 892202253) + 1676176333 + (i4 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i * 892200819) + (i2 * (-770690073)) + (i6 * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        if (i14 != 1) {
            return i14 != 2 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }
        onAppOpenAdClicked onappopenadclicked = (onAppOpenAdClicked) objArr[0];
        int i15 = 2 % 2;
        int i16 = access100 + 37;
        onTransact = i16 % 128;
        int i17 = i16 % 2;
        int size = onappopenadclicked.onWarmupCompleted.size();
        int i18 = access100 + 101;
        onTransact = i18 % 128;
        int i19 = i18 % 2;
        return Integer.valueOf(size);
    }

    public final void onExtraCallbackWithResult(@NotNull PortalRuntimeRecycleConfig portalRuntimeRecycleConfig) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(portalRuntimeRecycleConfig, "");
        this.onExtraCallbackWithResult = portalRuntimeRecycleConfig;
        int i4 = onTransact + 77;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final PortalRuntimeRecycleConfig onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 43;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        PortalRuntimeRecycleConfig portalRuntimeRecycleConfig = this.onExtraCallbackWithResult;
        int i5 = i2 + 89;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return portalRuntimeRecycleConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        onAppOpenAdClicked onappopenadclicked = (onAppOpenAdClicked) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 93;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int size = onappopenadclicked.onNavigationEvent.size();
        int i4 = onTransact + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(size);
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue;
        onAppOpenAdClicked onappopenadclicked = (onAppOpenAdClicked) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = onappopenadclicked.IAuthTabCallbackDefault;
            int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            iIntValue = i3 * ((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{onappopenadclicked}, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        } else {
            int i4 = onappopenadclicked.IAuthTabCallbackDefault;
            int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
            iIntValue = i4 + ((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{onappopenadclicked}, iIAuthTabCallback2, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
        }
        int i5 = onTransact + 67;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(iIntValue);
    }

    public final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 75;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallbackDefault;
        int i6 = i2 + 113;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 113;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    private final onAdViewAdClicked getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access100 + 51;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            if (this.IAuthTabCallback) {
                this.IAuthTabCallback = false;
                return onAdViewAdClicked.CANCEL;
            }
            int i4 = i3 + 113;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                return onAdViewAdClicked.NONE;
            }
            int i5 = 19 / 0;
            return onAdViewAdClicked.NONE;
        }
        throw null;
    }

    public final onAdViewAdClicked access100() {
        int i = 2 % 2;
        int i2 = access100 + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor();
            throw null;
        }
        onAdViewAdClicked interfaceDescriptor = getInterfaceDescriptor();
        int i3 = onTransact + 9;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return interfaceDescriptor;
    }

    public final onAdViewAdClicked onWarmupCompleted(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 69;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!this.onExtraCallbackWithResult.onExtraCallbackWithResult())) {
            this.onNavigationEvent.add(str);
            return onWarmupCompleted(i);
        }
        onAdViewAdClicked onadviewadclicked = onAdViewAdClicked.NONE;
        int i4 = onTransact + 49;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return onadviewadclicked;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final onAdViewAdClicked onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 17;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
            if (i <= 0) {
                if (((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 17195192, -17195190, new Object[]{this}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue() <= 0 && this.onNavigationEvent.size() >= this.onExtraCallbackWithResult.onExtraCallback()) {
                    int i5 = onTransact + 59;
                    access100 = i5 % 128;
                    int i6 = i5 % 2;
                    if (!this.IAuthTabCallback) {
                        this.IAuthTabCallback = true;
                        onAdViewAdClicked onadviewadclicked = onAdViewAdClicked.SCHEDULE;
                        int i7 = onTransact + 59;
                        access100 = i7 % 128;
                        int i8 = i7 % 2;
                        return onadviewadclicked;
                    }
                }
            }
        } else if (i <= 0) {
        }
        return onAdViewAdClicked.NONE;
    }

    public final String IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.IAuthTabCallbackDefault == 0) {
            if (((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue() == 0) {
                int i3 = access100 + 65;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (i > 0) {
            int i4 = access100 + 65;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return "active_sessions";
        }
        if (this.onNavigationEvent.size() >= this.onExtraCallbackWithResult.onExtraCallback()) {
            return this.IAuthTabCallbackDefault > 0 ? "preparing_entries" : "held_entries";
        }
        int i6 = onTransact + 3;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            return "below_threshold";
        }
        throw null;
    }

    public final onAdViewAdClicked asBinder() {
        onAdViewAdClicked interfaceDescriptor;
        int i = 2 % 2;
        int i2 = onTransact + 77;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            interfaceDescriptor = getInterfaceDescriptor();
            int i3 = 92 / 0;
        } else {
            interfaceDescriptor = getInterfaceDescriptor();
        }
        int i4 = access100 + 35;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public final onAdViewAdClicked onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        access100 = i2 % 128;
        this.IAuthTabCallbackDefault = i2 % 2 == 0 ? this.IAuthTabCallbackDefault - 1 : this.IAuthTabCallbackDefault + 1;
        onAdViewAdClicked interfaceDescriptor = getInterfaceDescriptor();
        int i3 = access100 + 49;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return interfaceDescriptor;
    }

    public final Long onExtraCallbackWithResult(long j, boolean z) {
        int i = 2 % 2;
        if (j == this.onExtraCallback) {
            int i2 = this.IAuthTabCallbackDefault;
            if (i2 <= 0) {
                return null;
            }
            this.IAuthTabCallbackDefault = i2 - 1;
            if (!(!z)) {
                long j2 = this.asBinder;
                this.asBinder = 1 + j2;
                this.onWarmupCompleted.add(Long.valueOf(j2));
                return Long.valueOf(j2);
            }
            int i3 = onTransact + 89;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = onTransact + 117;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final onAdViewAdClicked onNavigationEvent(long j, int i, boolean z) {
        int i2 = 2 % 2;
        Object obj = null;
        if (!this.onWarmupCompleted.remove(Long.valueOf(j))) {
            int i3 = access100 + 7;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return onAdViewAdClicked.NONE;
            }
            onAdViewAdClicked onadviewadclicked = onAdViewAdClicked.NONE;
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i4 = access100 + 45;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (this.onExtraCallbackWithResult.onExtraCallbackWithResult()) {
                int i6 = onTransact + 5;
                access100 = i6 % 128;
                if (i6 % 2 != 0) {
                    return onWarmupCompleted(i);
                }
                onWarmupCompleted(i);
                obj.hashCode();
                throw null;
            }
        }
        return onAdViewAdClicked.NONE;
    }

    public final boolean onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        if (!this.IAuthTabCallback) {
            int i3 = access100 + 45;
            onTransact = i3 % 128;
            return i3 % 2 != 0;
        }
        this.IAuthTabCallback = false;
        if (!this.onExtraCallbackWithResult.onExtraCallbackWithResult()) {
            int i4 = access100 + 57;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            return false;
        }
        if (i <= 0) {
            int i6 = access100 + 71;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            if (((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 17195192, -17195190, new Object[]{this}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue() <= 0) {
                this.onNavigationEvent.clear();
                return true;
            }
        }
        return false;
    }

    public final void asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.clear();
        this.IAuthTabCallback = false;
        this.IAuthTabCallbackDefault = 0;
        this.onWarmupCompleted.clear();
        this.onExtraCallback++;
        int i4 = access100 + 115;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final int onNavigationEvent() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 457374428, -457374428, new Object[]{this}, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
    }

    public final int onExtraCallback() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1328659776, 1328659777, new Object[]{this}, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
    }

    public final int onExtraCallbackWithResult() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return ((Integer) onNavigationEvent(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 17195192, -17195190, new Object[]{this}, iIAuthTabCallback, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).intValue();
    }
}
