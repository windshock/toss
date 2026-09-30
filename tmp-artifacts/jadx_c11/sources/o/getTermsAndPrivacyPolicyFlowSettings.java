package o;

import android.view.animation.Interpolator;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getTermsAndPrivacyPolicyFlowSettings {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<attachAppLovinSdk> IAuthTabCallback = new ArrayList();

    public final List<attachAppLovinSdk> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final void onNavigationEvent(@NotNull attachAppLovinSdk attachapplovinsdk, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
            attachapplovinsdk.onExtraCallback();
            throw null;
        }
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        Integer numOnExtraCallback = attachapplovinsdk.onExtraCallback();
        attachapplovinsdk.onExtraCallback((numOnExtraCallback != null ? numOnExtraCallback.intValue() : 0) + i);
        attachapplovinsdk.IAuthTabCallback(isVerboseLoggingEnabled.SERIAL);
        this.IAuthTabCallback.add(attachapplovinsdk);
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallback(@NotNull attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        List<attachAppLovinSdk> list = this.IAuthTabCallback;
        int size = list.size();
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                list.get(i2).asBinder().IAuthTabCallback();
                attachapplovinsdk.asBinder().IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            if (list.get(i2).asBinder().IAuthTabCallback() == attachapplovinsdk.asBinder().IAuthTabCallback()) {
                break;
            } else {
                i2++;
            }
        }
        if (attachapplovinsdk.asBinder().IAuthTabCallback() == setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled.Value || i2 < 0) {
            this.IAuthTabCallback.add(attachapplovinsdk);
            return;
        }
        int i4 = onNavigationEvent + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Float fIAuthTabCallbackDefault = attachapplovinsdk.asBinder().IAuthTabCallbackDefault();
        if (fIAuthTabCallbackDefault != null) {
            this.IAuthTabCallback.get(i2).IAuthTabCallback(fIAuthTabCallbackDefault.floatValue());
            int i6 = onNavigationEvent + 21;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        Float fAsInterface = attachapplovinsdk.asBinder().asInterface();
        if (fAsInterface != null) {
            int i8 = onNavigationEvent + 51;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                this.IAuthTabCallback.get(i2).onExtraCallbackWithResult(fAsInterface.floatValue());
            } else {
                this.IAuthTabCallback.get(i2).onExtraCallbackWithResult(fAsInterface.floatValue());
                throw null;
            }
        }
    }

    public final void onExtraCallback(@NotNull attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(isVerboseLoggingEnabled.PARALLEL);
        this.IAuthTabCallback.add(attachapplovinsdk);
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable Integer num, @Nullable Interpolator interpolator, int i, @Nullable Boolean bool) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<attachAppLovinSdk> list = this.IAuthTabCallback;
        int size = list.size();
        int i5 = 0;
        while (true) {
            Integer numValueOf = null;
            if (i5 >= size) {
                int i6 = onNavigationEvent + 71;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                numValueOf.hashCode();
                throw null;
            }
            int i7 = onWarmupCompleted + 5;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            attachAppLovinSdk attachapplovinsdk = list.get(i5);
            Integer numOnExtraCallback = attachapplovinsdk.onExtraCallback();
            if (numOnExtraCallback == null) {
                int i9 = onWarmupCompleted + 13;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    Integer.valueOf(i);
                    throw null;
                }
                numOnExtraCallback = Integer.valueOf(i);
            }
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            attachAppLovinSdk.onExtraCallback(iOnWarmupCompleted, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{attachapplovinsdk, numOnExtraCallback}, iOnWarmupCompleted2, -341507598, 341507598);
            if (attachapplovinsdk.IAuthTabCallback() != null) {
                numValueOf = attachapplovinsdk.IAuthTabCallback();
            } else if (num == null) {
                int i10 = onNavigationEvent;
                int i11 = i10 + 53;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    boolean z = interpolator instanceof deprecated_dns;
                    numValueOf.hashCode();
                    throw null;
                }
                if (interpolator instanceof deprecated_dns) {
                    numValueOf = Integer.valueOf(((deprecated_dns) interpolator).IAuthTabCallback());
                    int i12 = onWarmupCompleted + 97;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 4 / 5;
                    }
                } else if (interpolator instanceof AppLovinWebViewActivityaExternalSyntheticLambda0) {
                    int i14 = i10 + 91;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    numValueOf = 1000;
                }
            } else {
                numValueOf = num;
            }
            attachapplovinsdk.onNavigationEvent(numValueOf);
            Interpolator interpolatorOnNavigationEvent = attachapplovinsdk.onNavigationEvent();
            if (interpolatorOnNavigationEvent == null) {
                interpolatorOnNavigationEvent = interpolator;
            }
            attachapplovinsdk.onNavigationEvent(interpolatorOnNavigationEvent);
            Boolean boolOnExtraCallbackWithResult = attachapplovinsdk.onExtraCallbackWithResult();
            if (boolOnExtraCallbackWithResult == null) {
                int i16 = onNavigationEvent + 83;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                boolOnExtraCallbackWithResult = bool;
            }
            attachapplovinsdk.onExtraCallback(boolOnExtraCallbackWithResult);
            i5++;
        }
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int onExtraCallbackWithResult() {
        Integer numValueOf;
        int i = 2 % 2;
        List<attachAppLovinSdk> list = this.IAuthTabCallback;
        int i2 = 1;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).onTransact());
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i3 = onWarmupCompleted + 5;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 24 / 0;
                }
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).onTransact());
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        int i5 = onWarmupCompleted + 9;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        numValueOf = numValueOf2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return 0;
        }
        int i7 = onNavigationEvent + 9;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return numValueOf.intValue();
    }

    public final void onExtraCallback(@NotNull setCreativeDebuggerEnabled<?> setcreativedebuggerenabled, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setcreativedebuggerenabled, "");
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult() * f;
        List<attachAppLovinSdk> list = this.IAuthTabCallback;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = onNavigationEvent + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            attachAppLovinSdk attachapplovinsdk = list.get(i2);
            if (attachapplovinsdk.IAuthTabCallbackStub() == -1 || attachapplovinsdk.IAuthTabCallbackStub() >= fOnExtraCallbackWithResult) {
                float fCoerceAtMost = 1.0f;
                if (attachapplovinsdk.onTransact() > 0) {
                    fCoerceAtMost = RangesKt.coerceAtMost(fOnExtraCallbackWithResult / attachapplovinsdk.onTransact(), 1.0f);
                } else if (f == 0.0f) {
                    fCoerceAtMost = 0.0f;
                }
                attachAppLovinSdk.onExtraCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{attachapplovinsdk, setcreativedebuggerenabled, Float.valueOf(fCoerceAtMost)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 890616228, -890616224);
                int i5 = onNavigationEvent + 11;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            i2++;
            int i7 = onNavigationEvent + 55;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List<attachAppLovinSdk> list = this.IAuthTabCallback;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = onWarmupCompleted + 33;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                list.get(i4).IAuthTabCallbackDefault();
                i4 += 118;
            } else {
                list.get(i4).IAuthTabCallbackDefault();
                i4++;
            }
        }
        int i6 = onWarmupCompleted + 1;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }
}
