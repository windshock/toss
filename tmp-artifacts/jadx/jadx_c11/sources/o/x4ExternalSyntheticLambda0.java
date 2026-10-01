package o;

import im.toss.tds.compose.component.compound.tab.v1.RightAccessoryPreset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.QuirkSettingsLoader;
import o.getStreamSharingChildren;
import o.r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA;
import o.x4ExternalSyntheticLambda0;
import o.x4ExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x4ExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final component5 onExtraCallback(@NotNull x4ExternalSyntheticLambda4.onExtraCallback onextracallback, boolean z, boolean z2, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1397935133, i, -1, "im.toss.tds.compose.component.compound.tab.v1.itemMeasurePolicy (ItemPreset.kt:337)");
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.onWarmupCompleted());
        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.asBinder());
        boolean z5 = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallback.ordinal())) || (i & 6) == 4;
        boolean z6 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) || (i & 48) == 32;
        if (((i & 896) ^ 384) > 256) {
            int i3 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z2)) {
                z3 = (i & 384) == 256;
            }
        }
        if (((i & 7168) ^ 3072) > 2048) {
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                    z4 = (i & 3072) == 2048;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
            }
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback.ordinal());
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted.ordinal());
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z5 | z6 | z3 | z4 | zOnExtraCallback | zOnExtraCallback2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, deviceQuirksExternalSyntheticLambda0, iAuthTabCallback, onwarmupcompleted);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        component5 component5Var = (component5) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return component5Var;
    }

    public static final class IAuthTabCallback implements component5 {
        private static int IAuthTabCallbackStub = 1;
        private static int onNavigationEvent;
        final /* synthetic */ DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback;
        final /* synthetic */ r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onExtraCallback;
        final /* synthetic */ r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback onExtraCallbackWithResult;
        final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onWarmupCompleted;

        public static final /* synthetic */ class onExtraCallbackWithResult {
            public static final /* synthetic */ int[] onExtraCallback;
            public static final /* synthetic */ int[] onExtraCallbackWithResult;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int[] iArr = new int[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.values().length];
                try {
                    iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Small.ordinal()] = 1;
                    int i = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Medium.ordinal()] = 2;
                    int i2 = onNavigationEvent + 49;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 3 / 4;
                    } else {
                        int i4 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                onExtraCallback = iArr;
                int[] iArr2 = new int[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.values().length];
                try {
                    iArr2[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Underline.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback.Square.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                onExtraCallbackWithResult = iArr2;
                int i5 = onNavigationEvent + 75;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        }

        IAuthTabCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted) {
            this.onWarmupCompleted = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
            this.IAuthTabCallback = deviceQuirksExternalSyntheticLambda0;
            this.onExtraCallbackWithResult = iAuthTabCallback;
            this.onExtraCallback = onwarmupcompleted;
        }

        public static /* synthetic */ Unit IAuthTabCallback(int i, int i2, component4 component4Var, int i3, int i4, getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren getstreamsharingchildren2, int i5, int i6, getStreamSharingChildren getstreamsharingchildren3, component7 component7Var, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, int i7, component7 component7Var2, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
            int i8 = 2 % 2;
            int i9 = onNavigationEvent + 61;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                return onNavigationEvent(i, i2, component4Var, i3, i4, getstreamsharingchildren, getstreamsharingchildren2, i5, i6, getstreamsharingchildren3, component7Var, iAuthTabCallback, i7, component7Var2, onwarmupcompleted, onextracallbackwithresult);
            }
            onNavigationEvent(i, i2, component4Var, i3, i4, getstreamsharingchildren, getstreamsharingchildren2, i5, i6, getstreamsharingchildren3, component7Var, iAuthTabCallback, i7, component7Var2, onwarmupcompleted, onextracallbackwithresult);
            throw null;
        }

        public final component8 onExtraCallbackWithResult(final component4 component4Var, List<? extends component7> list, long j) {
            Object next;
            Object next2;
            Object next3;
            int iCoerceAtLeast;
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback;
            final int iT_;
            getStreamSharingChildren getstreamsharingchildren;
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback2;
            int interfaceDescriptor;
            component7 component7Var;
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback3;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            IAuthTabCallback iAuthTabCallback = this;
            int i10 = 2 % 2;
            int i11 = IAuthTabCallbackStub + 51;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                Intrinsics.checkNotNullParameter(component4Var, "");
                Intrinsics.checkNotNullParameter(list, "");
                list.iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            List<? extends component7> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult((component7) next) == x4ExternalSyntheticLambda4.onWarmupCompleted.Content) {
                    break;
                }
                iAuthTabCallback = this;
            }
            component7 component7Var2 = (component7) next;
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult((component7) next2) == x4ExternalSyntheticLambda4.onWarmupCompleted.RedDot) {
                    break;
                }
            }
            component7 component7Var3 = (component7) next2;
            Iterator<T> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                component7 component7Var4 = (component7) next3;
                if (ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var4) != x4ExternalSyntheticLambda4.onWarmupCompleted.Content) {
                    int i12 = onNavigationEvent + 103;
                    IAuthTabCallbackStub = i12 % 128;
                    if (i12 % 2 == 0) {
                        ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var4);
                        x4ExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted = x4ExternalSyntheticLambda4.onWarmupCompleted.RedDot;
                        throw null;
                    }
                    if (ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var4) != x4ExternalSyntheticLambda4.onWarmupCompleted.RedDot && ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var4) != null) {
                        break;
                    }
                }
            }
            final component7 component7Var5 = (component7) next3;
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = iAuthTabCallback.onWarmupCompleted;
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = iAuthTabCallback.IAuthTabCallback;
            int iOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onNavigationEvent(component4Var.onExtraCallback())) + r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(component4Var.onExtraCallback()));
            int iOnExtraCallbackWithResult2 = iAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(iAuthTabCallback.IAuthTabCallback.IAuthTabCallback());
            int iOnExtraCallbackWithResult3 = iAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(iAuthTabCallback.IAuthTabCallback.onExtraCallback());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = iAuthTabCallback.onWarmupCompleted;
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback.onExtraCallbackWithResult;
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted2 = iAuthTabCallback.onExtraCallback;
            r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU r8lambdawgmlot4gzpqjk3abw8ehrhrqxu = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted;
            int iOnExtraCallbackWithResult4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42.onExtraCallbackWithResult(((Float) r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onExtraCallback(new Object[]{r8lambdawgmlot4gzpqjk3abw8ehrhrqxu, iAuthTabCallback2, onwarmupcompleted2}, matches.onExtraCallback(), 2113847836, matches.onExtraCallback(), matches.onExtraCallback(), -2113847833, matches.onExtraCallback())).floatValue());
            int iOnExtraCallbackWithResult5 = iAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallback(iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallback));
            int iAsInterface = VirtualCameraCaptureResult.asInterface(j);
            if (iAsInterface == Integer.MAX_VALUE) {
                int i13 = onNavigationEvent + 63;
                IAuthTabCallbackStub = i13 % 128;
                int i14 = i13 % 2;
                iCoerceAtLeast = Integer.MAX_VALUE;
            } else {
                iCoerceAtLeast = RangesKt.coerceAtLeast(iAsInterface - iOnExtraCallbackWithResult, 0);
            }
            if (component7Var2 != null) {
                int i15 = IAuthTabCallbackStub + 75;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    i6 = 0;
                    i7 = 1;
                    i8 = 1;
                    i9 = 94;
                } else {
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    i9 = 13;
                }
                getstreamsharingchildrenOnExtraCallback = component7Var2.onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(i6, iCoerceAtLeast, i7, i8, i9, (Object) null));
            } else {
                getstreamsharingchildrenOnExtraCallback = null;
            }
            int interfaceDescriptor2 = getstreamsharingchildrenOnExtraCallback != null ? getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor() : 0;
            if (getstreamsharingchildrenOnExtraCallback != null) {
                int i16 = onNavigationEvent + 19;
                IAuthTabCallbackStub = i16 % 128;
                if (i16 % 2 == 0) {
                    getstreamsharingchildrenOnExtraCallback.T_();
                    throw null;
                }
                iT_ = getstreamsharingchildrenOnExtraCallback.T_();
            } else {
                iT_ = 0;
            }
            int iCoerceAtLeast2 = iCoerceAtLeast != Integer.MAX_VALUE ? RangesKt.coerceAtLeast(iCoerceAtLeast - interfaceDescriptor2, 0) : Integer.MAX_VALUE;
            if (component7Var5 != null) {
                getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                getstreamsharingchildrenOnExtraCallback2 = component7Var5.onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(0, iCoerceAtLeast2, 0, 0, 13, (Object) null));
            } else {
                getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                getstreamsharingchildrenOnExtraCallback2 = null;
            }
            if (getstreamsharingchildrenOnExtraCallback2 != null) {
                int i17 = IAuthTabCallbackStub + 125;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                interfaceDescriptor = getstreamsharingchildrenOnExtraCallback2.getInterfaceDescriptor();
            } else {
                interfaceDescriptor = 0;
            }
            final int iT_2 = getstreamsharingchildrenOnExtraCallback2 != null ? getstreamsharingchildrenOnExtraCallback2.T_() : 0;
            if (component7Var3 != null) {
                int i19 = IAuthTabCallbackStub + 31;
                component7Var = component7Var2;
                onNavigationEvent = i19 % 128;
                if (i19 % 2 != 0) {
                    i = 0;
                    i2 = 1;
                    i3 = 0;
                    i4 = 0;
                    i5 = 122;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 15;
                }
                getstreamsharingchildrenOnExtraCallback3 = component7Var3.onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.IAuthTabCallback(i, i2, i3, i4, i5, (Object) null));
            } else {
                component7Var = component7Var2;
                getstreamsharingchildrenOnExtraCallback3 = null;
            }
            final int i20 = interfaceDescriptor2 + interfaceDescriptor;
            int iMax = Math.max(iT_, iT_2);
            final int iCoerceAtLeast3 = RangesKt.coerceAtLeast(iOnExtraCallbackWithResult + i20, iOnExtraCallbackWithResult4);
            final int iCoerceAtLeast4 = RangesKt.coerceAtLeast(iMax + iOnExtraCallbackWithResult2 + iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult5);
            final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback.onExtraCallbackWithResult;
            final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted3 = iAuthTabCallback.onExtraCallback;
            final getStreamSharingChildren getstreamsharingchildren2 = getstreamsharingchildren;
            final getStreamSharingChildren getstreamsharingchildren3 = getstreamsharingchildrenOnExtraCallback2;
            final int i21 = interfaceDescriptor2;
            final getStreamSharingChildren getstreamsharingchildren4 = getstreamsharingchildrenOnExtraCallback3;
            final component7 component7Var6 = component7Var;
            final int i22 = interfaceDescriptor;
            return component4.IAuthTabCallback(component4Var, iCoerceAtLeast3, iCoerceAtLeast4, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPresetKt$itemMeasurePolicy$1$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) throws NoWhenBranchMatchedException {
                    int i23 = 2 % 2;
                    int i24 = IAuthTabCallback + 31;
                    onNavigationEvent = i24 % 128;
                    int i25 = i24 % 2;
                    Unit unitIAuthTabCallback = x4ExternalSyntheticLambda0.IAuthTabCallback.IAuthTabCallback(i20, iCoerceAtLeast3, component4Var, iT_, iCoerceAtLeast4, getstreamsharingchildren2, getstreamsharingchildren3, i21, iT_2, getstreamsharingchildren4, component7Var5, iAuthTabCallback3, i22, component7Var6, onwarmupcompleted3, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                    int i26 = onNavigationEvent + 59;
                    IAuthTabCallback = i26 % 128;
                    int i27 = i26 % 2;
                    return unitIAuthTabCallback;
                }
            }, 4, (Object) null);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onNavigationEvent(int i, int i2, component4 component4Var, int i3, int i4, getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren getstreamsharingchildren2, int i5, int i6, getStreamSharingChildren getstreamsharingchildren3, component7 component7Var, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback, int i7, component7 component7Var2, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
            Object objOnExtraCallbackWithResult;
            float fIAuthTabCallback;
            int i8;
            float fIAuthTabCallback2;
            int i9 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            int iOnExtraCallback = onextracallbackwithresult2.onTransact().onExtraCallback(i, i2, component4Var.onExtraCallback());
            int iOnExtraCallbackWithResult = onextracallbackwithresult2.IAuthTabCallbackDefault().onExtraCallbackWithResult(i3, i4);
            if (getstreamsharingchildren != null) {
                int i10 = IAuthTabCallbackStub + 35;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, iOnExtraCallback, iOnExtraCallbackWithResult, 0.0f, 4, (Object) null);
            }
            if (getstreamsharingchildren2 != null) {
                getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, iOnExtraCallback + i5, onextracallbackwithresult2.IAuthTabCallbackDefault().onExtraCallbackWithResult(i6, i4), 0.0f, 4, (Object) null);
            }
            if (getstreamsharingchildren3 != null) {
                int i12 = IAuthTabCallbackStub;
                int i13 = i12 + 89;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                if (component7Var != null) {
                    int i15 = i12 + 33;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 != 0) {
                        ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var);
                        objOnExtraCallbackWithResult.hashCode();
                        throw null;
                    }
                    objOnExtraCallbackWithResult = ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var);
                } else {
                    objOnExtraCallbackWithResult = null;
                }
                float fOnExtraCallback = Intrinsics.areEqual(objOnExtraCallbackWithResult, "MediumNumber") ? RightAccessoryPreset.onNavigationEvent.onExtraCallback() : Intrinsics.areEqual(objOnExtraCallbackWithResult, "SmallNumber") ? RightAccessoryPreset.onNavigationEvent.IAuthTabCallback() : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                int i16 = onExtraCallbackWithResult.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
                if (i16 != 1) {
                    int i17 = IAuthTabCallbackStub + 59;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objOnExtraCallbackWithResult2 = component7Var != null ? ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var) : null;
                    if (Intrinsics.areEqual(objOnExtraCallbackWithResult2, "MediumNumber") || Intrinsics.areEqual(objOnExtraCallbackWithResult2, "SmallNumber")) {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                        i8 = onExtraCallbackWithResult.onExtraCallback[onwarmupcompleted.ordinal()];
                        if (i8 != 1) {
                            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i19 = IAuthTabCallbackStub + 111;
                            onNavigationEvent = i19 % 128;
                            int i20 = i19 % 2;
                            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                        }
                        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, iOnExtraCallback + i + onextracallbackwithresult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallback + fIAuthTabCallback)), onextracallbackwithresult.onExtraCallbackWithResult(fIAuthTabCallback2), 0.0f, 4, (Object) null);
                    } else {
                        objOnExtraCallbackWithResult = component7Var2 != null ? ImmediateFutureImmediateSuccessfulFuture.onExtraCallbackWithResult(component7Var2) : null;
                        if (objOnExtraCallbackWithResult != x4ExternalSyntheticLambda4.onExtraCallback.Text) {
                            int i21 = IAuthTabCallbackStub + 125;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            fIAuthTabCallback = objOnExtraCallbackWithResult == x4ExternalSyntheticLambda4.onExtraCallback.Icon ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f);
                        }
                        i8 = onExtraCallbackWithResult.onExtraCallback[onwarmupcompleted.ordinal()];
                        if (i8 != 1) {
                        }
                        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, iOnExtraCallback + i + onextracallbackwithresult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallback + fIAuthTabCallback)), onextracallbackwithresult.onExtraCallbackWithResult(fIAuthTabCallback2), 0.0f, 4, (Object) null);
                    }
                } else {
                    getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren3, onextracallbackwithresult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallback + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f))) + iOnExtraCallback + i5 + i7, onextracallbackwithresult.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)) + iOnExtraCallbackWithResult, 0.0f, 4, (Object) null);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i23 = onNavigationEvent + 125;
            IAuthTabCallbackStub = i23 % 128;
            int i24 = i23 % 2;
            return unit;
        }
    }
}
