package o;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getDirectClickTrackingPostbacks {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private final List<Integer> IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final SurfaceProcessorNodeOut asBinder;
    private final int asInterface;
    private final List<Integer> onExtraCallback;
    private final List<Integer> onExtraCallbackWithResult;
    private final List<Integer> onNavigationEvent;
    private final List<r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8> onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.values().length];
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Digit.ordinal()] = 1;
                int i = onExtraCallback + 85;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Comma.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Dash.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog.Dot.ordinal()] = 4;
                int i4 = onExtraCallback + 25;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public /* synthetic */ getDirectClickTrackingPostbacks(String str, List list, int i, SurfaceProcessorNodeOut surfaceProcessorNodeOut, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, surfaceProcessorNodeOut, list2, list3, list4, list5);
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~((~i3) | i7);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i3)) | (~(i | i3));
        int i11 = i7 | i3;
        int i12 = i9 | i11;
        int i13 = i + i3 + i5 + ((-1542968645) * i2) + (1789173782 * i6);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i) + 752877568 + ((-368479342) * i3) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i5) + (1802502144 * i2) + (148897792 * i6) + (289275904 * i14);
        int i16 = (i * (-930071408)) + 1959937684 + (i3 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i5 * (-930070801)) + (i2 * 1059663509) + (i6 * (-1428764534)) + (i14 * 484573184);
        return i15 + ((i16 * i16) * 411172864) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 105;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getDirectClickTrackingPostbacks)) {
            return false;
        }
        getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks = (getDirectClickTrackingPostbacks) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, getdirectclicktrackingpostbacks.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.onWarmupCompleted, getdirectclicktrackingpostbacks.onWarmupCompleted) || !createCameraCaptureCallback.onExtraCallbackWithResult(this.asInterface, getdirectclicktrackingpostbacks.asInterface)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, getdirectclicktrackingpostbacks.asBinder)) {
            int i4 = IAuthTabCallbackDefault + 73;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, getdirectclicktrackingpostbacks.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, getdirectclicktrackingpostbacks.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onNavigationEvent, getdirectclicktrackingpostbacks.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, getdirectclicktrackingpostbacks.onExtraCallbackWithResult);
        }
        int i6 = IAuthTabCallbackDefault + 67;
        onTransact = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.IAuthTabCallbackStub.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + createCameraCaptureCallback.onExtraCallbackWithResult(this.asInterface)) * 31) + this.asBinder.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = IAuthTabCallbackDefault + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsRollingNumberV2Value(text=" + this.IAuthTabCallbackStub + ", chars=" + this.onWarmupCompleted + ", textAlign=" + createCameraCaptureCallback.onNavigationEvent(this.asInterface) + ", textLayoutResult=" + this.asBinder + ", digitIndices=" + this.onExtraCallback + ", commaIndices=" + this.IAuthTabCallback + ", dashIndices=" + this.onNavigationEvent + ", dotIndices=" + this.onExtraCallbackWithResult + ")";
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private getDirectClickTrackingPostbacks(String str, List<r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8> list, int i, SurfaceProcessorNodeOut surfaceProcessorNodeOut, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<Integer> list5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.IAuthTabCallbackStub = str;
        this.onWarmupCompleted = list;
        this.asInterface = i;
        this.asBinder = surfaceProcessorNodeOut;
        this.onExtraCallback = list2;
        this.IAuthTabCallback = list3;
        this.onNavigationEvent = list4;
        this.onExtraCallbackWithResult = list5;
    }

    public final List<r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        List<r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8> list = this.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return list;
    }

    public final SurfaceProcessorNodeOut IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = this.asBinder;
        int i4 = i3 + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return surfaceProcessorNodeOut;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks = (getDirectClickTrackingPostbacks) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        List<Integer> list = getdirectclicktrackingpostbacks.onNavigationEvent;
        int i5 = i3 + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<Integer> onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        List<Integer> list = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return list;
    }

    public final int asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.IAuthTabCallbackStub.length();
            obj.hashCode();
            throw null;
        }
        int length = this.IAuthTabCallbackStub.length();
        int i3 = IAuthTabCallbackDefault + 111;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return length;
        }
        obj.hashCode();
        throw null;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        List<Integer> list = this.onExtraCallback;
        if (i3 == 0) {
            return list.size();
        }
        list.size();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() {
        int size;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            size = this.IAuthTabCallback.size();
            int i3 = 27 / 0;
        } else {
            size = this.IAuthTabCallback.size();
        }
        int i4 = IAuthTabCallbackDefault + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onNavigationEvent.size();
        int i4 = IAuthTabCallbackDefault + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int size = this.onExtraCallbackWithResult.size();
        int i4 = onTransact + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<Integer> IAuthTabCallback(@NotNull r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
        int i2 = IAuthTabCallback.onExtraCallbackWithResult[r8lambdasffek4_3mtpbpfpmfomvpbvbnog.ordinal()];
        if (i2 == 1) {
            return this.onExtraCallback;
        }
        int i3 = IAuthTabCallbackDefault + 5;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0 ? i2 == 2 : i2 == 4) {
            return this.IAuthTabCallback;
        }
        int i5 = i4 + 119;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        if (i2 == 3) {
            return this.onNavigationEvent;
        }
        if (i2 == 4) {
            return this.onExtraCallbackWithResult;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int onWarmupCompleted(@NotNull r8lambdasFfek4_3mTPbPfPmFOmvpBVbnog r8lambdasffek4_3mtpbpfpmfomvpbvbnog) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdasffek4_3mtpbpfpmfomvpbvbnog, "");
        int i2 = IAuthTabCallback.onExtraCallbackWithResult[r8lambdasffek4_3mtpbpfpmfomvpbvbnog.ordinal()];
        if (i2 == 1) {
            return onNavigationEvent();
        }
        if (i2 == 2) {
            int iIAuthTabCallback = IAuthTabCallback();
            int i3 = onTransact + 73;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 == 3) {
            return onExtraCallback();
        }
        int i4 = IAuthTabCallbackDefault + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0 ? i2 != 4 : i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return IAuthTabCallbackDefault();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        return java.lang.Float.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r1 = ((int) (r1.asBinder.asBinder() >> 32)) - r6;
        r6 = o.getDirectClickTrackingPostbacks.onTransact + 125;
        o.getDirectClickTrackingPostbacks.IAuthTabCallbackDefault = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        if ((r6 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        r6 = 23 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        return java.lang.Float.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        return java.lang.Float.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (o.maybeHandleOnAttachedToWindow.onNavigationEvent(r1.asInterface) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (o.maybeHandleOnAttachedToWindow.onNavigationEvent(r1.asInterface) != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        float fOnExtraCallback;
        getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks = (getDirectClickTrackingPostbacks) objArr[0];
        r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8 = (r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdalx3rj1esitfhtyven8rvzvvaer8, "");
            fOnExtraCallback = getdirectclicktrackingpostbacks.asBinder.onExtraCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult(), false);
        } else {
            Intrinsics.checkNotNullParameter(r8lambdalx3rj1esitfhtyven8rvzvvaer8, "");
            fOnExtraCallback = getdirectclicktrackingpostbacks.asBinder.onExtraCallback(r8lambdalx3rj1esitfhtyven8rvzvvaer8.onExtraCallbackWithResult(), true);
        }
    }

    public final List<Integer> onExtraCallbackWithResult() {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return (List) onWarmupCompleted(-2018777196, matches.onExtraCallback(), 2018777196, iOnExtraCallback, iOnExtraCallback2, matches.onExtraCallback(), new Object[]{this});
    }

    public final float IAuthTabCallback(@NotNull r8lambdaLX3Rj1eSItFhTYVeN8rVZVVAer8 r8lambdalx3rj1esitfhtyven8rvzvvaer8) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return ((Float) onWarmupCompleted(-1940600513, matches.onExtraCallback(), 1940600514, iOnExtraCallback, iOnExtraCallback2, matches.onExtraCallback(), new Object[]{this, r8lambdalx3rj1esitfhtyven8rvzvvaer8})).floatValue();
    }
}
