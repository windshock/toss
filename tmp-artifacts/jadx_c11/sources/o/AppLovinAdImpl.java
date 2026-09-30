package o;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.entity.Necessity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinAdImpl;
import o.ITrustedWebActivityCallbackStub;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdImpl {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(function1, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(Function1 function1, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            function1.invoke(r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        function1.invoke(r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final SessionTrackera IAuthTabCallback(@NotNull IEngagementSignalsCallbackStub iEngagementSignalsCallbackStub, @NotNull final Function1<? super r8lambda6V0YVgpvgCQzEji1GNetQSIYsE, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackStub, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SessionTrackera sessionTrackeraOnExtraCallback = SessionTrackera.Companion.onExtraCallback(iEngagementSignalsCallbackStub.registerForActivityResult(onExtraCallbackWithResult(), new onSessionEnded() { // from class: im.toss.standardtermsv2.launcher.StandardTermsResultLauncherKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void onActivityResult(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    AppLovinAdImpl.onExtraCallbackWithResult(function1, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
                    int i4 = 78 / 0;
                } else {
                    AppLovinAdImpl.onExtraCallbackWithResult(function1, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
                }
                int i5 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        }));
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return sessionTrackeraOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(Function1 function1, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            function1.invoke(r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        function1.invoke(r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SessionTrackera IAuthTabCallback(@NotNull final Function1<? super r8lambda6V0YVgpvgCQzEji1GNetQSIYsE, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1987442283, i, -1, "im.toss.standardtermsv2.launcher.rememberLauncherForStandardTermsResult (StandardTermsResultLauncher.kt:61)");
        }
        ITrustedWebActivityCallbackStub<Intent, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE> iTrustedWebActivityCallbackStubOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if ((((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1)) && (i & 6) != 4) {
            z = false;
        } else {
            int i5 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 5;
            }
            z = true;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!z)) {
            objOnMinimized = new Function1() { // from class: im.toss.standardtermsv2.launcher.StandardTermsResultLauncherKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 65;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallback = AppLovinAdImpl.onExtraCallback(function1, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
                    int i10 = onNavigationEvent + 41;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        } else {
            int i7 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        ICustomTabsServiceDefault iCustomTabsServiceDefaultOnWarmupCompleted = prefetch.onWarmupCompleted(iTrustedWebActivityCallbackStubOnExtraCallbackWithResult, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iCustomTabsServiceDefaultOnWarmupCompleted);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new SessionTrackera(iCustomTabsServiceDefaultOnWarmupCompleted);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        SessionTrackera sessionTrackera = (SessionTrackera) objOnMinimized2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return sessionTrackera;
    }

    public static final class onWarmupCompleted extends ITrustedWebActivityCallbackStub<Intent, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public Intent onExtraCallbackWithResult(Context context, Intent intent) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            int i4 = IAuthTabCallback + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return intent;
        }

        onWarmupCompleted() {
        }

        public /* synthetic */ Object onNavigationEvent(int i, Intent intent) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallbackWithResult(i, intent);
            }
            onExtraCallbackWithResult(i, intent);
            throw null;
        }

        public /* bridge */ /* synthetic */ ITrustedWebActivityCallbackStub.onWarmupCompleted onNavigationEvent(Context context, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ITrustedWebActivityCallbackStub.onWarmupCompleted<r8lambda6V0YVgpvgCQzEji1GNetQSIYsE> onwarmupcompletedOnNavigationEvent = onNavigationEvent(context, (Intent) obj);
            int i4 = onExtraCallback + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnNavigationEvent;
        }

        public /* synthetic */ Intent onWarmupCompleted(Context context, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            Intent intent = (Intent) obj;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(context, intent);
            }
            onExtraCallbackWithResult(context, intent);
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0583  */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Character] */
        /* JADX WARN: Type inference failed for: r9v62, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v64, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v68, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r9v69, types: [java.lang.Byte] */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Character] */
        /* JADX WARN: Type inference failed for: r9v70, types: [java.lang.Short] */
        /* JADX WARN: Type inference failed for: r9v71, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r9v72, types: [java.lang.Float] */
        /* JADX WARN: Type inference failed for: r9v73, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r9v74 */
        /* JADX WARN: Type inference failed for: r9v78, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ITrustedWebActivityCallbackStub.onWarmupCompleted<r8lambda6V0YVgpvgCQzEji1GNetQSIYsE> onNavigationEvent(Context context, Intent intent) {
            String str;
            Object serializableExtra;
            ?? string;
            Object next;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("STANDARD_TERMS_V2_ENTER_ERROR_REASON")) {
                str = null;
            } else if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("STANDARD_TERMS_V2_ENTER_ERROR_REASON")) != 0) {
                    int i2 = onExtraCallback + 119;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (Intrinsics.areEqual(String.class, Integer.class)) {
                        string = StringsKt.toIntOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Long.class)) {
                        string = StringsKt.toLongOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Float.class)) {
                        string = StringsKt.toFloatOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        string = StringsKt.toDoubleOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Short.class)) {
                        string = StringsKt.toShortOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        string = StringsKt.toByteOrNull((String) string);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                    } else {
                        if (Intrinsics.areEqual(String.class, Character.class)) {
                            int i4 = onExtraCallback + 65;
                            IAuthTabCallback = i4 % 128;
                            string = i4 % 2 != 0 ? Character.valueOf(string.charAt(0)) : Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listSplit$default) {
                                    if (((String) obj).length() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                }
                                string = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = listSplit$default2.iterator();
                                while (!(!it2.hasNext())) {
                                    Object next2 = it2.next();
                                    if (((String) next2).length() > 0) {
                                        arrayList3.add(next2);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it3 = arrayList3.iterator();
                                int i5 = onExtraCallback + 33;
                                IAuthTabCallback = i5 % 128;
                                int i6 = i5 % 2;
                                while (it3.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it3.next()).toString())));
                                }
                                string = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it4 = listSplit$default3.iterator();
                                while (it4.hasNext()) {
                                    int i7 = IAuthTabCallback + 111;
                                    onExtraCallback = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        ((String) it4.next()).length();
                                        throw null;
                                    }
                                    Object next3 = it4.next();
                                    if (((String) next3).length() > 0) {
                                        arrayList5.add(next3);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it5 = arrayList5.iterator();
                                while (!(!it5.hasNext())) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it5.next()).toString())));
                                }
                                string = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : listSplit$default4) {
                                    if (((String) obj2).length() > 0) {
                                        int i8 = onExtraCallback + 9;
                                        IAuthTabCallback = i8 % 128;
                                        int i9 = i8 % 2;
                                        arrayList7.add(obj2);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it6 = arrayList7.iterator();
                                while (it6.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it6.next()).toString())));
                                }
                                string = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj3 : listSplit$default5) {
                                    int i10 = onExtraCallback + 11;
                                    IAuthTabCallback = i10 % 128;
                                    int i11 = i10 % 2;
                                    if (((String) obj3).length() > 0) {
                                        int i12 = IAuthTabCallback + 119;
                                        onExtraCallback = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            arrayList9.add(obj3);
                                            obj.hashCode();
                                            throw null;
                                        }
                                        arrayList9.add(obj3);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it7 = arrayList9.iterator();
                                while (it7.hasNext()) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it7.next()).toString())));
                                }
                                string = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                Iterator it8 = listSplit$default6.iterator();
                                while (it8.hasNext()) {
                                    int i13 = onExtraCallback + 5;
                                    IAuthTabCallback = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        ((String) it8.next()).length();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    Object next4 = it8.next();
                                    if (((String) next4).length() > 0) {
                                        arrayList11.add(next4);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it9 = arrayList11.iterator();
                                while (it9.hasNext()) {
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it9.next()).toString())));
                                }
                                string = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj4 : listSplit$default7) {
                                    if (((String) obj4).length() > 0) {
                                        arrayList13.add(obj4);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it10 = arrayList13.iterator();
                                while (it10.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it10.next()).toString())));
                                }
                                string = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj5 : listSplit$default8) {
                                    if (((String) obj5).length() > 0) {
                                        arrayList15.add(obj5);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it11 = arrayList15.iterator();
                                while (it11.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it11.next()).toString().charAt(0)));
                                }
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj6 : listSplit$default9) {
                                    if (((String) obj6).length() > 0) {
                                        arrayList17.add(obj6);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = String.class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj7 : enumConstants) {
                                        Intrinsics.checkNotNull(obj7, "");
                                        arrayList18.add((Enum) obj7);
                                    }
                                    Iterator it12 = arrayList18.iterator();
                                    while (true) {
                                        if (!it12.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it12.next();
                                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                            break;
                                        }
                                    }
                                    string = (Enum) next;
                                } else {
                                    string = 0;
                                }
                                if (string == 0) {
                                    int i14 = onExtraCallback + 111;
                                    IAuthTabCallback = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        zzaj.onNavigationEvent().onActivityLayout();
                                        throw null;
                                    }
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                    }
                    boolean z = string instanceof String;
                    String str2 = string;
                    if (!z) {
                        str2 = null;
                    }
                    str = str2;
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj8 = extras3 != null ? extras3.get("STANDARD_TERMS_V2_ENTER_ERROR_REASON") : null;
                if (!(obj8 instanceof String)) {
                    obj8 = null;
                }
                str = (String) obj8;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                int i15 = onExtraCallback + 5;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                serializableExtra = intent.getSerializableExtra("STANDARD_TERMS_V2_RESULT_MESSAGE", r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.class);
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra("STANDARD_TERMS_V2_RESULT_MESSAGE");
                serializableExtra = (r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0) (serializableExtra2 instanceof r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 ? serializableExtra2 : null);
            }
            r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0 = (r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0) serializableExtra;
            r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d02 = r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_ALREADY_TERMS_AGREED;
            if (r8lambdahekmogpxfnmskbbrjd3t2vn5d0 == r8lambdahekmogpxfnmskbbrjd3t2vn5d02) {
                return new ITrustedWebActivityCallbackStub.onWarmupCompleted<>(new r8lambda6V0YVgpvgCQzEji1GNetQSIYsE(r8lambdahekmogpxfnmskbbrjd3t2vn5d02, null, null, null, null, 30, null));
            }
            if (str == null) {
                return super.onNavigationEvent(context, intent);
            }
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "StandardTermsResultLauncher", "errorReason: " + str, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return new ITrustedWebActivityCallbackStub.onWarmupCompleted<>(new r8lambda6V0YVgpvgCQzEji1GNetQSIYsE(r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_OTHER_ERROR, null, null, null, null, 30, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:194:0x053b  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x054d  */
        /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v106 */
        /* JADX WARN: Type inference failed for: r2v107 */
        /* JADX WARN: Type inference failed for: r2v110 */
        /* JADX WARN: Type inference failed for: r2v111 */
        /* JADX WARN: Type inference failed for: r2v116, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v121, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v126, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v131, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v136, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v141, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v146, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v151, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v156, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v158, types: [java.lang.Character] */
        /* JADX WARN: Type inference failed for: r2v160, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v161, types: [java.lang.Byte] */
        /* JADX WARN: Type inference failed for: r2v162, types: [java.lang.Short] */
        /* JADX WARN: Type inference failed for: r2v163, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r2v164, types: [java.lang.Float] */
        /* JADX WARN: Type inference failed for: r2v165, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r2v166 */
        /* JADX WARN: Type inference failed for: r2v170, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.Character] */
        /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.Byte] */
        /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Short] */
        /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Double] */
        /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Float] */
        /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Long] */
        /* JADX WARN: Type inference failed for: r2v86 */
        /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Integer] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r8lambda6V0YVgpvgCQzEji1GNetQSIYsE onExtraCallbackWithResult(int i, Intent intent) {
            long[] jArr;
            List listEmptyList;
            r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent onnavigationevent;
            Serializable serializableExtra;
            Object serializableExtra2;
            r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent onnavigationevent2;
            ?? string;
            Object next;
            Object next2;
            int i2 = 2 % 2;
            if (intent == null) {
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "StandardTermsResultLauncher", "intent: " + intent + " , resultCode: " + i, (Map) null, (String) null, false, (String) null, 60, (Object) null);
                return new r8lambda6V0YVgpvgCQzEji1GNetQSIYsE(r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_OTHER_ERROR, null, null, null, null, 30, null);
            }
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("STANDARD_TERMS_V2_RESULT_SIGNED_DOCUMENTS")) {
                jArr = null;
            } else if (zzbq.onNavigationEvent(intent)) {
                int i3 = IAuthTabCallback + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    int i5 = onExtraCallback + 27;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        extras2.getString("STANDARD_TERMS_V2_RESULT_SIGNED_DOCUMENTS");
                        obj.hashCode();
                        throw null;
                    }
                    ?? string2 = extras2.getString("STANDARD_TERMS_V2_RESULT_SIGNED_DOCUMENTS");
                    if (string2 != 0) {
                        if (Intrinsics.areEqual(long[].class, Integer.class)) {
                            string2 = StringsKt.toIntOrNull((String) string2);
                        } else if (Intrinsics.areEqual(long[].class, Long.class)) {
                            string2 = StringsKt.toLongOrNull((String) string2);
                        } else if (Intrinsics.areEqual(long[].class, Float.class)) {
                            string2 = StringsKt.toFloatOrNull((String) string2);
                        } else if (Intrinsics.areEqual(long[].class, Double.class)) {
                            string2 = StringsKt.toDoubleOrNull((String) string2);
                        } else if (Intrinsics.areEqual(long[].class, Short.class)) {
                            string2 = StringsKt.toShortOrNull((String) string2);
                        } else if (Intrinsics.areEqual(long[].class, Byte.class)) {
                            string2 = StringsKt.toByteOrNull((String) string2);
                        } else if (Intrinsics.areEqual(long[].class, Boolean.class)) {
                            int i6 = onExtraCallback + 119;
                            IAuthTabCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                Boolean.valueOf(Boolean.parseBoolean(string2));
                                throw null;
                            }
                            string2 = Boolean.valueOf(Boolean.parseBoolean(string2));
                        } else if (Intrinsics.areEqual(long[].class, Character.class)) {
                            string2 = Character.valueOf(string2.charAt(0));
                        } else if (!Intrinsics.areEqual(long[].class, String.class)) {
                            if (Intrinsics.areEqual(long[].class, Integer[].class)) {
                                List listSplit$default = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : listSplit$default) {
                                    if (((String) obj).length() > 0) {
                                        arrayList.add(obj);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                }
                                string2 = arrayList2.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(long[].class, Long[].class)) {
                                List listSplit$default2 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : listSplit$default2) {
                                    if (((String) obj2).length() > 0) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                }
                                string2 = arrayList4.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(long[].class, Float[].class)) {
                                List listSplit$default3 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : listSplit$default3) {
                                    if (((String) obj3).length() > 0) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                }
                                string2 = arrayList6.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(long[].class, Double[].class)) {
                                List listSplit$default4 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj4 : listSplit$default4) {
                                    if (((String) obj4).length() > 0) {
                                        arrayList7.add(obj4);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                }
                                string2 = arrayList8.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(long[].class, Short[].class)) {
                                List listSplit$default5 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList9 = new ArrayList();
                                for (Object obj5 : listSplit$default5) {
                                    if (((String) obj5).length() > 0) {
                                        arrayList9.add(obj5);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                Iterator it5 = arrayList9.iterator();
                                while (it5.hasNext()) {
                                    arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                }
                                string2 = arrayList10.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(long[].class, Byte[].class)) {
                                List listSplit$default6 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList11 = new ArrayList();
                                for (Object obj6 : listSplit$default6) {
                                    if (((String) obj6).length() > 0) {
                                        arrayList11.add(obj6);
                                    }
                                }
                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                Iterator it6 = arrayList11.iterator();
                                while (it6.hasNext()) {
                                    int i7 = onExtraCallback + 123;
                                    IAuthTabCallback = i7 % 128;
                                    int i8 = i7 % 2;
                                    arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                }
                                string2 = arrayList12.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(long[].class, Boolean[].class)) {
                                List listSplit$default7 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList13 = new ArrayList();
                                for (Object obj7 : listSplit$default7) {
                                    if (((String) obj7).length() > 0) {
                                        arrayList13.add(obj7);
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                Iterator it7 = arrayList13.iterator();
                                while (it7.hasNext()) {
                                    arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                                }
                                string2 = arrayList14.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(long[].class, Character[].class)) {
                                List listSplit$default8 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj8 : listSplit$default8) {
                                    if (((String) obj8).length() > 0) {
                                        arrayList15.add(obj8);
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                Iterator it8 = arrayList15.iterator();
                                while (it8.hasNext()) {
                                    arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                                }
                                string2 = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(long[].class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string2 = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = long[].class.getEnumConstants();
                                if (enumConstants != null) {
                                    ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                    for (Object obj10 : enumConstants) {
                                        Intrinsics.checkNotNull(obj10, "");
                                        arrayList18.add((Enum) obj10);
                                    }
                                    Iterator it9 = arrayList18.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it9.next();
                                        if (Intrinsics.areEqual(((Enum) next2).name(), (Object) string2)) {
                                            break;
                                        }
                                    }
                                    string2 = (Enum) next2;
                                } else {
                                    string2 = 0;
                                }
                                if (string2 == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(long[].class.getSimpleName() + " is not supported");
                                    }
                                    string2 = 0;
                                }
                            }
                        }
                        boolean z = string2 instanceof long[];
                        long[] jArr2 = string2;
                        if (!z) {
                            jArr2 = null;
                        }
                        jArr = jArr2;
                    }
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj11 = extras3 != null ? extras3.get("STANDARD_TERMS_V2_RESULT_SIGNED_DOCUMENTS") : null;
                if (!(obj11 instanceof long[])) {
                    obj11 = null;
                }
                jArr = (long[]) obj11;
            }
            if (jArr != null) {
                int i9 = IAuthTabCallback + 109;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                listEmptyList = ArraysKt.toList(jArr);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
            List list = listEmptyList;
            Bundle extras4 = intent.getExtras();
            if (extras4 == null || !extras4.containsKey("STANDARD_TERMS_V2_RESULT_LAST_CLICKED_BUTTON")) {
                onnavigationevent = null;
            } else {
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras5 = intent.getExtras();
                    if (extras5 != null && (string = extras5.getString("STANDARD_TERMS_V2_RESULT_LAST_CLICKED_BUTTON")) != 0) {
                        if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Integer.class)) {
                            string = StringsKt.toIntOrNull((String) string);
                        } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Long.class)) {
                            string = StringsKt.toLongOrNull((String) string);
                        } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Float.class)) {
                            string = StringsKt.toFloatOrNull((String) string);
                        } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Double.class)) {
                            string = StringsKt.toDoubleOrNull((String) string);
                        } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Short.class)) {
                            string = StringsKt.toShortOrNull((String) string);
                        } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Byte.class)) {
                            string = StringsKt.toByteOrNull((String) string);
                        } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Boolean.class)) {
                            string = Boolean.valueOf(Boolean.parseBoolean(string));
                        } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Character.class)) {
                            string = Character.valueOf(string.charAt(0));
                        } else if (!Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, String.class)) {
                            if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Integer[].class)) {
                                List listSplit$default10 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList19 = new ArrayList();
                                Iterator it10 = listSplit$default10.iterator();
                                while (it10.hasNext()) {
                                    int i11 = onExtraCallback + 93;
                                    IAuthTabCallback = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        ((String) it10.next()).length();
                                        obj.hashCode();
                                        throw null;
                                    }
                                    Object next3 = it10.next();
                                    if (((String) next3).length() > 0) {
                                        arrayList19.add(next3);
                                    }
                                }
                                ArrayList arrayList20 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList19, 10));
                                Iterator it11 = arrayList19.iterator();
                                while (it11.hasNext()) {
                                    arrayList20.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it11.next()).toString())));
                                }
                                string = arrayList20.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Long[].class)) {
                                List listSplit$default11 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList21 = new ArrayList();
                                for (Object obj12 : listSplit$default11) {
                                    if (((String) obj12).length() > 0) {
                                        arrayList21.add(obj12);
                                    }
                                }
                                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList21, 10));
                                Iterator it12 = arrayList21.iterator();
                                while (it12.hasNext()) {
                                    arrayList22.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it12.next()).toString())));
                                }
                                string = arrayList22.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Float[].class)) {
                                List listSplit$default12 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList23 = new ArrayList();
                                for (Object obj13 : listSplit$default12) {
                                    if (((String) obj13).length() > 0) {
                                        arrayList23.add(obj13);
                                    }
                                }
                                ArrayList arrayList24 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList23, 10));
                                Iterator it13 = arrayList23.iterator();
                                while (it13.hasNext()) {
                                    arrayList24.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it13.next()).toString())));
                                }
                                string = arrayList24.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Double[].class)) {
                                List listSplit$default13 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList25 = new ArrayList();
                                for (Object obj14 : listSplit$default13) {
                                    if (((String) obj14).length() > 0) {
                                        int i12 = IAuthTabCallback + 117;
                                        onExtraCallback = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            arrayList25.add(obj14);
                                            throw null;
                                        }
                                        arrayList25.add(obj14);
                                    }
                                }
                                ArrayList arrayList26 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList25, 10));
                                Iterator it14 = arrayList25.iterator();
                                while (it14.hasNext()) {
                                    arrayList26.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it14.next()).toString())));
                                }
                                string = arrayList26.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Short[].class)) {
                                List listSplit$default14 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList27 = new ArrayList();
                                for (Object obj15 : listSplit$default14) {
                                    if (((String) obj15).length() > 0) {
                                        arrayList27.add(obj15);
                                    }
                                }
                                ArrayList arrayList28 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList27, 10));
                                Iterator it15 = arrayList27.iterator();
                                while (it15.hasNext()) {
                                    int i13 = onExtraCallback + 9;
                                    IAuthTabCallback = i13 % 128;
                                    int i14 = i13 % 2;
                                    arrayList28.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it15.next()).toString())));
                                }
                                string = arrayList28.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Byte[].class)) {
                                List listSplit$default15 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList29 = new ArrayList();
                                for (Object obj16 : listSplit$default15) {
                                    if (((String) obj16).length() > 0) {
                                        arrayList29.add(obj16);
                                    }
                                }
                                ArrayList arrayList30 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList29, 10));
                                Iterator it16 = arrayList29.iterator();
                                while (!(!it16.hasNext())) {
                                    arrayList30.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it16.next()).toString())));
                                }
                                string = arrayList30.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Boolean[].class)) {
                                List listSplit$default16 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList31 = new ArrayList();
                                for (Object obj17 : listSplit$default16) {
                                    if (((String) obj17).length() > 0) {
                                        arrayList31.add(obj17);
                                    }
                                }
                                ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList31, 10));
                                Iterator it17 = arrayList31.iterator();
                                while (it17.hasNext()) {
                                    arrayList32.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it17.next()).toString())));
                                }
                                string = arrayList32.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, Character[].class)) {
                                List listSplit$default17 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList33 = new ArrayList();
                                Iterator it18 = listSplit$default17.iterator();
                                while (it18.hasNext()) {
                                    int i15 = IAuthTabCallback + 77;
                                    onExtraCallback = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        ((String) it18.next()).length();
                                        throw null;
                                    }
                                    Object next4 = it18.next();
                                    if (((String) next4).length() > 0) {
                                        arrayList33.add(next4);
                                    }
                                }
                                ArrayList arrayList34 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList33, 10));
                                Iterator it19 = arrayList33.iterator();
                                while (it19.hasNext()) {
                                    arrayList34.add(Character.valueOf(StringsKt.trim((String) it19.next()).toString().charAt(0)));
                                }
                                string = arrayList34.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class, String[].class)) {
                                List listSplit$default18 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList35 = new ArrayList();
                                for (Object obj18 : listSplit$default18) {
                                    if (((String) obj18).length() > 0) {
                                        arrayList35.add(obj18);
                                    }
                                }
                                string = arrayList35.toArray(new String[0]);
                            } else {
                                Object[] enumConstants2 = r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class.getEnumConstants();
                                if (enumConstants2 != null) {
                                    ArrayList arrayList36 = new ArrayList(enumConstants2.length);
                                    for (Object obj19 : enumConstants2) {
                                        Intrinsics.checkNotNull(obj19, "");
                                        arrayList36.add((Enum) obj19);
                                    }
                                    Iterator it20 = arrayList36.iterator();
                                    while (true) {
                                        if (!it20.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it20.next();
                                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                            break;
                                        }
                                    }
                                    string = (Enum) next;
                                } else {
                                    string = 0;
                                }
                                if (string == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent.class.getSimpleName() + " is not supported");
                                    }
                                    string = 0;
                                }
                            }
                        }
                        boolean z2 = string instanceof r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent;
                        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent onnavigationevent3 = string;
                        if (!z2) {
                            onnavigationevent3 = null;
                        }
                        onnavigationevent2 = onnavigationevent3;
                    }
                    onnavigationevent = null;
                } else {
                    Bundle extras6 = intent.getExtras();
                    Object obj20 = extras6 != null ? extras6.get("STANDARD_TERMS_V2_RESULT_LAST_CLICKED_BUTTON") : null;
                    if (!(obj20 instanceof r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent)) {
                        obj20 = null;
                    }
                    onnavigationevent2 = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE.onNavigationEvent) obj20;
                }
                onnavigationevent = onnavigationevent2;
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 33) {
                serializableExtra = intent.getSerializableExtra("STANDARD_TERMS_V2_RESULT_LAST_VIEWED_STEP", Necessity.class);
            } else {
                Serializable serializableExtra3 = intent.getSerializableExtra("STANDARD_TERMS_V2_RESULT_LAST_VIEWED_STEP");
                if (!(serializableExtra3 instanceof Necessity)) {
                    serializableExtra3 = null;
                }
                serializableExtra = (Necessity) serializableExtra3;
            }
            Necessity necessity = (Necessity) serializableExtra;
            ArrayList arrayListOnNavigationEvent = EncoderImplExternalSyntheticLambda3.onNavigationEvent(intent, "STANDARD_TERMS_V2_RESULT_TERMS_AGREED_STATE", r8lambda8_kfmHbROf7Yv_VB29JQcaCjh4.class);
            List list2 = arrayListOnNavigationEvent != null ? CollectionsKt.toList(arrayListOnNavigationEvent) : null;
            if (i16 >= 33) {
                int i17 = onExtraCallback + 55;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                serializableExtra2 = intent.getSerializableExtra("STANDARD_TERMS_V2_RESULT_MESSAGE", r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.class);
            } else {
                Serializable serializableExtra4 = intent.getSerializableExtra("STANDARD_TERMS_V2_RESULT_MESSAGE");
                serializableExtra2 = (r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0) (serializableExtra4 instanceof r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 ? serializableExtra4 : null);
            }
            r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0 r8lambdahekmogpxfnmskbbrjd3t2vn5d0 = (r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0) serializableExtra2;
            return r8lambdahekmogpxfnmskbbrjd3t2vn5d0 == null ? new r8lambda6V0YVgpvgCQzEji1GNetQSIYsE(r8lambdaHeKmoGPxfnmSkbbrJD3T2Vn5d0.RESULT_OTHER_ERROR, null, null, null, null, 30, null) : new r8lambda6V0YVgpvgCQzEji1GNetQSIYsE(r8lambdahekmogpxfnmskbbrjd3t2vn5d0, list, onnavigationevent, necessity, list2);
        }
    }

    public static final ITrustedWebActivityCallbackStub<Intent, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE> onExtraCallbackWithResult() {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }
}
