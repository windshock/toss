package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.feed.data.dto.ContentId;
import im.toss.features.feed.data.dto.GetUserInfoResp;
import im.toss.features.feed.data.dto.SetReadReq;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.splittarget.impl.feed.InboxImpl$;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getTimestampBytes;
import o.trackAndLaunchClick;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackAndLaunchClick implements AppLovinSdkInitializationConfigurationImpl {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static long IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static final String onExtraCallbackWithResult;
    private final drawProgress<Integer> IAuthTabCallback;
    private final updateLoadParamUrl IAuthTabCallbackDefault;
    private final boolean onExtraCallback;
    private final String onNavigationEvent;
    private final Lazy onTransact;
    private final Lazy onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{60914, 22643, 34559, 52593, 15343, 26198, 44228, 6979, 16842, 35844, 64232, 8547, 28595, 55871, 134, 20236}, 46470 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Companion = new onNavigationEvent(null);
        int i = IAuthTabCallbackStubProxy + 117;
        access100 = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1858553294, iOnExtraCallbackWithResult3, 1858553295, new Object[]{th});
        int i4 = asInterface + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getTimestampBytes IAuthTabCallback(trackAndLaunchClick trackandlaunchclick) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(trackandlaunchclick);
            throw null;
        }
        getTimestampBytes gettimestampbytesOnNavigationEvent = onNavigationEvent(trackandlaunchclick);
        int i3 = asBinder + 93;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return gettimestampbytesOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asBinder + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        trackAndLaunchClick trackandlaunchclick = (trackAndLaunchClick) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(trackandlaunchclick, num);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        int i5 = asInterface + 107;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -51356661, iOnExtraCallbackWithResult3, 51356661, new Object[]{function1, obj});
        int i4 = asBinder + 103;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        trackAndLaunchClick trackandlaunchclick = (trackAndLaunchClick) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(trackandlaunchclick, str);
        }
        IAuthTabCallback(trackandlaunchclick, str);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = asBinder + 79;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        Unit unit = (Unit) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 25;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzgc.onExtraCallbackWithResult();
        Unit unit2 = (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, -493234538, iOnExtraCallbackWithResult6, 493234546, new Object[]{function0, unit});
        int i3 = asInterface + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(th);
        int i4 = asInterface + 65;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(trackAndLaunchClick trackandlaunchclick, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(trackandlaunchclick, baseApiResponse);
        int i4 = asInterface + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1240334278, iOnExtraCallbackWithResult3, -1240334276, new Object[]{function1, obj});
        int i4 = asInterface + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(th);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i3 = asBinder + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 35;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = i4 | i7;
        int i9 = (~(i6 | i3)) | i4;
        int i10 = ~i6;
        int i11 = (~(i3 | i6 | i4)) | (~(i7 | i10)) | (~((~i4) | i10));
        int i12 = i6 + i4 + i2 + (1609234610 * i5) + (1307081305 * i);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i6) - 1772093440) + (1576585830 * i4) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i2) + ((-2101346304) * i5) + (23068672 * i) + ((-2103967744) * i13);
        int i15 = (i6 * 273352028) + 245730370 + (i4 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i2 * 273352337) + (i5 * (-770635566)) + (i * (-73506199)) + (i13 * (-2011693056));
        switch (i14 + (i15 * i15 * 1080557568)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                trackAndLaunchClick trackandlaunchclick = (trackAndLaunchClick) objArr[0];
                BaseApiResponse baseApiResponse = (BaseApiResponse) objArr[1];
                int i16 = 2 % 2;
                int i17 = asInterface + 39;
                asBinder = i17 % 128;
                int i18 = i17 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(trackandlaunchclick, baseApiResponse);
                int i19 = asBinder + 123;
                asInterface = i19 % 128;
                int i20 = i19 % 2;
                return unitOnWarmupCompleted;
            case 8:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(th);
        int i4 = asBinder + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(trackAndLaunchClick trackandlaunchclick, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(trackandlaunchclick, baseApiResponse);
        int i4 = asBinder + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        int i4 = asBinder + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = asInterface + 79;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(th);
        int i4 = asBinder + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, th);
        int i4 = asBinder + 59;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(trackAndLaunchClick trackandlaunchclick, Integer num, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(trackandlaunchclick, num, setDetectableSize);
        int i4 = asInterface + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ access27100 onWarmupCompleted(trackAndLaunchClick trackandlaunchclick) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        access27100 access27100Var = (access27100) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1615100707, iOnExtraCallbackWithResult3, -1615100704, new Object[]{trackandlaunchclick});
        int i4 = asBinder + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return access27100Var;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = asBinder + 79;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    @Inject
    public trackAndLaunchClick(@NotNull updateLoadParamUrl updateloadparamurl) {
        Intrinsics.checkNotNullParameter(updateloadparamurl, "");
        this.IAuthTabCallbackDefault = updateloadparamurl;
        this.onNavigationEvent = AppLovinSdkInitializationConfigurationImpl.class.getSimpleName();
        this.IAuthTabCallback = new drawProgress<>(0);
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda20
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                trackAndLaunchClick trackandlaunchclick = this.f$0;
                if (i3 != 0) {
                    return trackAndLaunchClick.onWarmupCompleted(trackandlaunchclick);
                }
                trackAndLaunchClick.onWarmupCompleted(trackandlaunchclick);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda21
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                getTimestampBytes gettimestampbytesIAuthTabCallback;
                int i = 2 % 2;
                int i2 = onExtraCallback + 95;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    gettimestampbytesIAuthTabCallback = trackAndLaunchClick.IAuthTabCallback(this.f$0);
                    int i3 = 52 / 0;
                } else {
                    gettimestampbytesIAuthTabCallback = trackAndLaunchClick.IAuthTabCallback(this.f$0);
                }
                int i4 = onWarmupCompleted + 47;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return gettimestampbytesIAuthTabCallback;
            }
        });
    }

    private final access27100<Integer> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        access27100<Integer> access27100Var = (access27100) this.onTransact.getValue();
        int i4 = asBinder + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return access27100Var;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final trackAndLaunchClick trackandlaunchclick = (trackAndLaunchClick) objArr[0];
        int i = 2 % 2;
        access27100 access27100VarIAuthTabCallback = access27100.IAuthTabCallback(0);
        Intrinsics.checkNotNull(access27100VarIAuthTabCallback);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = access27100VarIAuthTabCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 125;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                trackAndLaunchClick trackandlaunchclick2 = this.f$0;
                Integer num = (Integer) obj;
                if (i4 == 0) {
                    int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
                    return (Unit) trackAndLaunchClick.onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 712300781, iOnExtraCallbackWithResult3, -712300775, new Object[]{trackandlaunchclick2, num});
                }
                int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult5 = zzgc.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult6 = zzgc.onExtraCallbackWithResult();
                Unit unit = (Unit) trackAndLaunchClick.onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult4, 712300781, iOnExtraCallbackWithResult6, -712300775, new Object[]{trackandlaunchclick2, num});
                int i5 = 34 / 0;
                return unit;
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda13
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 101;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                trackAndLaunchClick.onExtraCallback(function1, obj);
                int i5 = onExtraCallbackWithResult + 57;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        };
        final Function1 function12 = new Function1() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 21;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = trackAndLaunchClick.onNavigationEvent((Throwable) obj);
                int i5 = IAuthTabCallback + 35;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        };
        jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                trackAndLaunchClick.onNavigationEvent(function12, obj);
                int i5 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asInterface + 61;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return access27100VarIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 98 / 0;
        return null;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 119;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(trackAndLaunchClick trackandlaunchclick, Integer num) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            drawProgress<Integer> drawprogress = trackandlaunchclick.IAuthTabCallback;
            Intrinsics.checkNotNull(num);
            drawprogress.onExtraCallbackWithResult(num);
            if (trackandlaunchclick.onExtraCallback) {
                String str = trackandlaunchclick.onNavigationEvent;
                Objects.toString(num);
                int i3 = asBinder + 97;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
            return Unit.INSTANCE;
        }
        drawProgress<Integer> drawprogress2 = trackandlaunchclick.IAuthTabCallback;
        Intrinsics.checkNotNull(num);
        drawprogress2.onExtraCallbackWithResult(num);
        boolean z = trackandlaunchclick.onExtraCallback;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final getTimestampBytes<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getTimestampBytes<String> gettimestampbytes = (getTimestampBytes) this.onWarmupCompleted.getValue();
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return gettimestampbytes;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final getTimestampBytes onNavigationEvent(final trackAndLaunchClick trackandlaunchclick) {
        int i = 2 % 2;
        getTimestampBytes gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        getByteBuffer getbytebufferOnExtraCallbackWithResult = gettimestampbytesIAuthTabCallback.onExtraCallback(2L, TimeUnit.SECONDS).onExtraCallbackWithResult(clearTid.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0, (String) obj};
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                Unit unit = (Unit) trackAndLaunchClick.onNavigationEvent(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -20717414, zzgc.onExtraCallbackWithResult(), 20717419, objArr);
                int i5 = IAuthTabCallback + 67;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 17 / 0;
                }
                return unit;
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                trackAndLaunchClick.onWarmupCompleted(function1, obj);
                int i5 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        };
        final Function1 function12 = new Function1() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 117;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = trackAndLaunchClick.onExtraCallbackWithResult((Throwable) obj);
                int i5 = onExtraCallback + 47;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        };
        getbytebufferOnExtraCallbackWithResult.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda7
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 77;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                trackAndLaunchClick.IAuthTabCallbackDefault(function12, obj);
                int i5 = onNavigationEvent + 53;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return gettimestampbytesIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(trackAndLaunchClick trackandlaunchclick, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        trackandlaunchclick.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 73;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 71;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(th);
            ALCDetectionMode.IAuthTabCallback(th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("function", "fetchUserInfoRequestSubject")));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(th);
        ALCDetectionMode.IAuthTabCallback(th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("function", "fetchUserInfoRequestSubject")));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        writeRaw writerawIAuthTabCallback = this.IAuthTabCallbackDefault.onExtraCallbackWithResult().IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new Function1() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = trackAndLaunchClick.onExtraCallback((Throwable) obj);
                int i5 = onWarmupCompleted + 27;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, new Function1() { // from class: im.toss.splittarget.impl.feed.InboxImpl$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 61;
                onExtraCallback = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    Object[] objArr = {this.f$0, (BaseApiResponse) obj};
                    int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr2 = {this.f$0, (BaseApiResponse) obj};
                int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
                Unit unit = (Unit) trackAndLaunchClick.onNavigationEvent(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1177776910, zzgc.onExtraCallbackWithResult(), 1177776917, objArr2);
                int i4 = IAuthTabCallback + 75;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
        });
        int i2 = asBinder + 121;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
    }

    private static final Unit onWarmupCompleted(trackAndLaunchClick trackandlaunchclick, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseApiResponse, "");
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
            int i2 = asBinder + 81;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            GetUserInfoResp getUserInfoResp = (GetUserInfoResp) baseApiResponse.onTransact();
            if (getUserInfoResp != null) {
                trackandlaunchclick.onWarmupCompleted().onWarmupCompleted(Integer.valueOf(getUserInfoResp.onExtraCallbackWithResult()));
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = asBinder + 17;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 101;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 123;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 24 - Gravity.getAbsoluteGravity(0, 0), Color.red(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() + IAuthTabCallbackStub + 5407414049857832247L;
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), TextUtils.getOffsetAfter("", 0) + 59, 6383 - TextUtils.getOffsetBefore("", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19627 - View.combineMeasuredStates(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ IAuthTabCallbackStub);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 59, 6382 - MotionEvent.axisFromString(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 65;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), (Process.myPid() >> 22) + 59, 6382 - ExpandableListView.getPackedPositionChild(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.AppLovinSdkInitializationConfigurationImpl
    public drawProgress<Integer> IAuthTabCallback() {
        drawProgress<Integer> drawprogress;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 11;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            drawprogress = this.IAuthTabCallback;
            int i4 = 21 / 0;
        } else {
            drawprogress = this.IAuthTabCallback;
        }
        int i5 = i2 + 15;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return drawprogress;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AppLovinSdkInitializationConfigurationImpl
    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent().onExtraCallback(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent().onExtraCallback(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(trackAndLaunchClick trackandlaunchclick, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        trackandlaunchclick.onExtraCallbackWithResult("markRead");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 97;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.AppLovinSdkInitializationConfigurationImpl
    public void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        writeRaw writerawIAuthTabCallback = this.IAuthTabCallbackDefault.onNavigationEvent(new SetReadReq(CollectionsKt.listOf(new ContentId(str)))).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writerawIAuthTabCallback.onNavigationEvent(new InboxImpl$.ExternalSyntheticLambda17(new InboxImpl$.ExternalSyntheticLambda16(this)), new InboxImpl$.ExternalSyntheticLambda19(new InboxImpl$.ExternalSyntheticLambda18()));
        this.IAuthTabCallback.onExtraCallbackWithResult(0);
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
    }

    private static final Unit IAuthTabCallbackStub(trackAndLaunchClick trackandlaunchclick, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        trackandlaunchclick.onExtraCallbackWithResult("markReadRelated");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 87;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onTransact(Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 21;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.AppLovinSdkInitializationConfigurationImpl
    public void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        writeRaw writerawIAuthTabCallback = this.IAuthTabCallbackDefault.onExtraCallback(new SetReadReq(CollectionsKt.listOf(new ContentId(str)))).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        writerawIAuthTabCallback.onNavigationEvent(new InboxImpl$.ExternalSyntheticLambda1(new InboxImpl$.ExternalSyntheticLambda0(this)), new InboxImpl$.ExternalSyntheticLambda3(new InboxImpl$.ExternalSyntheticLambda2()));
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = o.resumeForClick.asBinder;
        r4 = new java.lang.Object[1];
        a(new char[]{60914, 14151, 22679, 32253, 34623, 43146, 52700, 5911, 14442, 24048, 26448, 34847, 44419, 63219, 6190, 15768, 18062, 26640, 36210, 54958, 63512, 7516, 9873, 19441, 27963, 46791, 56263, 64783, 1656, 11171, 19797, 38466, 48000, 56548, 58926, 2975, 11468, 30250, 39802, 48299, 50711, 60277, 3261, 20977, 31543}, 55987 - android.view.KeyEvent.normalizeMetaState(0), r4);
        o.SessionTrackerb.onExtraCallbackWithResult(r0, r18, ((java.lang.String) r4[0]).intern(), false, null, null, false, 60, null);
        o.ConvertByteArrayToFloatArray.onExtraCallback(1005198, false, (java.lang.String) null, (java.util.Map) null, new im.toss.splittarget.impl.feed.InboxImpl$.ExternalSyntheticLambda22(r17, r19), 14, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r18 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r18 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 101;
        o.trackAndLaunchClick.asBinder = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    @Override // o.AppLovinSdkInitializationConfigurationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@Nullable Context context, @Nullable Integer num) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            int i4 = 30 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(trackAndLaunchClick trackandlaunchclick, Integer num, SetDetectableSize setDetectableSize) throws Throwable {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("action_type", "click");
        setDetectableSize.onExtraCallback("screen_name", "dashboard_main");
        Integer num2 = (Integer) trackandlaunchclick.IAuthTabCallback.onExtraCallback();
        if (num2 != null) {
            int i2 = asInterface + 3;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                num2.intValue();
                throw null;
            }
            if (num2.intValue() > 0) {
                int i3 = asBinder + 95;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                str = "Y";
            } else {
                str = "N";
            }
        }
        setDetectableSize.onExtraCallback("unread_notification", str);
        Object[] objArr = new Object[1];
        a(new char[]{60915, 12925, 21205, 29487, 37783, 45070, 53362, 61660}, View.combineMeasuredStates(0, 0) + 57241, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "home.navigation_bar");
        setDetectableSize.onExtraCallback().put("version", num);
        return Unit.INSTANCE;
    }

    @Override // o.AppLovinSdkInitializationConfigurationImpl
    public void onExtraCallback(@Nullable View view, @Nullable View view2, int i, boolean z) {
        boolean z2;
        String string;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 111;
        int i5 = i4 % 128;
        asInterface = i5;
        int i6 = i4 % 2;
        if (i <= 0 || !z) {
            int i7 = i5 + 119;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        } else {
            int i9 = i3 + 115;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            z2 = true;
        }
        String str = null;
        if (view2 != null) {
            int i11 = asInterface + 31;
            asBinder = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            view2.setVisibility(i > 0 ? 0 : 8);
        }
        if (view != null) {
            int i12 = asInterface + 103;
            int i13 = i12 % 128;
            asBinder = i13;
            if (i12 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            if (z2) {
                int i14 = i13 + 31;
                asInterface = i14 % 128;
                if (i14 % 2 != 0) {
                    string = view.getContext().getString(R.string.accessibility_unread_dot);
                    int i15 = 80 / 0;
                } else {
                    string = view.getContext().getString(R.string.accessibility_unread_dot);
                }
                str = string;
            }
            ViewCompat.onExtraCallbackWithResult(view, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // o.AppLovinSdkInitializationConfigurationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@Nullable View view, @Nullable View view2, boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = asBinder + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) this.IAuthTabCallback.onExtraCallback();
        if (num != null) {
            int iIntValue = num.intValue();
            int i4 = asBinder;
            int i5 = i4 + 21;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (iIntValue <= 0 || !z) {
                z2 = false;
            } else {
                int i7 = i4 + 111;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                z2 = true;
            }
        }
        if (view2 != null) {
            view2.setVisibility(z2 ? 0 : 8);
        }
        if (view != null) {
            ViewCompat.onExtraCallbackWithResult(view, z2 ? view.getContext().getString(R.string.accessibility_unread_dot) : null);
        }
    }

    @Override // o.AppLovinSdkInitializationConfigurationImpl
    public void onExtraCallback(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02) {
        int i = 2 % 2;
        writeRaw writerawOnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent();
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        Object obj = null;
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, (MapConverter) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new InboxImpl$.ExternalSyntheticLambda8(function02), new InboxImpl$.ExternalSyntheticLambda9(function0));
        int i2 = asInterface + 43;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        Unit unit = (Unit) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(unit, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(unit, "");
        if (function0 != null) {
            int i3 = asInterface + 107;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            function0.invoke();
            if (i4 == 0) {
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function0 function0, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (function0 != null) {
            int i2 = asBinder + 39;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(trackAndLaunchClick trackandlaunchclick, Integer num) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 712300781, iOnExtraCallbackWithResult3, -712300775, new Object[]{trackandlaunchclick, num});
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, Unit unit) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -2103799530, iOnExtraCallbackWithResult3, 2103799534, new Object[]{function0, unit});
    }

    public static /* synthetic */ Unit onNavigationEvent(trackAndLaunchClick trackandlaunchclick, String str) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -20717414, iOnExtraCallbackWithResult3, 20717419, new Object[]{trackandlaunchclick, str});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(trackAndLaunchClick trackandlaunchclick, BaseApiResponse baseApiResponse) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1177776910, iOnExtraCallbackWithResult3, 1177776917, new Object[]{trackandlaunchclick, baseApiResponse});
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -51356661, iOnExtraCallbackWithResult3, 51356661, new Object[]{function1, obj});
    }

    private static final access27100 onExtraCallback(trackAndLaunchClick trackandlaunchclick) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (access27100) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1615100707, iOnExtraCallbackWithResult3, -1615100704, new Object[]{trackandlaunchclick});
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 1240334278, iOnExtraCallbackWithResult3, -1240334276, new Object[]{function1, obj});
    }

    private static final Unit IAuthTabCallbackStub(Throwable th) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -1858553294, iOnExtraCallbackWithResult3, 1858553295, new Object[]{th});
    }

    private static final Unit onExtraCallback(Function0 function0, Unit unit) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -493234538, iOnExtraCallbackWithResult3, 493234546, new Object[]{function0, unit});
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = -210998509143430986L;
    }
}
