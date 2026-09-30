package viva.republica.toss.account.detail.setting;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERConstructedSet;
import o.KeyBoardVisiblePoint;
import o.PageShowPoint;
import o.SessionTrackerb;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TrackGroupExternalSyntheticLambda0;
import o.onJsBridgeReady;
import o.zzaj;
import o.zzbq;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AccountSettingActivity extends Hilt_AccountSettingActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 1;
    public static final int asBinder;
    private static int asInterface;
    private static int onTransact;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        onNavigationEvent();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        asBinder = 8;
        int i = IAuthTabCallbackStub + 61;
        onTransact = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 89;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i5 = i3 + 7;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackerb;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return "toss__money_management";
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("version", 4);
        int i2 = asInterface + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.account.detail.setting.Hilt_AccountSettingActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        KeyBoardVisiblePoint keyBoardVisiblePointICustomTabsServiceDefault = ICustomTabsServiceDefault();
        if (keyBoardVisiblePointICustomTabsServiceDefault == null) {
            setEngagementSignalsCallback();
            return;
        }
        if (keyBoardVisiblePointICustomTabsServiceDefault instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener) {
            SessionTrackerb sessionTrackerbIAuthTabCallback = IAuthTabCallback();
            String strOnNavigationEvent = keyBoardVisiblePointICustomTabsServiceDefault.onNavigationEvent(":");
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new int[]{4, 49, 24, 38}, false, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strOnNavigationEvent);
            SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, this, sb.toString(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            finish();
            int i4 = asInterface + 5;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AccountSettingActivity_TossAccount", getString(R.string.app_account_detail_setting___e054f773c8), (Map) null, (String) null, false, (String) null, 60, (Object) null);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x15c5  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.app.Activity, viva.republica.toss.account.detail.setting.AccountSettingActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final KeyBoardVisiblePoint ICustomTabsServiceDefault() throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle extras;
        String string;
        Object array;
        Object next;
        Bundle extras2;
        String string2;
        Object array2;
        Object array3;
        Object next2;
        Bundle extras3;
        Object obj;
        Object array4;
        Object next3;
        Bundle extras4;
        Object obj2;
        Object next4;
        Object next5;
        int i = 2 % 2;
        Intent intent = getIntent();
        if (intent == null || (extras4 = intent.getExtras()) == null) {
            str = null;
        } else {
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 78, 3}, false, new byte[]{1, 1, 1, 1}, objArr);
            if (extras4.containsKey(((String) objArr[0]).intern())) {
                int i2 = asInterface + 101;
                IAuthTabCallback_Parcel = i2 % 128;
                if (i2 % 2 == 0) {
                    zzbq.onNavigationEvent(intent);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras5 = intent.getExtras();
                    if (extras5 != null) {
                        Object[] objArr2 = new Object[1];
                        a(new int[]{0, 4, 78, 3}, false, new byte[]{1, 1, 1, 1}, objArr2);
                        ?? string3 = extras5.getString(((String) objArr2[0]).intern());
                        if (string3 != 0) {
                            if (Intrinsics.areEqual(String.class, Integer.class)) {
                                string3 = StringsKt__StringNumberConversionsKt.toIntOrNull(string3);
                            } else if (Intrinsics.areEqual(String.class, Long.class)) {
                                string3 = StringsKt__StringNumberConversionsKt.toLongOrNull(string3);
                            } else if (Intrinsics.areEqual(String.class, Float.class)) {
                                string3 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string3);
                            } else if (Intrinsics.areEqual(String.class, Double.class)) {
                                string3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string3);
                            } else if (Intrinsics.areEqual(String.class, Short.class)) {
                                string3 = StringsKt__StringNumberConversionsKt.toShortOrNull(string3);
                            } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                                string3 = StringsKt__StringNumberConversionsKt.toByteOrNull(string3);
                            } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                                string3 = Boolean.valueOf(Boolean.parseBoolean(string3));
                            } else if (Intrinsics.areEqual(String.class, Character.class)) {
                                string3 = Character.valueOf(string3.charAt(0));
                            } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj4 : listSplit$default) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                    }
                                    string3 = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj5 : listSplit$default2) {
                                        if (((String) obj5).length() > 0) {
                                            arrayList3.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                    }
                                    string3 = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj6 : listSplit$default3) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList5.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                    }
                                    string3 = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj7 : listSplit$default4) {
                                        if (((String) obj7).length() > 0) {
                                            arrayList7.add(obj7);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it4 = arrayList7.iterator();
                                    while (it4.hasNext()) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                    }
                                    string3 = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj8 : listSplit$default5) {
                                        if (((String) obj8).length() > 0) {
                                            arrayList9.add(obj8);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it5 = arrayList9.iterator();
                                    while (it5.hasNext()) {
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                    }
                                    string3 = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    Iterator it6 = listSplit$default6.iterator();
                                    while (it6.hasNext()) {
                                        int i3 = asInterface + 81;
                                        IAuthTabCallback_Parcel = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            next5 = it6.next();
                                            int i4 = 59 / 0;
                                            if (((String) next5).length() > 0) {
                                                arrayList11.add(next5);
                                            }
                                        } else {
                                            next5 = it6.next();
                                            if (((String) next5).length() > 0) {
                                                arrayList11.add(next5);
                                            }
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it7 = arrayList11.iterator();
                                    while (it7.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                    }
                                    string3 = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj9 : listSplit$default7) {
                                        if (((String) obj9).length() > 0) {
                                            arrayList13.add(obj9);
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it8 = arrayList13.iterator();
                                    while (it8.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString())));
                                    }
                                    string3 = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj10 : listSplit$default8) {
                                        if (((String) obj10).length() > 0) {
                                            arrayList15.add(obj10);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it9 = arrayList15.iterator();
                                    while (it9.hasNext()) {
                                        arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it9.next()).toString().charAt(0)));
                                    }
                                    string3 = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                    List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj11 : listSplit$default9) {
                                        if (((String) obj11).length() > 0) {
                                            arrayList17.add(obj11);
                                        }
                                    }
                                    string3 = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = String.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj12 : enumConstants) {
                                            Intrinsics.checkNotNull(obj12, "");
                                            arrayList18.add((Enum) obj12);
                                        }
                                        Iterator it10 = arrayList18.iterator();
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                next4 = null;
                                                break;
                                            }
                                            next4 = it10.next();
                                            if (Intrinsics.areEqual(((Enum) next4).name(), (Object) string3)) {
                                                break;
                                            }
                                        }
                                        string3 = (Enum) next4;
                                    } else {
                                        string3 = 0;
                                    }
                                    if (string3 == 0) {
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                        }
                                        string3 = 0;
                                    }
                                }
                            }
                            boolean z = string3 instanceof String;
                            String str5 = string3;
                            if (!z) {
                                str5 = null;
                            }
                            str = str5;
                        }
                    }
                } else {
                    Bundle extras6 = intent.getExtras();
                    if (extras6 != null) {
                        Object[] objArr3 = new Object[1];
                        a(new int[]{0, 4, 78, 3}, false, new byte[]{1, 1, 1, 1}, objArr3);
                        obj2 = extras6.get(((String) objArr3[0]).intern());
                    } else {
                        obj2 = null;
                    }
                    if (!(obj2 instanceof String)) {
                        obj2 = null;
                    }
                    str = (String) obj2;
                }
            }
        }
        Class<Short[]> cls = Short[].class;
        Class<Byte[]> cls2 = Byte[].class;
        Class<Boolean[]> cls3 = Boolean[].class;
        Class<Character[]> cls4 = Character[].class;
        Intent intent2 = getIntent();
        if (intent2 == null || (extras3 = intent2.getExtras()) == null || !extras3.containsKey("accountId")) {
            str2 = null;
        } else if (zzbq.onNavigationEvent(intent2)) {
            Bundle extras7 = intent2.getExtras();
            if (extras7 != null) {
                String string4 = extras7.getString("accountId");
                if (string4 == null) {
                    int i5 = IAuthTabCallback_Parcel + 81;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    str2 = null;
                } else {
                    if (Intrinsics.areEqual(String.class, Integer.class)) {
                        array4 = StringsKt__StringNumberConversionsKt.toIntOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Long.class)) {
                        array4 = StringsKt__StringNumberConversionsKt.toLongOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Float.class)) {
                        array4 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Double.class)) {
                        array4 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Short.class)) {
                        array4 = StringsKt__StringNumberConversionsKt.toShortOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                        int i7 = IAuthTabCallback_Parcel + 111;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        array4 = StringsKt__StringNumberConversionsKt.toByteOrNull(string4);
                    } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                        array4 = Boolean.valueOf(Boolean.parseBoolean(string4));
                    } else if (Intrinsics.areEqual(String.class, Character.class)) {
                        array4 = Character.valueOf(string4.charAt(0));
                    } else {
                        array4 = string4;
                        if (!Intrinsics.areEqual(String.class, String.class)) {
                            if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                List listSplit$default10 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList19 = new ArrayList();
                                for (Object obj13 : listSplit$default10) {
                                    if (((String) obj13).length() > 0) {
                                        arrayList19.add(obj13);
                                    }
                                }
                                ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList19, 10));
                                Iterator it11 = arrayList19.iterator();
                                while (it11.hasNext()) {
                                    arrayList20.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it11.next()).toString())));
                                }
                                array4 = arrayList20.toArray(new Integer[0]);
                            } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                List listSplit$default11 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList21 = new ArrayList();
                                for (Object obj14 : listSplit$default11) {
                                    if (((String) obj14).length() > 0) {
                                        arrayList21.add(obj14);
                                    }
                                }
                                ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList21, 10));
                                Iterator it12 = arrayList21.iterator();
                                while (it12.hasNext()) {
                                    arrayList22.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it12.next()).toString())));
                                }
                                array4 = arrayList22.toArray(new Long[0]);
                            } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                List listSplit$default12 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList23 = new ArrayList();
                                for (Object obj15 : listSplit$default12) {
                                    if (((String) obj15).length() > 0) {
                                        arrayList23.add(obj15);
                                    }
                                }
                                ArrayList arrayList24 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList23, 10));
                                Iterator it13 = arrayList23.iterator();
                                while (it13.hasNext()) {
                                    arrayList24.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it13.next()).toString())));
                                }
                                array4 = arrayList24.toArray(new Float[0]);
                            } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                List listSplit$default13 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList25 = new ArrayList();
                                for (Object obj16 : listSplit$default13) {
                                    if (((String) obj16).length() > 0) {
                                        arrayList25.add(obj16);
                                    }
                                }
                                ArrayList arrayList26 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList25, 10));
                                Iterator it14 = arrayList25.iterator();
                                while (it14.hasNext()) {
                                    arrayList26.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it14.next()).toString())));
                                }
                                array4 = arrayList26.toArray(new Double[0]);
                            } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                List listSplit$default14 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList27 = new ArrayList();
                                for (Object obj17 : listSplit$default14) {
                                    if (((String) obj17).length() > 0) {
                                        arrayList27.add(obj17);
                                    }
                                }
                                cls = Short[].class;
                                ArrayList arrayList28 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList27, 10));
                                Iterator it15 = arrayList27.iterator();
                                while (it15.hasNext()) {
                                    arrayList28.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it15.next()).toString())));
                                }
                                array4 = arrayList28.toArray(new Short[0]);
                            } else {
                                cls = Short[].class;
                                if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                    List listSplit$default15 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList29 = new ArrayList();
                                    for (Object obj18 : listSplit$default15) {
                                        int i9 = IAuthTabCallback_Parcel + 55;
                                        asInterface = i9 % 128;
                                        int i10 = i9 % 2;
                                        if (((String) obj18).length() > 0) {
                                            arrayList29.add(obj18);
                                        }
                                    }
                                    cls2 = Byte[].class;
                                    ArrayList arrayList30 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList29, 10));
                                    Iterator it16 = arrayList29.iterator();
                                    while (it16.hasNext()) {
                                        arrayList30.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it16.next()).toString())));
                                    }
                                    array4 = arrayList30.toArray(new Byte[0]);
                                } else {
                                    cls2 = Byte[].class;
                                    if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                        List listSplit$default16 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                        ArrayList arrayList31 = new ArrayList();
                                        for (Object obj19 : listSplit$default16) {
                                            if (((String) obj19).length() > 0) {
                                                arrayList31.add(obj19);
                                            }
                                        }
                                        cls3 = Boolean[].class;
                                        ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList31, 10));
                                        Iterator it17 = arrayList31.iterator();
                                        while (it17.hasNext()) {
                                            arrayList32.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it17.next()).toString())));
                                        }
                                        array4 = arrayList32.toArray(new Boolean[0]);
                                    } else {
                                        cls3 = Boolean[].class;
                                        if (Intrinsics.areEqual(String.class, Character[].class)) {
                                            List listSplit$default17 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                            ArrayList arrayList33 = new ArrayList();
                                            for (Object obj20 : listSplit$default17) {
                                                if (((String) obj20).length() > 0) {
                                                    arrayList33.add(obj20);
                                                }
                                            }
                                            cls4 = Character[].class;
                                            ArrayList arrayList34 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList33, 10));
                                            Iterator it18 = arrayList33.iterator();
                                            while (it18.hasNext()) {
                                                arrayList34.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it18.next()).toString().charAt(0)));
                                            }
                                            array4 = arrayList34.toArray(new Character[0]);
                                        } else {
                                            cls4 = Character[].class;
                                            if (Intrinsics.areEqual(String.class, String[].class)) {
                                                List listSplit$default18 = StringsKt__StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null);
                                                ArrayList arrayList35 = new ArrayList();
                                                for (Object obj21 : listSplit$default18) {
                                                    if (((String) obj21).length() > 0) {
                                                        arrayList35.add(obj21);
                                                    }
                                                }
                                                array4 = arrayList35.toArray(new String[0]);
                                            } else {
                                                Object[] enumConstants2 = String.class.getEnumConstants();
                                                if (enumConstants2 != null) {
                                                    ArrayList arrayList36 = new ArrayList(enumConstants2.length);
                                                    for (Object obj22 : enumConstants2) {
                                                        Intrinsics.checkNotNull(obj22, "");
                                                        arrayList36.add((Enum) obj22);
                                                    }
                                                    Iterator it19 = arrayList36.iterator();
                                                    while (true) {
                                                        if (!it19.hasNext()) {
                                                            next3 = null;
                                                            break;
                                                        }
                                                        next3 = it19.next();
                                                        if (Intrinsics.areEqual(((Enum) next3).name(), string4)) {
                                                            break;
                                                        }
                                                    }
                                                    obj = (Enum) next3;
                                                } else {
                                                    obj = null;
                                                }
                                                if (obj != null) {
                                                    array4 = obj;
                                                } else {
                                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                                    }
                                                    array4 = null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    boolean z2 = array4 instanceof String;
                    Object obj23 = array4;
                    if (!z2) {
                        obj23 = null;
                    }
                    str2 = (String) obj23;
                }
            }
        } else {
            Bundle extras8 = intent2.getExtras();
            Object obj24 = extras8 != null ? extras8.get("accountId") : null;
            if (!(obj24 instanceof String)) {
                obj24 = null;
            }
            str2 = (String) obj24;
        }
        Intent intent3 = getIntent();
        if (intent3 == null || (extras2 = intent3.getExtras()) == null || !extras2.containsKey("bankCode")) {
            str3 = null;
        } else if (zzbq.onNavigationEvent(intent3)) {
            Bundle extras9 = intent3.getExtras();
            if (extras9 != null && (string2 = extras9.getString("bankCode")) != null) {
                if (Intrinsics.areEqual(String.class, Integer.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toIntOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toLongOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Float.class)) {
                    array3 = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Double.class)) {
                    array3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Short.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toShortOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                    array3 = StringsKt__StringNumberConversionsKt.toByteOrNull(string2);
                } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                    array3 = Boolean.valueOf(Boolean.parseBoolean(string2));
                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                    array3 = Character.valueOf(string2.charAt(0));
                } else {
                    array3 = string2;
                    if (!Intrinsics.areEqual(String.class, String.class)) {
                        if (Intrinsics.areEqual(String.class, Integer[].class)) {
                            List listSplit$default19 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList37 = new ArrayList();
                            for (Object obj25 : listSplit$default19) {
                                if (((String) obj25).length() > 0) {
                                    arrayList37.add(obj25);
                                }
                            }
                            ArrayList arrayList38 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList37, 10));
                            Iterator it20 = arrayList37.iterator();
                            while (it20.hasNext()) {
                                arrayList38.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it20.next()).toString())));
                            }
                            array3 = arrayList38.toArray(new Integer[0]);
                        } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                            List listSplit$default20 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList39 = new ArrayList();
                            for (Object obj26 : listSplit$default20) {
                                if (((String) obj26).length() > 0) {
                                    arrayList39.add(obj26);
                                }
                            }
                            ArrayList arrayList40 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList39, 10));
                            Iterator it21 = arrayList39.iterator();
                            while (it21.hasNext()) {
                                arrayList40.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it21.next()).toString())));
                            }
                            array3 = arrayList40.toArray(new Long[0]);
                        } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                            List listSplit$default21 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList41 = new ArrayList();
                            for (Object obj27 : listSplit$default21) {
                                if (((String) obj27).length() > 0) {
                                    arrayList41.add(obj27);
                                }
                            }
                            ArrayList arrayList42 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList41, 10));
                            Iterator it22 = arrayList41.iterator();
                            while (it22.hasNext()) {
                                arrayList42.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it22.next()).toString())));
                            }
                            array3 = arrayList42.toArray(new Float[0]);
                        } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                            List listSplit$default22 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                            ArrayList arrayList43 = new ArrayList();
                            for (Object obj28 : listSplit$default22) {
                                if (((String) obj28).length() > 0) {
                                    arrayList43.add(obj28);
                                }
                            }
                            ArrayList arrayList44 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList43, 10));
                            Iterator it23 = arrayList43.iterator();
                            while (it23.hasNext()) {
                                arrayList44.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it23.next()).toString())));
                            }
                            array3 = arrayList44.toArray(new Double[0]);
                        } else {
                            if (Intrinsics.areEqual(String.class, cls)) {
                                List listSplit$default23 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList45 = new ArrayList();
                                for (Object obj29 : listSplit$default23) {
                                    if (((String) obj29).length() > 0) {
                                        int i11 = asInterface + 45;
                                        IAuthTabCallback_Parcel = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            arrayList45.add(obj29);
                                            throw null;
                                        }
                                        arrayList45.add(obj29);
                                    }
                                }
                                ArrayList arrayList46 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList45, 10));
                                Iterator it24 = arrayList45.iterator();
                                while (it24.hasNext()) {
                                    arrayList46.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it24.next()).toString())));
                                }
                                array2 = arrayList46.toArray(new Short[0]);
                            } else if (Intrinsics.areEqual(String.class, cls2)) {
                                List listSplit$default24 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList47 = new ArrayList();
                                for (Object obj30 : listSplit$default24) {
                                    if (((String) obj30).length() > 0) {
                                        arrayList47.add(obj30);
                                    }
                                }
                                ArrayList arrayList48 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList47, 10));
                                Iterator it25 = arrayList47.iterator();
                                while (it25.hasNext()) {
                                    arrayList48.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it25.next()).toString())));
                                }
                                array2 = arrayList48.toArray(new Byte[0]);
                            } else if (Intrinsics.areEqual(String.class, cls3)) {
                                List listSplit$default25 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList49 = new ArrayList();
                                for (Object obj31 : listSplit$default25) {
                                    if (((String) obj31).length() > 0) {
                                        arrayList49.add(obj31);
                                    }
                                }
                                ArrayList arrayList50 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList49, 10));
                                Iterator it26 = arrayList49.iterator();
                                while (it26.hasNext()) {
                                    arrayList50.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it26.next()).toString())));
                                }
                                array2 = arrayList50.toArray(new Boolean[0]);
                            } else if (Intrinsics.areEqual(String.class, cls4)) {
                                List listSplit$default26 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList51 = new ArrayList();
                                for (Object obj32 : listSplit$default26) {
                                    if (((String) obj32).length() > 0) {
                                        int i12 = asInterface + 107;
                                        IAuthTabCallback_Parcel = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            arrayList51.add(obj32);
                                            throw null;
                                        }
                                        arrayList51.add(obj32);
                                    }
                                }
                                ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList51, 10));
                                Iterator it27 = arrayList51.iterator();
                                while (it27.hasNext()) {
                                    arrayList52.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it27.next()).toString().charAt(0)));
                                }
                                array2 = arrayList52.toArray(new Character[0]);
                            } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                List listSplit$default27 = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null);
                                ArrayList arrayList53 = new ArrayList();
                                for (Object obj33 : listSplit$default27) {
                                    if (((String) obj33).length() > 0) {
                                        arrayList53.add(obj33);
                                    }
                                }
                                array2 = arrayList53.toArray(new String[0]);
                            } else {
                                Object[] enumConstants3 = String.class.getEnumConstants();
                                if (enumConstants3 != null) {
                                    ArrayList arrayList54 = new ArrayList(enumConstants3.length);
                                    for (Object obj34 : enumConstants3) {
                                        Intrinsics.checkNotNull(obj34, "");
                                        arrayList54.add((Enum) obj34);
                                    }
                                    Iterator it28 = arrayList54.iterator();
                                    while (true) {
                                        if (!it28.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        int i13 = IAuthTabCallback_Parcel + 85;
                                        asInterface = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            Object obj35 = null;
                                            Intrinsics.areEqual(((Enum) it28.next()).name(), string2);
                                            obj35.hashCode();
                                            throw null;
                                        }
                                        next2 = it28.next();
                                        if (Intrinsics.areEqual(((Enum) next2).name(), string2)) {
                                            int i14 = asInterface + 29;
                                            IAuthTabCallback_Parcel = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                Object obj36 = null;
                                                obj36.hashCode();
                                                throw null;
                                            }
                                        }
                                    }
                                    array2 = (Enum) next2;
                                } else {
                                    array2 = null;
                                }
                                if (array2 == null) {
                                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                                        throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                    }
                                    array3 = null;
                                }
                            }
                            array3 = array2;
                        }
                    }
                }
                boolean z3 = array3 instanceof String;
                Object obj37 = array3;
                if (!z3) {
                    obj37 = null;
                }
                str3 = (String) obj37;
            }
        } else {
            Bundle extras10 = intent3.getExtras();
            Object obj38 = extras10 != null ? extras10.get("bankCode") : null;
            if (!(obj38 instanceof String)) {
                obj38 = null;
            }
            str3 = (String) obj38;
        }
        Intent intent4 = getIntent();
        if (intent4 == null || (extras = intent4.getExtras()) == null || !extras.containsKey("accountNumber")) {
            str4 = null;
        } else if (zzbq.onNavigationEvent(intent4)) {
            Bundle extras11 = intent4.getExtras();
            if (extras11 != null && (string = extras11.getString("accountNumber")) != null) {
                if (Intrinsics.areEqual(String.class, Integer.class)) {
                    array = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                } else if (Intrinsics.areEqual(String.class, Long.class)) {
                    array = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                } else if (Intrinsics.areEqual(String.class, Float.class)) {
                    array = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                } else if (Intrinsics.areEqual(String.class, Double.class)) {
                    array = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                } else if (Intrinsics.areEqual(String.class, Short.class)) {
                    array = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                    array = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                } else if (Intrinsics.areEqual(String.class, Boolean.class)) {
                    array = Boolean.valueOf(Boolean.parseBoolean(string));
                } else if (Intrinsics.areEqual(String.class, Character.class)) {
                    array = Character.valueOf(string.charAt(0));
                } else if (Intrinsics.areEqual(String.class, String.class)) {
                    array = string;
                } else {
                    int i15 = asInterface + 87;
                    IAuthTabCallback_Parcel = i15 % 128;
                    int i16 = i15 % 2;
                    if (Intrinsics.areEqual(String.class, Integer[].class)) {
                        List listSplit$default28 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList55 = new ArrayList();
                        for (Object obj39 : listSplit$default28) {
                            if (((String) obj39).length() > 0) {
                                arrayList55.add(obj39);
                            }
                        }
                        ArrayList arrayList56 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList55, 10));
                        Iterator it29 = arrayList55.iterator();
                        while (it29.hasNext()) {
                            arrayList56.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it29.next()).toString())));
                        }
                        array = arrayList56.toArray(new Integer[0]);
                    } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                        List listSplit$default29 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList57 = new ArrayList();
                        for (Object obj40 : listSplit$default29) {
                            if (((String) obj40).length() > 0) {
                                arrayList57.add(obj40);
                            }
                        }
                        ArrayList arrayList58 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList57, 10));
                        Iterator it30 = arrayList57.iterator();
                        while (it30.hasNext()) {
                            arrayList58.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it30.next()).toString())));
                        }
                        array = arrayList58.toArray(new Long[0]);
                    } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                        List listSplit$default30 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList59 = new ArrayList();
                        for (Object obj41 : listSplit$default30) {
                            if (((String) obj41).length() > 0) {
                                arrayList59.add(obj41);
                            }
                        }
                        ArrayList arrayList60 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList59, 10));
                        Iterator it31 = arrayList59.iterator();
                        while (it31.hasNext()) {
                            arrayList60.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it31.next()).toString())));
                        }
                        array = arrayList60.toArray(new Float[0]);
                    } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                        List listSplit$default31 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList61 = new ArrayList();
                        for (Object obj42 : listSplit$default31) {
                            if (((String) obj42).length() > 0) {
                                arrayList61.add(obj42);
                            }
                        }
                        ArrayList arrayList62 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList61, 10));
                        Iterator it32 = arrayList61.iterator();
                        while (it32.hasNext()) {
                            arrayList62.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it32.next()).toString())));
                        }
                        array = arrayList62.toArray(new Double[0]);
                    } else if (Intrinsics.areEqual(String.class, cls)) {
                        List listSplit$default32 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList63 = new ArrayList();
                        for (Object obj43 : listSplit$default32) {
                            if (((String) obj43).length() > 0) {
                                arrayList63.add(obj43);
                            }
                        }
                        ArrayList arrayList64 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList63, 10));
                        Iterator it33 = arrayList63.iterator();
                        while (it33.hasNext()) {
                            arrayList64.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it33.next()).toString())));
                        }
                        array = arrayList64.toArray(new Short[0]);
                    } else if (Intrinsics.areEqual(String.class, cls2)) {
                        List listSplit$default33 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList65 = new ArrayList();
                        for (Object obj44 : listSplit$default33) {
                            if (((String) obj44).length() > 0) {
                                arrayList65.add(obj44);
                            }
                        }
                        ArrayList arrayList66 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList65, 10));
                        Iterator it34 = arrayList65.iterator();
                        while (it34.hasNext()) {
                            arrayList66.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it34.next()).toString())));
                        }
                        array = arrayList66.toArray(new Byte[0]);
                    } else if (Intrinsics.areEqual(String.class, cls3)) {
                        List listSplit$default34 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList67 = new ArrayList();
                        for (Object obj45 : listSplit$default34) {
                            if (((String) obj45).length() > 0) {
                                arrayList67.add(obj45);
                            }
                        }
                        ArrayList arrayList68 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList67, 10));
                        Iterator it35 = arrayList67.iterator();
                        while (it35.hasNext()) {
                            arrayList68.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it35.next()).toString())));
                        }
                        array = arrayList68.toArray(new Boolean[0]);
                    } else if (Intrinsics.areEqual(String.class, cls4)) {
                        List listSplit$default35 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList69 = new ArrayList();
                        for (Object obj46 : listSplit$default35) {
                            if (((String) obj46).length() > 0) {
                                arrayList69.add(obj46);
                            }
                        }
                        ArrayList arrayList70 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList69, 10));
                        Iterator it36 = arrayList69.iterator();
                        while (it36.hasNext()) {
                            arrayList70.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it36.next()).toString().charAt(0)));
                        }
                        array = arrayList70.toArray(new Character[0]);
                    } else if (Intrinsics.areEqual(String.class, String[].class)) {
                        List listSplit$default36 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList71 = new ArrayList();
                        for (Object obj47 : listSplit$default36) {
                            if (((String) obj47).length() > 0) {
                                arrayList71.add(obj47);
                            }
                        }
                        array = arrayList71.toArray(new String[0]);
                    } else {
                        Object[] enumConstants4 = String.class.getEnumConstants();
                        if (enumConstants4 != null) {
                            ArrayList arrayList72 = new ArrayList(enumConstants4.length);
                            for (Object obj48 : enumConstants4) {
                                Intrinsics.checkNotNull(obj48, "");
                                arrayList72.add((Enum) obj48);
                            }
                            Iterator it37 = arrayList72.iterator();
                            while (true) {
                                if (!it37.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it37.next();
                                if (Intrinsics.areEqual(((Enum) next).name(), string)) {
                                    break;
                                }
                            }
                            array = (Enum) next;
                        } else {
                            array = null;
                        }
                        if (array == null) {
                            if (zzaj.onNavigationEvent().onActivityLayout()) {
                                throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                            }
                            array = null;
                        }
                    }
                }
                if (!(array instanceof String)) {
                    array = null;
                }
                str4 = (String) array;
            }
        } else {
            Bundle extras12 = intent4.getExtras();
            Object obj49 = extras12 != null ? extras12.get("accountNumber") : null;
            if (!(obj49 instanceof String)) {
                obj49 = null;
            }
            str4 = (String) obj49;
        }
        if (str == null || str2 == null) {
            if (str3 == null || str4 == null) {
                return null;
            }
            return PageShowPoint.Companion.IAuthTabCallback(str3, str4);
        }
        if (Intrinsics.areEqual(str, "toss")) {
            return DERConstructedSet.IAuthTabCallback(str2);
        }
        if (Intrinsics.areEqual(str, "bank")) {
            return PageShowPoint.Companion.onWarmupCompleted(str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_account_detail_setting___372c51d3cb), 0, 2, (Object) null);
        setResult(0);
        finish();
        int i4 = IAuthTabCallback_Parcel + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = IAuthTabCallbackDefault;
        Object obj = null;
        if (cArr2 != null) {
            int i6 = $10 + 65;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 35283), 34 - ImageFormat.getBitsPerPixel(0), 14287 - AndroidCharacter.getMirror('0'), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i8 = $11 + 105;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10935), KeyEvent.getDeadChar(0, 0) + 65, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 17657 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49467), ((Process.getThreadPriority(0) + 20) >> 6) + 70, 12486 - Color.green(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i12, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i13 = $11 + 71;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i15 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $10 + 95;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // viva.republica.toss.account.detail.setting.Hilt_AccountSettingActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = asInterface + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    @Override // viva.republica.toss.account.detail.setting.Hilt_AccountSettingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = asInterface + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.detail.setting.Hilt_AccountSettingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallback_Parcel + 101;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.detail.setting.Hilt_AccountSettingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = asInterface + 3;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = new char[]{27181, 27276, 27382, 27380, 27245, 27181, 27341, 27336, 27343, 27180, 27183, 27341, 27333, 27175, 27182, 27188, 27189, 27343, 27332, 27335, 27335, 27175, 27175, 27338, 27338, 27330, 27336, 27341, 27340, 27173, 27198, 27341, 27187, 27187, 27341, 27341, 27343, 27342, 27186, 27169, 27168, 27174, 27198, 27330, 27332, 27340, 27341, 27333, 27335, 27335, 27333, 27168, 27138};
    }
}
