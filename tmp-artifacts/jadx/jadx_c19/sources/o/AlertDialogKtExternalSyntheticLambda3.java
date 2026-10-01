package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AlertDialogKtExternalSyntheticLambda3 extends AlertDialogKtExternalSyntheticLambda7 {
    public final long IAuthTabCallback;
    public final ImmutableList<onNavigationEvent> IAuthTabCallbackDefault;
    public final long IAuthTabCallbackStub;
    public final Map<Uri, onExtraCallback> IAuthTabCallbackStubProxy;
    public final IAuthTabCallbackDefault IAuthTabCallback_Parcel;
    public final long ICustomTabsCallback;
    public final BasicTextContextMenuProviderExternalSyntheticLambda0 access000;
    public final boolean access100;
    public final long asBinder;
    public final boolean asInterface;
    public final long extraCallback;
    public final List<IAuthTabCallback> extraCallbackWithResult;
    public final List<onExtraCallbackWithResult> getInterfaceDescriptor;
    public final boolean onExtraCallback;
    public final boolean onExtraCallbackWithResult;
    public final boolean onNavigationEvent;
    public final int onTransact;
    public final int onWarmupCompleted;
    public final int readTypedObject;
    public final long writeTypedObject;

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda2
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public AlertDialogKtExternalSyntheticLambda3 onWarmupCompleted(List<AndroidTextInputSession_androidKtplatformSpecificTextInputSession31ExternalSyntheticLambda0> list) {
        return this;
    }

    public static final class onExtraCallbackWithResult extends onTransact {
        public final String onExtraCallback;
        public final List<IAuthTabCallback> onExtraCallbackWithResult;

        public onExtraCallbackWithResult(String str, long j, long j2, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.of());
        }

        public onExtraCallbackWithResult(String str, @Nullable onExtraCallbackWithResult onextracallbackwithresult, String str2, long j, int i2, long j2, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, @Nullable String str3, @Nullable String str4, long j3, long j4, boolean z, List<IAuthTabCallback> list) {
            super(str, onextracallbackwithresult, j, i2, j2, basicTextContextMenuProviderExternalSyntheticLambda0, str3, str4, j3, j4, z);
            this.onExtraCallback = str2;
            this.onExtraCallbackWithResult = ImmutableList.copyOf(list);
        }

        public onExtraCallbackWithResult onNavigationEvent(long j, int i2) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i3 = 0; i3 < this.onExtraCallbackWithResult.size(); i3++) {
                IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult.get(i3);
                arrayList.add(iAuthTabCallback.onExtraCallbackWithResult(j2, i2));
                j2 += iAuthTabCallback.onTransact;
            }
            return new onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy, this.access000, this.onExtraCallback, this.onTransact, i2, j, this.asBinder, this.IAuthTabCallbackDefault, this.asInterface, this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallbackStub, arrayList);
        }
    }

    public static final class IAuthTabCallback extends onTransact {
        public final boolean IAuthTabCallback;
        public final boolean onExtraCallbackWithResult;

        public IAuthTabCallback(String str, @Nullable onExtraCallbackWithResult onextracallbackwithresult, long j, int i2, long j2, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, onextracallbackwithresult, j, i2, j2, basicTextContextMenuProviderExternalSyntheticLambda0, str2, str3, j3, j4, z);
            this.onExtraCallbackWithResult = z2;
            this.IAuthTabCallback = z3;
        }

        public IAuthTabCallback onExtraCallbackWithResult(long j, int i2) {
            return new IAuthTabCallback(this.IAuthTabCallbackStubProxy, this.access000, this.onTransact, i2, j, this.asBinder, this.IAuthTabCallbackDefault, this.asInterface, this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallbackStub, this.onExtraCallbackWithResult, this.IAuthTabCallback);
        }
    }

    public static class onTransact implements Comparable<Long> {
        public final String IAuthTabCallbackDefault;
        public final boolean IAuthTabCallbackStub;
        public final String IAuthTabCallbackStubProxy;
        public final int IAuthTabCallback_Parcel;
        public final onExtraCallbackWithResult access000;
        public final BasicTextContextMenuProviderExternalSyntheticLambda0 asBinder;
        public final String asInterface;
        public final long getInterfaceDescriptor;
        public final long onNavigationEvent;
        public final long onTransact;
        public final long onWarmupCompleted;

        private onTransact(String str, @Nullable onExtraCallbackWithResult onextracallbackwithresult, long j, int i2, long j2, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, @Nullable String str2, @Nullable String str3, long j3, long j4, boolean z) {
            this.IAuthTabCallbackStubProxy = str;
            this.access000 = onextracallbackwithresult;
            this.onTransact = j;
            this.IAuthTabCallback_Parcel = i2;
            this.getInterfaceDescriptor = j2;
            this.asBinder = basicTextContextMenuProviderExternalSyntheticLambda0;
            this.IAuthTabCallbackDefault = str2;
            this.asInterface = str3;
            this.onNavigationEvent = j3;
            this.onWarmupCompleted = j4;
            this.IAuthTabCallbackStub = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.getInterfaceDescriptor > l.longValue()) {
                return 1;
            }
            return this.getInterfaceDescriptor < l.longValue() ? -1 : 0;
        }
    }

    public AlertDialogKtExternalSyntheticLambda3(int i2, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i3, long j3, int i4, long j4, long j5, boolean z3, boolean z4, boolean z5, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, List<onExtraCallbackWithResult> list2, List<IAuthTabCallback> list3, IAuthTabCallbackDefault iAuthTabCallbackDefault, Map<Uri, onExtraCallback> map, List<onNavigationEvent> list4) {
        super(str, list, z3);
        this.onTransact = i2;
        this.writeTypedObject = j2;
        this.access100 = z;
        this.onExtraCallback = z2;
        this.onWarmupCompleted = i3;
        this.IAuthTabCallbackStub = j3;
        this.readTypedObject = i4;
        this.ICustomTabsCallback = j4;
        this.asBinder = j5;
        this.onExtraCallbackWithResult = z4;
        this.asInterface = z5;
        this.access000 = basicTextContextMenuProviderExternalSyntheticLambda0;
        this.getInterfaceDescriptor = ImmutableList.copyOf(list2);
        this.extraCallbackWithResult = ImmutableList.copyOf(list3);
        this.IAuthTabCallbackStubProxy = ImmutableMap.copyOf(map);
        this.IAuthTabCallbackDefault = ImmutableList.copyOf(list4);
        if (!list3.isEmpty()) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Iterables.getLast(list3);
            this.IAuthTabCallback = iAuthTabCallback.getInterfaceDescriptor + iAuthTabCallback.onTransact;
        } else if (!list2.isEmpty()) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Iterables.getLast(list2);
            this.IAuthTabCallback = onextracallbackwithresult.getInterfaceDescriptor + onextracallbackwithresult.onTransact;
        } else {
            this.IAuthTabCallback = 0L;
        }
        long jMax = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                jMax = Math.min(this.IAuthTabCallback, j);
            } else {
                jMax = Math.max(0L, this.IAuthTabCallback + j);
            }
        }
        this.extraCallback = jMax;
        this.onNavigationEvent = j >= 0;
        this.IAuthTabCallback_Parcel = iAuthTabCallbackDefault;
    }

    public boolean IAuthTabCallback(@Nullable AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3) {
        if (alertDialogKtExternalSyntheticLambda3 != null) {
            long j = this.IAuthTabCallbackStub;
            long j2 = alertDialogKtExternalSyntheticLambda3.IAuthTabCallbackStub;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.getInterfaceDescriptor.size() - alertDialogKtExternalSyntheticLambda3.getInterfaceDescriptor.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.extraCallbackWithResult.size();
                int size3 = alertDialogKtExternalSyntheticLambda3.extraCallbackWithResult.size();
                if (size2 <= size3 && (size2 != size3 || !this.onExtraCallbackWithResult || alertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult)) {
                    return false;
                }
            }
        }
        return true;
    }

    public long onExtraCallbackWithResult() {
        return this.writeTypedObject + this.IAuthTabCallback;
    }

    public AlertDialogKtExternalSyntheticLambda3 onWarmupCompleted(long j, int i2) {
        return new AlertDialogKtExternalSyntheticLambda3(this.onTransact, this.onPostMessage, this.onMessageChannelReady, this.extraCallback, this.access100, j, true, i2, this.IAuthTabCallbackStub, this.readTypedObject, this.ICustomTabsCallback, this.asBinder, this.onActivityLayout, this.onExtraCallbackWithResult, this.asInterface, this.access000, this.getInterfaceDescriptor, this.extraCallbackWithResult, this.IAuthTabCallback_Parcel, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackDefault);
    }

    public AlertDialogKtExternalSyntheticLambda3 onWarmupCompleted() {
        return this.onExtraCallbackWithResult ? this : new AlertDialogKtExternalSyntheticLambda3(this.onTransact, this.onPostMessage, this.onMessageChannelReady, this.extraCallback, this.access100, this.writeTypedObject, this.onExtraCallback, this.onWarmupCompleted, this.IAuthTabCallbackStub, this.readTypedObject, this.ICustomTabsCallback, this.asBinder, this.onActivityLayout, true, this.asInterface, this.access000, this.getInterfaceDescriptor, this.extraCallbackWithResult, this.IAuthTabCallback_Parcel, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackDefault);
    }
}
