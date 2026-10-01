package com.tbruyelle.rxpermissions2;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.MapConverter1;
import o.deserializeIntNullableCollection;
import o.getByteBuffer;
import o.getTimestampBytes;
import o.serializeRaw;
import o.shouldBeKeptAsChild;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class RxPermissions {
    static final String onExtraCallbackWithResult = "RxPermissions";
    static final Object onNavigationEvent = new Object();
    Lazy<RxPermissionsFragment> onWarmupCompleted;

    @FunctionalInterface
    public interface Lazy<V> {
        V onNavigationEvent();
    }

    boolean onExtraCallbackWithResult() {
        return true;
    }

    public RxPermissions(@NonNull FragmentActivity fragmentActivity) {
        this.onWarmupCompleted = IAuthTabCallback(fragmentActivity.getSupportFragmentManager());
    }

    public RxPermissions(@NonNull Fragment fragment) {
        this.onWarmupCompleted = IAuthTabCallback(fragment.getChildFragmentManager());
    }

    private Lazy<RxPermissionsFragment> IAuthTabCallback(@NonNull final FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        return new Lazy<RxPermissionsFragment>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.1
            private RxPermissionsFragment onWarmupCompleted;

            @Override // com.tbruyelle.rxpermissions2.RxPermissions.Lazy
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public RxPermissionsFragment onNavigationEvent() {
                RxPermissionsFragment rxPermissionsFragment;
                synchronized (this) {
                    if (this.onWarmupCompleted == null) {
                        this.onWarmupCompleted = RxPermissions.this.onExtraCallbackWithResult(flowMeasureLazyPolicyExternalSyntheticLambda3);
                    }
                    rxPermissionsFragment = this.onWarmupCompleted;
                }
                return rxPermissionsFragment;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RxPermissionsFragment onExtraCallbackWithResult(@NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        RxPermissionsFragment rxPermissionsFragmentOnWarmupCompleted = onWarmupCompleted(flowMeasureLazyPolicyExternalSyntheticLambda3);
        if (rxPermissionsFragmentOnWarmupCompleted != null) {
            return rxPermissionsFragmentOnWarmupCompleted;
        }
        RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
        flowMeasureLazyPolicyExternalSyntheticLambda3.onExtraCallbackWithResult().onExtraCallbackWithResult(rxPermissionsFragment, onExtraCallbackWithResult).onNavigationEvent();
        return rxPermissionsFragment;
    }

    private RxPermissionsFragment onWarmupCompleted(@NonNull FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3) {
        return (RxPermissionsFragment) flowMeasureLazyPolicyExternalSyntheticLambda3.findFragmentByTag(onExtraCallbackWithResult);
    }

    public <T> MapConverter1<T, Boolean> onExtraCallback(final String... strArr) {
        return new MapConverter1<T, Boolean>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.2
            public serializeRaw<Boolean> apply(getByteBuffer<T> getbytebuffer) {
                return RxPermissions.this.onExtraCallbackWithResult(getbytebuffer, strArr).onExtraCallbackWithResult(strArr.length).IAuthTabCallback(new deserializeIntNullableCollection<List<shouldBeKeptAsChild>, serializeRaw<Boolean>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.2.1
                    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                    public serializeRaw<Boolean> apply(List<shouldBeKeptAsChild> list) {
                        if (list.isEmpty()) {
                            return getByteBuffer.onTransact();
                        }
                        Iterator<shouldBeKeptAsChild> it = list.iterator();
                        while (it.hasNext()) {
                            if (!it.next().onNavigationEvent) {
                                return getByteBuffer.onWarmupCompleted(Boolean.FALSE);
                            }
                        }
                        return getByteBuffer.onWarmupCompleted(Boolean.TRUE);
                    }
                });
            }
        };
    }

    public <T> MapConverter1<T, shouldBeKeptAsChild> IAuthTabCallback(final String... strArr) {
        return new MapConverter1<T, shouldBeKeptAsChild>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.3
            public serializeRaw<shouldBeKeptAsChild> apply(getByteBuffer<T> getbytebuffer) {
                return RxPermissions.this.onExtraCallbackWithResult(getbytebuffer, strArr);
            }
        };
    }

    public <T> MapConverter1<T, shouldBeKeptAsChild> onWarmupCompleted(final String... strArr) {
        return new MapConverter1<T, shouldBeKeptAsChild>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.4
            public serializeRaw<shouldBeKeptAsChild> apply(getByteBuffer<T> getbytebuffer) {
                return RxPermissions.this.onExtraCallbackWithResult(getbytebuffer, strArr).onExtraCallbackWithResult(strArr.length).IAuthTabCallback(new deserializeIntNullableCollection<List<shouldBeKeptAsChild>, serializeRaw<shouldBeKeptAsChild>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.4.1
                    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                    public serializeRaw<shouldBeKeptAsChild> apply(List<shouldBeKeptAsChild> list) {
                        if (list.isEmpty()) {
                            return getByteBuffer.onTransact();
                        }
                        return getByteBuffer.onWarmupCompleted(new shouldBeKeptAsChild(list));
                    }
                });
            }
        };
    }

    public getByteBuffer<Boolean> onNavigationEvent(String... strArr) {
        return getByteBuffer.onWarmupCompleted(onNavigationEvent).onExtraCallback(onExtraCallback(strArr));
    }

    public getByteBuffer<shouldBeKeptAsChild> onExtraCallbackWithResult(String... strArr) {
        return getByteBuffer.onWarmupCompleted(onNavigationEvent).onExtraCallback(IAuthTabCallback(strArr));
    }

    public getByteBuffer<shouldBeKeptAsChild> onTransact(String... strArr) {
        return getByteBuffer.onWarmupCompleted(onNavigationEvent).onExtraCallback(onWarmupCompleted(strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getByteBuffer<shouldBeKeptAsChild> onExtraCallbackWithResult(getByteBuffer<?> getbytebuffer, final String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return onNavigationEvent(getbytebuffer, asInterface(strArr)).IAuthTabCallback(new deserializeIntNullableCollection<Object, getByteBuffer<shouldBeKeptAsChild>>() { // from class: com.tbruyelle.rxpermissions2.RxPermissions.5
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public getByteBuffer<shouldBeKeptAsChild> apply(Object obj) {
                return RxPermissions.this.IAuthTabCallbackDefault(strArr);
            }
        });
    }

    private getByteBuffer<?> asInterface(String... strArr) {
        for (String str : strArr) {
            if (!this.onWarmupCompleted.onNavigationEvent().onNavigationEvent(str)) {
                return getByteBuffer.onTransact();
            }
        }
        return getByteBuffer.onWarmupCompleted(onNavigationEvent);
    }

    private getByteBuffer<?> onNavigationEvent(getByteBuffer<?> getbytebuffer, getByteBuffer<?> getbytebuffer2) {
        if (getbytebuffer == null) {
            return getByteBuffer.onWarmupCompleted(onNavigationEvent);
        }
        return getByteBuffer.onExtraCallback(getbytebuffer, getbytebuffer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getByteBuffer<shouldBeKeptAsChild> IAuthTabCallbackDefault(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.onWarmupCompleted.onNavigationEvent().onExtraCallback("Requesting permission " + str);
            if (onExtraCallbackWithResult(str)) {
                arrayList.add(getByteBuffer.onWarmupCompleted(new shouldBeKeptAsChild(str, true, false)));
            } else if (IAuthTabCallback(str)) {
                arrayList.add(getByteBuffer.onWarmupCompleted(new shouldBeKeptAsChild(str, false, false)));
            } else {
                getTimestampBytes<shouldBeKeptAsChild> gettimestampbytesOnExtraCallbackWithResult = this.onWarmupCompleted.onNavigationEvent().onExtraCallbackWithResult(str);
                if (gettimestampbytesOnExtraCallbackWithResult == null) {
                    arrayList2.add(str);
                    gettimestampbytesOnExtraCallbackWithResult = getTimestampBytes.IAuthTabCallback();
                    this.onWarmupCompleted.onNavigationEvent().onExtraCallbackWithResult(str, gettimestampbytesOnExtraCallbackWithResult);
                }
                arrayList.add(gettimestampbytesOnExtraCallbackWithResult);
            }
        }
        if (!arrayList2.isEmpty()) {
            asBinder((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return getByteBuffer.onExtraCallbackWithResult(getByteBuffer.onExtraCallback(arrayList));
    }

    void asBinder(String[] strArr) {
        this.onWarmupCompleted.onNavigationEvent().onExtraCallback("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.onWarmupCompleted.onNavigationEvent().onWarmupCompleted(strArr);
    }

    public boolean onExtraCallbackWithResult(String str) {
        return !onExtraCallbackWithResult() || this.onWarmupCompleted.onNavigationEvent().onWarmupCompleted(str);
    }

    public boolean IAuthTabCallback(String str) {
        return onExtraCallbackWithResult() && this.onWarmupCompleted.onNavigationEvent().IAuthTabCallback(str);
    }
}
