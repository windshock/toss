package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.asInterface;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.showRedownloadDialog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class showRedownloadDialog implements r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private volatile asInterface IAuthTabCallback;
    private final getBillingPeriod IAuthTabCallbackDefault;
    private boolean asBinder;
    private final Context onExtraCallback;
    private final installModel onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private volatile boolean onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStub + 5;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(showRedownloadDialog showredownloaddialog, String str, Map map) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(showredownloaddialog, str, map);
        }
        onNavigationEvent(showredownloaddialog, str, map);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact();
            throw null;
        }
        Unit unitOnTransact = onTransact();
        int i3 = onTransact + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i7 | i6));
        int i10 = ~(i | i6);
        int i11 = ~i6;
        int i12 = (~(i2 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i + i6 + i5 + ((-1570926368) * i4) + ((-1409401439) * i3);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i) - 657981440) + (821186744 * i6) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i5) + (1124073472 * i4) + ((-332922880) * i3) + ((-1182662656) * i15);
        int i17 = (i * 1410161459) + 847508490 + (i6 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i5 * 1410159841) + (i4 * 1126552800) + (i3 * (-1948647807)) + (i15 * (-1287520256));
        return i16 + ((i17 * i17) * (-1577189376)) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    @Inject
    public showRedownloadDialog(@NotNull getBillingPeriod getbillingperiod, @NotNull Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(getbillingperiod, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackDefault = getbillingperiod;
        this.onExtraCallback = context;
        if (getbillingperiod.onExtraCallbackWithResult() == getPricingPhaseList.EU) {
            int i = asInterface + 113;
            onTransact = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z = true;
        } else {
            int i4 = asInterface + 59;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        }
        this.onExtraCallbackWithResult = new installModel(200, z);
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public /* bridge */ void onExtraCallback(@Nullable Activity activity, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallback(activity, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public /* bridge */ void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(str);
        int i4 = onTransact + 35;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent() {
        Object obj;
        synchronized (this) {
            if (this.onWarmupCompleted) {
                return;
            }
            try {
                Result.Companion companion = kotlin.Result.Companion;
                performIntercept.sdkInitialize(this.onExtraCallback);
                this.onNavigationEvent = true;
                performIntercept.onExtraCallback();
                onExtraCallback();
                performIntercept.onExtraCallbackWithResult(true);
                performIntercept.IAuthTabCallback(true);
                Context context = this.onExtraCallback;
                Application application = context instanceof Application ? (Application) context : null;
                if (application != null) {
                    asInterface.Companion.onWarmupCompleted(application);
                }
                asInterface asinterfaceOnExtraCallbackWithResult = asInterface.Companion.onExtraCallbackWithResult(this.onExtraCallback);
                asinterfaceOnExtraCallbackWithResult.IAuthTabCallback("fb_mobile_activate_app");
                this.IAuthTabCallback = asinterfaceOnExtraCallbackWithResult;
                obj = kotlin.Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FacebookMarketingChannel", "grantConsent failed", th2, (Map) null, 8, (Object) null);
            }
            if (kotlin.Result.onNavigationEvent(obj)) {
                this.onWarmupCompleted = true;
                this.onExtraCallbackWithResult.IAuthTabCallback();
            } else {
                this.onWarmupCompleted = false;
                this.onExtraCallbackWithResult.onWarmupCompleted();
                this.IAuthTabCallback = null;
                asBinder();
            }
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        showRedownloadDialog showredownloaddialog = (showRedownloadDialog) objArr[0];
        synchronized (showredownloaddialog) {
            showredownloaddialog.onExtraCallbackWithResult.onWarmupCompleted();
            showredownloaddialog.onWarmupCompleted = false;
            if (showredownloaddialog.onNavigationEvent) {
                showredownloaddialog.asBinder();
            }
        }
        return null;
    }

    private static final Unit onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        asInterface.Companion.onNavigationEvent();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void IAuthTabCallback() {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.onWarmupCompleted(new Function0() { // from class: im.toss.core.tracker.marketing.impl.facebook.FacebookMarketingChannel$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                Unit unit = (Unit) showRedownloadDialog.onNavigationEvent(-491688224, new Object[0], iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 491688225);
                int i5 = onExtraCallback + 107;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!this.asBinder) {
            asInterface.Companion.onNavigationEvent();
            this.asBinder = true;
            return;
        }
        int i5 = i2 + 65;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void onExtraCallback(@NotNull final String str, @NotNull final Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Objects.toString(map);
        this.onExtraCallbackWithResult.onWarmupCompleted(new Function0() { // from class: im.toss.core.tracker.marketing.impl.facebook.FacebookMarketingChannel$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                showRedownloadDialog showredownloaddialog = this.f$0;
                if (i4 != 0) {
                    return showRedownloadDialog.onExtraCallback(showredownloaddialog, str, map);
                }
                showRedownloadDialog.onExtraCallback(showredownloaddialog, str, map);
                throw null;
            }
        });
        int i2 = asInterface + 13;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(showRedownloadDialog showredownloaddialog, String str, Map map) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            showredownloaddialog.onWarmupCompleted(str, map);
            unit = Unit.INSTANCE;
            int i3 = 94 / 0;
        } else {
            showredownloaddialog.onWarmupCompleted(str, map);
            unit = Unit.INSTANCE;
        }
        int i4 = asInterface + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        asInterface asinterface = this.IAuthTabCallback;
        if (asinterface == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            Object string = null;
            if (!it.hasNext()) {
                Bundle bundleOnExtraCallbackWithResult = zzbf.onExtraCallbackWithResult(linkedHashMap, (Bundle) null, 1, (Object) null);
                bundleOnExtraCallbackWithResult.putString("toss_service_region", onExtraCallback(this.IAuthTabCallbackDefault.onExtraCallbackWithResult()));
                asinterface.onExtraCallback(str, bundleOnExtraCallbackWithResult);
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof String)) {
                int i2 = onTransact + 1;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                if (value instanceof Number) {
                    string = (Serializable) value;
                } else if (value != null) {
                    string = value.toString();
                    int i4 = asInterface + 119;
                    onTransact = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 % 3;
                    }
                }
            }
            linkedHashMap.put(key, string);
            int i6 = asInterface + 47;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
        }
    }

    @Override // o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE
    public void IAuthTabCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        onExtraCallback(str, map);
        int i4 = asInterface + 45;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onExtraCallback(getPricingPhaseList getpricingphaselist) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String upperCase = getpricingphaselist.getCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int i4 = onTransact + 69;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return upperCase;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private final void asBinder() throws Throwable {
        Unit unit;
        Object obj;
        Unit unit2;
        Object obj2;
        int i = 2 % 2;
        Throwable th = null;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FacebookMarketingChannel", "disable auto log failed", th, (Map) null, 8, (Object) null);
                break;
            }
            int i3 = onTransact + 25;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    performIntercept.onExtraCallbackWithResult(true);
                    unit2 = Unit.INSTANCE;
                } catch (Throwable th2) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
                }
            } else {
                Result.Companion companion3 = kotlin.Result.Companion;
                performIntercept.onExtraCallbackWithResult(false);
                unit2 = Unit.INSTANCE;
            }
            obj2 = kotlin.Result.constructor-impl(unit2);
            if (kotlin.Result.onNavigationEvent(obj2)) {
                break;
            }
            th = kotlin.Result.exceptionOrNull-impl(obj2);
            i2++;
        }
        Throwable th3 = null;
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = asInterface + 21;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                try {
                    Result.Companion companion4 = kotlin.Result.Companion;
                    performIntercept.IAuthTabCallback(true);
                    unit = Unit.INSTANCE;
                } catch (Throwable th4) {
                    Result.Companion companion5 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th4));
                }
            } else {
                Result.Companion companion6 = kotlin.Result.Companion;
                performIntercept.IAuthTabCallback(false);
                unit = Unit.INSTANCE;
            }
            obj = kotlin.Result.constructor-impl(unit);
            if (kotlin.Result.onNavigationEvent(obj)) {
                return;
            }
            int i6 = asInterface + 11;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            th3 = kotlin.Result.exceptionOrNull-impl(obj);
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "FacebookMarketingChannel", "disable advertiser collection failed", th3, (Map) null, 8, (Object) null);
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-491688224, new Object[0], iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 491688225);
    }

    public final void onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onNavigationEvent(-76768633, new Object[]{this}, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 76768633);
    }
}
