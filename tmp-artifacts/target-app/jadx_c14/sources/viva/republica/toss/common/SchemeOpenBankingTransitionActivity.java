package viva.republica.toss.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import im.toss.base.BaseActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.setRandomHost;
import o.zzaj;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeOpenBankingTransitionActivity extends BaseActivity {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SchemeOpenBankingTransitionActivity.this.onExtraCallback(this);
        }
    }

    public long getScreenId() {
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.app.Activity, viva.republica.toss.common.SchemeOpenBankingTransitionActivity] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v81, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v82, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v83, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v84, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r5v85, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v86, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v87, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89, types: [java.lang.Integer] */
    private final String onNavigationEvent() {
        Bundle extras;
        ?? string;
        Object next;
        Intent intent = getIntent();
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("completeMessage")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("completeMessage")) != 0) {
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
                            string = Character.valueOf(string.charAt(0));
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
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = String.class.getEnumConstants();
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
                Object obj11 = extras3 != null ? extras3.get("completeMessage") : null;
                str = (String) (obj11 instanceof String ? obj11 : null);
            }
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.app.Activity, viva.republica.toss.common.SchemeOpenBankingTransitionActivity] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v81, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v82, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v83, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v84, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r5v85, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v86, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v87, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89, types: [java.lang.Integer] */
    private final String IAuthTabCallback() {
        Bundle extras;
        ?? string;
        Object next;
        Intent intent = getIntent();
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("alreadyAgreedMessage")) {
            if (zzbq.onNavigationEvent(intent)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString("alreadyAgreedMessage")) != 0) {
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
                            string = Character.valueOf(string.charAt(0));
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
                                string = arrayList16.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default9 = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList17 = new ArrayList();
                                for (Object obj9 : listSplit$default9) {
                                    if (((String) obj9).length() > 0) {
                                        arrayList17.add(obj9);
                                    }
                                }
                                string = arrayList17.toArray(new String[0]);
                            } else {
                                Object[] enumConstants = String.class.getEnumConstants();
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
                Object obj11 = extras3 != null ? extras3.get("alreadyAgreedMessage") : null;
                str = (String) (obj11 instanceof String ? obj11 : null);
            }
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SchemeOpenBankingTransitionActivity.this.new onWarmupCompleted(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                SchemeOpenBankingTransitionActivity schemeOpenBankingTransitionActivity = SchemeOpenBankingTransitionActivity.this;
                this.label = 1;
                if (schemeOpenBankingTransitionActivity.onExtraCallback(this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(o.access13800<? super kotlin.Unit> r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof viva.republica.toss.common.SchemeOpenBankingTransitionActivity.onExtraCallbackWithResult
            if (r2 == 0) goto L17
            r2 = r1
            viva.republica.toss.common.SchemeOpenBankingTransitionActivity$onExtraCallbackWithResult r2 = (viva.republica.toss.common.SchemeOpenBankingTransitionActivity.onExtraCallbackWithResult) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 + r4
            r2.label = r3
            goto L1c
        L17:
            viva.republica.toss.common.SchemeOpenBankingTransitionActivity$onExtraCallbackWithResult r2 = new viva.republica.toss.common.SchemeOpenBankingTransitionActivity$onExtraCallbackWithResult
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = o.access14300.onWarmupCompleted()
            int r4 = r2.label
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L37
            if (r4 != r7) goto L2f
            kotlin.ResultKt.onNavigationEvent(r1)
            goto L5d
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            kotlin.ResultKt.onNavigationEvent(r1)
            o.setTestMode r1 = o.setTestMode.onExtraCallback
            java.lang.Boolean r1 = r1.IAuthTabCallbackStubProxy()
            java.lang.Boolean r4 = o.access14000.onNavigationEvent(r7)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L60
            r1 = 3
            im.toss.base.BaseActivity.IAuthTabCallback(r0, r6, r5, r1, r6)
            o.disableOldAndroidAttachmentMetricsWorkarounds r1 = o.disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback
            o.JsonReaderUnknownNumberParsing r1 = r1.onExtraCallback()
            r2.label = r7
            java.lang.Object r1 = o.setIndicatorY.onExtraCallbackWithResult(r1, r2)
            if (r1 != r3) goto L5d
            return r3
        L5d:
            r23.bo_()
        L60:
            o.setTestMode r1 = o.setTestMode.onExtraCallback
            java.lang.Boolean r2 = r1.IAuthTabCallbackStubProxy()
            java.lang.Boolean r3 = o.access14000.onNavigationEvent(r7)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto Lc6
            o.ConvertFloatArrayToByteArray r7 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r2 = "openBankingNeedTransitionAgreement"
            java.lang.Boolean r1 = r1.IAuthTabCallbackStubProxy()
            kotlin.Pair r1 = o.getWrite.IAuthTabCallback(r2, r1)
            java.util.Map r10 = o.access8100.onNavigationEvent(r1)
            java.lang.String r8 = "SchemeOpenBankingTransitionActivity"
            java.lang.String r9 = "needTransitionAgreement may be false"
            r11 = 0
            r13 = 0
            r15 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            r1 = 56
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r8, r9, r10, r11, r12, r13, r14, r15}
            int r22 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r17 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r20 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r21 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            r18 = 1349100616(0x5069a448, float:1.5679431E10)
            r16 = -1349100608(0xffffffffaf965bc0, float:-2.7350033E-10)
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = r23.IAuthTabCallback()
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 != 0) goto Lc0
            java.lang.String r1 = r23.IAuthTabCallback()
            r2 = 2
            o.onJsBridgeReady.onNavigationEvent(r0, r1, r5, r2, r6)
        Lc0:
            r23.finish()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        Lc6:
            viva.republica.toss.common.SchemeOpenBankingTransitionActivity$$ExternalSyntheticLambda0 r1 = new viva.republica.toss.common.SchemeOpenBankingTransitionActivity$$ExternalSyntheticLambda0
            r1.<init>(r0)
            viva.republica.toss.common.OpenBankingTransitionBottomSheet r2 = new viva.republica.toss.common.OpenBankingTransitionBottomSheet
            r2.<init>(r0, r1)
            viva.republica.toss.common.SchemeOpenBankingTransitionActivity$$ExternalSyntheticLambda1 r1 = new viva.republica.toss.common.SchemeOpenBankingTransitionActivity$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r2.setOnDismissListener(r1)
            r2.show()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.SchemeOpenBankingTransitionActivity.onExtraCallback(o.access13800):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(SchemeOpenBankingTransitionActivity schemeOpenBankingTransitionActivity) {
        if (!StringsKt.isBlank(schemeOpenBankingTransitionActivity.onNavigationEvent())) {
            onJsBridgeReady.onNavigationEvent(schemeOpenBankingTransitionActivity, schemeOpenBankingTransitionActivity.onNavigationEvent(), 0, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(SchemeOpenBankingTransitionActivity schemeOpenBankingTransitionActivity, DialogInterface dialogInterface) {
        schemeOpenBankingTransitionActivity.finish();
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
