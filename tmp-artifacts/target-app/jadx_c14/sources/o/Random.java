package o;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zzgc;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.Random;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class Random {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int asInterface = 1;
    public static final int onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static int[] onTransact;
    private final onExtraCallbackWithResult IAuthTabCallback;
    private final IAuthTabCallbackStub IAuthTabCallbackStub;
    private final IAuthTabCallback asBinder;
    private final onWarmupCompleted onExtraCallback;
    private final Sequence<onNavigationEvent<? extends Object>> onWarmupCompleted;

    public static final /* synthetic */ class asInterface {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[queryTabBarInfo.values().length];
            try {
                iArr[queryTabBarInfo.OPEN_BANKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[queryTabBarInfo.MYDATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[queryTabBarInfo.TOSS_FAMILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[queryTabBarInfo.SCRAPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
        }
    }

    interface onNavigationEvent<Account> {
        void onNavigationEvent(Account account);

        void onWarmupCompleted();
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new int[]{475332771, -1341164144, 244139686, 678798874, 1269576278, 1715667888, 622286824, -486106362, -757137351, -1766404082, -1567387179, 1268271084, -1899159972, 979539419}, 26 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Companion = new onExtraCallback(null);
        onExtraCallbackWithResult = 8;
        int i = asInterface + 105;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public Random() {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        this.onExtraCallback = onwarmupcompleted;
        IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub();
        this.IAuthTabCallbackStub = iAuthTabCallbackStub;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.IAuthTabCallback = onextracallbackwithresult;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        this.asBinder = iAuthTabCallback;
        this.onWarmupCompleted = clearRevision.onExtraCallbackWithResult(new onNavigationEvent[]{onwarmupcompleted, iAuthTabCallbackStub, onextracallbackwithresult, iAuthTabCallback});
    }

    public Random(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        this.onExtraCallback = onwarmupcompleted;
        IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub();
        this.IAuthTabCallbackStub = iAuthTabCallbackStub;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.IAuthTabCallback = onextracallbackwithresult;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        this.asBinder = iAuthTabCallback;
        this.onWarmupCompleted = clearRevision.onExtraCallbackWithResult(new onNavigationEvent[]{onwarmupcompleted, iAuthTabCallbackStub, onextracallbackwithresult, iAuthTabCallback});
        onWarmupCompleted(keyBoardVisiblePoint);
    }

    public Random(@NotNull Collection<? extends KeyBoardVisiblePoint> collection) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(collection, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        this.onExtraCallback = onwarmupcompleted;
        IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub();
        this.IAuthTabCallbackStub = iAuthTabCallbackStub;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.IAuthTabCallback = onextracallbackwithresult;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        this.asBinder = iAuthTabCallback;
        this.onWarmupCompleted = clearRevision.onExtraCallbackWithResult(new onNavigationEvent[]{onwarmupcompleted, iAuthTabCallbackStub, onextracallbackwithresult, iAuthTabCallback});
        onNavigationEvent(collection);
    }

    public final Random onNavigationEvent(@NotNull String str, @NotNull String str2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KeyBoardVisiblePoint keyBoardVisiblePointIAuthTabCallback = PageShowPoint.Companion.IAuthTabCallback(str, str2);
        if (keyBoardVisiblePointIAuthTabCallback != null) {
            int i2 = IAuthTabCallback_Parcel + 57;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(keyBoardVisiblePointIAuthTabCallback);
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = IAuthTabCallback_Parcel + 15;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.Random onWarmupCompleted(@org.jetbrains.annotations.NotNull o.KeyBoardVisiblePoint r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            boolean r1 = r6 instanceof o.TabBarInfoQueryPointOnTabBarInfoQueryListener
            if (r1 == 0) goto L69
            r1 = r6
            o.TabBarInfoQueryPointOnTabBarInfoQueryListener r1 = (o.TabBarInfoQueryPointOnTabBarInfoQueryListener) r1
            o.queryTabBarInfo r1 = r1.ICustomTabsCallbackDefault()
            r2 = -1
            if (r1 != 0) goto L21
            int r1 = o.Random.access000
            int r1 = r1 + 115
            int r3 = r1 % 128
            o.Random.IAuthTabCallback_Parcel = r3
            int r1 = r1 % r0
            r1 = r2
            goto L29
        L21:
            int[] r3 = o.Random.asInterface.IAuthTabCallback
            int r1 = r1.ordinal()
            r1 = r3[r1]
        L29:
            if (r1 == r2) goto L74
            int r2 = o.Random.access000
            int r2 = r2 + 55
            int r3 = r2 % 128
            o.Random.IAuthTabCallback_Parcel = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L39
            if (r1 == 0) goto L63
            goto L3c
        L39:
            r2 = 1
            if (r1 == r2) goto L63
        L3c:
            if (r1 == r0) goto L63
            r2 = 3
            if (r1 == r2) goto L60
            int r2 = r3 + 29
            int r4 = r2 % 128
            o.Random.access000 = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L4d
            if (r1 != r0) goto L5a
            goto L50
        L4d:
            r2 = 4
            if (r1 != r2) goto L5a
        L50:
            int r3 = r3 + 117
            int r1 = r3 % 128
            o.Random.access000 = r1
            int r3 = r3 % r0
            o.Random$onExtraCallbackWithResult r0 = r5.IAuthTabCallback
            goto L65
        L5a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L60:
            o.Random$IAuthTabCallbackStub r0 = r5.IAuthTabCallbackStub
            goto L65
        L63:
            o.Random$onWarmupCompleted r0 = r5.onExtraCallback
        L65:
            r0.onNavigationEvent(r6)
            return r5
        L69:
            boolean r6 = r6 instanceof o.onDisclaimerClick
            if (r6 == 0) goto L74
            o.Random$IAuthTabCallback r6 = r5.asBinder
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6.onNavigationEvent(r0)
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Random.onWarmupCompleted(o.KeyBoardVisiblePoint):o.Random");
    }

    public static final class onExtraCallbackWithResult implements onNavigationEvent<TabBarInfoQueryPointOnTabBarInfoQueryListener> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static long onExtraCallbackWithResult = 7467662419341142251L;
        private static int onWarmupCompleted = 1;
        private final HashSet<TabBarInfoQueryPointOnTabBarInfoQueryListener> onNavigationEvent = new HashSet<>();

        public static /* synthetic */ CharSequence IAuthTabCallback(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CharSequence charSequenceOnExtraCallbackWithResult = onExtraCallbackWithResult(tabBarInfoQueryPointOnTabBarInfoQueryListener);
            int i4 = IAuthTabCallback + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return charSequenceOnExtraCallbackWithResult;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $11 + 77;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.indexOf((CharSequence) "", '0', 0)), 85 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 21233 - View.MeasureSpec.getMode(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 14185), 19 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $10 + 83;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i8 = $10 + 5;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i9 = 16 / 0;
                objArr[0] = str;
            }
        }

        @Override // o.Random.onNavigationEvent
        public /* bridge */ /* synthetic */ void onNavigationEvent(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent2(tabBarInfoQueryPointOnTabBarInfoQueryListener);
            if (i3 != 0) {
                int i4 = 48 / 0;
            }
            int i5 = IAuthTabCallback + 13;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: onNavigationEvent, reason: avoid collision after fix types in other method */
        public void onNavigationEvent2(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
                this.onNavigationEvent.add(tabBarInfoQueryPointOnTabBarInfoQueryListener);
                throw null;
            }
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            this.onNavigationEvent.add(tabBarInfoQueryPointOnTabBarInfoQueryListener);
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        private static final CharSequence onExtraCallbackWithResult(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
                return tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult();
            }
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            int i3 = 26 / 0;
            return tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult();
        }

        @Override // o.Random.onNavigationEvent
        public void onWarmupCompleted() throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!this.onNavigationEvent.isEmpty()) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr = new Object[1];
                    a(new char[]{29599, 1623, 57552, 29694, 38355, 28190, 51069, 54724, 15478, 58810, 38862, 25916}, TextUtils.indexOf("", "") + 1, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    HashSet<TabBarInfoQueryPointOnTabBarInfoQueryListener> hashSet = this.onNavigationEvent;
                    Object[] objArr2 = new Object[1];
                    a(new char[]{40043, 12917, 4813, 40007, 17839}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                    Map mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback(strIntern, CollectionsKt.joinToString$default(hashSet, ((String) objArr2[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.dataprovider.AccountBalanceSyncManager$ScrapingRequester$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj) {
                            return Random.onExtraCallbackWithResult.IAuthTabCallback((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj);
                        }
                    }, 30, (Object) null)));
                    Object[] objArr3 = new Object[1];
                    a(new char[]{5218, 2410, 43628, 5155, 39662, 1935, 36289, 48213, 23435, 60039, 56690, 3228, 35643, 14873, 27915, 23820, 64213, 35764, 48285, 44415, 10876, 56158, 52255, 64971, 39424, 10488, 8145, 20011, 51640}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    a(new char[]{29456, 38314, 12115, 29539, 1582, 23933, 2287, 59049, 15612, 30272, 22615, 22091, 60424, 42716, 59430, 1968, 40362, 6014, 14725, 63444, 19731, 18312, 18717, 42792, 64883, 46123, 39677, 5337, 44764}, '1' - AndroidCharacter.getMirror('0'), objArr4);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, strIntern2, ((String) objArr4[0]).intern(), mapOnNavigationEvent, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    int i3 = IAuthTabCallback + 97;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                }
                this.onNavigationEvent.clear();
                return;
            }
            this.onNavigationEvent.isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Random onNavigationEvent(@NotNull Collection<? extends KeyBoardVisiblePoint> collection) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(collection, "");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            onWarmupCompleted((KeyBoardVisiblePoint) it.next());
            int i2 = access000 + 113;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallback_Parcel + 43;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final Random onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.onNavigationEvent(Unit.INSTANCE);
        int i4 = access000 + 89;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        Iterator itIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            int i2 = IAuthTabCallback_Parcel + 53;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                ((onNavigationEvent) itIAuthTabCallback.next()).onWarmupCompleted();
                int i3 = 56 / 0;
            } else {
                ((onNavigationEvent) itIAuthTabCallback.next()).onWarmupCompleted();
            }
        }
        int i4 = IAuthTabCallback_Parcel + 7;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    static final class onWarmupCompleted implements onNavigationEvent<TabBarInfoQueryPointOnTabBarInfoQueryListener> {
        private final HashSet<TabBarInfoQueryPointOnTabBarInfoQueryListener> onExtraCallback = new HashSet<>();

        @Override // o.Random.onNavigationEvent
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            this.onExtraCallback.add(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        }

        @Override // o.Random.onNavigationEvent
        public void onWarmupCompleted() {
            if (this.onExtraCallback.isEmpty()) {
                return;
            }
            IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(genSignatureValue.onExtraCallbackWithResult.onNavigationEvent(CollectionsKt.toList(this.onExtraCallback)), (String) null, 1, (Object) null);
            this.onExtraCallback.clear();
        }
    }

    static final class IAuthTabCallbackStub implements onNavigationEvent<TabBarInfoQueryPointOnTabBarInfoQueryListener> {
        private final HashSet<TabBarInfoQueryPointOnTabBarInfoQueryListener> onExtraCallback = new HashSet<>();

        @Override // o.Random.onNavigationEvent
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) {
            Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
            this.onExtraCallback.add(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        }

        @Override // o.Random.onNavigationEvent
        public void onWarmupCompleted() {
            if (this.onExtraCallback.isEmpty()) {
                return;
            }
            IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(genSignatureValue.onExtraCallbackWithResult.onNavigationEvent(CollectionsKt.toList(this.onExtraCallback)), (String) null, 1, (Object) null);
            this.onExtraCallback.clear();
        }
    }

    static final class IAuthTabCallback implements onNavigationEvent<Unit> {
        private boolean onExtraCallback;

        @Override // o.Random.onNavigationEvent
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            this.onExtraCallback = true;
        }

        @Override // o.Random.onNavigationEvent
        public void onWarmupCompleted() {
            if (this.onExtraCallback) {
                verifyHASH.onExtraCallback.onNavigationEvent(true);
                this.onExtraCallback = false;
            }
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onTransact;
        int i5 = -1469660336;
        long j = 0;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 87;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), 72 - View.MeasureSpec.getMode(0), 8849 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 87;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 % 5;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onTransact;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $10 + 39;
                $11 = i13 % 128;
                if (i13 % i3 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 72 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 8849 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), MotionEvent.axisFromString("") + 73, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i12++;
                i3 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i14 = $11 + 125;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getPressedStateDuration() >> 16)), TextUtils.getOffsetBefore("", 0) + 39, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - TextUtils.getCapsMode("", 0, 0)), 78 - (ViewConfiguration.getLongPressTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 7399, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static void onExtraCallbackWithResult() {
        onTransact = new int[]{-991917389, 300270370, 1830312461, 819426960, 693287278, -1273146709, 65999444, -1208651430, 313339765, 1161799865, -1022391485, 241490021, 511307590, 1076897643, 1145252512, 472450144, 1021063832, 2113712661};
    }
}
