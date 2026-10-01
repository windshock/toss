package o;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.RVPub;
import o.requestAsync;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class requestAsync {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 10269;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static char onNavigationEvent = 24134;
    private static char onTransact = 19208;
    private static char onWarmupCompleted = 54976;
    private final List<RVPub> onExtraCallback;
    private final ConcurrentHashMap<RVPub, Integer> onExtraCallbackWithResult;

    public final /* synthetic */ class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[RVPub.values().length];
            try {
                iArr[RVPub.IMAGE_BRIGHTNESS_TOO_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RVPub.IMAGE_BRIGHTNESS_TOO_HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RVPub.FACE_TOO_BLURRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RVPub.FACE_MASK_DETECTED.ordinal()] = 4;
                int i = onExtraCallback + 39;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RVPub.FACE_SUNGLASSES_DETECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RVPub.FACE_OCCLUSION_DETECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RVPub.FACE_EYE_CLOSED_DETECTED.ordinal()] = 7;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RVPub.FACE_EULER_ANGLE_FAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RVPub.FACE_NON_NEUTRAL_EXPRESSION_DETECTED.ordinal()] = 9;
                int i5 = onExtraCallback + 97;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RVPub.FACE_RECOGNITION_QUALITY_LOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[RVPub.PRE_BRIGHTNESS_TOO_LOW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[RVPub.PRE_BRIGHTNESS_TOO_HIGH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[RVPub.INPUT_IMAGE_NOT_READY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[RVPub.INPUT_IMAGE_EMPTY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[RVPub.NO_FACE_IN_IMAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[RVPub.NO_MAIN_FACE_IN_IMAGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[RVPub.FACE_TOO_SMALL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[RVPub.FACE_TOO_BIG.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[RVPub.NEAR_SAME_SIZE_FACES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[RVPub.FACE_OUTSIDE_PREVIEW.ordinal()] = 20;
                int i7 = onExtraCallbackWithResult + 47;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[RVPub.FACE_FAR_FROM_CENTER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[RVPub.FACE_SIZE_UNSTABLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[RVPub.FACE_POSITION_UNSTABLE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[RVPub.FACE_POSE_UNSTABLE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[RVPub.UNKNOWN.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            onWarmupCompleted = iArr;
            int i10 = onExtraCallback + 49;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public static /* synthetic */ Integer IAuthTabCallback(RVPub rVPub, Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(rVPub, num);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer numOnWarmupCompleted = onWarmupCompleted(rVPub, num);
        int i3 = asInterface + 119;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
        return numOnWarmupCompleted;
    }

    public static /* synthetic */ Integer onExtraCallback(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(function2, obj, obj2);
        }
        onNavigationEvent(function2, obj, obj2);
        throw null;
    }

    public static /* synthetic */ Integer onExtraCallbackWithResult(Integer num, Integer num2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(num, num2);
            obj.hashCode();
            throw null;
        }
        Integer numOnExtraCallback = onExtraCallback(num, num2);
        int i3 = IAuthTabCallbackDefault + 113;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return numOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Integer onExtraCallbackWithResult(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        Integer num = (Integer) onNavigationEvent(iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 296731689, -296731688, iOnExtraCallbackWithResult2, new Object[]{function2, obj, obj2});
        int i4 = asInterface + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RVPub rVPub = (RVPub) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(rVPub, num);
        }
        onNavigationEvent(rVPub, num);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i) | i5);
        int i8 = ~((~i5) | i4);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i4) | i5));
        int i11 = i5 + i4 + i6 + (762724209 * i3) + (1201824936 * i2);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i5) + 43253760 + (1339426419 * i4) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i6) + (1302855680 * i3) + (1514143744 * i2) + (1905524736 * i12);
        int i14 = ((i5 * 162561953) - 555857873) + (i4 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i6 * 162560975) + (i3 * 701011807) + (i2 * 237771736) + (i12 * (-223608832));
        int i15 = i13 + (i14 * i14 * 703332352);
        return i15 != 1 ? i15 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnTransact = onTransact(function2, obj, obj2);
        int i4 = IAuthTabCallbackDefault + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return numOnTransact;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public requestAsync() {
        EnumEntries<RVPub> entries = RVPub.getEntries();
        ArrayList arrayList = new ArrayList();
        int i = 2 % 2;
        for (Object obj : entries) {
            if (onExtraCallback((RVPub) obj) != null) {
                arrayList.add(obj);
            }
        }
        List<RVPub> listSortedWith = CollectionsKt.sortedWith(arrayList, new IAuthTabCallback());
        this.onExtraCallback = listSortedWith;
        ConcurrentHashMap<RVPub, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        Iterator<T> it = listSortedWith.iterator();
        int i2 = asInterface + 97;
        IAuthTabCallbackDefault = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                this.onExtraCallbackWithResult = concurrentHashMap;
                int i4 = IAuthTabCallbackDefault + 77;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = asInterface + 69;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            concurrentHashMap.put(it.next(), 0);
            i2 = IAuthTabCallbackDefault + 99;
            asInterface = i2 % 128;
        }
    }

    public static final /* synthetic */ Integer onWarmupCompleted(requestAsync requestasync, RVPub rVPub) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnExtraCallback = requestasync.onExtraCallback(rVPub);
        int i4 = asInterface + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return numOnExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Integer onExtraCallback(RVPub rVPub) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = onNavigationEvent.onWarmupCompleted[rVPub.ordinal()];
            obj.hashCode();
            throw null;
        }
        switch (onNavigationEvent.onWarmupCompleted[rVPub.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                int i4 = IAuthTabCallbackDefault + 63;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 99 / 0;
                }
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return 8;
            case 10:
                return 9;
            case 11:
            case LiveCheckConstants.SVC_U1 /* 12 */:
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void onNavigationEvent(@NotNull RVPub rVPub) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rVPub, "");
        if (onExtraCallback(rVPub) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(rVPub);
            Object[] objArr = new Object[1];
            a(new char[]{56768, 6637, 21874, 55515, 54372, 42645, 16862, 51583, 48018, 25398, 41082, 58598, 37057, 56260, 54554, 4111, 46889, 23424, 2529, 17161, 51957, 48242, 19634, 14890, 46372, 60555, 3634, 20653, 12600, 59155, 29350, 40064, 10022, 10016, 31298, 17917, 12104, 56885, 62299, 63393, 59336, 42568, 21874, 55515, 45544, 14510, 19782, 9780, 26393, 56535}, View.resolveSize(0, 0) + 49, objArr);
            sb.append(((String) objArr[0]).intern());
            throw new IllegalArgumentException(sb.toString().toString());
        }
        ConcurrentHashMap<RVPub, Integer> concurrentHashMap = this.onExtraCallbackWithResult;
        final Function2 function2 = new Function2() { // from class: im.toss.facepay.validation.validations.FacePhotometricErrorVoter$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Integer numOnExtraCallbackWithResult = requestAsync.onExtraCallbackWithResult((Integer) obj, (Integer) obj2);
                int i7 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    return numOnExtraCallbackWithResult;
                }
                throw null;
            }
        };
        concurrentHashMap.merge(rVPub, 1, new BiFunction() { // from class: im.toss.facepay.validation.validations.FacePhotometricErrorVoter$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 53;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                Integer numOnExtraCallback = requestAsync.onExtraCallback(function2, obj, obj2);
                int i7 = onNavigationEvent + 11;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return numOnExtraCallback;
            }
        });
        int i4 = asInterface + 49;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Integer onExtraCallback(Integer num, Integer num2) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(num, "");
            Intrinsics.checkNotNullParameter(num2, "");
        } else {
            Intrinsics.checkNotNullParameter(num, "");
            Intrinsics.checkNotNullParameter(num2, "");
        }
        return Integer.valueOf(num.intValue() + num2.intValue());
    }

    private static final Integer onNavigationEvent(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) function2.invoke(obj, obj2);
        int i4 = asInterface + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public static final class IAuthTabCallback<T> implements Comparator {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public IAuthTabCallback() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(requestAsync.onWarmupCompleted(requestAsync.this, (RVPub) t), requestAsync.onWarmupCompleted(requestAsync.this, (RVPub) t2));
            int i4 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Integer onTransact(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) function2.invoke(obj, obj2);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    private static final Integer onWarmupCompleted(RVPub rVPub, Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rVPub, "");
        Intrinsics.checkNotNullParameter(num, "");
        int i4 = IAuthTabCallbackDefault + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    public final void onWarmupCompleted(@NotNull RVPub rVPub) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rVPub, "");
        ConcurrentHashMap<RVPub, Integer> concurrentHashMap = this.onExtraCallbackWithResult;
        final Function2 function2 = new Function2() { // from class: im.toss.facepay.validation.validations.FacePhotometricErrorVoter$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i3 % 128;
                RVPub rVPub2 = (RVPub) obj;
                Integer num = (Integer) obj2;
                if (i3 % 2 == 0) {
                    return requestAsync.IAuthTabCallback(rVPub2, num);
                }
                requestAsync.IAuthTabCallback(rVPub2, num);
                throw null;
            }
        };
        concurrentHashMap.computeIfPresent(rVPub, new BiFunction() { // from class: im.toss.facepay.validation.validations.FacePhotometricErrorVoter$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 39;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function2, obj, obj2};
                if (i4 == 0) {
                    int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
                    return (Integer) requestAsync.onNavigationEvent(iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), 1351358917, -1351358917, iOnExtraCallbackWithResult2, objArr);
                }
                int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = MaxNativeAdListener.onExtraCallbackWithResult();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackDefault + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 101;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 25;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                        int minimumFlingVelocity = 12434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), scrollBarFadeDuration, minimumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12434 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 16014), 14 - TextUtils.getOffsetBefore("", 0), 19901 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Integer onNavigationEvent(RVPub rVPub, Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rVPub, "");
        Intrinsics.checkNotNullParameter(num, "");
        int i4 = IAuthTabCallbackDefault + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) function2.invoke(obj, obj2);
        if (i3 == 0) {
            return num;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        ConcurrentHashMap<RVPub, Integer> concurrentHashMap = this.onExtraCallbackWithResult;
        final Function2 function2 = new Function2() { // from class: im.toss.facepay.validation.validations.FacePhotometricErrorVoter$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 11;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
                Integer num = (Integer) requestAsync.onNavigationEvent(iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -826765984, 826765986, iOnExtraCallbackWithResult2, new Object[]{(RVPub) obj, (Integer) obj2});
                int i5 = onExtraCallbackWithResult + 69;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 78 / 0;
                }
                return num;
            }
        };
        concurrentHashMap.replaceAll(new BiFunction() { // from class: im.toss.facepay.validation.validations.FacePhotometricErrorVoter$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    requestAsync.onExtraCallbackWithResult(function2, obj, obj2);
                    throw null;
                }
                Integer numOnExtraCallbackWithResult = requestAsync.onExtraCallbackWithResult(function2, obj, obj2);
                int i4 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return numOnExtraCallbackWithResult;
            }
        });
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
    }

    public final RVPub onExtraCallbackWithResult() {
        int iIntValue;
        int i = 2 % 2;
        Collection<Integer> collectionValues = this.onExtraCallbackWithResult.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Integer num = (Integer) CollectionsKt.maxOrNull(collectionValues);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int i2 = asInterface + 83;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            iIntValue = 0;
        }
        Object obj = null;
        if (iIntValue == 0) {
            int i4 = asInterface + 29;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        Iterator<T> it = this.onExtraCallback.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Integer num2 = this.onExtraCallbackWithResult.get(next);
            if (num2 != null) {
                int i6 = IAuthTabCallbackDefault + 23;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                if (num2.intValue() == iIntValue) {
                    obj = next;
                    break;
                }
            }
        }
        return (RVPub) obj;
    }

    public static /* synthetic */ Integer onWarmupCompleted(Function2 function2, Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (Integer) onNavigationEvent(iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1351358917, -1351358917, iOnExtraCallbackWithResult2, new Object[]{function2, obj, obj2});
    }

    public static /* synthetic */ Integer onExtraCallback(RVPub rVPub, Integer num) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (Integer) onNavigationEvent(iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -826765984, 826765986, iOnExtraCallbackWithResult2, new Object[]{rVPub, num});
    }

    private static final Integer IAuthTabCallback(Function2 function2, Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (Integer) onNavigationEvent(iOnExtraCallbackWithResult, MaxNativeAdListener.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 296731689, -296731688, iOnExtraCallbackWithResult2, new Object[]{function2, obj, obj2});
    }
}
