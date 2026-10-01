package im.toss.rome;

import android.os.Looper;
import android.os.SystemClock;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.rome.RomeConfigRegistry;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmObjectSchema;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AppSetIdAndScope1;
import o.ea10;
import o.getBeginAddress;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RomeKt {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static final AppSetIdAndScope1 onNavigationEvent;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        RealmModel realmModelOnWarmupCompleted;
        int i7 = ~i2;
        int i8 = (~(i7 | i4)) | (~(i | i4));
        int i9 = i | i2;
        int i10 = (~(i2 | (~i4))) | (~(i7 | (~i))) | (~i9);
        int i11 = i + i4 + i6 + (1350191703 * i3) + ((-44904237) * i5);
        int i12 = i11 * i11;
        int i13 = ((i * (-560584373)) - 948043776) + ((-560584373) * i4) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i6) + ((-71041024) * i3) + ((-766246912) * i5) + (1339949056 * i12);
        int i14 = (i * 1657715387) + 2046152777 + (i4 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i6 * 1657716305) + (i3 * 1507858311) + (i5 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 == 1) {
            Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
            RealmModel realmModel = (RealmModel) objArr[1];
            Realm realm = (Realm) objArr[2];
            int i16 = 2 % 2;
            int i17 = onExtraCallback + 113;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 == 0) {
                Intrinsics.checkNotNullParameter(realm, "");
                realmModelOnWarmupCompleted = realm.onWarmupCompleted(realmModel, new getBeginAddress[0]);
            } else {
                Intrinsics.checkNotNullParameter(realm, "");
                realmModelOnWarmupCompleted = realm.onWarmupCompleted(realmModel, new getBeginAddress[0]);
            }
            objectRef.element = realmModelOnWarmupCompleted;
            return Unit.INSTANCE;
        }
        if (i15 == 2) {
            return onExtraCallback(objArr);
        }
        if (i15 == 3) {
            return onNavigationEvent(objArr);
        }
        if (i15 == 4) {
            return onWarmupCompleted(objArr);
        }
        RealmModel realmModel2 = (RealmModel) objArr[0];
        Realm realm2 = (Realm) objArr[1];
        int i18 = 2 % 2;
        int i19 = onExtraCallback + 89;
        onWarmupCompleted = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(realm2, "");
        realm2.IAuthTabCallback(realmModel2, new getBeginAddress[0]);
        Unit unit = Unit.INSTANCE;
        int i21 = onExtraCallback + 5;
        onWarmupCompleted = i21 % 128;
        int i22 = i21 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RealmModel realmModel, Realm realm) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(-628473845, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{realmModel, realm}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 628473845, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Realm realm, Realm realm2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, realm, realm2);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(RealmModel realmModel, Realm realm) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(realmModel, realm);
        }
        onTransact(realmModel, realm);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Ref.ObjectRef objectRef, RealmModel realmModel, Realm realm) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(629772758, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{objectRef, realmModel, realm}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -629772757, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
        int i3 = onWarmupCompleted + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Realm realm, Realm realm2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, realm, realm2);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Ref.ObjectRef objectRef = (Ref.ObjectRef) objArr[0];
        RealmModel realmModel = (RealmModel) objArr[1];
        Realm realm = (Realm) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(objectRef, realmModel, realm);
        }
        asInterface(objectRef, realmModel, realm);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RealmModel realmModel, Realm realm) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(realmModel, realm);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Ref.ObjectRef objectRef, RealmModel realmModel, Realm realm) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(objectRef, realmModel, realm);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(objectRef, realmModel, realm);
        int i3 = onExtraCallback + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Realm realm, Realm realm2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, realm, realm2);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
    }

    static {
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("Rome");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        onNavigationEvent = appSetIdAndScope1OnExtraCallbackWithResult;
        int i = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = onNavigationEvent;
        int i5 = i3 + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return appSetIdAndScope1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Thread thread;
        int i = 2 % 2;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            int i2 = onWarmupCompleted + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            thread = mainLooper.getThread();
        } else {
            thread = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(thread, Thread.currentThread());
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zAreEqual);
    }

    private static final void IAuthTabCallback(Function1 function1, Realm realm, Realm realm2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(realm);
        function1.invoke(realm);
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(Realm realm, String str, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 13;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            str = "transaction";
        }
        onExtraCallback(realm, str, (Function1<? super Realm, Unit>) function1);
        int i5 = onExtraCallback + 69;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onExtraCallback(Function1 function1, Realm realm, Realm realm2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(realm);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final void onTransact(Function1 function1, Realm realm, Realm realm2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(realm);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onNavigationEvent(@NotNull final Realm realm, @NotNull final Function1<? super Realm, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(realm, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!realm.extraCallback()) {
            realm.IAuthTabCallback(new Realm.Transaction() { // from class: im.toss.rome.RomeKt$$ExternalSyntheticLambda7
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final void execute(Realm realm2) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 95;
                    onNavigationEvent = i5 % 128;
                    Object obj = null;
                    if (i5 % 2 != 0) {
                        RomeKt.onExtraCallbackWithResult(function1, realm, realm2);
                        throw null;
                    }
                    RomeKt.onExtraCallbackWithResult(function1, realm, realm2);
                    int i6 = onExtraCallback + 1;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            });
            return;
        }
        function1.invoke(realm);
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(RealmModel realmModel, Realm realm) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(realm, "");
            realm.onWarmupCompleted(realmModel, new getBeginAddress[1]);
        } else {
            Intrinsics.checkNotNullParameter(realm, "");
            realm.onWarmupCompleted(realmModel, new getBeginAddress[0]);
        }
        return Unit.INSTANCE;
    }

    public static final <T extends RealmModel> void IAuthTabCallback(@NotNull final T t) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        onExtraCallback(RomeConfigRegistry.Companion.onWarmupCompleted((RomeConfigRegistry.Companion) t), null, new Function1() { // from class: im.toss.rome.RomeKt$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                RealmModel realmModel = t;
                Realm realm = (Realm) obj;
                if (i4 != 0) {
                    return RomeKt.onExtraCallbackWithResult(realmModel, realm);
                }
                RomeKt.onExtraCallbackWithResult(realmModel, realm);
                throw null;
            }
        }, 1, null);
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(Ref.ObjectRef objectRef, RealmModel realmModel, Realm realm) {
        RealmModel realmModelIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(realm, "");
            realmModelIAuthTabCallback = realm.IAuthTabCallback(realmModel, new getBeginAddress[0]);
        } else {
            Intrinsics.checkNotNullParameter(realm, "");
            realmModelIAuthTabCallback = realm.IAuthTabCallback(realmModel, new getBeginAddress[0]);
        }
        objectRef.element = realmModelIAuthTabCallback;
        return Unit.INSTANCE;
    }

    public static final <T extends RealmModel> void onNavigationEvent(@NotNull final T t) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        onExtraCallback(RomeConfigRegistry.Companion.onWarmupCompleted((RomeConfigRegistry.Companion) t), "save " + t.getClass().getSimpleName(), (Function1<? super Realm, Unit>) new Function1() { // from class: im.toss.rome.RomeKt$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = RomeKt.onWarmupCompleted(t, (Realm) obj);
                int i5 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(RealmModel realmModel, Realm realm) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(realm, "");
            int i3 = 45 / 0;
            if (onExtraCallback(realmModel, realm)) {
                realm.IAuthTabCallback(realmModel, new getBeginAddress[0]);
            } else {
                realm.onWarmupCompleted(realmModel, new getBeginAddress[0]);
                int i4 = onExtraCallback + 57;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(realm, "");
            if (onExtraCallback(realmModel, realm)) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(Ref.ObjectRef objectRef, RealmModel realmModel, Realm realm) {
        RealmModel realmModelOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realm, "");
        if (onExtraCallback(realmModel, realm)) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            realmModelOnWarmupCompleted = realm.IAuthTabCallback(realmModel, new getBeginAddress[0]);
        } else {
            realmModelOnWarmupCompleted = realm.onWarmupCompleted(realmModel, new getBeginAddress[0]);
        }
        objectRef.element = realmModelOnWarmupCompleted;
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final <T extends RealmModel> T IAuthTabCallback(@NotNull final T t, @NotNull Realm realm) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(realm, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        onNavigationEvent(realm, (Function1<? super Realm, Unit>) new Function1() { // from class: im.toss.rome.RomeKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {objectRef, t, (Realm) obj};
                Unit unit = (Unit) RomeKt.IAuthTabCallback(358658443, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -358658439, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
                int i5 = onExtraCallback + 15;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        });
        Object obj = objectRef.element;
        Intrinsics.checkNotNull(obj);
        T t2 = (T) obj;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return t2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        return r3.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends RealmModel> boolean onExtraCallback(@NotNull T t, @NotNull Realm realm) {
        RealmObjectSchema realmObjectSchemaOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(realm, "");
        if (realm.access000().onNavigationEvent(t.getClass().getSimpleName()) == null) {
            throw new IllegalArgumentException(t.getClass().getSimpleName() + " is not part of the schema for this Realm. Did you added realm-android plugin in your build.gradle file?");
        }
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            realmObjectSchemaOnNavigationEvent = realm.access000().onNavigationEvent(t.getClass().getSimpleName());
            int i5 = 31 / 0;
        } else {
            realmObjectSchemaOnNavigationEvent = realm.access000().onNavigationEvent(t.getClass().getSimpleName());
        }
    }

    public static final void onExtraCallback(@NotNull final Realm realm, @NotNull String str, @NotNull final Function1<? super Realm, Unit> function1) {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(realm, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        long jElapsedRealtime = !(((AppSetIdAndScope1) IAuthTabCallback(-828391928, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 828391931, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback())).onNavigationEvent() ^ true) ? SystemClock.elapsedRealtime() : 0L;
        try {
            try {
                if (realm.extraCallback()) {
                    function1.invoke(realm);
                } else {
                    realm.IAuthTabCallback(new Realm.Transaction() { // from class: im.toss.rome.RomeKt$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final void execute(Realm realm2) {
                            int i4 = 2 % 2;
                            int i5 = onExtraCallbackWithResult + 9;
                            onNavigationEvent = i5 % 128;
                            int i6 = i5 % 2;
                            Function1 function12 = function1;
                            if (i6 == 0) {
                                RomeKt.onWarmupCompleted(function12, realm, realm2);
                                return;
                            }
                            RomeKt.onWarmupCompleted(function12, realm, realm2);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(realm, (Throwable) null);
                if (jElapsedRealtime > 0) {
                    int i4 = onExtraCallback + 115;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        SystemClock.elapsedRealtime();
                        objIAuthTabCallback = IAuthTabCallback(688231103, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -688231101, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
                    } else {
                        SystemClock.elapsedRealtime();
                        objIAuthTabCallback = IAuthTabCallback(688231103, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -688231101, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
                    }
                    ((Boolean) objIAuthTabCallback).booleanValue();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (jElapsedRealtime > 0) {
                int i5 = onExtraCallback + 65;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                SystemClock.elapsedRealtime();
                ((Boolean) IAuthTabCallback(688231103, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -688231101, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback())).booleanValue();
            }
            throw th;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Ref.ObjectRef objectRef, RealmModel realmModel, Realm realm) {
        return (Unit) IAuthTabCallback(358658443, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{objectRef, realmModel, realm}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -358658439, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    private static final Unit onExtraCallbackWithResult(Ref.ObjectRef objectRef, RealmModel realmModel, Realm realm) {
        return (Unit) IAuthTabCallback(629772758, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{objectRef, realmModel, realm}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -629772757, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    private static final Unit asBinder(RealmModel realmModel, Realm realm) {
        return (Unit) IAuthTabCallback(-628473845, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[]{realmModel, realm}, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 628473845, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    public static final AppSetIdAndScope1 onNavigationEvent() {
        return (AppSetIdAndScope1) IAuthTabCallback(-828391928, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 828391931, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback());
    }

    public static final boolean onExtraCallback() {
        return ((Boolean) IAuthTabCallback(688231103, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), new Object[0], MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -688231101, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback())).booleanValue();
    }
}
