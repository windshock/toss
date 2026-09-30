package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import im.toss.core.contact.PagedContactLoader$;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setIconPaddingBottom {
    public static final onNavigationEvent Companion;
    private static final String[] IAuthTabCallback = {"display_name", "data1"};
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private final setIconImageResource onExtraCallback;
    private final ContentResolver onExtraCallbackWithResult;
    private final drawImageIconPadding<onExtraCallback> onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(setIconPaddingBottom seticonpaddingbottom, Pair pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(seticonpaddingbottom, pair);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(seticonpaddingbottom, pair);
        int i3 = IAuthTabCallbackStub + 59;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setIconPaddingBottom seticonpaddingbottom = (setIconPaddingBottom) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(seticonpaddingbottom, iIntValue, iIntValue2);
        }
        onExtraCallbackWithResult(seticonpaddingbottom, iIntValue, iIntValue2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setIconPaddingBottom seticonpaddingbottom, List list) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(seticonpaddingbottom, list);
        int i4 = onTransact + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, -700423682, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback3, 700423684);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback5 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback6 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(iOnExtraCallback5, iOnExtraCallback4, -700423682, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback6, 700423684);
        int i3 = IAuthTabCallbackStub + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Integer onNavigationEvent(setIconPaddingBottom seticonpaddingbottom) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnWarmupCompleted = onWarmupCompleted(seticonpaddingbottom);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return numOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i7 | i6;
        int i9 = ~(i8 | i2);
        int i10 = (~i2) | (~((~i6) | i3));
        int i11 = (~(i2 | i6)) | (~(i7 | i2)) | (~i8);
        int i12 = i3 + i6 + i + ((-953487067) * i5) + ((-1992133889) * i4);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i3) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i) + ((-1703411712) * i5) + (1961361408 * i4) + (907935744 * i13);
        int i15 = ((i3 * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i * 272662391) + (i5 * 2077717299) + (i4 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr2 = {function1, obj};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, 942215576, iOnExtraCallback4, objArr2, iOnExtraCallback3, -942215573);
            throw null;
        }
        onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, 942215576, iOnExtraCallback4, objArr2, iOnExtraCallback3, -942215573);
        int i4 = onTransact + 1;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(th);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = IAuthTabCallbackStub + 99;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = IAuthTabCallbackStub + 89;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = onTransact + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public setIconPaddingBottom(@NotNull Context context, @NotNull setIconImageResource seticonimageresource) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(seticonimageresource, "");
        this.onExtraCallback = seticonimageresource;
        this.onWarmupCompleted = new drawImageIconPadding<>();
        this.onExtraCallbackWithResult = context.getContentResolver();
    }

    public static final /* synthetic */ int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent;
        if (i3 != 0) {
            int i5 = 98 / 0;
        }
        return i4;
    }

    public final drawImageIconPadding<onExtraCallback> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 13;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        drawImageIconPadding<onExtraCallback> drawimageiconpadding = this.onWarmupCompleted;
        int i5 = i2 + 27;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return drawimageiconpadding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 5;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(setIconPaddingBottom seticonpaddingbottom, Pair pair) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            drawImageIconPadding<onExtraCallback> drawimageiconpadding = seticonpaddingbottom.onWarmupCompleted;
            Object first = pair.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "");
            drawimageiconpadding.onExtraCallback((List<? extends onExtraCallback>) first);
            return Unit.INSTANCE;
        }
        drawImageIconPadding<onExtraCallback> drawimageiconpadding2 = seticonpaddingbottom.onWarmupCompleted;
        Object first2 = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first2, "");
        drawimageiconpadding2.onExtraCallback((List<? extends onExtraCallback>) first2);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PagedContactLoader", th);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 79;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 117;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if (onNavigationEvent != 0) {
            onExtraCallbackWithResult(i, i2).onNavigationEvent(clearTid.onExtraCallback()).onNavigationEvent(new PagedContactLoader$.ExternalSyntheticLambda6(new PagedContactLoader$.ExternalSyntheticLambda5(this)), new PagedContactLoader$.ExternalSyntheticLambda8(new PagedContactLoader$.ExternalSyntheticLambda7()));
            return;
        }
        setTagBytes.onNavigationEvent.IAuthTabCallback(onExtraCallbackWithResult(i, i2), onNavigationEvent()).onNavigationEvent(clearTid.onExtraCallback()).onNavigationEvent(new PagedContactLoader$.ExternalSyntheticLambda2(new PagedContactLoader$.ExternalSyntheticLambda1(this)), new PagedContactLoader$.ExternalSyntheticLambda4(new PagedContactLoader$.ExternalSyntheticLambda3()));
        int i6 = onTransact + 77;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 43;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(setIconPaddingBottom seticonpaddingbottom, List list) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        drawImageIconPadding<onExtraCallback> drawimageiconpadding = seticonpaddingbottom.onWarmupCompleted;
        Intrinsics.checkNotNull(list);
        drawimageiconpadding.onExtraCallback((List<? extends onExtraCallback>) list);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 43;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PagedContactLoader", th);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final writeRaw<List<onExtraCallback>> onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        List<onExtraCallback> listOnExtraCallback = this.onWarmupCompleted.onExtraCallback();
        int i4 = i + i2;
        if (i4 <= listOnExtraCallback.size()) {
            int i5 = onTransact + 87;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            writeRaw<List<onExtraCallback>> writerawOnExtraCallback = writeRaw.onExtraCallback(listOnExtraCallback.subList(i, i4));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
            return writerawOnExtraCallback;
        }
        writeRaw<List<onExtraCallback>> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new PagedContactLoader$.ExternalSyntheticLambda9(this, i2, i));
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        int i7 = IAuthTabCallbackStub + 35;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return writerawOnNavigationEvent;
    }

    private static final List onExtraCallbackWithResult(setIconPaddingBottom seticonpaddingbottom, int i, int i2) {
        int i3 = 2 % 2;
        Cursor cursorQuery = seticonpaddingbottom.onExtraCallbackWithResult.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, IAuthTabCallback, null, null, "display_name ASC LIMIT " + i + " OFFSET " + i2);
        if (cursorQuery == null) {
            return CollectionsKt.emptyList();
        }
        Cursor cursor = cursorQuery;
        try {
            ArrayList arrayList = new ArrayList();
            cursorQuery.moveToFirst();
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("display_name");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data1");
            int i4 = IAuthTabCallbackStub + 125;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            while (!cursorQuery.isAfterLast()) {
                String string = cursorQuery.getString(columnIndexOrThrow);
                String str = "";
                if (string == null) {
                    int i6 = IAuthTabCallbackStub + 79;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 20 / 0;
                    }
                    string = "";
                }
                String strOnExtraCallbackWithResult = setIconPadding.onExtraCallbackWithResult(cursorQuery.getString(columnIndexOrThrow2), seticonpaddingbottom.onExtraCallback);
                if (strOnExtraCallbackWithResult != null) {
                    int i8 = onTransact + 31;
                    IAuthTabCallbackStub = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 49 / 0;
                    }
                    str = strOnExtraCallbackWithResult;
                }
                arrayList.add(new onExtraCallback(string, str));
                cursorQuery.moveToNext();
            }
            CloseableKt.closeFinally(cursor, (Throwable) null);
            int i10 = onTransact + 5;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 == 0) {
                return arrayList;
            }
            throw null;
        } finally {
        }
    }

    private static final Integer onWarmupCompleted(setIconPaddingBottom seticonpaddingbottom) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Cursor cursorQuery = seticonpaddingbottom.onExtraCallbackWithResult.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            onNavigationEvent = cursor != null ? cursor.getCount() : 0;
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursorQuery, (Throwable) null);
            Integer numValueOf = Integer.valueOf(onNavigationEvent);
            int i4 = IAuthTabCallbackStub + 109;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        } finally {
        }
    }

    private final writeRaw<Integer> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent;
        if (i4 == 0) {
            writeRaw<Integer> writerawOnNavigationEvent = writeRaw.onNavigationEvent(new PagedContactLoader$.ExternalSyntheticLambda0(this));
            Intrinsics.checkNotNull(writerawOnNavigationEvent);
            int i5 = onTransact + 17;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return writerawOnNavigationEvent;
            }
            throw null;
        }
        writeRaw<Integer> writerawOnExtraCallback = writeRaw.onExtraCallback(Integer.valueOf(i4));
        Intrinsics.checkNotNull(writerawOnExtraCallback);
        return writerawOnExtraCallback;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String IAuthTabCallback;
        private final String onExtraCallbackWithResult;

        public onExtraCallback(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult = str;
            this.IAuthTabCallback = str2;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = setIconPaddingBottom.IAuthTabCallback();
            int i4 = IAuthTabCallback + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = asInterface + 125;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, 1038672148, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback3, -1038672144);
    }

    public static /* synthetic */ List onWarmupCompleted(setIconPaddingBottom seticonpaddingbottom, int i, int i2) {
        Object[] objArr = {seticonpaddingbottom, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (List) onNavigationEvent(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -1305449041, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1305449041);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, -1821087662, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback3, 1821087663);
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, 942215576, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback3, -942215573);
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(iOnExtraCallback2, iOnExtraCallback, -700423682, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback3, 700423684);
    }
}
