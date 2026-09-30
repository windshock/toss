package im.toss.features.manualselfie.impl.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.manualselfie.impl.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7;
import o.Ripple_androidKt;
import o.RotationProvider1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.getExtraInfo;
import o.getWrite;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ManualSelfieVerifyActivity extends Hilt_ManualSelfieVerifyActivity {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));

    static {
        int i = asInterface + 43;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 51;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ Intent onExtraCallbackWithResult(onExtraCallback onextracallback, Context context, long j, long j2, String str, List list, IAuthTabCallback iAuthTabCallback, String str2, String str3, int i, Object obj) {
            String str4;
            String str5;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 61;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            long j3 = (i3 % 2 != 0 ? (i & 2) == 0 : (i & 3) == 0) ? j : 0L;
            long j4 = (i & 4) != 0 ? 0L : j2;
            if ((i & 8) != 0) {
                int i5 = i4 + 121;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                str4 = null;
            } else {
                str4 = str;
            }
            List listEmptyList = (i & 16) != 0 ? CollectionsKt.emptyList() : list;
            String str6 = (i & 64) != 0 ? null : str2;
            if ((i & 128) != 0) {
                int i7 = onExtraCallback + 55;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                str5 = null;
            } else {
                str5 = str3;
            }
            return onextracallback.onNavigationEvent(context, j3, j4, str4, listEmptyList, iAuthTabCallback, str6, str5);
        }

        public final Intent onNavigationEvent(@NotNull Context context, long j, long j2, @Nullable String str, @NotNull List<String> list, @NotNull IAuthTabCallback iAuthTabCallback, @Nullable String str2, @Nullable String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) ManualSelfieVerifyActivity.class).putExtra("EXTRA_SESSION_ID", j).putExtra("EXTRA_UNIFIED_ID", j2).putExtra("EXTRA_VIDEO_CALL_URL", str).putExtra("EXTRA_ENTER_TYPE", iAuthTabCallback).putExtra("EXTRA_MANUAL_SELFIE_AVAILABLE_ALTERNATIVE_STRING", new ArrayList(list));
            if (str2 != null) {
                intentPutExtra.putExtra("EXTRA_MANUAL_SELFIE_REFERRER", str2);
            }
            if (str3 != null) {
                int i2 = onWarmupCompleted + 93;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                intentPutExtra.putExtra("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER", str3);
            }
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i4 = onWarmupCompleted + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return intentPutExtra;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<getExtraInfo> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Activity IAuthTabCallback;

        public onExtraCallbackWithResult(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback();
            }
            onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getExtraInfo onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                return getExtraInfo.onNavigationEvent(layoutInflater);
            }
            LayoutInflater layoutInflater2 = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
            getExtraInfo.onNavigationEvent(layoutInflater2);
            throw null;
        }
    }

    private final getExtraInfo onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getExtraInfo getextrainfo = (getExtraInfo) this.IAuthTabCallbackStub.getValue();
        int i4 = IAuthTabCallbackDefault + 3;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return getextrainfo;
        }
        throw null;
    }

    private final Ripple_androidKt setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(getSupportFragmentManager().findFragmentById(onNavigationEvent().onWarmupCompleted.getId()), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Ripple_androidKt ripple_androidKtFindFragmentById = getSupportFragmentManager().findFragmentById(onNavigationEvent().onWarmupCompleted.getId());
        Intrinsics.checkNotNull(ripple_androidKtFindFragmentById, "");
        Ripple_androidKt ripple_androidKt = ripple_androidKtFindFragmentById;
        int i3 = IAuthTabCallbackDefault + 17;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return ripple_androidKt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x059c  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, im.toss.features.manualselfie.impl.controller.ManualSelfieVerifyActivity] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String ICustomTabsServiceStub() {
        String str;
        Bundle extras;
        ?? string;
        Object next;
        int i;
        int i2 = 2 % 2;
        Intent intent = getIntent();
        Object obj = null;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("EXTRA_VIDEO_CALL_URL")) {
            str = null;
        } else if (zzbq.onNavigationEvent(intent)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null && (string = extras2.getString("EXTRA_VIDEO_CALL_URL")) != 0) {
                if (Intrinsics.areEqual(String.class, Integer.class)) {
                    int i3 = onTransact + 13;
                    IAuthTabCallbackDefault = i3 % 128;
                    int i4 = i3 % 2;
                    string = StringsKt.toIntOrNull((String) string);
                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                    string = StringsKt.toLongOrNull((String) string);
                } else if (Intrinsics.areEqual(String.class, Float.class)) {
                    int i5 = onTransact + 25;
                    IAuthTabCallbackDefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        StringsKt.toFloatOrNull((String) string);
                        throw null;
                    }
                    string = StringsKt.toFloatOrNull((String) string);
                } else if (Intrinsics.areEqual(String.class, Double.class)) {
                    string = StringsKt.toDoubleOrNull((String) string);
                } else if (Intrinsics.areEqual(String.class, Short.class)) {
                    string = StringsKt.toShortOrNull((String) string);
                } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                    string = StringsKt.toByteOrNull((String) string);
                } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                    string = Boolean.valueOf(Boolean.parseBoolean(string));
                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                    string = Character.valueOf(string.charAt(0));
                } else if (!Intrinsics.areEqual(String.class, String.class)) {
                    if (Intrinsics.areEqual(String.class, Integer[].class)) {
                        List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listSplit$default) {
                            int i6 = IAuthTabCallbackDefault + 67;
                            onTransact = i6 % 128;
                            int i7 = i6 % 2;
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i8 = IAuthTabCallbackDefault + 107;
                            onTransact = i8 % 128;
                            if (i8 % 2 == 0) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                obj.hashCode();
                                throw null;
                            }
                            arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                        }
                        string = arrayList2.toArray(new Integer[0]);
                    } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                        List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listSplit$default2) {
                            if (((String) obj3).length() > 0) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                        }
                        string = arrayList4.toArray(new Long[0]);
                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                        List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : listSplit$default3) {
                            if (((String) obj4).length() > 0) {
                                arrayList5.add(obj4);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                        }
                        string = arrayList6.toArray(new Float[0]);
                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                        List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj5 : listSplit$default4) {
                            if (((String) obj5).length() > 0) {
                                int i9 = IAuthTabCallbackDefault + 69;
                                onTransact = i9 % 128;
                                int i10 = i9 % 2;
                                arrayList7.add(obj5);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                        Iterator it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                        }
                        string = arrayList8.toArray(new Double[0]);
                    } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                        List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj6 : listSplit$default5) {
                            if (((String) obj6).length() > 0) {
                                int i11 = IAuthTabCallbackDefault + 111;
                                onTransact = i11 % 128;
                                if (i11 % 2 == 0) {
                                    arrayList9.add(obj6);
                                    int i12 = 17 / 0;
                                } else {
                                    arrayList9.add(obj6);
                                }
                            }
                        }
                        ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                        }
                        string = arrayList10.toArray(new Short[0]);
                    } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                        List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj7 : listSplit$default6) {
                            if (((String) obj7).length() > 0) {
                                arrayList11.add(obj7);
                            }
                        }
                        ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                        Iterator it6 = arrayList11.iterator();
                        while (it6.hasNext()) {
                            arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                        }
                        string = arrayList12.toArray(new Byte[0]);
                    } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                        List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj8 : listSplit$default7) {
                            if (((String) obj8).length() > 0) {
                                arrayList13.add(obj8);
                            }
                        }
                        ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                        Iterator it7 = arrayList13.iterator();
                        while (it7.hasNext()) {
                            arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it7.next()).toString())));
                        }
                        string = arrayList14.toArray(new Boolean[0]);
                    } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                        List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj9 : listSplit$default8) {
                            if (((String) obj9).length() > 0) {
                                arrayList15.add(obj9);
                            }
                        }
                        ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                        Iterator it8 = arrayList15.iterator();
                        while (it8.hasNext()) {
                            arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                        }
                        string = arrayList16.toArray(new Character[0]);
                    } else if (Intrinsics.areEqual(String.class, String[].class)) {
                        List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj10 : listSplit$default9) {
                            if (((String) obj10).length() > 0) {
                                int i13 = IAuthTabCallbackDefault + 67;
                                onTransact = i13 % 128;
                                if (i13 % 2 == 0) {
                                    arrayList17.add(obj10);
                                    obj.hashCode();
                                    throw null;
                                }
                                arrayList17.add(obj10);
                            }
                        }
                        string = arrayList17.toArray(new String[0]);
                    } else {
                        Object[] enumConstants = String.class.getEnumConstants();
                        if (enumConstants != null) {
                            ArrayList arrayList18 = new ArrayList(enumConstants.length);
                            for (Object obj11 : enumConstants) {
                                Intrinsics.checkNotNull(obj11, "");
                                arrayList18.add((Enum) obj11);
                            }
                            Iterator it9 = arrayList18.iterator();
                            while (it9.hasNext()) {
                                int i14 = IAuthTabCallbackDefault + 65;
                                onTransact = i14 % 128;
                                if (i14 % 2 == 0) {
                                    next = it9.next();
                                    int i15 = 44 / 0;
                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                        i = onTransact + 9;
                                        IAuthTabCallbackDefault = i % 128;
                                        if (i % 2 != 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                } else {
                                    next = it9.next();
                                    if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                        i = onTransact + 9;
                                        IAuthTabCallbackDefault = i % 128;
                                        if (i % 2 != 0) {
                                        }
                                    }
                                }
                                string = (Enum) next;
                            }
                            next = null;
                            string = (Enum) next;
                        } else {
                            string = 0;
                        }
                        if (string == 0) {
                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                            }
                            string = 0;
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
            Object obj12 = extras3 != null ? extras3.get("EXTRA_VIDEO_CALL_URL") : null;
            if (!(obj12 instanceof String)) {
                obj12 = null;
            }
            str = (String) obj12;
        }
        if (str != null) {
            return str;
        }
        int i16 = onTransact + 39;
        IAuthTabCallbackDefault = i16 % 128;
        if (i16 % 2 == 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Activity, im.toss.features.manualselfie.impl.controller.ManualSelfieVerifyActivity] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object[]] */
    private final String ICustomTabsServiceDefault() {
        Bundle extras;
        ?? string;
        Object next;
        Object next2;
        int i = 2 % 2;
        Intent intent = getIntent();
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i2 = onTransact + 7;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0 ? extras.containsKey("EXTRA_MANUAL_SELFIE_REFERRER") : extras.containsKey("EXTRA_MANUAL_SELFIE_REFERRER")) {
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null && (string = extras2.getString("EXTRA_MANUAL_SELFIE_REFERRER")) != 0) {
                        if (Intrinsics.areEqual(String.class, Integer.class)) {
                            int i3 = onTransact + 27;
                            IAuthTabCallbackDefault = i3 % 128;
                            if (i3 % 2 != 0) {
                                StringsKt.toIntOrNull((String) string);
                                str.hashCode();
                                throw null;
                            }
                            string = StringsKt.toIntOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Long.class)) {
                            string = StringsKt.toLongOrNull((String) string);
                        } else if (Intrinsics.areEqual(String.class, Float.class)) {
                            int i4 = IAuthTabCallbackDefault + 117;
                            onTransact = i4 % 128;
                            int i5 = i4 % 2;
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
                                int i6 = onTransact + 33;
                                IAuthTabCallbackDefault = i6 % 128;
                                string = i6 % 2 != 0 ? Character.valueOf(string.charAt(1)) : Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = listSplit$default.iterator();
                                    while (it.hasNext()) {
                                        int i7 = onTransact + 69;
                                        IAuthTabCallbackDefault = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            ((String) it.next()).length();
                                            throw null;
                                        }
                                        Object next3 = it.next();
                                        if (((String) next3).length() > 0) {
                                            arrayList.add(next3);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it2.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj : listSplit$default2) {
                                        if (((String) obj).length() > 0) {
                                            arrayList3.add(obj);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it3.next()).toString())));
                                    }
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it4 = listSplit$default3.iterator();
                                    while (!(!it4.hasNext())) {
                                        Object next4 = it4.next();
                                        if (((String) next4).length() > 0) {
                                            arrayList5.add(next4);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it5 = arrayList5.iterator();
                                    while (it5.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it5.next()).toString())));
                                    }
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj2 : listSplit$default4) {
                                        if (((String) obj2).length() > 0) {
                                            arrayList7.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it6 = arrayList7.iterator();
                                    while (it6.hasNext()) {
                                        int i8 = onTransact + 73;
                                        IAuthTabCallbackDefault = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it6.next()).toString())));
                                            str.hashCode();
                                            throw null;
                                        }
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it6.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj3 : listSplit$default5) {
                                        int i9 = onTransact + 37;
                                        IAuthTabCallbackDefault = i9 % 128;
                                        int i10 = i9 % 2;
                                        if (((String) obj3).length() > 0) {
                                            int i11 = IAuthTabCallbackDefault + 43;
                                            onTransact = i11 % 128;
                                            if (i11 % 2 == 0) {
                                                arrayList9.add(obj3);
                                                str.hashCode();
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
                                    for (Object obj4 : listSplit$default6) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList11.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it8 = arrayList11.iterator();
                                    while (it8.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it8.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    Iterator it9 = listSplit$default7.iterator();
                                    while (it9.hasNext()) {
                                        int i12 = onTransact + 73;
                                        IAuthTabCallbackDefault = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            next2 = it9.next();
                                            int i13 = 57 / 0;
                                            if (((String) next2).length() > 0) {
                                                arrayList13.add(next2);
                                            }
                                        } else {
                                            next2 = it9.next();
                                            if (((String) next2).length() > 0) {
                                                arrayList13.add(next2);
                                            }
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
                                            int i14 = IAuthTabCallbackDefault + 87;
                                            onTransact = i14 % 128;
                                            int i15 = i14 % 2;
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
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                        }
                                        string = 0;
                                    }
                                }
                            }
                        }
                        str = string instanceof String ? string : null;
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    Object obj8 = extras3 != null ? extras3.get("EXTRA_MANUAL_SELFIE_REFERRER") : null;
                    str = (String) (obj8 instanceof String ? obj8 : null);
                }
            }
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, im.toss.features.manualselfie.impl.controller.ManualSelfieVerifyActivity] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    private final String updateVisuals() {
        Object next;
        int i = 2 % 2;
        Intent intent = getIntent();
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        if (intent != null) {
            int i2 = onTransact + 95;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER")) {
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        int i4 = onTransact + 107;
                        IAuthTabCallbackDefault = i4 % 128;
                        int i5 = i4 % 2;
                        ?? string = extras2.getString("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER");
                        if (string != 0) {
                            if (Intrinsics.areEqual(String.class, Integer.class)) {
                                int i6 = IAuthTabCallbackDefault + 79;
                                onTransact = i6 % 128;
                                if (i6 % 2 == 0) {
                                    StringsKt.toIntOrNull((String) string);
                                    str.hashCode();
                                    throw null;
                                }
                                string = StringsKt.toIntOrNull((String) string);
                            } else if (Intrinsics.areEqual(String.class, Long.class)) {
                                string = StringsKt.toLongOrNull((String) string);
                            } else if (Intrinsics.areEqual(String.class, Float.class)) {
                                string = StringsKt.toFloatOrNull((String) string);
                            } else {
                                if (Intrinsics.areEqual(String.class, Double.class)) {
                                    int i7 = IAuthTabCallbackDefault + 15;
                                    onTransact = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        string = StringsKt.toDoubleOrNull((String) string);
                                        int i8 = 94 / 0;
                                    } else {
                                        string = StringsKt.toDoubleOrNull((String) string);
                                    }
                                } else if (Intrinsics.areEqual(String.class, Short.class)) {
                                    string = StringsKt.toShortOrNull((String) string);
                                } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                                    string = StringsKt.toByteOrNull((String) string);
                                } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                                    string = Boolean.valueOf(Boolean.parseBoolean(string));
                                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                                    string = Character.valueOf(string.charAt(0));
                                } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                    int i9 = onTransact + 47;
                                    IAuthTabCallbackDefault = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        Intrinsics.areEqual(String.class, Integer[].class);
                                        throw null;
                                    }
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
                                            int i10 = onTransact + 21;
                                            IAuthTabCallbackDefault = i10 % 128;
                                            if (i10 % 2 != 0) {
                                                arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                                throw null;
                                            }
                                            arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                        }
                                        string = arrayList2.toArray(new Integer[0]);
                                    } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                        List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj2 : listSplit$default2) {
                                            int i11 = onTransact + 93;
                                            IAuthTabCallbackDefault = i11 % 128;
                                            int i12 = i11 % 2;
                                            if (((String) obj2).length() > 0) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                                        Iterator it2 = arrayList3.iterator();
                                        while (it2.hasNext()) {
                                            arrayList4.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                        }
                                        string = arrayList4.toArray(new Long[0]);
                                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                        List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
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
                                        string = arrayList6.toArray(new Float[0]);
                                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                        List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj4 : listSplit$default4) {
                                            if (((String) obj4).length() > 0) {
                                                arrayList7.add(obj4);
                                            }
                                        }
                                        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                        Iterator it4 = arrayList7.iterator();
                                        while (it4.hasNext()) {
                                            int i13 = onTransact + 39;
                                            IAuthTabCallbackDefault = i13 % 128;
                                            int i14 = i13 % 2;
                                            arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                        }
                                        string = arrayList8.toArray(new Double[0]);
                                    } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                        List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
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
                                        string = arrayList10.toArray(new Short[0]);
                                    } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                        List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj6 : listSplit$default6) {
                                            if (((String) obj6).length() > 0) {
                                                arrayList11.add(obj6);
                                            }
                                        }
                                        ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                        Iterator it6 = arrayList11.iterator();
                                        int i15 = IAuthTabCallbackDefault + 31;
                                        onTransact = i15 % 128;
                                        int i16 = i15 % 2;
                                        while (it6.hasNext()) {
                                            arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                        }
                                        string = arrayList12.toArray(new Byte[0]);
                                    } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                        List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
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
                                        string = arrayList14.toArray(new Boolean[0]);
                                    } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                        List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList15 = new ArrayList();
                                        Iterator it8 = listSplit$default8.iterator();
                                        while (!(!it8.hasNext())) {
                                            Object next2 = it8.next();
                                            if (((String) next2).length() > 0) {
                                                arrayList15.add(next2);
                                            }
                                        }
                                        ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                        Iterator it9 = arrayList15.iterator();
                                        while (it9.hasNext()) {
                                            arrayList16.add(Character.valueOf(StringsKt.trim((String) it9.next()).toString().charAt(0)));
                                        }
                                        string = arrayList16.toArray(new Character[0]);
                                    } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                        List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList17 = new ArrayList();
                                        for (Object obj8 : listSplit$default9) {
                                            if (((String) obj8).length() > 0) {
                                                arrayList17.add(obj8);
                                            }
                                        }
                                        string = arrayList17.toArray(new String[0]);
                                    } else {
                                        Object[] enumConstants = String.class.getEnumConstants();
                                        if (enumConstants != null) {
                                            ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                            for (Object obj9 : enumConstants) {
                                                Intrinsics.checkNotNull(obj9, "");
                                                arrayList18.add((Enum) obj9);
                                            }
                                            Iterator it10 = arrayList18.iterator();
                                            while (true) {
                                                if (!it10.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                int i17 = onTransact + 79;
                                                IAuthTabCallbackDefault = i17 % 128;
                                                int i18 = i17 % 2;
                                                next = it10.next();
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
                                                throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                            }
                                            string = 0;
                                        }
                                    }
                                }
                            }
                            str = string instanceof String ? string : null;
                        }
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    Object obj10 = extras3 != null ? extras3.get("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER") : null;
                    str = (String) (obj10 instanceof String ? obj10 : null);
                }
            }
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x115d  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x1163  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1166  */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.app.Activity, im.toss.base.BaseActivity, im.toss.features.manualselfie.impl.controller.ManualSelfieVerifyActivity] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r3v79, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r3v80, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v86, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v53, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r9v54, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v55, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r9v56, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r9v57, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r9v58, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r9v59, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v60, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // im.toss.features.manualselfie.impl.controller.Hilt_ManualSelfieVerifyActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        int i;
        Long l;
        Intent intent;
        Long l2;
        Intent intent2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Bundle bundleOnNavigationEvent;
        Bundle extras;
        ?? string;
        Object next;
        ArrayList arrayList4;
        Bundle extras2;
        String string2;
        Class<Integer[]> cls;
        Class<Short[]> cls2;
        Class<Byte[]> cls3;
        Object obj;
        Object array;
        Object next2;
        Object array2;
        Object obj2;
        Object array3;
        Bundle extras3;
        ?? string3;
        Object next3;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        setContentView(onNavigationEvent().onNavigationEvent());
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = setEngagementSignalsCallback().IAuthTabCallback().IAuthTabCallbackDefault().onExtraCallback(R.navigation.manualselfie_impl_navigation_manual_selfie_verify);
        IAuthTabCallback IAuthTabCallback2 = IAuthTabCallback();
        int[] iArr = onNavigationEvent.onNavigationEvent;
        int i3 = iArr[IAuthTabCallback2.ordinal()];
        if (i3 == 1) {
            i = R.id.manualSelfieVerifyRegisterFragment;
        } else if (i3 == 2) {
            i = R.id.manualSelfieVerifySuccessFragment;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.id.manualSelfieVerifyRegisterErrorFragment;
        }
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onExtraCallback(i);
        int i4 = iArr[IAuthTabCallback().ordinal()];
        if (i4 == 1) {
            Intent intent3 = getIntent();
            if (intent3 == null || (extras3 = intent3.getExtras()) == null || !extras3.containsKey("EXTRA_SESSION_ID")) {
                l = null;
                Class<Integer[]> cls4 = Integer[].class;
                Class<Short[]> cls5 = Short[].class;
                Class<Byte[]> cls6 = Byte[].class;
                if (l == null) {
                    int i5 = IAuthTabCallbackDefault + 77;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    l = 0L;
                }
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("EXTRA_SESSION_ID", l);
                intent = getIntent();
                if (intent == null && (extras2 = intent.getExtras()) != null && extras2.containsKey("EXTRA_UNIFIED_ID")) {
                    if (zzbq.onNavigationEvent(intent)) {
                        Bundle extras4 = intent.getExtras();
                        if (extras4 != null && (string2 = extras4.getString("EXTRA_UNIFIED_ID")) != null) {
                            if (Intrinsics.areEqual(Long.class, Integer.class)) {
                                array = StringsKt.toIntOrNull(string2);
                            } else if (Intrinsics.areEqual(Long.class, Long.class)) {
                                array = StringsKt.toLongOrNull(string2);
                            } else if (Intrinsics.areEqual(Long.class, Float.class)) {
                                array = StringsKt.toFloatOrNull(string2);
                            } else if (Intrinsics.areEqual(Long.class, Double.class)) {
                                array = StringsKt.toDoubleOrNull(string2);
                            } else if (Intrinsics.areEqual(Long.class, Short.class)) {
                                array = StringsKt.toShortOrNull(string2);
                            } else if (Intrinsics.areEqual(Long.class, Byte.class)) {
                                array = StringsKt.toByteOrNull(string2);
                            } else if (Intrinsics.areEqual(Long.class, Boolean.class)) {
                                array = Boolean.valueOf(Boolean.parseBoolean(string2));
                            } else if (Intrinsics.areEqual(Long.class, Character.class)) {
                                array = Character.valueOf(string2.charAt(0));
                            } else {
                                array = string2;
                                if (!Intrinsics.areEqual(Long.class, String.class)) {
                                    if (Intrinsics.areEqual(Long.class, Integer[].class)) {
                                        List listSplit$default = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj3 : listSplit$default) {
                                            if (((String) obj3).length() > 0) {
                                                arrayList5.add(obj3);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                                        Iterator it = arrayList5.iterator();
                                        while (it.hasNext()) {
                                            arrayList6.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                        }
                                        cls4 = Integer[].class;
                                        array = arrayList6.toArray(new Integer[0]);
                                    } else {
                                        if (Intrinsics.areEqual(Long.class, Long[].class)) {
                                            List listSplit$default2 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList7 = new ArrayList();
                                            for (Object obj4 : listSplit$default2) {
                                                if (((String) obj4).length() > 0) {
                                                    arrayList7.add(obj4);
                                                }
                                            }
                                            cls = Integer[].class;
                                            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                            Iterator it2 = arrayList7.iterator();
                                            while (it2.hasNext()) {
                                                arrayList8.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it2.next()).toString())));
                                            }
                                            array3 = arrayList8.toArray(new Long[0]);
                                        } else {
                                            cls = Integer[].class;
                                            if (Intrinsics.areEqual(Long.class, Float[].class)) {
                                                List listSplit$default3 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList9 = new ArrayList();
                                                for (Object obj5 : listSplit$default3) {
                                                    if (((String) obj5).length() > 0) {
                                                        arrayList9.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                                Iterator it3 = arrayList9.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList10.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it3.next()).toString())));
                                                }
                                                array3 = arrayList10.toArray(new Float[0]);
                                            } else if (Intrinsics.areEqual(Long.class, Double[].class)) {
                                                List listSplit$default4 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList11 = new ArrayList();
                                                for (Object obj6 : listSplit$default4) {
                                                    if (((String) obj6).length() > 0) {
                                                        arrayList11.add(obj6);
                                                    }
                                                }
                                                ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                                Iterator it4 = arrayList11.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList12.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                                }
                                                array3 = arrayList12.toArray(new Double[0]);
                                            } else if (Intrinsics.areEqual(Long.class, Short[].class)) {
                                                List listSplit$default5 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList13 = new ArrayList();
                                                for (Object obj7 : listSplit$default5) {
                                                    if (((String) obj7).length() > 0) {
                                                        arrayList13.add(obj7);
                                                    }
                                                }
                                                ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
                                                Iterator it5 = arrayList13.iterator();
                                                while (it5.hasNext()) {
                                                    arrayList14.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                                }
                                                Object array4 = arrayList14.toArray(new Short[0]);
                                                cls5 = Short[].class;
                                                array3 = array4;
                                            } else {
                                                if (Intrinsics.areEqual(Long.class, Byte[].class)) {
                                                    List listSplit$default6 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                                    ArrayList arrayList15 = new ArrayList();
                                                    for (Object obj8 : listSplit$default6) {
                                                        if (((String) obj8).length() > 0) {
                                                            arrayList15.add(obj8);
                                                        }
                                                    }
                                                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                                    Iterator it6 = arrayList15.iterator();
                                                    while (it6.hasNext()) {
                                                        int i7 = onTransact + 59;
                                                        IAuthTabCallbackDefault = i7 % 128;
                                                        int i8 = i7 % 2;
                                                        arrayList16.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                                    }
                                                    Object array5 = arrayList16.toArray(new Byte[0]);
                                                    cls6 = Byte[].class;
                                                    obj2 = array5;
                                                } else {
                                                    Class<Byte[]> cls7 = Byte[].class;
                                                    if (Intrinsics.areEqual(Long.class, Boolean[].class)) {
                                                        List listSplit$default7 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                                        ArrayList arrayList17 = new ArrayList();
                                                        Iterator it7 = listSplit$default7.iterator();
                                                        while (it7.hasNext()) {
                                                            Object next4 = it7.next();
                                                            if (((String) next4).length() > 0) {
                                                                int i9 = IAuthTabCallbackDefault + 57;
                                                                onTransact = i9 % 128;
                                                                int i10 = i9 % 2;
                                                                arrayList17.add(next4);
                                                                it7 = it7;
                                                            }
                                                        }
                                                        ArrayList arrayList18 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList17, 10));
                                                        Iterator it8 = arrayList17.iterator();
                                                        while (it8.hasNext()) {
                                                            arrayList18.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it8.next()).toString())));
                                                        }
                                                        array2 = arrayList18.toArray(new Boolean[0]);
                                                    } else if (Intrinsics.areEqual(Long.class, Character[].class)) {
                                                        List listSplit$default8 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                                        ArrayList arrayList19 = new ArrayList();
                                                        for (Object obj9 : listSplit$default8) {
                                                            if (((String) obj9).length() > 0) {
                                                                arrayList19.add(obj9);
                                                            }
                                                        }
                                                        ArrayList arrayList20 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList19, 10));
                                                        Iterator it9 = arrayList19.iterator();
                                                        while (it9.hasNext()) {
                                                            arrayList20.add(Character.valueOf(StringsKt.trim((String) it9.next()).toString().charAt(0)));
                                                        }
                                                        array2 = arrayList20.toArray(new Character[0]);
                                                    } else if (Intrinsics.areEqual(Long.class, String[].class)) {
                                                        List listSplit$default9 = StringsKt.split$default(string2, new String[]{","}, false, 0, 6, (Object) null);
                                                        ArrayList arrayList21 = new ArrayList();
                                                        for (Object obj10 : listSplit$default9) {
                                                            if (((String) obj10).length() > 0) {
                                                                arrayList21.add(obj10);
                                                            }
                                                        }
                                                        array2 = arrayList21.toArray(new String[0]);
                                                    } else {
                                                        Object[] enumConstants = Long.class.getEnumConstants();
                                                        if (enumConstants != null) {
                                                            ArrayList arrayList22 = new ArrayList(enumConstants.length);
                                                            int length = enumConstants.length;
                                                            cls2 = Short[].class;
                                                            int i11 = 0;
                                                            while (i11 < length) {
                                                                Class<Byte[]> cls8 = cls7;
                                                                Object obj11 = enumConstants[i11];
                                                                Intrinsics.checkNotNull(obj11, "");
                                                                arrayList22.add((Enum) obj11);
                                                                i11++;
                                                                cls7 = cls8;
                                                            }
                                                            cls3 = cls7;
                                                            Iterator it10 = arrayList22.iterator();
                                                            while (true) {
                                                                if (it10.hasNext()) {
                                                                    next2 = it10.next();
                                                                    if (Intrinsics.areEqual(((Enum) next2).name(), string2)) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    next2 = null;
                                                                    break;
                                                                }
                                                            }
                                                            obj = (Enum) next2;
                                                        } else {
                                                            cls2 = Short[].class;
                                                            cls3 = cls7;
                                                            obj = null;
                                                        }
                                                        if (obj != null) {
                                                            cls5 = cls2;
                                                            cls6 = cls3;
                                                            array3 = obj;
                                                        } else {
                                                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                                throw new IllegalArgumentException(Long.class.getSimpleName() + " is not supported");
                                                            }
                                                            cls5 = cls2;
                                                            cls6 = cls3;
                                                            cls4 = cls;
                                                            array = null;
                                                        }
                                                    }
                                                    cls6 = cls7;
                                                    obj2 = array2;
                                                }
                                                cls5 = Short[].class;
                                                array3 = obj2;
                                            }
                                        }
                                        cls4 = cls;
                                        array = array3;
                                    }
                                }
                            }
                            boolean z = array instanceof Long;
                            Object obj12 = array;
                            if (!z) {
                                obj12 = null;
                            }
                            l2 = (Long) obj12;
                        }
                    } else {
                        Bundle extras5 = intent.getExtras();
                        Object obj13 = extras5 != null ? extras5.get("EXTRA_UNIFIED_ID") : null;
                        if (!(obj13 instanceof Long)) {
                            obj13 = null;
                        }
                        l2 = (Long) obj13;
                    }
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("EXTRA_UNIFIED_ID", l2 != null ? l2 : 0L);
                    Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("EXTRA_VIDEO_CALL_URL", ICustomTabsServiceStub());
                    intent2 = getIntent();
                    arrayList = new ArrayList();
                    if (intent2 == null) {
                        arrayList2 = arrayList;
                        arrayList3 = null;
                        bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_AVAILABLE_ALTERNATIVE_STRING", arrayList3 == null ? arrayList2 : arrayList3), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_REFERRER", ICustomTabsServiceDefault()), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER", updateVisuals())});
                    }
                } else {
                    l2 = null;
                    Pair pairIAuthTabCallback22 = getWrite.IAuthTabCallback("EXTRA_UNIFIED_ID", l2 != null ? l2 : 0L);
                    Pair pairIAuthTabCallback32 = getWrite.IAuthTabCallback("EXTRA_VIDEO_CALL_URL", ICustomTabsServiceStub());
                    intent2 = getIntent();
                    arrayList = new ArrayList();
                    if (intent2 == null || (extras = intent2.getExtras()) == null) {
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList;
                        if (extras.containsKey("EXTRA_MANUAL_SELFIE_AVAILABLE_ALTERNATIVE_STRING")) {
                            if (!zzbq.onNavigationEvent(intent2)) {
                                Bundle extras6 = intent2.getExtras();
                                Object obj14 = extras6 != null ? extras6.get("EXTRA_MANUAL_SELFIE_AVAILABLE_ALTERNATIVE_STRING") : null;
                                arrayList4 = (ArrayList) (!(obj14 instanceof ArrayList) ? null : obj14);
                            } else {
                                Bundle extras7 = intent2.getExtras();
                                if (extras7 != null && (string = extras7.getString("EXTRA_MANUAL_SELFIE_AVAILABLE_ALTERNATIVE_STRING")) != 0) {
                                    if (Intrinsics.areEqual(ArrayList.class, Integer.class)) {
                                        string = StringsKt.toIntOrNull((String) string);
                                    } else if (Intrinsics.areEqual(ArrayList.class, Long.class)) {
                                        string = StringsKt.toLongOrNull((String) string);
                                    } else if (Intrinsics.areEqual(ArrayList.class, Float.class)) {
                                        int i12 = onTransact + 31;
                                        IAuthTabCallbackDefault = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            string = StringsKt.toFloatOrNull((String) string);
                                            int i13 = 33 / 0;
                                        } else {
                                            string = StringsKt.toFloatOrNull((String) string);
                                        }
                                    } else if (Intrinsics.areEqual(ArrayList.class, Double.class)) {
                                        string = StringsKt.toDoubleOrNull((String) string);
                                    } else if (Intrinsics.areEqual(ArrayList.class, Short.class)) {
                                        string = StringsKt.toShortOrNull((String) string);
                                    } else if (Intrinsics.areEqual(ArrayList.class, Byte.class)) {
                                        string = StringsKt.toByteOrNull((String) string);
                                    } else if (Intrinsics.areEqual(ArrayList.class, Boolean.class)) {
                                        string = Boolean.valueOf(Boolean.parseBoolean(string));
                                    } else if (Intrinsics.areEqual(ArrayList.class, Character.class)) {
                                        string = Character.valueOf(string.charAt(0));
                                    } else if (!Intrinsics.areEqual(ArrayList.class, String.class)) {
                                        if (Intrinsics.areEqual(ArrayList.class, cls4)) {
                                            List listSplit$default10 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList23 = new ArrayList();
                                            for (Object obj15 : listSplit$default10) {
                                                if (((String) obj15).length() > 0) {
                                                    arrayList23.add(obj15);
                                                }
                                            }
                                            ArrayList arrayList24 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList23, 10));
                                            Iterator it11 = arrayList23.iterator();
                                            while (it11.hasNext()) {
                                                arrayList24.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it11.next()).toString())));
                                            }
                                            string = arrayList24.toArray(new Integer[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, Long[].class)) {
                                            List listSplit$default11 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList25 = new ArrayList();
                                            for (Object obj16 : listSplit$default11) {
                                                if (((String) obj16).length() > 0) {
                                                    arrayList25.add(obj16);
                                                }
                                            }
                                            ArrayList arrayList26 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList25, 10));
                                            Iterator it12 = arrayList25.iterator();
                                            while (it12.hasNext()) {
                                                arrayList26.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it12.next()).toString())));
                                            }
                                            string = arrayList26.toArray(new Long[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, Float[].class)) {
                                            List listSplit$default12 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList27 = new ArrayList();
                                            for (Object obj17 : listSplit$default12) {
                                                if (((String) obj17).length() > 0) {
                                                    arrayList27.add(obj17);
                                                }
                                            }
                                            ArrayList arrayList28 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList27, 10));
                                            Iterator it13 = arrayList27.iterator();
                                            while (it13.hasNext()) {
                                                arrayList28.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it13.next()).toString())));
                                            }
                                            string = arrayList28.toArray(new Float[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, Double[].class)) {
                                            List listSplit$default13 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList29 = new ArrayList();
                                            for (Object obj18 : listSplit$default13) {
                                                if (((String) obj18).length() > 0) {
                                                    arrayList29.add(obj18);
                                                }
                                            }
                                            ArrayList arrayList30 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList29, 10));
                                            Iterator it14 = arrayList29.iterator();
                                            while (it14.hasNext()) {
                                                arrayList30.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it14.next()).toString())));
                                            }
                                            string = arrayList30.toArray(new Double[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, cls5)) {
                                            List listSplit$default14 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList31 = new ArrayList();
                                            for (Object obj19 : listSplit$default14) {
                                                if (((String) obj19).length() > 0) {
                                                    arrayList31.add(obj19);
                                                }
                                            }
                                            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList31, 10));
                                            Iterator it15 = arrayList31.iterator();
                                            while (it15.hasNext()) {
                                                arrayList32.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it15.next()).toString())));
                                            }
                                            string = arrayList32.toArray(new Short[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, cls6)) {
                                            List listSplit$default15 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList33 = new ArrayList();
                                            for (Object obj20 : listSplit$default15) {
                                                if (((String) obj20).length() > 0) {
                                                    arrayList33.add(obj20);
                                                }
                                            }
                                            ArrayList arrayList34 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList33, 10));
                                            Iterator it16 = arrayList33.iterator();
                                            while (it16.hasNext()) {
                                                arrayList34.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it16.next()).toString())));
                                            }
                                            string = arrayList34.toArray(new Byte[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, Boolean[].class)) {
                                            List listSplit$default16 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList35 = new ArrayList();
                                            for (Object obj21 : listSplit$default16) {
                                                if (((String) obj21).length() > 0) {
                                                    int i14 = onTransact + 5;
                                                    IAuthTabCallbackDefault = i14 % 128;
                                                    int i15 = i14 % 2;
                                                    arrayList35.add(obj21);
                                                }
                                            }
                                            ArrayList arrayList36 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList35, 10));
                                            Iterator it17 = arrayList35.iterator();
                                            while (it17.hasNext()) {
                                                arrayList36.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it17.next()).toString())));
                                            }
                                            string = arrayList36.toArray(new Boolean[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, Character[].class)) {
                                            List listSplit$default17 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList37 = new ArrayList();
                                            for (Object obj22 : listSplit$default17) {
                                                if (((String) obj22).length() > 0) {
                                                    arrayList37.add(obj22);
                                                }
                                            }
                                            ArrayList arrayList38 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList37, 10));
                                            Iterator it18 = arrayList37.iterator();
                                            while (it18.hasNext()) {
                                                arrayList38.add(Character.valueOf(StringsKt.trim((String) it18.next()).toString().charAt(0)));
                                            }
                                            string = arrayList38.toArray(new Character[0]);
                                        } else if (Intrinsics.areEqual(ArrayList.class, String[].class)) {
                                            List listSplit$default18 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList39 = new ArrayList();
                                            for (Object obj23 : listSplit$default18) {
                                                if (((String) obj23).length() > 0) {
                                                    arrayList39.add(obj23);
                                                }
                                            }
                                            string = arrayList39.toArray(new String[0]);
                                        } else {
                                            Object[] enumConstants2 = ArrayList.class.getEnumConstants();
                                            if (enumConstants2 != null) {
                                                ArrayList arrayList40 = new ArrayList(enumConstants2.length);
                                                for (Object obj24 : enumConstants2) {
                                                    Intrinsics.checkNotNull(obj24, "");
                                                    arrayList40.add((Enum) obj24);
                                                }
                                                Iterator it19 = arrayList40.iterator();
                                                while (true) {
                                                    if (it19.hasNext()) {
                                                        next = it19.next();
                                                        if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                            break;
                                                        }
                                                    } else {
                                                        next = null;
                                                        break;
                                                    }
                                                }
                                                string = (Enum) next;
                                            } else {
                                                string = 0;
                                            }
                                            if (string == 0) {
                                                if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                    throw new IllegalArgumentException(ArrayList.class.getSimpleName() + " is not supported");
                                                }
                                                string = 0;
                                            }
                                        }
                                    }
                                    arrayList4 = !(string instanceof ArrayList) ? null : string;
                                }
                            }
                            arrayList3 = arrayList4;
                            bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback22, pairIAuthTabCallback32, getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_AVAILABLE_ALTERNATIVE_STRING", arrayList3 == null ? arrayList2 : arrayList3), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_REFERRER", ICustomTabsServiceDefault()), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER", updateVisuals())});
                        }
                    }
                    arrayList3 = null;
                    bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback22, pairIAuthTabCallback32, getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_AVAILABLE_ALTERNATIVE_STRING", arrayList3 == null ? arrayList2 : arrayList3), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_REFERRER", ICustomTabsServiceDefault()), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER", updateVisuals())});
                }
            } else {
                int i16 = onTransact + 37;
                IAuthTabCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                if (zzbq.onNavigationEvent(intent3)) {
                    Bundle extras8 = intent3.getExtras();
                    if (extras8 != null && (string3 = extras8.getString("EXTRA_SESSION_ID")) != 0) {
                        if (Intrinsics.areEqual(Long.class, Integer.class)) {
                            string3 = StringsKt.toIntOrNull((String) string3);
                        } else if (Intrinsics.areEqual(Long.class, Long.class)) {
                            string3 = StringsKt.toLongOrNull((String) string3);
                        } else if (Intrinsics.areEqual(Long.class, Float.class)) {
                            string3 = StringsKt.toFloatOrNull((String) string3);
                        } else if (Intrinsics.areEqual(Long.class, Double.class)) {
                            string3 = StringsKt.toDoubleOrNull((String) string3);
                        } else if (Intrinsics.areEqual(Long.class, Short.class)) {
                            string3 = StringsKt.toShortOrNull((String) string3);
                        } else if (Intrinsics.areEqual(Long.class, Byte.class)) {
                            string3 = StringsKt.toByteOrNull((String) string3);
                        } else if (Intrinsics.areEqual(Long.class, Boolean.class)) {
                            string3 = Boolean.valueOf(Boolean.parseBoolean(string3));
                        } else if (Intrinsics.areEqual(Long.class, Character.class)) {
                            string3 = Character.valueOf(string3.charAt(0));
                        } else if (!Intrinsics.areEqual(Long.class, String.class)) {
                            if (Intrinsics.areEqual(Long.class, Integer[].class)) {
                                List listSplit$default19 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList41 = new ArrayList();
                                for (Object obj25 : listSplit$default19) {
                                    if (((String) obj25).length() > 0) {
                                        arrayList41.add(obj25);
                                    }
                                }
                                ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList41, 10));
                                Iterator it20 = arrayList41.iterator();
                                while (it20.hasNext()) {
                                    arrayList42.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it20.next()).toString())));
                                }
                                string3 = arrayList42.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(Long.class, Long[].class)) {
                                List listSplit$default20 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList43 = new ArrayList();
                                for (Object obj26 : listSplit$default20) {
                                    if (((String) obj26).length() > 0) {
                                        arrayList43.add(obj26);
                                    }
                                }
                                ArrayList arrayList44 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList43, 10));
                                Iterator it21 = arrayList43.iterator();
                                while (it21.hasNext()) {
                                    arrayList44.add(Long.valueOf(Long.parseLong(StringsKt.trim((String) it21.next()).toString())));
                                }
                                string3 = arrayList44.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(Long.class, Float[].class)) {
                                List listSplit$default21 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList45 = new ArrayList();
                                Iterator it22 = listSplit$default21.iterator();
                                while (it22.hasNext()) {
                                    int i18 = onTransact + 111;
                                    IAuthTabCallbackDefault = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        ((String) it22.next()).length();
                                        Object obj27 = null;
                                        obj27.hashCode();
                                        throw null;
                                    }
                                    Object next5 = it22.next();
                                    if (((String) next5).length() > 0) {
                                        arrayList45.add(next5);
                                    }
                                }
                                ArrayList arrayList46 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList45, 10));
                                Iterator it23 = arrayList45.iterator();
                                while (it23.hasNext()) {
                                    arrayList46.add(Float.valueOf(Float.parseFloat(StringsKt.trim((String) it23.next()).toString())));
                                }
                                string3 = arrayList46.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(Long.class, Double[].class)) {
                                List listSplit$default22 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList47 = new ArrayList();
                                for (Object obj28 : listSplit$default22) {
                                    if (((String) obj28).length() > 0) {
                                        arrayList47.add(obj28);
                                    }
                                }
                                ArrayList arrayList48 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList47, 10));
                                Iterator it24 = arrayList47.iterator();
                                while (it24.hasNext()) {
                                    arrayList48.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it24.next()).toString())));
                                }
                                string3 = arrayList48.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(Long.class, Short[].class)) {
                                List listSplit$default23 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList49 = new ArrayList();
                                for (Object obj29 : listSplit$default23) {
                                    if (((String) obj29).length() > 0) {
                                        arrayList49.add(obj29);
                                    }
                                }
                                ArrayList arrayList50 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList49, 10));
                                Iterator it25 = arrayList49.iterator();
                                while (it25.hasNext()) {
                                    arrayList50.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it25.next()).toString())));
                                }
                                string3 = arrayList50.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(Long.class, Byte[].class)) {
                                List listSplit$default24 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList51 = new ArrayList();
                                for (Object obj30 : listSplit$default24) {
                                    if (((String) obj30).length() > 0) {
                                        arrayList51.add(obj30);
                                    }
                                }
                                ArrayList arrayList52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList51, 10));
                                Iterator it26 = arrayList51.iterator();
                                while (!(!it26.hasNext())) {
                                    arrayList52.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it26.next()).toString())));
                                }
                                string3 = arrayList52.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(Long.class, Boolean[].class)) {
                                List listSplit$default25 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList53 = new ArrayList();
                                for (Object obj31 : listSplit$default25) {
                                    int i19 = IAuthTabCallbackDefault + 87;
                                    onTransact = i19 % 128;
                                    int i20 = i19 % 2;
                                    if (((String) obj31).length() > 0) {
                                        arrayList53.add(obj31);
                                    }
                                }
                                ArrayList arrayList54 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList53, 10));
                                Iterator it27 = arrayList53.iterator();
                                while (it27.hasNext()) {
                                    arrayList54.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt.trim((String) it27.next()).toString())));
                                }
                                string3 = arrayList54.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(Long.class, Character[].class)) {
                                List listSplit$default26 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList55 = new ArrayList();
                                for (Object obj32 : listSplit$default26) {
                                    int i21 = onTransact + 75;
                                    IAuthTabCallbackDefault = i21 % 128;
                                    int i22 = i21 % 2;
                                    if (((String) obj32).length() > 0) {
                                        arrayList55.add(obj32);
                                    }
                                }
                                ArrayList arrayList56 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList55, 10));
                                Iterator it28 = arrayList55.iterator();
                                while (it28.hasNext()) {
                                    arrayList56.add(Character.valueOf(StringsKt.trim((String) it28.next()).toString().charAt(0)));
                                }
                                string3 = arrayList56.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(Long.class, String[].class)) {
                                List listSplit$default27 = StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList57 = new ArrayList();
                                for (Object obj33 : listSplit$default27) {
                                    if (((String) obj33).length() > 0) {
                                        arrayList57.add(obj33);
                                    }
                                }
                                string3 = arrayList57.toArray(new String[0]);
                            } else {
                                Object[] enumConstants3 = Long.class.getEnumConstants();
                                if (enumConstants3 != null) {
                                    ArrayList arrayList58 = new ArrayList(enumConstants3.length);
                                    int length2 = enumConstants3.length;
                                    int i23 = 0;
                                    while (i23 < length2) {
                                        int i24 = IAuthTabCallbackDefault + 41;
                                        onTransact = i24 % 128;
                                        if (i24 % 2 == 0) {
                                            Object obj34 = enumConstants3[i23];
                                            Intrinsics.checkNotNull(obj34, "");
                                            arrayList58.add((Enum) obj34);
                                            i23 += 118;
                                        } else {
                                            Object obj35 = enumConstants3[i23];
                                            Intrinsics.checkNotNull(obj35, "");
                                            arrayList58.add((Enum) obj35);
                                            i23++;
                                        }
                                    }
                                    Iterator it29 = arrayList58.iterator();
                                    while (true) {
                                        if (it29.hasNext()) {
                                            next3 = it29.next();
                                            if (Intrinsics.areEqual(((Enum) next3).name(), (Object) string3)) {
                                                break;
                                            }
                                        } else {
                                            next3 = null;
                                            break;
                                        }
                                    }
                                    string3 = (Enum) next3;
                                } else {
                                    string3 = 0;
                                }
                                if (string3 == 0) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(Long.class.getSimpleName() + " is not supported");
                                    }
                                    string3 = 0;
                                }
                            }
                        }
                        boolean z2 = string3 instanceof Long;
                        Long l3 = string3;
                        if (!z2) {
                            l3 = null;
                        }
                        l = l3;
                    }
                } else {
                    Bundle extras9 = intent3.getExtras();
                    Object obj36 = extras9 != null ? extras9.get("EXTRA_SESSION_ID") : null;
                    if (!(obj36 instanceof Long)) {
                        obj36 = null;
                    }
                    l = (Long) obj36;
                }
                Class<Integer[]> cls42 = Integer[].class;
                Class<Short[]> cls52 = Short[].class;
                Class<Byte[]> cls62 = Byte[].class;
                if (l == null) {
                }
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("EXTRA_SESSION_ID", l);
                intent = getIntent();
                if (intent == null) {
                    l2 = null;
                    Pair pairIAuthTabCallback222 = getWrite.IAuthTabCallback("EXTRA_UNIFIED_ID", l2 != null ? l2 : 0L);
                    Pair pairIAuthTabCallback322 = getWrite.IAuthTabCallback("EXTRA_VIDEO_CALL_URL", ICustomTabsServiceStub());
                    intent2 = getIntent();
                    arrayList = new ArrayList();
                    if (intent2 == null) {
                    }
                }
            }
        } else if (i4 == 2) {
            bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_REFERRER", ICustomTabsServiceDefault()), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER", updateVisuals())});
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_VIDEO_CALL_URL", ICustomTabsServiceStub()), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_REFERRER", ICustomTabsServiceDefault()), getWrite.IAuthTabCallback("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER", updateVisuals())});
        }
        setEngagementSignalsCallback().IAuthTabCallback().onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback, bundleOnNavigationEvent);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback ERROR;
        private static int IAuthTabCallback;
        public static final IAuthTabCallback REGISTER;
        public static final IAuthTabCallback SUCCESS;
        private static int onNavigationEvent;
        private static final byte[] $$a = {52, -58, -85, 74};
        private static final int $$b = 252;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallback = 1;

        private static String $$c(short s, int i, short s2) {
            int i2 = (i * 3) + 4;
            byte[] bArr = $$a;
            int i3 = (s2 * 3) + 105;
            int i4 = s * 2;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i6 = -1;
                i3 = (-i2) + i3;
                i2++;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i3;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i3;
                i6 = i7;
                i3 = (-bArr[i2]) + i8;
                i2++;
            }
        }

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {REGISTER, SUCCESS, ERROR};
            int i5 = i3 + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 23 / 0;
            }
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 67;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onExtraCallback + 65;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 == 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback = 1;
            IAuthTabCallback();
            REGISTER = new IAuthTabCallback("REGISTER", 0);
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getPressedStateDuration() >> 16) + 7, 6 - View.MeasureSpec.getSize(0), new char[]{'\t', 65527, 65527, 65529, 7, 7, 7}, false, 99 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            SUCCESS = new IAuthTabCallback(((String) objArr[0]).intern(), 1);
            ERROR = new IAuthTabCallback("ERROR", 2);
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                int i6 = $11 + 69;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35125), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22, 10278 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 12843), 54 - MotionEvent.axisFromString(""), 2167 - TextUtils.indexOf("", ""), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                int i9 = $11 + 121;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 12843), 55 - TextUtils.indexOf("", ""), KeyEvent.keyCodeFromString("") + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                }
                cArr2 = cArr4;
            }
            String str = new String(cArr2);
            int i11 = $10 + 91;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i12 = 69 / 0;
                objArr[0] = str;
            }
        }

        static void IAuthTabCallback() {
            onNavigationEvent = 478308926;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, im.toss.features.manualselfie.impl.controller.ManualSelfieVerifyActivity] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    private final IAuthTabCallback IAuthTabCallback() {
        Bundle extras;
        Object next;
        int i = 2 % 2;
        Intent intent = getIntent();
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.REGISTER;
        IAuthTabCallback iAuthTabCallback2 = null;
        iAuthTabCallback2 = null;
        iAuthTabCallback2 = null;
        iAuthTabCallback2 = null;
        iAuthTabCallback2 = null;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("EXTRA_ENTER_TYPE")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    int i2 = onTransact + 37;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    ?? string = extras2.getString("EXTRA_ENTER_TYPE");
                    if (string != 0) {
                        if (Intrinsics.areEqual(IAuthTabCallback.class, Integer.class)) {
                            string = StringsKt.toIntOrNull((String) string);
                        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Long.class)) {
                            int i4 = IAuthTabCallbackDefault + 35;
                            onTransact = i4 % 128;
                            int i5 = i4 % 2;
                            string = StringsKt.toLongOrNull((String) string);
                        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Float.class)) {
                            string = StringsKt.toFloatOrNull((String) string);
                        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Double.class)) {
                            string = StringsKt.toDoubleOrNull((String) string);
                        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Short.class)) {
                            string = StringsKt.toShortOrNull((String) string);
                        } else if (Intrinsics.areEqual(IAuthTabCallback.class, Byte.class)) {
                            string = StringsKt.toByteOrNull((String) string);
                        } else if (!Intrinsics.areEqual(IAuthTabCallback.class, Boolean.class)) {
                            if (Intrinsics.areEqual(IAuthTabCallback.class, Character.class)) {
                                string = Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(IAuthTabCallback.class, String.class)) {
                                if (Intrinsics.areEqual(IAuthTabCallback.class, Integer[].class)) {
                                    List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    int i6 = onTransact + 103;
                                    IAuthTabCallbackDefault = i6 % 128;
                                    int i7 = i6 % 2;
                                    for (Object obj : listSplit$default) {
                                        if (((String) obj).length() > 0) {
                                            int i8 = IAuthTabCallbackDefault + 1;
                                            onTransact = i8 % 128;
                                            int i9 = i8 % 2;
                                            arrayList.add(obj);
                                            int i10 = onTransact + 13;
                                            IAuthTabCallbackDefault = i10 % 128;
                                            int i11 = i10 % 2;
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        int i12 = IAuthTabCallbackDefault + 63;
                                        onTransact = i12 % 128;
                                        int i13 = i12 % 2;
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt.trim((String) it.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
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
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
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
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj4 : listSplit$default4) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList7.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it4 = arrayList7.iterator();
                                    while (it4.hasNext()) {
                                        int i14 = onTransact + 83;
                                        IAuthTabCallbackDefault = i14 % 128;
                                        int i15 = i14 % 2;
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt.trim((String) it4.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj5 : listSplit$default5) {
                                        if (((String) obj5).length() > 0) {
                                            int i16 = onTransact + 95;
                                            IAuthTabCallbackDefault = i16 % 128;
                                            int i17 = i16 % 2;
                                            arrayList9.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it5 = arrayList9.iterator();
                                    while (it5.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt.trim((String) it5.next()).toString())));
                                    }
                                    string = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj6 : listSplit$default6) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList11.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it6 = arrayList11.iterator();
                                    while (it6.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt.trim((String) it6.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
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
                                    string = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj8 : listSplit$default8) {
                                        if (((String) obj8).length() > 0) {
                                            int i18 = onTransact + 111;
                                            IAuthTabCallbackDefault = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                arrayList15.add(obj8);
                                                throw null;
                                            }
                                            arrayList15.add(obj8);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it8 = arrayList15.iterator();
                                    while (it8.hasNext()) {
                                        arrayList16.add(Character.valueOf(StringsKt.trim((String) it8.next()).toString().charAt(0)));
                                    }
                                    string = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(IAuthTabCallback.class, String[].class)) {
                                    List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj9 : listSplit$default9) {
                                        if (((String) obj9).length() > 0) {
                                            arrayList17.add(obj9);
                                        }
                                    }
                                    string = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = IAuthTabCallback.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj10 : enumConstants) {
                                            Intrinsics.checkNotNull(obj10, "");
                                            arrayList18.add((Enum) obj10);
                                        }
                                        Iterator it9 = arrayList18.iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it9.next();
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
                                            throw new IllegalArgumentException(IAuthTabCallback.class.getSimpleName() + " is not supported");
                                        }
                                        int i19 = IAuthTabCallbackDefault + 51;
                                        onTransact = i19 % 128;
                                        if (i19 % 2 == 0) {
                                            throw null;
                                        }
                                        string = 0;
                                    }
                                }
                            }
                        } else {
                            string = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                        iAuthTabCallback2 = (string instanceof IAuthTabCallback) ^ true ? null : string;
                    }
                }
            } else {
                Bundle extras3 = intent.getExtras();
                Object obj11 = extras3 != null ? extras3.get("EXTRA_ENTER_TYPE") : null;
                iAuthTabCallback2 = (IAuthTabCallback) (obj11 instanceof IAuthTabCallback ? obj11 : null);
            }
        }
        return iAuthTabCallback2 == null ? iAuthTabCallback : iAuthTabCallback2;
    }

    @Override // im.toss.features.manualselfie.impl.controller.Hilt_ManualSelfieVerifyActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.features.manualselfie.impl.controller.Hilt_ManualSelfieVerifyActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.features.manualselfie.impl.controller.Hilt_ManualSelfieVerifyActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.features.manualselfie.impl.controller.Hilt_ManualSelfieVerifyActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
