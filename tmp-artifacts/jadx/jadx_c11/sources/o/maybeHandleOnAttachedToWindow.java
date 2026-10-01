package o;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.createCameraCaptureCallback;
import o.getDirectClickTrackingPostbacks;
import o.maybeHandleOnAttachedToWindow;
import o.r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw;
import o.r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import o.r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ;
import o.unregisterViewsForInteraction;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maybeHandleOnAttachedToWindow {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.values().length];
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Digit.ordinal()] = 1;
                int i = onExtraCallback + 25;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Comma.ordinal()] = 2;
                int i3 = onExtraCallback + 93;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Dash.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Dot.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static /* synthetic */ r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ IAuthTabCallback(r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, boolean z, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, int i, int i2, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, boolean z2, getMainImageUri getmainimageuri, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, boolean z3) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqOnExtraCallback = onExtraCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8, getdirectclicktrackingpostbacks, onextracallback, z, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf0, i, i2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, z2, getmainimageuri, r8lambdavcsc4natdosbukwrq8lws1iglf02, z3);
        if (i5 != 0) {
            int i6 = 76 / 0;
        }
        int i7 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i2);
        int i8 = ~((~i2) | i4);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i4) | i2));
        int i11 = i2 + i4 + i5 + (762724209 * i6) + (1201824936 * i3);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i2) + 43253760 + (1339426419 * i4) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i5) + (1302855680 * i6) + (1514143744 * i3) + (1905524736 * i12);
        int i14 = ((i2 * 162561953) - 555857873) + (i4 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i5 * 162560975) + (i6 * 701011807) + (i3 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ onExtraCallbackWithResult(r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, boolean z, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, boolean z2, getMainImageUri getmainimageuri, boolean z3, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer82) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8, onextracallback, z, getdirectclicktrackingpostbacks, r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf02, z2, getmainimageuri, z3, r8lambdalx3rj1esitfhtyven8rvzvvaer82);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqOnExtraCallback = onExtraCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8, onextracallback, z, getdirectclicktrackingpostbacks, r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf02, z2, getmainimageuri, z3, r8lambdalx3rj1esitfhtyven8rvzvvaer82);
        int i3 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqOnExtraCallback;
    }

    public static /* synthetic */ r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ onNavigationEvent(r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, boolean z, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, boolean z2, getMainImageUri getmainimageuri, boolean z3) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(r8lambdalx3rj1esitfhtyven8rvzvvaer8, getdirectclicktrackingpostbacks, onextracallback, z, r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf02, z2, getmainimageuri, z3);
        }
        onWarmupCompleted(r8lambdalx3rj1esitfhtyven8rvzvvaer8, getdirectclicktrackingpostbacks, onextracallback, z, r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf02, z2, getmainimageuri, z3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted onExtraCallbackWithResult(float f, float f2, onItemClicked<Float> onitemclicked) {
        int i = 2 % 2;
        r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted onwarmupcompleted = new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted(new AppLovinSdk(f, f2), onitemclicked);
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted onwarmupcompleted = new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted(0.0f, 1.0f, (onItemClicked) objArr[0]);
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted onwarmupcompleted = new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted(1.0f, 0.0f, (onItemClicked) objArr[0]);
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    private static final unregisterViewsForInteraction onExtraCallback(boolean z, getMainImageUri getmainimageuri, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, boolean z2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer82) {
        Pair pairIAuthTabCallback;
        int iIntValue;
        int iOnWarmupCompleted;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onExtraCallbackWithResult(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent()) && r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onExtraCallbackWithResult(r8lambdalx3rj1esitfhtyven8rvzvvaer82.onNavigationEvent()) && r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback() == r8lambdalx3rj1esitfhtyven8rvzvvaer82.onExtraCallback() && !z) {
            return new unregisterViewsForInteraction.onWarmupCompleted(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback());
        }
        char cOnExtraCallback = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback();
        char cOnExtraCallback2 = r8lambdalx3rj1esitfhtyven8rvzvvaer82.onExtraCallback();
        if (r8lambdaqnruhkcodtafuc0ntuwc8jiscw.IAuthTabCallback()) {
            if (z2) {
                iIntValue = r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
                int i5 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iIntValue = getdirectclicktrackingpostbacks.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
            }
            iOnWarmupCompleted = onextracallback.onNavigationEvent();
            i = onNavigationEvent + 119;
        } else {
            if (r8lambdaqnruhkcodtafuc0ntuwc8jiscw.onExtraCallbackWithResult()) {
                int i7 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                pairIAuthTabCallback = getWrite.IAuthTabCallback(getdirectclicktrackingpostbacks2, Integer.valueOf(r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent()));
            } else {
                pairIAuthTabCallback = getWrite.IAuthTabCallback(getdirectclicktrackingpostbacks, Integer.valueOf(r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent()));
            }
            getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks3 = (getDirectClickTrackingPostbacks) pairIAuthTabCallback.onExtraCallbackWithResult();
            iIntValue = ((Number) pairIAuthTabCallback.IAuthTabCallback()).intValue();
            if (!(!z2)) {
                iIntValue = (getdirectclicktrackingpostbacks3.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent()) - 1;
            }
            iOnWarmupCompleted = onextracallback.onWarmupCompleted();
            i = onNavigationEvent + 39;
        }
        onExtraCallbackWithResult = i % 128;
        int i9 = i % 2;
        return new unregisterViewsForInteraction.onExtraCallbackWithResult(cOnExtraCallback, cOnExtraCallback2, getmainimageuri, onextracallback.onNavigationEvent(iIntValue * iOnWarmupCompleted));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list, List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog, Function1<? super r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8, r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> function1, Function0<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> function0) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = r8lambdavcsc4natdosbukwrq8lws1iglf0.IAuthTabCallback(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
        int iOnWarmupCompleted = getdirectclicktrackingpostbacks.onWarmupCompleted(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
        if (!r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onExtraCallbackWithResult(r8lambdasffek4_3mtpbpfpmfomvpbvbnog)) {
            int i4 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            list = list2;
        }
        if (iIAuthTabCallback >= 0) {
            int i6 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (iIAuthTabCallback < iOnWarmupCompleted) {
                list.add((r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) function1.invoke(getdirectclicktrackingpostbacks.onWarmupCompleted().get(getdirectclicktrackingpostbacks.IAuthTabCallback(r8lambdasffek4_3mtpbpfpmfomvpbvbnog).get(iIAuthTabCallback).intValue())));
                r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
            } else {
                list.add((r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) function0.invoke());
                if (iOnWarmupCompleted > 0 && iIAuthTabCallback < 0) {
                    int i8 = onExtraCallbackWithResult + 21;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
                        throw null;
                    }
                    r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
                }
            }
        }
        r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
        int i9 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 12 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[PHI: r4
      0x0053: PHI (r4v9 o.r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) = (r4v7 o.r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ), (r4v11 o.r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) binds: [B:16:0x0051, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[PHI: r4
      0x0057: PHI (r4v8 o.r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) = (r4v7 o.r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ), (r4v11 o.r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) binds: [B:16:0x0051, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1 r4
      0x0027: PHI (r1v5 int) = (r1v4 int), (r1v9 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r4v2 int) = (r4v1 int), (r4v13 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list, List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list2, r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog, Function0<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> function0) throws NoWhenBranchMatchedException {
        int iIAuthTabCallback;
        int iOnWarmupCompleted;
        r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            iIAuthTabCallback = r8lambdavcsc4natdosbukwrq8lws1iglf0.IAuthTabCallback(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
            iOnWarmupCompleted = getdirectclicktrackingpostbacks.onWarmupCompleted(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
            int i3 = 88 / 0;
            if (iIAuthTabCallback >= 0) {
                if (iIAuthTabCallback < iOnWarmupCompleted) {
                    int i4 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq = (r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) function0.invoke();
                        int i5 = 64 / 0;
                        if (r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onExtraCallbackWithResult(r8lambdasffek4_3mtpbpfpmfomvpbvbnog)) {
                            list.add(r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq);
                        } else {
                            list2.add(r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq);
                        }
                    } else {
                        r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq = (r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) function0.invoke();
                        if (!r8lambdazmdK5Aeq3EJkWJLcjaoC90W2ZHw.onExtraCallbackWithResult(r8lambdasffek4_3mtpbpfpmfomvpbvbnog)) {
                        }
                    }
                }
            }
        } else {
            iIAuthTabCallback = r8lambdavcsc4natdosbukwrq8lws1iglf0.IAuthTabCallback(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
            iOnWarmupCompleted = getdirectclicktrackingpostbacks.onWarmupCompleted(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
            if (iIAuthTabCallback >= 0) {
            }
        }
        r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent(r8lambdasffek4_3mtpbpfpmfomvpbvbnog);
        int i6 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r10.IAuthTabCallback() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r13 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r13 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r9 = r9 + 39;
        o.maybeHandleOnAttachedToWindow.onExtraCallbackWithResult = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if ((r9 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        r7 = r8.onNavigationEvent() % 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r7 = r8.onNavigationEvent() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r7 = r7 * r14.onWarmupCompleted();
        r8 = o.maybeHandleOnAttachedToWindow.onExtraCallbackWithResult + 85;
        o.maybeHandleOnAttachedToWindow.onNavigationEvent = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if ((!r10.IAuthTabCallback()) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int IAuthTabCallback(r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, boolean z, boolean z2, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback) {
        int i = 2 % 2;
        if (r8lambdavcsc4natdosbukwrq8lws1iglf0.onWarmupCompleted() < getdirectclicktrackingpostbacks.onExtraCallback() && getdirectclicktrackingpostbacks2.onExtraCallback() == 0) {
            int i2 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 26 / 0;
            }
        }
        if (getdirectclicktrackingpostbacks.onExtraCallback() == 0 && r8lambdavcsc4natdosbukwrq8lws1iglf02.onWarmupCompleted() < getdirectclicktrackingpostbacks2.onExtraCallback() && z) {
            if (z2) {
                return (getdirectclicktrackingpostbacks2.onNavigationEvent() - 1) * onextracallback.onWarmupCompleted();
            }
            return 0;
        }
        if (!r8lambdaqnruhkcodtafuc0ntuwc8jiscw.onNavigationEvent()) {
            if (((int) (getdirectclicktrackingpostbacks.IAuthTabCallbackStub().asBinder() >> 32)) < ((int) (getdirectclicktrackingpostbacks2.IAuthTabCallbackStub().asBinder() >> 32))) {
                if (z2) {
                    return (getdirectclicktrackingpostbacks.onNavigationEvent() - 1) * onextracallback.onWarmupCompleted();
                }
                return 0;
            }
            if (!(!r8lambdaqnruhkcodtafuc0ntuwc8jiscw.IAuthTabCallback())) {
                return onextracallback instanceof r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted ? ((r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted) onextracallback).onExtraCallback() * 20 : (r8lambdaqnruhkcodtafuc0ntuwc8jiscw.onWarmupCompleted() * 10) + 50;
            }
            if (!z2) {
                return 0;
            }
            return ((getdirectclicktrackingpostbacks2.asInterface() - ((Number) ((List) getDirectClickTrackingPostbacks.onWarmupCompleted(-2018777196, matches.onExtraCallback(), 2018777196, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks2})).get(r8lambdavcsc4natdosbukwrq8lws1iglf02.onWarmupCompleted())).intValue()) - 1) * onextracallback.onWarmupCompleted();
        }
        int i4 = onExtraCallbackWithResult + 29;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iOnNavigationEvent;
        int iOnNavigationEvent2 = 0;
        r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0 = (r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0) objArr[0];
        getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks = (getDirectClickTrackingPostbacks) objArr[1];
        getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2 = (getDirectClickTrackingPostbacks) objArr[2];
        r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw = (r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02 = (r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0) objArr[5];
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback = (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback) objArr[6];
        int i = 2 % 2;
        if (r8lambdavcsc4natdosbukwrq8lws1iglf0.onExtraCallback() >= getdirectclicktrackingpostbacks.IAuthTabCallbackDefault() || getdirectclicktrackingpostbacks2.IAuthTabCallbackDefault() != 0 || !r8lambdaqnruhkcodtafuc0ntuwc8jiscw.IAuthTabCallback()) {
            if (getdirectclicktrackingpostbacks2.IAuthTabCallbackDefault() > 0) {
                int i2 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (getdirectclicktrackingpostbacks.IAuthTabCallbackDefault() == 0) {
                    int i4 = onExtraCallbackWithResult + 3;
                    int i5 = i4 % 128;
                    onNavigationEvent = i5;
                    int i6 = i4 % 2;
                    if (zBooleanValue) {
                        int i7 = i5 + 113;
                        onExtraCallbackWithResult = i7 % 128;
                        iOnNavigationEvent = i7 % 2 != 0 ? getdirectclicktrackingpostbacks2.onNavigationEvent() + r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent() : getdirectclicktrackingpostbacks2.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent();
                        iOnNavigationEvent2 = iOnNavigationEvent - 1;
                    } else {
                        iOnNavigationEvent2 = r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent() + 1;
                    }
                } else {
                    Object obj = null;
                    if (r8lambdavcsc4natdosbukwrq8lws1iglf0.onExtraCallback() < getdirectclicktrackingpostbacks.IAuthTabCallbackDefault()) {
                        int i8 = onExtraCallbackWithResult + 47;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            getdirectclicktrackingpostbacks2.IAuthTabCallbackDefault();
                            obj.hashCode();
                            throw null;
                        }
                        if (getdirectclicktrackingpostbacks2.IAuthTabCallbackDefault() == 0 && !r8lambdaqnruhkcodtafuc0ntuwc8jiscw.IAuthTabCallback()) {
                            iOnNavigationEvent2 = zBooleanValue ? (getdirectclicktrackingpostbacks.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent()) - 1 : r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
                        } else if (getdirectclicktrackingpostbacks.onTransact().get(r8lambdavcsc4natdosbukwrq8lws1iglf0.onExtraCallback()).intValue() < getdirectclicktrackingpostbacks2.onTransact().get(r8lambdavcsc4natdosbukwrq8lws1iglf02.onExtraCallback()).intValue()) {
                            int i9 = onNavigationEvent + 65;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (!zBooleanValue) {
                                iOnNavigationEvent2 = getdirectclicktrackingpostbacks.onNavigationEvent();
                            }
                        } else if (zBooleanValue) {
                            iOnNavigationEvent2 = getdirectclicktrackingpostbacks.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
                            int i10 = onNavigationEvent + 51;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                        } else {
                            iOnNavigationEvent = r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent();
                            int i12 = onNavigationEvent + 115;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            iOnNavigationEvent2 = iOnNavigationEvent - 1;
                        }
                    }
                }
            }
        }
        return Integer.valueOf(iOnNavigationEvent2 * onextracallback.onWarmupCompleted());
    }

    private static final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted onExtraCallbackWithResult(getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer82, onItemClicked<Float> onitemclicked) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        float fFloatValue = ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, iOnExtraCallback, iOnExtraCallback2, matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue();
        int iOnExtraCallback3 = matches.onExtraCallback();
        int iOnExtraCallback4 = matches.onExtraCallback();
        r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(fFloatValue, ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, iOnExtraCallback3, iOnExtraCallback4, matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks2, r8lambdalx3rj1esitfhtyven8rvzvvaer82})).floatValue(), onitemclicked);
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompletedOnExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ onExtraCallback(r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, boolean z, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, boolean z2, getMainImageUri getmainimageuri, boolean z3, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer82) throws NoWhenBranchMatchedException {
        onItemClicked<Float> onitemclickedOnExtraCallback;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int iOnNavigationEvent3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdalx3rj1esitfhtyven8rvzvvaer82, "");
        int i2 = IAuthTabCallback.onExtraCallbackWithResult[r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent().ordinal()];
        if (i2 == 1) {
            return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(onExtraCallback(z2, getmainimageuri, onextracallback, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, z, r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf02, r8lambdalx3rj1esitfhtyven8rvzvvaer82, r8lambdalx3rj1esitfhtyven8rvzvvaer8), onExtraCallbackWithResult(getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer82, getdirectclicktrackingpostbacks2, r8lambdalx3rj1esitfhtyven8rvzvvaer8, onextracallback.onWarmupCompleted((z ? (getdirectclicktrackingpostbacks.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent()) - 1 : r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent()) * onextracallback.onWarmupCompleted())), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw) null, r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult(), 4, (DefaultConstructorMarker) null);
        }
        int i3 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0 ? i2 == 2 : i2 == 5) {
            char cOnExtraCallback = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback();
            if (z) {
                if (!(!r8lambdaqnruhkcodtafuc0ntuwc8jiscw.IAuthTabCallback())) {
                    int i4 = onNavigationEvent + 9;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    iOnNavigationEvent = getdirectclicktrackingpostbacks2.onNavigationEvent();
                    iOnNavigationEvent2 = r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent();
                } else {
                    iOnNavigationEvent = getdirectclicktrackingpostbacks.onNavigationEvent();
                    iOnNavigationEvent2 = r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
                }
                iOnNavigationEvent3 = (iOnNavigationEvent - iOnNavigationEvent2) - 1;
            } else {
                iOnNavigationEvent3 = r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent() + 1;
            }
            return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(cOnExtraCallback, onExtraCallbackWithResult(getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer82, getdirectclicktrackingpostbacks2, r8lambdalx3rj1esitfhtyven8rvzvvaer8, onextracallback.onWarmupCompleted(iOnNavigationEvent3 * onextracallback.onWarmupCompleted())), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw) null, r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult(), 4, (DefaultConstructorMarker) null);
        }
        if (i2 == 3) {
            return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback(), onExtraCallbackWithResult(getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer82, getdirectclicktrackingpostbacks2, r8lambdalx3rj1esitfhtyven8rvzvvaer8, onextracallback.onWarmupCompleted(IAuthTabCallback(r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, r8lambdavcsc4natdosbukwrq8lws1iglf02, z3, z, onextracallback))), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw) null, r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult(), 4, (DefaultConstructorMarker) null);
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        char cOnExtraCallback2 = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback();
        if (r8lambdalx3rj1esitfhtyven8rvzvvaer82.onExtraCallbackWithResult() == r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult()) {
            onitemclickedOnExtraCallback = onextracallback.onWarmupCompleted(((Integer) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, Boolean.valueOf(z), r8lambdavcsc4natdosbukwrq8lws1iglf02, onextracallback}, -903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue());
        } else if (r8lambdalx3rj1esitfhtyven8rvzvvaer82.onExtraCallbackWithResult() < r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult()) {
            onitemclickedOnExtraCallback = onextracallback.onNavigationEvent(Math.abs(getdirectclicktrackingpostbacks.onNavigationEvent() - getdirectclicktrackingpostbacks2.onNavigationEvent()), ((Integer) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, Boolean.valueOf(z), r8lambdavcsc4natdosbukwrq8lws1iglf02, onextracallback}, -903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue());
        } else {
            onitemclickedOnExtraCallback = onextracallback.onExtraCallback(Math.abs(getdirectclicktrackingpostbacks.onNavigationEvent() - getdirectclicktrackingpostbacks2.onNavigationEvent()), ((Integer) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, Boolean.valueOf(z), r8lambdavcsc4natdosbukwrq8lws1iglf02, onextracallback}, -903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue());
        }
        return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(cOnExtraCallback2, onExtraCallbackWithResult(getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer82, getdirectclicktrackingpostbacks2, r8lambdalx3rj1esitfhtyven8rvzvvaer8, onitemclickedOnExtraCallback), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw) null, r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult(), 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0122 A[PHI: r2
      0x0122: PHI (r2v22 float) = (r2v18 float), (r2v25 float) binds: [B:26:0x012d, B:22:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0124 A[PHI: r2
      0x0124: PHI (r2v19 float) = (r2v18 float), (r2v25 float) binds: [B:26:0x012d, B:22:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ onExtraCallback(r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, boolean z, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, int i, int i2, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, boolean z2, getMainImageUri getmainimageuri, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, boolean z3) throws NoWhenBranchMatchedException {
        int iOnNavigationEvent;
        int iOnWarmupCompleted;
        r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw onextracallback2;
        float f;
        float f2;
        onItemClicked<Float> onitemclickedOnExtraCallback;
        int iOnNavigationEvent2;
        int iOnWarmupCompleted2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback.onExtraCallbackWithResult[r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent().ordinal()];
        if (i4 == 1) {
            unregisterViewsForInteraction unregisterviewsforinteractionOnExtraCallback = onExtraCallback(z2, getmainimageuri, onextracallback, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, z, r8lambdavcsc4natdosbukwrq8lws1iglf02, getdirectclicktrackingpostbacks2, getdirectclicktrackingpostbacks, r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8.IAuthTabCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8, r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Comma, ' ', 0, 0, 12, null), r8lambdalx3rj1esitfhtyven8rvzvvaer8);
            float fFloatValue = ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue();
            if (z) {
                iOnNavigationEvent = (getdirectclicktrackingpostbacks2.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent()) - 1;
                iOnWarmupCompleted = onextracallback.onWarmupCompleted();
            } else {
                iOnNavigationEvent = r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
                iOnWarmupCompleted = onextracallback.onWarmupCompleted();
            }
            return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(unregisterviewsforinteractionOnExtraCallback, fFloatValue, (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onExtraCallbackWithResult(iOnNavigationEvent * iOnWarmupCompleted)}, 1862727346, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1862727345, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
        }
        int i5 = onNavigationEvent + 85;
        int i6 = i5 % 128;
        onExtraCallbackWithResult = i6;
        if (i5 % 2 == 0 ? i4 == 2 : i4 == 2) {
            char cOnExtraCallback = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback();
            float fFloatValue2 = ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue();
            if (z) {
                iOnNavigationEvent2 = getdirectclicktrackingpostbacks.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
                iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
            } else {
                iOnNavigationEvent2 = r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
                iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
            }
            return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(cOnExtraCallback, fFloatValue2, (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onExtraCallbackWithResult(iOnNavigationEvent2 * iOnWarmupCompleted2)}, 1862727346, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1862727345, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
        }
        int i7 = i6 + 43;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        if (i4 != 3) {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback(), ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue(), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onExtraCallbackWithResult(((Integer) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{r8lambdavcsc4natdosbukwrq8lws1iglf02, getdirectclicktrackingpostbacks2, getdirectclicktrackingpostbacks, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, Boolean.valueOf(z), r8lambdavcsc4natdosbukwrq8lws1iglf0, onextracallback}, -903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue())}, 1862727346, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1862727345, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
        }
        float fFloatValue3 = ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue();
        char cOnExtraCallback2 = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback();
        if (z) {
            int i9 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                f = i * i2;
                if (r8lambdaqnruhkcodtafuc0ntuwc8jiscw.onNavigationEvent()) {
                    f2 = f;
                    onitemclickedOnExtraCallback = onextracallback.onWarmupCompleted(IAuthTabCallback(r8lambdavcsc4natdosbukwrq8lws1iglf02, getdirectclicktrackingpostbacks2, getdirectclicktrackingpostbacks, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, r8lambdavcsc4natdosbukwrq8lws1iglf0, z3, z, onextracallback));
                } else {
                    f2 = f;
                    if (i < i2) {
                        onitemclickedOnExtraCallback = onextracallback.onNavigationEvent(r8lambdaqnruhkcodtafuc0ntuwc8jiscw.onExtraCallback(), IAuthTabCallback(r8lambdavcsc4natdosbukwrq8lws1iglf02, getdirectclicktrackingpostbacks2, getdirectclicktrackingpostbacks, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, r8lambdavcsc4natdosbukwrq8lws1iglf0, z3, z, onextracallback));
                    } else {
                        onitemclickedOnExtraCallback = onextracallback.onExtraCallback(r8lambdaqnruhkcodtafuc0ntuwc8jiscw.onExtraCallback(), IAuthTabCallback(r8lambdavcsc4natdosbukwrq8lws1iglf02, getdirectclicktrackingpostbacks2, getdirectclicktrackingpostbacks, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, r8lambdavcsc4natdosbukwrq8lws1iglf0, z3, z, onextracallback));
                    }
                }
            } else {
                f = i - i2;
                if (!r8lambdaqnruhkcodtafuc0ntuwc8jiscw.onNavigationEvent()) {
                }
            }
            onextracallback2 = onExtraCallbackWithResult(f2 + fFloatValue3, fFloatValue3, onitemclickedOnExtraCallback);
        } else {
            onextracallback2 = new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onExtraCallback(fFloatValue3);
        }
        return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(cOnExtraCallback2, onextracallback2, (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onExtraCallbackWithResult(IAuthTabCallback(r8lambdavcsc4natdosbukwrq8lws1iglf02, getdirectclicktrackingpostbacks2, getdirectclicktrackingpostbacks, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, r8lambdavcsc4natdosbukwrq8lws1iglf0, z3, z, onextracallback))}, 1862727346, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1862727345, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ onWarmupCompleted(r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, boolean z, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, boolean z2, getMainImageUri getmainimageuri, boolean z3) throws NoWhenBranchMatchedException {
        int iOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback.onExtraCallbackWithResult[r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent().ordinal()];
        if (i2 == 1) {
            r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq = new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(onExtraCallback(z2, getmainimageuri, onextracallback, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, z, r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf02, r8lambdalx3rj1esitfhtyven8rvzvvaer8, r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8.IAuthTabCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8, r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Comma, ' ', 0, 0, 12, null)), ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue(), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onExtraCallback((z ? r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent() : (getdirectclicktrackingpostbacks.onNavigationEvent() - r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent()) + 1) * onextracallback.onNavigationEvent())}, 1153820606, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1153820604, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
            int i3 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq;
        }
        int i5 = 0;
        if (i2 != 2) {
            if (i2 == 3) {
                r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq2 = new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback(), ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue(), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onExtraCallback(IAuthTabCallback(r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, r8lambdavcsc4natdosbukwrq8lws1iglf02, z3, z, onextracallback))}, 1153820606, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1153820604, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
                int i6 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 20 / 0;
                }
                return r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq2;
            }
            int i8 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback(), ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue(), (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onExtraCallback(((Integer) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, Boolean.valueOf(z), r8lambdavcsc4natdosbukwrq8lws1iglf02, onextracallback}, -903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue())}, 1153820606, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1153820604, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
        }
        char cOnExtraCallback = r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallback();
        float fFloatValue = ((Float) getDirectClickTrackingPostbacks.onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{getdirectclicktrackingpostbacks, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue();
        Object obj = null;
        if (z) {
            if (!r8lambdaqnruhkcodtafuc0ntuwc8jiscw.IAuthTabCallback()) {
                int i10 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
            } else {
                int i12 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i5 = -1;
            }
            iOnNavigationEvent = ((getdirectclicktrackingpostbacks2.IAuthTabCallback() - r8lambdavcsc4natdosbukwrq8lws1iglf02.onNavigationEvent()) - 1) + i5;
        } else {
            iOnNavigationEvent = r8lambdavcsc4natdosbukwrq8lws1iglf0.onNavigationEvent();
        }
        r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq3 = new r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(cOnExtraCallback, fFloatValue, (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback.onWarmupCompleted(iOnNavigationEvent * onextracallback.onWarmupCompleted())}, 1153820606, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1153820604, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult());
        int i13 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i13 % 128;
        if (i13 % 2 != 0) {
            return r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq3;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a2 A[PHI: r1 r3
      0x01a2: PHI (r1v19 int) = (r1v18 int), (r1v23 int) binds: [B:31:0x01a0, B:28:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x01a2: PHI (r3v11 int) = (r3v10 int), (r3v13 int) binds: [B:31:0x01a0, B:28:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf A[PHI: r1 r3
      0x01cf: PHI (r1v20 int) = (r1v18 int), (r1v23 int) binds: [B:31:0x01a0, B:28:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r3v12 int) = (r3v10 int), (r3v13 int) binds: [B:31:0x01a0, B:28:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final isDspAd onNavigationEvent(@NotNull final getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, @NotNull final getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, @NotNull final getMainImageUri getmainimageuri, @NotNull final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, final boolean z, int i, final boolean z2) {
        int i2;
        int i3;
        int iOnWarmupCompleted;
        int iOnExtraCallbackWithResult;
        int iOnExtraCallback;
        int iOnExtraCallbackWithResult2;
        int iOnWarmupCompleted2;
        int iAsInterface;
        int i4;
        int i5;
        int i6;
        final r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0;
        final r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02;
        ArrayList arrayList;
        ArrayList arrayList2;
        final r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw;
        final boolean z3;
        final int i7;
        final int i8;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback2;
        r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf03;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback3 = onextracallback;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(getdirectclicktrackingpostbacks, "");
        Intrinsics.checkNotNullParameter(getdirectclicktrackingpostbacks2, "");
        Intrinsics.checkNotNullParameter(getmainimageuri, "");
        Intrinsics.checkNotNullParameter(onextracallback3, "");
        int iAsBinder = (int) (getdirectclicktrackingpostbacks.IAuthTabCallbackStub().asBinder() >> 32);
        int iAsBinder2 = (int) (getdirectclicktrackingpostbacks2.IAuthTabCallbackStub().asBinder() >> 32);
        boolean zOnNavigationEvent = onNavigationEvent(i);
        r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw2 = new r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw(getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        final r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf04 = new r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0(getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, zOnNavigationEvent);
        r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf05 = new r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0(getdirectclicktrackingpostbacks2, getdirectclicktrackingpostbacks, zOnNavigationEvent);
        int iAsInterface2 = getdirectclicktrackingpostbacks.asInterface() > getdirectclicktrackingpostbacks2.asInterface() ? getdirectclicktrackingpostbacks.asInterface() : getdirectclicktrackingpostbacks2.asInterface();
        int i10 = 0;
        while (i10 < iAsInterface2) {
            final r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8 = (r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8) CollectionsKt.getOrNull(getdirectclicktrackingpostbacks.onWarmupCompleted(), r8lambdavcsc4natdosbukwrq8lws1iglf04.onExtraCallbackWithResult() + i10);
            final r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer82 = (r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8) CollectionsKt.getOrNull(getdirectclicktrackingpostbacks2.onWarmupCompleted(), r8lambdavcsc4natdosbukwrq8lws1iglf05.onExtraCallbackWithResult() + i10);
            if (r8lambdalx3rj1esitfhtyven8rvzvvaer82 != null) {
                i5 = i10;
                i6 = iAsInterface2;
                final boolean z4 = zOnNavigationEvent;
                r8lambdavcsc4natdosbukwrq8lws1iglf0 = r8lambdavcsc4natdosbukwrq8lws1iglf05;
                r8lambdavcsc4natdosbukwrq8lws1iglf02 = r8lambdavcsc4natdosbukwrq8lws1iglf04;
                arrayList = arrayList4;
                final r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw3 = r8lambdaqnruhkcodtafuc0ntuwc8jiscw2;
                arrayList2 = arrayList3;
                r8lambdaqnruhkcodtafuc0ntuwc8jiscw = r8lambdaqnruhkcodtafuc0ntuwc8jiscw2;
                z3 = zOnNavigationEvent;
                i7 = iAsBinder2;
                i8 = iAsBinder;
                onextracallback2 = onextracallback3;
                onWarmupCompleted(r8lambdavcsc4natdosbukwrq8lws1iglf02, getdirectclicktrackingpostbacks, arrayList2, arrayList, r8lambdavcsc4natdosbukwrq8lws1iglf0, r8lambdalx3rj1esitfhtyven8rvzvvaer82.onNavigationEvent(), new Function1() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2TransitionsKt$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                        int i11 = 2 % 2;
                        int i12 = onWarmupCompleted + 121;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqOnExtraCallbackWithResult = maybeHandleOnAttachedToWindow.onExtraCallbackWithResult(r8lambdalx3rj1esitfhtyven8rvzvvaer82, onextracallback, z4, getdirectclicktrackingpostbacks, r8lambdavcsc4natdosbukwrq8lws1iglf04, r8lambdaqnruhkcodtafuc0ntuwc8jiscw3, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf0, z, getmainimageuri, z2, (r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8) obj);
                        int i14 = onWarmupCompleted + 97;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        return r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqOnExtraCallbackWithResult;
                    }
                }, new Function0() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2TransitionsKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke() throws NoWhenBranchMatchedException {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 99;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqIAuthTabCallback = maybeHandleOnAttachedToWindow.IAuthTabCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer82, getdirectclicktrackingpostbacks2, onextracallback, z3, getdirectclicktrackingpostbacks, r8lambdavcsc4natdosbukwrq8lws1iglf0, i8, i7, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, z, getmainimageuri, r8lambdavcsc4natdosbukwrq8lws1iglf02, z2);
                        int i14 = onExtraCallbackWithResult + 49;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 6 / 0;
                        }
                        return r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoqIAuthTabCallback;
                    }
                });
            } else {
                i5 = i10;
                i6 = iAsInterface2;
                r8lambdavcsc4natdosbukwrq8lws1iglf0 = r8lambdavcsc4natdosbukwrq8lws1iglf05;
                r8lambdavcsc4natdosbukwrq8lws1iglf02 = r8lambdavcsc4natdosbukwrq8lws1iglf04;
                arrayList = arrayList4;
                arrayList2 = arrayList3;
                r8lambdaqnruhkcodtafuc0ntuwc8jiscw = r8lambdaqnruhkcodtafuc0ntuwc8jiscw2;
                z3 = zOnNavigationEvent;
                i7 = iAsBinder2;
                i8 = iAsBinder;
                onextracallback2 = onextracallback3;
            }
            if (r8lambdalx3rj1esitfhtyven8rvzvvaer8 == null) {
                r8lambdavcsc4natdosbukwrq8lws1iglf03 = r8lambdavcsc4natdosbukwrq8lws1iglf02;
            } else {
                if (z3 && r8lambdalx3rj1esitfhtyven8rvzvvaer82 == null) {
                    r8lambdavcsc4natdosbukwrq8lws1iglf03 = r8lambdavcsc4natdosbukwrq8lws1iglf02;
                } else if (!z3) {
                    r8lambdavcsc4natdosbukwrq8lws1iglf03 = r8lambdavcsc4natdosbukwrq8lws1iglf02;
                    if (r8lambdalx3rj1esitfhtyven8rvzvvaer8.IAuthTabCallback() + r8lambdavcsc4natdosbukwrq8lws1iglf03.onExtraCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent()) >= getdirectclicktrackingpostbacks2.onWarmupCompleted(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent())) {
                    }
                }
                final boolean z5 = z3;
                final r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf06 = r8lambdavcsc4natdosbukwrq8lws1iglf03;
                final r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw4 = r8lambdaqnruhkcodtafuc0ntuwc8jiscw;
                final r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf07 = r8lambdavcsc4natdosbukwrq8lws1iglf0;
                onWarmupCompleted(r8lambdavcsc4natdosbukwrq8lws1iglf03, getdirectclicktrackingpostbacks, arrayList2, arrayList, r8lambdalx3rj1esitfhtyven8rvzvvaer8.onNavigationEvent(), new Function0() { // from class: im.toss.tds.compose.component.anim.rollingnumber.TdsRollingNumberV2TransitionsKt$$ExternalSyntheticLambda2
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i11 = 2 % 2;
                        int i12 = onNavigationEvent + 1;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer83 = r8lambdalx3rj1esitfhtyven8rvzvvaer8;
                        getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks3 = getdirectclicktrackingpostbacks;
                        if (i13 != 0) {
                            return maybeHandleOnAttachedToWindow.onNavigationEvent(r8lambdalx3rj1esitfhtyven8rvzvvaer83, getdirectclicktrackingpostbacks3, onextracallback, z5, r8lambdavcsc4natdosbukwrq8lws1iglf06, r8lambdaqnruhkcodtafuc0ntuwc8jiscw4, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf07, z, getmainimageuri, z2);
                        }
                        int i14 = 24 / 0;
                        return maybeHandleOnAttachedToWindow.onNavigationEvent(r8lambdalx3rj1esitfhtyven8rvzvvaer83, getdirectclicktrackingpostbacks3, onextracallback, z5, r8lambdavcsc4natdosbukwrq8lws1iglf06, r8lambdaqnruhkcodtafuc0ntuwc8jiscw4, getdirectclicktrackingpostbacks2, r8lambdavcsc4natdosbukwrq8lws1iglf07, z, getmainimageuri, z2);
                    }
                });
            }
            i10 = i5 + 1;
            r8lambdavcsc4natdosbukwrq8lws1iglf04 = r8lambdavcsc4natdosbukwrq8lws1iglf03;
            onextracallback3 = onextracallback2;
            iAsInterface2 = i6;
            r8lambdavcsc4natdosbukwrq8lws1iglf05 = r8lambdavcsc4natdosbukwrq8lws1iglf0;
            arrayList4 = arrayList;
            arrayList3 = arrayList2;
            r8lambdaqnruhkcodtafuc0ntuwc8jiscw2 = r8lambdaqnruhkcodtafuc0ntuwc8jiscw;
            zOnNavigationEvent = z3;
            iAsBinder2 = i7;
            iAsBinder = i8;
        }
        ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = arrayList3;
        r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw5 = r8lambdaqnruhkcodtafuc0ntuwc8jiscw2;
        int i11 = iAsBinder2;
        int i12 = iAsBinder;
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback4 = onextracallback3;
        if (zOnNavigationEvent) {
            int i13 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 93 / 0;
                i2 = i11;
                i3 = i12;
                if (i3 < i2) {
                    if (r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.onNavigationEvent()) {
                        int i15 = onExtraCallbackWithResult + 91;
                        onNavigationEvent = i15 % 128;
                        if (i15 % 2 == 0) {
                            onextracallback.onWarmupCompleted();
                            getdirectclicktrackingpostbacks.onNavigationEvent();
                            throw null;
                        }
                        iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                        iAsInterface = getdirectclicktrackingpostbacks.onNavigationEvent();
                    } else {
                        iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                        iAsInterface = getdirectclicktrackingpostbacks.asInterface();
                    }
                } else if (r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.onNavigationEvent()) {
                    iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                    iAsInterface = getdirectclicktrackingpostbacks.onNavigationEvent();
                } else if (!(!r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.onExtraCallbackWithResult())) {
                    int i16 = onNavigationEvent + 61;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                    iAsInterface = getdirectclicktrackingpostbacks2.asInterface();
                } else if (onextracallback4 instanceof r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted) {
                    int i18 = onExtraCallbackWithResult + 105;
                    onNavigationEvent = i18 % 128;
                    if (i18 % 2 == 0) {
                        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted onwarmupcompleted = (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted) onextracallback4;
                        onwarmupcompleted.onExtraCallback();
                        onwarmupcompleted.onExtraCallbackWithResult();
                        throw null;
                    }
                    r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted onwarmupcompleted2 = (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted) onextracallback4;
                    iOnExtraCallback = onwarmupcompleted2.onExtraCallback();
                    iOnExtraCallbackWithResult2 = onwarmupcompleted2.onExtraCallbackWithResult();
                    i4 = iOnExtraCallback * iOnExtraCallbackWithResult2;
                } else {
                    iOnWarmupCompleted = r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.onWarmupCompleted();
                    iOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
                    i4 = (iOnWarmupCompleted * iOnExtraCallbackWithResult) + 50;
                }
                i4 = iOnWarmupCompleted2 * (iAsInterface - 1);
            } else {
                i2 = i11;
                i3 = i12;
                if (i3 < i2) {
                }
                i4 = iOnWarmupCompleted2 * (iAsInterface - 1);
            }
        } else {
            i2 = i11;
            i3 = i12;
            if (r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.onNavigationEvent()) {
                int i19 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                iAsInterface = getdirectclicktrackingpostbacks.onNavigationEvent();
            } else if (i3 < i2) {
                iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                iAsInterface = getdirectclicktrackingpostbacks.asInterface();
            } else if (!r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.IAuthTabCallback()) {
                iOnWarmupCompleted2 = onextracallback.onWarmupCompleted();
                iAsInterface = getdirectclicktrackingpostbacks2.asInterface();
            } else if (onextracallback4 instanceof r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted) {
                r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted onwarmupcompleted3 = (r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback.onWarmupCompleted) onextracallback4;
                iOnExtraCallback = onwarmupcompleted3.onExtraCallback();
                iOnExtraCallbackWithResult2 = onwarmupcompleted3.onExtraCallbackWithResult();
                i4 = iOnExtraCallback * iOnExtraCallbackWithResult2;
            } else {
                iOnWarmupCompleted = r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.onWarmupCompleted();
                iOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
                i4 = (iOnWarmupCompleted * iOnExtraCallbackWithResult) + 50;
            }
            i4 = iOnWarmupCompleted2 * (iAsInterface - 1);
        }
        return new isDspAd(onExtraCallbackWithResult(i3, i2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw5.onNavigationEvent() ? onextracallback4.onWarmupCompleted(i4) : i3 < i2 ? onextracallback4.onNavigationEvent(getdirectclicktrackingpostbacks2.onNavigationEvent() - getdirectclicktrackingpostbacks.onNavigationEvent(), i4) : onextracallback4.onExtraCallback(getdirectclicktrackingpostbacks.onNavigationEvent() - getdirectclicktrackingpostbacks2.onNavigationEvent(), i4)), arrayList6, arrayList5);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
      0x002b: PHI (r1v5 o.createCameraCaptureCallback$IAuthTabCallback) = (r1v4 o.createCameraCaptureCallback$IAuthTabCallback), (r1v8 o.createCameraCaptureCallback$IAuthTabCallback) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onNavigationEvent(int i) {
        createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            iAuthTabCallback = createCameraCaptureCallback.Companion;
            int i4 = 8 / 0;
            if (!createCameraCaptureCallback.onExtraCallbackWithResult(i, iAuthTabCallback.onExtraCallback())) {
                if (!createCameraCaptureCallback.onExtraCallbackWithResult(i, iAuthTabCallback.onNavigationEvent())) {
                    return false;
                }
            }
        } else {
            iAuthTabCallback = createCameraCaptureCallback.Companion;
            if (!createCameraCaptureCallback.onExtraCallbackWithResult(i, iAuthTabCallback.onExtraCallback())) {
            }
        }
        int i5 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return true;
    }

    private static final int onWarmupCompleted(r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf0, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2, r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw r8lambdaqnruhkcodtafuc0ntuwc8jiscw, boolean z, r8lambdaVcSC4nATdoSbUKWrQ8Lws1iGlF0 r8lambdavcsc4natdosbukwrq8lws1iglf02, r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback) {
        Object[] objArr = {r8lambdavcsc4natdosbukwrq8lws1iglf0, getdirectclicktrackingpostbacks, getdirectclicktrackingpostbacks2, r8lambdaqnruhkcodtafuc0ntuwc8jiscw, Boolean.valueOf(z), r8lambdavcsc4natdosbukwrq8lws1iglf02, onextracallback};
        return ((Integer) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 903467143, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent())).intValue();
    }

    private static final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted IAuthTabCallback(onItemClicked<Float> onitemclicked) {
        return (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onitemclicked}, 1153820606, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1153820604, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private static final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted onExtraCallbackWithResult(onItemClicked<Float> onitemclicked) {
        return (r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onWarmupCompleted) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onitemclicked}, 1862727346, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1862727345, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }
}
