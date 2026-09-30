package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda2;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda6;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda7;
import o.ExoPlayerImplExternalSyntheticLambda8;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RNSVGMarkerPosition {
    private static ArrayList<RNSVGMarkerPosition> IAuthTabCallbackDefault;
    private static ExoPlayerImplComponentListenerExternalSyntheticLambda6 IAuthTabCallbackStub;
    private static ExoPlayerImplComponentListenerExternalSyntheticLambda6 asBinder;
    private static ExoPlayerImplComponentListenerExternalSyntheticLambda6 asInterface;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static ExoPlayerImplComponentListenerExternalSyntheticLambda6 onTransact;
    RNSVGMarkerType IAuthTabCallback;
    ExoPlayerImplComponentListenerExternalSyntheticLambda6 onNavigationEvent;
    double onWarmupCompleted;

    private static double onExtraCallbackWithResult(double d) {
        return d * 57.29577951308232d;
    }

    private RNSVGMarkerPosition(RNSVGMarkerType rNSVGMarkerType, ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6, double d) {
        this.IAuthTabCallback = rNSVGMarkerType;
        this.onNavigationEvent = exoPlayerImplComponentListenerExternalSyntheticLambda6;
        this.onWarmupCompleted = d;
    }

    static ArrayList<RNSVGMarkerPosition> IAuthTabCallback(ArrayList<ExoPlayerImplComponentListenerExternalSyntheticLambda2> arrayList) {
        IAuthTabCallbackDefault = new ArrayList<>();
        onExtraCallback = 0;
        asInterface = new ExoPlayerImplComponentListenerExternalSyntheticLambda6(0.0d, 0.0d);
        IAuthTabCallbackStub = new ExoPlayerImplComponentListenerExternalSyntheticLambda6(0.0d, 0.0d);
        Iterator<ExoPlayerImplComponentListenerExternalSyntheticLambda2> it = arrayList.iterator();
        while (it.hasNext()) {
            onNavigationEvent(it.next());
        }
        onExtraCallbackWithResult();
        return IAuthTabCallbackDefault;
    }

    private static void onExtraCallbackWithResult() {
        RNSVGMarkerType rNSVGMarkerType = RNSVGMarkerType.kEndMarker;
        IAuthTabCallbackDefault.add(new RNSVGMarkerPosition(rNSVGMarkerType, asInterface, onExtraCallbackWithResult(rNSVGMarkerType)));
    }

    private static double onExtraCallbackWithResult(double d, double d2) {
        if (Math.abs(d - d2) > 180.0d) {
            d += 360.0d;
        }
        return (d + d2) / 2.0d;
    }

    private static double IAuthTabCallback(ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6) {
        return Math.atan2(exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallback, exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallbackWithResult);
    }

    private static double onExtraCallbackWithResult(RNSVGMarkerType rNSVGMarkerType) {
        double dOnExtraCallbackWithResult = onExtraCallbackWithResult(IAuthTabCallback(asBinder));
        double dOnExtraCallbackWithResult2 = onExtraCallbackWithResult(IAuthTabCallback(onTransact));
        int i = AnonymousClass1.IAuthTabCallback[rNSVGMarkerType.ordinal()];
        if (i == 1) {
            return onExtraCallbackWithResult ? dOnExtraCallbackWithResult2 + 180.0d : dOnExtraCallbackWithResult2;
        }
        if (i == 2) {
            return onExtraCallbackWithResult(dOnExtraCallbackWithResult, dOnExtraCallbackWithResult2);
        }
        if (i != 3) {
            return 0.0d;
        }
        return dOnExtraCallbackWithResult;
    }

    private static ExoPlayerImplComponentListenerExternalSyntheticLambda6 IAuthTabCallback(ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6, ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda62) {
        return new ExoPlayerImplComponentListenerExternalSyntheticLambda6(exoPlayerImplComponentListenerExternalSyntheticLambda62.onExtraCallbackWithResult - exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallbackWithResult, exoPlayerImplComponentListenerExternalSyntheticLambda62.onExtraCallback - exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallback);
    }

    private static boolean onExtraCallback(ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6) {
        return exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallbackWithResult == 0.0d && exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallback == 0.0d;
    }

    private static void onNavigationEvent(ExoPlayerImplComponentListenerExternalSyntheticLambda7 exoPlayerImplComponentListenerExternalSyntheticLambda7, ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6, ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda62, ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda63) {
        exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda62, exoPlayerImplComponentListenerExternalSyntheticLambda6);
        exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda63, exoPlayerImplComponentListenerExternalSyntheticLambda62);
        if (onExtraCallback(exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent)) {
            exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent = exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted;
        } else if (onExtraCallback(exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted)) {
            exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted = exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent;
        }
    }

    private static ExoPlayerImplComponentListenerExternalSyntheticLambda7 onExtraCallbackWithResult(ExoPlayerImplComponentListenerExternalSyntheticLambda2 exoPlayerImplComponentListenerExternalSyntheticLambda2) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda7 exoPlayerImplComponentListenerExternalSyntheticLambda7 = new ExoPlayerImplComponentListenerExternalSyntheticLambda7();
        ExoPlayerImplComponentListenerExternalSyntheticLambda6[] exoPlayerImplComponentListenerExternalSyntheticLambda6Arr = exoPlayerImplComponentListenerExternalSyntheticLambda2.IAuthTabCallback;
        int i = AnonymousClass1.onExtraCallback[exoPlayerImplComponentListenerExternalSyntheticLambda2.onNavigationEvent.ordinal()];
        if (i == 1) {
            exoPlayerImplComponentListenerExternalSyntheticLambda7.IAuthTabCallback = exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[2];
            exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[0], asInterface);
            exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[2], exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[1]);
            if (onExtraCallback(exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent)) {
                onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda7, exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[0], exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[1], exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[2]);
                return exoPlayerImplComponentListenerExternalSyntheticLambda7;
            }
            if (onExtraCallback(exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted)) {
                onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda7, asInterface, exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[0], exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[1]);
            }
        } else {
            if (i == 2) {
                ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6 = exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[1];
                exoPlayerImplComponentListenerExternalSyntheticLambda7.IAuthTabCallback = exoPlayerImplComponentListenerExternalSyntheticLambda6;
                onNavigationEvent(exoPlayerImplComponentListenerExternalSyntheticLambda7, asInterface, exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[0], exoPlayerImplComponentListenerExternalSyntheticLambda6);
                return exoPlayerImplComponentListenerExternalSyntheticLambda7;
            }
            if (i == 3 || i == 4) {
                ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda62 = exoPlayerImplComponentListenerExternalSyntheticLambda6Arr[0];
                exoPlayerImplComponentListenerExternalSyntheticLambda7.IAuthTabCallback = exoPlayerImplComponentListenerExternalSyntheticLambda62;
                exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda62, asInterface);
                exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda7.IAuthTabCallback, asInterface);
                return exoPlayerImplComponentListenerExternalSyntheticLambda7;
            }
            if (i == 5) {
                ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda63 = IAuthTabCallbackStub;
                exoPlayerImplComponentListenerExternalSyntheticLambda7.IAuthTabCallback = exoPlayerImplComponentListenerExternalSyntheticLambda63;
                exoPlayerImplComponentListenerExternalSyntheticLambda7.onNavigationEvent = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda63, asInterface);
                exoPlayerImplComponentListenerExternalSyntheticLambda7.onWarmupCompleted = IAuthTabCallback(exoPlayerImplComponentListenerExternalSyntheticLambda7.IAuthTabCallback, asInterface);
                return exoPlayerImplComponentListenerExternalSyntheticLambda7;
            }
        }
        return exoPlayerImplComponentListenerExternalSyntheticLambda7;
    }

    /* renamed from: com.horcrux.svg.RNSVGMarkerPosition$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IAuthTabCallback;
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[ExoPlayerImplExternalSyntheticLambda8.values().length];
            onExtraCallback = iArr;
            try {
                iArr[ExoPlayerImplExternalSyntheticLambda8.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda8.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda8.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda8.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda8.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[RNSVGMarkerType.values().length];
            IAuthTabCallback = iArr2;
            try {
                iArr2[RNSVGMarkerType.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IAuthTabCallback[RNSVGMarkerType.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IAuthTabCallback[RNSVGMarkerType.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static void onNavigationEvent(ExoPlayerImplComponentListenerExternalSyntheticLambda2 exoPlayerImplComponentListenerExternalSyntheticLambda2) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda7 exoPlayerImplComponentListenerExternalSyntheticLambda7OnExtraCallbackWithResult = onExtraCallbackWithResult(exoPlayerImplComponentListenerExternalSyntheticLambda2);
        onTransact = exoPlayerImplComponentListenerExternalSyntheticLambda7OnExtraCallbackWithResult.onNavigationEvent;
        int i = onExtraCallback;
        if (i > 0) {
            RNSVGMarkerType rNSVGMarkerType = i == 1 ? RNSVGMarkerType.kStartMarker : RNSVGMarkerType.kMidMarker;
            IAuthTabCallbackDefault.add(new RNSVGMarkerPosition(rNSVGMarkerType, asInterface, onExtraCallbackWithResult(rNSVGMarkerType)));
        }
        asBinder = exoPlayerImplComponentListenerExternalSyntheticLambda7OnExtraCallbackWithResult.onWarmupCompleted;
        asInterface = exoPlayerImplComponentListenerExternalSyntheticLambda7OnExtraCallbackWithResult.IAuthTabCallback;
        ExoPlayerImplExternalSyntheticLambda8 exoPlayerImplExternalSyntheticLambda8 = exoPlayerImplComponentListenerExternalSyntheticLambda2.onNavigationEvent;
        if (exoPlayerImplExternalSyntheticLambda8 == ExoPlayerImplExternalSyntheticLambda8.kCGPathElementMoveToPoint) {
            IAuthTabCallbackStub = exoPlayerImplComponentListenerExternalSyntheticLambda2.IAuthTabCallback[0];
        } else if (exoPlayerImplExternalSyntheticLambda8 == ExoPlayerImplExternalSyntheticLambda8.kCGPathElementCloseSubpath) {
            IAuthTabCallbackStub = new ExoPlayerImplComponentListenerExternalSyntheticLambda6(0.0d, 0.0d);
        }
        onExtraCallback++;
    }
}
