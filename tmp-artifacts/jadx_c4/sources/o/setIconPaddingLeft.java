package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.setIconPaddingLeft;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class setIconPaddingLeft<T> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final Context onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ setIconPaddingLeft<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(setIconPaddingLeft<T> seticonpaddingleft, access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
            this.this$0 = seticonpaddingleft;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = this.this$0.IAuthTabCallback((access13800) this);
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    static {
        int i = onExtraCallback + 117;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ List IAuthTabCallback(setIconPaddingLeft seticonpaddingleft) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = onNavigationEvent(seticonpaddingleft);
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return listOnNavigationEvent;
    }

    public abstract setIconImageResource onExtraCallback();

    public abstract T onWarmupCompleted(@NotNull setIconPaddingLeft<T>.onNavigationEvent onnavigationevent);

    public setIconPaddingLeft(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = context;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public final class onNavigationEvent {
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private final String IAuthTabCallback;
        final /* synthetic */ setIconPaddingLeft<T> onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final String onWarmupCompleted;

        public onNavigationEvent(@NotNull setIconPaddingLeft seticonpaddingleft, @NotNull String str, String str2, @NotNull boolean z, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.onExtraCallback = seticonpaddingleft;
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = str2;
            this.onNavigationEvent = z;
            this.IAuthTabCallback = str3;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 7;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i3 + 19;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 55;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i3 + 47;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 117;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            boolean z = this.onNavigationEvent;
            int i4 = i2 + 73;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 39;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 1;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r4.onNavigationEvent, "android.permission.READ_CONTACTS") == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r4.onNavigationEvent, "android.permission.READ_CONTACTS") == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = o.setIconPaddingLeft.IAuthTabCallback;
        r2 = r1 + 3;
        o.setIconPaddingLeft.onExtraCallbackWithResult = r2 % 128;
        r2 = r2 % 2;
        r1 = r1 + 73;
        o.setIconPaddingLeft.onExtraCallbackWithResult = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<setIconPaddingLeft<T>.onNavigationEvent> onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        if (!onExtraCallbackWithResult()) {
            return CollectionsKt.emptyList();
        }
        Cursor cursorIAuthTabCallback = IAuthTabCallback();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        if (cursorIAuthTabCallback != null) {
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            if (cursorIAuthTabCallback.moveToFirst()) {
                int columnIndexOrThrow = cursorIAuthTabCallback.getColumnIndexOrThrow("display_name");
                int columnIndexOrThrow2 = cursorIAuthTabCallback.getColumnIndexOrThrow("data1");
                int columnIndexOrThrow3 = cursorIAuthTabCallback.getColumnIndexOrThrow("starred");
                int columnIndexOrThrow4 = cursorIAuthTabCallback.getColumnIndexOrThrow("photo_uri");
                do {
                    String string = cursorIAuthTabCallback.getString(columnIndexOrThrow);
                    String str = string == null ? "" : string;
                    String string2 = cursorIAuthTabCallback.getString(columnIndexOrThrow2);
                    if (string2 != null) {
                        int i2 = onExtraCallbackWithResult + 63;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        String strOnExtraCallbackWithResult = setIconPadding.onExtraCallbackWithResult(string2, onExtraCallback());
                        String str2 = strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult;
                        boolean z = cursorIAuthTabCallback.getInt(columnIndexOrThrow3) == 1;
                        String string3 = cursorIAuthTabCallback.getString(columnIndexOrThrow4);
                        String str3 = string3 == null ? "" : string3;
                        if (!(!setIconPadding.onExtraCallback(str2, onExtraCallback()))) {
                            int i4 = onExtraCallbackWithResult + 55;
                            IAuthTabCallback = i4 % 128;
                            if (i4 % 2 != 0) {
                                StringsKt.isBlank(str);
                                obj.hashCode();
                                throw null;
                            }
                            if (!StringsKt.isBlank(str)) {
                                arrayList.add(new onNavigationEvent(this, str, str2, z, str3));
                            }
                        }
                    }
                } while (cursorIAuthTabCallback.moveToNext());
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                int i5 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    hashSet.add(((onNavigationEvent) it.next()).IAuthTabCallback());
                    obj.hashCode();
                    throw null;
                }
                T next = it.next();
                if (hashSet.add(((onNavigationEvent) next).IAuthTabCallback())) {
                    int i6 = onExtraCallbackWithResult + 83;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList2.add(next);
                }
            }
            objectRef.element = arrayList2;
        }
        return (List) objectRef.element;
    }

    public JsonReaderUnknownNumberParsing<List<T>> onWarmupCompleted() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing<List<T>> jsonReaderUnknownNumberParsingOnNavigationEvent = JsonReaderUnknownNumberParsing.onNavigationEvent(new Callable() { // from class: im.toss.core.contact.AbsContactLoader$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                List listIAuthTabCallback = setIconPaddingLeft.IAuthTabCallback(this.f$0);
                int i5 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return listIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return jsonReaderUnknownNumberParsingOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super List<? extends T>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(this, access13800Var);
            }
        }
        Object objOnExtraCallbackWithResult = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 != 0) {
            int i6 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            JsonReaderUnknownNumberParsing<List<T>> jsonReaderUnknownNumberParsingOnWarmupCompleted = onWarmupCompleted();
            iAuthTabCallback.label = 1;
            objOnExtraCallbackWithResult = setIndicatorY.onExtraCallbackWithResult(jsonReaderUnknownNumberParsingOnWarmupCompleted, iAuthTabCallback);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
        return objOnExtraCallbackWithResult;
    }

    private final Cursor IAuthTabCallback() {
        Cursor cursorQuery;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            String[] strArr = new String[3];
            strArr[1] = "display_name";
            strArr[1] = "data1";
            strArr[2] = "starred";
            strArr[2] = "photo_uri";
            cursorQuery = this.onNavigationEvent.getContentResolver().query(uri, strArr, "data1 != ''", null, "display_name ASC");
        } else {
            cursorQuery = this.onNavigationEvent.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data1", "starred", "photo_uri"}, "data1 != ''", null, "display_name ASC");
        }
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return cursorQuery;
    }

    private static final List onNavigationEvent(setIconPaddingLeft seticonpaddingleft) throws Throwable {
        int i = 2 % 2;
        List<setIconPaddingLeft<T>.onNavigationEvent> listOnNavigationEvent = seticonpaddingleft.onNavigationEvent();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnNavigationEvent, 10));
        Iterator<T> it = listOnNavigationEvent.iterator();
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 % 2;
        }
        while (it.hasNext()) {
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                arrayList.add(seticonpaddingleft.onWarmupCompleted((onNavigationEvent) it.next()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            arrayList.add(seticonpaddingleft.onWarmupCompleted((onNavigationEvent) it.next()));
        }
        return arrayList;
    }
}
