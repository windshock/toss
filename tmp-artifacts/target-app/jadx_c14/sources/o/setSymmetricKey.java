package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.setSymmetricKey;
import o.signEX;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setSymmetricKey {
    private static char IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static long asInterface;
    private static final String onExtraCallback;
    public static final setSymmetricKey onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 97 - r8
            byte[] r0 = o.setSymmetricKey.$$a
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSymmetricKey.$$c(short, short, short):java.lang.String");
    }

    static {
        IAuthTabCallbackStub = 0;
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{'\t', 19, 13879, 13879, 17, 14, 7, 5, 0, '\n', 21, 6, 4, 11, 1, 4, 22, '\b', 22, 21, 11, 23, 13878}, (byte) (View.resolveSize(0, 0) + 78), 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        onExtraCallbackWithResult = new setSymmetricKey();
        int i = asBinder + 67;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnNavigationEvent = onNavigationEvent(tabBarInfoQueryPointOnTabBarInfoQueryListener);
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequenceOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1732377556, -1732377556, new Object[]{list}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i4;
        int i10 = i8 | i4;
        int i11 = (~((~i4) | i3)) | (~i10);
        int i12 = (~(i2 | i7 | i4)) | (~(i10 | i3));
        int i13 = i4 + i3 + i6 + (528639218 * i5) + ((-532493036) * i);
        int i14 = i13 * i13;
        int i15 = ((i4 * 873666089) - 1460666368) + (873666089 * i3) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i6) + (1819279360 * i5) + ((-1621098496) * i) + (586088448 * i14);
        int i16 = (i4 * (-1573143961)) + 2078511484 + (i3 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i6 * (-1573143025)) + (i5 * 123045422) + (i * (-1548035028)) + (i14 * 1845559296);
        int i17 = i15 + (i16 * i16 * 1848705024);
        return i17 != 1 ? i17 != 2 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        int i4 = onTransact + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(th);
        }
        onNavigationEvent(th);
        throw null;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(signEX signex) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(signex);
        int i4 = onTransact + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequenceIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = onTransact + 69;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private setSymmetricKey() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ writeRaw onExtraCallback(setSymmetricKey setsymmetrickey, String str, List list, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = onTransact + 17;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 74 / 0;
            }
            list = null;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallbackDefault + 67;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawOnWarmupCompleted = setsymmetrickey.onWarmupCompleted(str, list, z);
        int i7 = onTransact + 57;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return writerawOnWarmupCompleted;
    }

    public final writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> onWarmupCompleted(@Nullable String str, @Nullable List<String> list, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawOnWarmupCompleted = verifyHASH.onExtraCallback.onWarmupCompleted(str, list, z);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return writerawOnWarmupCompleted;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 101;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final CharSequence IAuthTabCallback(signEX signex) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(signex, "");
        String strOnExtraCallbackWithResult = signex.onExtraCallbackWithResult();
        Long lIAuthTabCallback = signex.IAuthTabCallback();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b(1 - KeyEvent.normalizeMetaState(0), (char) (Color.green(0) + 55509), TextUtils.indexOf("", "", 0, 0) + 19, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        Object[] objArr2 = new Object[1];
        a(new char[]{13846}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 95), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(lIAuthTabCallback);
        Object[] objArr3 = new Object[1];
        a(new char[]{13867}, (byte) (100 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1 - (Process.myPid() >> 22), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<List<? extends signEX>> apply(writeRaw<BaseApiResponse<List<? extends signEX>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass4 anonymousClass4 = new Function1<BaseApiResponse<List<? extends signEX>>, deserializeIp<? extends List<? extends signEX>>>() { // from class: o.setSymmetricKey.IAuthTabCallback.4
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends signEX>> invoke(BaseApiResponse<List<? extends signEX>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass4) { // from class: o.UtilsKtExternalSyntheticLambda17$startIntentSenderForResult
                private final /* synthetic */ Function1 onExtraCallback;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass4, "");
                    this.onExtraCallback = anonymousClass4;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onExtraCallback.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    private static final CharSequence onNavigationEvent(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tabBarInfoQueryPointOnTabBarInfoQueryListener, "");
        String strOnExtraCallbackWithResult = tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult();
        Long lOnTransact = tabBarInfoQueryPointOnTabBarInfoQueryListener.onTransact();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b(1 - ExpandableListView.getPackedPositionType(0L), (char) (55509 - Color.alpha(0)), Gravity.getAbsoluteGravity(0, 0) + 19, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        Object[] objArr2 = new Object[1];
        a(new char[]{13846}, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 95), TextUtils.indexOf("", "") + 1, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(lOnTransact);
        Object[] objArr3 = new Object[1];
        a(new char[]{13867}, (byte) (100 - TextUtils.getTrimmedLength("")), TextUtils.getCapsMode("", 0, 0) + 1, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        List list = (List) objArr[0];
        int i = 2 % 2;
        long jIAuthTabCallbackDefault = zzaj.onWarmupCompleted().IAuthTabCallbackDefault();
        Intrinsics.checkNotNull(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                PageShowPoint.IAuthTabCallback(PageShowPoint.Companion, arrayList, false, 2, (Object) null);
                if (DERSet.onExtraCallback.removeOnPictureInPictureModeChangedListener()) {
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    String strJoinToString$default = CollectionsKt.joinToString$default(list2, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.dataprovider.tossfamily.TossFamilyAccountHelper$$ExternalSyntheticLambda4
                        public final Object invoke(Object obj2) {
                            return setSymmetricKey.onWarmupCompleted((signEX) obj2);
                        }
                    }, 30, (Object) null);
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    b(20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9707), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
                    sb.append(((String) objArr2[0]).intern());
                    sb.append(strJoinToString$default);
                    Object[] objArr3 = new Object[1];
                    a(new char[]{'\t', 19, 13879, 13879, 17, 14, 7, 5, 0, '\n', 21, 6, 4, 11, 1, 4, 22, '\b', 22, 21, 11, 23, 13878}, (byte) (78 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 23, objArr3);
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr3[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    int i2 = IAuthTabCallbackDefault + 59;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 4 % 2;
                    }
                    while (it2.hasNext()) {
                        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted = PageShowPoint.Companion.onWarmupCompleted(((signEX) it2.next()).onExtraCallbackWithResult());
                        if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted != null) {
                            arrayList2.add(tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted);
                        }
                    }
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    String strJoinToString$default2 = CollectionsKt.joinToString$default(arrayList2, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.dataprovider.tossfamily.TossFamilyAccountHelper$$ExternalSyntheticLambda5
                        public final Object invoke(Object obj2) {
                            return setSymmetricKey.IAuthTabCallback((TabBarInfoQueryPointOnTabBarInfoQueryListener) obj2);
                        }
                    }, 30, (Object) null);
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    a(new char[]{16, 20, '\n', 22, 5, 11, 11, 2, 4, 11, 1, 4, 24, 20, 5, '\r'}, (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 16 - Color.blue(0), objArr4);
                    sb2.append(((String) objArr4[0]).intern());
                    sb2.append(strJoinToString$default2);
                    Object[] objArr5 = new Object[1];
                    a(new char[]{'\t', 19, 13879, 13879, 17, 14, 7, 5, 0, '\n', 21, 6, 4, 11, 1, 4, 22, '\b', 22, 21, 11, 23, 13878}, (byte) (78 - View.MeasureSpec.getMode(0)), 23 - ExpandableListView.getPackedPositionType(0L), objArr5);
                    ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, ((String) objArr5[0]).intern(), sb2.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
                }
                Unit unit = Unit.INSTANCE;
                int i4 = onTransact + 59;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 70 / 0;
                }
                return unit;
            }
            int i6 = IAuthTabCallbackDefault + 75;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            signEX signex = (signEX) it.next();
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2 = PageShowPoint.Companion.onWarmupCompleted(signex.onExtraCallbackWithResult());
            if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2 != null) {
                int i8 = IAuthTabCallbackDefault + 27;
                onTransact = i8 % 128;
                if (i8 % 2 == 0) {
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2.IAuthTabCallback(signex.IAuthTabCallback());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2.onWarmupCompleted(signex.onNavigationEvent());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2.onWarmupCompleted(jIAuthTabCallbackDefault);
                    int i9 = 53 / 0;
                } else {
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2.IAuthTabCallback(signex.IAuthTabCallback());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2.onWarmupCompleted(signex.onNavigationEvent());
                    tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2.onWarmupCompleted(jIAuthTabCallbackDefault);
                }
            } else {
                tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2 = null;
            }
            if (tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2 != null) {
                int i10 = IAuthTabCallbackDefault + 73;
                onTransact = i10 % 128;
                if (i10 % 2 == 0) {
                    arrayList.add(tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(tabBarInfoQueryPointOnTabBarInfoQueryListenerOnWarmupCompleted2);
            }
        }
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onTransact + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(!(th instanceof TossApiCallException.ApiError))) {
                String strAsBinder = ((TossApiCallException.ApiError) th).asBinder();
                Object[] objArr = new Object[1];
                b(AndroidCharacter.getMirror('0') - '!', (char) (50073 - TextUtils.getTrimmedLength("")), 20 - TextUtils.getOffsetBefore("", 0), objArr);
                if (Intrinsics.areEqual(strAsBinder, ((String) objArr[0]).intern())) {
                    IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(onExtraCallback(onExtraCallbackWithResult, null, null, false, 3, null), (String) null, 1, (Object) null);
                    int i3 = IAuthTabCallbackDefault + 125;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(new char[]{'\t', 19, 13879, 13879, 17, 14, 7, 5, 0, '\n', 21, 6, 4, 11, 1, 4, 22, '\b', 22, 21, 11, 23, 13878}, (byte) (78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 22 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
            convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr2[0]).intern(), th);
            return Unit.INSTANCE;
        }
        boolean z = th instanceof TossApiCallException.ApiError;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.writeRaw<java.util.List<o.signEX>> onNavigationEvent(@org.jetbrains.annotations.NotNull java.util.List<? extends o.TabBarInfoQueryPointOnTabBarInfoQueryListener> r22) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSymmetricKey.onNavigationEvent(java.util.List):o.writeRaw");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r28, char r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSymmetricKey.b(int, char, int, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onNavigationEvent;
        long j = 0;
        char c = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 117;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0) + 1), 25 - TextUtils.indexOf("", c, 0, 0), ExpandableListView.getPackedPositionType(j) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 23140 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $10 + 105;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - TextUtils.lastIndexOf("", '0', 0)), 73 - ExpandableListView.getPackedPositionChild(0L), 8087 - TextUtils.lastIndexOf("", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 31, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19487, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $10 + 89;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $10 + 99;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 19604);
                i16 += 17;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -9831259, 9831261, new Object[]{function1, obj}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2104190919, 2104190920, new Object[]{function1, obj}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
    }

    private static final Unit onExtraCallback(List list) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1732377556, -1732377556, new Object[]{list}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{64966, 64976, 64926, 64989, 64999, 64970, 64990, 65019, 64905, 64986, 64915, 64987, 64978, 64963, 64988, 64961, 65010, 64984, 65006, 65013, 64991, 64982, 64985, 64967, 64960};
        IAuthTabCallback = (char) 51244;
        onWarmupCompleted = new char[]{51274, 12356, 14457, 8195, 10291, 4139, 6365, 242, 2256, 28856, 30881, 24904, 27003, 20744, 22792, 16699, 18907, 45483, 47578, 13658, 11788, 54839, 56860, 50793, 52828, 63070, 65199, 59052, 61162, 38616, 40689, 34609, 36628, 46950, 49015, 60853, 5550, 7557, 1520, 3525, 13767, 15670, 9480, 11580, 21840, 23875, 17591, 19596, 29928};
        asInterface = 1426879072267736525L;
    }
}
